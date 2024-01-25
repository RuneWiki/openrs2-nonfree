import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	public static int anInt8273;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "[I")
	public static final int[] anIntArray604 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method6716(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(42) int local42 = 2;
		@Pc(46) int local46 = arg0 / 10;
		while (local46 != 0) {
			local46 /= 10;
			local42++;
		}
		@Pc(61) char[] local61 = new char[local42];
		local61[0] = '+';
		for (@Pc(69) int local69 = local42 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg0;
			arg0 /= 10;
			@Pc(84) int local84 = local73 - arg0 * 10;
			if (local84 < 10) {
				local61[local69] = (char) (local84 + 48);
			} else {
				local61[local69] = (char) (local84 + 87);
			}
		}
		return new String(local61);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!oa;Lclient!nt;IIIII)V")
	public static void method6717(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static107.anInt2060) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static401.anInt7022) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static555.anInt9182 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class276 local62 = Static270.aClass276ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static133.aClass59Array3[local17].JA(local23, local32) + Static133.aClass59Array3[local17].JA(local23 + 1, local32) + Static133.aClass59Array3[local17].JA(local23, local32 + 1) + Static133.aClass59Array3[local17].JA(local23 + 1, local32 + 1)) / 4 - (Static133.aClass59Array3[arg2].JA(arg3, arg4) + Static133.aClass59Array3[arg2].JA(arg3 + 1, arg4) + Static133.aClass59Array3[arg2].JA(arg3, arg4 + 1) + Static133.aClass59Array3[arg2].JA(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class4_Sub5 local143 = local62.aClass4_Sub5_2;
									@Pc(146) Class4_Sub5 local146 = local62.aClass4_Sub5_3;
									if (local143 != null && local143.method7785()) {
										arg1.method7787(local1, arg0, local143, local140, (local32 - arg4) * Static112.anInt2178 + (1 - arg6) * Static108.anInt2068, (local23 - arg3) * Static112.anInt2178 + (1 - arg5) * Static108.anInt2068);
									}
									if (local146 != null && local146.method7785()) {
										arg1.method7787(local1, arg0, local146, local140, (local32 - arg4) * Static112.anInt2178 + (1 - arg6) * Static108.anInt2068, (local23 - arg3) * Static112.anInt2178 + (1 - arg5) * Static108.anInt2068);
									}
									for (@Pc(219) Class267 local219 = local62.aClass267_3; local219 != null; local219 = local219.aClass267_2) {
										@Pc(223) Class4_Sub1 local223 = local219.aClass4_Sub1_2;
										if (local223 != null && local223.method7785() && (local23 == local223.aShort126 || local23 == local3) && (local32 == local223.aShort125 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort123 + 1 - local223.aShort126;
											@Pc(260) int local260 = local223.aShort124 + 1 - local223.aShort125;
											arg1.method7787(local1, arg0, local223, local140, (local223.aShort125 - arg4) * Static112.anInt2178 + (local260 - arg6) * Static108.anInt2068, (local223.aShort126 - arg3) * Static112.anInt2178 + (local252 - arg5) * Static108.anInt2068);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B[B)V")
	public static void method6719(@OriginalArg(1) byte[] arg0) {
		@Pc(17) Class6_Sub21 local17 = new Class6_Sub21(arg0);
		while (true) {
			@Pc(21) int local21 = local17.method6069();
			if (local21 == 0) {
				return;
			}
			if (local21 == 2) {
				Static36.anInt956 = local17.method6003();
			}
		}
	}
}
