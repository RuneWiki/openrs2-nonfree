import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!me;")
	public static final Class211 aClass211_36 = new Class211(4);

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "[I")
	public static final int[] anIntArray302 = new int[1000];

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_23 = new Class110(11, 5);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method4124() {
		@Pc(5) Class211 local5 = Static232.aClass211_34;
		synchronized (Static232.aClass211_34) {
			Static232.aClass211_34.method5535();
		}
		local5 = Static204.aClass211_30;
		synchronized (Static204.aClass211_30) {
			Static204.aClass211_30.method5535();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!cda;)Z")
	public static boolean method4125(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method1499(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local8 == 0) {
			if (arg1.method1499(1) != 0) {
				method4125(arg0, arg1);
			}
			local28 = arg1.method1499(6);
			local33 = arg1.method1499(6);
			@Pc(43) boolean local43 = arg1.method1499(1) == 1;
			if (local43) {
				Static12.anIntArray6[Static293.anInt6017++] = arg0;
			}
			if (Static378.aClass2_Sub2_Sub1_Sub1Array10[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class90 local66 = Static102.aClass90Array1[arg0];
			@Pc(74) Class2_Sub2_Sub1_Sub1 local74 = Static378.aClass2_Sub2_Sub1_Sub1Array10[arg0] = new Class2_Sub2_Sub1_Sub1();
			local74.anInt7603 = arg0;
			if (Static1.aClass3_Sub7Array1[arg0] != null) {
				local74.method2043(Static1.aClass3_Sub7Array1[arg0]);
			}
			local74.method6301(local66.anInt2874, true);
			local74.anInt7634 = local66.anInt2875;
			local100 = local66.anInt2871;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			@Pc(114) int local114 = local100 & 0xFF;
			local74.aBoolean171 = local66.aBoolean220;
			local74.aByteArray85[0] = Static113.aByteArray38[arg0];
			local74.aByte103 = (byte) local104;
			local74.method2033(local28 + (local110 << 6) - Static230.anInt4667, -Static563.anInt10006 + local33 + (local114 << 6));
			local74.aBoolean172 = false;
			Static102.aClass90Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method1499(2);
			local33 = Static102.aClass90Array1[arg0].anInt2871;
			Static102.aClass90Array1[arg0].anInt2871 = (local33 & 0xFFFFFFF) + ((local28 + (local33 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(205) int local205;
			@Pc(210) int local210;
			@Pc(219) int local219;
			if (local8 != 2) {
				local28 = arg1.method1499(18);
				local33 = local28 >> 16;
				local205 = local28 >> 8 & 0xFF;
				local210 = local28 & 0xFF;
				local219 = Static102.aClass90Array1[arg0].anInt2871;
				local100 = local33 + (local219 >> 28) & 0x3;
				local104 = (local219 >> 14) + local205 & 0xFF;
				local110 = local210 + local219 & 0xFF;
				Static102.aClass90Array1[arg0].anInt2871 = (local104 << 14) + (local100 << 28) + local110;
				return false;
			}
			local28 = arg1.method1499(5);
			local33 = local28 >> 3;
			local205 = local28 & 0x7;
			local210 = Static102.aClass90Array1[arg0].anInt2871;
			local219 = (local210 >> 28) + local33 & 0x3;
			local100 = local210 >> 14 & 0xFF;
			local104 = local210 & 0xFF;
			if (local205 == 0) {
				local104--;
				local100--;
			}
			if (local205 == 1) {
				local104--;
			}
			if (local205 == 2) {
				local104--;
				local100++;
			}
			if (local205 == 3) {
				local100--;
			}
			if (local205 == 4) {
				local100++;
			}
			if (local205 == 5) {
				local100--;
				local104++;
			}
			if (local205 == 6) {
				local104++;
			}
			if (local205 == 7) {
				local104++;
				local100++;
			}
			Static102.aClass90Array1[arg0].anInt2871 = local104 + (local100 << 14) + (local219 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)Z")
	public static boolean method4127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static548.method8015(arg1, arg0) | Static497.method7515(arg1, arg0) | Static458.method7062(arg0, arg1)) & Static259.method4588(arg0, arg1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILclient!oi;)V")
	public static void method4128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub40 arg2) {
		if (arg2 == null || Static342.aClass183_44.aClass3_161 == arg2) {
			return;
		}
		@Pc(13) int local13 = arg2.anInt7326;
		@Pc(16) int local16 = arg2.anInt7325;
		@Pc(19) int local19 = arg2.anInt7324;
		@Pc(23) int local23 = (int) arg2.aLong191;
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(32) long local32 = arg2.aLong191;
		@Pc(52) Class3_Sub9 local52;
		if (local19 == 19) {
			Static142.anInt3265 = 0;
			Static257.anInt5516 = 1;
			Static181.anInt3665 = arg0;
			Static203.anInt3942 = arg1;
			local52 = Static587.method8316(Static187.aClass40_2, Static537.aClass230_104);
			local52.aClass3_Sub7_Sub1_1.method6528(Static153.anInt3371);
			local52.aClass3_Sub7_Sub1_1.method6558(Static352.anInt7064);
			local52.aClass3_Sub7_Sub1_1.method6556(Static317.anInt9395);
			local52.aClass3_Sub7_Sub1_1.method6528(Static230.anInt4667 + local13);
			local52.aClass3_Sub7_Sub1_1.method6556(Static563.anInt10006 + local16);
			Static230.method3933(local52);
			Static85.method1895(0, -4, true, local16, local13, 1, 1, 0);
		}
		if (local19 == 1004) {
			Static203.anInt3942 = arg1;
			Static142.anInt3265 = 0;
			Static257.anInt5516 = 2;
			Static181.anInt3665 = arg0;
			local52 = Static587.method8316(Static187.aClass40_2, Static354.aClass230_71);
			local52.aClass3_Sub7_Sub1_1.method6528(local23);
			Static230.method3933(local52);
		}
		if (local19 == 3) {
			if (Static158.anInt3421 > 0 && Static212.aClass193_1.method6323(82) && Static212.aClass193_1.method6323(81)) {
				Static432.method4774(Static230.anInt4667 + local13, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, local16 + Static563.anInt10006);
			} else {
				Static142.anInt3265 = 0;
				Static181.anInt3665 = arg0;
				Static257.anInt5516 = 1;
				Static203.anInt3942 = arg1;
				local52 = Static587.method8316(Static187.aClass40_2, Static364.aClass230_72);
				local52.aClass3_Sub7_Sub1_1.method6527(local13 + Static230.anInt4667);
				local52.aClass3_Sub7_Sub1_1.method6528(Static563.anInt10006 + local16);
				Static230.method3933(local52);
			}
		}
		@Pc(218) Class3_Sub9 local218;
		@Pc(199) Class2_Sub2_Sub1_Sub1 local199;
		if (local19 == 6) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static181.anInt3665 = arg0;
				Static203.anInt3942 = arg1;
				Static257.anInt5516 = 2;
				Static142.anInt3265 = 0;
				local218 = Static587.method8316(Static187.aClass40_2, Static48.aClass230_13);
				local218.aClass3_Sub7_Sub1_1.method6528(Static317.anInt9395);
				local218.aClass3_Sub7_Sub1_1.method6537(local23);
				local218.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local218.aClass3_Sub7_Sub1_1.method6495(Static352.anInt7064);
				local218.aClass3_Sub7_Sub1_1.method6537(Static153.anInt3371);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		@Pc(312) Class3_Sub9 local312;
		@Pc(290) Class3_Sub46 local290;
		@Pc(303) Class2_Sub2_Sub1_Sub2 local303;
		if (local19 == 25) {
			local290 = (Class3_Sub46) Static331.aClass25_25.method946((long) local23);
			if (local290 != null) {
				Static142.anInt3265 = 0;
				Static181.anInt3665 = arg0;
				local303 = local290.aClass2_Sub2_Sub1_Sub2_2;
				Static257.anInt5516 = 2;
				Static203.anInt3942 = arg1;
				local312 = Static587.method8316(Static187.aClass40_2, Static191.aClass230_44);
				local312.aClass3_Sub7_Sub1_1.method6556(local23);
				local312.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
				Static230.method3933(local312);
				Static85.method1895(0, -2, true, local303.anIntArray488[0], local303.anIntArray487[0], local303.method6311(), local303.method6311(), 0);
			}
		}
		if (local19 == 1008 || local19 == 1010 || local19 == 1012 || local19 == 1011 || local19 == 1007) {
			Static73.method8390(local13, local23, local19);
		}
		if (local19 == 44) {
			Static257.anInt5516 = 2;
			Static203.anInt3942 = arg1;
			Static181.anInt3665 = arg0;
			Static142.anInt3265 = 0;
			local52 = Static587.method8316(Static187.aClass40_2, Static492.aClass230_96);
			local52.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6537(local16 + Static563.anInt10006);
			local52.aClass3_Sub7_Sub1_1.method6537(local13 + Static230.anInt4667);
			local52.aClass3_Sub7_Sub1_1.method6527(local23);
			Static230.method3933(local52);
			Static410.method6645(local16, local13);
		}
		if (local19 == 22) {
			local290 = (Class3_Sub46) Static331.aClass25_25.method946((long) local23);
			if (local290 != null) {
				local303 = local290.aClass2_Sub2_Sub1_Sub2_2;
				Static257.anInt5516 = 2;
				Static181.anInt3665 = arg0;
				Static142.anInt3265 = 0;
				Static203.anInt3942 = arg1;
				local312 = Static587.method8316(Static187.aClass40_2, Static568.aClass230_107);
				local312.aClass3_Sub7_Sub1_1.method6527(local23);
				local312.aClass3_Sub7_Sub1_1.method6495(Static352.anInt7064);
				local312.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local312.aClass3_Sub7_Sub1_1.method6556(Static317.anInt9395);
				local312.aClass3_Sub7_Sub1_1.method6556(Static153.anInt3371);
				Static230.method3933(local312);
				Static85.method1895(0, -2, true, local303.anIntArray488[0], local303.anIntArray487[0], local303.method6311(), local303.method6311(), 0);
			}
		}
		if (local19 == 11 && Static321.aClass305_8 == null) {
			Static179.method3182(local13, local16);
			Static321.aClass305_8 = Static282.method4864(local16, local13);
			Static282.method4860(Static321.aClass305_8);
		}
		if (local19 == 15 || local19 == 1003) {
			Static128.method6030(local13, arg2.aString88, local16, local23);
		}
		if (local19 == 59) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static142.anInt3265 = 0;
				Static181.anInt3665 = arg0;
				Static257.anInt5516 = 2;
				Static203.anInt3942 = arg1;
				local218 = Static587.method8316(Static187.aClass40_2, Static466.aClass230_82);
				local218.aClass3_Sub7_Sub1_1.method6528(local23);
				local218.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 9) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static181.anInt3665 = arg0;
				Static203.anInt3942 = arg1;
				Static257.anInt5516 = 2;
				Static142.anInt3265 = 0;
				local218 = Static587.method8316(Static187.aClass40_2, Static258.aClass230_57);
				local218.aClass3_Sub7_Sub1_1.method6556(local23);
				local218.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 47) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static181.anInt3665 = arg0;
				Static203.anInt3942 = arg1;
				Static257.anInt5516 = 2;
				Static142.anInt3265 = 0;
				local218 = Static587.method8316(Static187.aClass40_2, Static226.aClass230_50);
				local218.aClass3_Sub7_Sub1_1.method6556(local23);
				local218.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 1002) {
			Static257.anInt5516 = 2;
			Static142.anInt3265 = 0;
			Static203.anInt3942 = arg1;
			Static181.anInt3665 = arg0;
			local52 = Static587.method8316(Static187.aClass40_2, Static170.aClass230_94);
			local52.aClass3_Sub7_Sub1_1.method6528(local23);
			Static230.method3933(local52);
		}
		if (local19 == 17) {
			Static142.anInt3265 = 0;
			Static203.anInt3942 = arg1;
			Static257.anInt5516 = 2;
			Static181.anInt3665 = arg0;
			local52 = Static587.method8316(Static187.aClass40_2, Static48.aClass230_13);
			local52.aClass3_Sub7_Sub1_1.method6528(Static317.anInt9395);
			local52.aClass3_Sub7_Sub1_1.method6537(Static443.aClass2_Sub2_Sub1_Sub1_2.anInt7603);
			local52.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6495(Static352.anInt7064);
			local52.aClass3_Sub7_Sub1_1.method6537(Static153.anInt3371);
			Static230.method3933(local52);
		}
		if (local19 == 60) {
			Static181.anInt3665 = arg0;
			Static257.anInt5516 = 2;
			Static203.anInt3942 = arg1;
			Static142.anInt3265 = 0;
			local52 = Static587.method8316(Static187.aClass40_2, Static203.aClass230_47);
			local52.aClass3_Sub7_Sub1_1.method6527((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local52.aClass3_Sub7_Sub1_1.method6528(Static230.anInt4667 + local13);
			local52.aClass3_Sub7_Sub1_1.method6527(Static563.anInt10006 + local16);
			local52.aClass3_Sub7_Sub1_1.method6518(Static352.anInt7064);
			local52.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6527(Static153.anInt3371);
			local52.aClass3_Sub7_Sub1_1.method6537(Static317.anInt9395);
			Static230.method3933(local52);
			Static226.method3875(local16, local13, local32);
		}
		if (local19 == 1006) {
			Static203.anInt3942 = arg1;
			Static181.anInt3665 = arg0;
			Static142.anInt3265 = 0;
			Static257.anInt5516 = 2;
			local52 = Static587.method8316(Static187.aClass40_2, Static236.aClass230_53);
			local52.aClass3_Sub7_Sub1_1.method6528((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local52.aClass3_Sub7_Sub1_1.method6556(local13 + Static230.anInt4667);
			local52.aClass3_Sub7_Sub1_1.method6537(Static563.anInt10006 + local16);
			local52.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
			Static230.method3933(local52);
			Static226.method3875(local16, local13, local32);
		}
		if (local19 == 46) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static257.anInt5516 = 2;
				Static203.anInt3942 = arg1;
				Static181.anInt3665 = arg0;
				Static142.anInt3265 = 0;
				local218 = Static587.method8316(Static187.aClass40_2, Static550.aClass230_90);
				local218.aClass3_Sub7_Sub1_1.method6503(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local218.aClass3_Sub7_Sub1_1.method6527(local23);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 12) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static142.anInt3265 = 0;
				Static203.anInt3942 = arg1;
				Static181.anInt3665 = arg0;
				Static257.anInt5516 = 2;
				local218 = Static587.method8316(Static187.aClass40_2, Static524.aClass230_99);
				local218.aClass3_Sub7_Sub1_1.method6528(local23);
				local218.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 58) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static257.anInt5516 = 2;
				Static142.anInt3265 = 0;
				Static203.anInt3942 = arg1;
				Static181.anInt3665 = arg0;
				local218 = Static587.method8316(Static187.aClass40_2, Static488.aClass230_20);
				local218.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local218.aClass3_Sub7_Sub1_1.method6537(local23);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 49) {
			Static203.anInt3942 = arg1;
			Static181.anInt3665 = arg0;
			Static257.anInt5516 = 2;
			Static142.anInt3265 = 0;
			local52 = Static587.method8316(Static187.aClass40_2, Static292.aClass230_76);
			local52.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6537(local13 + Static230.anInt4667);
			local52.aClass3_Sub7_Sub1_1.method6527(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local52.aClass3_Sub7_Sub1_1.method6556(Static563.anInt10006 + local16);
			Static230.method3933(local52);
			Static226.method3875(local16, local13, local32);
		}
		if (local19 == 1001) {
			Static181.anInt3665 = arg0;
			Static257.anInt5516 = 2;
			Static203.anInt3942 = arg1;
			Static142.anInt3265 = 0;
			local290 = (Class3_Sub46) Static331.aClass25_25.method946((long) local23);
			if (local290 != null) {
				local303 = local290.aClass2_Sub2_Sub1_Sub2_2;
				@Pc(1327) Class169 local1327 = local303.aClass169_1;
				if (local1327.anIntArray306 != null) {
					local1327 = local1327.method4177(Static588.aClass322_1);
				}
				if (local1327 != null) {
					@Pc(1346) Class3_Sub9 local1346 = Static587.method8316(Static187.aClass40_2, Static175.aClass230_39);
					local1346.aClass3_Sub7_Sub1_1.method6528(local1327.anInt4967);
					Static230.method3933(local1346);
				}
			}
		}
		if (local19 == 48) {
			Static257.anInt5516 = 2;
			Static203.anInt3942 = arg1;
			Static181.anInt3665 = arg0;
			Static142.anInt3265 = 0;
			local52 = Static587.method8316(Static187.aClass40_2, Static592.aClass230_110);
			local52.aClass3_Sub7_Sub1_1.method6527(Static230.anInt4667 + local13);
			local52.aClass3_Sub7_Sub1_1.method6537(Static563.anInt10006 + local16);
			local52.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6537((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static230.method3933(local52);
			Static226.method3875(local16, local13, local32);
		}
		if (local19 == 57) {
			Static181.anInt3665 = arg0;
			Static203.anInt3942 = arg1;
			Static142.anInt3265 = 0;
			Static257.anInt5516 = 2;
			local52 = Static587.method8316(Static187.aClass40_2, Static379.aClass230_73);
			local52.aClass3_Sub7_Sub1_1.method6537(Static563.anInt10006 + local16);
			local52.aClass3_Sub7_Sub1_1.method6556(Static230.anInt4667 + local13);
			local52.aClass3_Sub7_Sub1_1.method6528((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local52.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
			Static230.method3933(local52);
			Static226.method3875(local16, local13, local32);
		}
		if (local19 == 20) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static181.anInt3665 = arg0;
				Static142.anInt3265 = 0;
				Static257.anInt5516 = 2;
				Static203.anInt3942 = arg1;
				local218 = Static587.method8316(Static187.aClass40_2, Static571.aClass230_108);
				local218.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local218.aClass3_Sub7_Sub1_1.method6528(local23);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 10) {
			local290 = (Class3_Sub46) Static331.aClass25_25.method946((long) local23);
			if (local290 != null) {
				local303 = local290.aClass2_Sub2_Sub1_Sub2_2;
				Static142.anInt3265 = 0;
				Static203.anInt3942 = arg1;
				Static181.anInt3665 = arg0;
				Static257.anInt5516 = 2;
				local312 = Static587.method8316(Static187.aClass40_2, Static340.aClass230_68);
				local312.aClass3_Sub7_Sub1_1.method6537(local23);
				local312.aClass3_Sub7_Sub1_1.method6503(Static212.aClass193_1.method6323(82) ? 1 : 0);
				Static230.method3933(local312);
				Static85.method1895(0, -2, true, local303.anIntArray488[0], local303.anIntArray487[0], local303.method6311(), local303.method6311(), 0);
			}
		}
		@Pc(1643) Class305 local1643;
		if (local19 == 50) {
			local1643 = Static282.method4864(local16, local13);
			if (local1643 != null) {
				Static324.method5635(local1643);
			}
		}
		if (local19 == 5) {
			local1643 = Static282.method4864(local16, local13);
			if (local1643 != null) {
				Static583.method7888();
				@Pc(1665) Class3_Sub11 local1665 = Static68.method1694(local1643);
				Static199.method3361(local1665.method1757(), local1643, local1665.anInt1876);
				Static590.aString133 = Static574.method8202(local1643);
				Static569.aString131 = local1643.aString110 + "<col=ffffff>";
				if (Static590.aString133 == null) {
					Static590.aString133 = "Null";
				}
			}
			return;
		}
		if (local19 == 4) {
			Static181.anInt3665 = arg0;
			Static257.anInt5516 = 2;
			Static203.anInt3942 = arg1;
			Static142.anInt3265 = 0;
			local52 = Static587.method8316(Static187.aClass40_2, Static276.aClass230_59);
			local52.aClass3_Sub7_Sub1_1.method6556(local23);
			local52.aClass3_Sub7_Sub1_1.method6527(Static563.anInt10006 + local16);
			local52.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6537(local13 + Static230.anInt4667);
			Static230.method3933(local52);
			Static410.method6645(local16, local13);
		}
		if (local19 == 18) {
			Static142.anInt3265 = 0;
			Static257.anInt5516 = 2;
			Static181.anInt3665 = arg0;
			Static203.anInt3942 = arg1;
			local52 = Static587.method8316(Static187.aClass40_2, Static301.aClass230_63);
			local52.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6537(local16 + Static563.anInt10006);
			local52.aClass3_Sub7_Sub1_1.method6528(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local52.aClass3_Sub7_Sub1_1.method6537(Static230.anInt4667 + local13);
			Static230.method3933(local52);
			Static226.method3875(local16, local13, local32);
		}
		if (local19 == 16) {
			Static257.anInt5516 = 2;
			Static142.anInt3265 = 0;
			Static181.anInt3665 = arg0;
			Static203.anInt3942 = arg1;
			local52 = Static587.method8316(Static187.aClass40_2, Static259.aClass230_58);
			local52.aClass3_Sub7_Sub1_1.method6537(local23);
			local52.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6527(local13 + Static230.anInt4667);
			local52.aClass3_Sub7_Sub1_1.method6556(Static563.anInt10006 + local16);
			Static230.method3933(local52);
			Static410.method6645(local16, local13);
		}
		if (local19 == 2) {
			local199 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local23];
			if (local199 != null) {
				Static142.anInt3265 = 0;
				Static257.anInt5516 = 2;
				Static181.anInt3665 = arg0;
				Static203.anInt3942 = arg1;
				local218 = Static587.method8316(Static187.aClass40_2, Static198.aClass230_46);
				local218.aClass3_Sub7_Sub1_1.method6503(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local218.aClass3_Sub7_Sub1_1.method6527(local23);
				Static230.method3933(local218);
				Static85.method1895(0, -2, true, local199.anIntArray488[0], local199.anIntArray487[0], local199.method6311(), local199.method6311(), 0);
			}
		}
		if (local19 == 21) {
			Static181.anInt3665 = arg0;
			Static142.anInt3265 = 0;
			Static203.anInt3942 = arg1;
			Static257.anInt5516 = 2;
			local52 = Static587.method8316(Static187.aClass40_2, Static438.aClass230_87);
			local52.aClass3_Sub7_Sub1_1.method6527(local23);
			local52.aClass3_Sub7_Sub1_1.method6495(Static352.anInt7064);
			local52.aClass3_Sub7_Sub1_1.method6503(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6527(Static563.anInt10006 + local16);
			local52.aClass3_Sub7_Sub1_1.method6528(Static317.anInt9395);
			local52.aClass3_Sub7_Sub1_1.method6556(Static153.anInt3371);
			local52.aClass3_Sub7_Sub1_1.method6556(local13 + Static230.anInt4667);
			Static230.method3933(local52);
			Static410.method6645(local16, local13);
		}
		if (local19 == 30) {
			if (Static158.anInt3421 > 0 && Static212.aClass193_1.method6323(82) && Static212.aClass193_1.method6323(81)) {
				Static432.method4774(Static230.anInt4667 + local13, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, local16 + Static563.anInt10006);
			} else {
				local52 = Static124.method2509(local13, local23, local16);
				if (local23 == 1) {
					local52.aClass3_Sub7_Sub1_1.method6494(-1);
					local52.aClass3_Sub7_Sub1_1.method6494(-1);
					local52.aClass3_Sub7_Sub1_1.method6528((int) Static533.aFloat188);
					local52.aClass3_Sub7_Sub1_1.method6494(57);
					local52.aClass3_Sub7_Sub1_1.method6494(Static288.anInt5964);
					local52.aClass3_Sub7_Sub1_1.method6494(Static66.anInt1706);
					local52.aClass3_Sub7_Sub1_1.method6494(89);
					local52.aClass3_Sub7_Sub1_1.method6528(Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398);
					local52.aClass3_Sub7_Sub1_1.method6528(Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396);
					local52.aClass3_Sub7_Sub1_1.method6494(63);
				} else {
					Static181.anInt3665 = arg0;
					Static142.anInt3265 = 0;
					Static257.anInt5516 = 1;
					Static203.anInt3942 = arg1;
				}
				Static230.method3933(local52);
				Static85.method1895(0, -4, true, local16, local13, 1, 1, 0);
			}
		}
		if (local19 == 8) {
			local290 = (Class3_Sub46) Static331.aClass25_25.method946((long) local23);
			if (local290 != null) {
				Static257.anInt5516 = 2;
				Static142.anInt3265 = 0;
				Static181.anInt3665 = arg0;
				Static203.anInt3942 = arg1;
				local303 = local290.aClass2_Sub2_Sub1_Sub2_2;
				local312 = Static587.method8316(Static187.aClass40_2, Static481.aClass230_93);
				local312.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local312.aClass3_Sub7_Sub1_1.method6537(local23);
				Static230.method3933(local312);
				Static85.method1895(0, -2, true, local303.anIntArray488[0], local303.anIntArray487[0], local303.method6311(), local303.method6311(), 0);
			}
		}
		if (local19 == 45) {
			local290 = (Class3_Sub46) Static331.aClass25_25.method946((long) local23);
			if (local290 != null) {
				Static257.anInt5516 = 2;
				Static203.anInt3942 = arg1;
				Static142.anInt3265 = 0;
				Static181.anInt3665 = arg0;
				local303 = local290.aClass2_Sub2_Sub1_Sub2_2;
				local312 = Static587.method8316(Static187.aClass40_2, Static35.aClass230_9);
				local312.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
				local312.aClass3_Sub7_Sub1_1.method6556(local23);
				Static230.method3933(local312);
				Static85.method1895(0, -2, true, local303.anIntArray488[0], local303.anIntArray487[0], local303.method6311(), local303.method6311(), 0);
			}
		}
		if (local19 == 13) {
			local290 = (Class3_Sub46) Static331.aClass25_25.method946((long) local23);
			if (local290 != null) {
				Static257.anInt5516 = 2;
				Static181.anInt3665 = arg0;
				Static142.anInt3265 = 0;
				local303 = local290.aClass2_Sub2_Sub1_Sub2_2;
				Static203.anInt3942 = arg1;
				local312 = Static587.method8316(Static187.aClass40_2, Static437.aClass230_86);
				local312.aClass3_Sub7_Sub1_1.method6537(local23);
				local312.aClass3_Sub7_Sub1_1.method6546(Static212.aClass193_1.method6323(82) ? 1 : 0);
				Static230.method3933(local312);
				Static85.method1895(0, -2, true, local303.anIntArray488[0], local303.anIntArray487[0], local303.method6311(), local303.method6311(), 0);
			}
		}
		if (local19 == 23) {
			Static257.anInt5516 = 2;
			Static181.anInt3665 = arg0;
			Static142.anInt3265 = 0;
			Static203.anInt3942 = arg1;
			local52 = Static587.method8316(Static187.aClass40_2, Static217.aClass230_49);
			local52.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6528(local23);
			local52.aClass3_Sub7_Sub1_1.method6527(local16 + Static563.anInt10006);
			local52.aClass3_Sub7_Sub1_1.method6527(Static230.anInt4667 + local13);
			Static230.method3933(local52);
			Static410.method6645(local16, local13);
		}
		if (local19 == 51) {
			Static181.anInt3665 = arg0;
			Static257.anInt5516 = 2;
			Static142.anInt3265 = 0;
			Static203.anInt3942 = arg1;
			local52 = Static587.method8316(Static187.aClass40_2, Static598.aClass230_112);
			local52.aClass3_Sub7_Sub1_1.method6537(local23);
			local52.aClass3_Sub7_Sub1_1.method6528(Static230.anInt4667 + local13);
			local52.aClass3_Sub7_Sub1_1.method6502(Static212.aClass193_1.method6323(82) ? 1 : 0);
			local52.aClass3_Sub7_Sub1_1.method6528(Static563.anInt10006 + local16);
			Static230.method3933(local52);
			Static410.method6645(local16, local13);
		}
		if (Static594.aBoolean851) {
			Static583.method7888();
		}
		if (Static6.aClass305_1 != null && Static305.anInt6092 == 0) {
			Static282.method4860(Static6.aClass305_1);
		}
	}
}
