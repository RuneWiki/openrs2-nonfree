import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!mb", name = "oc", descriptor = "Lclient!q;")
	public static Class109 aClass109_4;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method4945() {
		Static493.method5818((long) Static305.anInt5560, Static4.aClass43_1);
		if (Static307.anInt5578 != -1) {
			Static550.method6450(Static307.anInt5578);
		}
		for (@Pc(18) int local18 = 0; local18 < Static591.anInt9382; local18++) {
			if (Static253.aBooleanArray17[local18]) {
				Static97.aBooleanArray4[local18] = true;
			}
			Static332.aBooleanArray24[local18] = Static253.aBooleanArray17[local18];
			Static253.aBooleanArray17[local18] = false;
		}
		Static304.anInt5464 = Static305.anInt5560;
		if (Static307.anInt5578 != -1) {
			Static591.anInt9382 = 0;
			Static49.method821();
		}
		Static4.aClass43_1.JA();
		Static238.method3981(Static4.aClass43_1);
		@Pc(65) int local65 = Static159.method2854();
		if (local65 == -1) {
			local65 = Static212.anInt4226;
		}
		if (local65 == -1) {
			local65 = Static215.anInt4261;
		}
		Static144.method2733(local65);
		Static14.anInt217 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method4946() {
		@Pc(5) Class10 local5 = Static529.aClass10_60;
		synchronized (Static529.aClass10_60) {
			Static529.aClass10_60.method263();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!jq;[Lclient!pm;B)Lclient!kg;")
	public static Class185 method4950(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class263[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong194 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg1.length; local42++) {
			OpenGL.glAttachObjectARB(local35, arg1[local42].aLong194);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static285.anIntArray389, 0);
		if (Static285.anIntArray389[0] == 0) {
			if (Static285.anIntArray389[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static285.anIntArray389, 1);
			if (Static285.anIntArray389[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static285.anIntArray389[1]];
				OpenGL.glGetInfoLogARB(local35, Static285.anIntArray389[1], Static285.anIntArray389, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static285.anIntArray389[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg1.length; local112++) {
					OpenGL.glDetachObjectARB(local35, arg1[local112].aLong194);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class185(arg0, local35, arg1);
	}
}
