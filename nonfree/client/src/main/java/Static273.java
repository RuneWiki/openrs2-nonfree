import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "Lclient!r;")
	public static Class100 aClass100_5;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_89 = new Class286(34, 3);

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_90 = new Class286(47, 3);

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_135 = new Class363(80, 0);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lclient!af;Lclient!qj;I)Lclient!laa;")
	public static Class201 method4135(@OriginalArg(0) Class10[] arg0, @OriginalArg(1) Class100_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong5 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong5);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static166.anIntArray197, 0);
		if (Static166.anIntArray197[0] == 0) {
			if (Static166.anIntArray197[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static166.anIntArray197, 1);
			if (Static166.anIntArray197[1] > 1) {
				@Pc(85) byte[] local85 = new byte[Static166.anIntArray197[1]];
				OpenGL.glGetInfoLogARB(local29, Static166.anIntArray197[1], Static166.anIntArray197, 0, local85, 0);
				System.out.println(new String(local85));
			}
			if (Static166.anIntArray197[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg0.length; local109++) {
					OpenGL.glDetachObjectARB(local29, arg0[local109].aLong5);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class201(arg1, local29, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZBIII)V")
	public static void method4136(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static62.aLong40 = 0L;
		@Pc(10) int local10 = Static212.method3434();
		if (arg3 == 3 || local10 == 3) {
			arg0 = true;
		}
		if (!Static307.aClass100_6.method6254()) {
			arg0 = true;
		}
		Static375.method5569(local10, arg2, arg0, arg1, arg3);
	}
}
