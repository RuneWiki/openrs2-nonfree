import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!o", name = "K", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "I")
	public static int anInt3564 = -1;

	@OriginalMember(owner = "client!o", name = "X", descriptor = "[S")
	public static short[] aShortArray28 = new short[] { 48, 41, 39, 59, 50, 47, 34, 38 };

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V")
	public static void method2772(@OriginalArg(1) long arg0) {
		if (Static172.anInt3428 == 1 || Static172.anInt3428 == 5) {
			Static42.method671(arg0);
		} else if (Static172.anInt3428 == 2) {
			Static105.method1702();
		} else {
			Static74.method1178();
		}
		if (!Static147.aBoolean246) {
			Static185.anInt3679 = 1;
			Static57.aStringArray19[0] = Static86.aString69;
			Static161.aStringArray47[0] = "";
			Static204.aShortArray34[0] = 1007;
			Static65.anIntArray476[0] = Static9.anInt85;
			if (Static211.anInt4338 != 0) {
				Static229.anInt4666 = Static232.anInt4701;
				Static127.anInt2559 = Static99.anInt2070;
			} else if (Static157.anInt5714 == 0) {
				Static229.anInt4666 = Static106.anInt2198;
				Static127.anInt2559 = Static182.anInt3572;
			} else {
				Static127.anInt2559 = Static59.anInt1292;
				Static229.anInt4666 = Static89.anInt1907;
			}
		}
		if (Static248.anInt4917 != -1) {
			Static70.method1136(Static248.anInt4917);
		}
		@Pc(82) int local82;
		for (local82 = 0; local82 < Static235.anInt4759; local82++) {
			if (Static128.aBooleanArray7[local82]) {
				Static44.aBooleanArray3[local82] = true;
			}
			Static161.aBooleanArray14[local82] = Static128.aBooleanArray7[local82];
			Static128.aBooleanArray7[local82] = false;
		}
		Static177.aClass159_8 = null;
		Static192.anInt3876 = -1;
		if (Static116.aBoolean188) {
			Static175.aBoolean288 = true;
		}
		Static15.aClass159_1 = null;
		Static34.anInt771 = Static183.anInt3590;
		Static293.anInt5687 = -1;
		if (Static248.anInt4917 != -1) {
			Static235.anInt4759 = 0;
			Static158.method2552();
		}
		if (Static116.aBoolean188) {
			Static126.method1999();
		} else {
			Static103.method1684();
		}
		Static98.method1566();
		if (Static147.aBoolean246) {
			if (Static225.aBoolean372) {
				Static35.method558();
			} else {
				Static240.method3613();
			}
		} else if (Static15.aClass159_1 != null) {
			Static75.method1183(Static15.aClass159_1, Static113.anInt2317, Static178.anInt3508);
		} else if (Static192.anInt3876 != -1) {
			Static75.method1183(null, Static293.anInt5687, Static192.anInt3876);
		}
		local82 = Static147.aBoolean246 ? -1 : Static165.method2629();
		if (local82 == -1) {
			local82 = Static16.anInt3516;
		}
		Static2.method6(local82);
		if (Static92.anInt1948 == 1) {
			Static92.anInt1948 = 2;
		}
		if (Static55.anInt1229 == 1) {
			Static55.anInt1229 = 2;
		}
		if (Static138.anInt2763 == 3) {
			for (@Pc(208) int local208 = 0; local208 < Static235.anInt4759; local208++) {
				if (Static161.aBooleanArray14[local208]) {
					if (Static116.aBoolean188) {
						Static126.method2000(Static78.anIntArray113[local208], Static295.anIntArray277[local208], Static57.anIntArray84[local208], Static250.anIntArray374[local208], 16711935, 128);
					} else {
						Static103.method1678(Static78.anIntArray113[local208], Static295.anIntArray277[local208], Static57.anIntArray84[local208], Static250.anIntArray374[local208], 16711935, 128);
					}
				} else if (Static44.aBooleanArray3[local208]) {
					if (Static116.aBoolean188) {
						Static126.method2000(Static78.anIntArray113[local208], Static295.anIntArray277[local208], Static57.anIntArray84[local208], Static250.anIntArray374[local208], 16711680, 128);
					} else {
						Static103.method1678(Static78.anIntArray113[local208], Static295.anIntArray277[local208], Static57.anIntArray84[local208], Static250.anIntArray374[local208], 16711680, 128);
					}
				}
			}
		}
		Static164.method2605(Static185.anInt3691, Static21.aClass36_Sub3_Sub1_1.anInt4118, Static21.aClass36_Sub3_Sub1_1.anInt4117, Static34.anInt770);
		Static185.anInt3691 = 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z")
	public static boolean method2773(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(15) int local15 = Static204.aShortArray34[arg0];
		if (local15 >= 2000) {
			local15 -= 2000;
		}
		return local15 == 1004;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!pk;III)[Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1[] method2774(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		return Static247.method4168(arg0, 0, arg1) ? Static197.method3034() : null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLclient!pf;I)V")
	public static void method2775(@OriginalArg(0) int arg0, @OriginalArg(2) Class36_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		@Pc(19) int local19;
		if ((arg0 & 0x20) != 0) {
			local15 = Static275.aClass8_Sub2_Sub1_6.method2382();
			local19 = Static275.aClass8_Sub2_Sub1_6.method2322();
			arg1.method3104(local15, Static183.anInt3590, local19);
			arg1.anInt4145 = Static183.anInt3590 + 300;
			arg1.anInt4068 = Static275.aClass8_Sub2_Sub1_6.method2334();
		}
		if ((arg0 & 0x1) != 0) {
			local15 = Static275.aClass8_Sub2_Sub1_6.method2348();
			if (local15 == 65535) {
				local15 = -1;
			}
			local19 = Static275.aClass8_Sub2_Sub1_6.method2338();
			Static197.method3042(arg1, local19, local15);
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt4143 = Static275.aClass8_Sub2_Sub1_6.method2349();
			arg1.anInt4092 = Static275.aClass8_Sub2_Sub1_6.method2349();
			arg1.anInt4135 = Static275.aClass8_Sub2_Sub1_6.method2322();
			arg1.anInt4079 = Static275.aClass8_Sub2_Sub1_6.method2334();
			arg1.anInt4078 = Static275.aClass8_Sub2_Sub1_6.method2375() + Static183.anInt3590;
			arg1.anInt4096 = Static275.aClass8_Sub2_Sub1_6.method2348() + Static183.anInt3590;
			arg1.anInt4063 = Static275.aClass8_Sub2_Sub1_6.method2338();
			arg1.anInt4093 = 1;
			arg1.anInt4090 = 0;
		}
		if ((arg0 & 0x800) != 0) {
			local15 = Static275.aClass8_Sub2_Sub1_6.method2349();
			@Pc(135) int[] local135 = new int[local15];
			@Pc(138) int[] local138 = new int[local15];
			@Pc(141) int[] local141 = new int[local15];
			for (@Pc(143) int local143 = 0; local143 < local15; local143++) {
				@Pc(150) int local150 = Static275.aClass8_Sub2_Sub1_6.method2358();
				if (local150 == 65535) {
					local150 = -1;
				}
				local135[local143] = local150;
				local141[local143] = Static275.aClass8_Sub2_Sub1_6.method2349();
				local138[local143] = Static275.aClass8_Sub2_Sub1_6.method2348();
			}
			Static192.method3014(local138, local141, arg1, local135);
		}
		if ((arg0 & 0x80) != 0) {
			arg1.anInt4066 = Static275.aClass8_Sub2_Sub1_6.method2348();
			arg1.anInt4105 = Static275.aClass8_Sub2_Sub1_6.method2348();
		}
		@Pc(303) int local303;
		if ((arg0 & 0x100) != 0) {
			local15 = Static275.aClass8_Sub2_Sub1_6.method2377();
			local19 = Static275.aClass8_Sub2_Sub1_6.method2381();
			if (local15 == 65535) {
				local15 = -1;
			}
			@Pc(220) boolean local220 = true;
			if (local15 != -1 && arg1.anInt4125 != -1 && Static115.method1855(Static81.method1346(local15).anInt4680).anInt2224 < Static115.method1855(Static81.method1346(arg1.anInt4125).anInt4680).anInt2224) {
				local220 = false;
			}
			if (local220) {
				arg1.anInt4070 = 0;
				arg1.anInt4127 = 0;
				arg1.anInt4125 = local15;
				arg1.anInt4124 = 1;
				arg1.anInt4095 = local19 >> 16;
				arg1.anInt4149 = (local19 & 0xFFFF) + Static183.anInt3590;
				if (arg1.anInt4149 > Static183.anInt3590) {
					arg1.anInt4127 = -1;
				}
				if (arg1.anInt4125 != -1 && Static183.anInt3590 == arg1.anInt4149) {
					local303 = Static81.method1346(arg1.anInt4125).anInt4680;
					if (local303 != -1) {
						@Pc(312) Class76 local312 = Static115.method1855(local303);
						if (local312 != null && local312.anIntArray159 != null) {
							Static184.method2846(arg1 == Static21.aClass36_Sub3_Sub1_1, 0, arg1.anInt4117, local312, arg1.anInt4118);
						}
					}
				}
			}
		}
		if ((arg0 & 0x2) != 0) {
			arg1.anInt4139 = Static275.aClass8_Sub2_Sub1_6.method2375();
			if (arg1.anInt4139 == 65535) {
				arg1.anInt4139 = -1;
			}
		}
		if ((arg0 & 0x10) != 0) {
			local15 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local19 = Static275.aClass8_Sub2_Sub1_6.method2334();
			@Pc(370) int local370 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local303 = Static275.aClass8_Sub2_Sub1_6.anInt2955;
			@Pc(384) boolean local384 = (local15 & 0x8000) != 0;
			if (arg1.aString144 != null && arg1.aClass11_2 != null) {
				@Pc(397) long local397 = Static31.method513(arg1.aString144);
				@Pc(399) boolean local399 = false;
				if (local19 <= 1) {
					if (!local384 && (Static176.aBoolean291 && !Static139.aBoolean229 || Static176.aBoolean292)) {
						local399 = true;
					} else {
						for (@Pc(417) int local417 = 0; local417 < Static30.anInt728; local417++) {
							if (local397 == Static213.aLongArray11[local417]) {
								local399 = true;
								break;
							}
						}
					}
				}
				if (!local399 && Static226.anInt4614 == 0) {
					Static213.aClass8_Sub2_3.anInt2955 = 0;
					Static275.aClass8_Sub2_Sub1_6.method2339(Static213.aClass8_Sub2_3.aByteArray24, local370);
					@Pc(456) int local456 = -1;
					Static213.aClass8_Sub2_3.anInt2955 = 0;
					@Pc(468) String local468;
					if (local384) {
						local15 &= 0x7FFF;
						@Pc(478) Class7 local478 = Static61.method954(Static213.aClass8_Sub2_3);
						local456 = local478.anInt61;
						local468 = local478.aClass8_Sub1_Sub12_1.method3130(Static213.aClass8_Sub2_3);
					} else {
						local468 = Static43.method2024(Static236.method3593(Static168.method4147(Static213.aClass8_Sub2_3)));
					}
					arg1.aString146 = local468.trim();
					arg1.anInt4115 = 150;
					arg1.anInt4130 = local15 & 0xFF;
					arg1.anInt4087 = local15 >> 8;
					if (local19 == 2) {
						Static282.method648(local384 ? 17 : 1, local456, "<img=1>" + arg1.method3084(), local468, null);
					} else if (local19 == 1) {
						Static282.method648(local384 ? 17 : 1, local456, "<img=0>" + arg1.method3084(), local468, null);
					} else {
						Static282.method648(local384 ? 17 : 2, local456, arg1.method3084(), local468, null);
					}
				}
			}
			Static275.aClass8_Sub2_Sub1_6.anInt2955 = local303 + local370;
		}
		if ((arg0 & 0x8) != 0) {
			arg1.aString146 = Static275.aClass8_Sub2_Sub1_6.method2372();
			if (arg1.aString146.charAt(0) == '~') {
				arg1.aString146 = arg1.aString146.substring(1);
				Static47.method746(2, arg1.aString146, arg1.method3084());
			} else if (Static21.aClass36_Sub3_Sub1_1 == arg1) {
				Static47.method746(2, arg1.aString146, arg1.method3084());
			}
			arg1.anInt4087 = 0;
			arg1.anInt4130 = 0;
			arg1.anInt4115 = 150;
		}
		if ((arg0 & 0x400) != 0) {
			local15 = Static275.aClass8_Sub2_Sub1_6.method2382();
			local19 = Static275.aClass8_Sub2_Sub1_6.method2349();
			arg1.method3104(local15, Static183.anInt3590, local19);
		}
		if ((arg0 & 0x40) == 0) {
			return;
		}
		local15 = Static275.aClass8_Sub2_Sub1_6.method2334();
		@Pc(663) byte[] local663 = new byte[local15];
		@Pc(668) Class8_Sub2 local668 = new Class8_Sub2(local663);
		Static275.aClass8_Sub2_Sub1_6.method2367(local15, local663);
		Static44.aClass8_Sub2Array1[arg2] = local668;
		arg1.method3080(local668);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lclient!kj;")
	public static Class95 method2777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class95 local14 = local7.aClass95_1;
			local7.aClass95_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(III)Lclient!e;")
	public static Class8_Sub1_Sub6 method2779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) Class8_Sub1_Sub6 local22 = (Class8_Sub1_Sub6) Static210.aClass129_23.method3043((long) arg1 | (long) arg0 << 32);
		if (local22 == null) {
			local22 = new Class8_Sub1_Sub6(arg0, arg1);
			Static210.aClass129_23.method3039(local22, local22.aLong203);
		}
		return local22;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(III)I")
	public static int method2780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
