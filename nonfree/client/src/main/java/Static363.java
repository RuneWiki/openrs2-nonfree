import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!ns", name = "G", descriptor = "Lclient!ga;")
	public static Class111 aClass111_111;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!mo;")
	public static final Class218 aClass218_9 = new Class218("WTWIP", 3);

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "Lclient!wv;")
	public static Class365 aClass365_14 = null;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	public static int method6678(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)V")
	public static void method6685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static479.aClass1_Sub7_Sub1_1.anInt3103 * arg2 >> 8;
		if (arg1 == -1 && !Static571.aBoolean680) {
			Static261.method4078();
		} else if (arg1 != -1 && (arg1 != Static525.anInt8671 || !Static420.method6363()) && local10 != 0 && !Static571.aBoolean680) {
			Static355.method5196(arg1, Static153.aClass111_34, arg0, local10);
		}
		Static525.anInt8671 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[BILclient!qi;)Lclient!qaa;")
	public static Class264 method6689(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class12_Sub2_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static256.anIntArray289, 0);
		if (Static256.anIntArray289[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class264(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
