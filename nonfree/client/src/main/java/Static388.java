import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public static int anInt6396;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "[I")
	public static int[] anIntArray410;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public static int anInt6398;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_11 = new Class222("", 11);

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public static int anInt6397 = 0;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!vs;")
	public static final Class354 aClass354_7 = new Class354();

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "[I")
	public static int[] anIntArray411 = new int[1];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([BILclient!kd;I)Lclient!oh;")
	public static Class254 method5351(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class162_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static94.anIntArray149, 0);
		if (Static94.anIntArray149[0] == 0) {
			if (Static94.anIntArray149[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static94.anIntArray149, 1);
			if (Static94.anIntArray149[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static94.anIntArray149[1]];
				OpenGL.glGetInfoLogARB(local6, Static94.anIntArray149[1], Static94.anIntArray149, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static94.anIntArray149[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class254(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method5352() {
		if (Static189.aBoolean199) {
			return;
		}
		Static122.aBoolean139 = true;
		Static189.aBoolean199 = true;
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean638) {
			Static313.aFloat157 = (int) Static313.aFloat157 - 65 & 0xFFFFFF80;
		} else {
			Static216.aFloat246 += (-24.0F - Static216.aFloat246) / 2.0F;
		}
	}
}
