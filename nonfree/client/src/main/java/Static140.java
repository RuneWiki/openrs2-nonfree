import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
	public static int anInt2974;

	@OriginalMember(owner = "client!ir", name = "V", descriptor = "Lclient!gl;")
	public static Class2 aClass2_14;

	@OriginalMember(owner = "client!ir", name = "P", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!ir", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString107 = "Loaded interfaces";

	@OriginalMember(owner = "client!ir", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Loaded fonts";

	@OriginalMember(owner = "client!ir", name = "Z", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!ir", name = "bb", descriptor = "I")
	public static int anInt2984 = -1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!e;Lclient!ah;I)V")
	public static void method2816(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Interface2 arg1) {
		if (Static241.aClass14_Sub2_Sub14_3 == null) {
			return;
		}
		if (Static315.anInt6452 < 10) {
			if (!Static241.aClass143_102.method3754(Static241.aClass14_Sub2_Sub14_3.aString160)) {
				Static315.anInt6452 = Static53.aClass143_37.method3731(Static241.aClass14_Sub2_Sub14_3.aString160) / 10;
				return;
			}
			Static79.method1954();
			Static315.anInt6452 = 10;
		}
		if (Static315.anInt6452 == 10) {
			Static241.anInt5683 = Static241.aClass14_Sub2_Sub14_3.anInt4450 >> 6 << 6;
			Static241.anInt5684 = Static241.aClass14_Sub2_Sub14_3.anInt4447 >> 6 << 6;
			Static241.anInt5680 = (Static241.aClass14_Sub2_Sub14_3.anInt4461 >> 6 << 6) - (Static241.anInt5684 - 64);
			Static241.anInt5687 = (Static241.aClass14_Sub2_Sub14_3.anInt4464 >> 6 << 6) + 64 - Static241.anInt5683;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static241.aClass14_Sub2_Sub14_3.method3990(Static219.anInt4400, (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7) + Static151.anInt3234, (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7) + Static251.anInt3170, local75)) {
				local79 = local75[2] - Static241.anInt5684;
				local77 = local75[1] - Static241.anInt5683;
			}
			if (!Static22.aBoolean24 && local77 >= 0 && Static241.anInt5687 > local77 && local79 >= 0 && local79 < Static241.anInt5680) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static297.anInt5698 = local77;
				Static41.anInt983 = local79;
			} else if (Static89.anInt2113 == -1 || Static130.anInt2813 == -1) {
				Static241.aClass14_Sub2_Sub14_3.method3994(Static241.aClass14_Sub2_Sub14_3.anInt4454 >> 14 & 0x3FFF, local75, Static241.aClass14_Sub2_Sub14_3.anInt4454 & 0x3FFF);
				Static297.anInt5698 = local75[1] - Static241.anInt5683;
				Static41.anInt983 = local75[2] - Static241.anInt5684;
			} else {
				Static241.aClass14_Sub2_Sub14_3.method3994(Static89.anInt2113, local75, Static130.anInt2813);
				Static22.aBoolean24 = false;
				if (local75 != null) {
					Static297.anInt5698 = local75[1] - Static241.anInt5683;
					Static41.anInt983 = local75[2] - Static241.anInt5684;
				}
				Static130.anInt2813 = -1;
				Static89.anInt2113 = -1;
			}
			if (Static241.aClass14_Sub2_Sub14_3.anInt4448 == 37) {
				Static241.aFloat108 = 3.0F;
				Static241.aFloat107 = 3.0F;
			} else if (Static241.aClass14_Sub2_Sub14_3.anInt4448 == 50) {
				Static241.aFloat108 = 4.0F;
				Static241.aFloat107 = 4.0F;
			} else if (Static241.aClass14_Sub2_Sub14_3.anInt4448 == 75) {
				Static241.aFloat108 = 6.0F;
				Static241.aFloat107 = 6.0F;
			} else if (Static241.aClass14_Sub2_Sub14_3.anInt4448 == 100) {
				Static241.aFloat108 = 8.0F;
				Static241.aFloat107 = 8.0F;
			} else if (Static241.aClass14_Sub2_Sub14_3.anInt4448 == 200) {
				Static241.aFloat108 = 16.0F;
				Static241.aFloat107 = 16.0F;
			} else {
				Static241.aFloat108 = 8.0F;
				Static241.aFloat107 = 8.0F;
			}
			Static241.anInt5675 = (int) Static241.aFloat108 >> 1;
			Static241.aByteArrayArrayArray13 = Static312.method5391(Static241.anInt5675);
			Static22.method502();
			Static241.method5040();
			Static326.aClass18_44 = new Class18();
			Static241.anInt5674 += (int) (Math.random() * 5.0D) - 2;
			if (Static241.anInt5674 < -8) {
				Static241.anInt5674 = -8;
			}
			if (Static241.anInt5674 > 8) {
				Static241.anInt5674 = 8;
			}
			Static241.anInt5673 += (int) (Math.random() * 5.0D) - 2;
			if (Static241.anInt5673 < -16) {
				Static241.anInt5673 = -16;
			}
			if (Static241.anInt5673 > 16) {
				Static241.anInt5673 = 16;
			}
			Static241.method5042(arg1, Static241.anInt5674 >> 2 << 10, Static241.anInt5673 >> 1);
			Static147.method2549(256, 1024);
			Static65.method5169(256, 256);
			Static231.method4076(4096);
			Static273.method4633(256);
			Static315.anInt6452 = 20;
		} else if (Static315.anInt6452 == 20) {
			Static124.method2598(true);
			Static241.method5056(arg0, Static241.anInt5674, Static241.anInt5673);
			Static315.anInt6452 = 60;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 60) {
			if (Static241.aClass143_102.method3743(Static241.aClass14_Sub2_Sub14_3.aString160 + "_staticelements")) {
				if (!Static241.aClass143_102.method3754(Static241.aClass14_Sub2_Sub14_3.aString160 + "_staticelements")) {
					return;
				}
				Static241.aClass163_3 = Static77.method1918(Static241.aClass143_102, Static241.aClass14_Sub2_Sub14_3.aString160 + "_staticelements", Static15.aBoolean420);
			} else {
				Static241.aClass163_3 = new Class163(0);
			}
			Static241.method5045();
			Static315.anInt6452 = 70;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 70) {
			Static108.aClass212_4 = new Class212(arg0, 11, true, Static95.aCanvas2);
			Static315.anInt6452 = 73;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 73) {
			Static255.aClass212_13 = new Class212(arg0, 12, true, Static95.aCanvas2);
			Static315.anInt6452 = 76;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 76) {
			Static121.aClass212_5 = new Class212(arg0, 14, true, Static95.aCanvas2);
			Static315.anInt6452 = 79;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 79) {
			Static319.aClass212_16 = new Class212(arg0, 17, true, Static95.aCanvas2);
			Static315.anInt6452 = 82;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 82) {
			Static222.aClass212_12 = new Class212(arg0, 19, true, Static95.aCanvas2);
			Static315.anInt6452 = 85;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 85) {
			Static90.aClass212_3 = new Class212(arg0, 22, true, Static95.aCanvas2);
			Static315.anInt6452 = 88;
			Static124.method2598(true);
			Static187.method3587();
		} else if (Static315.anInt6452 == 88) {
			Static156.aClass212_15 = new Class212(arg0, 26, true, Static95.aCanvas2);
			Static315.anInt6452 = 91;
			Static124.method2598(true);
			Static187.method3587();
		} else {
			Static307.aClass212_7 = new Class212(arg0, 30, true, Static95.aCanvas2);
			Static315.anInt6452 = 100;
			Static124.method2598(true);
			Static187.method3587();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "(I)V")
	public static void method2818() {
		Static273.aClass11_117.method214();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!el;Lclient!br;IBILclient!e;)Z")
	public static boolean method2819(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class14_Sub5 arg1, @OriginalArg(5) Class46 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray128 != null) {
			local11 = Static241.anInt5685 - (arg1.anInt729 + arg0.anInt1758 - Static241.anInt5676) * (-Static241.anInt5678 + Static241.anInt5685) / (Static241.anInt5681 - Static241.anInt5676);
			local13 = Static241.anInt5685 - (arg0.anInt1736 + arg1.anInt729 - Static241.anInt5676) * (Static241.anInt5685 - Static241.anInt5678) / (Static241.anInt5681 - Static241.anInt5676);
			local9 = (Static241.anInt5682 - Static241.anInt5679) * (arg0.anInt1733 + arg1.anInt736 - Static241.anInt5677) / (Static241.anInt5686 - Static241.anInt5677) + Static241.anInt5679;
			local7 = Static241.anInt5679 + (arg1.anInt736 + arg0.anInt1749 - Static241.anInt5677) * (-Static241.anInt5679 + Static241.anInt5682) / (Static241.anInt5686 - Static241.anInt5677);
		}
		@Pc(102) Class2 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg0.anInt1743 != -1) {
			if (arg1.aBoolean38 && arg0.anInt1738 != -1) {
				local102 = arg0.method1772(arg2, true);
			} else {
				local102 = arg0.method1772(arg2, false);
			}
			if (local102 != null) {
				local104 = arg1.anInt731 - (local102.method2630() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				local106 = arg1.anInt731 + (local102.method2630() + 1 >> 1);
				if (local9 < local106) {
					local9 = local106;
				}
				local108 = arg1.anInt726 - (local102.method2627() + 1 >> 1);
				local110 = arg1.anInt726 + (local102.method2627() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				if (local110 > local13) {
					local13 = local110;
				}
			}
		}
		@Pc(211) Class212 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(274) int local274;
		@Pc(301) int local301;
		if (arg0.aString65 != null) {
			local211 = Static107.method2326(arg0.anInt1751);
			if (local211 != null) {
				local213 = Static205.aClass76_6.method2254(null, Static335.aStringArray74, arg0.aString65, null);
				local215 = arg1.anInt726;
				if (local102 == null) {
					local215 -= local211.method5863() * local213 / 2;
				} else {
					local215 -= (local102.method2627() >> 1) + local213 * local211.method5869();
				}
				for (local274 = 0; local274 < local213; local274++) {
					@Pc(280) String local280 = Static335.aStringArray74[local274];
					if (local274 < local213 - 1) {
						local280 = local280.substring(0, local280.length() - 4);
					}
					local301 = local211.method5865(local280);
					if (local217 < local301) {
						local217 = local301;
					}
				}
				local219 = arg1.anInt731 - local217 / 2;
				local221 = arg1.anInt731 + local217 / 2;
				if (local219 < local7) {
					local7 = local219;
				}
				local223 = local215;
				if (local9 < local221) {
					local9 = local221;
				}
				local225 = local213 * local211.method5869() + local215;
				if (local11 > local223) {
					local11 = local223;
				}
				if (local13 < local225) {
					local13 = local225;
				}
			}
		}
		if (local9 < Static241.anInt5679 || local7 > Static241.anInt5682 || local13 < Static241.anInt5678 || local11 > Static241.anInt5685) {
			return true;
		}
		@Pc(409) int local409;
		if (arg0.anIntArray128 != null) {
			@Pc(407) int[] local407 = new int[arg0.anIntArray128.length];
			for (local409 = 0; local409 < local407.length / 2; local409++) {
				local301 = arg1.anInt736 + arg0.anIntArray128[local409 * 2];
				@Pc(433) int local433 = arg1.anInt729 + arg0.anIntArray128[local409 * 2 + 1];
				local407[local409 * 2] = (Static241.anInt5682 - Static241.anInt5679) * (local301 + -Static241.anInt5677) / (Static241.anInt5686 - Static241.anInt5677) + Static241.anInt5679;
				local407[local409 * 2 + 1] = Static241.anInt5685 - (Static241.anInt5685 - Static241.anInt5678) * (-Static241.anInt5676 + local433) / (Static241.anInt5681 - Static241.anInt5676);
			}
			Static172.method3345(arg2, local407, arg0.anInt1754);
			for (local301 = 0; local301 < local407.length / 2 - 1; local301++) {
				arg2.method5120(local407[(local301 + 1) * 2], local407[local301 * 2 + 1], local407[local301 * 2], local407[(local301 + 1) * 2 + 1], arg0.anInt1737);
			}
			arg2.method5120(local407[0], local407[local407.length - 1], local407[local407.length - 2], local407[1], arg0.anInt1737);
		}
		if (local102 != null) {
			if (Static28.anInt659 > 0 && (Static118.anInt2594 != -1 && Static118.anInt2594 == arg1.anInt725 || Static17.anInt347 != -1 && Static17.anInt347 == arg0.anInt1756)) {
				if (Static331.anInt6398 <= 50) {
					local274 = Static331.anInt6398 * 2;
				} else {
					local274 = (100 - Static331.anInt6398) * 2;
				}
				local409 = local274 << 24 | 0xFFFF00;
				arg2.method5177(arg1.anInt726, local102.method2639() / 2 + 7, local409, arg1.anInt731);
				arg2.method5177(arg1.anInt726, local102.method2639() / 2 + 5, local409, arg1.anInt731);
				arg2.method5177(arg1.anInt726, local102.method2639() / 2 + 3, local409, arg1.anInt731);
				arg2.method5177(arg1.anInt726, local102.method2639() / 2 + 1, local409, arg1.anInt731);
				arg2.method5177(arg1.anInt726, local102.method2639() / 2, local409, arg1.anInt731);
			}
			local102.method2642(arg1.anInt731 - (local102.method2630() >> 1), arg1.anInt726 - (local102.method2627() >> 1));
		}
		if (arg0.aString65 != null && local211 != null) {
			Static249.method4349(arg0, local211, arg2, local217, local215, arg1, local213);
		}
		if (arg0.anInt1743 != -1 || arg0.aString65 != null) {
			@Pc(728) Class14_Sub36 local728 = new Class14_Sub36(arg1);
			local728.anInt6351 = local225;
			local728.anInt6343 = local108;
			local728.anInt6350 = local219;
			local728.anInt6347 = local223;
			local728.anInt6342 = local106;
			local728.anInt6345 = local110;
			local728.anInt6353 = local221;
			local728.anInt6340 = local104;
			Static326.aClass18_44.method451(local728);
		}
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(III)V")
	public static void method2820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class169 local7 = Static267.method4558(arg1);
		@Pc(10) int local10 = local7.anInt4997;
		@Pc(13) int local13 = local7.anInt4998;
		@Pc(16) int local16 = local7.anInt5002;
		@Pc(23) int local23 = Class45.anIntArray129[local16 - local13];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static322.method5552(arg0 << local13 & local23 | ~local23 & Static102.anIntArray211[local10], local10);
	}
}
