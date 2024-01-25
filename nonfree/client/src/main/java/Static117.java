import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Lclient!jv;")
	public static Class138 aClass138_4;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "Lclient!di;")
	public static final Class54 aClass54_40 = new Class54(31, -1);

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
	public static int anInt2657 = 0;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
	public static int anInt2663 = 0;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)V")
	public static void method2076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1010) {
			Static168.method2734(Static298.aClass182_91, arg2, arg0);
		} else if (arg1 == 1008) {
			Static168.method2734(Static400.aClass182_136, arg2, arg0);
		} else if (arg1 == 1004) {
			Static168.method2734(Static299.aClass182_92, arg2, arg0);
		} else if (arg1 == 1009) {
			Static168.method2734(Static340.aClass182_103, arg2, arg0);
		} else if (arg1 == 1001) {
			Static168.method2734(Static398.aClass182_119, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public static void method2077() {
		if (Static12.aClass79_Sub1_1.method3966(Static399.anInt6653) || Static383.anInt6436 == Static427.anInt7117) {
			Static118.method2096(Static33.aClass49_1);
			if (Static34.anInt676 != Static383.anInt6436) {
				Static391.method3870();
			}
		} else {
			Static187.method2965(false, Static376.anInt6396, Static455.anInt5548, false);
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
	public static void method2079() {
		Static78.method1460(Static182.aClass68_7);
		Static383.anInt6438++;
		if (Static362.aBoolean435 && Static130.aBoolean218) {
			@Pc(28) int local28 = Static109.aClass1_2.method702();
			@Pc(32) int local32 = Static109.aClass1_2.method698();
			local32 -= Static74.anInt1617;
			local28 -= Static350.anInt5952;
			if (Static420.anInt7046 > local28) {
				local28 = Static420.anInt7046;
			}
			if (local28 + Static182.aClass68_7.anInt2188 > Static420.anInt7046 + Static225.aClass68_9.anInt2188) {
				local28 = Static225.aClass68_9.anInt2188 + Static420.anInt7046 - Static182.aClass68_7.anInt2188;
			}
			if (local32 < Static34.anInt678) {
				local32 = Static34.anInt678;
			}
			if (Static225.aClass68_9.anInt2252 + Static34.anInt678 < Static182.aClass68_7.anInt2252 + local32) {
				local32 = Static225.aClass68_9.anInt2252 + Static34.anInt678 - Static182.aClass68_7.anInt2252;
			}
			@Pc(109) int local109 = Static225.aClass68_9.anInt2176 + local28 - Static420.anInt7046;
			@Pc(118) int local118 = local32 + Static225.aClass68_9.anInt2172 - Static34.anInt678;
			@Pc(168) Class2_Sub30 local168;
			if (Static109.aClass1_2.method699()) {
				if (Static182.aClass68_7.anInt2218 < Static383.anInt6438) {
					@Pc(207) int local207 = local28 - Static174.anInt3459;
					@Pc(212) int local212 = local32 - Static56.anInt1210;
					if (Static182.aClass68_7.anInt2191 < local207 || local207 < -Static182.aClass68_7.anInt2191 || local212 > Static182.aClass68_7.anInt2191 || local212 < -Static182.aClass68_7.anInt2191) {
						Static205.aBoolean296 = true;
					}
				}
				if (Static182.aClass68_7.anObjectArray8 != null && Static205.aBoolean296) {
					local168 = new Class2_Sub30();
					local168.anInt5102 = local109;
					local168.aClass68_12 = Static182.aClass68_7;
					local168.anInt5103 = local118;
					local168.anObjectArray35 = Static182.aClass68_7.anObjectArray8;
					Static168.method2731(local168);
				}
			} else {
				if (Static205.aBoolean296) {
					Static237.method3667();
					if (Static182.aClass68_7.anObjectArray9 != null) {
						local168 = new Class2_Sub30();
						local168.anObjectArray35 = Static182.aClass68_7.anObjectArray9;
						local168.anInt5103 = local118;
						local168.aClass68_12 = Static182.aClass68_7;
						local168.anInt5102 = local109;
						local168.aClass68_13 = Static256.aClass68_10;
						Static168.method2731(local168);
					}
					if (Static256.aClass68_10 != null && Static47.method791(Static182.aClass68_7) != null) {
						Static154.method2540(Static182.aClass68_7, Static256.aClass68_10);
					}
				} else if ((Class64_Sub1.lb == 1 || Static387.method5126()) && Static373.anInt4900 > 2) {
					Static257.method3886(Static74.anInt1617 + Static56.anInt1210, Static350.anInt5952 + Static174.anInt3459);
				} else if (Static344.method4737()) {
					Static257.method3886(Static74.anInt1617 + Static56.anInt1210, Static174.anInt3459 + Static350.anInt5952);
				}
				Static182.aClass68_7 = null;
			}
		} else if (Static383.anInt6438 > 1) {
			Static182.aClass68_7 = null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)I")
	public static int method2083() {
		try {
			if (Static156.anInt3174 == 0) {
				if (Static17.aLong11 > Static21.method458() - 5000L) {
					return 0;
				}
				Static259.aClass138_8 = Static43.aClass59_5.method1353(Static370.anInt6355, Static227.aString45);
				Static89.aLong60 = Static21.method458();
				Static156.anInt3174 = 1;
			}
			if (Static89.aLong60 + 30000L < Static21.method458()) {
				return Static154.method2543(1000);
			}
			@Pc(74) int local74;
			@Pc(104) int local104;
			if (Static156.anInt3174 == 1) {
				if (Static259.aClass138_8.anInt3723 == 2) {
					return Static154.method2543(1001);
				}
				if (Static259.aClass138_8.anInt3723 != 1) {
					return -1;
				}
				Static34.aClass34_2 = new Class34((Socket) Static259.aClass138_8.anObject7, Static43.aClass59_5);
				Static259.aClass138_8 = null;
				local74 = 0;
				if (Static230.aBoolean325) {
					local74 = Static386.anInt6457;
				}
				Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
				Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_9.anInt6576);
				Static424.aClass2_Sub23_Sub2_1.method5506(local74);
				Static34.aClass34_2.method606(Static424.aClass2_Sub23_Sub2_1.anInt6952, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
				Static148.method2441();
				local104 = Static34.aClass34_2.method615();
				Static148.method2441();
				if (local104 != 0) {
					return Static154.method2543(local104);
				}
				Static156.anInt3174 = 2;
			}
			if (Static156.anInt3174 == 2) {
				if (Static34.aClass34_2.method613() < 2) {
					return -1;
				}
				Static2.anInt73 = Static34.aClass34_2.method615();
				Static2.anInt73 <<= 0x8;
				Static2.anInt73 += Static34.aClass34_2.method615();
				Static156.anInt3174 = 3;
				Static388.aByteArray121 = new byte[Static2.anInt73];
				Static440.anInt7217 = 0;
			}
			if (Static156.anInt3174 != 3) {
				return -1;
			}
			local74 = Static34.aClass34_2.method613();
			if (local74 < 1) {
				return -1;
			}
			if (Static2.anInt73 - Static440.anInt7217 < local74) {
				local74 = Static2.anInt73 - Static440.anInt7217;
			}
			Static34.aClass34_2.method604(Static440.anInt7217, Static388.aByteArray121, local74);
			Static440.anInt7217 += local74;
			if (Static2.anInt73 > Static440.anInt7217) {
				return -1;
			} else if (Static335.method763(Static388.aByteArray121)) {
				Static397.aClass219_Sub1Array3 = new Class219_Sub1[Static427.anInt7111];
				local104 = 0;
				for (@Pc(208) int local208 = Static429.anInt6516; local208 <= Static160.anInt4302; local208++) {
					@Pc(214) Class219_Sub1 local214 = Static334.method4662(local208);
					if (local214 != null) {
						Static397.aClass219_Sub1Array3[local104++] = local214;
					}
				}
				Static353.aClass2_Sub36_2 = null;
				Static11.anInt286 = 0;
				Static34.aClass34_2.method610();
				Static34.aClass34_2 = null;
				Static156.anInt3174 = 0;
				Static388.aByteArray121 = null;
				Static444.anInt7234 = 0;
				Static17.aLong11 = Static21.method458();
				return 0;
			} else {
				return Static154.method2543(1002);
			}
		} catch (@Pc(252) IOException local252) {
			return Static154.method2543(1003);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)Z")
	public static boolean method2084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static15.method316(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static2.method68(arg0, arg1) | Static108.method1999(arg1, arg0) ? true : (Static37.method605(arg1, arg0) | Static374.method5050(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
