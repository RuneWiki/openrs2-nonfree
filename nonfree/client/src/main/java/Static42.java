import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_2 = new Class233(260);

	@OriginalMember(owner = "client!bia", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bia", name = "h", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_12 = new Class274(45, -2);

	@OriginalMember(owner = "client!bia", name = "m", descriptor = "[I")
	public static final int[] anIntArray105 = new int[4];

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!pu;B)V")
	public static void method844(@OriginalArg(0) Class266 arg0) {
		@Pc(12) int local12;
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(62) int local62;
		@Pc(68) int local68;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(90) int local90;
		@Pc(107) int local107;
		@Pc(74) int local74;
		if (arg0 == Static237.aClass266_4) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local23 = Static228.anInt4648 * 2 + (local12 >> 4 & 0xF);
			local31 = Static523.anInt8742 * 2 + (local12 & 0xF);
			local35 = Static313.aClass2_Sub34_Sub2_1.method6904();
			@Pc(43) boolean local43 = (local35 & 0x1) != 0;
			@Pc(54) boolean local54 = (local35 & 0x2) != 0;
			local62 = local54 ? local35 >> 2 : -1;
			local68 = Static313.aClass2_Sub34_Sub2_1.method6908() + local23;
			local74 = Static313.aClass2_Sub34_Sub2_1.method6908() + local31;
			local78 = Static313.aClass2_Sub34_Sub2_1.method6856();
			local82 = Static313.aClass2_Sub34_Sub2_1.method6856();
			local86 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local90 = Static313.aClass2_Sub34_Sub2_1.method6904();
			if (local54) {
				local90 = (byte) local90;
			} else {
				local90 *= 4;
			}
			local107 = Static313.aClass2_Sub34_Sub2_1.method6904() * 4;
			@Pc(111) int local111 = Static313.aClass2_Sub34_Sub2_1.method6884();
			@Pc(115) int local115 = Static313.aClass2_Sub34_Sub2_1.method6884();
			@Pc(119) int local119 = Static313.aClass2_Sub34_Sub2_1.method6904();
			@Pc(123) int local123 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (local119 == 255) {
				local119 = -1;
			}
			if (local23 >= 0 && local31 >= 0 && local23 < Static3.anInt46 * 2 && Static3.anInt46 * 2 > local31 && local68 >= 0 && local74 >= 0 && Static270.anInt5194 * 2 > local68 && Static270.anInt5194 * 2 > local74 && local86 != 65535) {
				local107 <<= 0x2;
				local23 = local23 * 256;
				local74 = local74 * 256;
				local90 <<= 0x2;
				local31 *= 256;
				local68 *= 256;
				local123 <<= 0x2;
				if (local78 != 0 && local62 != -1) {
					@Pc(214) Class11_Sub1_Sub1_Sub2 local214 = null;
					@Pc(223) int local223;
					if (local78 >= 0) {
						local223 = local78 - 1;
						@Pc(230) Class2_Sub51 local230 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local223);
						if (local230 != null) {
							local214 = local230.aClass11_Sub1_Sub1_Sub2_Sub2_2;
						}
					} else {
						local223 = -local78 - 1;
						if (Static182.anInt4021 == local223) {
							local214 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2;
						} else {
							local214 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local223];
						}
					}
					if (local214 != null) {
						@Pc(257) Class165 local257 = local214.method2761();
						if (local257.anIntArrayArray39 != null && local257.anIntArrayArray39[local62] != null) {
							local90 -= local257.anIntArrayArray39[local62][1];
						}
						if (local257.anIntArrayArray40 != null && local257.anIntArrayArray40[local62] != null) {
							local90 -= local257.anIntArrayArray40[local62][1];
						}
					}
				}
				@Pc(314) Class11_Sub1_Sub1_Sub5 local314 = new Class11_Sub1_Sub1_Sub5(local86, Static367.anInt6583, Static367.anInt6583, local23, local31, local90, Static325.anInt5888 + local111, local115 + Static325.anInt5888, local119, local123, local78, local82, local107, local43, local62);
				local314.method5645(local68, Static582.method8038(Static367.anInt6583, local68, local74) - local107, local74, Static325.anInt5888 + local111);
				Static280.aClass238_29.method5837(new Class2_Sub5_Sub4(local314));
			}
			return;
		}
		@Pc(372) int local372;
		@Pc(376) int local376;
		if (arg0 == Static548.aClass266_12) {
			Static313.aClass2_Sub34_Sub2_1.method6904();
			local12 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local23 = (local12 >> 4 & 0x7) + Static228.anInt4648;
			local31 = Static523.anInt8742 + (local12 & 0x7);
			local35 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local372 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local376 = Static313.aClass2_Sub34_Sub2_1.method6870();
			@Pc(380) String local380 = Static313.aClass2_Sub34_Sub2_1.method6903();
			Static614.method8356(local380, local372, local35, local376, Static367.anInt6583, local31, local23);
		} else if (Static290.aClass266_6 == arg0) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local23 = Static228.anInt4648 + (local12 >> 4 & 0x7);
			local31 = Static523.anInt8742 + (local12 & 0x7);
			local35 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (local35 == 65535) {
				local35 = -1;
			}
			local372 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local376 = local372 >> 4 & 0xF;
			local62 = local372 & 0x7;
			local68 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local74 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local78 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (local23 >= 0 && local31 >= 0 && Static3.anInt46 > local23 && local31 < Static270.anInt5194) {
				local82 = local376 + 1;
				if (local23 - local82 <= Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0] && local82 + local23 >= Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0] && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] >= local31 - local82 && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] <= local82 + local31) {
					Static352.method5457(local376 + (local23 << 16) + (Static367.anInt6583 << 24) + (local31 << 8), local78, local74, local62, local35, local68);
				}
			}
		} else if (arg0 == Static430.aClass266_8) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local23 = (local12 >> 4 & 0x7) + Static228.anInt4648;
			local31 = (local12 & 0x7) + Static523.anInt8742;
			local35 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local372 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local376 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local62 = Static313.aClass2_Sub34_Sub2_1.method6904();
			if (local23 >= 0 && local31 >= 0 && Static3.anInt46 > local23 && Static270.anInt5194 > local31) {
				local68 = local23 * 512 + 256;
				local74 = local31 * 512 + 256;
				local78 = Static367.anInt6583;
				if (local78 < 3 && Static471.method6782(local31, local23)) {
					local78++;
				}
				@Pc(621) Class11_Sub1_Sub1_Sub4 local621 = new Class11_Sub1_Sub1_Sub4(local35, local376, Static325.anInt5888, Static367.anInt6583, local78, local68, Static582.method8038(Static367.anInt6583, local68, local74) - local372, local74, local23, local23, local31, local31, local62);
				Static147.aClass238_25.method5837(new Class2_Sub5_Sub1(local621));
			}
		} else if (arg0 == Static538.aClass266_11) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local23 = Static313.aClass2_Sub34_Sub2_1.method6904();
			Static619.aClass281_4.method6734(local12).method8087(local23);
		} else if (arg0 == Static431.aClass266_9) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6859();
			local23 = Static313.aClass2_Sub34_Sub2_1.method6879();
			local31 = Static313.aClass2_Sub34_Sub2_1.method6867();
			local35 = Static523.anInt8742 + (local31 & 0x7);
			local372 = Static470.anInt8063 + local35;
			local376 = (local31 >> 4 & 0x7) + Static228.anInt4648;
			local62 = local376 + Static451.anInt7933;
			@Pc(706) boolean local706 = local376 >= 0 && local35 >= 0 && local376 < Static3.anInt46 && local35 < Static270.anInt5194;
			if (local706 || Static304.method4694(Static462.anInt8018)) {
				Static637.method8528(Static367.anInt6583, local372, new Class2_Sub6(local12, local23), local62);
				if (local706) {
					Static228.method3855(Static367.anInt6583, local376, local35);
				}
			}
		} else if (arg0 == Static309.aClass266_7) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6919();
			local23 = Static228.anInt4648 + (local12 >> 4 & 0x7);
			local31 = (local12 & 0x7) + Static523.anInt8742;
			local35 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local372 = local35 >> 2;
			local376 = local35 & 0x3;
			local62 = Static473.anIntArray552[local372];
			if (Static304.method4694(Static462.anInt8018) || local23 >= 0 && local31 >= 0 && local23 < Static3.anInt46 && Static270.anInt5194 > local31) {
				Static520.method7288(Static367.anInt6583, -1, local376, local31, local372, local23, local62);
			}
		} else if (Static555.aClass266_14 == arg0) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local23 = Static523.anInt8742 + (local12 & 0x7);
			local31 = local23 + Static470.anInt8063;
			local35 = (local12 >> 4 & 0x7) + Static228.anInt4648;
			local372 = Static451.anInt7933 + local35;
			local376 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local62 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local68 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (Static64.aClass222_5 != null) {
				@Pc(869) Class2_Sub44 local869 = (Class2_Sub44) Static64.aClass222_5.method5468((long) (Static367.anInt6583 << 28 | local31 << 14 | local372));
				if (local869 != null) {
					for (@Pc(877) Class2_Sub6 local877 = (Class2_Sub6) local869.aClass238_59.method5833(); local877 != null; local877 = (Class2_Sub6) local869.aClass238_59.method5838()) {
						if (local877.anInt842 == (local376 & 0x7FFF) && local877.anInt841 == local62) {
							local877.method8599();
							local877.anInt841 = local68;
							Static637.method8528(Static367.anInt6583, local31, local877, local372);
							break;
						}
					}
					if (local35 >= 0 && local23 >= 0 && Static3.anInt46 > local35 && Static270.anInt5194 > local23) {
						Static228.method3855(Static367.anInt6583, local35, local23);
					}
				}
			}
		} else if (Static37.aClass266_1 == arg0) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6867();
			local23 = Static523.anInt8742 + (local12 & 0x7);
			local31 = Static470.anInt8063 + local23;
			local35 = (local12 >> 4 & 0x7) + Static228.anInt4648;
			local372 = local35 + Static451.anInt7933;
			local376 = Static313.aClass2_Sub34_Sub2_1.method6879();
			@Pc(983) Class2_Sub44 local983 = (Class2_Sub44) Static64.aClass222_5.method5468((long) (local372 | local31 << 14 | Static367.anInt6583 << 28));
			if (local983 != null) {
				for (@Pc(991) Class2_Sub6 local991 = (Class2_Sub6) local983.aClass238_59.method5833(); local991 != null; local991 = (Class2_Sub6) local983.aClass238_59.method5838()) {
					if ((local376 & 0x7FFF) == local991.anInt842) {
						local991.method8599();
						break;
					}
				}
				if (local983.aClass238_59.method5839()) {
					local983.method8599();
				}
				if (local35 >= 0 && local23 >= 0 && Static3.anInt46 > local35 && local23 < Static270.anInt5194) {
					Static228.method3855(Static367.anInt6583, local35, local23);
				}
			}
		} else if (arg0 == Static551.aClass266_13) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6879();
			local23 = Static313.aClass2_Sub34_Sub2_1.method6919();
			local31 = Static228.anInt4648 + (local23 >> 4 & 0x7);
			local35 = (local23 & 0x7) + Static523.anInt8742;
			local372 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local376 = local372 >> 2;
			local62 = local372 & 0x3;
			local68 = Static473.anIntArray552[local376];
			if (Static304.method4694(Static462.anInt8018) || local31 >= 0 && local35 >= 0 && local31 < Static3.anInt46 && Static270.anInt5194 > local35) {
				Static520.method7288(Static367.anInt6583, local12, local62, local35, local376, local31, local68);
			}
		} else if (arg0 == Static269.aClass266_5) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6919();
			local23 = local12 >> 2;
			local31 = local12 & 0x3;
			local35 = Static473.anIntArray552[local23];
			local372 = Static313.aClass2_Sub34_Sub2_1.method6867();
			local376 = (local372 >> 4 & 0x7) + Static228.anInt4648;
			local62 = (local372 & 0x7) + Static523.anInt8742;
			local68 = Static313.aClass2_Sub34_Sub2_1.method6879();
			if (local68 == 65535) {
				local68 = -1;
			}
			Static186.method3336(local68, local31, local376, local62, local23, Static367.anInt6583, local35);
		} else if (Static466.aClass266_3 == arg0) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6904();
			@Pc(1196) boolean local1196 = (local12 & 0x80) != 0;
			local31 = (local12 >> 3 & 0x7) + Static228.anInt4648;
			local35 = Static523.anInt8742 + (local12 & 0x7);
			local372 = local31 + Static313.aClass2_Sub34_Sub2_1.method6908();
			local376 = local35 + Static313.aClass2_Sub34_Sub2_1.method6908();
			local62 = Static313.aClass2_Sub34_Sub2_1.method6856();
			local68 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local74 = Static313.aClass2_Sub34_Sub2_1.method6904() * 4;
			local78 = Static313.aClass2_Sub34_Sub2_1.method6904() * 4;
			local82 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local86 = Static313.aClass2_Sub34_Sub2_1.method6884();
			local90 = Static313.aClass2_Sub34_Sub2_1.method6904();
			if (local90 == 255) {
				local90 = -1;
			}
			local107 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (local31 >= 0 && local35 >= 0 && local31 < Static3.anInt46 && local35 < Static270.anInt5194 && local372 >= 0 && local376 >= 0 && local372 < Static3.anInt46 && local376 < Static270.anInt5194 && local68 != 65535) {
				local31 = local31 * 512 + 256;
				local78 <<= 0x2;
				local74 <<= 0x2;
				local376 = local376 * 512 + 256;
				local372 = local372 * 512 + 256;
				local35 = local35 * 512 + 256;
				local107 <<= 0x2;
				@Pc(1372) Class11_Sub1_Sub1_Sub5 local1372 = new Class11_Sub1_Sub1_Sub5(local68, Static367.anInt6583, Static367.anInt6583, local31, local35, local74, local82 + Static325.anInt5888, local86 - -Static325.anInt5888, local90, local107, 0, local62, local78, local1196, -1);
				local1372.method5645(local372, Static582.method8038(Static367.anInt6583, local372, local376) - local78, local376, local82 + Static325.anInt5888);
				Static280.aClass238_29.method5837(new Class2_Sub5_Sub4(local1372));
			}
		} else if (arg0 == Static589.aClass266_15) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local23 = Static228.anInt4648 + (local12 >> 4 & 0x7);
			local31 = Static523.anInt8742 + (local12 & 0x7);
			local35 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (local35 == 65535) {
				local35 = -1;
			}
			local372 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local376 = local372 >> 4 & 0xF;
			local62 = local372 & 0x7;
			local68 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local74 = Static313.aClass2_Sub34_Sub2_1.method6904();
			local78 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (local23 >= 0 && local31 >= 0 && Static3.anInt46 > local23 && Static270.anInt5194 > local31) {
				local82 = local376 + 1;
				if (local23 - local82 <= Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0] && local23 + local82 >= Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0] && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] >= local31 - local82 && local31 + local82 >= Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0]) {
					Static440.method6542(local74, local35, local68, local62, local78, (local31 << 8) + (local23 << 16) + (Static367.anInt6583 << 24) + local376);
				}
			}
		} else if (arg0 == Static438.aClass266_10) {
			local12 = Static313.aClass2_Sub34_Sub2_1.method6879();
			local23 = Static313.aClass2_Sub34_Sub2_1.method6879();
			local31 = Static313.aClass2_Sub34_Sub2_1.method6919();
			local35 = (local31 & 0x7) + Static523.anInt8742;
			local372 = Static470.anInt8063 + local35;
			local376 = Static228.anInt4648 + (local31 >> 4 & 0x7);
			local62 = Static451.anInt7933 + local376;
			local68 = Static313.aClass2_Sub34_Sub2_1.method6884();
			if (local12 != Static182.anInt4021) {
				@Pc(1598) boolean local1598 = local376 >= 0 && local35 >= 0 && Static3.anInt46 > local376 && Static270.anInt5194 > local35;
				if (local1598 || Static304.method4694(Static462.anInt8018)) {
					Static637.method8528(Static367.anInt6583, local372, new Class2_Sub6(local68, local23), local62);
					if (local1598) {
						Static228.method3855(Static367.anInt6583, local376, local35);
					}
				}
			}
		} else {
			Static420.method6396("T3 - " + arg0, null);
			Static75.method1450(false);
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BLclient!dm;Lclient!ha;II)V")
	public static void method846(@OriginalArg(1) Class78 arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1 local13 = arg0.method1693(arg1);
		if (local13 == null) {
			return;
		}
		arg1.KA(arg3, arg2, arg0.anInt1964 + arg3, arg2 - -arg0.anInt1991);
		if (Static511.anInt7699 == 2 || Static511.anInt7699 == 5 || Static610.aClass20_35 == null) {
			arg1.A(-16777216, local13, arg3, arg2);
			return;
		}
		@Pc(51) int local51;
		@Pc(49) int local49;
		@Pc(57) int local57;
		@Pc(59) int local59;
		if (Static2.anInt31 == 4) {
			local49 = Static61.anInt1274;
			local51 = Static215.anInt4487;
			local57 = (int) -Static378.aFloat160 & 0x3FFF;
			local59 = 4096;
		} else {
			local57 = Static415.anInt7576 + (int) -Static378.aFloat160 & 0x3FFF;
			local49 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929;
			local51 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925;
			local59 = 4096 - Static30.anInt6668 * 16;
		}
		@Pc(94) int local94 = local51 / 128 + 208 + 48 - Static3.anInt46 * 2;
		@Pc(111) int local111 = Static270.anInt5194 * 4 + 208 + 48 - Static270.anInt5194 * 2 - local49 / 128;
		Static610.aClass20_35.method4591((float) arg0.anInt1964 / 2.0F + (float) arg3, (float) arg2 + (float) arg0.anInt1991 / 2.0F, (float) local94, (float) local111, local59, local57 << 2, local13, arg3, arg2);
		@Pc(161) int local161;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(193) int local193;
		for (@Pc(145) Class2_Sub15 local145 = (Class2_Sub15) Static84.aClass238_10.method5833(); local145 != null; local145 = (Class2_Sub15) Static84.aClass238_10.method5838()) {
			@Pc(149) int local149 = local145.anInt1789;
			local161 = (Static318.aClass313_2.anIntArray621[local149] >> 14 & 0x3FFF) - Static451.anInt7933;
			local171 = (Static318.aClass313_2.anIntArray621[local149] & 0x3FFF) - Static470.anInt8063;
			local182 = local161 * 4 + 2 - local51 / 128;
			local193 = local171 * 4 + 2 - local49 / 128;
			Static472.method6792(local13, Static318.aClass313_2.anIntArray622[local149], local182, arg2, arg0, local193, arg3, arg1);
		}
		for (local161 = 0; local161 < Static576.anInt9510; local161++) {
			local171 = Static299.anIntArray378[local161] * 4 + 2 - local51 / 128;
			local182 = Static633.anIntArray730[local161] * 4 + 2 - local49 / 128;
			@Pc(248) Class350 local248 = Static619.aClass281_4.method6734(Static397.anIntArray492[local161]);
			if (local248.anIntArray665 != null) {
				local248 = local248.method8080(Static438.aClass198_1);
				if (local248 == null || local248.anInt9608 == -1) {
					continue;
				}
			}
			Static472.method6792(local13, local248.anInt9608, local171, arg2, arg0, local182, arg3, arg1);
		}
		@Pc(329) int local329;
		@Pc(340) int local340;
		for (@Pc(287) Class2_Sub44 local287 = (Class2_Sub44) Static64.aClass222_5.method5474(); local287 != null; local287 = (Class2_Sub44) Static64.aClass222_5.method5472()) {
			local182 = (int) (local287.aLong287 >> 28 & 0x3L);
			if (local182 == Static376.anInt6732) {
				local193 = (int) (local287.aLong287 & 0x3FFFL) - Static451.anInt7933;
				@Pc(318) int local318 = (int) (local287.aLong287 >> 14 & 0x3FFFL) - Static470.anInt8063;
				local329 = local193 * 4 + 2 - local51 / 128;
				local340 = local318 * 4 + 2 - local49 / 128;
				Static190.method8303(arg3, arg2, arg0, Static169.aClass20Array15[0], local329, local340, local13);
			}
		}
		@Pc(424) int local424;
		for (local182 = 0; local182 < Static228.anInt4647; local182++) {
			@Pc(370) Class2_Sub51 local370 = (Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local182]);
			if (local370 != null) {
				@Pc(375) Class11_Sub1_Sub1_Sub2_Sub2 local375 = local370.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				if (local375.method2780() && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 == local375.aByte124) {
					@Pc(387) Class236 local387 = local375.aClass236_1;
					if (local387 != null && local387.anIntArray462 != null) {
						local387 = local387.method5779(Static438.aClass198_1);
					}
					if (local387 != null && local387.aBoolean513 && local387.aBoolean515) {
						local340 = local375.anInt9925 / 128 - local51 / 128;
						local424 = local375.anInt9929 / 128 - local49 / 128;
						if (local387.anInt6889 == -1) {
							Static190.method8303(arg3, arg2, arg0, Static169.aClass20Array15[1], local340, local424, local13);
						} else {
							Static472.method6792(local13, local387.anInt6889, local340, arg2, arg0, local424, arg3, arg1);
						}
					}
				}
			}
		}
		local193 = Static571.anInt9395;
		@Pc(464) int[] local464 = Static131.anIntArray213;
		@Pc(508) int local508;
		@Pc(512) int local512;
		@Pc(535) int local535;
		for (local329 = 0; local329 < local193; local329++) {
			@Pc(473) Class11_Sub1_Sub1_Sub2_Sub1 local473 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local464[local329]];
			if (local473 != null && local473.method420() && !local473.aBoolean48 && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 != local473 && local473.aByte124 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124) {
				local424 = local473.anInt9925 / 128 - local51 / 128;
				local508 = local473.anInt9929 / 128 - local49 / 128;
				@Pc(510) boolean local510 = false;
				for (local512 = 0; local512 < Static446.anInt7901; local512++) {
					if (local473.aString4.equals(Static391.aStringArray25[local512]) && Static59.anIntArray128[local512] != 0) {
						local510 = true;
						break;
					}
				}
				@Pc(533) boolean local533 = false;
				for (local535 = 0; local535 < Static531.anInt8877; local535++) {
					if (local473.aString4.equals(Static561.aClass345Array1[local535].aString85)) {
						local533 = true;
						break;
					}
				}
				@Pc(553) boolean local553 = false;
				if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt538 != 0 && local473.anInt538 != 0 && local473.anInt538 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt538) {
					local553 = true;
				}
				if (local473.aBoolean47) {
					Static190.method8303(arg3, arg2, arg0, Static169.aClass20Array15[6], local424, local508, local13);
				} else if (local510) {
					Static190.method8303(arg3, arg2, arg0, Static169.aClass20Array15[3], local424, local508, local13);
				} else if (local533) {
					Static190.method8303(arg3, arg2, arg0, Static169.aClass20Array15[5], local424, local508, local13);
				} else if (local553) {
					Static190.method8303(arg3, arg2, arg0, Static169.aClass20Array15[4], local424, local508, local13);
				} else {
					Static190.method8303(arg3, arg2, arg0, Static169.aClass20Array15[2], local424, local508, local13);
				}
			}
		}
		@Pc(640) Class60[] local640 = Static388.aClass60Array1;
		@Pc(721) int local721;
		for (local424 = 0; local424 < local640.length; local424++) {
			@Pc(647) Class60 local647 = local640[local424];
			if (local647 != null && local647.anInt1599 != 0 && Static325.anInt5888 % 20 < 10) {
				@Pc(686) int local686;
				if (local647.anInt1599 == 1) {
					@Pc(671) Class2_Sub51 local671 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local647.anInt1606);
					if (local671 != null) {
						@Pc(676) Class11_Sub1_Sub1_Sub2_Sub2 local676 = local671.aClass11_Sub1_Sub1_Sub2_Sub2_2;
						local686 = local676.anInt9925 / 128 - local51 / 128;
						local535 = local676.anInt9929 / 128 - local49 / 128;
						Static348.method6553(arg2, local686, local13, local535, arg0, arg3, local647.anInt1605, 360000L);
					}
				}
				if (local647.anInt1599 == 2) {
					local721 = local647.anInt1602 / 128 - local51 / 128;
					local512 = local647.anInt1600 / 128 - local49 / 128;
					@Pc(736) long local736 = (long) (local647.anInt1603 << 7);
					@Pc(740) long local740 = local736 * local736;
					Static348.method6553(arg2, local721, local13, local512, arg0, arg3, local647.anInt1605, local740);
				}
				if (local647.anInt1599 == 10 && local647.anInt1606 >= 0 && local647.anInt1606 < Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1.length) {
					@Pc(773) Class11_Sub1_Sub1_Sub2_Sub1 local773 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local647.anInt1606];
					if (local773 != null) {
						local512 = local773.anInt9925 / 128 - local51 / 128;
						local686 = local773.anInt9929 / 128 - local49 / 128;
						Static348.method6553(arg2, local512, local13, local686, arg0, arg3, local647.anInt1605, 360000L);
					}
				}
			}
		}
		if (Static2.anInt31 == 4) {
			return;
		}
		if (Static129.anInt2985 != 0) {
			local508 = Static129.anInt2985 * 4 + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() * 2 + 2 - local51 / 128 - 2;
			local721 = Static271.anInt5226 * 4 + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() - 1) * 2 + 2 - local49 / 128;
			Static190.method8303(arg3, arg2, arg0, Static495.aClass20Array11[Static70.aBoolean136 ? 1 : 0], local508, local721, local13);
		}
		if (!Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aBoolean48) {
			arg1.method7898(3, 3, -1, arg0.anInt1991 / 2 + arg2 - 1, arg3 + arg0.anInt1964 / 2 - 1);
			return;
		}
	}
}
