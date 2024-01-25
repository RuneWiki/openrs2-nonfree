import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!oa;Lclient!gba;III)V")
	public static void method4305(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class98 local10 = arg1.method3150(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ca(arg2, arg3, arg2 + arg1.anInt3474, arg3 - -arg1.anInt3481);
		if (Static451.anInt9796 == 2 || Static451.anInt9796 == 5 || Static17.aClass13_1 == null) {
			arg0.L(-16777216, local10, arg2, arg3);
			return;
		}
		@Pc(56) int local56;
		@Pc(46) int local46;
		@Pc(54) int local54;
		@Pc(48) int local48;
		if (Static555.anInt9335 == 4) {
			local46 = Static391.anInt6854;
			local48 = 4096;
			local54 = (int) -Static477.aFloat164 & 0x3FFF;
			local56 = Static460.anInt7816;
		} else {
			local46 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929;
			local54 = (int) -Static477.aFloat164 + Static402.anInt6978 & 0x3FFF;
			local56 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934;
			local48 = 4096 - Static380.anInt6751 * 16;
		}
		@Pc(92) int local92 = local56 / 128 + 48 - (Static38.anInt740 - 104) * 2;
		@Pc(110) int local110 = Static38.anInt741 * 4 + 48 - local46 / 128 - (Static38.anInt741 + -104) * 2;
		Static17.aClass13_1.method8026((float) arg2 + (float) arg1.anInt3474 / 2.0F, (float) arg1.anInt3481 / 2.0F + (float) arg3, (float) local92, (float) local110, local48, local54 << 2, local10, arg2, arg3);
		@Pc(163) int local163;
		@Pc(173) int local173;
		@Pc(184) int local184;
		@Pc(195) int local195;
		for (@Pc(146) Class4_Sub33 local146 = (Class4_Sub33) Static452.aClass124_50.method3267(); local146 != null; local146 = (Class4_Sub33) Static452.aClass124_50.method3273()) {
			@Pc(151) int local151 = local146.anInt6079;
			local163 = (Static378.aClass67_1.anIntArray223[local151] >> 14 & 0x3FFF) - Static373.anInt6695;
			local173 = (Static378.aClass67_1.anIntArray223[local151] & 0x3FFF) - Static6.anInt97;
			local184 = local163 * 4 + 2 - local56 / 128;
			local195 = local173 * 4 + 2 - local46 / 128;
			Static210.method3677(arg0, arg2, local195, arg3, local184, arg1, Static378.aClass67_1.anIntArray222[local151], local10);
		}
		for (local163 = 0; local163 < Static370.anInt6653; local163++) {
			local173 = Static308.anIntArray465[local163] * 4 + 2 - local56 / 128;
			local184 = Static517.anIntArray673[local163] * 4 + 2 - local46 / 128;
			@Pc(252) Class25 local252 = Static553.aClass288_4.method6419(Static25.anIntArray108[local163]);
			if (local252.anIntArray115 != null) {
				local252 = local252.method578(Static511.aClass335_2);
				if (local252 == null || local252.anInt617 == -1) {
					continue;
				}
			}
			Static210.method3677(arg0, arg2, local184, arg3, local173, arg1, local252.anInt617, local10);
		}
		@Pc(332) int local332;
		@Pc(343) int local343;
		for (@Pc(289) Class4_Sub15 local289 = (Class4_Sub15) Static486.aClass183_34.method4286(); local289 != null; local289 = (Class4_Sub15) Static486.aClass183_34.method4283()) {
			local184 = (int) (local289.aLong307 >> 28 & 0x3L);
			if (Static200.anInt4239 == local184) {
				local195 = (int) (local289.aLong307 & 0x3FFFL) - Static373.anInt6695;
				@Pc(321) int local321 = (int) (local289.aLong307 >> 14 & 0x3FFFL) - Static6.anInt97;
				local332 = local195 * 4 + 2 - local56 / 128;
				local343 = local321 * 4 + 2 - local46 / 128;
				Static283.method4483(local10, arg2, local343, local332, arg1, Static70.aClass13Array1[0], arg3);
			}
		}
		@Pc(433) int local433;
		for (local184 = 0; local184 < Static428.anInt7363; local184++) {
			@Pc(374) Class4_Sub50 local374 = (Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local184]);
			if (local374 != null) {
				@Pc(379) Class10_Sub1_Sub2_Sub1 local379 = local374.aClass10_Sub1_Sub2_Sub1_1;
				if (local379.method3532() && local379.aByte101 == Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101) {
					@Pc(395) Class54 local395 = local379.aClass54_1;
					if (local395 != null && local395.anIntArray150 != null) {
						local395 = local395.method1118(Static511.aClass335_2);
					}
					if (local395 != null && local395.aBoolean100 && local395.aBoolean95) {
						local343 = local379.anInt8934 / 128 - local56 / 128;
						local433 = local379.anInt8929 / 128 - local46 / 128;
						if (local395.anInt1280 == -1) {
							Static283.method4483(local10, arg2, local433, local343, arg1, Static70.aClass13Array1[1], arg3);
						} else {
							Static210.method3677(arg0, arg2, local433, arg3, local343, arg1, local395.anInt1280, local10);
						}
					}
				}
			}
		}
		local195 = Static272.anInt5182;
		@Pc(473) int[] local473 = Static362.anIntArray519;
		@Pc(519) int local519;
		@Pc(523) int local523;
		@Pc(551) int local551;
		for (local332 = 0; local332 < local195; local332++) {
			@Pc(483) Class10_Sub1_Sub2_Sub2 local483 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local473[local332]];
			if (local483 != null && local483.method7040() && local483 != Static129.aClass10_Sub1_Sub2_Sub2_1 && Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 == local483.aByte101) {
				local433 = local483.anInt8934 / 128 - local56 / 128;
				local519 = local483.anInt8929 / 128 - local46 / 128;
				@Pc(521) boolean local521 = false;
				for (local523 = 0; local523 < Static282.anInt5285; local523++) {
					if (local483.aString93.equals(Static300.aStringArray26[local523]) && Static26.anIntArray417[local523] != 0) {
						local521 = true;
						break;
					}
				}
				@Pc(549) boolean local549 = false;
				for (local551 = 0; local551 < Static63.anInt1182; local551++) {
					if (local483.aString93.equals(Static168.aClass193Array1[local551].aString65)) {
						local549 = true;
						break;
					}
				}
				@Pc(575) boolean local575 = false;
				if (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8572 != 0 && local483.anInt8572 != 0 && local483.anInt8572 == Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8572) {
					local575 = true;
				}
				if (local483.aBoolean598) {
					Static283.method4483(local10, arg2, local519, local433, arg1, Static70.aClass13Array1[6], arg3);
				} else if (local521) {
					Static283.method4483(local10, arg2, local519, local433, arg1, Static70.aClass13Array1[3], arg3);
				} else if (local549) {
					Static283.method4483(local10, arg2, local519, local433, arg1, Static70.aClass13Array1[5], arg3);
				} else if (local575) {
					Static283.method4483(local10, arg2, local519, local433, arg1, Static70.aClass13Array1[4], arg3);
				} else {
					Static283.method4483(local10, arg2, local519, local433, arg1, Static70.aClass13Array1[2], arg3);
				}
			}
		}
		@Pc(676) Class18[] local676 = Static186.aClass18Array1;
		@Pc(760) int local760;
		for (local433 = 0; local433 < local676.length; local433++) {
			@Pc(684) Class18 local684 = local676[local433];
			if (local684 != null && local684.anInt388 != 0 && Static237.anInt7561 % 20 < 10) {
				@Pc(725) int local725;
				if (local684.anInt388 == 1) {
					@Pc(710) Class4_Sub50 local710 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local684.anInt387);
					if (local710 != null) {
						@Pc(715) Class10_Sub1_Sub2_Sub1 local715 = local710.aClass10_Sub1_Sub2_Sub1_1;
						local725 = local715.anInt8934 / 128 - local56 / 128;
						local551 = local715.anInt8929 / 128 - local46 / 128;
						Static51.method794(local684.anInt392, arg2, local725, local551, local10, arg1, arg3, 360000L);
					}
				}
				if (local684.anInt388 == 2) {
					local760 = local684.anInt382 / 128 - local56 / 128;
					local523 = local684.anInt393 / 128 - local46 / 128;
					@Pc(776) long local776 = (long) (local684.anInt381 << 7);
					@Pc(780) long local780 = local776 * local776;
					Static51.method794(local684.anInt392, arg2, local760, local523, local10, arg1, arg3, local780);
				}
				if (local684.anInt388 == 10 && local684.anInt387 >= 0 && Static246.aClass10_Sub1_Sub2_Sub2Array1.length > local684.anInt387) {
					@Pc(814) Class10_Sub1_Sub2_Sub2 local814 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local684.anInt387];
					if (local814 != null) {
						local523 = local814.anInt8934 / 128 - local56 / 128;
						local725 = local814.anInt8929 / 128 - local46 / 128;
						Static51.method794(local684.anInt392, arg2, local523, local725, local10, arg1, arg3, 360000L);
					}
				}
			}
		}
		if (Static555.anInt9335 == 4) {
			return;
		}
		if (Static319.anInt5739 != 0) {
			local519 = Static319.anInt5739 * 4 + Static129.aClass10_Sub1_Sub2_Sub2_1.method7021() * 2 + 2 - local56 / 128 - 2;
			local760 = Static435.anInt7462 * 4 + (Static129.aClass10_Sub1_Sub2_Sub2_1.method7021() - 1) * 2 + 2 - local46 / 128;
			Static283.method4483(local10, arg2, local760, local519, arg1, Static219.aClass13Array14[Static357.aBoolean462 ? 1 : 0], arg3);
		}
		arg0.method6794(3, arg1.anInt3474 / 2 + arg2 - 1, 3, arg3 + arg1.anInt3481 / 2 - 1, -1);
		return;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method4306() {
		if (Static118.aClass202_1 != null) {
			Static466.aClass276_1 = new Class276();
			Static466.aClass276_1.method6057(Static118.aClass202_1.aClass198_62.method4407(Static56.anInt953), Static118.aClass202_1, Static118.aClass202_1.anInt5246, Static23.aLong15);
			Static592.aThread7 = new Thread(Static466.aClass276_1, "");
			Static592.aThread7.start();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4308(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static488.method6774(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static282.anInt5285; local30++) {
			@Pc(36) String local36 = Static300.aStringArray26[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static488.method6774(local36);
			if (local36 != null && local36.equals(local25)) {
				Static282.anInt5285--;
				for (@Pc(60) int local60 = local30; local60 < Static282.anInt5285; local60++) {
					Static300.aStringArray26[local60] = Static300.aStringArray26[local60 + 1];
					Static38.aStringArray3[local60] = Static38.aStringArray3[local60 + 1];
					Static26.anIntArray417[local60] = Static26.anIntArray417[local60 + 1];
					Static12.aStringArray1[local60] = Static12.aStringArray1[local60 + 1];
					Static506.anIntArray669[local60] = Static506.anIntArray669[local60 + 1];
					Static520.aBooleanArray38[local60] = Static520.aBooleanArray38[local60 + 1];
				}
				Static506.anInt8762 = Static191.anInt5895;
				@Pc(125) Class4_Sub41 local125 = Static128.method2707(Static450.aClass61_103, Class16_Sub3.lb);
				local125.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(arg0));
				local125.aClass4_Sub9_Sub1_3.method6000(arg0);
				Static551.method7603(local125);
				return;
			}
		}
	}
}
