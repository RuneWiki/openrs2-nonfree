import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public static int anInt7031;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public static int anInt7027 = -2;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "[I")
	public static final int[] anIntArray443 = new int[1000];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZB)V")
	public static void method6003(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static475.anInt10143 != -1) {
				Static204.method8295(Static475.anInt10143);
			}
			for (@Pc(18) Class2_Sub48 local18 = (Class2_Sub48) Static372.aClass99_51.method3060(); local18 != null; local18 = (Class2_Sub48) Static372.aClass99_51.method3058()) {
				if (!local18.method9250()) {
					local18 = (Class2_Sub48) Static372.aClass99_51.method3060();
					if (local18 == null) {
						break;
					}
				}
				Static133.method3047(true, false, local18);
			}
			Static475.anInt10143 = -1;
			Static372.aClass99_51 = new Class99(8);
			Static342.method5878();
			Static475.anInt10143 = Static258.anInt5506;
			Static527.method9032(false);
			Static132.method3031();
			Static284.method5151(Static475.anInt10143);
		}
		Static5.aBoolean7 = true;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!at;Lclient!ha;III)V")
	public static void method6004(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class1 local10 = arg0.method611(arg1);
		if (local10 == null) {
			return;
		}
		arg1.KA(arg2, arg3, arg2 + arg0.anInt441, arg0.anInt488 + arg3);
		if (Static566.anInt10156 == 2 || Static566.anInt10156 == 5 || Static354.aClass46_22 == null) {
			arg1.A(-16777216, local10, arg2, arg3);
			return;
		}
		@Pc(64) int local64;
		@Pc(52) int local52;
		@Pc(61) int local61;
		@Pc(49) int local49;
		if (Static496.anInt9165 == 4) {
			local52 = Static176.anInt4216;
			local64 = Static173.anInt4166;
			local49 = 4096;
			local61 = (int) -Static72.aFloat68 & 0x3FFF;
		} else {
			local49 = 4096 - Static183.anInt4411 * 16;
			local52 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310;
			local61 = (int) -Static72.aFloat68 + Static563.anInt10146 & 0x3FFF;
			local64 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303;
		}
		@Pc(92) int local92 = local64 / 128 + 48 + 208 - Static47.anInt1794 * 2;
		@Pc(108) int local108 = Static209.anInt4742 * 4 + 208 + 48 - Static209.anInt4742 * 2 - local52 / 128;
		Static354.aClass46_22.method6206((float) arg0.anInt441 / 2.0F + (float) arg2, (float) arg0.anInt488 / 2.0F + (float) arg3, (float) local92, (float) local108, local49, local61 << 2, local10, arg2, arg3);
		@Pc(161) int local161;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(192) int local192;
		for (@Pc(144) Class2_Sub43 local144 = (Class2_Sub43) Static79.aClass341_26.method8524(); local144 != null; local144 = (Class2_Sub43) Static79.aClass341_26.method8519()) {
			@Pc(149) int local149 = local144.anInt9046;
			local161 = (Static563.aClass333_3.anIntArray646[local149] >> 14 & 0x3FFF) - Static84.anInt2565;
			local171 = (Static563.aClass333_3.anIntArray646[local149] & 0x3FFF) - Static32.anInt723;
			local182 = local161 * 4 + 2 - local64 / 128;
			local192 = local171 * 4 + 2 - local52 / 128;
			Static170.method8609(arg0, arg3, local10, Static563.aClass333_3.anIntArray647[local149], local182, arg2, local192, arg1);
		}
		for (local161 = 0; local161 < Static155.anInt3956; local161++) {
			local171 = Static245.anIntArray278[local161] * 4 + 2 - local64 / 128;
			local182 = Static146.anIntArray179[local161] * 4 + 2 - local52 / 128;
			@Pc(248) Class161 local248 = Static27.aClass342_3.method8534(Static572.anIntArray661[local161]);
			if (local248.anIntArray288 != null) {
				local248 = local248.method4606(Static286.aClass263_3);
				if (local248 == null || local248.anInt5387 == -1) {
					continue;
				}
			}
			Static170.method8609(arg0, arg3, local10, local248.anInt5387, local171, arg2, local182, arg1);
		}
		@Pc(335) int local335;
		@Pc(346) int local346;
		for (@Pc(291) Class2_Sub45 local291 = (Class2_Sub45) Static378.aClass99_26.method3060(); local291 != null; local291 = (Class2_Sub45) Static378.aClass99_26.method3058()) {
			local182 = (int) (local291.aLong278 >> 28 & 0x3L);
			if (Static104.anInt2861 == local182) {
				local192 = (int) (local291.aLong278 & 0x3FFFL) - Static84.anInt2565;
				@Pc(324) int local324 = (int) (local291.aLong278 >> 14 & 0x3FFFL) - Static32.anInt723;
				local335 = local192 * 4 + 2 - local64 / 128;
				local346 = local324 * 4 + 2 - local52 / 128;
				Static402.method6561(arg3, Static22.aClass46Array1[0], arg2, arg0, local10, local346, local335);
			}
		}
		@Pc(438) int local438;
		for (local182 = 0; local182 < Static398.anInt7589; local182++) {
			@Pc(379) Class2_Sub33 local379 = (Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local182]);
			if (local379 != null) {
				@Pc(384) Class3_Sub1_Sub3_Sub3_Sub1 local384 = local379.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				if (local384.method3403() && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 == local384.aByte132) {
					@Pc(400) Class27 local400 = local384.aClass27_1;
					if (local400 != null && local400.anIntArray43 != null) {
						local400 = local400.method727(Static286.aClass263_3);
					}
					if (local400 != null && local400.aBoolean56 && local400.aBoolean55) {
						local346 = local384.anInt10303 / 128 - local64 / 128;
						local438 = local384.anInt10310 / 128 - local52 / 128;
						if (local400.anInt657 == -1) {
							Static402.method6561(arg3, Static22.aClass46Array1[1], arg2, arg0, local10, local438, local346);
						} else {
							Static170.method8609(arg0, arg3, local10, local400.anInt657, local346, arg2, local438, arg1);
						}
					}
				}
			}
		}
		local192 = Static71.anInt3990;
		@Pc(479) int[] local479 = Static549.anIntArray643;
		@Pc(530) int local530;
		@Pc(534) int local534;
		@Pc(566) int local566;
		for (local335 = 0; local335 < local192; local335++) {
			@Pc(489) Class3_Sub1_Sub3_Sub3_Sub2 local489 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local479[local335]];
			if (local489 != null && local489.method5227() && !local489.aBoolean460 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 != local489 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 == local489.aByte132) {
				local438 = local489.anInt10303 / 128 - local64 / 128;
				local530 = local489.anInt10310 / 128 - local52 / 128;
				@Pc(532) boolean local532 = false;
				for (local534 = 0; local534 < Static604.anInt10620; local534++) {
					if (local489.aString64.equals(Static314.aStringArray29[local534]) && Static199.anIntArray558[local534] != 0) {
						local532 = true;
						break;
					}
				}
				@Pc(564) boolean local564 = false;
				for (local566 = 0; local566 < Static235.anInt5133; local566++) {
					if (local489.aString64.equals(Static427.aClass132Array1[local566].aString43)) {
						local564 = true;
						break;
					}
				}
				@Pc(586) boolean local586 = false;
				if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6126 != 0 && local489.anInt6126 != 0 && local489.anInt6126 == Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6126) {
					local586 = true;
				}
				if (local489.aBoolean461) {
					Static402.method6561(arg3, Static22.aClass46Array1[6], arg2, arg0, local10, local530, local438);
				} else if (local532) {
					Static402.method6561(arg3, Static22.aClass46Array1[3], arg2, arg0, local10, local530, local438);
				} else if (local564) {
					Static402.method6561(arg3, Static22.aClass46Array1[5], arg2, arg0, local10, local530, local438);
				} else if (local586) {
					Static402.method6561(arg3, Static22.aClass46Array1[4], arg2, arg0, local10, local530, local438);
				} else {
					Static402.method6561(arg3, Static22.aClass46Array1[2], arg2, arg0, local10, local530, local438);
				}
			}
		}
		@Pc(685) Class373[] local685 = Static351.aClass373Array1;
		@Pc(772) int local772;
		for (local438 = 0; local438 < local685.length; local438++) {
			@Pc(693) Class373 local693 = local685[local438];
			if (local693 != null && local693.anInt11021 != 0 && Static407.anInt7704 % 20 < 10) {
				@Pc(735) int local735;
				if (local693.anInt11021 == 1) {
					@Pc(720) Class2_Sub33 local720 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local693.anInt11014);
					if (local720 != null) {
						@Pc(725) Class3_Sub1_Sub3_Sub3_Sub1 local725 = local720.aClass3_Sub1_Sub3_Sub3_Sub1_2;
						local735 = local725.anInt10303 / 128 - local64 / 128;
						local566 = local725.anInt10310 / 128 - local52 / 128;
						Static609.method8921(360000L, arg3, local566, arg2, arg0, local735, local693.anInt11012, local10);
					}
				}
				if (local693.anInt11021 == 2) {
					local772 = local693.anInt11016 / 128 - local64 / 128;
					local534 = local693.anInt11013 / 128 - local52 / 128;
					@Pc(788) long local788 = (long) (local693.anInt11018 << 7);
					@Pc(792) long local792 = local788 * local788;
					Static609.method8921(local792, arg3, local534, arg2, arg0, local772, local693.anInt11012, local10);
				}
				if (local693.anInt11021 == 10 && local693.anInt11014 >= 0 && Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1.length > local693.anInt11014) {
					@Pc(829) Class3_Sub1_Sub3_Sub3_Sub2 local829 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local693.anInt11014];
					if (local829 != null) {
						local534 = local829.anInt10303 / 128 - local64 / 128;
						local735 = local829.anInt10310 / 128 - local52 / 128;
						Static609.method8921(360000L, arg3, local735, arg2, arg0, local534, local693.anInt11012, local10);
					}
				}
			}
		}
		if (Static496.anInt9165 == 4) {
			return;
		}
		if (Static542.anInt9759 != 0) {
			local530 = Static542.anInt9759 * 4 + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() * 2 + 2 - local64 / 128 - 2;
			local772 = Static339.anInt6841 * 4 + (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() - 1) * 2 + 2 - local52 / 128;
			Static402.method6561(arg3, Static221.aClass46Array10[Static236.aBoolean376 ? 1 : 0], arg2, arg0, local10, local772, local530);
		}
		if (!Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aBoolean460) {
			arg1.method7278(3, arg2 + arg0.anInt441 / 2 - 1, arg0.anInt488 / 2 + -1 + arg3, 3, -1);
			return;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZ)V")
	public static void method6007(@OriginalArg(1) boolean arg0) {
		Static475.aClass30_12.method4653(Static214.aClass20_7.method7243());
		@Pc(10) int[] local10 = Static214.aClass20_7.Y();
		Static447.anInt8318 = local10[2];
		Static542.anInt9758 = local10[0];
		Static224.anInt4986 = local10[3];
		Static290.anInt6164 = local10[1];
		if (arg0) {
			Static214.aClass20_7.DA(Static335.anInt6739, Static294.anInt6199, Static469.anInt8829, Static377.anInt7391);
			Static475.method8451(Static79.aDouble2);
		} else {
			Static214.aClass20_7.DA(Static368.anInt7332, Static160.anInt3991, Static190.anInt4466, Static507.anInt9337);
			Static475.method8451(Static318.aDouble13);
		}
	}
}
