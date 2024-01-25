import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array6;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString6 = "";

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
	public static void method1225() {
		if (!Static281.aBoolean503) {
			return;
		}
		while (true) {
			while (Static75.anInt1415 < Static339.aClass120_Sub1Array6.length) {
				@Pc(25) Class120_Sub1 local25 = Static339.aClass120_Sub1Array6[Static75.anInt1415];
				if (local25 != null && local25.anInt5097 == -1) {
					if (Static204.aClass2_Sub2_1 == null) {
						Static204.aClass2_Sub2_1 = Static350.aClass62_1.method1685(local25.aString47);
					}
					@Pc(48) int local48 = Static204.aClass2_Sub2_1.anInt98;
					if (local48 == -1) {
						return;
					}
					Static75.anInt1415++;
					local25.anInt5097 = local48;
					Static204.aClass2_Sub2_1 = null;
				} else {
					Static75.anInt1415++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
	public static void method1226() {
		if (Static269.anInt6656 == 0 || Static269.anInt6656 == 5) {
			return;
		}
		try {
			if (++Static195.anInt4281 > 2000) {
				if (Static129.aClass117_2 != null) {
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
				}
				if (Static46.anInt750 >= 1) {
					Static284.anInt5721 = -5;
					Static269.anInt6656 = 0;
					return;
				}
				if (Static295.anInt5861 == Static238.anInt5092) {
					Static295.anInt5861 = Static248.anInt5205;
				} else {
					Static295.anInt5861 = Static238.anInt5092;
				}
				Static195.anInt4281 = 0;
				Static46.anInt750++;
				Static269.anInt6656 = 1;
			}
			if (Static269.anInt6656 == 1) {
				Static145.aClass26_4 = Static62.aClass179_2.method4887(Static295.anInt5861, Static90.aString19);
				Static269.anInt6656 = 2;
			}
			if (Static269.anInt6656 == 2) {
				if (Static145.aClass26_4.anInt484 == 2) {
					throw new IOException();
				}
				if (Static145.aClass26_4.anInt484 != 1) {
					return;
				}
				Static129.aClass117_2 = new Class117((Socket) Static145.aClass26_4.anObject1, Static62.aClass179_2);
				Static145.aClass26_4 = null;
				@Pc(101) long local101 = Static126.aLong91 = Static223.method4182(aString6);
				@Pc(108) int local108 = (int) (local101 >> 16 & 0x1FL);
				Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
				Static197.aClass2_Sub12_Sub2_2.method3147(Static217.aClass69_1.anInt1946);
				Static197.aClass2_Sub12_Sub2_2.method3147(local108);
				Static129.aClass117_2.method3279(2, Static197.aClass2_Sub12_Sub2_2.aByteArray30);
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				@Pc(141) int local141 = Static129.aClass117_2.method3271();
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				if (local141 != 0) {
					Static269.anInt6656 = 0;
					Static284.anInt5721 = local141;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
					return;
				}
				Static269.anInt6656 = 3;
			}
			if (Static269.anInt6656 == 3) {
				if (Static129.aClass117_2.method3273() < 8) {
					return;
				}
				Static129.aClass117_2.method3274(0, 8, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
				Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
				Static23.aLong23 = Static273.aClass2_Sub12_Sub2_3.method3142();
				@Pc(194) int[] local194 = new int[4];
				Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
				local194[0] = (int) (Math.random() * 9.9999999E7D);
				local194[2] = (int) (Static23.aLong23 >> 32);
				local194[1] = (int) (Math.random() * 9.9999999E7D);
				local194[3] = (int) Static23.aLong23;
				Static197.aClass2_Sub12_Sub2_2.method3147(10);
				Static197.aClass2_Sub12_Sub2_2.method3162(local194[0]);
				Static197.aClass2_Sub12_Sub2_2.method3162(local194[1]);
				Static197.aClass2_Sub12_Sub2_2.method3162(local194[2]);
				Static197.aClass2_Sub12_Sub2_2.method3162(local194[3]);
				Static197.aClass2_Sub12_Sub2_2.method3130(Static223.method4182(aString6));
				Static197.aClass2_Sub12_Sub2_2.method3156(Static311.aString65);
				Static197.aClass2_Sub12_Sub2_2.method3139(Static88.aBigInteger3, Static261.aBigInteger4);
				Static83.aClass2_Sub12_Sub2_1.anInt3606 = 0;
				if (Static176.anInt3971 == 40) {
					Static83.aClass2_Sub12_Sub2_1.method3147(Static217.aClass69_5.anInt1946);
				} else {
					Static83.aClass2_Sub12_Sub2_1.method3147(Static217.aClass69_3.anInt1946);
				}
				Static83.aClass2_Sub12_Sub2_1.method3158(Static197.aClass2_Sub12_Sub2_2.anInt3606 + Static217.method4134(Static71.aString12) + 161);
				Static83.aClass2_Sub12_Sub2_1.method3162(570);
				Static83.aClass2_Sub12_Sub2_1.method3147(Static338.anInt6592);
				Static83.aClass2_Sub12_Sub2_1.method3147(Static26.method3361());
				Static83.aClass2_Sub12_Sub2_1.method3158(Static335.anInt6496);
				Static83.aClass2_Sub12_Sub2_1.method3158(Static25.anInt396);
				Static83.aClass2_Sub12_Sub2_1.method3147(Static181.anInt4031);
				Static89.method1797(Static83.aClass2_Sub12_Sub2_1);
				Static83.aClass2_Sub12_Sub2_1.method3156(Static71.aString12);
				Static83.aClass2_Sub12_Sub2_1.method3162(Static206.anInt4520);
				Static83.aClass2_Sub12_Sub2_1.method3162(Static127.method2504());
				Static128.aBoolean263 = true;
				Static83.aClass2_Sub12_Sub2_1.method3158(Static281.anInt5678);
				Static83.aClass2_Sub12_Sub2_1.method3162(Static296.aClass104_177.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static327.aClass104_166.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static304.aClass104_159.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static224.aClass104_181.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static80.aClass104_54.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static63.aClass104_43.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static284.aClass104_149.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static302.aClass104_156.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static338.aClass104_184.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static156.aClass104_94.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static55.aClass104_40.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static207.aClass104_115.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static151.aClass104_90.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static283.aClass104_148.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static28.aClass104_22.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static14.aClass104_10.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static67.aClass104_109.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static304.aClass104_160.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static278.aClass104_146.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static36.aClass104_26.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static213.aClass104_119.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static24.aClass104_33.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static299.aClass104_153.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static92.aClass104_63.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static19.aClass104_14.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static309.aClass104_162.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static159.aClass104_78.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static358.aClass104_193.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3162(Static251.aClass104_135.method2768());
				Static83.aClass2_Sub12_Sub2_1.method3106(Static197.aClass2_Sub12_Sub2_2.aByteArray30, Static197.aClass2_Sub12_Sub2_2.anInt3606);
				Static129.aClass117_2.method3279(Static83.aClass2_Sub12_Sub2_1.anInt3606, Static83.aClass2_Sub12_Sub2_1.aByteArray30);
				Static197.aClass2_Sub12_Sub2_2.method3174(local194);
				for (@Pc(581) int local581 = 0; local581 < 4; local581++) {
					local194[local581] += 50;
				}
				Static273.aClass2_Sub12_Sub2_3.method3174(local194);
				Static269.anInt6656 = 4;
			}
			@Pc(619) int local619;
			if (Static269.anInt6656 == 4) {
				if (Static129.aClass117_2.method3273() < 1) {
					return;
				}
				local619 = Static129.aClass117_2.method3271();
				if (local619 == 21) {
					Static269.anInt6656 = 7;
				} else if (local619 == 29) {
					Static269.anInt6656 = 11;
				} else if (local619 == 1) {
					Static284.anInt5721 = local619;
					Static269.anInt6656 = 5;
					return;
				} else if (local619 == 2) {
					Static269.anInt6656 = 8;
				} else if (local619 == 15) {
					Static275.anInt5636 = -2;
					Static269.anInt6656 = 12;
				} else if (local619 == 23 && Static46.anInt750 < 1) {
					Static195.anInt4281 = 0;
					Static46.anInt750++;
					Static269.anInt6656 = 1;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
					return;
				} else {
					Static269.anInt6656 = 0;
					Static284.anInt5721 = local619;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
					return;
				}
			}
			if (Static269.anInt6656 == 6) {
				Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
				Static197.aClass2_Sub12_Sub2_2.method3171(Static217.aClass69_4.anInt1946);
				Static129.aClass117_2.method3279(Static197.aClass2_Sub12_Sub2_2.anInt3606, Static197.aClass2_Sub12_Sub2_2.aByteArray30);
				Static269.anInt6656 = 4;
			} else if (Static269.anInt6656 == 7) {
				if (Static129.aClass117_2.method3273() >= 1) {
					Static176.anInt3968 = Static129.aClass117_2.method3271() * 60 + 180;
					Static269.anInt6656 = 0;
					Static284.anInt5721 = 21;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
				}
			} else if (Static269.anInt6656 != 11) {
				if (Static269.anInt6656 == 8) {
					if (Static129.aClass117_2.method3273() < 13) {
						return;
					}
					Static129.aClass117_2.method3274(0, 13, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
					Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
					Static291.anInt5264 = Static273.aClass2_Sub12_Sub2_3.method3124();
					Static97.anInt1940 = Static273.aClass2_Sub12_Sub2_3.method3124();
					Static283.aBoolean505 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
					Static237.aBoolean443 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
					Static345.aBoolean600 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
					Static359.aBoolean608 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
					Static217.anInt4819 = Static273.aClass2_Sub12_Sub2_3.method3104();
					Static328.aBoolean597 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
					Static235.aBoolean440 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
					Static212.method3981(Static235.aBoolean440);
					Static310.aClass184_2.method5041(Static235.aBoolean440);
					Static356.method5692(Static235.aBoolean440);
					if (Static283.aBoolean505 && !Static345.aBoolean600 || Static328.aBoolean597) {
						try {
							Static381.method5669(Static62.aClass179_2.anApplet1, "zap");
						} catch (@Pc(906) Throwable local906) {
							if (Static171.aBoolean333) {
								try {
									Static62.aClass179_2.anApplet1.getAppletContext().showDocument(new URL(Static62.aClass179_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(922) Exception local922) {
								}
							}
						}
					} else {
						try {
							Static381.method5669(Static62.aClass179_2.anApplet1, "unzap");
						} catch (@Pc(896) Throwable local896) {
						}
					}
					if (Static260.anInt5453 == 0) {
						try {
							Static381.method5669(Static62.aClass179_2.anApplet1, "loggedin");
						} catch (@Pc(933) Throwable local933) {
						}
					}
					Static269.anInt6656 = 10;
				}
				if (Static269.anInt6656 == 10) {
					if (Static273.aClass2_Sub12_Sub2_3.method3168()) {
						if (Static129.aClass117_2.method3273() < 1) {
							return;
						}
						Static129.aClass117_2.method3274(Static273.aClass2_Sub12_Sub2_3.anInt3606 + 2, 1, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
					}
					Static40.aClass221_34 = Static21.method2844()[Static273.aClass2_Sub12_Sub2_3.method3175()];
					Static275.anInt5636 = Static273.aClass2_Sub12_Sub2_3.method3104();
					Static269.anInt6656 = 9;
				}
				if (Static269.anInt6656 == 9) {
					if (Static129.aClass117_2.method3273() >= Static275.anInt5636) {
						Static129.aClass117_2.method3274(0, Static275.anInt5636, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
						Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
						Static269.anInt6656 = 0;
						Static284.anInt5721 = 2;
						local619 = Static275.anInt5636;
						Static96.method1892();
						Static134.method2607(Static273.aClass2_Sub12_Sub2_3);
						Static208.anInt4568 = -1;
						Static196.method3638(false);
						if (Static273.aClass2_Sub12_Sub2_3.anInt3606 != local619) {
							throw new RuntimeException("lswp pos:" + Static273.aClass2_Sub12_Sub2_3.anInt3606 + " psize:" + local619);
						}
						Static40.aClass221_34 = null;
					}
				} else if (Static269.anInt6656 == 12) {
					if (Static275.anInt5636 == -2) {
						if (Static129.aClass117_2.method3273() < 2) {
							return;
						}
						Static129.aClass117_2.method3274(0, 2, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
						Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
						Static275.anInt5636 = Static273.aClass2_Sub12_Sub2_3.method3104();
					}
					if (Static129.aClass117_2.method3273() >= Static275.anInt5636) {
						Static129.aClass117_2.method3274(0, Static275.anInt5636, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
						Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
						Static284.anInt5721 = 15;
						local619 = Static275.anInt5636;
						Static269.anInt6656 = 0;
						Static264.method4654();
						Static134.method2607(Static273.aClass2_Sub12_Sub2_3);
						if (Static273.aClass2_Sub12_Sub2_3.anInt3606 != local619) {
							throw new RuntimeException("lswpr pos:" + Static273.aClass2_Sub12_Sub2_3.anInt3606 + " psize:" + local619);
						}
						Static40.aClass221_34 = null;
					}
				}
			} else if (Static129.aClass117_2.method3273() >= 1) {
				Static248.anInt5204 = Static129.aClass117_2.method3271();
				Static284.anInt5721 = 29;
				Static269.anInt6656 = 0;
				Static129.aClass117_2.method3278();
				Static129.aClass117_2 = null;
			}
		} catch (@Pc(1121) IOException local1121) {
			if (Static129.aClass117_2 != null) {
				Static129.aClass117_2.method3278();
				Static129.aClass117_2 = null;
			}
			if (Static46.anInt750 < 1) {
				Static195.anInt4281 = 0;
				Static46.anInt750++;
				Static269.anInt6656 = 1;
				if (Static295.anInt5861 == Static238.anInt5092) {
					Static295.anInt5861 = Static248.anInt5205;
				} else {
					Static295.anInt5861 = Static238.anInt5092;
				}
			} else {
				Static284.anInt5721 = -4;
				Static269.anInt6656 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
	public static void method1227() {
		@Pc(1) Class107 local1 = Static300.aClass107_49;
		synchronized (Static300.aClass107_49) {
			Static300.aClass107_49.method3012();
		}
		local1 = Static58.aClass107_7;
		synchronized (Static58.aClass107_7) {
			Static58.aClass107_7.method3012();
		}
	}
}
