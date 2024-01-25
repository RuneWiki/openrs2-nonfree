import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public static int anInt8897;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "F")
	public static float aFloat217;

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
	public static int anInt8900;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_147 = new Class274(62, 10);

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	public static final int anInt8899 = Static420.method6395(1600);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method7446(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static111.method4502(-1, arg1, arg0, -1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method7448(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILclient!oea;Ljava/lang/String;)Lclient!gn;")
	public static Class134 method7450(@OriginalArg(0) int arg0, @OriginalArg(2) Class87_Sub2 arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static179.anIntArray276, 0);
		if (Static179.anIntArray276[0] == 0) {
			if (Static179.anIntArray276[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static179.anIntArray276, 1);
			if (Static179.anIntArray276[1] > 1) {
				@Pc(48) byte[] local48 = new byte[Static179.anIntArray276[1]];
				OpenGL.glGetInfoLogARB(local6, Static179.anIntArray276[1], Static179.anIntArray276, 0, local48, 0);
				System.out.println(new String(local48));
			}
			if (Static179.anIntArray276[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class134(arg1, local6, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
	public static void method7451() {
		Static29.aClass77_1.method1682();
		Static3.aClass14_1.method291();
		Static489.aClass344_1.method8017();
		Static619.aClass281_4.method6732();
		Static341.aClass76_1.method1671();
		Static570.aClass267_2.method6604();
		Static185.aClass303_1.method7205();
		Static414.aClass356_2.method8211();
		Static23.aClass296_1.method7028();
		Static18.aClass244_1.method6263();
		Static182.aClass140_1.method3447();
		Static509.aClass139_3.method3434();
		Static259.aClass248_2.method6346();
		Static290.aClass119_1.method3059();
		Static584.aClass206_2.method4912();
		Static571.aClass169_1.method4168();
		Static576.aClass343_1.method8009();
		Static375.aClass58_1.method1363();
		Static151.aClass273_1.method6659();
		Static232.aClass92_3.method2506();
		Static441.method6544();
		Static583.method8045();
		Static447.method6627();
		Static410.method6307();
		Static598.method2768();
		Static394.aClass233_32.method5665();
		Static589.aClass233_57.method5665();
		Static616.aClass233_61.method5665();
		Static111.aClass233_28.method5665();
		Static639.aClass233_63.method5665();
	}
}
