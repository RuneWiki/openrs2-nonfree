import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!tha;")
	public static Class132_Sub1 aClass132_Sub1_1;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "[B")
	public static byte[] aByteArray9;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)Z")
	public static boolean method1880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[BLclient!ck;I)Lclient!hg;")
	public static Class129 method1881(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class33_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static338.anIntArray393, 0);
		if (Static338.anIntArray393[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class129(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZ)I")
	public static int method1882(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
