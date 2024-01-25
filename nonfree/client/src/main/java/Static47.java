import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	public static int anInt1072;

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!ci", name = "G", descriptor = "Lclient!tf;")
	public static Class240 aClass240_1 = null;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII[BI)V")
	public static void method1023(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg0) {
			return;
		}
		arg3 += arg0;
		@Pc(28) int local28 = arg1 - arg0 >> 2;
		while (true) {
			local28--;
			if (local28 < 0) {
				local28 = arg1 - arg0 & 0x3;
				while (true) {
					local28--;
					if (local28 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(33) int local33 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg2[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg2[local38] = 1;
			arg3 = local43 + 1;
			arg2[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)V")
	public static void method1040() {
		@Pc(8) Class83 local8 = Static199.aClass83_5;
		synchronized (Static199.aClass83_5) {
			Static199.aClass83_5.method2346();
		}
		local8 = Static164.aClass83_24;
		synchronized (Static164.aClass83_24) {
			Static164.aClass83_24.method2346();
		}
	}

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)V")
	public static void method1043() {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(15, 0);
		local8.method517();
	}
}
