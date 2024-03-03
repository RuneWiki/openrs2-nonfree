import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!rn;")
	public static Class205 aClass205_6;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!mr;BZ)V", line = 11)
	public static void method5549(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class222 local9 = arg0.method4333();
		if (arg0.anInt4634 == 0) {
			arg0.anInt4632 = 0;
			Static16.anInt4746 = 0;
			Static159.anInt3225 = -1;
			return;
		}
		if (arg0.anInt4589 != -1 && arg0.anInt4582 == 0) {
			@Pc(39) Class157 local39 = Static37.aClass85_1.method2373(arg0.anInt4589);
			if (arg0.anInt4633 > 0 && local39.anInt4022 == 0) {
				Static16.anInt4746 = 0;
				Static159.anInt3225 = -1;
				arg0.anInt4632++;
				return;
			}
			if (arg0.anInt4633 <= 0 && local39.anInt4024 == 0) {
				Static159.anInt3225 = -1;
				Static16.anInt4746 = 0;
				arg0.anInt4632++;
				return;
			}
		}
		if (arg0.anInt4586 != -1 && arg0.anInt4587 <= Class83.anInt2345) {
			@Pc(97) Class91 local97 = Static299.aClass211_2.method5408(arg0.anInt4586);
			if (local97.aBoolean177 && local97.anInt2445 != -1) {
				@Pc(111) Class157 local111 = Static37.aClass85_1.method2373(local97.anInt2445);
				if (arg0.anInt4633 > 0 && local111.anInt4022 == 0) {
					Static16.anInt4746 = 0;
					arg0.anInt4632++;
					Static159.anInt3225 = -1;
					return;
				}
				if (arg0.anInt4633 <= 0 && local111.anInt4024 == 0) {
					arg0.anInt4632++;
					Static159.anInt3225 = -1;
					Static16.anInt4746 = 0;
					return;
				}
			}
		}
		@Pc(154) int local154 = arg0.anInt6768;
		@Pc(157) int local157 = arg0.anInt6770;
		@Pc(174) int local174 = arg0.anIntArray316[arg0.anInt4634 - 1] * 128 + arg0.method4329() * 64;
		@Pc(191) int local191 = arg0.anIntArray317[arg0.anInt4634 - 1] * 128 + arg0.method4329() * 64;
		if (local174 > local154) {
			if (local157 < local191) {
				arg0.method4326(10240);
			} else if (local191 >= local157) {
				arg0.method4326(12288);
			} else {
				arg0.method4326(14336);
			}
		} else if (local154 > local174) {
			if (local191 > local157) {
				arg0.method4326(6144);
			} else if (local157 > local191) {
				arg0.method4326(2048);
			} else {
				arg0.method4326(4096);
			}
		} else if (local191 > local157) {
			arg0.method4326(8192);
		} else if (local191 < local157) {
			arg0.method4326(0);
		}
		@Pc(289) byte local289 = arg0.aByteArray51[arg0.anInt4634 - 1];
		if (!arg1 && (local174 - local154 > 256 || local174 - local154 < -256 || local191 - local157 > 256 || local191 - local157 < -256)) {
			arg0.anInt6770 = local191;
			arg0.anInt6768 = local174;
			arg0.method4331(arg0.anInt4607);
			arg0.anInt4634--;
			Static159.anInt3225 = -1;
			if (arg0.anInt4633 > 0) {
				arg0.anInt4633--;
			}
			Static16.anInt4746 = 0;
			return;
		}
		@Pc(354) int local354 = 4;
		@Pc(356) boolean local356 = true;
		if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			local356 = ((Class11_Sub5_Sub2_Sub2) arg0).aClass71_1.aBoolean143;
		}
		@Pc(396) int local396;
		if (local356) {
			local396 = arg0.anInt4607 - arg0.aClass248_7.anInt7184;
			if (local396 != 0 && arg0.anInt4602 == -1 && arg0.anInt4596 != 0) {
				local354 = 2;
			}
			if (!arg1 && arg0.anInt4634 > 2) {
				local354 = 6;
			}
			if (!arg1 && arg0.anInt4634 > 3) {
				local354 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4634 > 1) {
				local354 = 6;
			}
			if (!arg1 && arg0.anInt4634 > 2) {
				local354 = 8;
			}
		}
		if (arg0.anInt4632 > 0 && arg0.anInt4634 > 1) {
			arg0.anInt4632--;
			local354 = 8;
		}
		if (local289 == 2) {
			local354 <<= 0x1;
		} else if (local289 == 0) {
			local354 >>= 0x1;
		}
		Static16.anInt4746 = 0;
		if (local9.anInt6262 != -1) {
			local354 <<= 0x7;
			if (arg0.anInt4634 == 1) {
				local396 = arg0.anInt4631 * arg0.anInt4631;
				@Pc(554) int local554 = (local174 >= arg0.anInt6768 ? local174 - arg0.anInt6768 : -local174 + arg0.anInt6768) << 7;
				@Pc(572) int local572 = (arg0.anInt6770 <= local191 ? local191 - arg0.anInt6770 : -local191 + arg0.anInt6770) << 7;
				@Pc(583) int local583 = local572 < local554 ? local554 : local572;
				@Pc(590) int local590 = local9.anInt6262 * 2 * local583;
				if (local396 > local590) {
					arg0.anInt4631 /= 2;
				} else if (local583 < local396 / 2) {
					arg0.anInt4631 -= local9.anInt6262;
					if (arg0.anInt4631 < 0) {
						arg0.anInt4631 = 0;
					}
				} else if (local354 > arg0.anInt4631) {
					arg0.anInt4631 += local9.anInt6262;
					if (local354 < arg0.anInt4631) {
						arg0.anInt4631 = local354;
					}
				}
			} else if (local354 > arg0.anInt4631) {
				arg0.anInt4631 += local9.anInt6262;
				if (local354 < arg0.anInt4631) {
					arg0.anInt4631 = local354;
				}
			} else if (arg0.anInt4631 > 0) {
				arg0.anInt4631 -= local9.anInt6262;
				if (arg0.anInt4631 < 0) {
					arg0.anInt4631 = 0;
				}
			}
			local354 = arg0.anInt4631 >> 7;
			if (local354 < 1) {
				local354 = 1;
			}
		}
		if (local154 < local174) {
			Static16.anInt4746 |= 0x4;
			arg0.anInt6768 += local354;
			if (local174 < arg0.anInt6768) {
				arg0.anInt6768 = local174;
			}
		} else if (local174 < local154) {
			Static16.anInt4746 |= 0x8;
			arg0.anInt6768 -= local354;
			if (local174 > arg0.anInt6768) {
				arg0.anInt6768 = local174;
			}
		}
		if (local157 < local191) {
			arg0.anInt6770 += local354;
			Static16.anInt4746 |= 0x1;
			if (local191 < arg0.anInt6770) {
				arg0.anInt6770 = local191;
			}
		} else if (local157 > local191) {
			Static16.anInt4746 |= 0x2;
			arg0.anInt6770 -= local354;
			if (local191 > arg0.anInt6770) {
				arg0.anInt6770 = local191;
			}
		}
		if (local354 < 8) {
			Static159.anInt3225 = local289;
		} else {
			Static159.anInt3225 = 2;
		}
		if (local174 != arg0.anInt6768 || local191 != arg0.anInt6770) {
			return;
		}
		arg0.anInt4634--;
		if (arg0.anInt4633 > 0) {
			arg0.anInt4633--;
			return;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V", line = 316)
	public static void method5550(@OriginalArg(1) int arg0) {
		Static216.anInt4193 = arg0;
		@Pc(15) Class98 local15 = Class230.aClass98_58;
		synchronized (Class230.aClass98_58) {
			Class230.aClass98_58.method2616();
		}
		local15 = Class68.aClass98_9;
		synchronized (Class68.aClass98_9) {
			Class68.aClass98_9.method2616();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!bt;I)V", line = 345)
	public static void method5552(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(9) int local9 = arg0.method4818();
		Static338.aClass124Array1 = new Class124[local9];
		for (@Pc(22) int local22 = 0; local22 < local9; local22++) {
			Static338.aClass124Array1[local22] = new Class124();
			Static338.aClass124Array1[local22].anInt3401 = arg0.method4818();
			Static338.aClass124Array1[local22].aString28 = arg0.method4857();
		}
		Static350.anInt7029 = arg0.method4818();
		Static289.anInt5831 = arg0.method4818();
		Static276.anInt5631 = arg0.method4818();
		Static272.aClass3_Sub1Array1 = new Class3_Sub1[Static289.anInt5831 + 1 - Static350.anInt7029];
		for (@Pc(70) int local70 = 0; local70 < Static276.anInt5631; local70++) {
			@Pc(76) int local76 = arg0.method4818();
			@Pc(84) Class3_Sub1 local84 = Static272.aClass3_Sub1Array1[local76] = new Class3_Sub1();
			local84.anInt76 = arg0.method4816();
			local84.anInt74 = arg0.method4837();
			local84.anInt81 = local76 + Static350.anInt7029;
			local84.aString1 = arg0.method4857();
			local84.aString2 = arg0.method4857();
		}
		Static336.anInt6754 = arg0.method4837();
		Class55.aBoolean130 = true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!r;Ljava/lang/String;ZI)Lclient!ih;", line = 394)
	public static Class103 method5553(@OriginalArg(0) Class197 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = arg0.method5076(arg1);
		if (local10 == -1) {
			return new Class103(0);
		}
		@Pc(28) int[] local28 = arg0.method5078(local10);
		@Pc(34) Class103 local34 = new Class103(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt2699) {
				@Pc(52) Class2_Sub4 local52 = new Class2_Sub4(arg0.method5090(local28[local38++], local10));
				@Pc(58) int local58 = local52.method4837();
				@Pc(62) int local62 = local52.method4830();
				@Pc(66) int local66 = local52.method4816();
				if (!arg2 && local66 == 1) {
					local34.anInt2699--;
				} else {
					local34.anIntArray170[local36] = local58;
					local34.anIntArray171[local36] = local62;
					local36++;
				}
			}
			return local34;
		}
	}
}
