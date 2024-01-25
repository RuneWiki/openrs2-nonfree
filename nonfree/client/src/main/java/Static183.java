import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	public static int anInt3794;

	@OriginalMember(owner = "client!lp", name = "T", descriptor = "I")
	public static int anInt3811;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "[I")
	public static final int[] anIntArray447 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	public static int anInt3795 = -1;

	@OriginalMember(owner = "client!lp", name = "jb", descriptor = "I")
	public static int anInt3821 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIILclient!aa;I)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4) {
		arg3.method3250(arg0, arg4, arg2 + arg0, arg1 + arg4);
		arg3.method3277(arg4, arg1, arg0, -16777216, arg2);
		if (Static24.anInt671 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static342.anInt2146 / (float) Static342.anInt2148;
		@Pc(35) int local35 = arg2;
		@Pc(37) int local37 = arg1;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg2);
		} else {
			local35 = (int) ((float) arg1 / local33);
		}
		@Pc(64) int local64 = arg4 + (arg1 - local37) / 2;
		@Pc(73) int local73 = arg0 + (arg2 - local35) / 2;
		if (Static97.aClass90_9 == null || arg2 != Static97.aClass90_9.method5471() || arg1 != Static97.aClass90_9.method5466()) {
			Static342.method1954(Static342.anInt2144, Static342.anInt2146 + Static342.anInt2150, Static342.anInt2144 + Static342.anInt2148, Static342.anInt2150, local73, local64, local73 + local35, local64 + local37);
			Static342.method1973(arg3);
			Static97.aClass90_9 = arg3.method3266(local73, local64, local35, local37, false);
		}
		Static97.aClass90_9.method5454(local73, local64);
		@Pc(128) int local128 = local35 * Static120.anInt2343 / Static342.anInt2148;
		@Pc(134) int local134 = Static33.anInt800 * local37 / Static342.anInt2146;
		@Pc(142) int local142 = local35 * Static186.anInt3872 / Static342.anInt2148 + local73;
		@Pc(156) int local156 = local64 + local37 - local37 * Static169.anInt4509 / Static342.anInt2146 - local134;
		@Pc(158) int local158 = -1996554240;
		if (Static341.anInt2259 == 1) {
			local158 = -1996488705;
		}
		arg3.method3300(local142, local156, local128, local134, local158, 1);
		arg3.method3263(local142, local156, local128, local134, local158, 0);
		if (Static177.anInt3677 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static23.anInt530 <= 50) {
			local195 = Static23.anInt530 * 5;
		} else {
			local195 = (100 - Static23.anInt530) * 5;
		}
		for (@Pc(208) Class1_Sub25 local208 = (Class1_Sub25) Static342.aClass195_17.method5029(); local208 != null; local208 = (Class1_Sub25) Static342.aClass195_17.method5021()) {
			@Pc(215) Class202 local215 = Static221.method4034(local208.anInt4124);
			if (Static151.method3579(local215)) {
				@Pc(244) int local244;
				@Pc(256) int local256;
				if (local208.anInt4124 == Static239.anInt4658) {
					local244 = local35 * local208.anInt4119 / Static342.anInt2148 + local73;
					local256 = local37 * (Static342.anInt2146 - local208.anInt4125) / Static342.anInt2146 + local64;
					arg3.method3277(local256 - 2, 4, local244 - 2, local195 << 24 | 0xFFFF00, 4);
				} else if (Static327.anInt6270 != -1 && local215.anInt5902 == Static327.anInt6270) {
					local244 = local73 + local208.anInt4119 * local35 / Static342.anInt2148;
					local256 = local37 * (Static342.anInt2146 - local208.anInt4125) / Static342.anInt2146 + local64;
					arg3.method3277(local256 - 2, 4, local244 - 2, local195 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lclient!mc;")
	public static Class125 method3571(@OriginalArg(0) int arg0) {
		@Pc(5) Class140 local5 = Static306.aClass140_155;
		@Pc(14) Class125 local14;
		synchronized (Static306.aClass140_155) {
			local14 = (Class125) Static306.aClass140_155.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static276.aClass165_83.method4508(Static331.method5555(arg0), Static241.method4290(arg0));
		local14 = new Class125();
		local14.anInt3908 = arg0;
		if (local34 != null) {
			local14.method3643(new Class1_Sub7(local34));
		}
		@Pc(60) Class140 local60 = Static306.aClass140_155;
		synchronized (Static306.aClass140_155) {
			Static306.aClass140_155.method3817((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!aa;)V")
	public static void method3574(@OriginalArg(1) Class2 arg0) {
		if (Static285.anInt5511 != Static99.anInt1954 && (Static138.aClass204ArrayArrayArray1 != null && Static91.method1717(Static285.anInt5511, arg0))) {
			Static99.anInt1954 = Static285.anInt5511;
		}
	}
}
