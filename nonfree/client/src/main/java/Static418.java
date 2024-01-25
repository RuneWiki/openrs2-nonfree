import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public static int anInt6631;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public static int anInt6636;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!ns;")
	public static final Class175 aClass175_4 = new Class175(2);

	@OriginalMember(owner = "client!v", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;IILclient!vd;)Lclient!ae;")
	public static Class5 method5228(@OriginalArg(0) String arg0, @OriginalArg(3) Class51_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static432.anIntArray611, 0);
		if (Static432.anIntArray611[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class5(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method5230() {
		for (@Pc(3) int local3 = 0; local3 < Static56.anInt943; local3++) {
			@Pc(9) int local9 = Static228.anIntArray347[local3];
			@Pc(13) Class26_Sub2_Sub4_Sub1 local13 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local9];
			if (local13 != null) {
				Static292.method3870(local13, local13.aClass249_1.anInt6507);
			}
		}
	}
}
