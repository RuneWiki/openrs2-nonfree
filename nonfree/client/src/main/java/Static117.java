import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Lclient!ul;")
	public static Class286 aClass286_4;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
	public static int anInt2343;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	public static int anInt2345;

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "Lclient!wu;")
	public static final Class320 aClass320_1 = new Class320("LOCAL", 4);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II[FIIZI)V")
	public static void method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static150.method2607(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static150.method2607(arg4)) {
			@Pc(37) int local37 = Static472.method6911(6408);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg4 > arg1 ? arg1 : arg4;
			@Pc(50) int local50 = arg1 >> 1;
			@Pc(65) int local65 = arg4 >> 1;
			@Pc(67) float[] local67 = arg2;
			@Pc(74) float[] local74 = new float[local50 * local65 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg1, arg4, 0, 6408, 5126, local67, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(95) int local95 = local37 * arg1;
				@Pc(97) float[] local97 = local74;
				for (@Pc(99) int local99 = 0; local99 < local37; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local95 + local99;
					for (@Pc(111) int local111 = 0; local111 < local65; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local50; local115++) {
							@Pc(121) float local121 = local67[local105];
							local105 += local37;
							@Pc(131) float local131 = local121 + local67[local105];
							@Pc(137) float local137 = local131 + local67[local109];
							local105 += local37;
							local109 += local37;
							@Pc(151) float local151 = local137 + local67[local109];
							local74[local103] = local151 * 0.25F;
							local109 += local37;
							local103 += local37;
						}
						local109 += local95;
						local105 += local95;
					}
				}
				local74 = local67;
				arg4 = local65;
				arg1 = local50;
				local67 = local97;
				local46 >>= 0x1;
				local65 >>= 0x1;
				local50 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([Lclient!ha;I)V")
	public static void method2254(@OriginalArg(0) Class35[] arg0) {
		Static186.anInt3405 = arg0.length;
		Static55.anIntArray91 = new int[Static186.anInt3405 + 10];
		Static376.aClass35Array31 = new Class35[Static186.anInt3405 + 10];
		Static553.method3372(arg0, 0, Static376.aClass35Array31, 0, Static186.anInt3405);
		for (@Pc(37) int local37 = 0; local37 < Static186.anInt3405; local37++) {
			Static55.anIntArray91[local37] = Static376.aClass35Array31[local37].ma();
		}
		for (@Pc(56) int local56 = Static186.anInt3405; local56 < Static376.aClass35Array31.length; local56++) {
			Static55.anIntArray91[local56] = 12;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
	public static void method2256() {
		Static199.method3211();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI[I[ILclient!os;I)Lclient!oba;")
	public static Class209_Sub1 method2257(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class39_Sub3 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg4];
		for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
			@Pc(26) int local26 = arg1[local16] + arg4 * local16;
			for (@Pc(28) int local28 = 0; local28 < arg2[local16]; local28++) {
				local10[local26++] = -1;
			}
		}
		return new Class209_Sub1(arg3, arg4, arg0, local10);
	}
}
