import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "[Lclient!gba;")
	public static Class115[] aClass115Array2;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "[I")
	public static final int[] anIntArray486 = new int[8];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!oa;ILclient!ee;BILclient!ub;)Z")
	public static boolean method5033(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(5) Class4_Sub48 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray252 != null) {
			local7 = (Static392.anInt8800 - Static392.anInt8802) * ((arg1.anInt2717 + arg2.anInt8896) - Static392.anInt8798) / (Static392.anInt8794 - Static392.anInt8798) + Static392.anInt8802;
			local11 = Static392.anInt8796 - (arg2.anInt8900 + arg1.anInt2696 - Static392.anInt8801) * (Static392.anInt8796 + -Static392.anInt8793) / (Static392.anInt8799 - Static392.anInt8801);
			local9 = (arg2.anInt8896 + arg1.anInt2706 - Static392.anInt8798) * (Static392.anInt8800 - Static392.anInt8802) / (Static392.anInt8794 - Static392.anInt8798) + Static392.anInt8802;
			local13 = Static392.anInt8796 - (arg1.anInt2710 + arg2.anInt8900 - Static392.anInt8801) * (Static392.anInt8796 - Static392.anInt8793) / (Static392.anInt8799 - Static392.anInt8801);
		}
		@Pc(103) Class13 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg1.anInt2727 != -1) {
			if (arg2.aBoolean614 && arg1.anInt2707 != -1) {
				local103 = arg1.method2404(true, arg0);
			} else {
				local103 = arg1.method2404(false, arg0);
			}
			if (local103 != null) {
				local105 = arg2.anInt8898 - (local103.AA() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				local112 = arg2.anInt8898 + (local103.AA() + 1 >> 1);
				local114 = arg2.anInt8899 - (local103.a() + 1 >> 1);
				if (local9 < local112) {
					local9 = local112;
				}
				if (local11 > local114) {
					local11 = local114;
				}
				local116 = arg2.anInt8899 + (local103.a() + 1 >> 1);
				if (local13 < local116) {
					local13 = local116;
				}
			}
		}
		@Pc(210) Class189 local210 = null;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(273) int local273;
		@Pc(300) int local300;
		if (arg1.aString22 != null) {
			local210 = Static259.method4293(arg1.anInt2720);
			if (local210 != null) {
				local212 = Static272.aClass196_7.method4385(null, Static193.aStringArray14, null, arg1.aString22);
				local214 = arg2.anInt8899;
				if (local103 == null) {
					local214 -= local212 * local210.method4340() / 2;
				} else {
					local214 -= (local103.a() >> 1) + local210.method4341() * local212;
				}
				for (local273 = 0; local273 < local212; local273++) {
					@Pc(279) String local279 = Static193.aStringArray14[local273];
					if (local212 - 1 > local273) {
						local279 = local279.substring(0, local279.length() - 4);
					}
					local300 = local210.method4344(local279);
					if (local216 < local300) {
						local216 = local300;
					}
				}
				local218 = arg2.anInt8898 - local216 / 2;
				if (local218 < local7) {
					local7 = local218;
				}
				local220 = local216 / 2 + arg2.anInt8898;
				if (local220 > local9) {
					local9 = local220;
				}
				local222 = local214;
				if (local11 > local222) {
					local11 = local222;
				}
				local224 = local214 + local212 * local210.method4341();
				if (local224 > local13) {
					local13 = local224;
				}
			}
		}
		if (Static392.anInt8802 > local9 || Static392.anInt8800 < local7 || local13 < Static392.anInt8793 || Static392.anInt8796 < local11) {
			return true;
		}
		@Pc(404) int local404;
		if (arg1.anIntArray252 != null) {
			@Pc(402) int[] local402 = new int[arg1.anIntArray252.length];
			for (local404 = 0; local404 < local402.length / 2; local404++) {
				local300 = arg1.anIntArray252[local404 * 2] + arg2.anInt8896;
				@Pc(429) int local429 = arg1.anIntArray252[local404 * 2 + 1] + arg2.anInt8900;
				local402[local404 * 2] = (local300 - Static392.anInt8798) * (-Static392.anInt8802 + Static392.anInt8800) / (Static392.anInt8794 - Static392.anInt8798) + Static392.anInt8802;
				local402[local404 * 2 + 1] = Static392.anInt8796 - (local429 - Static392.anInt8801) * (-Static392.anInt8793 + Static392.anInt8796) / (Static392.anInt8799 - Static392.anInt8801);
			}
			Static144.method2983(arg0, local402, arg1.anInt2725);
			for (local300 = 0; local300 < local402.length / 2 - 1; local300++) {
				arg0.method6777(local402[local300 * 2 + 3], local402[local300 * 2 + 1], local402[(local300 + 1) * 2], local402[local300 * 2], arg1.anInt2722);
			}
			arg0.method6777(local402[1], local402[local402.length - 1], local402[0], local402[local402.length - 2], arg1.anInt2722);
		}
		if (local103 != null) {
			if (Static162.anInt3559 > 0 && (Static119.anInt2755 != -1 && arg2.anInt8895 == Static119.anInt2755 || Static597.anInt9820 != -1 && arg1.anInt2697 == Static597.anInt9820)) {
				if (Static391.anInt6853 <= 50) {
					local273 = Static391.anInt6853 * 2;
				} else {
					local273 = 200 - Static391.anInt6853 * 2;
				}
				local404 = local273 << 24 | 0xFFFF00;
				arg0.method6776(local404, local103.QA() / 2 + 7, arg2.anInt8898, arg2.anInt8899);
				arg0.method6776(local404, local103.QA() / 2 + 5, arg2.anInt8898, arg2.anInt8899);
				arg0.method6776(local404, local103.QA() / 2 + 3, arg2.anInt8898, arg2.anInt8899);
				arg0.method6776(local404, local103.QA() / 2 + 1, arg2.anInt8898, arg2.anInt8899);
				arg0.method6776(local404, local103.QA() / 2, arg2.anInt8898, arg2.anInt8899);
			}
			local103.method8019(arg2.anInt8898 - (local103.AA() >> 1), arg2.anInt8899 + -(local103.a() >> 1));
		}
		if (arg1.aString22 != null && local210 != null) {
			Static542.method7526(local210, local212, local216, local214, arg0, arg2, arg1);
		}
		if (arg1.anInt2727 != -1 || arg1.aString22 != null) {
			@Pc(713) Class4_Sub35 local713 = new Class4_Sub35(arg2);
			local713.anInt6496 = local222;
			local713.anInt6500 = local224;
			local713.anInt6497 = local114;
			local713.anInt6499 = local220;
			local713.anInt6502 = local218;
			local713.anInt6494 = local116;
			local713.anInt6495 = local112;
			local713.anInt6503 = local105;
			Static457.aClass124_51.method3275(local713);
		}
		return false;
	}
}
