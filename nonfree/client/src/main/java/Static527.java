import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)V")
	public static void method7354(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) Class4_Sub51 local12 = (Class4_Sub51) Static217.aClass124_22.method3267(); local12 != null; local12 = (Class4_Sub51) Static217.aClass124_22.method3273()) {
			if (local12.aClass4_Sub13_Sub2_3 != null) {
				Static430.aClass4_Sub13_Sub1_1.method2274(local12.aClass4_Sub13_Sub2_3);
				local12.aClass4_Sub13_Sub2_3 = null;
			}
			if (local12.aClass4_Sub13_Sub2_4 != null) {
				Static430.aClass4_Sub13_Sub1_1.method2274(local12.aClass4_Sub13_Sub2_4);
				local12.aClass4_Sub13_Sub2_4 = null;
			}
			local12.method8013();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(58) Class4_Sub51 local58 = (Class4_Sub51) Static162.aClass124_19.method3267(); local58 != null; local58 = (Class4_Sub51) Static162.aClass124_19.method3273()) {
			if (local58.aClass4_Sub13_Sub2_3 != null) {
				Static430.aClass4_Sub13_Sub1_1.method2274(local58.aClass4_Sub13_Sub2_3);
				local58.aClass4_Sub13_Sub2_3 = null;
			}
			local58.method8013();
		}
		for (@Pc(85) Class4_Sub51 local85 = (Class4_Sub51) Static518.aClass183_37.method4286(); local85 != null; local85 = (Class4_Sub51) Static518.aClass183_37.method4283()) {
			if (local85.aClass4_Sub13_Sub2_3 != null) {
				Static430.aClass4_Sub13_Sub1_1.method2274(local85.aClass4_Sub13_Sub2_3);
				local85.aClass4_Sub13_Sub2_3 = null;
			}
			local85.method8013();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)Z")
	public static boolean method7355() {
		if (Static529.aBoolean627) {
			try {
				if ((Boolean) Static611.method6758("showingVideoAd", Static55.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(25) Throwable local25) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!no;Ljava/lang/String;II)Lclient!te;")
	public static Class312 method7358(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static370.anIntArray534, 0);
		if (Static370.anIntArray534[0] == 0) {
			if (Static370.anIntArray534[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static370.anIntArray534, 1);
			if (Static370.anIntArray534[1] > 1) {
				@Pc(48) byte[] local48 = new byte[Static370.anIntArray534[1]];
				OpenGL.glGetInfoLogARB(local6, Static370.anIntArray534[1], Static370.anIntArray534, 0, local48, 0);
				System.out.println(new String(local48));
			}
			if (Static370.anIntArray534[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class312(arg0, local6, arg2);
	}
}
