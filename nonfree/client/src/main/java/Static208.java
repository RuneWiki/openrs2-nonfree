import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
	public static int anInt3378;

	@OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
	public static int anInt3381;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	public static int anInt3374 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([Lclient!qba;Lclient!pc;B)Lclient!pq;")
	public static Class290 method3117(@OriginalArg(0) Class297[] arg0, @OriginalArg(1) Class33_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong220 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg0[local35].aLong220);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static338.anIntArray411, 0);
		if (Static338.anIntArray411[0] == 0) {
			if (Static338.anIntArray411[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static338.anIntArray411, 1);
			if (Static338.anIntArray411[1] > 1) {
				@Pc(93) byte[] local93 = new byte[Static338.anIntArray411[1]];
				OpenGL.glGetInfoLogARB(local33, Static338.anIntArray411[1], Static338.anIntArray411, 0, local93, 0);
				System.out.println(new String(local93));
			}
			if (Static338.anIntArray411[0] == 0) {
				for (@Pc(117) int local117 = 0; local117 < arg0.length; local117++) {
					OpenGL.glDetachObjectARB(local33, arg0[local117].aLong220);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class290(arg1, local33, arg0);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IB)Z")
	public static boolean method3118(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([SI)[S")
	public static short[] method3119(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static685.method6468(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(IB)Lclient!hu;")
	public static Class157 method3120(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static154.aFloat9 == 3.0D) {
				return Static384.aClass157_7;
			}
			if ((double) Static154.aFloat9 == 4.0D) {
				return Static510.aClass157_8;
			}
			if ((double) Static154.aFloat9 == 6.0D) {
				return Static37.aClass157_1;
			}
			if ((double) Static154.aFloat9 >= 8.0D) {
				return Static299.aClass157_4;
			}
		} else if (arg0 == 1) {
			if ((double) Static154.aFloat9 == 3.0D) {
				return Static37.aClass157_1;
			}
			if ((double) Static154.aFloat9 == 4.0D) {
				return Static299.aClass157_4;
			}
			if ((double) Static154.aFloat9 == 6.0D) {
				return Static355.aClass157_6;
			}
			if ((double) Static154.aFloat9 >= 8.0D) {
				return Static312.aClass157_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static154.aFloat9 == 3.0D) {
				return Static355.aClass157_6;
			}
			if ((double) Static154.aFloat9 == 4.0D) {
				return Static312.aClass157_5;
			}
			if ((double) Static154.aFloat9 == 6.0D) {
				return Static66.aClass157_2;
			}
			if ((double) Static154.aFloat9 >= 8.0D) {
				return Static150.aClass157_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
	public static void method3121() {
		if (Static258.aClass113ArrayArray1 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < Static258.aClass113ArrayArray1.length; local5++) {
			for (@Pc(9) int local9 = 0; local9 < Static258.aClass113ArrayArray1[local5].length; local9++) {
				Static258.aClass113ArrayArray1[local5][local9] = Static521.aClass113_1;
			}
		}
	}
}
