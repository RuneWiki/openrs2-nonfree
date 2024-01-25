import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public static int anInt9553;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "[Lclient!oq;")
	public static Class272[] aClass272Array37;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_143 = new Class171(102, 6);

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
	public static void method7797() {
		@Pc(7) int local7 = Static439.anInt7133;
		@Pc(9) int[] local9 = Static294.anIntArray593;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class34_Sub1_Sub1_Sub2_Sub1 local24 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local9[local16]];
			if (local24 != null) {
				Static675.method8999(local24.method7866(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!cc;[[BB)V")
	public static void method7798(@OriginalArg(0) Class49_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(45) int local45;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1366; local14++) {
			Static333.method4737();
			for (local22 = 0; local22 < Static98.anInt361 >> 3; local22++) {
				for (local26 = 0; local26 < Static438.anInt7120 >> 3; local26++) {
					local36 = Static63.anIntArrayArrayArray7[local14][local22][local26];
					if (local36 != -1) {
						local45 = local36 >> 24 & 0x3;
						if (!arg0.aBoolean98 || local45 == 0) {
							@Pc(59) int local59 = local36 >> 1 & 0x3;
							@Pc(65) int local65 = local36 >> 14 & 0x3FF;
							@Pc(71) int local71 = local36 >> 3 & 0x7FF;
							@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
							for (@Pc(83) int local83 = 0; local83 < Static448.anIntArray394.length; local83++) {
								if (local81 == Static448.anIntArray394[local83] && arg1[local83] != null) {
									@Pc(105) Class3_Sub4 local105 = new Class3_Sub4(arg1[local83]);
									arg0.method1212(local22 * 8, local45, local65, Static609.aClass110Array1, local71, local105, local59, local14, local26 * 8);
									arg0.method1228(Static119.aClass95_4, local65, local22 * 8, local14, local71, local26 * 8, local12[0] == -1 ? local12 : null, local59, local45, local105);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local22 = 0; local22 < arg0.anInt1366; local22++) {
			Static333.method4737();
			for (local26 = 0; local26 < Static98.anInt361 >> 3; local26++) {
				for (local36 = 0; local36 < Static438.anInt7120 >> 3; local36++) {
					local45 = Static63.anIntArrayArrayArray7[local22][local26][local36];
					if (local45 == -1) {
						arg0.method1210(local36 * 8, local26 * 8, 8, 8, local22);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static481.aClass118_2 = Static73.aClass64_3.method1503(local12[2], Static300.aClass332_1, local12[0], local12[1], local12[3]);
			Static305.anInt5136 = local12[4];
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([Lclient!mca;Lclient!sha;I)Lclient!jd;")
	public static Class174 method7799(@OriginalArg(0) Class224[] arg0, @OriginalArg(1) Class95_Sub1_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong168 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg0[local37].aLong168);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static240.anIntArray252, 0);
		if (Static240.anIntArray252[0] == 0) {
			if (Static240.anIntArray252[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static240.anIntArray252, 1);
			if (Static240.anIntArray252[1] > 1) {
				@Pc(93) byte[] local93 = new byte[Static240.anIntArray252[1]];
				OpenGL.glGetInfoLogARB(local35, Static240.anIntArray252[1], Static240.anIntArray252, 0, local93, 0);
				System.out.println(new String(local93));
			}
			if (Static240.anIntArray252[0] == 0) {
				for (@Pc(117) int local117 = 0; local117 < arg0.length; local117++) {
					OpenGL.glDetachObjectARB(local35, arg0[local117].aLong168);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class174(arg1, local35, arg0);
	}
}
