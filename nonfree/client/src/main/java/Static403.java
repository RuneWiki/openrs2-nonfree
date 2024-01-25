import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public static int anInt7267;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	public static int anInt7268;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_192 = new Class158(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!za;ILclient!l;II)V")
	public static void method5530(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static2.anInt48 < 100) {
			Static161.method2658(arg3, arg1);
		}
		arg1.ba(arg2, arg0, arg4 + arg2, arg0 - -arg5);
		@Pc(35) int local35;
		@Pc(54) int local54;
		if (Static2.anInt48 < 100) {
			local35 = arg2 + arg4 / 2;
			arg1.P(arg2, arg0, arg4, arg5, -16777216, 0);
			local54 = arg0 + arg5 / 2 - 18 - 20;
			arg1.method5958(local35 - 152, local54, 304, 34, Static70.aColorArray1[Static263.anInt5071].getRGB(), 0);
			arg1.P(local35 - 150, local54 + 2, Static2.anInt48 * 3, 30, Static330.aColorArray2[Static263.anInt5071].getRGB(), 0);
			Static13.aClass20_2.method5334(local35, local54 + 20, Static405.aColorArray3[Static263.anInt5071].getRGB(), Static448.aClass158_210.method3594(Static365.anInt6682), -1);
			return;
		}
		@Pc(109) int local109 = Static226.anInt4474 - (int) ((float) arg4 / Static377.aFloat69);
		local35 = Static125.anInt2774 + (int) ((float) arg5 / Static377.aFloat69);
		local54 = (int) ((float) arg4 / Static377.aFloat69) + Static226.anInt4474;
		Static54.anInt1417 = (int) ((float) (arg4 * 2) / Static377.aFloat69);
		Static249.anInt4828 = Static125.anInt2774 - (int) ((float) arg5 / Static377.aFloat69);
		Static119.anInt2649 = Static226.anInt4474 - (int) ((float) arg4 / Static377.aFloat69);
		Static223.anInt4456 = (int) ((float) (arg5 * 2) / Static377.aFloat69);
		@Pc(168) int local168 = Static125.anInt2774 - (int) ((float) arg5 / Static377.aFloat69);
		Static377.method3867(local109 + Static377.anInt5040, Static377.anInt5030 + local35, Static377.anInt5040 + local54, Static377.anInt5030 + local168, arg2, arg0, arg4 + arg2, arg0 - -arg5 - -1);
		Static377.method3866(arg1);
		@Pc(197) Class203 local197 = Static377.method3862(arg1);
		Static26.method557(arg1, local197);
		if (Static305.anInt5723 > 0) {
			Static9.anInt3081--;
			if (Static9.anInt3081 == 0) {
				Static305.anInt5723--;
				Static9.anInt3081 = 20;
			}
		}
		if (!Static227.aBoolean283) {
			return;
		}
		@Pc(231) int local231 = arg4 + arg2 - 5;
		@Pc(237) int local237 = arg5 + arg0 - 8;
		Static308.aClass20_5.method5339(16776960, "Fps:" + Static441.anInt7762, local231, local237);
		@Pc(252) int local252 = local237 - 15;
		@Pc(254) Runtime local254 = Runtime.getRuntime();
		@Pc(263) int local263 = (int) ((local254.totalMemory() - local254.freeMemory()) / 1024L);
		@Pc(265) int local265 = 16776960;
		if (local263 > 65536) {
			local265 = 16711680;
		}
		Static308.aClass20_5.method5339(local265, "Mem:" + local263 + "k", local231, local252);
		local237 = local252 - 15;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ia;I)Lclient!kt;")
	public static Class90_Sub2 method5531(@OriginalArg(0) Class1_Sub3 arg0) {
		return new Class90_Sub2(arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1226(), arg0.method1226(), arg0.method1171());
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BILclient!ih;Ljava/lang/String;)Lclient!aj;")
	public static Class10 method5533(@OriginalArg(1) int arg0, @OriginalArg(2) Class106_Sub2 arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static143.anIntArray322, 0);
		if (Static143.anIntArray322[0] == 0) {
			if (Static143.anIntArray322[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static143.anIntArray322, 1);
			if (Static143.anIntArray322[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static143.anIntArray322[1]];
				OpenGL.glGetInfoLogARB(local11, Static143.anIntArray322[1], Static143.anIntArray322, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static143.anIntArray322[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class10(arg1, local11, arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZJ)V")
	public static void method5534(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}
}
