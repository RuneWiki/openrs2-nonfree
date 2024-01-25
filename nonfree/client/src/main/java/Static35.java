import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "[I")
	public static final int[] anIntArray40 = new int[4];

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z")
	public static boolean method1089() {
		return Static519.method7352("jaclib") ? Static519.method7352("hw3d") : false;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "([Lclient!wja;Lclient!oia;I)Lclient!oca;")
	public static Class260 method1093(@OriginalArg(0) Class391[] arg0, @OriginalArg(1) Class16_Sub1_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong305 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg0[local35].aLong305);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static488.anIntArray534, 0);
		if (Static488.anIntArray534[0] == 0) {
			if (Static488.anIntArray534[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static488.anIntArray534, 1);
			if (Static488.anIntArray534[1] > 1) {
				@Pc(94) byte[] local94 = new byte[Static488.anIntArray534[1]];
				OpenGL.glGetInfoLogARB(local33, Static488.anIntArray534[1], Static488.anIntArray534, 0, local94, 0);
				System.out.println(new String(local94));
			}
			if (Static488.anIntArray534[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local33, arg0[local115].aLong305);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class260(arg1, local33, arg0);
	}
}
