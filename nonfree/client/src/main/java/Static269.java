import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
	public static int anInt4735 = 2;

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
	public static int anInt4736 = 0;

	@OriginalMember(owner = "client!kga", name = "x", descriptor = "I")
	public static int anInt4744 = 0;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!pu;I)V")
	public static void method3829(@OriginalArg(0) Class270 arg0) {
		Static570.aClass270_117 = arg0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZC)I")
	public static int method3831(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class358.anIntArray730.length > arg0 ? Class358.anIntArray730[arg0] : -1;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([Lclient!kfa;ILclient!ok;)Lclient!hca;")
	public static Class132 method3841(@OriginalArg(0) Class189[] arg0, @OriginalArg(2) Class134_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong145 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg0[local37].aLong145);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static355.anIntArray487, 0);
		if (Static355.anIntArray487[0] == 0) {
			if (Static355.anIntArray487[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static355.anIntArray487, 1);
			if (Static355.anIntArray487[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static355.anIntArray487[1]];
				OpenGL.glGetInfoLogARB(local35, Static355.anIntArray487[1], Static355.anIntArray487, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static355.anIntArray487[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg0.length; local109++) {
					OpenGL.glDetachObjectARB(local35, arg0[local109].aLong145);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class132(arg1, local35, arg0);
	}
}
