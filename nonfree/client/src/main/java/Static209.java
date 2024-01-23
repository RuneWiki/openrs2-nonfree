import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!cd;")
	public static Class2_Sub6 aClass2_Sub6_2;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!oe;")
	public static Class72 aClass72_235;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array10;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "Lclient!vf;")
	public static Interface4 anInterface4_3;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public static int anInt3898 = 2;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_678 = Static199.method3560("null");

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "S")
	public static short aShort23 = 32767;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "Lclient!qe;")
	public static Class78 aClass78_679 = Static199.method3560("Ablegen");

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method3063() {
		Static203.aClass110_22.method3889();
		Static98.aClass53_8.method1797();
		Static205.aClass110_5.method3889();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!qe;Lclient!qe;Lclient!qe;II)V")
	public static void method3064(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class78 arg2) {
		Static188.method3489(arg2, arg1, 9, -1, arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!dc;BZ)V")
	public static void method3065(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt726;
		@Pc(10) int local10 = (int) arg0.aLong188;
		arg0.method3986();
		if (arg1) {
			Static99.method1696(local6);
		}
		Static150.method2686(local6);
		@Pc(32) Class64 local32 = Static204.method3618(local10);
		if (local32 != null) {
			Static70.method2259(local32);
		}
		Static138.anInt3182 = 0;
		Static202.aBoolean194 = false;
		Static169.method3108(Static100.anInt2201, Static189.anInt4406, Static224.anInt4847, Static207.anInt4608);
		if (Static166.anInt1143 != -1) {
			Static161.method2899(Static166.anInt1143, 1);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I")
	public static int method3066() {
		return ((Static11.anInt311 == 0 ? 0 : 1) << 20) + ((Static185.aBoolean187 ? 1 : 0) << 16) + ((Static116.aBoolean113 ? 1 : 0) << 13) + ((Static64.aBoolean42 ? 1 : 0) << 10) + ((Static175.aBoolean175 ? 1 : 0) << 9) + ((Static102.aBoolean86 ? 1 : 0) << 8) + ((Static214.aBoolean200 ? 1 : 0) << 7) + ((Static112.aBoolean105 ? 1 : 0) << 5) + ((Static11.aBoolean8 ? 1 : 0) << 3) + (Static180.anInt4194 & 0x7) + ((Static101.aBoolean84 ? 1 : 0) << 4) + ((Static14.aBoolean151 ? 1 : 0) << 6) + ((Static139.anInt2666 & 0x3) << 11) + ((Static41.aBoolean31 ? 1 : 0) << 15) + ((Static99.anInt2151 & 0x3) << 17) - (-((Static40.aBoolean27 ? 1 : 0) << 19) - (((Static89.anInt1999 == 0 ? 0 : 1) << 21) - -((Static110.anInt2433 == 0 ? 0 : 1) << 22)));
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z")
	public static boolean method3067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static89.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == -Static132.anInt3070) {
			return false;
		} else if (local7 == Static132.anInt3070) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static201.method3570(local22 + 1, Static144.anIntArrayArrayArray7[arg0][arg1][arg2], local26 + 1) && Static201.method3570(local22 + 128 - 1, Static144.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local26 + 1) && Static201.method3570(local22 + 128 - 1, Static144.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static201.method3570(local22 + 1, Static144.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static89.anIntArrayArrayArray3[arg0][arg1][arg2] = Static132.anInt3070;
				return true;
			} else {
				Static89.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static132.anInt3070;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZI)V")
	public static void method3070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class44 local11 = Static1.aClass44ArrayArrayArray1[Static137.anInt3136][arg1][arg0];
		if (local11 == null) {
			Static104.method1795(Static137.anInt3136, arg1, arg0);
			return;
		}
		@Pc(21) Class2_Sub3_Sub14 local21 = null;
		@Pc(23) int local23 = -99999999;
		@Pc(28) Class2_Sub3_Sub14 local28;
		for (local28 = (Class2_Sub3_Sub14) local11.method1359(); local28 != null; local28 = (Class2_Sub3_Sub14) local11.method1356()) {
			@Pc(35) Class2_Sub3_Sub23 local35 = Static32.method3209(local28.aClass5_Sub6_1.anInt3992);
			@Pc(38) int local38 = local35.anInt3473;
			if (local35.anInt3505 == 1) {
				local38 *= local28.aClass5_Sub6_1.anInt3997 + 1;
			}
			if (local38 > local23) {
				local23 = local38;
				local21 = local28;
			}
		}
		if (local21 == null) {
			Static104.method1795(Static137.anInt3136, arg1, arg0);
			return;
		}
		local11.method1354(local21);
		@Pc(78) Class5_Sub6 local78 = null;
		local28 = (Class2_Sub3_Sub14) local11.method1359();
		@Pc(85) Class5_Sub6 local85 = null;
		while (local28 != null) {
			@Pc(89) Class5_Sub6 local89 = local28.aClass5_Sub6_1;
			if (local89.anInt3992 != local21.aClass5_Sub6_1.anInt3992) {
				if (local78 == null) {
					local78 = local89;
				}
				if (local89.anInt3992 != local78.anInt3992 && local85 == null) {
					local85 = local89;
				}
			}
			local28 = (Class2_Sub3_Sub14) local11.method1356();
		}
		@Pc(124) long local124 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static161.method2897(Static137.anInt3136, arg1, arg0, Static208.method3667(arg1 * 128 + 64, Static137.anInt3136, arg0 * 128 + 64), local21.aClass5_Sub6_1, local124, local78, local85);
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public static void method3072() {
		try {
			if (Static179.anInt4186 == 0) {
				if (Static202.aClass105_4 != null) {
					Static202.aClass105_4.method3695();
					Static202.aClass105_4 = null;
				}
				Static5.aBoolean5 = false;
				Static179.anInt4186 = 1;
				Static168.aClass33_18 = null;
				Static38.anInt715 = 0;
			}
			if (Static179.anInt4186 == 1) {
				if (Static168.aClass33_18 == null) {
					Static168.aClass33_18 = Static133.aClass41_2.method1264(Static113.aString6, Static227.anInt4919);
				}
				if (Static168.aClass33_18.anInt947 == 2) {
					throw new IOException();
				}
				if (Static168.aClass33_18.anInt947 == 1) {
					Static202.aClass105_4 = new Class105((Socket) Static168.aClass33_18.anObject2, Static133.aClass41_2);
					Static179.anInt4186 = 2;
					Static168.aClass33_18 = null;
				}
			}
			if (Static179.anInt4186 == 2) {
				@Pc(75) long local75 = Static160.aLong139 = Static73.aClass78_351.method3016();
				@Pc(82) int local82 = (int) (local75 >> 16 & 0x1FL);
				Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
				Static161.aClass2_Sub23_Sub1_5.method2132(14);
				Static161.aClass2_Sub23_Sub1_5.method2132(local82);
				Static202.aClass105_4.method3692(Static161.aClass2_Sub23_Sub1_5.aByteArray41, 2);
				Static179.anInt4186 = 3;
				Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
			}
			@Pc(124) int local124;
			if (Static179.anInt4186 == 3) {
				if (Static220.aClass40_3 != null) {
					Static220.aClass40_3.method3712();
				}
				if (Static53.aClass40_2 != null) {
					Static53.aClass40_2.method3712();
				}
				local124 = Static202.aClass105_4.method3699();
				if (Static220.aClass40_3 != null) {
					Static220.aClass40_3.method3712();
				}
				if (Static53.aClass40_2 != null) {
					Static53.aClass40_2.method3712();
				}
				if (local124 != 0) {
					Static155.method2767(local124);
					return;
				}
				Static179.anInt4186 = 4;
				Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
			}
			if (Static179.anInt4186 == 4) {
				if (Static139.aClass2_Sub23_Sub1_4.anInt2703 < 8) {
					local124 = Static202.aClass105_4.method3690();
					if (8 - Static139.aClass2_Sub23_Sub1_4.anInt2703 < local124) {
						local124 = 8 - Static139.aClass2_Sub23_Sub1_4.anInt2703;
					}
					if (local124 > 0) {
						Static202.aClass105_4.method3694(local124, Static139.aClass2_Sub23_Sub1_4.aByteArray41, Static139.aClass2_Sub23_Sub1_4.anInt2703);
						Static139.aClass2_Sub23_Sub1_4.anInt2703 += local124;
					}
				}
				if (Static139.aClass2_Sub23_Sub1_4.anInt2703 == 8) {
					Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
					Static67.aLong35 = Static139.aClass2_Sub23_Sub1_4.method2123();
					Static179.anInt4186 = 5;
				}
			}
			if (Static179.anInt4186 == 5) {
				@Pc(213) int[] local213 = new int[4];
				local213[2] = (int) (Static67.aLong35 >> 32);
				Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
				local213[3] = (int) Static67.aLong35;
				local213[0] = (int) (Math.random() * 9.9999999E7D);
				local213[1] = (int) (Math.random() * 9.9999999E7D);
				Static161.aClass2_Sub23_Sub1_5.method2132(10);
				Static161.aClass2_Sub23_Sub1_5.method2134(local213[0]);
				Static161.aClass2_Sub23_Sub1_5.method2134(local213[1]);
				Static161.aClass2_Sub23_Sub1_5.method2134(local213[2]);
				Static161.aClass2_Sub23_Sub1_5.method2134(local213[3]);
				Static161.aClass2_Sub23_Sub1_5.method2103(Static73.aClass78_351.method3016());
				Static161.aClass2_Sub23_Sub1_5.method2085(Static73.aClass78_349);
				Static161.aClass2_Sub23_Sub1_5.method2113(Static144.aBigInteger3, Static196.aBigInteger4);
				Static67.aClass2_Sub23_Sub1_2.anInt2703 = 0;
				if (Static226.anInt4903 == 40) {
					Static67.aClass2_Sub23_Sub1_2.method2132(18);
				} else {
					Static67.aClass2_Sub23_Sub1_2.method2132(16);
				}
				Static67.aClass2_Sub23_Sub1_2.method2117(Static161.aClass2_Sub23_Sub1_5.anInt2703 + Static69.method1124(Static29.aClass78_95) + 149);
				Static67.aClass2_Sub23_Sub1_2.method2134(501);
				Static67.aClass2_Sub23_Sub1_2.method2132(0);
				Static67.aClass2_Sub23_Sub1_2.method2117(Static134.anInt3131);
				Static67.aClass2_Sub23_Sub1_2.method2117(Static30.anInt546);
				Static9.method187(Static67.aClass2_Sub23_Sub1_2);
				Static67.aClass2_Sub23_Sub1_2.method2085(Static29.aClass78_95);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static102.anInt2232);
				Static67.aClass2_Sub23_Sub1_2.method2134(method3066());
				Static97.aBoolean78 = true;
				Static67.aClass2_Sub23_Sub1_2.method2134(Static50.aClass72_Sub1_6.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static166.aClass72_Sub1_12.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static99.aClass72_Sub1_20.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static169.aClass72_Sub1_28.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static124.aClass72_Sub1_24.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static95.aClass72_Sub1_18.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static90.aClass72_Sub1_17.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static110.aClass72_Sub1_23.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static215.aClass72_Sub1_33.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static223.aClass72_Sub1_35.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static122.aClass72_Sub1_16.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static223.aClass72_Sub1_34.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static97.aClass72_Sub1_19.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static170.aClass72_Sub1_29.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static33.aClass72_Sub1_3.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static145.aClass72_Sub1_27.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static9.aClass72_Sub1_1.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static134.aClass72_Sub1_26.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static174.aClass72_Sub1_30.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static202.aClass72_Sub1_32.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static46.aClass72_Sub1_5.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static31.aClass72_Sub1_2.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static201.aClass72_Sub1_31.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static35.aClass72_Sub1_4.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static106.aClass72_Sub1_22.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static80.aClass72_Sub1_15.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2134(Static129.aClass72_Sub1_25.anInt4010);
				Static67.aClass2_Sub23_Sub1_2.method2089(Static161.aClass2_Sub23_Sub1_5.anInt2703, Static161.aClass2_Sub23_Sub1_5.aByteArray41);
				Static202.aClass105_4.method3692(Static67.aClass2_Sub23_Sub1_2.aByteArray41, Static67.aClass2_Sub23_Sub1_2.anInt2703);
				Static161.aClass2_Sub23_Sub1_5.method2148(local213);
				for (@Pc(506) int local506 = 0; local506 < 4; local506++) {
					local213[local506] += 50;
				}
				Static139.aClass2_Sub23_Sub1_4.method2148(local213);
				Static179.anInt4186 = 6;
			}
			if (Static179.anInt4186 == 6 && Static202.aClass105_4.method3690() > 0) {
				local124 = Static202.aClass105_4.method3699();
				if (local124 == 21 && Static226.anInt4903 == 20) {
					Static179.anInt4186 = 7;
				} else if (local124 == 2) {
					Static179.anInt4186 = 9;
				} else if (local124 == 15 && Static226.anInt4903 == 40) {
					Static150.method2684();
					return;
				} else if (local124 == 23 && Static150.anInt3424 < 1) {
					Static179.anInt4186 = 0;
					Static150.anInt3424++;
				} else {
					Static155.method2767(local124);
					return;
				}
			}
			if (Static179.anInt4186 == 7 && Static202.aClass105_4.method3690() > 0) {
				Static125.anInt1645 = (Static202.aClass105_4.method3699() + 3) * 60;
				Static158.anInt3655 = 21;
				Static179.anInt4186 = 8;
			}
			if (Static179.anInt4186 == 8) {
				Static38.anInt715 = 0;
				if (--Static125.anInt1645 <= 0) {
					Static179.anInt4186 = 0;
				}
			} else {
				if (Static179.anInt4186 == 9 && Static202.aClass105_4.method3690() >= 9) {
					Static66.anInt1320 = Static202.aClass105_4.method3699();
					Static9.anInt276 = Static202.aClass105_4.method3699();
					Static214.anInt4672 = Static202.aClass105_4.method3699();
					if (Static214.anInt4672 == 1) {
						try {
							Static77.aClass78_365.method3001(Static133.aClass41_2.anApplet1);
						} catch (@Pc(677) Throwable local677) {
						}
					} else {
						try {
							Static46.aClass78_159.method3001(Static133.aClass41_2.anApplet1);
						} catch (@Pc(667) Throwable local667) {
						}
					}
					Static143.anInt3257 = Static202.aClass105_4.method3699();
					Static215.aBoolean204 = Static202.aClass105_4.method3699() == 1;
					Static195.anInt4463 = Static202.aClass105_4.method3699();
					Static195.anInt4463 <<= 0x8;
					Static195.anInt4463 += Static202.aClass105_4.method3699();
					Static116.anInt2733 = Static202.aClass105_4.method3699();
					Static202.aClass105_4.method3694(1, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
					Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
					Static181.anInt4200 = Static139.aClass2_Sub23_Sub1_4.method2152();
					Static202.aClass105_4.method3694(2, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
					Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
					Static145.anInt3288 = Static139.aClass2_Sub23_Sub1_4.method2095();
					Static179.anInt4186 = 10;
				}
				if (Static179.anInt4186 != 10) {
					Static38.anInt715++;
					if (Static38.anInt715 > 2000) {
						if (Static150.anInt3424 < 1) {
							if (Static227.anInt4919 == Static85.anInt1909) {
								Static227.anInt4919 = Static107.anInt2351;
							} else {
								Static227.anInt4919 = Static85.anInt1909;
							}
							Static150.anInt3424++;
							Static179.anInt4186 = 0;
						} else {
							Static155.method2767(-3);
						}
					}
				} else if (Static202.aClass105_4.method3690() >= Static145.anInt3288) {
					Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
					Static202.aClass105_4.method3694(Static145.anInt3288, Static139.aClass2_Sub23_Sub1_4.aByteArray41, 0);
					Static186.method3432();
					Static90.anInt2014 = -1;
					Static103.method1783(false);
					Static181.anInt4200 = -1;
				}
			}
		} catch (@Pc(808) IOException local808) {
			if (Static150.anInt3424 < 1) {
				Static150.anInt3424++;
				Static179.anInt4186 = 0;
				if (Static227.anInt4919 == Static85.anInt1909) {
					Static227.anInt4919 = Static107.anInt2351;
				} else {
					Static227.anInt4919 = Static85.anInt1909;
				}
			} else {
				Static155.method2767(-2);
			}
		}
	}
}
