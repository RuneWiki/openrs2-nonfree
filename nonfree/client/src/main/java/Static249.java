import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!fk;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!kca;")
	public static final Class187 aClass187_7 = new Class187(1);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_68 = new Class274(8, 10);

	@OriginalMember(owner = "client!it", name = "f", descriptor = "[I")
	public static final int[] anIntArray337 = new int[14];

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBIII)V")
	public static void method4057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static570.anInt9385 && arg3 <= Static177.anInt3963) {
			@Pc(28) int local28 = Static108.method1816(Static252.anInt4988, arg2, Static306.anInt5020);
			@Pc(34) int local34 = Static108.method1816(Static252.anInt4988, arg0, Static306.anInt5020);
			Static236.method3908(local28, arg3, local34, arg1);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)Z")
	public static boolean method4058() {
		Static38.aBoolean67 = true;
		Static43.anInt967++;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([Lclient!ib;Lclient!eea;I)Lclient!pga;")
	public static Class258 method4060(@OriginalArg(0) Class154[] arg0, @OriginalArg(1) Class87_Sub1_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong129 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg0[local37].aLong129);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static550.anIntArray635, 0);
		if (Static550.anIntArray635[0] == 0) {
			if (Static550.anIntArray635[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static550.anIntArray635, 1);
			if (Static550.anIntArray635[1] > 1) {
				@Pc(90) byte[] local90 = new byte[Static550.anIntArray635[1]];
				OpenGL.glGetInfoLogARB(local35, Static550.anIntArray635[1], Static550.anIntArray635, 0, local90, 0);
				System.out.println(new String(local90));
			}
			if (Static550.anIntArray635[0] == 0) {
				for (@Pc(114) int local114 = 0; local114 < arg0.length; local114++) {
					OpenGL.glDetachObjectARB(local35, arg0[local114].aLong129);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class258(arg1, local35, arg0);
	}
}
