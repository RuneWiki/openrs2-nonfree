import jaggl.OpenGL;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "Lclient!gq;")
	public static Class117 aClass117_7;

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_64 = new Class218(70, 6);

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "Lclient!fq;")
	public static final Class104 aClass104_7 = new Class104(14, 0, 4, 1);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ck;B[Lclient!ju;)Lclient!wd;")
	public static Class367 method4362(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(2) Class168[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong137 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg1.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg1[local37].aLong137);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static176.anIntArray230, 0);
		if (Static176.anIntArray230[0] == 0) {
			if (Static176.anIntArray230[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static176.anIntArray230, 1);
			if (Static176.anIntArray230[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static176.anIntArray230[1]];
				OpenGL.glGetInfoLogARB(local35, Static176.anIntArray230[1], Static176.anIntArray230, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static176.anIntArray230[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg1.length; local113++) {
					OpenGL.glDetachObjectARB(local35, arg1[local113].aLong137);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class367(arg0, local35, arg1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!gaa;)V")
	public static void method4367(@OriginalArg(1) Class108 arg0) {
		if (Static149.anInt3688 != arg0.anInt4031) {
			return;
		}
		if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68 == null) {
			arg0.anInt4097 = 0;
			arg0.anInt4016 = 0;
			return;
		}
		arg0.anInt4063 = 150;
		arg0.anInt4085 = (int) (Math.sin((double) Static251.anInt5580 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4044 = 5;
		arg0.anInt4097 = Static399.anInt7626;
		arg0.anInt4016 = Static254.method4792(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68);
		arg0.anInt4095 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6337;
		arg0.anInt4065 = 0;
		arg0.anInt4025 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6314;
		arg0.anInt4015 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6273;
		@Pc(81) Class290 local81 = arg0.anInt4015 == -1 ? null : Static618.aClass222_2.method5867(arg0.anInt4015);
		if (local81 != null) {
			Static468.method6973(arg0.anInt4025, local81);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Z")
	public static boolean method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static85.method2240(arg1)) {
			return true;
		} else {
			return !Static85.method2240(arg0);
		}
	}
}
