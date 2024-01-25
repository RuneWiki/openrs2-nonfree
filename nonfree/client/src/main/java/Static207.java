import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "Lclient!cb;")
	public static Class50 aClass50_54;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
	public static int anInt3300 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
	public static int method2880() {
		@Pc(18) byte local18;
		if (Static126.anInt2180 < 96) {
			Static46.method621();
			local18 = 1;
		} else {
			@Pc(22) int local22 = Static79.method1209();
			if (local22 <= 100) {
				local18 = 4;
				Static544.method7520();
			} else if (local22 <= 500) {
				Static325.method5073();
				local18 = 3;
			} else if (local22 > 1000) {
				local18 = 1;
				Static46.method621();
			} else {
				Static204.method2850();
				local18 = 2;
			}
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 0) {
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 0);
			Static75.method1101(false, 0);
		}
		Static185.method2703();
		return local18;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!iw;IBLclient!ts;)V")
	public static void method2882(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class41_Sub1_Sub1_Sub3_Sub2 arg3) {
		@Pc(5) byte local5 = -1;
		if ((arg0 & 0x1000) != 0) {
			arg3.anInt9468 = arg1.method3659();
			arg3.anInt9505 = arg1.method3677();
			arg3.anInt9490 = arg1.method3659();
			arg3.anInt9489 = arg1.method3677();
			arg3.anInt9491 = arg1.method3637() + Static421.anInt7434;
			arg3.anInt9455 = arg1.method3637() + Static421.anInt7434;
			arg3.anInt9515 = arg1.method3667();
			arg3.anInt9525 = 0;
			if (arg3.aBoolean695) {
				arg3.anInt9490 += arg3.anInt9549;
				arg3.anInt9468 += arg3.anInt9549;
				arg3.anInt9505 += arg3.anInt9539;
				arg3.anInt9526 = 0;
				arg3.anInt9489 += arg3.anInt9539;
			} else {
				arg3.anInt9526 = 1;
				arg3.anInt9505 += arg3.anIntArray527[0];
				arg3.anInt9489 += arg3.anIntArray527[0];
				arg3.anInt9490 += arg3.anIntArray528[0];
				arg3.anInt9468 += arg3.anIntArray528[0];
			}
		}
		@Pc(135) int local135;
		@Pc(139) int local139;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(158) int local158;
		if ((arg0 & 0x10) != 0) {
			local135 = arg1.method3662();
			local139 = arg1.method3693();
			if (local135 == 65535) {
				local135 = -1;
			}
			local148 = arg1.method3646();
			local152 = local148 & 0x7;
			local158 = local148 >> 3 & 0xF;
			if (local158 == 15) {
				local158 = -1;
			}
			arg3.method7930(0, local158, local135, local139, local152);
		}
		if ((arg0 & 0x4000) != 0) {
			arg3.aBoolean698 = arg1.method3667() == 1;
		}
		if ((arg0 & 0x8) != 0) {
			local135 = arg1.method3683();
			if (local135 == 65535) {
				local135 = -1;
			}
			arg3.anInt9452 = local135;
		}
		if ((arg0 & 0x400) != 0) {
			local5 = arg1.method3659();
		}
		if ((arg0 & 0x8000) != 0) {
			local135 = arg1.method3637();
			arg3.anInt9493 = arg1.method3646();
			arg3.anInt9497 = arg1.method3646();
			arg3.aBoolean691 = (local135 & 0x8000) != 0;
			arg3.anInt9510 = local135 & 0x7FFF;
			arg3.anInt9458 = arg3.anInt9493 + arg3.anInt9510 + Static421.anInt7434;
		}
		if ((arg0 & 0x2) != 0) {
			local135 = arg1.method3655();
			@Pc(271) byte[] local271 = new byte[local135];
			@Pc(276) Class5_Sub15 local276 = new Class5_Sub15(local271);
			arg1.method3650(0, local135, local271);
			Static628.aClass5_Sub15Array1[arg2] = local276;
			arg3.method7944(local276);
		}
		if ((arg0 & 0x4) != 0) {
			Static209.aByteArray29[arg2] = arg1.method3682();
		}
		if ((arg0 & 0x2000) != 0) {
			arg3.aString99 = arg1.method3661();
			if (arg3.aString99.charAt(0) == '~') {
				arg3.aString99 = arg3.aString99.substring(1);
				Static423.method6423(2, 0, arg3.aString99, arg3.aString101, arg3.method7935(), arg3.method7936());
			} else if (arg3 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1) {
				Static423.method6423(2, 0, arg3.aString99, arg3.aString101, arg3.method7935(), arg3.method7936());
			}
			arg3.anInt9486 = 0;
			arg3.anInt9467 = 150;
			arg3.anInt9495 = 0;
		}
		if ((arg0 & 0x1) != 0) {
			arg3.anInt9545 = arg1.method3698();
			if (arg3.anInt9526 == 0) {
				arg3.method7915(arg3.anInt9545);
				arg3.anInt9545 = -1;
			}
		}
		if ((arg0 & 0x200) != 0) {
			local135 = arg1.method3637();
			if (local135 == 65535) {
				local135 = -1;
			}
			local139 = arg1.method3693();
			local148 = arg1.method3642();
			local152 = local148 & 0x7;
			local158 = local148 >> 3 & 0xF;
			if (local158 == 15) {
				local158 = -1;
			}
			arg3.method7930(1, local158, local135, local139, local152);
		}
		if ((arg0 & 0x80000) != 0) {
			arg3.aByte132 = arg1.method3677();
			arg3.aByte130 = arg1.method3659();
			arg3.aByte129 = arg1.method3682();
			arg3.aByte128 = (byte) arg1.method3642();
			arg3.anInt9472 = Static421.anInt7434 + arg1.method3698();
			arg3.anInt9478 = Static421.anInt7434 + arg1.method3698();
		}
		@Pc(524) int local524;
		@Pc(500) int[] local500;
		@Pc(503) int[] local503;
		if ((arg0 & 0x10000) != 0) {
			local135 = arg1.method3667();
			local500 = new int[local135];
			local503 = new int[local135];
			for (local152 = 0; local152 < local135; local152++) {
				local158 = arg1.method3683();
				if ((local158 & 0xC000) == 49152) {
					local524 = arg1.method3662();
					local500[local152] = local158 << 16 | local524;
				} else {
					local500[local152] = local158;
				}
				local503[local152] = arg1.method3698();
			}
			arg3.method7927(local500, local503);
		}
		if ((arg0 & 0x20000) != 0) {
			local135 = arg1.method3683();
			if (local135 == 65535) {
				local135 = -1;
			}
			local139 = arg1.method3673();
			local148 = arg1.method3642();
			local152 = local148 & 0x7;
			local158 = local148 >> 3 & 0xF;
			if (local158 == 15) {
				local158 = -1;
			}
			arg3.method7930(2, local158, local135, local139, local152);
		}
		if ((arg0 & 0x40) != 0) {
			@Pc(607) int[] local607 = new int[4];
			for (local139 = 0; local139 < 4; local139++) {
				local607[local139] = arg1.method3683();
				if (local607[local139] == 65535) {
					local607[local139] = -1;
				}
			}
			local148 = arg1.method3655();
			Static23.method335(local607, local148, arg3);
		}
		if ((arg0 & 0x80) != 0) {
			local135 = arg1.method3655();
			if (local135 > 0) {
				for (local139 = 0; local139 < local135; local139++) {
					local152 = -1;
					local158 = -1;
					local148 = arg1.method3690();
					local524 = -1;
					if (local148 == 32767) {
						local148 = arg1.method3690();
						local158 = arg1.method3690();
						local152 = arg1.method3690();
						local524 = arg1.method3690();
					} else if (local148 == 32766) {
						local148 = -1;
					} else {
						local158 = arg1.method3690();
					}
					@Pc(706) int local706 = arg1.method3690();
					@Pc(710) int local710 = arg1.method3667();
					arg3.method7916(local158, local706, local524, local710, local152, local148, Static421.anInt7434);
				}
			}
		}
		if ((arg0 & 0x800) != 0) {
			local135 = arg1.method3646();
			local500 = new int[local135];
			local503 = new int[local135];
			@Pc(745) int[] local745 = new int[local135];
			for (local158 = 0; local158 < local135; local158++) {
				local524 = arg1.method3662();
				if (local524 == 65535) {
					local524 = -1;
				}
				local500[local158] = local524;
				local503[local158] = arg1.method3646();
				local745[local158] = arg1.method3662();
			}
			Static299.method4073(local503, arg3, local500, local745);
		}
		if ((arg0 & 0x40000) != 0) {
			arg3.aBoolean697 = arg1.method3655() == 1;
		}
		if (!arg3.aBoolean695) {
			return;
		}
		if (local5 == 127) {
			arg3.method7942(arg3.anInt9549, arg3.anInt9539);
			return;
		}
		@Pc(822) byte local822;
		if (local5 == -1) {
			local822 = Static209.aByteArray29[arg2];
		} else {
			local822 = local5;
		}
		Static413.method6083(arg3, local822);
		arg3.method7939(arg3.anInt9539, arg3.anInt9549, local822);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLclient!kia;)V")
	public static void method2883(@OriginalArg(1) Class41_Sub1_Sub1_Sub3_Sub1 arg0) {
		for (@Pc(8) Class5_Sub38 local8 = (Class5_Sub38) Static511.aClass124_97.method2572(); local8 != null; local8 = (Class5_Sub38) Static511.aClass124_97.method2569()) {
			if (arg0 == local8.aClass41_Sub1_Sub1_Sub3_Sub1_2) {
				if (local8.aClass5_Sub14_Sub1_3 != null) {
					Static229.aClass5_Sub14_Sub3_1.method2294(local8.aClass5_Sub14_Sub1_3);
					local8.aClass5_Sub14_Sub1_3 = null;
				}
				local8.method8829();
				return;
			}
		}
	}
}
