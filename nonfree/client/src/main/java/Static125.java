import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method1770(@OriginalArg(1) Class57 arg0) {
		if (Static481.anInt8130 < 2 && !Static199.aBoolean706 || Static370.aClass73_22 != null) {
			return;
		}
		@Pc(55) String local55;
		if (Static199.aBoolean706 && Static481.anInt8130 < 2) {
			local55 = Static211.aString54 + Static582.aClass335_33.method8349(Static323.anInt5795) + Static352.aString75 + " ->";
		} else if (Static572.aBoolean460 && Static258.aClass89_1.method1617(81) && Static481.anInt8130 > 2) {
			local55 = Static442.method6549(Static133.aClass5_Sub5_Sub19_2);
		} else {
			@Pc(59) Class5_Sub5_Sub19 local59 = Static133.aClass5_Sub5_Sub19_2;
			if (local59 == null) {
				return;
			}
			local55 = Static442.method6549(local59);
			@Pc(69) int[] local69 = null;
			if (Static30.method493(local59.anInt9210)) {
				local69 = Static201.aClass127_1.method2501((int) local59.aLong267).anIntArray316;
			} else if (local59.anInt9209 != -1) {
				local69 = Static201.aClass127_1.method2501(local59.anInt9209).anIntArray316;
			} else if (Static74.method1184((byte) 125, local59.anInt9210)) {
				@Pc(150) Class5_Sub35 local150 = (Class5_Sub35) Static623.aClass291_43.method6993((long) (int) local59.aLong267, 1);
				if (local150 != null) {
					@Pc(155) Class8_Sub1_Sub3_Sub2_Sub2 local155 = local150.aClass8_Sub1_Sub3_Sub2_Sub2_2;
					@Pc(158) Class227 local158 = local155.aClass227_1;
					if (local158.anIntArray341 != null) {
						local158 = local158.method5322(Static413.aClass118_1);
					}
					if (local158 != null) {
						local69 = local158.anIntArray342;
					}
				}
			} else if (Static408.method6016(local59.anInt9210)) {
				@Pc(119) Class55 local119;
				if (local59.anInt9210 == 1003) {
					local119 = Static536.aClass392_2.method9293(0, (int) local59.aLong267);
				} else {
					local119 = Static536.aClass392_2.method9293(0, (int) (local59.aLong267 >>> 32 & 0x7FFFFFFFL));
				}
				if (local119.anIntArray46 != null) {
					local119 = local119.method847(Static413.aClass118_1);
				}
				if (local119 != null) {
					local69 = local119.anIntArray47;
				}
			}
			if (local69 != null) {
				local55 = local55 + Static459.method6733(local69);
			}
		}
		if (Static481.anInt8130 > 2) {
			local55 = local55 + "<col=ffffff> / " + (Static481.anInt8130 - 2) + Static582.aClass335_26.method8349(Static323.anInt5795);
		}
		if (Static149.aClass73_7 != null) {
			@Pc(242) Class80 local242 = Static149.aClass73_7.method1275(arg0);
			if (local242 == null) {
				local242 = Static533.aClass80_10;
			}
			local242.method8797(Static118.anIntArray17, Static149.aClass73_7.anInt1402, Static451.anInt7755, local55, Static149.aClass73_7.anInt1415, Static639.anInt10403, Static149.aClass73_7.anInt1333, Static440.anInt7534, Static149.aClass73_7.anInt1382, Static149.aClass73_7.anInt1384, Static494.aClass134Array13, Static297.aRandom1, Static149.aClass73_7.anInt1394, Static118.anIntArray15);
			Static199.method7894(Static118.anIntArray15[0], Static118.anIntArray15[3], Static118.anIntArray15[1], Static118.anIntArray15[2]);
		} else if (Static618.aClass73_20 != null && Static256.aClass333_3 == Static569.aClass333_7) {
			@Pc(309) int local309 = Static533.aClass80_10.method8787(Static297.aRandom1, local55, Static118.anIntArray17, Static64.anInt1059 + 16, Static451.anInt7755, Static319.anInt5702 + 4, Static494.aClass134Array13);
			Static199.method7894(Static319.anInt5702 + 4, 16, Static64.anInt1059, local309 + Static594.aClass224_12.method5256(local55));
		}
	}

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "(B)V")
	public static void method1771() {
		if (Static351.anIntArray337 != null) {
			return;
		}
		Static351.anIntArray337 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(42) float local42 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(51) float local51 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(53) int local53 = 0; local53 < 128; local53++) {
				@Pc(60) float local60 = (float) local53 / 128.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(70) float local70 = local42 / 60.0F;
				@Pc(73) int local73 = (int) local70;
				@Pc(77) int local77 = local73 % 6;
				@Pc(83) float local83 = (float) -local73 + local70;
				@Pc(89) float local89 = local60 * (1.0F - local51);
				@Pc(97) float local97 = local60 * (1.0F - local83 * local51);
				@Pc(108) float local108 = local60 * (1.0F - (1.0F - local83) * local51);
				if (local77 == 0) {
					local64 = local108;
					local66 = local89;
					local62 = local60;
				} else if (local77 == 1) {
					local64 = local60;
					local66 = local89;
					local62 = local97;
				} else if (local77 == 2) {
					local64 = local60;
					local66 = local108;
					local62 = local89;
				} else if (local77 == 3) {
					local64 = local97;
					local66 = local60;
					local62 = local89;
				} else if (local77 == 4) {
					local66 = local60;
					local64 = local89;
					local62 = local108;
				} else if (local77 == 5) {
					local64 = local89;
					local66 = local97;
					local62 = local60;
				}
				local62 = (float) Math.pow((double) local62, local25);
				local64 = (float) Math.pow((double) local64, local25);
				local66 = (float) Math.pow((double) local66, local25);
				@Pc(210) int local210 = (int) (local62 * 256.0F);
				@Pc(215) int local215 = (int) (local64 * 256.0F);
				@Pc(220) int local220 = (int) (local66 * 256.0F);
				@Pc(232) int local232 = local220 + (local210 << 16) + (local215 << 8) - 16777216;
				Static351.anIntArray337[local27++] = local232;
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JJ)J")
	public static long method1772(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
