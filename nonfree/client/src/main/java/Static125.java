import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public static int anInt2712;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!vl;")
	public static Class186 aClass186_10 = new Class186(16);

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Z")
	public static boolean aBoolean164 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!wf;)Z")
	public static boolean method2042(@OriginalArg(1) Class191 arg0) {
		if (arg0.anIntArray550 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anIntArray550.length; local18++) {
			@Pc(28) int local28 = Static261.method3998(local18, arg0);
			@Pc(33) int local33 = arg0.anIntArray560[local18];
			if (arg0.anIntArray550[local18] == 2) {
				if (local28 >= local33) {
					return false;
				}
			} else if (arg0.anIntArray550[local18] == 3) {
				if (local33 >= local28) {
					return false;
				}
			} else if (arg0.anIntArray550[local18] == 4) {
				if (local33 == local28) {
					return false;
				}
			} else if (local33 != local28) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!qm;)V")
	public static void method2043(@OriginalArg(1) Class1_Sub14 arg0) {
		if (arg0.aByteArray55.length - arg0.anInt3000 < 1) {
			return;
		}
		@Pc(25) int local25 = arg0.method2199();
		if (local25 < 0 || local25 > 11) {
			return;
		}
		@Pc(42) byte local42;
		if (local25 == 11) {
			local42 = 33;
		} else if (local25 == 10) {
			local42 = 32;
		} else if (local25 == 9) {
			local42 = 31;
		} else if (local25 == 8) {
			local42 = 30;
		} else if (local25 == 7) {
			local42 = 29;
		} else if (local25 == 6) {
			local42 = 28;
		} else if (local25 == 5) {
			local42 = 28;
		} else if (local25 == 4) {
			local42 = 24;
		} else if (local25 == 3) {
			local42 = 23;
		} else if (local25 == 2) {
			local42 = 22;
		} else if (local25 == 1) {
			local42 = 23;
		} else {
			local42 = 19;
		}
		if (arg0.aByteArray55.length - arg0.anInt3000 < local42) {
			return;
		}
		Static166.anInt3743 = arg0.method2199();
		if (Static166.anInt3743 < 1) {
			Static166.anInt3743 = 1;
		} else if (Static166.anInt3743 > 4) {
			Static166.anInt3743 = 4;
		}
		Static19.method426(arg0.method2199() == 1);
		Static72.aBoolean118 = arg0.method2199() == 1;
		Static293.aBoolean364 = arg0.method2199() == 1;
		Static41.aBoolean72 = arg0.method2199() == 1;
		Static280.aBoolean353 = arg0.method2199() == 1;
		aBoolean164 = arg0.method2199() == 1;
		Static282.aBoolean355 = arg0.method2199() == 1;
		Static35.aBoolean65 = arg0.method2199() == 1;
		Static208.anInt4490 = arg0.method2199();
		if (Static208.anInt4490 > 2) {
			Static208.anInt4490 = 2;
		}
		if (local25 < 2) {
			Static65.aBoolean96 = arg0.method2199() == 1;
			arg0.method2199();
		} else {
			Static65.aBoolean96 = arg0.method2199() == 1;
		}
		Static255.aBoolean321 = arg0.method2199() == 1;
		Static202.aBoolean276 = arg0.method2199() == 1;
		Static124.anInt2706 = arg0.method2199();
		if (Static124.anInt2706 > 2) {
			Static124.anInt2706 = 2;
		}
		Static309.anInt6196 = Static124.anInt2706;
		Static11.aBoolean17 = arg0.method2199() == 1;
		Static57.anInt6309 = arg0.method2199();
		if (Static57.anInt6309 > 127) {
			Static57.anInt6309 = 127;
		}
		Static87.anInt2035 = arg0.method2199();
		Static286.anInt5742 = arg0.method2199();
		if (Static286.anInt5742 > 127) {
			Static286.anInt5742 = 127;
		}
		if (local25 >= 1) {
			Static153.anInt3412 = arg0.method2244();
			Static139.anInt3176 = arg0.method2244();
		}
		if (local25 >= 3 && local25 < 6) {
			arg0.method2199();
		}
		if (local25 >= 4) {
			@Pc(370) int local370 = arg0.method2199();
			if (Static196.anInt4274 < 96) {
				local370 = 0;
			}
			Static42.method854(local370);
		}
		if (local25 >= 5) {
			Static236.anInt1713 = arg0.method2194();
		}
		if (local25 >= 6) {
			Static309.anInt6184 = arg0.method2199();
		}
		if (local25 >= 7) {
			Static283.aBoolean357 = arg0.method2199() == 1;
		}
		if (local25 >= 8) {
			Static211.aBoolean285 = arg0.method2199() == 1;
		}
		if (local25 >= 9) {
			Static266.anInt5317 = arg0.method2199();
		}
		if (local25 >= 10) {
			Static198.aBoolean269 = arg0.method2199() != 0;
		}
		if (local25 >= 11) {
			Static210.aBoolean284 = arg0.method2199() != 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Lclient!qa;")
	public static Class136 method2045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass136_1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!cf;Lclient!th;BLclient!th;)V")
	public static void method2046(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(3) Class168 arg2) {
		Static206.aClass168_150 = arg1;
		Static147.aClass168_110 = arg2;
		Static134.anInterface2_1 = arg0;
		if (Static206.aClass168_150 != null) {
			Static272.anInt5455 = Static206.aClass168_150.method4068(1);
		}
		if (Static147.aClass168_110 != null) {
			Static17.anInt470 = Static147.aClass168_110.method4068(1);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method2047() {
		while (true) {
			@Pc(6) Class1_Sub20 local6 = (Class1_Sub20) Static286.aClass26_55.method673();
			if (local6 == null) {
				return;
			}
			@Pc(27) Class2_Sub4 local27;
			@Pc(18) int local18;
			if (local6.anInt4128 < 0) {
				local18 = -local6.anInt4128 - 1;
				if (local18 == Static62.anInt1348) {
					local27 = Static56.aClass2_Sub4_Sub2_1;
				} else {
					local27 = Static155.aClass2_Sub4_Sub2Array1[local18];
				}
			} else {
				local18 = local6.anInt4128 - 1;
				local27 = Static105.aClass2_Sub4_Sub1Array1[local18];
			}
			if (local27 != null) {
				@Pc(52) Class92 local52 = Static166.method2725(local6.anInt4113);
				if (Static185.anInt4085 < 3) {
				}
				@Pc(70) int local70;
				@Pc(73) int local73;
				if (local6.anInt4115 == 1 || local6.anInt4115 == 3) {
					local70 = local52.anInt3182;
					local73 = local52.anInt3227;
				} else {
					local73 = local52.anInt3182;
					local70 = local52.anInt3227;
				}
				@Pc(89) int local89 = local6.anInt4125 + (local73 >> 1);
				@Pc(96) int local96 = (local70 >> 1) + local6.anInt4129;
				@Pc(105) int local105 = local6.anInt4129 + (local70 + 1 >> 1);
				@Pc(114) int local114 = (local73 + 1 >> 1) + local6.anInt4125;
				@Pc(118) int[][] local118 = Static46.anIntArrayArrayArray1[Static185.anInt4085];
				@Pc(146) int local146 = local118[local105][local114] + local118[local96][local89] + local118[local105][local89] + local118[local96][local114] >> 2;
				@Pc(151) int local151 = Static66.anIntArray439[local6.anInt4127];
				@Pc(153) Class2 local153 = null;
				if (local151 == 0) {
					@Pc(221) Class136 local221 = method2045(Static185.anInt4085, local6.anInt4129, local6.anInt4125);
					if (local221 != null) {
						local153 = local221.aClass2_10;
					}
				} else if (local151 == 1) {
					@Pc(170) Class106 local170 = Static277.method4190(Static185.anInt4085, local6.anInt4129, local6.anInt4125);
					if (local170 != null) {
						local153 = local170.aClass2_5;
					}
				} else if (local151 == 2) {
					@Pc(207) Class7 local207 = Static121.method1968(Static185.anInt4085, local6.anInt4129, local6.anInt4125);
					if (local207 != null) {
						local153 = local207.aClass2_1;
					}
				} else if (local151 == 3) {
					@Pc(193) Class119 local193 = Static215.method3451(Static185.anInt4085, local6.anInt4129, local6.anInt4125);
					if (local193 != null) {
						local153 = local193.aClass2_7;
					}
				}
				if (local153 != null) {
					Static185.method3005(0, local6.anInt4114 + 1, local6.anInt4125, local151, local6.anInt4118 + 1, Static185.anInt4085, -1, local6.anInt4129, 0);
					@Pc(252) int local252 = local6.anInt4116;
					local27.anInt2791 = local73 * 64 + local6.anInt4125 * 128;
					local27.anInt2854 = local146;
					local27.anInt2799 = local6.anInt4129 * 128 + local70 * 64;
					local27.anInt2773 = local6.anInt4114 + Static133.anInt3061;
					@Pc(285) int local285 = local6.anInt4122;
					local27.anObject5 = local153;
					@Pc(291) int local291 = local6.anInt4123;
					@Pc(301) int local301;
					if (local252 < local291) {
						local301 = local291;
						local291 = local252;
						local252 = local301;
					}
					local27.anInt2789 = local252 + local6.anInt4129;
					@Pc(314) int local314 = local6.anInt4117;
					if (local314 < local285) {
						local301 = local285;
						local285 = local314;
						local314 = local301;
					}
					local27.anInt2772 = local6.anInt4125 + local285;
					local27.anInt2805 = Static133.anInt3061 + local6.anInt4118;
					local27.anInt2796 = local314 + local6.anInt4125;
					local27.anInt2843 = local291 + local6.anInt4129;
				}
			}
		}
	}
}
