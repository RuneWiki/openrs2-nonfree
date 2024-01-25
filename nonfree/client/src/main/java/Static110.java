import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eaa", name = "N", descriptor = "Lclient!kga;")
	public static Class178 aClass178_2;

	@OriginalMember(owner = "client!eaa", name = "O", descriptor = "[Lclient!hda;")
	public static Class21_Sub5[] aClass21_Sub5Array1;

	@OriginalMember(owner = "client!eaa", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
	public static void method2034() {
		if (Static301.aBoolean426) {
			return;
		}
		Static301.aBoolean426 = true;
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean674) {
			Static189.aFloat83 = (int) Static189.aFloat83 - 65 & 0xFFFFFF80;
		} else {
			Static15.aFloat37 += (-Static15.aFloat37 - 24.0F) / 2.0F;
		}
		Static521.aBoolean651 = true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I[Lclient!afa;Lclient!kfa;)Lclient!qn;")
	public static Class281 method2036(@OriginalArg(1) Class11[] arg0, @OriginalArg(2) Class7_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong6 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong6);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static318.anIntArray349, 0);
		if (Static318.anIntArray349[0] == 0) {
			if (Static318.anIntArray349[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static318.anIntArray349, 1);
			if (Static318.anIntArray349[1] > 1) {
				@Pc(79) byte[] local79 = new byte[Static318.anIntArray349[1]];
				OpenGL.glGetInfoLogARB(local29, Static318.anIntArray349[1], Static318.anIntArray349, 0, local79, 0);
				System.out.println(new String(local79));
			}
			if (Static318.anIntArray349[0] == 0) {
				for (@Pc(103) int local103 = 0; local103 < arg0.length; local103++) {
					OpenGL.glDetachObjectARB(local29, arg0[local103].aLong6);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class281(arg1, local29, arg0);
	}
}
