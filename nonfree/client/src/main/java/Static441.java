import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "Lclient!f;")
	public static Class88 aClass88_29;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([BIILclient!ad;)Lclient!sk;")
	public static Class304 method6507(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7_Sub1_Sub1 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static446.anIntArray494, 0);
		if (Static446.anIntArray494[0] == 0) {
			if (Static446.anIntArray494[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static446.anIntArray494, 1);
			if (Static446.anIntArray494[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static446.anIntArray494[1]];
				OpenGL.glGetInfoLogARB(local6, Static446.anIntArray494[1], Static446.anIntArray494, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static446.anIntArray494[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class304(arg2, local6, arg1);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public static void method6509() {
		Static455.method6675();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLjava/lang/String;ILclient!wv;)Lclient!tj;")
	public static Class316 method6510(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class366 arg2) {
		if (arg1 == 0) {
			return arg2.method8274(arg0);
		}
		@Pc(42) Class316 local42;
		if (arg1 == 1) {
			try {
				Static597.method1280(Static589.anApplet2, new Object[] { (new URL(Static589.anApplet2.getCodeBase(), arg0)).toString() }, "openjs");
				local42 = new Class316();
				local42.anInt9478 = 1;
				return local42;
			} catch (@Pc(48) Throwable local48) {
				local42 = new Class316();
				local42.anInt9478 = 2;
				return local42;
			}
		} else if (arg1 == 2) {
			try {
				Static589.anApplet2.getAppletContext().showDocument(new URL(Static589.anApplet2.getCodeBase(), arg0), "_blank");
				local42 = new Class316();
				local42.anInt9478 = 1;
				return local42;
			} catch (@Pc(80) Exception local80) {
				local42 = new Class316();
				local42.anInt9478 = 2;
				return local42;
			}
		} else if (arg1 == 3) {
			try {
				Static597.method1279(Static589.anApplet2, "loggedout");
			} catch (@Pc(99) Throwable local99) {
			}
			try {
				Static589.anApplet2.getAppletContext().showDocument(new URL(Static589.anApplet2.getCodeBase(), arg0), "_top");
				local42 = new Class316();
				local42.anInt9478 = 1;
				return local42;
			} catch (@Pc(119) Exception local119) {
				local42 = new Class316();
				local42.anInt9478 = 2;
				return local42;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
