import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!gda;")
	public static Class126 aClass126_107;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray11;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IC)Z")
	public static boolean method3381(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(40) char[] local40 = Static85.aCharArray15;
			for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
				@Pc(48) char local48 = local40[local42];
				if (arg0 == local48) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)I")
	public static int method3382(@OriginalArg(0) boolean arg0) {
		if (Static54.anIntArray64 == null) {
			return 0;
		} else if (arg0 || Static645.aClass194Array1 == null) {
			@Pc(24) int local24 = 0;
			for (@Pc(41) int local41 = 0; local41 < Static54.anIntArray64.length; local41++) {
				@Pc(49) int local49 = Static54.anIntArray64[local41];
				if (Static471.aClass126_219.method3077(local49)) {
					local24++;
				}
				if (Static153.aClass126_88.method3077(local49)) {
					local24++;
				}
			}
			return local24;
		} else {
			return Static54.anIntArray64.length * 2;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIIZ)V")
	public static void method3383(@OriginalArg(3) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static417.anInt7038 = 22050;
		Static207.anInt3690 = 2;
		Static404.aBoolean460 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII[BI[BI)V")
	public static void method3385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg7++;
				arg4[local26] += arg6[arg1++];
				@Pc(38) int local38 = arg7++;
				arg4[local38] += arg6[arg1++];
				@Pc(50) int local50 = arg7++;
				arg4[local50] += arg6[arg1++];
				@Pc(62) int local62 = arg7++;
				arg4[local62] += arg6[arg1++];
			}
			for (@Pc(79) int local79 = local15; local79 < 0; local79++) {
				local26 = arg7++;
				arg4[local26] += arg6[arg1++];
			}
			arg7 += arg2;
			arg1 += arg5;
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public static void method3386() {
		Static274.anInt4921 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static74.aClass5_Sub36Array1[local14] = null;
			Static298.aByteArray56[local14] = 1;
			Static465.aClass268Array1[local14] = null;
		}
	}
}
