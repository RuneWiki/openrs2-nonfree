import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bea", name = "P", descriptor = "Lclient!qg;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!bea", name = "W", descriptor = "Lclient!m;")
	public static Class118 aClass118_3;

	@OriginalMember(owner = "client!bea", name = "Q", descriptor = "I")
	public static final int anInt823 = 328;

	@OriginalMember(owner = "client!bea", name = "S", descriptor = "Lclient!im;")
	public static final Class140 aClass140_16 = new Class140(108, 3);

	@OriginalMember(owner = "client!bea", name = "V", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!uq;I[Lclient!op;)Lclient!qca;")
	public static Class243 method843(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(2) Class221[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong275 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg1.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg1[local42].aLong275);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static302.anIntArray555, 0);
		if (Static302.anIntArray555[0] == 0) {
			if (Static302.anIntArray555[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static302.anIntArray555, 1);
			if (Static302.anIntArray555[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static302.anIntArray555[1]];
				OpenGL.glGetInfoLogARB(local40, Static302.anIntArray555[1], Static302.anIntArray555, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static302.anIntArray555[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg1.length; local112++) {
					OpenGL.glDetachObjectARB(local40, arg1[local112].aLong275);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class243(arg0, local40, arg1);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLclient!kr;)V")
	public static void method844(@OriginalArg(1) Class171 arg0) {
		Static156.anInt2895 = arg0.method4338("titlebg");
		Static320.anInt5858 = arg0.method4338("logo");
	}
}
