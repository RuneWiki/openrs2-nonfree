import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
	public static int anInt9927;

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "Lclient!wb;")
	public static Class240 aClass240_32;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
	public static int method8262() {
		return Static155.anInt2639;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILclient!pw;IIII)Z")
	public static boolean method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static649.aBoolean743 || !Static662.aBoolean761) {
			return false;
		} else if (Static309.anInt5508 < 100) {
			return false;
		} else if (arg1 != arg4 || arg3 != arg5) {
			for (@Pc(46) int local46 = arg1; local46 <= arg4; local46++) {
				for (@Pc(50) int local50 = arg5; local50 <= arg3; local50++) {
					if (-Static513.anInt8675 == Static198.anIntArrayArrayArray3[arg0][local46][local50]) {
						return false;
					}
				}
			}
			if (Static351.method5225(arg2)) {
				Static423.anInt7531++;
				return true;
			} else {
				return false;
			}
		} else if (!Static103.method1741(arg0, arg5, arg1)) {
			return false;
		} else if (Static351.method5225(arg2)) {
			Static423.anInt7531++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8265(@OriginalArg(0) String arg0) {
		Static471.aString82 = arg0;
		if (Static285.anApplet5 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static285.anApplet5.getParameter("cookieprefix");
			@Pc(21) String local21 = Static285.anApplet5.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static441.method6588(Static124.method1947() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static680.method2301("document.cookie=\"" + local36 + "\"", Static285.anApplet5);
		} catch (@Pc(83) Throwable local83) {
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([Lclient!lv;Lclient!kv;Z)Lclient!gb;")
	public static Class125 method8266(@OriginalArg(0) Class227[] arg0, @OriginalArg(1) Class143_Sub2 arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] == null || arg0[local5].aLong172 <= 0L) {
				return null;
			}
		}
		@Pc(28) long local28 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(30) int local30 = 0; local30 < arg0.length; local30++) {
			OpenGL.glAttachObjectARB(local28, arg0[local30].aLong172);
		}
		OpenGL.glLinkProgramARB(local28);
		OpenGL.glGetObjectParameterivARB(local28, 35714, Static388.anIntArray380, 0);
		if (Static388.anIntArray380[0] == 0) {
			if (Static388.anIntArray380[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local28, 35716, Static388.anIntArray380, 1);
			if (Static388.anIntArray380[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static388.anIntArray380[1]];
				OpenGL.glGetInfoLogARB(local28, Static388.anIntArray380[1], Static388.anIntArray380, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static388.anIntArray380[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg0.length; local113++) {
					OpenGL.glDetachObjectARB(local28, arg0[local113].aLong172);
				}
				OpenGL.glDeleteObjectARB(local28);
				return null;
			}
		}
		return new Class125(arg1, local28, arg0);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/io/File;BLjava/lang/String;)V")
	public static void method8268(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1) {
		Static621.aHashtable35.put(arg1, arg0);
	}
}
