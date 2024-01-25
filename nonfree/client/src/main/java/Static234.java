import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!os", name = "A", descriptor = "I")
	public static int anInt4738;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_156 = new Class217(13, 0);

	@OriginalMember(owner = "client!os", name = "y", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_160 = new Class18(24, 3);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!td;Lclient!eg;Lclient!fp;IBI)Z")
	public static boolean method4344(@OriginalArg(0) Class194 arg0, @OriginalArg(1) Class1_Sub17 arg1, @OriginalArg(2) Class63 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray452 != null) {
			local7 = (Static269.anInt3323 - Static269.anInt3325) * (arg1.anInt1641 + arg0.anInt5818 - Static269.anInt3316) / (Static269.anInt3318 - Static269.anInt3316) + Static269.anInt3325;
			local11 = Static269.anInt3319 - (Static269.anInt3319 - Static269.anInt3317) * (arg1.anInt1651 + (arg0.anInt5836 - Static269.anInt3322)) / (Static269.anInt3315 - Static269.anInt3322);
			local9 = Static269.anInt3325 + (Static269.anInt3323 - Static269.anInt3325) * (-Static269.anInt3316 + arg0.anInt5839 + arg1.anInt1641) / (Static269.anInt3318 - Static269.anInt3316);
			local13 = Static269.anInt3319 - (arg0.anInt5814 + arg1.anInt1651 - Static269.anInt3322) * (Static269.anInt3319 - Static269.anInt3317) / (Static269.anInt3315 - Static269.anInt3322);
		}
		@Pc(100) Class4 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg0.anInt5823 != -1) {
			if (arg1.aBoolean116 && arg0.anInt5831 != -1) {
				local100 = arg0.method5262(true, arg2);
			} else {
				local100 = arg0.method5262(false, arg2);
			}
			if (local100 != null) {
				local102 = arg1.anInt1644 - (local100.method5961() + 1 >> 1);
				if (local102 < local7) {
					local7 = local102;
				}
				local104 = arg1.anInt1644 + (local100.method5961() + 1 >> 1);
				local106 = arg1.anInt1643 - (local100.method5963() + 1 >> 1);
				if (local9 < local104) {
					local9 = local104;
				}
				local108 = arg1.anInt1643 + (local100.method5963() + 1 >> 1);
				if (local106 < local11) {
					local11 = local106;
				}
				if (local13 < local108) {
					local13 = local108;
				}
			}
		}
		@Pc(206) Class174 local206 = null;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(274) int local274;
		@Pc(297) int local297;
		if (arg0.aString51 != null) {
			local206 = Static117.method2461(arg0.anInt5834);
			if (local206 != null) {
				local208 = Static315.aClass80_15.method2540(null, null, Static160.aStringArray15, arg0.aString51);
				local210 = arg1.anInt1643;
				if (local100 == null) {
					local210 -= local206.method4795() * local208 / 2;
				} else {
					local210 -= (local100.method5963() >> 1) + local208 * local206.method4791();
				}
				for (local274 = 0; local274 < local208; local274++) {
					@Pc(280) String local280 = Static160.aStringArray15[local274];
					if (local274 < local208 - 1) {
						local280 = local280.substring(0, local280.length() - 4);
					}
					local297 = local206.method4794(local280);
					if (local212 < local297) {
						local212 = local297;
					}
				}
				local214 = arg1.anInt1644 - local212 / 2;
				if (local7 > local214) {
					local7 = local214;
				}
				local221 = local212 / 2 + arg1.anInt1644;
				local223 = local210;
				if (local221 > local9) {
					local9 = local221;
				}
				local225 = local206.method4791() * local208 + local210;
				if (local11 > local223) {
					local11 = local223;
				}
				if (local13 < local225) {
					local13 = local225;
				}
			}
		}
		if (local9 < Static269.anInt3325 || local7 > Static269.anInt3323 || local13 < Static269.anInt3317 || Static269.anInt3319 < local11) {
			return true;
		}
		@Pc(414) int local414;
		if (arg0.anIntArray452 != null) {
			@Pc(412) int[] local412 = new int[arg0.anIntArray452.length];
			for (local414 = 0; local414 < local412.length / 2; local414++) {
				local297 = arg1.anInt1641 + arg0.anIntArray452[local414 * 2];
				@Pc(438) int local438 = arg1.anInt1651 + arg0.anIntArray452[local414 * 2 + 1];
				local412[local414 * 2] = Static269.anInt3325 + (local297 - Static269.anInt3316) * (-Static269.anInt3325 + Static269.anInt3323) / (Static269.anInt3318 - Static269.anInt3316);
				local412[local414 * 2 + 1] = Static269.anInt3319 - (local438 - Static269.anInt3322) * (-Static269.anInt3317 + Static269.anInt3319) / (Static269.anInt3315 - Static269.anInt3322);
			}
			Static303.method5257(arg2, local412, arg0.anInt5816);
			for (local297 = 0; local297 < local412.length / 2 - 1; local297++) {
				arg2.method4619(arg0.anInt5841, local412[local297 * 2], local412[local297 * 2 + 1 + 2], local412[local297 * 2 + 1], local412[(local297 + 1) * 2]);
			}
			arg2.method4619(arg0.anInt5841, local412[local412.length - 2], local412[1], local412[local412.length - 1], local412[0]);
		}
		if (local100 != null) {
			if (Static368.anInt7056 > 0 && (Static215.anInt4292 != -1 && arg1.anInt1640 == Static215.anInt4292 || Static105.anInt2414 != -1 && arg0.anInt5848 == Static105.anInt2414)) {
				if (Static227.anInt4587 <= 50) {
					local274 = Static227.anInt4587 * 2;
				} else {
					local274 = 200 - Static227.anInt4587 * 2;
				}
				local414 = local274 << 24 | 0xFFFF00;
				arg2.method4617(local100.method5962() / 2 + 7, arg1.anInt1643, arg1.anInt1644, local414);
				arg2.method4617(local100.method5962() / 2 + 5, arg1.anInt1643, arg1.anInt1644, local414);
				arg2.method4617(local100.method5962() / 2 + 3, arg1.anInt1643, arg1.anInt1644, local414);
				arg2.method4617(local100.method5962() / 2 + 1, arg1.anInt1643, arg1.anInt1644, local414);
				arg2.method4617(local100.method5962() / 2, arg1.anInt1643, arg1.anInt1644, local414);
			}
			local100.method5948(arg1.anInt1644 - (local100.method5961() >> 1), arg1.anInt1643 - (local100.method5963() >> 1));
		}
		if (arg0.aString51 != null && local206 != null) {
			Static225.method4173(arg1, local212, local206, arg2, local210, arg0, local208);
		}
		if (arg0.anInt5823 != -1 || arg0.aString51 != null) {
			@Pc(728) Class1_Sub32 local728 = new Class1_Sub32(arg1);
			local728.anInt4642 = local223;
			local728.anInt4650 = local225;
			local728.anInt4644 = local108;
			local728.anInt4640 = local106;
			local728.anInt4648 = local102;
			local728.anInt4651 = local104;
			local728.anInt4639 = local214;
			local728.anInt4645 = local221;
			Static164.aClass42_22.method1549(local728);
		}
		return false;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
	public static void method4345() {
		if (Static184.anInt3735 == 0 || Static184.anInt3735 == 5) {
			return;
		}
		try {
			if (++Static355.anInt6720 > 2000) {
				if (Static165.aClass76_2 != null) {
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
				}
				if (Static219.anInt4422 >= 1) {
					Static184.anInt3735 = 0;
					Static171.anInt3577 = -5;
					return;
				}
				if (Static201.anInt4056 == Static29.anInt680) {
					Static201.anInt4056 = Static270.anInt5271;
				} else {
					Static201.anInt4056 = Static29.anInt680;
				}
				Static184.anInt3735 = 1;
				Static355.anInt6720 = 0;
				Static219.anInt4422++;
			}
			if (Static184.anInt3735 == 1) {
				Static84.aClass121_2 = Static227.aClass75_5.method2359(Static306.aString53, Static201.anInt4056);
				Static184.anInt3735 = 2;
			}
			if (Static184.anInt3735 == 2) {
				if (Static84.aClass121_2.anInt3693 == 2) {
					throw new IOException();
				}
				if (Static84.aClass121_2.anInt3693 != 1) {
					return;
				}
				Static165.aClass76_2 = new Class76((Socket) Static84.aClass121_2.anObject2, Static227.aClass75_5);
				Static84.aClass121_2 = null;
				@Pc(110) long local110 = Static145.aLong109 = Static125.method2624(Static176.aString59);
				Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
				@Pc(120) int local120 = (int) (local110 >> 16 & 0x1FL);
				Static339.aClass1_Sub7_Sub2_4.method2121(Static204.aClass103_1.anInt3138);
				Static339.aClass1_Sub7_Sub2_4.method2121(local120);
				Static165.aClass76_2.method2376(2, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				@Pc(152) int local152 = Static165.aClass76_2.method2379();
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				if (local152 != 0) {
					Static171.anInt3577 = local152;
					Static184.anInt3735 = 0;
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
					return;
				}
				Static184.anInt3735 = 3;
			}
			if (Static184.anInt3735 == 3) {
				if (Static165.aClass76_2.method2387() < 8) {
					return;
				}
				Static165.aClass76_2.method2384(0, 8, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
				Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
				Static135.aLong106 = Static180.aClass1_Sub7_Sub2_2.method2148();
				@Pc(215) int[] local215 = new int[4];
				local215[0] = (int) (Math.random() * 9.9999999E7D);
				Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
				local215[1] = (int) (Math.random() * 9.9999999E7D);
				local215[2] = (int) (Static135.aLong106 >> 32);
				local215[3] = (int) Static135.aLong106;
				Static339.aClass1_Sub7_Sub2_4.method2121(10);
				Static339.aClass1_Sub7_Sub2_4.method2115(local215[0]);
				Static339.aClass1_Sub7_Sub2_4.method2115(local215[1]);
				Static339.aClass1_Sub7_Sub2_4.method2115(local215[2]);
				Static339.aClass1_Sub7_Sub2_4.method2115(local215[3]);
				Static339.aClass1_Sub7_Sub2_4.method2124(Static125.method2624(Static176.aString59));
				Static339.aClass1_Sub7_Sub2_4.method2106(Static42.aString5);
				Static339.aClass1_Sub7_Sub2_4.method2107(Static255.aBigInteger1, Static318.aBigInteger2);
				Static60.aClass1_Sub7_Sub2_1.anInt2219 = 0;
				if (Static13.anInt334 == 40) {
					Static60.aClass1_Sub7_Sub2_1.method2121(Static204.aClass103_5.anInt3138);
				} else {
					Static60.aClass1_Sub7_Sub2_1.method2121(Static204.aClass103_3.anInt3138);
				}
				Static60.aClass1_Sub7_Sub2_1.method2144(Static339.aClass1_Sub7_Sub2_4.anInt2219 + Static131.method2688(Static220.aString43) + 161);
				Static60.aClass1_Sub7_Sub2_1.method2115(571);
				Static60.aClass1_Sub7_Sub2_1.method2121(Static76.anInt1694);
				Static60.aClass1_Sub7_Sub2_1.method2121(Static300.method5230());
				Static60.aClass1_Sub7_Sub2_1.method2144(Static213.anInt4274);
				Static60.aClass1_Sub7_Sub2_1.method2144(Static130.anInt2825);
				Static60.aClass1_Sub7_Sub2_1.method2121(Static289.anInt5617);
				Static157.method2984(Static60.aClass1_Sub7_Sub2_1);
				Static60.aClass1_Sub7_Sub2_1.method2106(Static220.aString43);
				Static60.aClass1_Sub7_Sub2_1.method2115(Static180.anInt3698);
				Static60.aClass1_Sub7_Sub2_1.method2115(Static104.method2270());
				Static307.aBoolean439 = true;
				Static60.aClass1_Sub7_Sub2_1.method2144(Static235.anInt4759);
				Static60.aClass1_Sub7_Sub2_1.method2115(Static86.aClass30_25.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static176.aClass30_98.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static195.aClass30_57.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static71.aClass30_17.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static265.aClass30_78.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static166.aClass30_53.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static330.aClass30_93.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static140.aClass30_41.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static280.aClass30_83.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static19.aClass30_2.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static73.aClass30_18.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static47.aClass30_11.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static368.aClass30_112.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static101.aClass30_30.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static22.aClass30_104.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static363.aClass30_108.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static83.aClass30_21.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static155.aClass30_46.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static276.aClass30_82.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static270.aClass30_79.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static247.aClass30_75.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static218.aClass30_65.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static34.aClass30_8.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static310.aClass30_88.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static177.aClass30_56.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static84.aClass30_23.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static361.aClass30_107.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static311.aClass30_85.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2115(Static273.aClass30_80.method1169());
				Static60.aClass1_Sub7_Sub2_1.method2133(Static339.aClass1_Sub7_Sub2_4.anInt2219, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
				Static165.aClass76_2.method2376(Static60.aClass1_Sub7_Sub2_1.anInt2219, Static60.aClass1_Sub7_Sub2_1.aByteArray41);
				Static339.aClass1_Sub7_Sub2_4.method2168(local215);
				for (@Pc(607) int local607 = 0; local607 < 4; local607++) {
					local215[local607] += 50;
				}
				Static180.aClass1_Sub7_Sub2_2.method2168(local215);
				Static184.anInt3735 = 4;
			}
			@Pc(643) int local643;
			if (Static184.anInt3735 == 4) {
				if (Static165.aClass76_2.method2387() < 1) {
					return;
				}
				local643 = Static165.aClass76_2.method2379();
				if (local643 == 21) {
					Static184.anInt3735 = 7;
				} else if (local643 == 29) {
					Static184.anInt3735 = 11;
				} else if (local643 == 1) {
					Static171.anInt3577 = local643;
					Static184.anInt3735 = 5;
					return;
				} else if (local643 == 2) {
					Static184.anInt3735 = 8;
				} else if (local643 == 15) {
					Static184.anInt3735 = 12;
					Static366.anInt7026 = -2;
				} else if (local643 == 23 && Static219.anInt4422 < 1) {
					Static219.anInt4422++;
					Static355.anInt6720 = 0;
					Static184.anInt3735 = 1;
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
					return;
				} else {
					Static184.anInt3735 = 0;
					Static171.anInt3577 = local643;
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
					return;
				}
			}
			if (Static184.anInt3735 == 6) {
				Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
				Static339.aClass1_Sub7_Sub2_4.method2163(Static204.aClass103_4.anInt3138);
				Static165.aClass76_2.method2376(Static339.aClass1_Sub7_Sub2_4.anInt2219, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
				Static184.anInt3735 = 4;
			} else if (Static184.anInt3735 == 7) {
				if (Static165.aClass76_2.method2387() >= 1) {
					Static113.anInt2527 = Static165.aClass76_2.method2379() * 60 + 180;
					Static184.anInt3735 = 0;
					Static171.anInt3577 = 21;
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
				}
			} else if (Static184.anInt3735 != 11) {
				if (Static184.anInt3735 == 8) {
					if (Static165.aClass76_2.method2387() < 13) {
						return;
					}
					Static165.aClass76_2.method2384(0, 13, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
					Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
					Static110.anInt2477 = Static180.aClass1_Sub7_Sub2_2.method2132();
					Static86.anInt1917 = Static180.aClass1_Sub7_Sub2_2.method2132();
					Static212.aBoolean313 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
					Static67.aBoolean111 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
					Static153.aBoolean216 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
					Static9.aBoolean12 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
					Static352.anInt1802 = Static180.aClass1_Sub7_Sub2_2.method2161();
					Static285.aBoolean359 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
					Static204.aBoolean304 = Static180.aClass1_Sub7_Sub2_2.method2132() == 1;
					Static244.method4555(Static204.aBoolean304);
					Static243.aClass220_2.method5975(Static204.aBoolean304);
					Static279.method4983(Static204.aBoolean304);
					if (Static212.aBoolean313 && !Static153.aBoolean216 || Static285.aBoolean359) {
						try {
							Static381.method4930(Static227.aClass75_5.anApplet1, "zap");
						} catch (@Pc(916) Throwable local916) {
							if (Static332.aBoolean467) {
								try {
									Static227.aClass75_5.anApplet1.getAppletContext().showDocument(new URL(Static227.aClass75_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(932) Exception local932) {
								}
							}
						}
					} else {
						try {
							Static381.method4930(Static227.aClass75_5.anApplet1, "unzap");
						} catch (@Pc(942) Throwable local942) {
						}
					}
					if (Static195.anInt3950 == 0) {
						try {
							Static381.method4930(Static227.aClass75_5.anApplet1, "loggedin");
						} catch (@Pc(953) Throwable local953) {
						}
					}
					Static184.anInt3735 = 10;
				}
				if (Static184.anInt3735 == 10) {
					if (Static180.aClass1_Sub7_Sub2_2.method2171()) {
						if (Static165.aClass76_2.method2387() < 1) {
							return;
						}
						Static165.aClass76_2.method2384(Static180.aClass1_Sub7_Sub2_2.anInt2219 + 2, 1, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
					}
					Static293.aClass217_165 = Static124.method2601()[Static180.aClass1_Sub7_Sub2_2.method2165()];
					Static366.anInt7026 = Static180.aClass1_Sub7_Sub2_2.method2161();
					Static184.anInt3735 = 9;
				}
				if (Static184.anInt3735 == 9) {
					if (Static165.aClass76_2.method2387() >= Static366.anInt7026) {
						Static165.aClass76_2.method2384(0, Static366.anInt7026, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
						Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
						Static171.anInt3577 = 2;
						Static184.anInt3735 = 0;
						local643 = Static366.anInt7026;
						Static129.method2669();
						Static199.method3732(Static180.aClass1_Sub7_Sub2_2);
						Static171.anInt3574 = -1;
						Static272.method4853(false);
						if (local643 != Static180.aClass1_Sub7_Sub2_2.anInt2219) {
							throw new RuntimeException("lswp pos:" + Static180.aClass1_Sub7_Sub2_2.anInt2219 + " psize:" + local643);
						}
						Static293.aClass217_165 = null;
					}
				} else if (Static184.anInt3735 == 12) {
					if (Static366.anInt7026 == -2) {
						if (Static165.aClass76_2.method2387() < 2) {
							return;
						}
						Static165.aClass76_2.method2384(0, 2, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
						Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
						Static366.anInt7026 = Static180.aClass1_Sub7_Sub2_2.method2161();
					}
					if (Static165.aClass76_2.method2387() >= Static366.anInt7026) {
						Static165.aClass76_2.method2384(0, Static366.anInt7026, Static180.aClass1_Sub7_Sub2_2.aByteArray41);
						Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
						Static184.anInt3735 = 0;
						Static171.anInt3577 = 15;
						local643 = Static366.anInt7026;
						Static145.method2866();
						Static199.method3732(Static180.aClass1_Sub7_Sub2_2);
						if (Static180.aClass1_Sub7_Sub2_2.anInt2219 != local643) {
							throw new RuntimeException("lswpr pos:" + Static180.aClass1_Sub7_Sub2_2.anInt2219 + " psize:" + local643);
						}
						Static293.aClass217_165 = null;
					}
				}
			} else if (Static165.aClass76_2.method2387() >= 1) {
				Static69.anInt1602 = Static165.aClass76_2.method2379();
				Static171.anInt3577 = 29;
				Static184.anInt3735 = 0;
				Static165.aClass76_2.method2377();
				Static165.aClass76_2 = null;
			}
		} catch (@Pc(1141) IOException local1141) {
			if (Static165.aClass76_2 != null) {
				Static165.aClass76_2.method2377();
				Static165.aClass76_2 = null;
			}
			if (Static219.anInt4422 >= 1) {
				Static171.anInt3577 = -4;
				Static184.anInt3735 = 0;
			} else {
				Static219.anInt4422++;
				Static184.anInt3735 = 1;
				if (Static201.anInt4056 == Static29.anInt680) {
					Static201.anInt4056 = Static270.anInt5271;
				} else {
					Static201.anInt4056 = Static29.anInt680;
				}
				Static355.anInt6720 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
	public static void method4347(@OriginalArg(1) byte arg0) {
		if (Static341.aByteArrayArrayArray10 == null) {
			Static341.aByteArrayArrayArray10 = new byte[4][Static311.anInt5653][Static189.anInt3820];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(23) int local23 = 0; local23 < Static311.anInt5653; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static189.anInt3820; local27++) {
					Static341.aByteArrayArrayArray10[local14][local23][local27] = arg0;
				}
			}
		}
	}
}
