import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "Lclient!kb;")
	public static Class52 aClass52_30;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_68 = new Class103(100);

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "[I")
	public static final int[] anIntArray813 = new int[13];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZIZII)Lclient!rk;")
	public static Class180 method5313(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) Class13 local10 = null;
		if (Static251.aClass77_10 != null) {
			local10 = new Class13(arg1, Static251.aClass77_10, Static195.aClass77Array1[arg1], 1000000);
		}
		Static269.aClass119_Sub1Array2[arg1] = Static141.aClass147_1.method3937(Static245.aClass13_4, local10, arg1);
		if (arg0) {
			Static269.aClass119_Sub1Array2[arg1].method3146();
		}
		return new Class180(Static269.aClass119_Sub1Array2[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!pe;IIIII)V")
	public static void method5314(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg0.method5431(arg4, arg1, arg3 + arg4, arg1 + arg2);
		arg0.method5477(arg1, arg4, arg2, arg3, -16777216);
		if (Static339.anInt6444 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static306.anInt3326 / (float) Static306.anInt3325;
		@Pc(35) int local35 = arg3;
		@Pc(37) int local37 = arg2;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg3);
		} else {
			local35 = (int) ((float) arg2 / local33);
		}
		@Pc(63) int local63 = arg4 + (arg3 - local35) / 2;
		@Pc(72) int local72 = arg1 + (arg2 - local37) / 2;
		if (Static168.aClass52_18 == null || Static168.aClass52_18.method4124() != arg3 || Static168.aClass52_18.method4134() != arg2) {
			Static306.method3067(Static306.anInt3327, Static306.anInt3326 + Static306.anInt3329, Static306.anInt3325 + Static306.anInt3327, Static306.anInt3329, local63, local72, local63 + local35, local37 + local72);
			Static306.method3062(arg0);
			Static168.aClass52_18 = arg0.method5468(local63, local72, local35, local37, false);
		}
		Static168.aClass52_18.method4123(local63, local72);
		@Pc(128) int local128 = Static284.anInt5566 * local35 / Static306.anInt3325;
		@Pc(134) int local134 = Static159.anInt3301 * local37 / Static306.anInt3326;
		@Pc(142) int local142 = Static211.anInt4222 * local35 / Static306.anInt3325 + local63;
		@Pc(160) int local160 = local72 + local37 - local37 * Static273.anInt5394 / Static306.anInt3326 - local134;
		@Pc(162) int local162 = -1996554240;
		if (Static345.anInt6530 == 1) {
			local162 = -1996488705;
		}
		arg0.method5439(local142, local160, local128, local134, local162, 1);
		arg0.method5481(local142, local160, local128, local134, local162, 0);
		if (Static242.anInt3402 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static320.anInt6132 <= 50) {
			local194 = Static320.anInt6132 * 5;
		} else {
			local194 = 500 - Static320.anInt6132 * 5;
		}
		for (@Pc(207) Class7_Sub37 local207 = (Class7_Sub37) Static306.aClass74_23.method1793(); local207 != null; local207 = (Class7_Sub37) Static306.aClass74_23.method1798()) {
			@Pc(213) Class155 local213 = Static84.method1785(local207.anInt5839);
			if (Static34.method722(local213)) {
				@Pc(231) int local231;
				@Pc(243) int local243;
				if (Static268.anInt5281 == local207.anInt5839) {
					local231 = local63 + local207.anInt5844 * local35 / Static306.anInt3325;
					local243 = local37 * (Static306.anInt3326 - local207.anInt5840) / Static306.anInt3326 + local72;
					arg0.method5477(local243 - 2, local231 + -2, 4, 4, local194 << 24 | 0xFFFF00);
				} else if (Static100.anInt2435 != -1 && local213.anInt4683 == Static100.anInt2435) {
					local231 = local63 + local35 * local207.anInt5844 / Static306.anInt3325;
					local243 = local72 + (Static306.anInt3326 - local207.anInt5840) * local37 / Static306.anInt3326;
					arg0.method5477(local243 - 2, local231 + -2, 4, 4, local194 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Lclient!oa;")
	public static Class149 method5315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class149 local12 = new Class149();
		local12.anInt4488 = -1;
		local12.anInt4481 = arg0 + 5 + 1;
		local12.anInt4484 = -1;
		local12.anInt4480 = arg1 + 6;
		local12.anIntArrayArray36 = new int[local12.anInt4480][local12.anInt4481];
		local12.method3954();
		return local12;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)V")
	public static void method5316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class7_Sub1_Sub15 local12 = Static315.method5104(9, arg0);
		local12.method4790();
		local12.anInt5687 = arg1;
		local12.anInt5696 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z")
	public static boolean method5318() {
		@Pc(5) Class152 local5 = Static239.aClass152_1;
		synchronized (Static239.aClass152_1) {
			if (Static72.anInt1773 == Static283.anInt5557) {
				return false;
			} else {
				Static113.anInt2572 = Static261.anIntArray662[Static283.anInt5557];
				Static59.aChar2 = Static43.aCharArray2[Static283.anInt5557];
				Static283.anInt5557 = Static283.anInt5557 + 1 & 0x7F;
				return true;
			}
		}
	}
}
