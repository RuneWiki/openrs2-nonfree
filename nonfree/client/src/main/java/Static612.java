import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public static int anInt10212;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_159 = new Class337(30, 6);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Lclient!le;")
	public static Class208 method8700() {
		try {
			return (Class208) Class.forName("Class208_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)I")
	public static int method8701(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!om;I[BB)Lclient!kea;")
	public static Class193 method8704(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local16, arg2);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static116.anIntArray287, 0);
		if (Static116.anIntArray287[0] == 0) {
			if (Static116.anIntArray287[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static116.anIntArray287, 1);
			if (Static116.anIntArray287[1] > 1) {
				@Pc(60) byte[] local60 = new byte[Static116.anIntArray287[1]];
				OpenGL.glGetInfoLogARB(local16, Static116.anIntArray287[1], Static116.anIntArray287, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (Static116.anIntArray287[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class193(arg0, local16, arg1);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!rf;)V")
	public static void method8707(@OriginalArg(1) Class4_Sub10 arg0) {
		arg0.aClass4_Sub2_Sub1_Sub1_1 = null;
		if (Static523.anInt9001 < 20) {
			Static8.aClass99_7.method2039(arg0);
			Static523.anInt9001++;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;")
	public static String method8708(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg1.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local24++;
				local13 += local17;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local13);
		@Pc(45) int local45 = 0;
		while (true) {
			@Pc(50) int local50 = arg1.indexOf(13, local45);
			if (local50 < 0) {
				local43.append(arg1.substring(local45));
				return local43.toString();
			}
			local43.append(arg1.substring(local45, local50));
			local45 = local50 + 1;
			local43.append(arg0);
		}
	}
}
