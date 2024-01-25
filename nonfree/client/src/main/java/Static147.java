import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	public static int anInt3044;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method2693() {
		Static350.anInt5889 = -1;
		Static484.anInt8777 = -1;
		Static426.anInt7851 = 0;
		Static85.anInt2084 = -1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Z")
	public static boolean method2694(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[Lclient!dl;Lclient!ap;)Lclient!lj;")
	public static Class200 method2698(@OriginalArg(1) Class72[] arg0, @OriginalArg(2) Class9_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong51 <= 0L) {
				return null;
			}
		}
		@Pc(41) long local41 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(43) int local43 = 0; local43 < arg0.length; local43++) {
			OpenGL.glAttachObjectARB(local41, arg0[local43].aLong51);
		}
		OpenGL.glLinkProgramARB(local41);
		OpenGL.glGetObjectParameterivARB(local41, 35714, Static165.anIntArray253, 0);
		if (Static165.anIntArray253[0] == 0) {
			if (Static165.anIntArray253[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local41, 35716, Static165.anIntArray253, 1);
			if (Static165.anIntArray253[1] > 1) {
				@Pc(96) byte[] local96 = new byte[Static165.anIntArray253[1]];
				OpenGL.glGetInfoLogARB(local41, Static165.anIntArray253[1], Static165.anIntArray253, 0, local96, 0);
				System.out.println(new String(local96));
			}
			if (Static165.anIntArray253[0] == 0) {
				for (@Pc(120) int local120 = 0; local120 < arg0.length; local120++) {
					OpenGL.glDetachObjectARB(local41, arg0[local120].aLong51);
				}
				OpenGL.glDeleteObjectARB(local41);
				return null;
			}
		}
		return new Class200(arg1, local41, arg0);
	}
}
