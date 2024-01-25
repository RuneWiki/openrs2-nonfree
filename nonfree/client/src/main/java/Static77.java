import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_24 = new Class397(4, -2);

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!gfa;")
	public static final Class135 aClass135_2 = new Class135();

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	public static int anInt1736 = 0;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	public static int anInt1737 = 100;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
	public static int anInt1738 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZI)I")
	public static int method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static477.aClass259Array3 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg1 >> 9;
		@Pc(16) int local16 = arg0 >> 9;
		if (local12 < 0 || local16 < 0 || Static497.anInt7926 - 1 < local12 || Static646.anInt9979 - 1 < local16) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static510.aByteArrayArrayArray11[1][local12][local16] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static477.aClass259Array3[local48].method9294(arg0, arg1);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIIIII)V")
	public static void method1634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static82.anInt1902 <= arg2 && anInt1737 >= arg1 && arg0 >= Static549.anInt5294 && arg3 <= Static334.anInt5381) {
			Static718.method9506(arg0, arg3, arg1, arg4, arg2);
		} else {
			Static10.method358(arg3, arg0, arg1, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;Lclient!aq;II)Lclient!rka;")
	public static Class328 method1637(@OriginalArg(0) String arg0, @OriginalArg(1) Class22_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static689.anIntArray768, 0);
		if (Static689.anIntArray768[0] == 0) {
			if (Static689.anIntArray768[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static689.anIntArray768, 1);
			if (Static689.anIntArray768[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static689.anIntArray768[1]];
				OpenGL.glGetInfoLogARB(local6, Static689.anIntArray768[1], Static689.anIntArray768, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static689.anIntArray768[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class328(arg1, local6, arg2);
	}
}
