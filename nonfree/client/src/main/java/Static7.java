import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!s;")
	public static final Class86 aClass86_4 = new Class86(64);

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_40 = Static181.method2795("wave:");

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!qe;")
	public static Class83 aClass83_38 = aClass83_40;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_39 = aClass83_40;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_41 = Static181.method2795("Lade)3)3)3");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([SII[Lclient!qe;I)V")
	public static void method107(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class83[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(26) int local26 = (arg1 + arg3) / 2;
		@Pc(30) Class83 local30 = arg2[local26];
		@Pc(32) int local32 = arg3;
		arg2[local26] = arg2[arg1];
		arg2[arg1] = local30;
		@Pc(46) short local46 = arg0[local26];
		arg0[local26] = arg0[arg1];
		arg0[arg1] = local46;
		for (@Pc(58) int local58 = arg3; local58 < arg1; local58++) {
			if (local30 == null || arg2[local58] != null && arg2[local58].method2392(local30) < (local58 & 0x1)) {
				@Pc(84) Class83 local84 = arg2[local58];
				arg2[local58] = arg2[local32];
				arg2[local32] = local84;
				@Pc(98) short local98 = arg0[local58];
				arg0[local58] = arg0[local32];
				arg0[local32++] = local98;
			}
		}
		arg2[arg1] = arg2[local32];
		arg2[local32] = local30;
		arg0[arg1] = arg0[local32];
		arg0[local32] = local46;
		method107(arg0, local32 - 1, arg2, arg3);
		method107(arg0, arg1, arg2, local32 + 1);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)I")
	public static int method109(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qe;I)Z")
	public static boolean method110(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static85.anInt1875; local11++) {
			if (arg0.method2398(Static57.aClass83Array28[local11])) {
				return true;
			}
		}
		return false;
	}
}
