import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
	public static int anInt5636;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "Z")
	public static boolean aBoolean506 = false;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "Lclient!gn;")
	public static final Class84 aClass84_7 = new Class84();

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "Lclient!ib;")
	public static Class102 aClass102_29 = new Class102(8);

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
	public static int anInt5640 = 1;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!rs;)I")
	public static int method4392(@OriginalArg(1) Class16_Sub1_Sub5_Sub2 arg0) {
		@Pc(8) Class264 local8 = arg0.aClass264_1;
		if (local8.anIntArray544 != null) {
			local8 = local8.method5574(Static257.aClass114_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt7202;
		@Pc(34) Class151 local34 = arg0.method4757();
		if (arg0.aBoolean562) {
			local28 = local8.anInt7210;
		} else if (arg0.anInt6076 == local34.anInt4669 || local34.anInt4656 == arg0.anInt6076 || local34.anInt4665 == arg0.anInt6076 || arg0.anInt6076 == local34.anInt4686) {
			local28 = local8.anInt7212;
		} else if (arg0.anInt6076 == local34.anInt4667 || local34.anInt4681 == arg0.anInt6076 || arg0.anInt6076 == local34.anInt4688 || local34.anInt4675 == arg0.anInt6076) {
			local28 = local8.anInt7207;
		}
		return local28;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
	public static int method4394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static292.anIntArray343[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BIIIIII)V")
	public static void method4395(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class38[] local7 = Static306.aClass38Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class38 local15 = local7[local9];
			if (local15 != null && local15.anInt891 == 2) {
				Static270.method3871(local15.anInt892, local15.anInt894, local15.anInt887, local15.anInt895 * 2, arg2 >> 1, arg1 >> 1);
				if (Static449.anIntArray557[0] > -1 && Static24.anInt5323 % 20 < 10) {
					Static59.aClass57Array3[local15.anInt886].method5534(arg3 + Static449.anIntArray557[0] - 12, arg0 + (Static449.anIntArray557[1] - 28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLclient!rs;Z)V")
	public static void method4396(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16_Sub1_Sub5_Sub2 arg1) {
		if (Static407.anInt6710 >= 400) {
			return;
		}
		@Pc(16) Class264 local16 = arg1.aClass264_1;
		if (local16.anIntArray544 != null) {
			local16 = local16.method5574(Static257.aClass114_1);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean682) {
			return;
		}
		@Pc(34) String local34 = local16.aString70;
		if (local16.lb != 0) {
			@Pc(50) String local50 = Static393.aClass121_3 == Static317.aClass121_2 ? Static4.aClass83_121.method2267(Static178.anInt3423) : Static320.aClass83_118.method2267(Static178.anInt3423);
			local34 = local34 + Static272.method3907(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345, local16.lb) + " (" + local50 + local16.lb + ")";
		}
		if (!Static341.aBoolean599) {
			if (!arg0) {
				@Pc(84) String[] local84 = local16.aStringArray41;
				if (Static420.aBoolean646) {
					local84 = Static124.method2247(local84);
				}
				@Pc(94) int local94;
				if (local84 != null) {
					for (local94 = 4; local94 >= 0; local94--) {
						if (local84[local94] != null && (Static393.aClass121_3 != Static196.aClass121_1 || !local84[local94].equalsIgnoreCase(Static81.aClass83_33.method2267(Static178.anInt3423)))) {
							@Pc(114) byte local114 = 0;
							@Pc(116) int local116 = Static207.anInt5453;
							if (local94 == 0) {
								local114 = 11;
							}
							if (local94 == 1) {
								local114 = 15;
							}
							if (local94 == 2) {
								local114 = 21;
							}
							if (local94 == 3) {
								local114 = 3;
							}
							if (local94 == 4) {
								local114 = 50;
							}
							if (local16.anInt7206 == local94) {
								local116 = local16.anInt7237;
							}
							if (local94 == local16.anInt7219) {
								local116 = local16.anInt7229;
							}
							Static380.method5017(local114, false, (long) arg1.anInt6037, 0, "<col=ffff00>" + local34, true, local84[local94], 0, -1, local116);
						}
					}
				}
				if (Static393.aClass121_3 == Static196.aClass121_1 && local84 != null) {
					for (local94 = 4; local94 >= 0; local94--) {
						if (local84[local94] != null && local84[local94].equalsIgnoreCase(Static81.aClass83_33.method2267(Static178.anInt3423))) {
							@Pc(214) short local214 = 0;
							if (local16.lb > Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345) {
								local214 = 2000;
							}
							@Pc(227) short local227 = 0;
							if (local94 == 0) {
								local227 = 11;
							}
							if (local94 == 1) {
								local227 = 15;
							}
							if (local94 == 2) {
								local227 = 21;
							}
							if (local94 == 3) {
								local227 = 3;
							}
							if (local94 == 4) {
								local227 = 50;
							}
							if (local227 != 0) {
								local227 += local214;
							}
							Static380.method5017(local227, false, (long) arg1.anInt6037, 0, "<col=ffff00>" + local34, true, local84[local94], 0, -1, local16.anInt7214);
						}
					}
				}
			}
			Static380.method5017(1003, arg0, (long) arg1.anInt6037, 0, "<col=ffff00>" + local34, true, Static21.aClass83_12.method2267(Static178.anInt3423), 0, -1, Static103.anInt2066);
		} else if (!arg0) {
			@Pc(339) Class133 local339 = Static7.anInt5460 == -1 ? null : Static153.aClass180_1.method4121(Static7.anInt5460);
			if ((Static434.anInt7378 & 0x2) != 0) {
				if (local339 == null || local16.method5582(local339.anInt4123, Static7.anInt5460) != local339.anInt4123) {
					Static380.method5017(22, false, (long) arg1.anInt6037, 0, Static49.aString28 + " -> <col=ffff00>" + local34, true, Static388.aString62, 0, -1, Static273.anInt5120);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!fd;ILjava/lang/String;)Lclient!wl;")
	public static Class267 method4397(@OriginalArg(1) Class19_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static353.anIntArray434, 0);
		if (Static353.anIntArray434[0] == 0) {
			if (Static353.anIntArray434[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static353.anIntArray434, 1);
			if (Static353.anIntArray434[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static353.anIntArray434[1]];
				OpenGL.glGetInfoLogARB(local6, Static353.anIntArray434[1], Static353.anIntArray434, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static353.anIntArray434[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class267(arg0, local6, arg1);
	}
}
