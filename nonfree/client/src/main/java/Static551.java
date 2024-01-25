import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	public static int anInt8933 = -1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!hk;[Lclient!hv;B)Lclient!ag;")
	public static Class12 method7571(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class166[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong115 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg1.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg1[local35].aLong115);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static154.anIntArray192, 0);
		if (Static154.anIntArray192[0] == 0) {
			if (Static154.anIntArray192[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static154.anIntArray192, 1);
			if (Static154.anIntArray192[1] > 1) {
				@Pc(98) byte[] local98 = new byte[Static154.anIntArray192[1]];
				OpenGL.glGetInfoLogARB(local33, Static154.anIntArray192[1], Static154.anIntArray192, 0, local98, 0);
				System.out.println(new String(local98));
			}
			if (Static154.anIntArray192[0] == 0) {
				for (@Pc(119) int local119 = 0; local119 < arg1.length; local119++) {
					OpenGL.glDetachObjectARB(local33, arg1[local119].aLong115);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class12(arg0, local33, arg1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public static void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class247 local28 = Static332.aClass247ArrayArrayArray1[local9][arg0][arg1] = Static332.aClass247ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class85 local33 = local28.aClass85_3; local33 != null; local33 = local33.aClass85_1) {
					@Pc(37) Class23_Sub2_Sub1 local37 = local33.aClass23_Sub2_Sub1_1;
					if (local37.aShort123 == arg0 && local37.aShort124 == arg1) {
						local37.aByte142--;
					}
				}
				if (local28.aClass23_Sub2_Sub3_1 != null) {
					local28.aClass23_Sub2_Sub3_1.aByte142--;
				}
				if (local28.aClass23_Sub2_Sub5_1 != null) {
					local28.aClass23_Sub2_Sub5_1.aByte142--;
				}
				if (local28.aClass23_Sub2_Sub5_2 != null) {
					local28.aClass23_Sub2_Sub5_2.aByte142--;
				}
				if (local28.aClass23_Sub2_Sub2_1 != null) {
					local28.aClass23_Sub2_Sub2_1.aByte142--;
				}
				if (local28.aClass23_Sub2_Sub2_2 != null) {
					local28.aClass23_Sub2_Sub2_2.aByte142--;
				}
			}
		}
		if (Static332.aClass247ArrayArrayArray1[0][arg0][arg1] == null) {
			Static332.aClass247ArrayArrayArray1[0][arg0][arg1] = new Class247(0);
			Static332.aClass247ArrayArrayArray1[0][arg0][arg1].aByte94 = 1;
		}
		Static332.aClass247ArrayArrayArray1[0][arg0][arg1].aClass247_1 = local7;
		Static332.aClass247ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Z")
	public static boolean method7573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static463.aBoolean600) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static562.aClass208ArrayArray3[local13] == null || Static562.aClass208ArrayArray3[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class208 local40 = Static562.aClass208ArrayArray3[local13][local17];
		@Pc(51) Class3_Sub6_Sub16 local51;
		if (arg1 == -1 && local40.anInt5643 == 0) {
			for (local51 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local51 != null; local51 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
				if (local51.anInt7069 == 2 || local51.anInt7069 == 1001 || local51.anInt7069 == 8 || local51.anInt7069 == 23 || local51.anInt7069 == 6) {
					for (@Pc(139) Class208 local139 = Static676.method8728(local51.anInt7066); local139 != null; local139 = Static39.method1159(local139)) {
						if (local139.anInt5653 == local40.anInt5653) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local51 != null; local51 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
				if (arg1 == local51.anInt7071 && local40.anInt5653 == local51.anInt7066 && (local51.anInt7069 == 2 || local51.anInt7069 == 1001 || local51.anInt7069 == 8 || local51.anInt7069 == 23 || local51.anInt7069 == 6)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIZII)V")
	public static void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg5 < 1 || arg3 > Static251.anInt4680 - 2 || Static406.anInt6924 - 2 < arg5) {
			return;
		}
		@Pc(29) int local29 = arg4;
		if (arg4 < 3 && Static190.method3051(arg5, arg3)) {
			local29 = arg4 + 1;
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 0 && !Static339.method5151(arg3, arg5, local29, Static407.anInt6944)) {
			return;
		}
		if (Static332.aClass247ArrayArrayArray1 == null) {
			return;
		}
		Static196.aClass67_Sub1_2.method1830(arg2, arg3, arg5, Static27.aClass198Array1[arg4], arg4, Static582.aClass16_12);
		if (arg7 >= 0) {
			@Pc(77) int local77 = Static227.aClass3_Sub15_11.aClass17_Sub23_1.method7173();
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub23_1, 1);
			Static196.aClass67_Sub1_2.method1836(arg1, arg6, local29, arg5, Static582.aClass16_12, arg7, Static27.aClass198Array1[arg4], arg0, arg3, arg4);
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub23_1, local77);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method7575() {
		for (@Pc(10) Class3_Sub6_Sub20 local10 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local10 != null; local10 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
			if (local10.anInt9677 > 1) {
				local10.anInt9677 = 0;
				Static438.aClass279_42.method6635(local10, ((Class3_Sub6_Sub16) local10.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67).aLong203);
				local10.aClass258_13.method5933();
			}
		}
		Static37.anInt1104 = 0;
		Static661.anInt10221 = 0;
		Static362.aClass193_32.method4458();
		Static654.aClass62_51.method1683();
		Static239.aClass258_3.method5933();
		Static356.method5369(Static482.aClass3_Sub6_Sub16_3);
	}
}
