import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!uh;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
	public static final int[] anIntArray24 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_13 = new Class117("M", "M", "M", "M");

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
	public static int anInt411 = 1;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_14 = new Class117("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
	public static int anInt414 = 999999;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
	public static int anInt416 = -1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!nq;IBI)Lclient!k;")
	public static Class114 method310(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3896(0, arg1);
		return local9 == null ? null : new Class114(local9);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method311() {
		Static13.aClass137Array1 = null;
		Static356.method5721(Static270.anInt5491, Static79.anInt5259, Static164.anInt3090, 0, 0, -1, 0, 0);
		if (Static13.aClass137Array1 != null) {
			Static259.method4513(Static42.aClass137_3.anInt4047, Static164.anInt3090, Static13.aClass137Array1, -1412584499, Static49.anInt940, Static140.anInt2594, Static79.anInt5259, 0, 0);
			Static13.aClass137Array1 = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIII)V")
	public static void method312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg5 - arg1;
		@Pc(17) int local17 = arg1 + arg4;
		for (@Pc(19) int local19 = arg4; local19 < local17; local19++) {
			Static224.method5303(Static73.anIntArrayArray6[local19], arg3, arg2, arg0);
		}
		@Pc(43) int local43 = arg3 - arg1;
		for (@Pc(45) int local45 = arg5; local45 > local13; local45--) {
			Static224.method5303(Static73.anIntArrayArray6[local45], arg3, arg2, arg0);
		}
		@Pc(63) int local63 = arg0 + arg1;
		for (@Pc(65) int local65 = local17; local65 <= local13; local65++) {
			@Pc(71) int[] local71 = Static73.anIntArrayArray6[local65];
			Static224.method5303(local71, local63, arg2, arg0);
			Static224.method5303(local71, arg3, arg2, local43);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBII)V")
	public static void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class11_Sub1 local15 = (Class11_Sub1) Static108.aClass16_19.method193(); local15 != null; local15 = (Class11_Sub1) Static108.aClass16_19.method188()) {
			Static197.method3597(local15, arg1, arg2, arg0, arg3);
		}
		for (@Pc(36) Class11_Sub1 local36 = (Class11_Sub1) Static169.aClass16_52.method193(); local36 != null; local36 = (Class11_Sub1) Static169.aClass16_52.method188()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class55 local45 = local36.aClass67_Sub3_Sub3_Sub1_1.method4374();
			if (local36.aClass67_Sub3_Sub3_Sub1_1.aBoolean328) {
				local40 = 0;
			} else if (local45.anInt1208 == local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040 || local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040 == local45.anInt1194 || local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040 == local45.anInt1182 || local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040 == local45.anInt1195) {
				local40 = 2;
			} else if (local45.anInt1211 == local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040 || local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040 == local45.anInt1177 || local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040 == local45.anInt1216 || local45.anInt1190 == local36.aClass67_Sub3_Sub3_Sub1_1.anInt5040) {
				local40 = 3;
			}
			if (local40 != local36.anInt96) {
				@Pc(132) int local132 = Static112.method1686(local36.aClass67_Sub3_Sub3_Sub1_1);
				if (local132 != local36.anInt91) {
					if (local36.aClass11_Sub10_Sub1_2 != null) {
						Static341.aClass11_Sub10_Sub3_2.method3737(local36.aClass11_Sub10_Sub1_2);
						local36.aClass11_Sub10_Sub1_2 = null;
					}
					local36.anInt91 = local132;
				}
				local36.anInt96 = local40;
			}
			local36.anInt88 = local36.aClass67_Sub3_Sub3_Sub1_1.anInt6308;
			local36.anInt85 = local36.aClass67_Sub3_Sub3_Sub1_1.anInt6308 + local36.aClass67_Sub3_Sub3_Sub1_1.method4368() * 64;
			local36.anInt97 = local36.aClass67_Sub3_Sub3_Sub1_1.anInt6310;
			local36.anInt100 = local36.aClass67_Sub3_Sub3_Sub1_1.anInt6310 + local36.aClass67_Sub3_Sub3_Sub1_1.method4368() * 64;
			Static197.method3597(local36, arg1, arg2, arg0, arg3);
		}
		for (@Pc(207) Class11_Sub1 local207 = (Class11_Sub1) Static99.aClass58_9.method1008(); local207 != null; local207 = (Class11_Sub1) Static99.aClass58_9.method1004()) {
			@Pc(211) byte local211 = 1;
			@Pc(216) Class55 local216 = local207.aClass67_Sub3_Sub3_Sub2_1.method4374();
			if (local207.aClass67_Sub3_Sub3_Sub2_1.aBoolean328) {
				local211 = 0;
			} else if (local216.anInt1208 == local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040 || local216.anInt1194 == local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040 || local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040 == local216.anInt1182 || local216.anInt1195 == local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040) {
				local211 = 2;
			} else if (local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040 == local216.anInt1211 || local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040 == local216.anInt1177 || local216.anInt1216 == local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040 || local216.anInt1190 == local207.aClass67_Sub3_Sub3_Sub2_1.anInt5040) {
				local211 = 3;
			}
			if (local207.anInt96 != local211) {
				@Pc(311) int local311 = Static269.method4630(local207.aClass67_Sub3_Sub3_Sub2_1);
				if (local207.anInt91 != local311) {
					if (local207.aClass11_Sub10_Sub1_2 != null) {
						Static341.aClass11_Sub10_Sub3_2.method3737(local207.aClass11_Sub10_Sub1_2);
						local207.aClass11_Sub10_Sub1_2 = null;
					}
					local207.anInt91 = local311;
				}
				local207.anInt96 = local211;
			}
			local207.anInt88 = local207.aClass67_Sub3_Sub3_Sub2_1.anInt6308;
			local207.anInt85 = local207.aClass67_Sub3_Sub3_Sub2_1.anInt6308 + local207.aClass67_Sub3_Sub3_Sub2_1.method4368() * 64;
			local207.anInt97 = local207.aClass67_Sub3_Sub3_Sub2_1.anInt6310;
			local207.anInt100 = local207.aClass67_Sub3_Sub3_Sub2_1.anInt6310 + local207.aClass67_Sub3_Sub3_Sub2_1.method4368() * 64;
			Static197.method3597(local207, arg1, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public static void method318() {
		if (Static284.anIntArray437 != null && Static333.anIntArray526 != null) {
			return;
		}
		Static284.anIntArray437 = new int[256];
		Static333.anIntArray526 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static284.anIntArray437[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static333.anIntArray526[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBII)I")
	public static int method319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(31) int local31 = arg1 * (arg0 & 0x7F) + local17 * (arg2 & 0x7F) >> 7;
		@Pc(45) int local45 = (arg0 & 0x380) * arg1 + local17 * (arg2 & 0x380) >> 7;
		@Pc(59) int local59 = (arg0 & 0xFC00) * arg1 + local17 * (arg2 & 0xFC00) >> 7;
		return local31 & 0x7F | local59 & 0xFC00 | local45 & 0x380;
	}
}
