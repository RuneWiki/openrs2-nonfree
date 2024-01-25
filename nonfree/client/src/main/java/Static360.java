import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "F")
	public static float aFloat133;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	public static int anInt6361;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!aw;")
	public static final Class23 aClass23_6 = new Class23();

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	public static final int anInt6360 = 1406;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!laa;[BI)Lclient!lf;")
	public static Class206 method5626(@OriginalArg(1) Class126_Sub2_Sub1 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(18) long local18 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local18, arg1);
		OpenGL.glCompileShaderARB(local18);
		OpenGL.glGetObjectParameterivARB(local18, 35713, Static543.anIntArray841, 0);
		if (Static543.anIntArray841[0] == 0) {
			if (Static543.anIntArray841[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local18, 35716, Static543.anIntArray841, 1);
			if (Static543.anIntArray841[1] > 1) {
				@Pc(56) byte[] local56 = new byte[Static543.anIntArray841[1]];
				OpenGL.glGetInfoLogARB(local18, Static543.anIntArray841[1], Static543.anIntArray841, 0, local56, 0);
				System.out.println(new String(local56));
			}
			if (Static543.anIntArray841[0] == 0) {
				OpenGL.glDeleteObjectARB(local18);
				return null;
			}
		}
		return new Class206(arg0, local18, arg2);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIILclient!le;Lclient!qj;IIIIBI)V")
	public static void method5627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class204 arg4, @OriginalArg(5) Class288 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		Static164.anInt5714 = arg8;
		Static456.anInt7732 = arg6;
		Static443.aClass288_12 = arg5;
		Static544.aClass176_2 = null;
		Static599.aClass176_3 = null;
		Static614.anInt10021 = arg0;
		Static474.anInt7947 = arg10;
		Static123.aClass204_2 = arg4;
		Static308.anInt4874 = arg2;
		Static495.anInt4811 = arg7;
		Static128.anInt2082 = arg3;
		Static486.anInt8092 = arg9;
		Static414.anInt7096 = arg1;
		Static517.aClass176_1 = null;
		Static422.method6377();
		Static56.aBoolean65 = true;
	}
}
