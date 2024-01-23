import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt2643;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!lc;")
	public static Class98 aClass98_76;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	public static int anInt2644;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
	public static int[] anIntArray239;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString76 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public static int anInt2646 = 0;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[Lclient!hm;")
	public static Class63[] aClass63Array1 = new Class63[4];

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
	public static int anInt2652 = 1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method2049() {
		anIntArray239 = null;
		aClass63Array1 = null;
		aString76 = null;
		aClass98_76 = null;
		aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method2050(@OriginalArg(1) Class98 arg0) {
		Static294.anInt4284 = arg0.method2376("titlebg");
		Static16.anInt314 = arg0.method2376("logo");
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method2051() {
		Static67.aClass4_Sub9_Sub2_1.method1208();
		Static125.aClass98_78 = null;
		Static42.anInt863 = 1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!v;)V")
	public static void method2052(@OriginalArg(0) Class173 arg0) {
		for (@Pc(2) int local2 = arg0.anInt5149; local2 <= arg0.anInt5163; local2++) {
			for (@Pc(9) int local9 = arg0.anInt5157; local9 <= arg0.anInt5158; local9++) {
				@Pc(22) Class4_Sub11 local22 = Static127.aClass4_Sub11ArrayArrayArray1[arg0.anInt5156][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt1054; local26++) {
						if (local22.aClass173Array1[local26] == arg0) {
							local22.anInt1054--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt1054; local44++) {
								local22.aClass173Array1[local44] = local22.aClass173Array1[local44 + 1];
								local22.anIntArray122[local44] = local22.anIntArray122[local44 + 1];
							}
							local22.aClass173Array1[local22.anInt1054] = null;
							break;
						}
					}
					local22.anInt1056 = 0;
					for (local26 = 0; local26 < local22.anInt1054; local26++) {
						local22.anInt1056 |= local22.anIntArray122[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!g;)V")
	public static void method2053(@OriginalArg(1) Class12_Sub3 arg0) {
		if (arg0.anInt4115 == 0) {
			return;
		}
		@Pc(13) Class72 local13 = arg0.method3361();
		@Pc(44) int local44;
		@Pc(37) int local37;
		if (arg0.anInt4184 != -1 && arg0.anInt4184 < 32768) {
			@Pc(26) Class12_Sub3_Sub1 local26 = Static100.aClass12_Sub3_Sub1Array1[arg0.anInt4184];
			if (local26 != null) {
				local37 = arg0.anInt4113 - local26.anInt4113;
				local44 = arg0.anInt4141 - local26.anInt4141;
				if (local44 != 0 || local37 != 0) {
					arg0.anInt4136 = (int) (Math.atan2((double) local44, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(104) int local104;
		@Pc(76) int local76;
		if (arg0.anInt4184 >= 32768) {
			local76 = arg0.anInt4184 - 32768;
			if (local76 == Static238.anInt4597) {
				local76 = 2047;
			}
			@Pc(86) Class12_Sub3_Sub2 local86 = Static257.aClass12_Sub3_Sub2Array1[local76];
			if (local86 != null) {
				local37 = arg0.anInt4141 - local86.anInt4141;
				local104 = arg0.anInt4113 - local86.anInt4113;
				if (local37 != 0 || local104 != 0) {
					arg0.anInt4136 = (int) (Math.atan2((double) local37, (double) local104) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4156 != 0 || arg0.anInt4147 != 0) && (arg0.anInt4157 == 0 || arg0.anInt4164 > 0)) {
			local76 = arg0.anInt4141 - (arg0.anInt4156 - Static170.anInt3385 - Static170.anInt3385) * 64;
			local44 = arg0.anInt4113 - (arg0.anInt4147 - Static239.anInt4613 - Static239.anInt4613) * 64;
			if (local76 != 0 || local44 != 0) {
				arg0.anInt4136 = (int) (Math.atan2((double) local76, (double) local44) * 325.949D) & 0x7FF;
			}
			arg0.anInt4147 = 0;
			arg0.anInt4156 = 0;
		}
		local76 = arg0.anInt4136 - arg0.anInt4121 & 0x7FF;
		if (local76 == 0) {
			arg0.anInt4176 = 0;
			arg0.anInt4140 = 0;
		} else if (local13.anInt2572 == 0) {
			arg0.anInt4140++;
			@Pc(241) boolean local241;
			if (local76 > 1024) {
				arg0.anInt4121 -= arg0.anInt4115;
				local241 = true;
				if (arg0.anInt4115 > local76 || 2048 - arg0.anInt4115 < local76) {
					local241 = false;
					arg0.anInt4121 = arg0.anInt4136;
				}
				if (arg0.anInt4140 > 25 || local241) {
					arg0.anInt4127 = local13.anInt2583;
					if (arg0.anInt4157 <= 0) {
						if (local13.anInt2552 != -1) {
							arg0.anInt4127 = local13.anInt2552;
						}
					} else if (arg0.aByteArray59[arg0.anInt4157 - 1] == 2) {
						if (local13.anInt2553 != -1) {
							arg0.anInt4127 = local13.anInt2553;
						} else if (local13.anInt2556 != -1) {
							arg0.anInt4127 = local13.anInt2556;
						}
					} else if (arg0.aByteArray59[arg0.anInt4157 - 1] == 0) {
						if (local13.anInt2547 != -1) {
							arg0.anInt4127 = local13.anInt2547;
						} else if (local13.anInt2566 != -1) {
							arg0.anInt4127 = local13.anInt2566;
						}
					} else if (local13.anInt2562 != -1) {
						arg0.anInt4127 = local13.anInt2562;
					}
				}
			} else {
				arg0.anInt4121 += arg0.anInt4115;
				local241 = true;
				if (local76 < arg0.anInt4115 || local76 > 2048 - arg0.anInt4115) {
					local241 = false;
					arg0.anInt4121 = arg0.anInt4136;
				}
				if (arg0.anInt4140 > 25 || local241) {
					arg0.anInt4127 = local13.anInt2583;
					if (arg0.anInt4157 <= 0) {
						if (local13.anInt2567 != -1) {
							arg0.anInt4127 = local13.anInt2567;
						}
					} else if (arg0.aByteArray59[arg0.anInt4157 - 1] == 2) {
						if (local13.anInt2571 != -1) {
							arg0.anInt4127 = local13.anInt2571;
						} else if (local13.anInt2556 != -1) {
							arg0.anInt4127 = local13.anInt2556;
						}
					} else if (arg0.aByteArray59[arg0.anInt4157 - 1] == 0) {
						if (local13.anInt2568 != -1) {
							arg0.anInt4127 = local13.anInt2568;
						} else if (local13.anInt2566 != -1) {
							arg0.anInt4127 = local13.anInt2566;
						}
					} else if (local13.anInt2554 != -1) {
						arg0.anInt4127 = local13.anInt2554;
					}
				}
			}
			arg0.anInt4121 &= 0x7FF;
		} else {
			arg0.anInt4127 = -1;
			local44 = arg0.anInt4136 << 5;
			if (local44 != arg0.anInt4124) {
				local104 = arg0.anInt4176 * arg0.anInt4176 / (local13.anInt2572 * 2);
				local37 = local44 - arg0.anInt4150 & 0xFFFF;
				arg0.anInt4165 = 0;
				@Pc(563) int local563;
				if (arg0.anInt4176 > 0 && local104 <= local37 && local37 - local104 < 32768) {
					arg0.anInt4143 = local37 / 2;
					arg0.aBoolean274 = true;
					local563 = local13.anInt2561 * local13.anInt2561 / (local13.anInt2572 * 2);
					if (local563 > 32767) {
						local563 = 32767;
					}
					if (local563 < arg0.anInt4143) {
						arg0.anInt4143 = local37 - local563;
					}
				} else if (arg0.anInt4176 < 0 && local104 <= 65536 - local37 && 65536 - local104 - local37 < 32768) {
					arg0.anInt4143 = (65536 - local37) / 2;
					local563 = local13.anInt2561 * local13.anInt2561 / (local13.anInt2572 * 2);
					arg0.aBoolean274 = true;
					if (local563 > 32767) {
						local563 = 32767;
					}
					if (local563 < arg0.anInt4143) {
						arg0.anInt4143 = 65536 - local37 - local563;
					}
				} else {
					arg0.aBoolean274 = false;
				}
				arg0.anInt4124 = local44;
			}
			if (arg0.anInt4176 == 0) {
				local37 = arg0.anInt4124 - arg0.anInt4150 & 0xFFFF;
				if (local13.anInt2572 > local37) {
					arg0.anInt4150 = arg0.anInt4124;
				} else {
					arg0.aBoolean274 = true;
					local104 = local13.anInt2561 * local13.anInt2561 / (local13.anInt2572 * 2);
					if (local104 > 32767) {
						local104 = 32767;
					}
					arg0.anInt4165 = 0;
					if (local37 >= 32768) {
						arg0.anInt4143 = (65536 - local37) / 2;
						if (local104 < arg0.anInt4143) {
							arg0.anInt4143 = 65536 - local104 - local37;
						}
						arg0.anInt4176 = -local13.anInt2572;
					} else {
						arg0.anInt4143 = local37 / 2;
						arg0.anInt4176 = local13.anInt2572;
						if (arg0.anInt4143 > local104) {
							arg0.anInt4143 = local37 - local104;
						}
					}
				}
			} else if (arg0.anInt4176 > 0) {
				if (arg0.anInt4165 >= arg0.anInt4143) {
					arg0.aBoolean274 = false;
				}
				if (!arg0.aBoolean274) {
					arg0.anInt4176 -= local13.anInt2572;
					if (arg0.anInt4176 < 0) {
						arg0.anInt4176 = 0;
					}
				} else if (arg0.anInt4176 < local13.anInt2561) {
					arg0.anInt4176 += local13.anInt2572;
				}
			} else {
				if (arg0.anInt4165 >= arg0.anInt4143) {
					arg0.aBoolean274 = false;
				}
				if (!arg0.aBoolean274) {
					arg0.anInt4176 += local13.anInt2572;
					if (arg0.anInt4176 > 0) {
						arg0.anInt4176 = 0;
					}
				} else if (-local13.anInt2561 < arg0.anInt4176) {
					arg0.anInt4176 -= local13.anInt2572;
				}
			}
			arg0.anInt4150 += arg0.anInt4176;
			if (arg0.anInt4176 <= 0) {
				arg0.anInt4165 -= arg0.anInt4176;
			} else {
				arg0.anInt4165 += arg0.anInt4176;
			}
			arg0.anInt4150 &= 0xFFFF;
			arg0.anInt4121 = arg0.anInt4150 >> 5;
			if (arg0.anInt4176 >= 0) {
				if (arg0.anInt4157 > 0) {
					if (arg0.aByteArray59[arg0.anInt4157 - 1] == 2) {
						if (local13.anInt2571 != -1) {
							arg0.anInt4127 = local13.anInt2571;
						} else if (local13.anInt2556 != -1) {
							arg0.anInt4127 = local13.anInt2556;
						}
					} else if (arg0.aByteArray59[arg0.anInt4157 - 1] == 0) {
						if (local13.anInt2568 != -1) {
							arg0.anInt4127 = local13.anInt2568;
						} else if (local13.anInt2566 != -1) {
							arg0.anInt4127 = local13.anInt2566;
						}
					}
				}
				if (arg0.anInt4127 == -1) {
					if (local13.anInt2554 != -1) {
						arg0.anInt4127 = local13.anInt2554;
					} else if (local13.anInt2567 != -1) {
						arg0.anInt4127 = local13.anInt2567;
					}
				}
			} else {
				if (arg0.anInt4157 > 0) {
					if (arg0.aByteArray59[arg0.anInt4157 - 1] == 2) {
						if (local13.anInt2553 != -1) {
							arg0.anInt4127 = local13.anInt2553;
						} else if (local13.anInt2556 != -1) {
							arg0.anInt4127 = local13.anInt2556;
						}
					} else if (arg0.aByteArray59[arg0.anInt4157 - 1] == 0) {
						if (local13.anInt2547 != -1) {
							arg0.anInt4127 = local13.anInt2547;
						} else if (local13.anInt2566 != -1) {
							arg0.anInt4127 = local13.anInt2566;
						}
					}
				}
				if (arg0.anInt4127 == -1) {
					if (local13.anInt2562 != -1) {
						arg0.anInt4127 = local13.anInt2562;
					} else if (local13.anInt2552 != -1) {
						arg0.anInt4127 = local13.anInt2552;
					}
				}
			}
			if (arg0.anInt4127 == -1) {
				arg0.anInt4127 = local13.anInt2583;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIBIIZ)V")
	public static void method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg2 && Static25.anInt450 == arg3 && Static257.anInt4842 == arg4 && (Static168.anInt3342 == arg0 || Static62.method957())) {
			return;
		}
		Static257.anInt4842 = arg4;
		Static168.anInt3342 = arg0;
		Static25.anInt450 = arg3;
		if (Static62.method957()) {
			Static168.anInt3342 = 0;
		}
		if (arg6) {
			Static264.method3976(28);
		} else {
			Static264.method3976(25);
		}
		Static265.method3986(Static86.aString50, true);
		@Pc(49) int local49 = Static170.anInt3385;
		@Pc(51) int local51 = Static239.anInt4613;
		Static239.anInt4613 = arg4 * 8 - 48;
		Static170.anInt3385 = arg3 * 8 - 48;
		Static117.aClass4_Sub2_Sub9_2 = Static217.method3492(Static257.anInt4842 * 8, Static25.anInt450 * 8);
		@Pc(76) int local76 = Static239.anInt4613 - local51;
		Static158.aClass9_1 = null;
		@Pc(84) int local84 = Static170.anInt3385 - local49;
		@Pc(92) int local92;
		@Pc(101) Class12_Sub3_Sub1 local101;
		@Pc(137) int local137;
		if (arg6) {
			Static68.anInt1262 = 0;
			for (local92 = 0; local92 < 32768; local92++) {
				local101 = Static100.aClass12_Sub3_Sub1Array1[local92];
				if (local101 != null) {
					local101.anInt4113 -= local76 * 128;
					local101.anInt4141 -= local84 * 128;
					if (local101.anInt4141 >= 0 && local101.anInt4141 <= 13184 && local101.anInt4113 >= 0 && local101.anInt4113 <= 13184) {
						for (local137 = 0; local137 < 10; local137++) {
							local101.anIntArray376[local137] -= local84;
							local101.anIntArray379[local137] -= local76;
						}
						Static10.anIntArray20[Static68.anInt1262++] = local92;
					} else {
						Static100.aClass12_Sub3_Sub1Array1[local92].method1562(null);
						Static100.aClass12_Sub3_Sub1Array1[local92] = null;
					}
				}
			}
		} else {
			for (local92 = 0; local92 < 32768; local92++) {
				local101 = Static100.aClass12_Sub3_Sub1Array1[local92];
				if (local101 != null) {
					for (local137 = 0; local137 < 10; local137++) {
						local101.anIntArray376[local137] -= local84;
						local101.anIntArray379[local137] -= local76;
					}
					local101.anInt4141 -= local84 * 128;
					local101.anInt4113 -= local76 * 128;
				}
			}
		}
		for (local92 = 0; local92 < 2048; local92++) {
			@Pc(250) Class12_Sub3_Sub2 local250 = Static257.aClass12_Sub3_Sub2Array1[local92];
			if (local250 != null) {
				for (local137 = 0; local137 < 10; local137++) {
					local250.anIntArray376[local137] -= local84;
					local250.anIntArray379[local137] -= local76;
				}
				local250.anInt4113 -= local76 * 128;
				local250.anInt4141 -= local84 * 128;
			}
		}
		Static210.anInt4103 = arg0;
		@Pc(301) byte local301 = 0;
		@Pc(303) byte local303 = 104;
		@Pc(305) byte local305 = 1;
		if (local84 < 0) {
			local305 = -1;
			local301 = 103;
			local303 = -1;
		}
		@Pc(319) byte local319 = 0;
		@Pc(321) byte local321 = 104;
		@Pc(323) byte local323 = 1;
		if (local76 < 0) {
			local323 = -1;
			local321 = -1;
			local319 = 103;
		}
		Static239.aClass12_Sub3_Sub2_2.method3383(arg1, arg5, false);
		for (@Pc(342) int local342 = local301; local342 != local303; local342 += local305) {
			for (@Pc(351) int local351 = local319; local351 != local321; local351 += local323) {
				@Pc(362) int local362 = local84 + local342;
				@Pc(366) int local366 = local76 + local351;
				for (@Pc(368) int local368 = 0; local368 < 4; local368++) {
					if (local362 >= 0 && local366 >= 0 && local362 < 104 && local366 < 104) {
						Static10.aClass10ArrayArrayArray1[local368][local342][local351] = Static10.aClass10ArrayArrayArray1[local368][local362][local366];
					} else {
						Static10.aClass10ArrayArrayArray1[local368][local342][local351] = null;
					}
				}
			}
		}
		for (@Pc(436) Class4_Sub30 local436 = (Class4_Sub30) Static231.aClass10_47.method190(); local436 != null; local436 = (Class4_Sub30) Static231.aClass10_47.method191()) {
			local436.anInt5329 -= local84;
			local436.anInt5331 -= local76;
			if (local436.anInt5329 < 0 || local436.anInt5331 < 0 || local436.anInt5329 >= 104 || local436.anInt5331 >= 104) {
				local436.method4391();
			}
		}
		if (arg6) {
			Static18.anInt383 -= local76;
			Static149.anInt3032 -= local84 * 128;
			Static27.anInt1300 -= local76;
			Static211.anInt4210 -= local76 * 128;
			Static266.anInt5000 -= local84;
			Static246.anInt5549 -= local84;
		} else {
			Static239.anInt4616 = 1;
		}
		Static7.anInt173 = 0;
		if (Static207.anInt4065 != 0) {
			Static296.anInt1762 -= local76;
			Static207.anInt4065 -= local84;
		}
		if (Static178.aBoolean216 && arg6 && (Math.abs(local84) > 104 || Math.abs(local76) > 104)) {
			Static6.method133();
		}
		Static103.anInt2191 = -1;
		Static209.aClass10_61.method192();
		Static241.aClass10_50.method192();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)V")
	public static void method2055() {
		Static247.aClass33_35.method838(5);
	}
}
