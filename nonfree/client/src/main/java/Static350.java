import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "I")
	public static int anInt6285;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public static int anInt6287;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt6290;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "[Lclient!iaa;")
	public static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BIII)I")
	public static int method5214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 4095 - arg2;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5215(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static131.method7332(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z[Lclient!cb;Lclient!lm;)Lclient!dl;")
	public static Class80 method5217(@OriginalArg(1) Class46[] arg0, @OriginalArg(2) Class100_Sub1_Sub2 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] == null || arg0[local12].aLong37 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg0[local42].aLong37);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static433.anIntArray502, 0);
		if (Static433.anIntArray502[0] == 0) {
			if (Static433.anIntArray502[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static433.anIntArray502, 1);
			if (Static433.anIntArray502[1] > 1) {
				@Pc(90) byte[] local90 = new byte[Static433.anIntArray502[1]];
				OpenGL.glGetInfoLogARB(local40, Static433.anIntArray502[1], Static433.anIntArray502, 0, local90, 0);
				System.out.println(new String(local90));
			}
			if (Static433.anIntArray502[0] == 0) {
				for (@Pc(114) int local114 = 0; local114 < arg0.length; local114++) {
					OpenGL.glDetachObjectARB(local40, arg0[local114].aLong37);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class80(arg1, local40, arg0);
	}
}
