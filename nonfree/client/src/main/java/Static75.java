import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!di", name = "K", descriptor = "I")
	public static int anInt1777;

	@OriginalMember(owner = "client!di", name = "O", descriptor = "I")
	public static int anInt1780;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!tf;[[BI)V")
	public static void method1362(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt6621; local22++) {
			Static10.method281();
			for (@Pc(28) int local28 = 0; local28 < Static126.anInt2569 >> 3; local28++) {
				for (@Pc(32) int local32 = 0; local32 < Static190.anInt3697 >> 3; local32++) {
					@Pc(36) boolean local36 = false;
					@Pc(44) int local44 = Static4.anIntArrayArrayArray1[local22][local28][local32];
					if (local44 != -1) {
						@Pc(54) int local54 = local44 >> 24 & 0x3;
						if (!arg0.aBoolean442 || local54 == 0) {
							@Pc(65) int local65 = local44 >> 1 & 0x3;
							@Pc(71) int local71 = local44 >> 14 & 0x3FF;
							@Pc(77) int local77 = local44 >> 3 & 0x7FF;
							@Pc(87) int local87 = (local71 / 8 << 8) + local77 / 8;
							for (@Pc(89) int local89 = 0; local89 < Static100.anIntArray134.length; local89++) {
								if (local87 == Static100.anIntArray134[local89] && arg1[local89] != null) {
									@Pc(107) Class4_Sub30 local107 = new Class4_Sub30(arg1[local89]);
									arg0.method5146(local107, local32 * 8, local71, local28 * 8, local22, local77, Static395.aClass268Array1, local65, local54);
									local36 = true;
									arg0.method5158(Static16.aClass30_11, local54, local12[0] == -1 ? local12 : null, local71, local28 * 8, local32 * 8, local22, local77, local65, local107);
									break;
								}
							}
						}
					}
					if (!local36) {
						arg0.method5155(local28 * 8, 8, 8, local22, local32 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static132.aClass129_1 = Static447.aClass78_1.method1818(local12[2], Static316.aClass88_4, local12[3], local12[0], local12[1]);
			Static300.anInt5429 = local12[4];
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!bv;BILjava/lang/String;)Lclient!vl;")
	public static Class254 method1363(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static36.anIntArray70, 0);
		if (Static36.anIntArray70[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class254(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;Lclient!tl;)I")
	public static int method1364(@OriginalArg(1) String arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		@Pc(6) int local6 = arg1.anInt6244;
		@Pc(10) byte[] local10 = Static255.method3511(arg0);
		arg1.method4840(local10.length);
		arg1.anInt6244 += Static203.aClass68_1.method1586(arg1.aByteArray79, 0, local10.length, local10, arg1.anInt6244);
		return arg1.anInt6244 - local6;
	}
}
