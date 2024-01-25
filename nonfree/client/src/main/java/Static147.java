import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "J")
	public static long aLong71 = 0L;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "[I")
	public static final int[] anIntArray135 = new int[14];

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public static int anInt2372 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lclient!hu;ZLclient!rda;)Lclient!bga;")
	public static Class39 method2068(@OriginalArg(0) Class166[] arg0, @OriginalArg(2) Class57_Sub3_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong119 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg0[local37].aLong119);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static111.anIntArray101, 0);
		if (false) {
			anInt2372 = -7;
		}
		if (Static111.anIntArray101[0] == 0) {
			if (Static111.anIntArray101[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static111.anIntArray101, 1);
			if (Static111.anIntArray101[1] > 1) {
				@Pc(112) byte[] local112 = new byte[Static111.anIntArray101[1]];
				OpenGL.glGetInfoLogARB(local35, Static111.anIntArray101[1], Static111.anIntArray101, 0, local112, 0);
				System.out.println(new String(local112));
			}
			if (Static111.anIntArray101[0] == 0) {
				for (@Pc(133) int local133 = 0; local133 < arg0.length; local133++) {
					OpenGL.glDetachObjectARB(local35, arg0[local133].aLong119);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class39(arg1, local35, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBIIII)V")
	public static void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= Static642.anInt10429 && Static456.anInt7806 >= arg1 && Static456.anInt7815 <= arg5 && arg0 <= Static604.anInt10083) {
			if (arg3 == 1) {
				Static472.method6890(arg1, arg5, arg2, arg4, arg0);
			} else {
				Static7.method94(arg4, arg5, arg1, arg3, arg0, arg2);
			}
		} else if (arg3 == 1) {
			Static594.method8605(arg1, arg5, arg0, arg2, arg4);
		} else {
			Static368.method5417(arg0, arg5, arg4, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public static void method2070() {
		Static170.anInt2914 = 0;
		Static669.anInt10711 = -1;
		Static94.anInt1545 = -1;
		Static86.anInt1451 = -1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2072(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static223.method3181(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZIZ)V")
	public static void method2073(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static342.anInt6070--;
			if (Static342.anInt6070 == 0) {
				Static560.anIntArray534 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static486.anInt8161--;
		if (Static486.anInt8161 == 0) {
			Static351.anIntArray337 = null;
			return;
		}
	}
}
