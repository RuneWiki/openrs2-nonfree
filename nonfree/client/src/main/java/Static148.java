import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	public static int anInt2666;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public static int anInt2668 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method2143(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static241.aBoolean250) {
			try {
				@Pc(28) Class19 local28 = (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
				local28.method455(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static241.aBoolean250 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lclient!ds;BLclient!tt;)Lclient!br;")
	public static Class26 method2145(@OriginalArg(0) Class54[] arg0, @OriginalArg(2) Class200_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong53 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			OpenGL.glAttachObjectARB(local35, arg0[local42].aLong53);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static154.anIntArray457, 0);
		if (Static154.anIntArray457[0] == 0) {
			if (Static154.anIntArray457[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static154.anIntArray457, 1);
			if (Static154.anIntArray457[1] > 1) {
				@Pc(97) byte[] local97 = new byte[Static154.anIntArray457[1]];
				OpenGL.glGetInfoLogARB(local35, Static154.anIntArray457[1], Static154.anIntArray457, 0, local97, 0);
				System.out.println(new String(local97));
			}
			if (Static154.anIntArray457[0] == 0) {
				for (@Pc(118) int local118 = 0; local118 < arg0.length; local118++) {
					OpenGL.glDetachObjectARB(local35, arg0[local118].aLong53);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class26(arg1, local35, arg0);
	}
}
