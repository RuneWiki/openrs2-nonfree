import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
	public static int anInt4016 = 0;

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "[S")
	public static final short[] aShortArray59 = new short[] { 48, 17, 5, 30, 12, 60, 9, 21 };

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_65 = new Class268(6, 3);

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[2];

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)[Lclient!oo;")
	public static Class244[] method3516() {
		return new Class244[] { Static245.aClass244_13, Static647.aClass244_21, Static477.aClass244_20, Static39.aClass244_3, Static420.aClass244_17, Static275.aClass244_12, Static245.aClass244_14, Static21.aClass244_2, Static108.aClass244_5, Static237.aClass244_8, Static105.aClass244_4, Static369.aClass244_16, Static1.aClass244_19, Static240.aClass244_9, Static437.aClass244_18 };
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIIIIII)Z")
	public static boolean method3517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 + arg3;
		@Pc(12) int local12 = arg5 + arg1;
		@Pc(16) int local16 = arg0 + arg4;
		if (!Static577.method8180(local7, local16, local12, arg3, arg3, local12, local12, local16, arg0)) {
			return false;
		} else if (Static577.method8180(local7, arg0, local12, arg3, local7, local12, local12, local16, arg0)) {
			if (Static436.anInt7905 > arg3) {
				if (!Static577.method8180(arg3, arg0, local12, arg3, arg3, local12, arg5, local16, local16)) {
					return false;
				}
				if (!Static577.method8180(arg3, arg0, arg5, arg3, arg3, local12, arg5, arg0, local16)) {
					return false;
				}
			} else if (!Static577.method8180(local7, arg0, local12, local7, local7, local12, arg5, local16, local16)) {
				return false;
			} else if (!Static577.method8180(local7, arg0, arg5, local7, local7, local12, arg5, arg0, local16)) {
				return false;
			}
			if (arg0 < Static67.anInt1397) {
				if (!Static577.method8180(local7, arg0, local12, arg3, arg3, local12, arg5, arg0, arg0)) {
					return false;
				}
				if (!Static577.method8180(local7, arg0, arg5, arg3, local7, local12, arg5, arg0, arg0)) {
					return false;
				}
			} else if (!Static577.method8180(local7, local16, local12, arg3, arg3, local12, arg5, local16, local16)) {
				return false;
			} else if (!Static577.method8180(local7, local16, arg5, arg3, local7, local12, arg5, local16, local16)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([Lclient!fk;ILclient!no;)Lclient!tm;")
	public static Class329 method3518(@OriginalArg(0) Class102[] arg0, @OriginalArg(2) Class100_Sub1_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong84 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong84);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static371.anIntArray418, 0);
		if (Static371.anIntArray418[0] == 0) {
			if (Static371.anIntArray418[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static371.anIntArray418, 1);
			if (Static371.anIntArray418[1] > 1) {
				@Pc(83) byte[] local83 = new byte[Static371.anIntArray418[1]];
				OpenGL.glGetInfoLogARB(local29, Static371.anIntArray418[1], Static371.anIntArray418, 0, local83, 0);
				System.out.println(new String(local83));
			}
			if (Static371.anIntArray418[0] == 0) {
				for (@Pc(104) int local104 = 0; local104 < arg0.length; local104++) {
					OpenGL.glDetachObjectARB(local29, arg0[local104].aLong84);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class329(arg1, local29, arg0);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)V")
	public static void method3519(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub2_Sub9 local12 = Static144.method2332(10, arg0);
		local12.method3722();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIIILclient!ha;I)V")
	public static void method3520(@OriginalArg(2) int arg0, @OriginalArg(4) Class100 arg1, @OriginalArg(5) int arg2) {
		Static117.aClass100_5 = arg1;
		Static105.aClass154_1 = Static117.aClass100_5.method8838();
		Static335.aClass154_4 = Static117.aClass100_5.method8838();
		Static503.aClass154_8 = Static117.aClass100_5.method8838();
		Static469.anInt8256 = 0;
		Static446.anIntArray511 = null;
		Static449.anInt8044 = 100;
		Static363.anInterface20Array1 = null;
		Static173.anInt3607 = 100;
		Static563.method8109(arg2, arg0);
		Static419.anInt7662 = -1;
		Static576.anInt4608 = -1;
		Static625.anInt10293 = -1;
	}
}
