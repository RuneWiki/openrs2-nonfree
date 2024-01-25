import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tba", name = "W", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!tba", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray67 = new String[8];

	@OriginalMember(owner = "client!tba", name = "R", descriptor = "Lclient!eu;")
	public static final Class114 aClass114_18 = new Class114(2);

	@OriginalMember(owner = "client!tba", name = "G", descriptor = "I")
	public static int anInt9473 = 0;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIIILclient!cca;I)Z")
	public static boolean method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) int arg5) {
		if (!Static570.aBoolean734 || !Static119.aBoolean171) {
			return false;
		} else if (Static224.anInt3656 < 100) {
			return false;
		} else if (arg1 != arg5 || arg2 != arg3) {
			for (@Pc(66) int local66 = arg1; local66 <= arg5; local66++) {
				for (@Pc(72) int local72 = arg2; local72 <= arg3; local72++) {
					if (-Static674.anInt10789 == Static422.anIntArrayArrayArray17[arg0][local66][local72]) {
						return false;
					}
				}
			}
			if (Static22.method319(arg4)) {
				Static267.anInt4664++;
				return true;
			} else {
				return false;
			}
		} else if (!Static9.method108(arg2, arg0, 123, arg1)) {
			return false;
		} else if (Static22.method319(arg4)) {
			Static267.anInt4664++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BI)V")
	public static void method8117(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 2);
		local9.method2686();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[BLclient!rda;I)Lclient!hu;")
	public static Class166 method8119(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class57_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local16, arg0);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static201.anIntArray192, 0);
		if (Static201.anIntArray192[0] == 0) {
			if (Static201.anIntArray192[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static201.anIntArray192, 1);
			if (Static201.anIntArray192[1] > 1) {
				@Pc(68) byte[] local68 = new byte[Static201.anIntArray192[1]];
				OpenGL.glGetInfoLogARB(local16, Static201.anIntArray192[1], Static201.anIntArray192, 0, local68, 0);
				System.out.println(new String(local68));
			}
			if (Static201.anIntArray192[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class166(arg1, local16, arg2);
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)I")
	public static int method8120() {
		return Static295.anInt5127;
	}
}
