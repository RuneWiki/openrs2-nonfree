import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!wm", name = "I", descriptor = "Lclient!qb;")
	public static Class242 aClass242_2;

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
	public static int anInt9100;

	@OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
	public static int anInt9101;

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "Lclient!im;")
	public static final Class140 aClass140_151 = new Class140(23, -1);

	@OriginalMember(owner = "client!wm", name = "T", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_133 = new Class306("M", "M", "M", "M");

	@OriginalMember(owner = "client!wm", name = "V", descriptor = "[I")
	public static final int[] anIntArray838 = new int[6];

	@OriginalMember(owner = "client!wm", name = "X", descriptor = "[I")
	public static final int[] anIntArray839 = new int[1];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Lclient!uq;IZ)Lclient!op;")
	public static Class221 method7473(@OriginalArg(0) String arg0, @OriginalArg(1) Class122_Sub3 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static223.anIntArray437, 0);
		if (Static223.anIntArray437[0] == 0) {
			if (Static223.anIntArray437[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static223.anIntArray437, 1);
			if (Static223.anIntArray437[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static223.anIntArray437[1]];
				OpenGL.glGetInfoLogARB(local6, Static223.anIntArray437[1], Static223.anIntArray437, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static223.anIntArray437[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class221(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z")
	public static boolean method7475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
	public static int method7476(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILjava/lang/String;)V")
	public static void method7477(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static142.method2303(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static40.anInt856; local33++) {
			@Pc(39) String local39 = Static354.aStringArray32[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static142.method2303(local39);
			if (local39 != null && local39.equals(local20)) {
				Static40.anInt856--;
				for (@Pc(63) int local63 = local33; local63 < Static40.anInt856; local63++) {
					Static354.aStringArray32[local63] = Static354.aStringArray32[local63 + 1];
					Static170.aStringArray15[local63] = Static170.aStringArray15[local63 + 1];
					Static17.aStringArray1[local63] = Static17.aStringArray1[local63 + 1];
					Static89.aStringArray8[local63] = Static89.aStringArray8[local63 + 1];
					Static175.aBooleanArray19[local63] = Static175.aBooleanArray19[local63 + 1];
				}
				Static223.anInt4462 = Static164.anInt2967;
				Static144.method2331(Static495.aClass296_387);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(arg0));
				Static455.aClass1_Sub6_Sub2_2.method3917(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)I")
	public static int method7478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static329.anIntArray600[arg0 & 0x3] : Static88.anIntArray185[arg0 & 0x3];
	}
}
