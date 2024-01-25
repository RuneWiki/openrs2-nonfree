import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
	public static int anInt6974;

	@OriginalMember(owner = "client!pda", name = "o", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "J")
	public static long aLong190;

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
	public static int anInt6982 = 0;

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "[I")
	public static final int[] anIntArray429 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([Lclient!mc;BLclient!vj;)Lclient!di;")
	public static Class70 method5837(@OriginalArg(0) Class203[] arg0, @OriginalArg(2) Class45_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong149 <= 0L) {
				return null;
			}
		}
		@Pc(34) long local34 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			OpenGL.glAttachObjectARB(local34, arg0[local36].aLong149);
		}
		OpenGL.glLinkProgramARB(local34);
		OpenGL.glGetObjectParameterivARB(local34, 35714, Static520.anIntArray644, 0);
		if (Static520.anIntArray644[0] == 0) {
			if (Static520.anIntArray644[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local34, 35716, Static520.anIntArray644, 1);
			if (Static520.anIntArray644[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static520.anIntArray644[1]];
				OpenGL.glGetInfoLogARB(local34, Static520.anIntArray644[1], Static520.anIntArray644, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static520.anIntArray644[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg0.length; local109++) {
					OpenGL.glDetachObjectARB(local34, arg0[local109].aLong149);
				}
				OpenGL.glDeleteObjectARB(local34);
				return null;
			}
		}
		return new Class70(arg1, local34, arg0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!tf;III)Lclient!ho;")
	public static Class134 method5839(@OriginalArg(0) Class322 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method6802(arg1, 0);
		return local14 == null ? null : new Class134(local14);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5840(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static540.method7199("\n", "%0a", arg0));
	}
}
