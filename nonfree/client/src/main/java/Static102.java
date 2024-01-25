import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public static int anInt2184;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Lclient!pc;")
	public static Class188 aClass188_33;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "I")
	public static int anInt2185 = 1;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_46 = new Class81(83, -2);

	@OriginalMember(owner = "client!es", name = "g", descriptor = "I")
	public static int anInt2188 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIB)I")
	public static int method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)I")
	public static int method1619() {
		if (Static191.aClass41_7 == null) {
			if (!Static237.aBoolean384 && Static168.anInt3255 > 0) {
				if (Static243.aBoolean380 && Static428.aClass52_1.method1347(81) && Static168.anInt3255 > 2) {
					return ((Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262.aClass2_262).anInt4536;
				}
				return ((Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262).anInt4536;
			}
			@Pc(43) int local43 = Static304.aClass40_1.method1164();
			@Pc(47) int local47 = Static304.aClass40_1.method1159();
			@Pc(49) int local49 = Static346.anInt6104;
			@Pc(51) int local51 = Static117.anInt2356;
			@Pc(53) int local53 = Static85.anInt3261;
			if (local49 < local43 && local43 < local53 + local49) {
				@Pc(67) int local67 = -1;
				@Pc(86) int local86;
				for (@Pc(69) int local69 = 0; local69 < Static168.anInt3255; local69++) {
					if (Static417.aBoolean624) {
						local86 = (Static168.anInt3255 - local69 - 1) * 16 + local51 + 33;
						if (local47 > local86 - 13 && local86 + 3 >= local47) {
							local67 = local69;
						}
					} else {
						local86 = local51 + (-local69 + -1 + Static168.anInt3255) * 16 + 31;
						if (local47 > local86 - 13 && local47 <= local86 + 3) {
							local67 = local69;
						}
					}
				}
				if (local67 != -1) {
					local86 = 0;
					@Pc(145) Class247 local145 = new Class247(Static288.aClass265_41);
					for (@Pc(150) Class2_Sub26 local150 = (Class2_Sub26) local145.method5532(); local150 != null; local150 = (Class2_Sub26) local145.method5528()) {
						if (local86++ == local67) {
							return local150.anInt4536;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/String;ILclient!bo;I)Lclient!tr;")
	public static Class235 method1620(@OriginalArg(0) String arg0, @OriginalArg(2) Class26_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static205.anIntArray261, 0);
		if (Static205.anIntArray261[0] == 0) {
			if (Static205.anIntArray261[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static205.anIntArray261, 1);
			if (Static205.anIntArray261[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static205.anIntArray261[1]];
				OpenGL.glGetInfoLogARB(local6, Static205.anIntArray261[1], Static205.anIntArray261, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static205.anIntArray261[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class235(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)V")
	public static void method1621(@OriginalArg(0) int arg0) {
		Static121.method1761();
		Static112.method1695();
		Static421.method5714(true, arg0);
		Static350.method4899(Static387.aClass26_9, Static351.aClass188_97, Static48.aClass188_23);
		Static365.method5073(Static351.aClass188_97, Static387.aClass26_9);
		Static256.method3905(Static119.aClass76Array11);
		Static374.method5250();
		Static8.method183();
		if (Static297.anInt5339 == 10) {
			Static243.method3669(false);
		} else if (Static297.anInt5339 == 30) {
			Static446.method6043(25);
		} else if (Static297.anInt5339 == 5) {
			Static256.method3902(Static351.aClass188_97, Static387.aClass26_9);
		}
	}
}
