import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!om", name = "z", descriptor = "Lclient!nk;")
	public static Class121 aClass121_91;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "Lclient!db;")
	public static Class31 aClass31_3;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "Lclient!vd;")
	public static Class185 aClass185_5;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "Lclient!nk;")
	public static Class121 aClass121_92;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "[S")
	public static short[] aShortArray77;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	public static int anInt3996 = 0;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString226 = "glow3:";

	@OriginalMember(owner = "client!om", name = "O", descriptor = "[I")
	public static int[] anIntArray318 = new int[4];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[Lclient!wb;)V")
	public static void method3342(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub31[] arg1) {
		Static15.aClass1_Sub31ArrayArray1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!o;B)I")
	public static int method3344(@OriginalArg(0) Class15_Sub5_Sub1 arg0) {
		@Pc(16) Class99 local16 = arg0.aClass99_1;
		if (local16.anIntArray255 != null) {
			local16 = local16.method2647();
			if (local16 == null) {
				return -1;
			}
		}
		@Pc(32) int local32 = local16.anInt3072;
		@Pc(36) Class11 local36 = arg0.method4698();
		if (arg0.anInt5569 == local36.anInt206) {
			local32 = local16.anInt3063;
		} else if (local36.anInt187 == arg0.anInt5569 || arg0.anInt5569 == local36.anInt193 || local36.anInt212 == arg0.anInt5569 || arg0.anInt5569 == local36.anInt191) {
			local32 = local16.anInt3071;
		} else if (local36.anInt190 == arg0.anInt5569 || local36.anInt197 == arg0.anInt5569 || local36.anInt181 == arg0.anInt5569 || arg0.anInt5569 == local36.anInt192) {
			local32 = local16.anInt3059;
		}
		return local32;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZII)I")
	public static int method3345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >>> 31;
		return (arg1 + local13) / arg0 - local13;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!wf;)V")
	public static void method3346(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15_Sub5_Sub2 arg2) {
		if ((arg1 & 0x20) != 0) {
			arg2.anInt5517 = Static13.aClass1_Sub14_Sub1_1.method1366();
			arg2.anInt5526 = Static13.aClass1_Sub14_Sub1_1.method1366();
		}
		@Pc(24) int local24;
		@Pc(28) int local28;
		if ((arg1 & 0x80) != 0) {
			local24 = Static13.aClass1_Sub14_Sub1_1.method1362();
			local28 = Static13.aClass1_Sub14_Sub1_1.method1378();
			arg2.method4697(local28, local24, Static313.anInt2966);
			arg2.anInt5566 = Static313.anInt2966 + 300;
			arg2.anInt5528 = Static13.aClass1_Sub14_Sub1_1.method1381();
		}
		@Pc(69) int local69;
		if ((arg1 & 0x2) != 0) {
			local24 = Static13.aClass1_Sub14_Sub1_1.method1366();
			local28 = Static13.aClass1_Sub14_Sub1_1.method1394();
			@Pc(66) int local66 = Static13.aClass1_Sub14_Sub1_1.method1394();
			local69 = Static13.aClass1_Sub14_Sub1_1.anInt1480;
			@Pc(78) boolean local78 = (local24 & 0x8000) != 0;
			if (arg2.aString336 != null && arg2.aClass167_6 != null) {
				@Pc(91) long local91 = Static124.method4681(arg2.aString336);
				@Pc(93) boolean local93 = false;
				if (local28 <= 1) {
					if (!local78 && (Static232.aBoolean293 && !Static180.aBoolean233 || Static272.aBoolean387)) {
						local93 = true;
					} else {
						for (@Pc(114) int local114 = 0; local114 < Static72.anInt5402; local114++) {
							if (Static29.aLongArray3[local114] == local91) {
								local93 = true;
								break;
							}
						}
					}
				}
				if (!local93 && Static255.anInt4630 == 0) {
					Static181.aClass1_Sub14_7.anInt1480 = 0;
					Static13.aClass1_Sub14_Sub1_1.method1355(local66, Static181.aClass1_Sub14_7.aByteArray17);
					@Pc(153) int local153 = -1;
					Static181.aClass1_Sub14_7.anInt1480 = 0;
					@Pc(177) String local177;
					if (local78) {
						local24 &= 0x7FFF;
						@Pc(168) Class172 local168 = Static237.method3672(Static181.aClass1_Sub14_7);
						local153 = local168.anInt4960;
						local177 = local168.aClass1_Sub2_Sub7_1.method2216(Static181.aClass1_Sub14_7);
					} else {
						local177 = Static78.method4019(Static166.method2836(Static160.method2755(Static181.aClass1_Sub14_7)));
					}
					arg2.aString335 = local177.trim();
					arg2.anInt5546 = 150;
					arg2.anInt5558 = local24 >> 8;
					arg2.anInt5592 = local24 & 0xFF;
					if (local28 == 2) {
						Static45.method885(local153, "<img=1>" + arg2.method4710(), null, local78 ? 17 : 1, local177);
					} else if (local28 == 1) {
						Static45.method885(local153, "<img=0>" + arg2.method4710(), null, local78 ? 17 : 1, local177);
					} else {
						Static45.method885(local153, arg2.method4710(), null, local78 ? 17 : 2, local177);
					}
				}
			}
			Static13.aClass1_Sub14_Sub1_1.anInt1480 = local66 + local69;
		}
		if ((arg1 & 0x800) != 0) {
			local24 = Static13.aClass1_Sub14_Sub1_1.method1362();
			local28 = Static13.aClass1_Sub14_Sub1_1.method1378();
			arg2.method4697(local28, local24, Static313.anInt2966);
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt5555 = Static13.aClass1_Sub14_Sub1_1.method1397();
			arg2.anInt5533 = Static13.aClass1_Sub14_Sub1_1.method1378();
			arg2.anInt5523 = Static13.aClass1_Sub14_Sub1_1.method1381();
			arg2.anInt5579 = Static13.aClass1_Sub14_Sub1_1.method1381();
			arg2.anInt5564 = Static13.aClass1_Sub14_Sub1_1.method1383() + Static313.anInt2966;
			arg2.anInt5571 = Static13.aClass1_Sub14_Sub1_1.method1367() + Static313.anInt2966;
			arg2.anInt5561 = Static13.aClass1_Sub14_Sub1_1.method1397();
			arg2.anInt5589 = 0;
			arg2.anInt5578 = 1;
		}
		if ((arg1 & 0x200) != 0) {
			local24 = Static13.aClass1_Sub14_Sub1_1.method1381();
			@Pc(368) int[] local368 = new int[local24];
			@Pc(371) int[] local371 = new int[local24];
			@Pc(374) int[] local374 = new int[local24];
			for (@Pc(376) int local376 = 0; local376 < local24; local376++) {
				@Pc(385) int local385 = Static13.aClass1_Sub14_Sub1_1.method1383();
				if (local385 == 65535) {
					local385 = -1;
				}
				local371[local376] = local385;
				local368[local376] = Static13.aClass1_Sub14_Sub1_1.method1381();
				local374[local376] = Static13.aClass1_Sub14_Sub1_1.method1383();
			}
			Static248.method3929(local368, arg2, local374, local371);
		}
		if ((arg1 & 0x4) != 0) {
			arg2.aString335 = Static13.aClass1_Sub14_Sub1_1.method1375();
			if (arg2.aString335.charAt(0) == '~') {
				arg2.aString335 = arg2.aString335.substring(1);
				Static243.method4744(arg2.aString335, 2, arg2.method4710());
			} else if (Static90.aClass15_Sub5_Sub2_2 == arg2) {
				Static243.method4744(arg2.aString335, 2, arg2.method4710());
			}
			arg2.anInt5592 = 0;
			arg2.anInt5546 = 150;
			arg2.anInt5558 = 0;
		}
		if ((arg1 & 0x10) != 0) {
			local24 = Static13.aClass1_Sub14_Sub1_1.method1383();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static13.aClass1_Sub14_Sub1_1.method1394();
			Static299.method4547(arg2, local24, local28);
		}
		if ((arg1 & 0x100) != 0) {
			local24 = Static13.aClass1_Sub14_Sub1_1.method1367();
			if (local24 == 65535) {
				local24 = -1;
			}
			@Pc(525) boolean local525 = true;
			local28 = Static13.aClass1_Sub14_Sub1_1.method1392();
			if (local24 != -1 && arg2.anInt5510 != -1 && Static80.method1561(Static55.method978(local24).anInt3473).anInt4512 < Static80.method1561(Static55.method978(arg2.anInt5510).anInt3473).anInt4512) {
				local525 = false;
			}
			if (local525) {
				arg2.anInt5580 = 1;
				arg2.anInt5576 = local28 >> 16;
				arg2.anInt5510 = local24;
				arg2.anInt5590 = 0;
				arg2.anInt5547 = 0;
				arg2.anInt5535 = (local28 & 0xFFFF) + Static313.anInt2966;
				if (arg2.anInt5535 > Static313.anInt2966) {
					arg2.anInt5590 = -1;
				}
				if (arg2.anInt5510 != -1 && Static313.anInt2966 == arg2.anInt5535) {
					local69 = Static55.method978(arg2.anInt5510).anInt3473;
					if (local69 != -1) {
						@Pc(613) Class157 local613 = Static80.method1561(local69);
						if (local613 != null && local613.anIntArray396 != null) {
							Static31.method503(local613, 0, arg2.anInt5557, Static90.aClass15_Sub5_Sub2_2 == arg2, arg2.anInt5559);
						}
					}
				}
			}
		}
		if ((arg1 & 0x1) != 0) {
			local24 = Static13.aClass1_Sub14_Sub1_1.method1394();
			@Pc(649) byte[] local649 = new byte[local24];
			@Pc(654) Class1_Sub14 local654 = new Class1_Sub14(local649);
			Static13.aClass1_Sub14_Sub1_1.method1343(local24, local649);
			Static252.aClass1_Sub14Array1[arg0] = local654;
			arg2.method4706(local654);
		}
		if ((arg1 & 0x8) != 0) {
			arg2.anInt5581 = Static13.aClass1_Sub14_Sub1_1.method1366();
			if (arg2.anInt5581 == 65535) {
				arg2.anInt5581 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	public static void method3347() {
		Static285.aClass187_143.method4530();
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Lclient!ua;")
	public static Class175 method3349(@OriginalArg(0) int arg0) {
		@Pc(6) Class175 local6 = (Class175) Static53.aClass187_33.method4527((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static69.aClass121_122.method3115(36, arg0);
		local6 = new Class175();
		local6.anInt5006 = arg0;
		if (local28 != null) {
			local6.method4288(new Class1_Sub14(local28));
		}
		Static53.aClass187_33.method4524((long) arg0, local6);
		return local6;
	}
}
