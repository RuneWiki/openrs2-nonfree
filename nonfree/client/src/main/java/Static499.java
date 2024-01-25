import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public static int anInt8156;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!aj;")
	public static Class15 aClass15_126;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Z")
	public static boolean aBoolean621 = true;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIZZ)V")
	public static void method7144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 0) {
			Static460.method6706(false);
		} else {
			Static666.anInt10611 = Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970();
			Static382.method5480(true, 0);
		}
		Static68.anInt1314 = arg2;
		Static469.aBoolean573 = arg3;
		Static322.anInt5377 = arg1;
		Static317.method4949(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B[BILclient!pa;)Lclient!ru;")
	public static Class310 method7145(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class13_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static439.anIntArray627, 0);
		if (Static439.anIntArray627[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class310(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
