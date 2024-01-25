import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!j", name = "w", descriptor = "I")
	public static int anInt4911;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "[I")
	public static int[] anIntArray396;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public static final int anInt4910 = -1;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "I")
	public static int anInt4913 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method3994() {
		if (Static296.anInt2704 == 0 || Static296.anInt2704 == 5) {
			return;
		}
		try {
			if (++Static122.anInt2164 > 2000) {
				if (Static372.aClass161_6 != null) {
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
				}
				if (Static431.anInt7436 >= 1) {
					Static296.anInt2704 = 0;
					Static430.anInt7428 = -5;
					return;
				}
				Static296.anInt2704 = 1;
				Static122.anInt2164 = 0;
				if (Static163.anInt3040 == Static41.anInt7070) {
					Static163.anInt3040 = Static58.anInt1248;
				} else {
					Static163.anInt3040 = Static41.anInt7070;
				}
				Static431.anInt7436++;
			}
			if (Static296.anInt2704 == 1) {
				Static184.aClass100_3 = Static119.aClass138_7.method3205(Static163.anInt3040, Static212.aString4);
				Static296.anInt2704 = 2;
			}
			@Pc(113) int local113;
			if (Static296.anInt2704 == 2) {
				if (Static184.aClass100_3.anInt2365 == 2) {
					throw new IOException();
				}
				if (Static184.aClass100_3.anInt2365 != 1) {
					return;
				}
				Static372.aClass161_6 = new Class161((Socket) Static184.aClass100_3.anObject4, Static119.aClass138_7);
				Static184.aClass100_3 = null;
				@Pc(103) long local103 = Static141.aLong76 = Static315.method4683(Static425.aString57);
				Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
				local113 = (int) (local103 >> 16 & 0x1FL);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_1.anInt2675);
				Static232.aClass1_Sub1_Sub1_2.method4115(local113);
				Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, 2);
				Static363.method4998();
				@Pc(135) int local135 = Static372.aClass161_6.method3770();
				Static363.method4998();
				if (local135 != 0) {
					Static430.anInt7428 = local135;
					Static296.anInt2704 = 0;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
					return;
				}
				Static296.anInt2704 = 3;
			}
			if (Static296.anInt2704 == 3) {
				if (Static372.aClass161_6.method3765() < 8) {
					return;
				}
				Static372.aClass161_6.method3769(8, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
				Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
				Static332.aLong177 = Static173.aClass1_Sub1_Sub1_1.method4094();
				@Pc(181) Class1_Sub1 local181 = new Class1_Sub1(70);
				@Pc(184) int[] local184 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static332.aLong177 >> 32), (int) Static332.aLong177 };
				local181.method4115(10);
				local181.method4105(local184[0]);
				local181.method4105(local184[1]);
				local181.method4105(local184[2]);
				local181.method4105(local184[3]);
				local181.method4107(Static315.method4683(Static425.aString57));
				local181.method4104(Static277.aString38);
				local181.method4141(Static195.aBigInteger3, Static212.aBigInteger2);
				Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
				if (Static151.anInt2579 == 40) {
					Static232.aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_5.anInt2675);
				} else {
					Static232.aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_3.anInt2675);
				}
				Static232.aClass1_Sub1_Sub1_2.method4101(0);
				local113 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
				Static232.aClass1_Sub1_Sub1_2.method4105(586);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static97.anInt1822);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static131.method5612());
				Static232.aClass1_Sub1_Sub1_2.method4101(Static207.anInt3842);
				Static232.aClass1_Sub1_Sub1_2.method4101(Static255.anInt4574);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static389.aClass128_Sub1_1.anInt3576);
				Static326.method4591(Static232.aClass1_Sub1_Sub1_2);
				Static232.aClass1_Sub1_Sub1_2.method4104(Static143.aString15);
				Static232.aClass1_Sub1_Sub1_2.method4105(Static253.anInt4554);
				@Pc(321) Class1_Sub1 local321 = Static389.aClass128_Sub1_1.method2983();
				Static232.aClass1_Sub1_Sub1_2.method4115(local321.anInt5056);
				Static232.aClass1_Sub1_Sub1_2.method4110(local321.anInt5056, local321.aByteArray66);
				Static373.aBoolean406 = true;
				Static232.aClass1_Sub1_Sub1_2.method4101(Static303.anInt5383);
				Static232.aClass1_Sub1_Sub1_2.method4105(Static220.aClass250_51.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static249.aClass250_55.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static147.aClass250_27.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static179.aClass250_40.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static235.aClass250_53.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static88.aClass250_19.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static260.aClass250_56.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static204.aClass250_47.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static384.aClass250_76.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static316.aClass250_61.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static160.aClass250_35.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(client.lb.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static215.aClass250_50.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static420.aClass250_87.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static334.aClass250_66.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static234.aClass250_52.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static82.aClass250_17.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static96.aClass250_20.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static181.aClass250_41.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static383.aClass250_75.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static10.aClass250_3.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static412.aClass250_86.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static84.aClass250_18.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static243.aClass250_54.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static68.aClass250_15.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static276.aClass250_59.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static48.aClass250_10.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static19.aClass250_4.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static37.aClass250_9.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4105(Static116.aClass250_23.method5654());
				Static232.aClass1_Sub1_Sub1_2.method4110(local181.anInt5056, local181.aByteArray66);
				Static232.aClass1_Sub1_Sub1_2.method4091(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local113);
				Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, Static232.aClass1_Sub1_Sub1_2.anInt5056);
				Static232.aClass1_Sub1_Sub1_2.method145(local184);
				for (@Pc(550) int local550 = 0; local550 < 4; local550++) {
					local184[local550] += 50;
				}
				Static173.aClass1_Sub1_Sub1_1.method145(local184);
				Static296.anInt2704 = 4;
			}
			@Pc(586) int local586;
			if (Static296.anInt2704 == 4) {
				if (Static372.aClass161_6.method3765() < 1) {
					return;
				}
				local586 = Static372.aClass161_6.method3770();
				if (local586 == 21) {
					Static296.anInt2704 = 7;
				} else if (local586 == 29) {
					Static296.anInt2704 = 11;
				} else if (local586 == 1) {
					Static430.anInt7428 = local586;
					Static296.anInt2704 = 5;
					return;
				} else if (local586 == 2) {
					Static296.anInt2704 = 8;
				} else if (local586 == 15) {
					Static296.anInt2704 = 12;
					Static283.anInt4985 = -2;
				} else if (local586 == 23 && Static431.anInt7436 < 1) {
					Static431.anInt7436++;
					Static296.anInt2704 = 1;
					Static122.anInt2164 = 0;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
					return;
				} else {
					Static296.anInt2704 = 0;
					Static430.anInt7428 = local586;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
					return;
				}
			}
			if (Static296.anInt2704 == 6) {
				Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
				Static232.aClass1_Sub1_Sub1_2.method149(Static20.aClass108_4.anInt2675);
				Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, Static232.aClass1_Sub1_Sub1_2.anInt5056);
				Static296.anInt2704 = 4;
			} else if (Static296.anInt2704 == 7) {
				if (Static372.aClass161_6.method3765() >= 1) {
					Static269.anInt4844 = Static372.aClass161_6.method3770() * 60 + 180;
					Static430.anInt7428 = 21;
					Static296.anInt2704 = 0;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
				}
			} else if (Static296.anInt2704 != 11) {
				if (Static296.anInt2704 == 8) {
					if (Static372.aClass161_6.method3765() < 13) {
						return;
					}
					Static372.aClass161_6.method3769(13, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
					Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
					Static82.anInt1625 = Static173.aClass1_Sub1_Sub1_1.method4130();
					Static250.anInt4486 = Static173.aClass1_Sub1_Sub1_1.method4130();
					Static273.aBoolean326 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
					Static411.aBoolean461 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
					Static443.aBoolean485 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
					Static443.aBoolean484 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
					Static453.anInt7845 = Static173.aClass1_Sub1_Sub1_1.method4093();
					Static291.aBoolean333 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
					Static429.aBoolean475 = Static173.aClass1_Sub1_Sub1_1.method4130() == 1;
					Static71.aClass105_6.method2335(Static429.aBoolean475);
					Static196.aClass139_1.method3233(Static429.aBoolean475);
					Static322.aClass187_2.method4496(Static429.aBoolean475);
					if (Static273.aBoolean326 && !Static443.aBoolean485 || Static291.aBoolean333) {
						try {
							Static456.method694(Static119.aClass138_7.anApplet1, "zap");
						} catch (@Pc(872) Throwable local872) {
							if (Static235.aBoolean283) {
								try {
									Static119.aClass138_7.anApplet1.getAppletContext().showDocument(new URL(Static119.aClass138_7.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(888) Exception local888) {
								}
							}
						}
					} else {
						try {
							Static456.method694(Static119.aClass138_7.anApplet1, "unzap");
						} catch (@Pc(862) Throwable local862) {
						}
					}
					if (Static221.aClass176_5 == Static234.aClass176_7) {
						try {
							Static456.method694(Static119.aClass138_7.anApplet1, "loggedin");
						} catch (@Pc(900) Throwable local900) {
						}
					}
					Static296.anInt2704 = 10;
				}
				if (Static296.anInt2704 == 10) {
					if (Static173.aClass1_Sub1_Sub1_1.method152()) {
						if (Static372.aClass161_6.method3765() < 1) {
							return;
						}
						Static372.aClass161_6.method3769(1, Static173.aClass1_Sub1_Sub1_1.anInt5056 + 2, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
					}
					Static329.aClass237_97 = Static281.method4023()[Static173.aClass1_Sub1_Sub1_1.method153()];
					Static283.anInt4985 = Static173.aClass1_Sub1_Sub1_1.method4093();
					Static296.anInt2704 = 9;
				}
				if (Static296.anInt2704 == 9) {
					if (Static372.aClass161_6.method3765() >= Static283.anInt4985) {
						Static372.aClass161_6.method3769(Static283.anInt4985, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
						Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
						Static296.anInt2704 = 0;
						Static430.anInt7428 = 2;
						local586 = Static283.anInt4985;
						Static198.method3008();
						Static350.method4846(Static173.aClass1_Sub1_Sub1_1);
						Static13.anInt330 = -1;
						Static442.method4063();
						if (Static173.aClass1_Sub1_Sub1_1.anInt5056 != local586) {
							throw new RuntimeException("lswp pos:" + Static173.aClass1_Sub1_Sub1_1.anInt5056 + " psize:" + local586);
						}
						Static329.aClass237_97 = null;
					}
				} else if (Static296.anInt2704 == 12) {
					if (Static283.anInt4985 == -2) {
						if (Static372.aClass161_6.method3765() < 2) {
							return;
						}
						Static372.aClass161_6.method3769(2, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
						Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
						Static283.anInt4985 = Static173.aClass1_Sub1_Sub1_1.method4093();
					}
					if (Static372.aClass161_6.method3765() >= Static283.anInt4985) {
						Static372.aClass161_6.method3769(Static283.anInt4985, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
						Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
						Static430.anInt7428 = 15;
						Static296.anInt2704 = 0;
						local586 = Static283.anInt4985;
						Static50.method822();
						Static350.method4846(Static173.aClass1_Sub1_Sub1_1);
						if (Static173.aClass1_Sub1_Sub1_1.anInt5056 != local586) {
							throw new RuntimeException("lswpr pos:" + Static173.aClass1_Sub1_Sub1_1.anInt5056 + " psize:" + local586);
						}
						Static329.aClass237_97 = null;
					}
				}
			} else if (Static372.aClass161_6.method3765() >= 1) {
				Static363.anInt6169 = Static372.aClass161_6.method3770();
				Static430.anInt7428 = 29;
				Static296.anInt2704 = 0;
				Static372.aClass161_6.method3764();
				Static372.aClass161_6 = null;
			}
		} catch (@Pc(1089) IOException local1089) {
			if (Static372.aClass161_6 != null) {
				Static372.aClass161_6.method3764();
				Static372.aClass161_6 = null;
			}
			if (Static431.anInt7436 < 1) {
				Static296.anInt2704 = 1;
				Static431.anInt7436++;
				if (Static41.anInt7070 == Static163.anInt3040) {
					Static163.anInt3040 = Static58.anInt1248;
				} else {
					Static163.anInt3040 = Static41.anInt7070;
				}
				Static122.anInt2164 = 0;
			} else {
				Static430.anInt7428 = -4;
				Static296.anInt2704 = 0;
			}
		}
	}
}
