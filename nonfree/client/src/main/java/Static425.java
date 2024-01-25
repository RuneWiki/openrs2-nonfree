import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public static int anInt7483 = 0;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "[I")
	public static int[] anIntArray428 = new int[1];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([Lclient!l;Lclient!ck;I)Lclient!fm;")
	public static Class123 method6297(@OriginalArg(0) Class206[] arg0, @OriginalArg(1) Class65_Sub1 arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] == null || arg0[local5].aLong158 <= 0L) {
				return null;
			}
		}
		@Pc(30) long local30 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
			OpenGL.glAttachObjectARB(local30, arg0[local32].aLong158);
		}
		OpenGL.glLinkProgramARB(local30);
		OpenGL.glGetObjectParameterivARB(local30, 35714, Static121.anIntArray86, 0);
		if (Static121.anIntArray86[0] == 0) {
			if (Static121.anIntArray86[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local30, 35716, Static121.anIntArray86, 1);
			if (Static121.anIntArray86[1] > 1) {
				@Pc(84) byte[] local84 = new byte[Static121.anIntArray86[1]];
				OpenGL.glGetInfoLogARB(local30, Static121.anIntArray86[1], Static121.anIntArray86, 0, local84, 0);
				System.out.println(new String(local84));
			}
			if (Static121.anIntArray86[0] == 0) {
				for (@Pc(108) int local108 = 0; local108 < arg0.length; local108++) {
					OpenGL.glDetachObjectARB(local30, arg0[local108].aLong158);
				}
				OpenGL.glDeleteObjectARB(local30);
				return null;
			}
		}
		return new Class123(arg1, local30, arg0);
	}
}
