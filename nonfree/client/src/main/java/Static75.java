import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
	public static int anInt1692;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "Lclient!l;")
	public static Class143 aClass143_14;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
	public static int anInt1695;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	public static final int anInt1691 = 1;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "[I")
	public static final int[] anIntArray127 = new int[4096];

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "[I")
	public static final int[] anIntArray128 = new int[200];

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_17 = new Class179(21, 8);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method1501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - arg1;
		if (local12 < -9) {
			return "<col=ff0000>";
		} else if (local12 < -6) {
			return "<col=ff3000>";
		} else if (local12 < -3) {
			return "<col=ff7000>";
		} else if (local12 < 0) {
			return "<col=ffb000>";
		} else if (local12 > 9) {
			return "<col=00ff00>";
		} else if (local12 > 6) {
			return "<col=40ff00>";
		} else if (local12 > 3) {
			return "<col=80ff00>";
		} else if (local12 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBLjava/lang/String;Lclient!kd;)Lclient!rm;")
	public static Class212 method1502(@OriginalArg(2) String arg0, @OriginalArg(3) Class39_Sub2 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static183.anIntArray297, 0);
		if (Static183.anIntArray297[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class212(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
