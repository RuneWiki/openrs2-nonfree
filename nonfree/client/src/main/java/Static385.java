import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIB)Z")
	public static boolean method5885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBZI)Lclient!cq;")
	public static Class14_Sub13 method5886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class14_Sub13 local7 = new Class14_Sub13();
		local7.anInt1465 = arg0;
		local7.anInt1466 = arg1;
		Static27.aClass125_3.method2626(local7, (long) arg3);
		Static437.method6519(arg0);
		@Pc(26) Class299 local26 = Static391.method5936(arg3);
		if (local26 != null) {
			Static538.method7933(local26);
		}
		if (Static432.aClass299_7 != null) {
			Static538.method7933(Static432.aClass299_7);
			Static432.aClass299_7 = null;
		}
		Static92.method9424();
		if (local26 != null) {
			Static683.method9420(local26, !arg2);
		}
		if (!arg2) {
			Static672.method9294(arg0);
		}
		if (!arg2 && Static358.anInt6145 != -1) {
			Static323.method5078(Static358.anInt6145, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)Z")
	public static boolean method5887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!md;[BIZ)Lclient!cr;")
	public static Class66 method5888(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(19) long local19 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local19, arg1);
		OpenGL.glCompileShaderARB(local19);
		OpenGL.glGetObjectParameterivARB(local19, 35713, Static136.anIntArray138, 0);
		if (Static136.anIntArray138[0] == 0) {
			if (Static136.anIntArray138[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local19, 35716, Static136.anIntArray138, 1);
			if (Static136.anIntArray138[1] > 1) {
				@Pc(75) byte[] local75 = new byte[Static136.anIntArray138[1]];
				OpenGL.glGetInfoLogARB(local19, Static136.anIntArray138[1], Static136.anIntArray138, 0, local75, 0);
				System.out.println(new String(local75));
			}
			if (Static136.anIntArray138[0] == 0) {
				OpenGL.glDeleteObjectARB(local19);
				return null;
			}
		}
		return new Class66(arg0, local19, arg2);
	}
}
