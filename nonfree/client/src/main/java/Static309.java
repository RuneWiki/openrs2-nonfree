import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	public static int anInt5223;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public static int anInt5229;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "[Lclient!ul;")
	public static final Class1_Sub1_Sub16[] aClass1_Sub1_Sub16Array7 = new Class1_Sub1_Sub16[14];

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "[I")
	public static final int[] anIntArray397 = new int[200];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(19) int local19 = 0;
		@Pc(24) int local24 = arg1 - arg4;
		@Pc(28) int local28 = arg5 - arg4;
		@Pc(32) int local32 = arg1 * arg1;
		@Pc(36) int local36 = arg5 * arg5;
		@Pc(40) int local40 = local24 * local24;
		@Pc(44) int local44 = local28 * local28;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = local44 << 1;
		@Pc(60) int local60 = local40 << 1;
		@Pc(64) int local64 = arg5 << 1;
		@Pc(68) int local68 = local28 << 1;
		@Pc(77) int local77 = local48 + local32 * (1 - local64);
		@Pc(86) int local86 = local36 - local52 * (local64 - 1);
		@Pc(94) int local94 = local56 + local40 * (1 - local68);
		@Pc(103) int local103 = local44 - (local68 - 1) * local60;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 << 2;
		@Pc(119) int local119 = local44 << 2;
		@Pc(123) int local123 = local48 * 3;
		@Pc(129) int local129 = (local64 - 3) * local52;
		@Pc(133) int local133 = local56 * 3;
		@Pc(139) int local139 = (local68 - 3) * local60;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (arg5 - 1);
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = (local28 - 1) * local115;
		@Pc(173) int local173;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (arg3 >= Static357.anInt6537 && Static85.anInt1517 >= arg3) {
			@Pc(165) int[] local165 = Static283.anIntArrayArray30[arg3];
			local173 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6 - arg1);
			local182 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6 + arg1);
			local191 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6 - local24);
			local199 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6 + local24);
			Static23.method323(local165, local173, arg0, local191);
			Static23.method323(local165, local191, arg2, local199);
			Static23.method323(local165, local199, arg0, local182);
		}
		while (local9 > 0) {
			@Pc(230) boolean local230 = local9 <= local28;
			if (local230) {
				if (local94 < 0) {
					while (local94 < 0) {
						local94 += local133;
						local103 += local149;
						local149 += local119;
						local133 += local119;
						local19++;
					}
				}
				if (local103 < 0) {
					local94 += local133;
					local103 += local149;
					local133 += local119;
					local149 += local119;
					local19++;
				}
				local103 += -local139;
				local94 += -local155;
				local139 -= local115;
				local155 -= local115;
			}
			if (local77 < 0) {
				while (local77 < 0) {
					local77 += local123;
					local86 += local141;
					local7++;
					local141 += local111;
					local123 += local111;
				}
			}
			if (local86 < 0) {
				local86 += local141;
				local77 += local123;
				local7++;
				local123 += local111;
				local141 += local111;
			}
			local77 += -local147;
			local86 += -local129;
			local9--;
			local147 -= local107;
			local129 -= local107;
			local173 = arg3 - local9;
			local182 = local9 + arg3;
			if (local182 >= Static357.anInt6537 && local173 <= Static85.anInt1517) {
				local191 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6 + local7);
				local199 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6 - local7);
				if (local230) {
					@Pc(435) int local435 = Static248.method3569(Static47.anInt762, Static60.anInt1086, local19 + arg6);
					@Pc(444) int local444 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6 - local19);
					@Pc(455) int[] local455;
					if (local173 >= Static357.anInt6537) {
						local455 = Static283.anIntArrayArray30[local173];
						Static23.method323(local455, local199, arg0, local444);
						Static23.method323(local455, local444, arg2, local435);
						Static23.method323(local455, local435, arg0, local191);
					}
					if (Static85.anInt1517 >= local182) {
						local455 = Static283.anIntArrayArray30[local182];
						Static23.method323(local455, local199, arg0, local444);
						Static23.method323(local455, local444, arg2, local435);
						Static23.method323(local455, local435, arg0, local191);
					}
				} else {
					if (local173 >= Static357.anInt6537) {
						Static23.method323(Static283.anIntArrayArray30[local173], local199, arg0, local191);
					}
					if (local182 <= Static85.anInt1517) {
						Static23.method323(Static283.anIntArrayArray30[local182], local199, arg0, local191);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V")
	public static void method4240(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static246.anInt4292 != -1) {
				Static184.method2956(Static246.anInt4292);
			}
			for (@Pc(15) Class1_Sub38 local15 = (Class1_Sub38) Static81.aClass51_5.method928(); local15 != null; local15 = (Class1_Sub38) Static81.aClass51_5.method926()) {
				if (!local15.method5966()) {
					local15 = (Class1_Sub38) Static81.aClass51_5.method928();
					if (local15 == null) {
						break;
					}
				}
				Static284.method3909(true, false, local15);
			}
			Static246.anInt4292 = -1;
			Static81.aClass51_5 = new Class51(8);
			Static373.method5287();
			Static246.anInt4292 = Static159.anInt2864;
			Static159.method2523(false);
			Static197.method3044();
			Static354.method5065(Static246.anInt4292);
		}
		Static173.method2758();
		Static139.anInt2525 = -1;
		Static153.method3789(Static321.anInt5593);
		Static255.aClass47_Sub1_Sub5_Sub2_2 = new Class47_Sub1_Sub5_Sub2();
		Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0] = Static80.anInt6558 / 2;
		Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 = Static80.anInt6558 * 128 / 2;
		Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 = Static104.anInt2048 * 128 / 2;
		Static4.anInt149 = 0;
		Static302.anInt5030 = 0;
		Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0] = Static104.anInt2048 / 2;
		if (Static57.anInt883 == 2) {
			Static302.anInt5030 = Static229.anInt3930 << 7;
			Static4.anInt149 = Static322.anInt4035 << 7;
		} else {
			Static413.method5599();
		}
		Static92.method1453();
		if (Static302.anInt5030 == 0 || Static4.anInt149 == 0) {
			Static169.method2637(10);
		} else {
			Static16.method236();
			Static169.method2637(28);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Lclient!bw;")
	public static Class36_Sub1 method4241(@OriginalArg(1) int arg0) {
		@Pc(7) Class242[] local7 = Class1_Sub2_Sub10.aClass242Array1;
		synchronized (Class1_Sub2_Sub10.aClass242Array1) {
			@Pc(28) Class36_Sub1 local28;
			if (Class1_Sub2_Sub10.aClass242Array1.length <= arg0 || Class1_Sub2_Sub10.aClass242Array1[arg0].method5504()) {
				local28 = new Class36_Sub1();
				local28.aClass36_Sub8Array1 = new Class36_Sub8[arg0];
				for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
					local28.aClass36_Sub8Array1[local34] = new Class36_Sub8();
				}
			} else {
				local28 = (Class36_Sub1) Class1_Sub2_Sub10.aClass242Array1[arg0].method5499();
				local28.method5131();
				@Pc(63) int local63 = Static10.anIntArray553[arg0]--;
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!qg;[Lclient!we;)Lclient!v;")
	public static Class249 method4242(@OriginalArg(1) Class121_Sub2 arg0, @OriginalArg(2) Class259[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong232 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(40) int local40 = 0; local40 < arg1.length; local40++) {
			OpenGL.glAttachObjectARB(local33, arg1[local40].aLong232);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static26.anIntArray28, 0);
		if (Static26.anIntArray28[0] == 0) {
			if (Static26.anIntArray28[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static26.anIntArray28, 1);
			if (Static26.anIntArray28[1] > 1) {
				@Pc(96) byte[] local96 = new byte[Static26.anIntArray28[1]];
				OpenGL.glGetInfoLogARB(local33, Static26.anIntArray28[1], Static26.anIntArray28, 0, local96, 0);
				System.out.println(new String(local96));
			}
			if (Static26.anIntArray28[0] == 0) {
				for (@Pc(120) int local120 = 0; local120 < arg1.length; local120++) {
					OpenGL.glDetachObjectARB(local33, arg1[local120].aLong232);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class249(arg0, local33, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Z")
	public static boolean method4243(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
