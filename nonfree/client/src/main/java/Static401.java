import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public static int anInt7078;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
	public static final int[] anIntArray572 = new int[2048];

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	public static int anInt7082 = 0;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	public static int anInt7085 = 0;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	public static void method5647() {
		if (Static427.anInt7334 == 0 || Static427.anInt7334 == 6) {
			return;
		}
		try {
			if (++Static179.anInt3678 > 2000) {
				if (Static172.aClass13_1 != null) {
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
				}
				if (Static164.anInt3259 >= 1) {
					Static427.anInt7334 = 0;
					Static455.method6191(-5);
					return;
				}
				if (Static147.anInt3063 == 2 || Static147.anInt3063 == 3) {
					Static302.aClass9_6.aBoolean2 = !Static302.aClass9_6.aBoolean2;
				} else {
					Static256.aClass9_5.aBoolean2 = !Static256.aClass9_5.aBoolean2;
				}
				Static179.anInt3678 = 0;
				Static427.anInt7334 = 1;
				Static164.anInt3259++;
			}
			if (Static427.anInt7334 == 1) {
				if (Static147.anInt3063 == 2 || Static147.anInt3063 == 3) {
					Static213.aClass87_5 = Static390.aClass255_5.method5825(Static302.aClass9_6.aString1, Static302.aClass9_6.method74());
				} else {
					Static213.aClass87_5 = Static390.aClass255_5.method5825(Static256.aClass9_5.aString1, Static256.aClass9_5.method74());
				}
				Static427.anInt7334 = 2;
			}
			if (Static427.anInt7334 == 2) {
				if (Static213.aClass87_5.anInt2679 == 2) {
					throw new IOException();
				}
				if (Static213.aClass87_5.anInt2679 != 1) {
					return;
				}
				Static172.aClass13_1 = Static139.method2565((Socket) Static213.aClass87_5.anObject3);
				Static213.aClass87_5 = null;
				@Pc(143) long local143 = Static145.aLong94 = Static234.method3954(Static337.aString51);
				Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
				@Pc(153) int local153 = (int) (local143 >> 16 & 0x1FL);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static34.aClass81_1.anInt2486);
				Static457.aClass4_Sub20_Sub1_5.method4590(local153);
				Static172.aClass13_1.method177(2, Static457.aClass4_Sub20_Sub1_5.aByteArray77);
				Static427.anInt7334 = 3;
			}
			@Pc(199) int local199;
			if (Static427.anInt7334 == 3) {
				if (!Static172.aClass13_1.method179(1)) {
					return;
				}
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
				local199 = Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF;
				if (local199 != 0) {
					Static427.anInt7334 = 0;
					Static455.method6191(local199);
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
					Static371.method5252();
					return;
				}
				Static427.anInt7334 = 4;
			}
			if (Static427.anInt7334 == 4) {
				if (!Static172.aClass13_1.method179(8)) {
					return;
				}
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 8);
				Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
				Static149.aLong97 = Static196.aClass4_Sub20_Sub1_4.method4603();
				@Pc(250) Class4_Sub20 local250 = new Class4_Sub20(70);
				@Pc(253) int[] local253 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static149.aLong97 >> 32), (int) Static149.aLong97 };
				local250.method4590(10);
				local250.method4561(local253[0]);
				local250.method4561(local253[1]);
				local250.method4561(local253[2]);
				local250.method4561(local253[3]);
				local250.method4556(Static234.method3954(Static337.aString51));
				local250.method4599(Static410.aString67);
				local250.method4583(Static110.aBigInteger2, Static67.aBigInteger1);
				@Pc(330) Class4_Sub20_Sub1 local330 = Static457.aClass4_Sub20_Sub1_5;
				local330.anInt5526 = 0;
				@Pc(355) int local355;
				if (Static147.anInt3063 == 2 || Static147.anInt3063 == 3) {
					if (Static70.anInt1726 == 12) {
						local330.method4590(Static34.aClass81_5.anInt2486);
					} else {
						local330.method4590(Static34.aClass81_3.anInt2486);
					}
					local330.method4558(0);
					local355 = local330.anInt5526;
					local330.method4561(604);
					local330.method4590(Static67.anInt1640);
					local330.method4590(Static331.method4891());
					local330.method4558(Static374.anInt6595);
					local330.method4558(Static30.anInt518);
					local330.method4590(Static157.aClass185_Sub1_1.anInt5572);
					Static42.method914(local330);
					local330.method4599(Static230.aString35);
					local330.method4561(Static399.anInt7070);
					@Pc(472) Class4_Sub20 local472 = Static157.aClass185_Sub1_1.method4642();
					local330.method4590(local472.anInt5526);
					local330.method4600(local472.aByteArray77, local472.anInt5526);
					Static316.aBoolean426 = true;
					@Pc(493) Class4_Sub20 local493 = new Class4_Sub20(Static130.method2411());
					(new Class4_Sub31()).method4508(local493);
					local330.method4600(local493.aByteArray77, local493.aByteArray77.length);
					local330.method4558(Static424.anInt7324);
					Static198.method3516();
					local330.method4600(local250.aByteArray77, local250.anInt5526);
					local330.method4585(local330.anInt5526 - local355);
				} else {
					local330.method4590(Static34.aClass81_6.anInt2486);
					local330.method4558(0);
					local355 = local330.anInt5526;
					local330.method4561(604);
					local330.method4590(Static332.aClass235_6.anInt6654);
					local330.method4590(Static168.anInt3290);
					Static42.method914(local330);
					local330.method4599(Static230.aString35);
					local330.method4561(Static399.anInt7070);
					Static198.method3516();
					local330.method4600(local250.aByteArray77, local250.anInt5526);
					local330.method4585(local330.anInt5526 - local355);
				}
				Static172.aClass13_1.method177(local330.anInt5526, local330.aByteArray77);
				local330.method3236(local253);
				for (local355 = 0; local355 < 4; local355++) {
					local253[local355] += 50;
				}
				Static196.aClass4_Sub20_Sub1_4.method3236(local253);
				Static427.anInt7334 = 5;
			}
			if (Static427.anInt7334 == 5) {
				if (!Static172.aClass13_1.method179(1)) {
					return;
				}
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
				local199 = Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF;
				if (local199 == 21) {
					Static427.anInt7334 = 8;
				} else if (local199 == 29) {
					Static427.anInt7334 = 14;
				} else if (local199 == 1) {
					Static427.anInt7334 = 6;
					Static455.method6191(local199);
					return;
				} else if (local199 == 2) {
					Static427.anInt7334 = 9;
				} else if (local199 == 15) {
					Static136.anInt2819 = -2;
					Static427.anInt7334 = 15;
				} else if (local199 == 23 && Static164.anInt3259 < 1) {
					Static164.anInt3259++;
					Static427.anInt7334 = 1;
					Static179.anInt3678 = 0;
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
					return;
				} else {
					Static427.anInt7334 = 0;
					Static455.method6191(local199);
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
					Static371.method5252();
					return;
				}
			}
			if (Static427.anInt7334 == 7) {
				Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
				Static457.aClass4_Sub20_Sub1_5.method3238(Static34.aClass81_12.anInt2486);
				Static172.aClass13_1.method177(Static457.aClass4_Sub20_Sub1_5.anInt5526, Static457.aClass4_Sub20_Sub1_5.aByteArray77);
				Static427.anInt7334 = 5;
			} else if (Static427.anInt7334 == 8) {
				if (Static172.aClass13_1.method179(1)) {
					Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
					local199 = Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF;
					Static388.anInt4888 = local199 * 60 + 180;
					Static427.anInt7334 = 0;
					Static455.method6191(21);
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
					Static371.method5252();
				}
			} else if (Static427.anInt7334 == 14) {
				if (Static172.aClass13_1.method179(1)) {
					Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
					Static427.anInt7334 = 0;
					Static353.anInt6235 = Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF;
					Static455.method6191(29);
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
					Static371.method5252();
				}
			} else if (Static427.anInt7334 != 9) {
				@Pc(811) Class4_Sub20_Sub1 local811;
				if (Static427.anInt7334 == 10) {
					local811 = Static196.aClass4_Sub20_Sub1_4;
					if (Static147.anInt3063 == 3) {
						Static135.aBoolean185 = true;
					} else {
						Static135.aBoolean185 = false;
					}
					if (Static147.anInt3063 == 2 || Static147.anInt3063 == 3) {
						if (!Static172.aClass13_1.method179(Static110.anInt2391)) {
							return;
						}
						Static172.aClass13_1.method180(local811.aByteArray77, 0, Static110.anInt2391);
						local811.anInt5526 = 0;
						Static70.anInt1720 = local811.method4614();
						Static56.anInt1346 = local811.method4614();
						Static238.aBoolean310 = local811.method4614() == 1;
						Static53.aBoolean301 = local811.method4614() == 1;
						Static462.aBoolean577 = local811.method4614() == 1;
						Static317.aBoolean427 = local811.method4614() == 1;
						Static147.anInt3062 = local811.method4560();
						Static445.aBoolean558 = local811.method4614() == 1;
						Static59.anInt1457 = local811.method4589();
						Static289.aBoolean384 = local811.method4614() == 1;
						if (Static147.anInt3063 == 3) {
							@Pc(1118) boolean local1118 = local811.method4614() == 1;
							if (local1118) {
								@Pc(1126) long local1126 = local811.method4603();
								@Pc(1130) String local1130 = Static30.method446(local1126);
								@Pc(1134) int local1134 = local811.method4614();
								@Pc(1137) byte[] local1137 = new byte[local1134];
								local811.method3244(local1134, local1137);
								@Pc(1147) String local1147 = Static454.method6184(local1137);
								@Pc(1149) Class137 local1149 = null;
								try {
									@Pc(1155) Class87 local1155 = Static390.aClass255_5.method5847("3", false);
									while (local1155.anInt2679 == 0) {
										Static77.method1653(1L);
									}
									if (local1155.anInt2679 == 1) {
										local1149 = (Class137) local1155.anObject3;
										@Pc(1187) int local1187 = local1130.length() + local1147.length() + 3 + 4 + 2;
										if (local1187 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1205) Class4_Sub20 local1205 = new Class4_Sub20(local1187 + 1);
										local1205.method4590(local1187);
										local1205.method4590(0);
										local1205.method4613(local1130);
										local1205.method4613(local1147);
										local1205.method4621();
										local1149.method3706(local1205.aByteArray77, local1205.anInt5526, 0);
									}
								} catch (@Pc(1237) Exception local1237) {
								}
								try {
									if (local1149 != null) {
										local1149.method3708();
									}
								} catch (@Pc(1246) Exception local1246) {
								}
							}
						}
						Static146.aClass228_1.method5199(Static289.aBoolean384);
						Static139.aClass193_1.method4647(Static289.aBoolean384);
						Static220.aClass247_1.method5657(Static289.aBoolean384);
					} else if (Static172.aClass13_1.method179(Static110.anInt2391)) {
						Static172.aClass13_1.method180(local811.aByteArray77, 0, Static110.anInt2391);
						local811.anInt5526 = 0;
						Static70.anInt1720 = local811.method4614();
						Static56.anInt1346 = local811.method4614();
						Static238.aBoolean310 = local811.method4614() == 1;
						Static53.aBoolean301 = local811.method4614() == 1;
						Static462.aBoolean577 = local811.method4614() == 1;
						Static350.anInt6203 = local811.method4560();
						Static445.aBoolean558 = Static350.anInt6203 > 0;
						Static351.anInt6220 = local811.method4560();
						Static467.anInt8016 = local811.method4560();
						Static417.anInt7267 = local811.method4560();
						Static451.anInt7729 = local811.method4595();
						Static177.aClass87_4 = Static390.aClass255_5.method5832(Static451.anInt7729);
						Static177.anInt3636 = local811.method4614();
						Static267.anInt5067 = local811.method4560();
						Static120.anInt2513 = local811.method4560();
						Static150.aBoolean208 = local811.method4614() == 1;
						Static52.aClass11_Sub5_Sub2_Sub1_2.aString31 = Static52.aClass11_Sub5_Sub2_Sub1_2.aString32 = local811.method4612();
						Static131.aClass9_3 = new Class9();
						Static131.aClass9_3.anInt84 = local811.method4560();
						if (Static131.aClass9_3.anInt84 == 65535) {
							Static131.aClass9_3.anInt84 = -1;
						}
						Static131.aClass9_3.aString1 = local811.method4612();
						if (Static297.aClass219_2 != Static42.aClass219_1) {
							Static131.aClass9_3.anInt80 = Static131.aClass9_3.anInt84 + 50000;
							Static131.aClass9_3.anInt79 = Static131.aClass9_3.anInt84 + 40000;
						}
						if (Static42.aClass219_1 != Static337.aClass219_4 && (Static302.aClass9_6.method73(Static80.aClass9_1) || Static302.aClass9_6.method73(Static108.aClass9_4))) {
							Static302.aClass9_6 = Static131.aClass9_3;
						}
					} else {
						return;
					}
					if (Static238.aBoolean310 && !Static462.aBoolean577 || Static445.aBoolean558) {
						try {
							Static476.method5363(Static390.aClass255_5.anApplet1, "zap");
						} catch (@Pc(1275) Throwable local1275) {
							if (Static396.aBoolean520) {
								try {
									Static390.aClass255_5.anApplet1.getAppletContext().showDocument(new URL(Static390.aClass255_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1291) Exception local1291) {
								}
							}
						}
					} else {
						try {
							Static476.method5363(Static390.aClass255_5.anApplet1, "unzap");
						} catch (@Pc(1301) Throwable local1301) {
						}
					}
					if (Static42.aClass219_1 == Static297.aClass219_2) {
						try {
							Static476.method5363(Static390.aClass255_5.anApplet1, "loggedin");
						} catch (@Pc(1313) Throwable local1313) {
						}
					}
					if (Static147.anInt3063 != 2 && Static147.anInt3063 != 3) {
						Static427.anInt7334 = 0;
						Static455.method6191(2);
						Static410.method5695();
						Static382.method3540(6);
						Static432.aClass214_220 = null;
						return;
					}
					Static427.anInt7334 = 12;
				}
				if (Static427.anInt7334 == 12) {
					if (!Static172.aClass13_1.method179(3)) {
						return;
					}
					Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 3);
					Static427.anInt7334 = 13;
				}
				if (Static427.anInt7334 == 13) {
					local811 = Static196.aClass4_Sub20_Sub1_4;
					local811.anInt5526 = 0;
					if (local811.method3234()) {
						if (!Static172.aClass13_1.method179(1)) {
							return;
						}
						Static172.aClass13_1.method180(local811.aByteArray77, 3, 1);
					}
					Static432.aClass214_220 = Static254.method4161()[local811.method3237()];
					Static136.anInt2819 = local811.method4560();
					Static427.anInt7334 = 11;
				}
				if (Static427.anInt7334 == 11) {
					if (Static172.aClass13_1.method179(Static136.anInt2819)) {
						Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, Static136.anInt2819);
						Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
						local199 = Static136.anInt2819;
						Static427.anInt7334 = 0;
						Static455.method6191(2);
						Static301.method4653();
						Static133.method2462(Static196.aClass4_Sub20_Sub1_4);
						Static245.anInt4783 = -1;
						Static171.method3013();
						if (local199 != Static196.aClass4_Sub20_Sub1_4.anInt5526) {
							throw new RuntimeException("lswp pos:" + Static196.aClass4_Sub20_Sub1_4.anInt5526 + " psize:" + local199);
						}
						Static432.aClass214_220 = null;
					}
				} else if (Static427.anInt7334 == 15) {
					if (Static136.anInt2819 == -2) {
						if (!Static172.aClass13_1.method179(2)) {
							return;
						}
						Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 2);
						Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
						Static136.anInt2819 = Static196.aClass4_Sub20_Sub1_4.method4560();
					}
					if (Static172.aClass13_1.method179(Static136.anInt2819)) {
						Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, Static136.anInt2819);
						Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
						local199 = Static136.anInt2819;
						Static427.anInt7334 = 0;
						Static455.method6191(15);
						Static165.method2907();
						Static133.method2462(Static196.aClass4_Sub20_Sub1_4);
						if (Static196.aClass4_Sub20_Sub1_4.anInt5526 != local199) {
							throw new RuntimeException("lswpr pos:" + Static196.aClass4_Sub20_Sub1_4.anInt5526 + " psize:" + local199);
						}
						Static432.aClass214_220 = null;
					}
				}
			} else if (Static172.aClass13_1.method179(1)) {
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
				Static427.anInt7334 = 10;
				Static110.anInt2391 = Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF;
			}
		} catch (@Pc(1558) IOException local1558) {
			if (Static172.aClass13_1 != null) {
				Static172.aClass13_1.method172();
				Static172.aClass13_1 = null;
			}
			if (Static164.anInt3259 >= 1) {
				Static427.anInt7334 = 0;
				Static455.method6191(-4);
				Static371.method5252();
			} else {
				Static179.anInt3678 = 0;
				Static427.anInt7334 = 1;
				if (Static147.anInt3063 == 2 || Static147.anInt3063 == 3) {
					Static302.aClass9_6.aBoolean2 = !Static302.aClass9_6.aBoolean2;
				} else {
					Static256.aClass9_5.aBoolean2 = !Static256.aClass9_5.aBoolean2;
				}
				Static164.anInt3259++;
			}
		}
	}
}
