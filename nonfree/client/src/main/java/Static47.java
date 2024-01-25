import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
	public static int[] anIntArray69;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BILclient!nv;I)Lclient!aja;")
	public static Class15 method831(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class33_Sub2_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static432.anIntArray469, 0);
		if (Static432.anIntArray469[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class15(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)V")
	public static void method832() {
		Static44.aClass352_3.method7663(50);
		Static499.aClass352_55.method7663(50);
		Class3_Sub1_Sub2_Sub4.lb.method7663(50);
		Static356.aClass352_46.method7663(50);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)Z")
	public static boolean method833() {
		return Static574.anInt8895 > 0;
	}
}
