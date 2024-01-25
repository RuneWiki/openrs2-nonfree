import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
	public static int anInt9254;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_99 = new Class387(23, 2);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ffa;BILjava/lang/String;)Lclient!wj;")
	public static Class388 method7939(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static213.anIntArray201, 0);
		if (Static213.anIntArray201[0] == 0) {
			if (Static213.anIntArray201[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static213.anIntArray201, 1);
			if (Static213.anIntArray201[1] > 1) {
				@Pc(56) byte[] local56 = new byte[Static213.anIntArray201[1]];
				OpenGL.glGetInfoLogARB(local6, Static213.anIntArray201[1], Static213.anIntArray201, 0, local56, 0);
				System.out.println(new String(local56));
			}
			if (Static213.anIntArray201[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class388(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!cn;)V")
	public static void method7940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class73 arg2) {
		if (arg2.aByte24 == 0) {
			arg2.anInt1375 = arg2.anInt1400;
		} else if (arg2.aByte24 == 1) {
			arg2.anInt1375 = arg2.anInt1400 + (arg1 - arg2.anInt1394) / 2;
		} else if (arg2.aByte24 == 2) {
			arg2.anInt1375 = arg1 - arg2.anInt1400 - arg2.anInt1394;
		} else if (arg2.aByte24 == 3) {
			arg2.anInt1375 = arg2.anInt1400 * arg1 >> 14;
		} else if (arg2.aByte24 == 4) {
			arg2.anInt1375 = (arg1 * arg2.anInt1400 >> 14) + (arg1 - arg2.anInt1394) / 2;
		} else {
			arg2.anInt1375 = arg1 - arg2.anInt1394 - (arg1 * arg2.anInt1400 >> 14);
		}
		if (arg2.aByte26 == 0) {
			arg2.anInt1378 = arg2.anInt1377;
		} else if (arg2.aByte26 == 1) {
			arg2.anInt1378 = (arg0 - arg2.anInt1384) / 2 + arg2.anInt1377;
		} else if (arg2.aByte26 == 2) {
			arg2.anInt1378 = arg0 - arg2.anInt1377 - arg2.anInt1384;
		} else if (arg2.aByte26 == 3) {
			arg2.anInt1378 = arg2.anInt1377 * arg0 >> 14;
		} else if (arg2.aByte26 == 4) {
			arg2.anInt1378 = (arg2.anInt1377 * arg0 >> 14) + (arg0 - arg2.anInt1384) / 2;
		} else {
			arg2.anInt1378 = arg0 - arg2.anInt1384 - (arg2.anInt1377 * arg0 >> 14);
		}
		if (!Static206.aBoolean269) {
			return;
		}
		if (Static81.method1252(arg2).anInt8267 == 0 && arg2.anInt1391 != 0) {
			return;
		}
		if (arg2.anInt1378 < 0) {
			arg2.anInt1378 = 0;
		} else if (arg2.anInt1378 + arg2.anInt1384 > arg0) {
			arg2.anInt1378 = arg0 - arg2.anInt1384;
		}
		if (arg2.anInt1375 < 0) {
			arg2.anInt1375 = 0;
			return;
		}
		if (arg1 < arg2.anInt1375 + arg2.anInt1394) {
			arg2.anInt1375 = arg1 - arg2.anInt1394;
			return;
		}
	}
}
