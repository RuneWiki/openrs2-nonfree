import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ok", name = "cb", descriptor = "B")
	public static byte aByte80;

	@OriginalMember(owner = "client!ok", name = "db", descriptor = "I")
	public static int anInt6649;

	@OriginalMember(owner = "client!ok", name = "Z", descriptor = "Lclient!h;")
	public static final Class125 aClass125_51 = new Class125(8);

	@OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
	public static int anInt6648 = -1;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)Z")
	public static boolean method5548(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[Ljava/lang/String;[S)V")
	public static void method5551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) short local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg1; local46++) {
			if (local20 == null || arg2[local46] != null && arg2[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(71) String local71 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local71;
				@Pc(85) short local85 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local85;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method5551(arg0, local16 - 1, arg2, arg3);
		method5551(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V")
	public static void method5552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class37 local28 = Static120.aClass37ArrayArrayArray1[local9][arg0][arg1] = Static120.aClass37ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte22--;
				for (@Pc(40) Class243 local40 = local28.aClass243_3; local40 != null; local40 = local40.aClass243_11) {
					@Pc(44) Class30_Sub1 local44 = local40.aClass30_Sub1_2;
					if (local44.aShort115 == arg0 && local44.aShort112 == arg1) {
						local44.aByte99--;
					}
				}
			}
		}
		if (Static120.aClass37ArrayArrayArray1[0][arg0][arg1] == null) {
			Static120.aClass37ArrayArrayArray1[0][arg0][arg1] = new Class37(0, arg0, arg1);
			Static120.aClass37ArrayArrayArray1[0][arg0][arg1].aByte23 = 1;
		}
		Static120.aClass37ArrayArrayArray1[0][arg0][arg1].aClass37_1 = local7;
		Static120.aClass37ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	public static void method5553() {
		if (Static145.anInt3193 == 0 || Static145.anInt3193 == 6) {
			return;
		}
		try {
			if (++Static433.anInt7998 > 2000) {
				if (Static491.aClass277_2 != null) {
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
				}
				if (Static466.anInt8511 >= 1) {
					Static145.anInt3193 = 0;
					Static269.method4556(-5);
					return;
				}
				Static433.anInt7998 = 0;
				if (Static445.anInt8114 == 2 || Static445.anInt8114 == 3) {
					Static222.aClass247_1.aBoolean535 = !Static222.aClass247_1.aBoolean535;
				} else {
					Static537.aClass247_5.aBoolean535 = !Static537.aClass247_5.aBoolean535;
				}
				Static466.anInt8511++;
				Static145.anInt3193 = 1;
			}
			if (Static145.anInt3193 == 1) {
				if (Static445.anInt8114 == 2 || Static445.anInt8114 == 3) {
					Static298.aClass55_7 = Static375.aClass71_3.method1991(Static222.aClass247_1.method6190(), Static222.aClass247_1.aString85);
				} else {
					Static298.aClass55_7 = Static375.aClass71_3.method1991(Static537.aClass247_5.method6190(), Static537.aClass247_5.aString85);
				}
				Static145.anInt3193 = 2;
			}
			if (Static145.anInt3193 == 2) {
				if (Static298.aClass55_7.anInt1481 == 2) {
					throw new IOException();
				}
				if (Static298.aClass55_7.anInt1481 != 1) {
					return;
				}
				Static491.aClass277_2 = Static80.method5220((Socket) Static298.aClass55_7.anObject5);
				Static298.aClass55_7 = null;
				@Pc(147) long local147 = Static293.aLong222 = Static178.method3535(Static172.aString92);
				@Pc(154) int local154 = (int) (local147 >> 16 & 0x1FL);
				Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
				Static383.aClass12_Sub8_Sub2_1.method5214(Static17.aClass137_1.anInt4298);
				Static383.aClass12_Sub8_Sub2_1.method5214(local154);
				Static491.aClass277_2.method7164(Static383.aClass12_Sub8_Sub2_1.aByteArray82, 2);
				Static145.anInt3193 = 3;
			}
			@Pc(201) int local201;
			if (Static145.anInt3193 == 3) {
				if (!Static491.aClass277_2.method7166(1)) {
					return;
				}
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
				local201 = Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF;
				if (local201 != 0) {
					Static145.anInt3193 = 0;
					Static269.method4556(local201);
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
					Static426.method5126();
					return;
				}
				Static145.anInt3193 = 4;
			}
			if (Static145.anInt3193 == 4) {
				if (!Static491.aClass277_2.method7166(8)) {
					return;
				}
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 8, 0);
				Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
				Static173.aLong106 = Static394.aClass12_Sub8_Sub2_2.method5191();
				@Pc(247) Class12_Sub8 local247 = new Class12_Sub8(518);
				@Pc(250) int[] local250 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static173.aLong106 >> 32), (int) Static173.aLong106 };
				local247.method5214(10);
				local247.method5223(local250[0]);
				local247.method5223(local250[1]);
				local247.method5223(local250[2]);
				local247.method5223(local250[3]);
				local247.method5208(Static178.method3535(Static172.aString92));
				local247.method5180(Static262.aString56);
				local247.method5208(Static148.aLong180);
				local247.method5208(Static215.aLong124);
				local247.method5170(Static427.aBigInteger4, Static188.aBigInteger1);
				@Pc(329) Class12_Sub8_Sub2 local329 = Static383.aClass12_Sub8_Sub2_1;
				local329.anInt6217 = 0;
				@Pc(352) int local352;
				if (Static445.anInt8114 == 2 || Static445.anInt8114 == 3) {
					if (Static96.anInt2243 == 12) {
						local329.method5214(Static17.aClass137_5.anInt4298);
					} else {
						local329.method5214(Static17.aClass137_3.anInt4298);
					}
					local329.method5190(0);
					local352 = local329.anInt6217;
					local329.method5223(606);
					local329.method5214(Static122.anInt2825);
					local329.method5214(Static256.method4386());
					local329.method5190(Static169.anInt3893);
					local329.method5190(Static127.anInt2936);
					local329.method5214(Static208.aClass12_Sub10_Sub1_1.anInt2226);
					Static247.method4271(local329);
					local329.method5180(Static366.aString103);
					local329.method5223(Static423.anInt79);
					@Pc(460) Class12_Sub8 local460 = new Class12_Sub8(Static165.method3356());
					Static208.aClass12_Sub10_Sub1_1.method2039(local460);
					local329.method5214(local460.anInt6217);
					local329.method5193(local460.aByteArray82, local460.anInt6217);
					Static14.aBoolean9 = true;
					@Pc(485) Class12_Sub8 local485 = new Class12_Sub8(Static259.method4396());
					(new Class12_Sub47(true, Static375.aClass71_3)).method6918(local485);
					local329.method5193(local485.aByteArray82, local485.aByteArray82.length);
					local329.method5190(Static105.anInt2402);
					Static441.method7838();
					local329.method5193(local247.aByteArray82, local247.anInt6217);
					local329.method5196(local329.anInt6217 - local352);
				} else {
					local329.method5214(Static17.aClass137_6.anInt4298);
					local329.method5190(0);
					local352 = local329.anInt6217;
					local329.method5223(606);
					local329.method5214(Static293.aClass138_7.anInt4315);
					local329.method5214(Static345.anInt6495);
					Static247.method4271(local329);
					local329.method5180(Static366.aString103);
					local329.method5223(Static423.anInt79);
					Static441.method7838();
					local329.method5193(local247.aByteArray82, local247.anInt6217);
					local329.method5196(local329.anInt6217 - local352);
				}
				Static491.aClass277_2.method7164(local329.aByteArray82, local329.anInt6217);
				local329.method5234(local250);
				for (local352 = 0; local352 < 4; local352++) {
					local250[local352] += 50;
				}
				Static394.aClass12_Sub8_Sub2_2.method5234(local250);
				Static145.anInt3193 = 5;
			}
			if (Static145.anInt3193 == 5) {
				if (!Static491.aClass277_2.method7166(1)) {
					return;
				}
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
				local201 = Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF;
				if (local201 == 21) {
					Static145.anInt3193 = 8;
				} else if (local201 == 29) {
					Static145.anInt3193 = 14;
				} else if (local201 == 1) {
					Static145.anInt3193 = 6;
					Static269.method4556(local201);
					return;
				} else if (local201 == 2) {
					Static145.anInt3193 = 9;
				} else if (local201 == 15) {
					Static145.anInt3193 = 15;
					Static331.anInt6307 = -2;
				} else if (local201 == 23 && Static466.anInt8511 < 1) {
					Static466.anInt8511++;
					Static145.anInt3193 = 1;
					Static433.anInt7998 = 0;
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
					return;
				} else {
					Static145.anInt3193 = 0;
					Static269.method4556(local201);
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
					Static426.method5126();
					return;
				}
			}
			if (Static145.anInt3193 == 7) {
				Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
				Static383.aClass12_Sub8_Sub2_1.method5237(Static17.aClass137_13.anInt4298);
				Static491.aClass277_2.method7164(Static383.aClass12_Sub8_Sub2_1.aByteArray82, Static383.aClass12_Sub8_Sub2_1.anInt6217);
				Static145.anInt3193 = 5;
			} else if (Static145.anInt3193 == 8) {
				if (Static491.aClass277_2.method7166(1)) {
					Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
					local201 = Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF;
					Static435.anInt8019 = (local201 + 3) * 60;
					Static145.anInt3193 = 0;
					Static269.method4556(21);
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
					Static426.method5126();
				}
			} else if (Static145.anInt3193 == 14) {
				if (Static491.aClass277_2.method7166(1)) {
					Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
					Static145.anInt3193 = 0;
					Static253.anInt5215 = Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF;
					Static269.method4556(29);
					Static491.aClass277_2.method7170();
					Static491.aClass277_2 = null;
					Static426.method5126();
				}
			} else if (Static145.anInt3193 != 9) {
				@Pc(807) Class12_Sub8_Sub2 local807;
				if (Static145.anInt3193 == 10) {
					if (Static445.anInt8114 == 3) {
						Static140.aBoolean252 = true;
					} else {
						Static140.aBoolean252 = false;
					}
					local807 = Static394.aClass12_Sub8_Sub2_2;
					if (Static445.anInt8114 == 2 || Static445.anInt8114 == 3) {
						if (!Static491.aClass277_2.method7166(Static407.anInt7671)) {
							return;
						}
						Static491.aClass277_2.method7168(local807.aByteArray82, Static407.anInt7671, 0);
						local807.anInt6217 = 0;
						Static59.anInt1442 = local807.method5216();
						Static24.anInt390 = local807.method5216();
						Static451.aBoolean358 = local807.method5216() == 1;
						Static163.aBoolean313 = local807.method5216() == 1;
						Static537.aBoolean677 = local807.method5216() == 1;
						Static541.aBoolean683 = local807.method5216() == 1;
						Static396.anInt7452 = local807.method5199();
						Static366.aBoolean638 = local807.method5216() == 1;
						Static290.anInt5634 = local807.method5166();
						Static105.aBoolean204 = local807.method5216() == 1;
						if (Static445.anInt8114 == 3) {
							@Pc(1093) boolean local1093 = local807.method5216() == 1;
							if (local1093) {
								@Pc(1099) long local1099 = local807.method5191();
								@Pc(1103) String local1103 = Static104.method2138(local1099);
								@Pc(1107) int local1107 = local807.method5216();
								@Pc(1110) byte[] local1110 = new byte[local1107];
								local807.method5239(local1110, local1107);
								@Pc(1120) String local1120 = Static159.method3200(local1110);
								@Pc(1122) Class308 local1122 = null;
								try {
									@Pc(1128) Class55 local1128 = Static375.aClass71_3.method1980("3", false);
									while (local1128.anInt1481 == 0) {
										Static17.method388(1L);
									}
									if (local1128.anInt1481 == 1) {
										local1122 = (Class308) local1128.anObject5;
										@Pc(1165) int local1165 = local1103.length() + local1120.length() + 3 + 4 + 2 + 2;
										if (local1165 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1183) Class12_Sub8 local1183 = new Class12_Sub8(local1165 + 1);
										local1183.method5214(local1165);
										local1183.method5214(1);
										local1183.method5171(local1103);
										local1183.method5171(local1120);
										local1183.method5190(Static423.anInt79);
										local1183.method5200();
										local1122.method7736(local1183.anInt6217, local1183.aByteArray82, 0);
									}
								} catch (@Pc(1217) Exception local1217) {
								}
								try {
									if (local1122 != null) {
										local1122.method7739();
									}
								} catch (@Pc(1224) Exception local1224) {
								}
								try {
									Static549.method683(Static375.aClass71_3.anApplet1, "demoaccountcreated");
								} catch (@Pc(1232) Throwable local1232) {
								}
							}
						}
						Static49.aClass155_2.method4071(Static105.aBoolean204);
						Static150.aClass254_2.method6337(Static105.aBoolean204);
						Static161.aClass110_3.method3019(Static105.aBoolean204);
					} else if (Static491.aClass277_2.method7166(Static407.anInt7671)) {
						Static491.aClass277_2.method7168(local807.aByteArray82, Static407.anInt7671, 0);
						local807.anInt6217 = 0;
						Static59.anInt1442 = local807.method5216();
						Static24.anInt390 = local807.method5216();
						Static451.aBoolean358 = local807.method5216() == 1;
						Static163.aBoolean313 = local807.method5216() == 1;
						Static537.aBoolean677 = local807.method5216() == 1;
						Static465.anInt8477 = local807.method5199();
						Static366.aBoolean638 = Static465.anInt8477 > 0;
						Static361.anInt6737 = local807.method5199();
						Static275.anInt5454 = local807.method5199();
						Static485.anInt8828 = local807.method5199();
						Static72.anInt1749 = local807.method5225();
						Static458.aClass55_8 = Static375.aClass71_3.method1989(Static72.anInt1749);
						Static17.anInt306 = local807.method5216();
						Static72.anInt1747 = local807.method5199();
						Static13.anInt227 = local807.method5199();
						Static315.aBoolean468 = local807.method5216() == 1;
						Static440.aClass30_Sub1_Sub1_Sub1_2.aString6 = Static440.aClass30_Sub1_Sub1_Sub1_2.aString7 = local807.method5169();
						Static326.aClass247_3 = new Class247();
						Static326.aClass247_3.anInt7426 = local807.method5199();
						if (Static326.aClass247_3.anInt7426 == 65535) {
							Static326.aClass247_3.anInt7426 = -1;
						}
						Static326.aClass247_3.aString85 = local807.method5169();
						if (Static79.aClass285_2 != Static171.aClass285_4) {
							Static326.aClass247_3.anInt7429 = Static326.aClass247_3.anInt7426 + 50000;
							Static326.aClass247_3.anInt7427 = Static326.aClass247_3.anInt7426 + 40000;
						}
						if (Static143.aClass285_3 != Static79.aClass285_2 && (Static222.aClass247_1.method6193(Static281.aClass247_2) || Static222.aClass247_1.method6193(Static488.aClass247_4))) {
							Static343.method2524();
						}
					} else {
						return;
					}
					if (Static451.aBoolean358 && !Static537.aBoolean677 || Static366.aBoolean638) {
						try {
							Static549.method683(Static375.aClass71_3.anApplet1, "zap");
						} catch (@Pc(1269) Throwable local1269) {
							if (Static433.aBoolean551) {
								try {
									Static375.aClass71_3.anApplet1.getAppletContext().showDocument(new URL(Static375.aClass71_3.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1285) Exception local1285) {
								}
							}
						}
					} else {
						try {
							Static549.method683(Static375.aClass71_3.anApplet1, "unzap");
						} catch (@Pc(1259) Throwable local1259) {
						}
					}
					if (Static171.aClass285_4 == Static79.aClass285_2) {
						try {
							Static549.method683(Static375.aClass71_3.anApplet1, "loggedin");
						} catch (@Pc(1297) Throwable local1297) {
						}
					}
					if (Static445.anInt8114 != 2 && Static445.anInt8114 != 3) {
						Static145.anInt3193 = 0;
						Static269.method4556(2);
						Static306.method4979();
						Static9.method278(6);
						Static10.aClass45_4 = null;
						return;
					}
					Static145.anInt3193 = 12;
				}
				if (Static145.anInt3193 == 12) {
					if (!Static491.aClass277_2.method7166(3)) {
						return;
					}
					Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 3, 0);
					Static145.anInt3193 = 13;
				}
				if (Static145.anInt3193 == 13) {
					local807 = Static394.aClass12_Sub8_Sub2_2;
					local807.anInt6217 = 0;
					if (local807.method5235()) {
						if (!Static491.aClass277_2.method7166(1)) {
							return;
						}
						Static491.aClass277_2.method7168(local807.aByteArray82, 1, 3);
					}
					Static10.aClass45_4 = Static254.method4369()[local807.method5233()];
					Static331.anInt6307 = local807.method5199();
					Static145.anInt3193 = 11;
				}
				if (Static145.anInt3193 == 11) {
					if (Static491.aClass277_2.method7166(Static331.anInt6307)) {
						Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, Static331.anInt6307, 0);
						Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
						local201 = Static331.anInt6307;
						Static145.anInt3193 = 0;
						Static269.method4556(2);
						Static391.method5788();
						Static535.method7887(Static394.aClass12_Sub8_Sub2_2);
						Static248.anInt5103 = -1;
						Static362.method5650();
						if (Static394.aClass12_Sub8_Sub2_2.anInt6217 != local201) {
							throw new RuntimeException("lswp pos:" + Static394.aClass12_Sub8_Sub2_2.anInt6217 + " psize:" + local201);
						}
						Static10.aClass45_4 = null;
					}
				} else if (Static145.anInt3193 == 15) {
					if (Static331.anInt6307 == -2) {
						if (!Static491.aClass277_2.method7166(2)) {
							return;
						}
						Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 2, 0);
						Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
						Static331.anInt6307 = Static394.aClass12_Sub8_Sub2_2.method5199();
					}
					if (Static491.aClass277_2.method7166(Static331.anInt6307)) {
						Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, Static331.anInt6307, 0);
						Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
						Static145.anInt3193 = 0;
						local201 = Static331.anInt6307;
						Static269.method4556(15);
						Static247.method4270();
						Static535.method7887(Static394.aClass12_Sub8_Sub2_2);
						if (local201 != Static394.aClass12_Sub8_Sub2_2.anInt6217) {
							throw new RuntimeException("lswpr pos:" + Static394.aClass12_Sub8_Sub2_2.anInt6217 + " psize:" + local201);
						}
						Static10.aClass45_4 = null;
					}
				}
			} else if (Static491.aClass277_2.method7166(1)) {
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
				Static407.anInt7671 = Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF;
				Static145.anInt3193 = 10;
			}
		} catch (@Pc(1537) IOException local1537) {
			if (Static491.aClass277_2 != null) {
				Static491.aClass277_2.method7170();
				Static491.aClass277_2 = null;
			}
			if (Static466.anInt8511 >= 1) {
				Static145.anInt3193 = 0;
				Static269.method4556(-4);
				Static426.method5126();
			} else {
				Static145.anInt3193 = 1;
				if (Static445.anInt8114 == 2 || Static445.anInt8114 == 3) {
					Static222.aClass247_1.aBoolean535 = !Static222.aClass247_1.aBoolean535;
				} else {
					Static537.aClass247_5.aBoolean535 = !Static537.aClass247_5.aBoolean535;
				}
				Static433.anInt7998 = 0;
				Static466.anInt8511++;
			}
		}
	}
}
