import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_35 = new Class119("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
	public static final int[] anIntArray59 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;Lclient!ur;BI)Lclient!ik;")
	public static Class112 method1082(@OriginalArg(0) String arg0, @OriginalArg(1) Class34_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static3.anIntArray400, 0);
		if (Static3.anIntArray400[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class112(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method1083(@OriginalArg(1) Class1_Sub28_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static409.anInt6725; local7++) {
			@Pc(13) int local13 = Static59.anIntArray54[local7];
			@Pc(17) Class25_Sub5_Sub1_Sub2 local17 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = arg0.method5337();
			if ((local21 & 0x40) != 0) {
				local21 += arg0.method5337() << 8;
			}
			if ((local21 & 0x200) != 0) {
				local21 += arg0.method5337() << 16;
			}
			Static289.method3962(local13, arg0, local17, local21);
		}
	}
}
