import jaggl.OpenGL;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	public static int anInt4233;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_43 = new Class71(65, 1);

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!of;")
	public static final Class236 aClass236_31 = new Class236(128, 4);

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "[I")
	public static final int[] anIntArray235 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method3453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ai;[BI)Lclient!et;")
	public static Class91 method3455(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub1_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local16, arg2);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static118.anIntArray393, 0);
		if (Static118.anIntArray393[0] == 0) {
			if (Static118.anIntArray393[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static118.anIntArray393, 1);
			if (Static118.anIntArray393[1] > 1) {
				@Pc(63) byte[] local63 = new byte[Static118.anIntArray393[1]];
				OpenGL.glGetInfoLogARB(local16, Static118.anIntArray393[1], Static118.anIntArray393, 0, local63, 0);
				System.out.println(new String(local63));
			}
			if (Static118.anIntArray393[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class91(arg1, local16, arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
	public static boolean method3456() {
		try {
			return Static629.method8470();
		} catch (@Pc(14) IOException local14) {
			Static428.method6640();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(79) String local79 = "T2 - " + (Static71.aClass71_22 == null ? -1 : Static71.aClass71_22.method2221()) + "," + (Static415.aClass71_103 == null ? -1 : Static415.aClass71_103.method2221()) + "," + (Static239.aClass71_61 == null ? -1 : Static239.aClass71_61.method2221()) + " - " + Static635.anInt10565 + "," + (Static628.anInt10493 + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0]) + "," + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] + Static594.anInt10160) + " - ";
			for (@Pc(81) int local81 = 0; local81 < Static635.anInt10565 && local81 < 50; local81++) {
				local79 = local79 + Static442.aClass8_Sub8_Sub2_2.aByteArray107[local81] + ",";
			}
			Static596.method8231(local79, local21);
			Static232.method4294(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3457(@OriginalArg(1) String arg0) {
		if (!Static440.aClass118_3.aBoolean302) {
			return -1;
		} else if (Static505.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static462.method6957(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static132.aString38 + local20;
			if (!Static60.aClass237_18.method6295(local33, "")) {
				return -1;
			} else if (Static60.aClass237_18.method6299(local33)) {
				@Pc(61) byte[] local61 = Static60.aClass237_18.method6304(local33, "");
				@Pc(75) File local75;
				try {
					local75 = Static421.method6588(local20);
				} catch (@Pc(77) RuntimeException local77) {
					return -1;
				}
				if (local61 == null || local75 == null) {
					return -1;
				}
				@Pc(85) boolean local85 = true;
				@Pc(89) byte[] local89 = Static272.method4685(local75);
				if (local89 != null && local61.length == local89.length) {
					for (@Pc(106) int local106 = 0; local106 < local89.length; local106++) {
						if (local61[local106] != local89[local106]) {
							local85 = false;
							break;
						}
					}
				} else {
					local85 = false;
				}
				try {
					if (!local85) {
						Static440.aClass118_3.method3394(local75, local61);
					}
				} catch (@Pc(134) Throwable local134) {
					return -1;
				}
				Static267.method4638(arg0, local75);
				return 100;
			} else {
				return Static60.aClass237_18.method6309(local33);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
	public static void method3460() {
		Static527.aClass236_86.method6243(5);
	}
}
