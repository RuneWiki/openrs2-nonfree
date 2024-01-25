import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	public static int anInt2885 = 0;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
	public static int anInt2886 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)V")
	public static void method2634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static544.method7976(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg5;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg0;
		@Pc(23) int local23 = -arg0;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = -1;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(94) int local94;
		if (arg2 >= Static507.anInt9124 && arg2 <= Static234.anInt4897) {
			@Pc(61) int[] local61 = Static228.anIntArrayArray46[arg2];
			local70 = Static108.method2267(arg4 - arg0, Static251.anInt5168, Static341.anInt6481);
			local78 = Static108.method2267(arg0 + arg4, Static251.anInt5168, Static341.anInt6481);
			local86 = Static108.method2267(arg4 - local14, Static251.anInt5168, Static341.anInt6481);
			local94 = Static108.method2267(local14 + arg4, Static251.anInt5168, Static341.anInt6481);
			Static118.method2461(local61, local86, arg3, local70);
			Static118.method2461(local61, local94, arg1, local86);
			Static118.method2461(local61, local78, arg3, local94);
		}
		while (local20 > local10) {
			local43 += 2;
			local41 += 2;
			local23 += local41;
			local28 += local43;
			if (local28 >= 0 && local25 >= 1) {
				local25--;
				local28 -= local25 << 1;
				Static72.anIntArray181[local25] = local10;
			}
			local10++;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(223) int[] local223;
			@Pc(161) int local161;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local161 = arg2 - local20;
				local70 = local20 + arg2;
				if (local70 >= Static507.anInt9124 && Static234.anInt4897 >= local161) {
					if (local20 < local14) {
						local78 = Static72.anIntArray181[local20];
						local86 = Static108.method2267(local10 + arg4, Static251.anInt5168, Static341.anInt6481);
						local94 = Static108.method2267(arg4 - local10, Static251.anInt5168, Static341.anInt6481);
						local207 = Static108.method2267(local78 + arg4, Static251.anInt5168, Static341.anInt6481);
						local216 = Static108.method2267(arg4 - local78, Static251.anInt5168, Static341.anInt6481);
						if (local70 <= Static234.anInt4897) {
							local223 = Static228.anIntArrayArray46[local70];
							Static118.method2461(local223, local216, arg3, local94);
							Static118.method2461(local223, local207, arg1, local216);
							Static118.method2461(local223, local86, arg3, local207);
						}
						if (local161 >= Static507.anInt9124) {
							local223 = Static228.anIntArrayArray46[local161];
							Static118.method2461(local223, local216, arg3, local94);
							Static118.method2461(local223, local207, arg1, local216);
							Static118.method2461(local223, local86, arg3, local207);
						}
					} else {
						local78 = Static108.method2267(local10 + arg4, Static251.anInt5168, Static341.anInt6481);
						local86 = Static108.method2267(arg4 - local10, Static251.anInt5168, Static341.anInt6481);
						if (Static234.anInt4897 >= local70) {
							Static118.method2461(Static228.anIntArrayArray46[local70], local78, arg3, local86);
						}
						if (local161 >= Static507.anInt9124) {
							Static118.method2461(Static228.anIntArrayArray46[local161], local78, arg3, local86);
						}
					}
				}
			}
			local161 = arg2 - local10;
			local70 = arg2 + local10;
			if (local70 >= Static507.anInt9124 && Static234.anInt4897 >= local161) {
				local78 = arg4 + local20;
				local86 = arg4 - local20;
				if (local78 >= Static251.anInt5168 && local86 <= Static341.anInt6481) {
					local78 = Static108.method2267(local78, Static251.anInt5168, Static341.anInt6481);
					local86 = Static108.method2267(local86, Static251.anInt5168, Static341.anInt6481);
					if (local10 < local14) {
						local94 = local25 >= local10 ? local25 : Static72.anIntArray181[local10];
						local207 = Static108.method2267(local94 + arg4, Static251.anInt5168, Static341.anInt6481);
						local216 = Static108.method2267(arg4 - local94, Static251.anInt5168, Static341.anInt6481);
						if (local70 <= Static234.anInt4897) {
							local223 = Static228.anIntArrayArray46[local70];
							Static118.method2461(local223, local216, arg3, local86);
							Static118.method2461(local223, local207, arg1, local216);
							Static118.method2461(local223, local78, arg3, local207);
						}
						if (local161 >= Static507.anInt9124) {
							local223 = Static228.anIntArrayArray46[local161];
							Static118.method2461(local223, local216, arg3, local86);
							Static118.method2461(local223, local207, arg1, local216);
							Static118.method2461(local223, local78, arg3, local207);
						}
					} else {
						if (local70 <= Static234.anInt4897) {
							Static118.method2461(Static228.anIntArrayArray46[local70], local78, arg3, local86);
						}
						if (Static507.anInt9124 <= local161) {
							Static118.method2461(Static228.anIntArrayArray46[local161], local78, arg3, local86);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!an;ILjava/awt/Canvas;Lclient!n;)Lclient!qa;")
	public static Class42 method2635(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface11 arg3) {
		if (!Static249.method4284()) {
			throw new RuntimeException("");
		} else if (Static222.method4058("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg1);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class42_Sub1_Sub2 local53 = new Class42_Sub1_Sub2(local24, arg2, local34, arg3, arg0, arg1);
			local53.method5887();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}
}
