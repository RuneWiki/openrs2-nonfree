import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!cf;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
	public static int anInt1117;

	@OriginalMember(owner = "client!h", name = "X", descriptor = "Lclient!oa;")
	public static Class56 aClass56_671 = Static33.method650("ams");

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
	public static int anInt1116 = 0;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_672 = Static33.method650("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "Lclient!oa;")
	private static Class56 aClass56_674 = Static33.method650("Error loading your profile)3");

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_673 = aClass56_674;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_675 = Static33.method650("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_676 = Static33.method650("titlebutton");

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "Lclient!n;")
	public static Class52 aClass52_25 = new Class52(50);

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public static void method782() {
		Static18.method349();
		Static65.aBoolean83 = true;
		Static9.method176();
		if (Static105.aBoolean121) {
			Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static122.aClass56_1634, 239, 40, 0);
			Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static84.method1524(new Class56[] { Static122.aClass56_1632, Static49.aClass56_837 }), 239, 60, 128);
		} else if (Static126.anInt3105 == 1) {
			Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static102.aClass56_1744, 239, 40, 0);
			Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static84.method1524(new Class56[] { Static122.aClass56_1646, Static49.aClass56_837 }), 239, 60, 128);
		} else if (Static126.anInt3105 == 2) {
			Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static96.aClass56_1370, 239, 40, 0);
			Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static84.method1524(new Class56[] { Static122.aClass56_1646, Static49.aClass56_837 }), 239, 60, 128);
		} else {
			@Pc(32) Class3_Sub1_Sub1_Sub1 local32;
			@Pc(39) int local39;
			@Pc(49) int local49;
			if (Static126.anInt3105 == 3) {
				if (Static122.aClass56_1646 != Static122.aClass56_1639) {
					Static93.method1647(Static122.aClass56_1646);
					Static122.aClass56_1639 = Static122.aClass56_1646;
				}
				local32 = Static80.aClass3_Sub1_Sub1_Sub1_4;
				Static6.method1498(0, 0, 463, 77);
				for (local39 = 0; local39 < Static57.anInt1612; local39++) {
					local49 = local39 * 14 + 18 - Static65.anInt1838;
					if (local49 > 0 && local49 < 110) {
						local32.method735(Static118.aClass56Array18[local39], 239, local49, 0);
					}
				}
				Static6.method1485();
				if (Static57.anInt1612 > 5) {
					Static97.method1703(77, 0, Static57.anInt1612 * 14 + 7, Static65.anInt1838, 463);
				}
				if (Static122.aClass56_1646.method1426() == 0) {
					Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static50.aClass56_802, 239, 40, 255);
				} else if (Static57.anInt1612 == 0) {
					Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static98.aClass56_1406, 239, 40, 0);
				}
				local32.method735(Static84.method1524(new Class56[] { Static122.aClass56_1646, Static49.aClass56_837 }), 239, 90, 0);
				Static6.method1489(0, 77, 479, 0);
			} else if (Static126.anInt3105 == 4) {
				Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static122.aClass56_1640, 239, 40, 0);
				Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static84.method1524(new Class56[] { Static122.aClass56_1646, Static49.aClass56_837 }), 239, 60, 128);
			} else if (Static34.aClass56_531 == null) {
				@Pc(180) boolean local180;
				if (Static57.anInt1609 != -1) {
					local180 = Static30.method628(2, 479, Static57.anInt1609, 96);
					if (!local180) {
						Static12.aBoolean17 = true;
					}
				} else if (Static69.anInt1918 == -1) {
					local32 = Static80.aClass3_Sub1_Sub1_Sub1_4;
					local39 = 0;
					Static6.method1498(0, 0, 463, 77);
					for (local49 = 0; local49 < 100; local49++) {
						if (Static119.aClass56Array19[local49] != null) {
							@Pc(212) int local212 = Static38.anInt1024 + 70 - local39 * 14;
							@Pc(216) int local216 = Static125.anIntArray337[local49];
							@Pc(220) Class56 local220 = Static54.aClass56Array5[local49];
							@Pc(222) byte local222 = 0;
							if (local220 != null && local220.method1428(Static41.aClass56_654)) {
								local220 = local220.method1417(5);
								local222 = 1;
							}
							if (local220 != null && local220.method1428(Static44.aClass56_694)) {
								local222 = 2;
								local220 = local220.method1417(5);
							}
							if (local216 == 0) {
								if (local212 > 0 && local212 < 110) {
									local32.method738(Static119.aClass56Array19[local49], 4, local212, 0);
								}
								local39++;
							}
							@Pc(303) int local303;
							if ((local216 == 1 || local216 == 2) && (local216 == 1 || Static66.anInt541 == 0 || Static66.anInt541 == 1 && Static108.method1824(local220))) {
								if (local212 > 0 && local212 < 110) {
									local303 = 4;
									if (local222 == 1) {
										Static72.aClass3_Sub1_Sub1_Sub4Array27[0].method1504(4, local212 - 12);
										local303 += 14;
									}
									if (local222 == 2) {
										Static72.aClass3_Sub1_Sub1_Sub4Array27[1].method1504(local303, local212 - 12);
										local303 += 14;
									}
									local32.method738(Static84.method1524(new Class56[] { local220, Static105.aClass56_1442 }), local303, local212, 0);
									local303 += local32.method745(local220) + 8;
									local32.method738(Static119.aClass56Array19[local49], local303, local212, 255);
								}
								local39++;
							}
							if ((local216 == 3 || local216 == 7) && Static52.anInt1510 == 0 && (local216 == 7 || Static46.anInt2266 == 0 || Static46.anInt2266 == 1 && Static108.method1824(local220))) {
								if (local212 > 0 && local212 < 110) {
									local32.method738(Static94.aClass56_1336, 4, local212, 0);
									local303 = local32.method745(Static94.aClass56_1336) + 4;
									local303 += local32.method743(32);
									if (local222 == 1) {
										Static72.aClass3_Sub1_Sub1_Sub4Array27[0].method1504(local303, local212 - 12);
										local303 += 14;
									}
									if (local222 == 2) {
										Static72.aClass3_Sub1_Sub1_Sub4Array27[1].method1504(local303, local212 - 12);
										local303 += 14;
									}
									local32.method738(Static84.method1524(new Class56[] { local220, Static105.aClass56_1442 }), local303, local212, 0);
									local303 += local32.method745(local220) + 8;
									local32.method738(Static119.aClass56Array19[local49], local303, local212, 8388608);
								}
								local39++;
							}
							if (local216 == 4 && (Static56.anInt1592 == 0 || Static56.anInt1592 == 1 && Static108.method1824(local220))) {
								if (local212 > 0 && local212 < 110) {
									local32.method738(Static84.method1524(new Class56[] { local220, Static31.aClass56_507, Static119.aClass56Array19[local49] }), 4, local212, 8388736);
								}
								local39++;
							}
							if (local216 == 5 && Static52.anInt1510 == 0 && Static46.anInt2266 < 2) {
								if (local212 > 0 && local212 < 110) {
									local32.method738(Static119.aClass56Array19[local49], 4, local212, 8388608);
								}
								local39++;
							}
							if (local216 == 6 && Static52.anInt1510 == 0 && Static46.anInt2266 < 2) {
								local39++;
								if (local212 > 0 && local212 < 110) {
									local32.method738(Static84.method1524(new Class56[] { Static59.aClass56_925, Static31.aClass56_507, local220, Static105.aClass56_1442 }), 4, local212, 0);
									local32.method738(Static119.aClass56Array19[local49], local32.method745(Static84.method1524(new Class56[] { Static59.aClass56_925, Static31.aClass56_507, local220 })) + 12, local212, 8388608);
								}
							}
							if (local216 == 8 && (Static56.anInt1592 == 0 || Static56.anInt1592 == 1 && Static108.method1824(local220))) {
								if (local212 > 0 && local212 < 110) {
									local32.method738(Static84.method1524(new Class56[] { local220, Static31.aClass56_507, Static119.aClass56Array19[local49] }), 4, local212, 8270336);
								}
								local39++;
							}
						}
					}
					Static6.method1485();
					Static56.anInt1593 = local39 * 14 + 7;
					if (Static56.anInt1593 < 78) {
						Static56.anInt1593 = 78;
					}
					Static97.method1703(77, 0, Static56.anInt1593, Static56.anInt1593 - Static38.anInt1024 - 77, 463);
					@Pc(708) Class56 local708;
					if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1 == null || Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass56_764 == null) {
						local708 = Static66.aClass56_262;
					} else {
						local708 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass56_764;
					}
					local32.method738(Static84.method1524(new Class56[] { local708, Static105.aClass56_1442 }), 4, 90, 0);
					local32.method738(Static84.method1524(new Class56[] { Static122.aClass56_1629, Static49.aClass56_837 }), local32.method745(Static84.method1524(new Class56[] { local708, Static3.aClass56_1722 })) + 6, 90, 255);
					Static6.method1489(0, 77, 479, 0);
				} else {
					local180 = Static30.method628(3, 479, Static69.anInt1918, 96);
					if (!local180) {
						Static12.aBoolean17 = true;
					}
				}
			} else {
				Static57.aClass3_Sub1_Sub1_Sub1_3.method734(Static34.aClass56_531, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static57.aClass3_Sub1_Sub1_Sub1_3.method735(Static61.aClass56_950, 239, 80, 128);
			}
		}
		if (Static122.aBoolean163 && anInt1117 == 2) {
			Static56.method1062();
		}
		Static99.method613();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)Lclient!td;")
	public static Class3_Sub1_Sub16 method784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class3_Sub1_Sub16 local3 = Static96.method1688(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass3_Sub1_Sub16Array2 == null || arg1 >= local3.aClass3_Sub1_Sub16Array2.length) {
			return null;
		} else {
			return local3.aClass3_Sub1_Sub16Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!tb;)V")
	public static void method785(@OriginalArg(1) Class44 arg0) {
		Static114.aClass44_63 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V")
	public static void method786() {
		aClass56_676 = null;
		aClass56_673 = null;
		aClass56_671 = null;
		aClass56_675 = null;
		aClass56_674 = null;
		aClass56_672 = null;
		aClass13_1 = null;
		aClass52_25 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
	public static void method788(@OriginalArg(0) int arg0) {
		Static96.anInt2515 += arg0 * 128;
		@Pc(29) int local29;
		if (Static65.anIntArray144.length < Static96.anInt2515) {
			Static96.anInt2515 -= Static65.anIntArray144.length;
			local29 = (int) (Math.random() * 12.0D);
			Static71.method1306(Static117.aClass3_Sub1_Sub1_Sub4Array61[local29]);
		}
		local29 = 0;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(49) int local49 = arg0 * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			local75 = Static49.anIntArray102[local29 + local49] - Static65.anIntArray144[local29 + Static96.anInt2515 & Static65.anIntArray144.length + -1] * arg0 / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static49.anIntArray102[local29++] = local75;
		}
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local105 = local75 * 128;
			for (local107 = 0; local107 < 128; local107++) {
				local114 = (int) (Math.random() * 100.0D);
				if (local114 < 50 && local107 > 10 && local107 < 118) {
					Static49.anIntArray102[local107 + local105] = 255;
				} else {
					Static49.anIntArray102[local105 + local107] = 0;
				}
			}
		}
		if (Static4.anInt53 > 0) {
			Static4.anInt53 -= arg0 * 4;
		}
		if (anInt1116 > 0) {
			anInt1116 -= arg0 * 4;
		}
		if (Static4.anInt53 == 0 && anInt1116 == 0) {
			local105 = (int) ((double) (2000 / arg0) * Math.random());
			if (local105 == 1) {
				anInt1116 = 1024;
			}
			if (local105 == 0) {
				Static4.anInt53 = 1024;
			}
		}
		for (local105 = 0; local105 < 256 - arg0; local105++) {
			Static81.anIntArray187[local105] = Static81.anIntArray187[arg0 + local105];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static81.anIntArray187[local107] = (int) (Math.sin((double) Static33.anInt963 / 14.0D) * 16.0D + Math.sin((double) Static33.anInt963 / 15.0D) * 14.0D + Math.sin((double) Static33.anInt963 / 16.0D) * 12.0D);
			Static33.anInt963++;
		}
		Static34.anInt969 += arg0;
		local114 = ((Static98.anInt2566 & 0x1) + arg0) / 2;
		if (local114 <= 0) {
			return;
		}
		@Pc(291) int local291;
		@Pc(298) int local298;
		for (@Pc(282) int local282 = 0; local282 < Static34.anInt969 * 100; local282++) {
			local291 = (int) (Math.random() * 124.0D) + 2;
			local298 = (int) (Math.random() * 128.0D) + 128;
			Static49.anIntArray102[local291 + (local298 << 7)] = 192;
		}
		Static34.anInt969 = 0;
		@Pc(325) int local325;
		@Pc(328) int local328;
		for (local291 = 0; local291 < 256; local291++) {
			local298 = 0;
			local325 = local291 * 128;
			for (local328 = -local114; local328 < 128; local328++) {
				if (local114 + local328 < 128) {
					local298 += Static49.anIntArray102[local114 + local328 + local325];
				}
				if (local328 - local114 - 1 >= 0) {
					local298 -= Static49.anIntArray102[local328 + local325 - local114 - 1];
				}
				if (local328 >= 0) {
					Static86.anIntArray196[local328 + local325] = local298 / (local114 * 2 + 1);
				}
			}
		}
		for (local298 = 0; local298 < 128; local298++) {
			local325 = 0;
			for (local328 = -local114; local328 < 256; local328++) {
				@Pc(405) int local405 = local328 * 128;
				if (local114 + local328 < 256) {
					local325 += Static86.anIntArray196[local298 + local405 + local114 * 128];
				}
				if (local328 - local114 - 1 >= 0) {
					local325 -= Static86.anIntArray196[local298 + local405 - local114 * 128 - 128];
				}
				if (local328 >= 0) {
					Static49.anIntArray102[local298 + local405] = local325 / (local114 * 2 + 1);
				}
			}
		}
	}
}
