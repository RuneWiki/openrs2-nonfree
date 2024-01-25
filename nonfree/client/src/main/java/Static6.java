import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "Lclient!ob;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)V")
	public static void method65() {
		if (Static453.anInt8320 == 0 || Static453.anInt8320 == 5) {
			return;
		}
		try {
			@Pc(18) short local18;
			if (Static64.anInt2001 == 0) {
				local18 = 250;
			} else {
				local18 = 2000;
			}
			if (local18 < ++Static478.anInt8582) {
				if (Static319.aClass240_2 != null) {
					Static319.aClass240_2.method6372();
					Static319.aClass240_2 = null;
				}
				if (Static64.anInt2001 >= 3) {
					Static453.anInt8320 = 0;
					Static590.method8155(-5);
					return;
				}
				if (Static475.anInt8512 == 2) {
					Static471.aClass280_2.method7028();
				} else {
					Static631.aClass280_5.method7028();
				}
				Static64.anInt2001++;
				Static478.anInt8582 = 0;
				Static453.anInt8320 = 1;
			}
			if (Static453.anInt8320 == 1) {
				if (Static475.anInt8512 == 2) {
					Static10.aClass301_1 = Static471.aClass280_2.method7026(Static51.aClass118_1);
				} else {
					Static10.aClass301_1 = Static631.aClass280_5.method7026(Static51.aClass118_1);
				}
				Static453.anInt8320 = 2;
			}
			@Pc(126) Class8_Sub31 local126;
			if (Static453.anInt8320 == 2) {
				if (Static10.aClass301_1.anInt8915 == 2) {
					throw new IOException();
				}
				if (Static10.aClass301_1.anInt8915 != 1) {
					return;
				}
				Static319.aClass240_2 = Static368.method5739((Socket) Static10.aClass301_1.anObject18);
				Static10.aClass301_1 = null;
				Static209.method4022();
				local126 = Static409.method6472();
				local126.aClass8_Sub8_Sub2_1.method8562(Static125.aClass306_29.anInt8954);
				Static262.method4604(local126);
				Static441.method6809();
				Static453.anInt8320 = 3;
			}
			@Pc(165) int local165;
			if (Static453.anInt8320 == 3) {
				if (!Static319.aClass240_2.method6379(1)) {
					return;
				}
				Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
				local165 = Static442.aClass8_Sub8_Sub2_2.aByteArray107[0] & 0xFF;
				if (local165 != 0) {
					Static453.anInt8320 = 0;
					Static590.method8155(local165);
					Static319.aClass240_2.method6372();
					Static319.aClass240_2 = null;
					Static45.method1355();
					return;
				}
				Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
				@Pc(191) Class8_Sub8 local191 = new Class8_Sub8(518);
				@Pc(194) int[] local194 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local191.method8562(10);
				local191.method8523(local194[0]);
				local191.method8523(local194[1]);
				local191.method8523(local194[2]);
				local191.method8523(local194[3]);
				local191.method8564(0L);
				local191.method8582(Static191.aString57);
				local191.method8564(Static34.aLong209);
				local191.method8564(Static98.aLong59);
				local191.method8557(Static423.aBigInteger9, Static177.aBigInteger4);
				Static209.method4022();
				@Pc(276) Class8_Sub31 local276 = Static409.method6472();
				@Pc(279) Class8_Sub8_Sub2 local279 = local276.aClass8_Sub8_Sub2_1;
				@Pc(296) int local296;
				@Pc(311) int local311;
				if (Static475.anInt8512 == 2) {
					if (Static435.anInt8191 == 13) {
						local279.method8562(Static125.aClass306_33.anInt8954);
					} else {
						local279.method8562(Static125.aClass306_31.anInt8954);
					}
					local279.method8548(0);
					local296 = local279.anInt10588;
					local279.method8523(632);
					local279.method8532(local191.anInt10588, 0, local191.aByteArray107);
					local311 = local279.anInt10588;
					local279.method8582(Static95.aString32);
					local279.method8562(Static99.anInt2642);
					local279.method8562(Static383.method6158());
					local279.method8548(Static235.anInt5298);
					local279.method8548(Static313.anInt6355);
					local279.method8562(Static155.aClass8_Sub25_6.aClass36_Sub26_1.method7794());
					Static495.method1945(local279);
					local279.method8582(Static254.aString54);
					local279.method8523(Static60.anInt1930);
					@Pc(434) Class8_Sub8 local434 = Static155.aClass8_Sub25_6.method3476();
					local279.method8562(local434.anInt10588);
					local279.method8532(local434.anInt10588, 0, local434.aByteArray107);
					Static497.aBoolean740 = true;
					@Pc(456) Class8_Sub8 local456 = new Class8_Sub8(Static38.aClass8_Sub15_1.method2180());
					Static38.aClass8_Sub15_1.method2183(local456);
					local279.method8532(local456.aByteArray107.length, 0, local456.aByteArray107);
					local279.method8548(Static48.anInt4222);
					local279.method8564(Static161.aLong101);
					local279.method8562(Static600.aString110 == null ? 0 : 1);
					if (Static600.aString110 != null) {
						local279.method8582(Static600.aString110);
					}
					local279.method8562(Static343.method5468("jagtheora") ? 1 : 0);
					Static416.method6523(local279);
					local279.method8559(local311, local194, local279.anInt10588);
					local279.method8533(local279.anInt10588 - local296);
				} else {
					local279.method8562(Static125.aClass306_34.anInt8954);
					local279.method8548(0);
					local296 = local279.anInt10588;
					local279.method8523(632);
					local279.method8532(local191.anInt10588, 0, local191.aByteArray107);
					local311 = local279.anInt10588;
					local279.method8582(Static95.aString32);
					local279.method8562(Static18.aClass217_1.anInt6835);
					local279.method8562(Static372.anInt7083);
					Static495.method1945(local279);
					local279.method8582(Static254.aString54);
					local279.method8523(Static60.anInt1930);
					Static416.method6523(local279);
					local279.method8559(local311, local194, local279.anInt10588);
					local279.method8533(local279.anInt10588 - local296);
				}
				Static262.method4604(local276);
				Static441.method6809();
				Static608.aClass336_1 = new Class336(local194);
				for (local296 = 0; local296 < 4; local296++) {
					local194[local296] += 50;
				}
				Static442.aClass8_Sub8_Sub2_2.method8584(local194);
				Static453.anInt8320 = 4;
			}
			if (Static453.anInt8320 == 4) {
				if (!Static319.aClass240_2.method6379(1)) {
					return;
				}
				Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
				local165 = Static442.aClass8_Sub8_Sub2_2.aByteArray107[0] & 0xFF;
				if (local165 == 21) {
					Static453.anInt8320 = 7;
				} else if (local165 == 29) {
					Static453.anInt8320 = 13;
				} else if (local165 == 1) {
					Static453.anInt8320 = 5;
					Static590.method8155(local165);
					return;
				} else if (local165 == 2) {
					Static453.anInt8320 = 8;
				} else if (local165 == 15) {
					Static453.anInt8320 = 14;
					Static635.anInt10565 = -2;
				} else if (local165 == 23 && Static64.anInt2001 < 3) {
					Static64.anInt2001++;
					Static478.anInt8582 = 0;
					Static453.anInt8320 = 1;
					Static319.aClass240_2.method6372();
					Static319.aClass240_2 = null;
					return;
				} else {
					Static453.anInt8320 = 0;
					Static590.method8155(local165);
					Static319.aClass240_2.method6372();
					Static319.aClass240_2 = null;
					Static45.method1355();
					return;
				}
			}
			if (Static453.anInt8320 == 6) {
				Static209.method4022();
				local126 = Static409.method6472();
				@Pc(663) Class8_Sub8_Sub2 local663 = local126.aClass8_Sub8_Sub2_1;
				local663.method8588(Static608.aClass336_1);
				local663.method8591(Static125.aClass306_40.anInt8954);
				Static262.method4604(local126);
				Static441.method6809();
				Static453.anInt8320 = 4;
			} else if (Static453.anInt8320 == 7) {
				if (Static319.aClass240_2.method6379(1)) {
					Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
					local165 = Static442.aClass8_Sub8_Sub2_2.aByteArray107[0] & 0xFF;
					Static643.anInt10695 = (local165 + 3) * 60;
					Static453.anInt8320 = 0;
					Static590.method8155(21);
					Static319.aClass240_2.method6372();
					Static319.aClass240_2 = null;
					Static45.method1355();
				}
			} else if (Static453.anInt8320 == 13) {
				if (Static319.aClass240_2.method6379(1)) {
					Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
					Static453.anInt8320 = 0;
					Static9.anInt129 = Static442.aClass8_Sub8_Sub2_2.aByteArray107[0] & 0xFF;
					Static590.method8155(29);
					Static319.aClass240_2.method6372();
					Static319.aClass240_2 = null;
					Static45.method1355();
				}
			} else if (Static453.anInt8320 != 8) {
				@Pc(803) Class8_Sub8_Sub2 local803;
				if (Static453.anInt8320 == 9) {
					local803 = Static442.aClass8_Sub8_Sub2_2;
					if (Static475.anInt8512 == 2) {
						if (!Static319.aClass240_2.method6379(Static469.anInt8489)) {
							return;
						}
						Static319.aClass240_2.method6374(local803.aByteArray107, 0, Static469.anInt8489);
						local803.anInt10588 = 0;
						Static190.anInt7431 = local803.method8525();
						Static218.anInt5024 = local803.method8525();
						Static408.aBoolean563 = local803.method8525() == 1;
						Static599.aBoolean732 = local803.method8525() == 1;
						Static220.aBoolean377 = local803.method8525() == 1;
						Static321.aBoolean449 = local803.method8525() == 1;
						Static616.anInt10362 = local803.method8578();
						Static420.aBoolean573 = local803.method8525() == 1;
						Static55.anInt1865 = local803.method8561();
						Static565.aBoolean307 = local803.method8525() == 1;
						Static437.aClass199_3.method5341(Static565.aBoolean307);
						Static497.aClass258_21.method6651(Static565.aBoolean307);
						Static297.aClass338_1.method7854(Static565.aBoolean307);
					} else if (Static319.aClass240_2.method6379(Static469.anInt8489)) {
						Static319.aClass240_2.method6374(local803.aByteArray107, 0, Static469.anInt8489);
						local803.anInt10588 = 0;
						Static190.anInt7431 = local803.method8525();
						Static218.anInt5024 = local803.method8525();
						Static408.aBoolean563 = local803.method8525() == 1;
						Static599.aBoolean732 = local803.method8525() == 1;
						Static220.aBoolean377 = local803.method8525() == 1;
						Static225.anInt10608 = local803.method8568();
						Static420.aBoolean573 = Static225.anInt10608 > 0;
						Static181.anInt4233 = local803.method8578();
						Static174.anInt4170 = local803.method8578();
						Static557.anInt9674 = local803.method8578();
						Static70.anInt2088 = local803.method8540();
						Static557.aClass301_8 = Static51.aClass118_1.method3398(Static70.anInt2088);
						Static603.anInt10256 = local803.method8525();
						Static472.anInt8796 = local803.method8578();
						Static135.anInt3564 = local803.method8578();
						Static59.aBoolean130 = local803.method8525() == 1;
						Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString36 = Static634.aString96 = local803.method8569();
						Static294.anInt5951 = local803.method8525();
						Static17.anInt869 = local803.method8540();
						Static129.aClass280_1 = new Class280();
						Static129.aClass280_1.anInt8497 = local803.method8578();
						if (Static129.aClass280_1.anInt8497 == 65535) {
							Static129.aClass280_1.anInt8497 = -1;
						}
						Static129.aClass280_1.aString87 = local803.method8569();
						if (Static101.aClass313_5 != Static277.aClass313_9) {
							Static129.aClass280_1.anInt8493 = Static129.aClass280_1.anInt8497 + 50000;
							Static129.aClass280_1.anInt8501 = Static129.aClass280_1.anInt8497 + 40000;
						}
						if (Static277.aClass313_9 != Static253.aClass313_8 && (Static471.aClass280_2.method7023(Static490.aClass280_4) || Static471.aClass280_2.method7023(Static476.aClass280_3))) {
							Static121.method2705();
						}
					} else {
						return;
					}
					if (Static408.aBoolean563 && !Static220.aBoolean377 || Static420.aBoolean573) {
						try {
							Static646.method1435("zap", Static152.anApplet1);
						} catch (@Pc(1108) Throwable local1108) {
							if (Static155.aBoolean282) {
								try {
									Static152.anApplet1.getAppletContext().showDocument(new URL(Static152.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1122) Exception local1122) {
								}
							}
						}
					} else {
						try {
							Static646.method1435("unzap", Static152.anApplet1);
						} catch (@Pc(1131) Throwable local1131) {
						}
					}
					if (Static277.aClass313_9 == Static101.aClass313_5) {
						try {
							Static646.method1435("loggedin", Static152.anApplet1);
						} catch (@Pc(1142) Throwable local1142) {
						}
					}
					if (Static475.anInt8512 != 2) {
						Static453.anInt8320 = 0;
						Static590.method8155(2);
						Static479.method7071();
						Static63.method1687(7);
						Static71.aClass71_22 = null;
						return;
					}
					Static453.anInt8320 = 11;
				}
				if (Static453.anInt8320 == 11) {
					if (!Static319.aClass240_2.method6379(3)) {
						return;
					}
					Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 3);
					Static453.anInt8320 = 12;
				}
				if (Static453.anInt8320 == 12) {
					local803 = Static442.aClass8_Sub8_Sub2_2;
					local803.anInt10588 = 0;
					if (local803.method8587()) {
						if (!Static319.aClass240_2.method6379(1)) {
							return;
						}
						Static319.aClass240_2.method6374(local803.aByteArray107, 3, 1);
					}
					Static71.aClass71_22 = Static45.method1356()[local803.method8593()];
					Static635.anInt10565 = local803.method8578();
					Static453.anInt8320 = 10;
				}
				if (Static453.anInt8320 == 10) {
					if (Static319.aClass240_2.method6379(Static635.anInt10565)) {
						Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, Static635.anInt10565);
						Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
						Static453.anInt8320 = 0;
						local165 = Static635.anInt10565;
						Static590.method8155(2);
						Static498.method7245();
						Static1.method8307(Static442.aClass8_Sub8_Sub2_2);
						Static325.anInt6515 = -1;
						if (Static399.aClass71_97 == Static71.aClass71_22) {
							Static298.method8349();
						} else {
							Static139.method2956();
						}
						if (local165 != Static442.aClass8_Sub8_Sub2_2.anInt10588) {
							throw new RuntimeException("lswp pos:" + Static442.aClass8_Sub8_Sub2_2.anInt10588 + " psize:" + local165);
						}
						Static71.aClass71_22 = null;
					}
				} else if (Static453.anInt8320 == 14) {
					if (Static635.anInt10565 == -2) {
						if (!Static319.aClass240_2.method6379(2)) {
							return;
						}
						Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 2);
						Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
						Static635.anInt10565 = Static442.aClass8_Sub8_Sub2_2.method8578();
					}
					if (Static319.aClass240_2.method6379(Static635.anInt10565)) {
						Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, Static635.anInt10565);
						Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
						Static453.anInt8320 = 0;
						local165 = Static635.anInt10565;
						Static590.method8155(15);
						Static440.method6804();
						Static1.method8307(Static442.aClass8_Sub8_Sub2_2);
						if (Static442.aClass8_Sub8_Sub2_2.anInt10588 != local165) {
							throw new RuntimeException("lswpr pos:" + Static442.aClass8_Sub8_Sub2_2.anInt10588 + " psize:" + local165);
						}
						Static71.aClass71_22 = null;
					}
				}
			} else if (Static319.aClass240_2.method6379(1)) {
				Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
				Static453.anInt8320 = 9;
				Static469.anInt8489 = Static442.aClass8_Sub8_Sub2_2.aByteArray107[0] & 0xFF;
			}
		} catch (@Pc(1383) IOException local1383) {
			if (Static319.aClass240_2 != null) {
				Static319.aClass240_2.method6372();
				Static319.aClass240_2 = null;
			}
			if (Static64.anInt2001 < 3) {
				if (Static475.anInt8512 == 2) {
					Static471.aClass280_2.method7028();
				} else {
					Static631.aClass280_5.method7028();
				}
				Static453.anInt8320 = 1;
				Static64.anInt2001++;
				Static478.anInt8582 = 0;
			} else {
				Static453.anInt8320 = 0;
				Static590.method8155(-4);
				Static45.method1355();
			}
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)[Lclient!se;")
	public static Class306[] method66() {
		return new Class306[] { Static125.aClass306_29, Static125.aClass306_30, Static125.aClass306_31, Static125.aClass306_32, Static125.aClass306_33, Static125.aClass306_34, Static125.aClass306_35, Static125.aClass306_36, Static125.aClass306_37, Static125.aClass306_38, Static125.aClass306_39, Static125.aClass306_40, Static125.aClass306_41, Static125.aClass306_42 };
	}
}
