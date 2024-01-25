import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!og", name = "R", descriptor = "I")
	public static int anInt6590;

	@OriginalMember(owner = "client!og", name = "S", descriptor = "I")
	public static int anInt6591;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "[Lclient!af;")
	public static final Class6[] aClass6Array2 = new Class6[30];

	@OriginalMember(owner = "client!og", name = "K", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_14 = new Class83(15, 0, 1, 0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([SI[Ljava/lang/String;II)V")
	public static void method5209(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg3) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) String local24 = arg2[local18];
		arg2[local18] = arg2[arg1];
		arg2[arg1] = local24;
		@Pc(38) short local38 = arg0[local18];
		arg0[local18] = arg0[arg1];
		arg0[arg1] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg1; local50++) {
			if (local24 == null || arg2[local50] != null && (local50 & 0x1) > arg2[local50].compareTo(local24)) {
				@Pc(75) String local75 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20] = local75;
				@Pc(89) short local89 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20++] = local89;
			}
		}
		arg2[arg1] = arg2[local20];
		arg2[local20] = local24;
		arg0[arg1] = arg0[local20];
		arg0[local20] = local38;
		method5209(arg0, local20 - 1, arg2, arg3);
		method5209(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(Z)V")
	public static void method5210() {
		if (Static64.anInt1229 == 0 || Static64.anInt1229 == 5) {
			return;
		}
		try {
			if (++Static398.anInt6357 > 2000) {
				if (Static211.aClass247_4 != null) {
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
				}
				if (Static88.anInt1767 >= 1) {
					Static64.anInt1229 = 0;
					Static221.method3102(-5);
					return;
				}
				Static88.anInt1767++;
				Static64.anInt1229 = 1;
				Static398.anInt6357 = 0;
				if (Static267.anInt4536 == 2 || Static267.anInt4536 == 3) {
					Static393.aClass124_5.aBoolean208 = !Static393.aClass124_5.aBoolean208;
				} else {
					Static257.aClass124_4.aBoolean208 = !Static257.aClass124_4.aBoolean208;
				}
			}
			if (Static64.anInt1229 == 1) {
				if (Static267.anInt4536 == 2 || Static267.anInt4536 == 3) {
					Static382.aClass236_4 = Static230.aClass61_4.method1463(Static393.aClass124_5.aString37, Static393.aClass124_5.method2807());
				} else {
					Static382.aClass236_4 = Static230.aClass61_4.method1463(Static257.aClass124_4.aString37, Static257.aClass124_4.method2807());
				}
				Static64.anInt1229 = 2;
			}
			@Pc(167) int local167;
			if (Static64.anInt1229 == 2) {
				if (Static382.aClass236_4.anInt6178 == 2) {
					throw new IOException();
				}
				if (Static382.aClass236_4.anInt6178 != 1) {
					return;
				}
				Static211.aClass247_4 = new Class247((Socket) Static382.aClass236_4.anObject8, Static230.aClass61_4);
				Static382.aClass236_4 = null;
				@Pc(135) long local135 = Static371.aLong189 = Static301.method4015(Static199.aString38);
				Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
				@Pc(145) int local145 = (int) (local135 >> 16 & 0x1FL);
				Static255.aClass7_Sub14_Sub1_2.method3970(Class22_Sub7.aClass188_1.anInt5048);
				Static255.aClass7_Sub14_Sub1_2.method3970(local145);
				Static211.aClass247_4.method5151(2, Static255.aClass7_Sub14_Sub1_2.aByteArray75);
				Static86.method1480();
				local167 = Static211.aClass247_4.method5155();
				Static86.method1480();
				if (local167 != 0) {
					Static64.anInt1229 = 0;
					Static221.method3102(local167);
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
					Static427.method5530();
					return;
				}
				Static64.anInt1229 = 3;
			}
			if (Static64.anInt1229 == 3) {
				if (Static211.aClass247_4.method5161() < 8) {
					return;
				}
				Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, 8);
				Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
				Static383.aLong194 = Static210.aClass7_Sub14_Sub1_4.method3941();
				@Pc(219) Class7_Sub14 local219 = new Class7_Sub14(70);
				@Pc(222) int[] local222 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static383.aLong194 >> 32), (int) Static383.aLong194 };
				local219.method3970(10);
				local219.method3933(local222[0]);
				local219.method3933(local222[1]);
				local219.method3933(local222[2]);
				local219.method3933(local222[3]);
				local219.method3934(Static301.method4015(Static199.aString38));
				local219.method3947(Static308.aString53);
				local219.method3936(Static257.aBigInteger2, Static51.aBigInteger1);
				@Pc(293) Class7_Sub14_Sub1 local293 = Static255.aClass7_Sub14_Sub1_2;
				local293.anInt4989 = 0;
				if (Static267.anInt4536 == 2 || Static267.anInt4536 == 3) {
					if (Static206.anInt3642 == 12) {
						local293.method3970(Class22_Sub7.aClass188_5.anInt5048);
					} else {
						local293.method3970(Class22_Sub7.aClass188_3.anInt5048);
					}
					local293.method3993(0);
					local167 = local293.anInt4989;
					local293.method3933(595);
					local293.method3970(Static233.anInt5382);
					local293.method3970(Static120.method1994());
					local293.method3993(Static251.anInt4258);
					local293.method3993(Static286.anInt4051);
					local293.method3970(Static130.aClass153_Sub1_1.anInt5244);
					Static123.method2017(local293);
					local293.method3947(Static240.aString48);
					local293.method3933(Static274.anInt4622);
					@Pc(421) Class7_Sub14 local421 = Static130.aClass153_Sub1_1.method4225();
					local293.method3970(local421.anInt4989);
					local293.method3952(local421.anInt4989, local421.aByteArray75);
					Static169.aBoolean182 = true;
					local293.method3993(Static385.anInt6209);
					Static293.method3876();
					local293.method3952(local219.anInt4989, local219.aByteArray75);
					local293.method3967(local293.anInt4989 - local167);
				} else {
					local293.method3970(Class22_Sub7.aClass188_6.anInt5048);
					local293.method3993(0);
					local167 = local293.anInt4989;
					local293.method3933(595);
					local293.method3970(Static191.aClass137_3.anInt3868);
					local293.method3970(Static5.anInt20);
					Static123.method2017(local293);
					local293.method3947(Static240.aString48);
					local293.method3933(Static274.anInt4622);
					Static293.method3876();
					local293.method3952(local219.anInt4989, local219.aByteArray75);
					local293.method3967(local293.anInt4989 - local167);
				}
				Static211.aClass247_4.method5151(local293.anInt4989, local293.aByteArray75);
				local293.method1360(local222);
				for (local167 = 0; local167 < 4; local167++) {
					local222[local167] += 50;
				}
				Static210.aClass7_Sub14_Sub1_4.method1360(local222);
				Static64.anInt1229 = 4;
			}
			@Pc(508) int local508;
			if (Static64.anInt1229 == 4) {
				if (Static211.aClass247_4.method5161() < 1) {
					return;
				}
				local508 = Static211.aClass247_4.method5155();
				if (local508 == 21) {
					Static64.anInt1229 = 7;
				} else if (local508 == 29) {
					Static64.anInt1229 = 13;
				} else if (local508 == 1) {
					Static64.anInt1229 = 5;
					Static221.method3102(local508);
					return;
				} else if (local508 == 2) {
					Static64.anInt1229 = 8;
				} else if (local508 == 15) {
					Static205.anInt3627 = -2;
					Static64.anInt1229 = 14;
				} else if (local508 == 23 && Static88.anInt1767 < 1) {
					Static398.anInt6357 = 0;
					Static88.anInt1767++;
					Static64.anInt1229 = 1;
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
					return;
				} else {
					Static64.anInt1229 = 0;
					Static221.method3102(local508);
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
					Static427.method5530();
					return;
				}
			}
			if (Static64.anInt1229 == 6) {
				Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
				Static255.aClass7_Sub14_Sub1_2.method1354(Class22_Sub7.aClass188_4.anInt5048);
				Static211.aClass247_4.method5151(Static255.aClass7_Sub14_Sub1_2.anInt4989, Static255.aClass7_Sub14_Sub1_2.aByteArray75);
				Static64.anInt1229 = 4;
			} else if (Static64.anInt1229 == 7) {
				if (Static211.aClass247_4.method5161() >= 1) {
					Static432.anInt7270 = Static211.aClass247_4.method5155() * 60 + 180;
					Static64.anInt1229 = 0;
					Static221.method3102(21);
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
					Static427.method5530();
				}
			} else if (Static64.anInt1229 == 13) {
				if (Static211.aClass247_4.method5161() >= 1) {
					Static164.anInt2971 = Static211.aClass247_4.method5155();
					Static64.anInt1229 = 0;
					Static221.method3102(29);
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
					Static427.method5530();
				}
			} else if (Static64.anInt1229 != 8) {
				@Pc(710) Class7_Sub14_Sub1 local710;
				if (Static64.anInt1229 == 9) {
					if (Static267.anInt4536 == 3) {
						Static204.aBoolean411 = true;
					} else {
						Static204.aBoolean411 = false;
					}
					local710 = Static210.aClass7_Sub14_Sub1_4;
					if (Static267.anInt4536 == 2 || Static267.anInt4536 == 3) {
						if (Static211.aClass247_4.method5161() < Static418.anInt6631) {
							return;
						}
						Static211.aClass247_4.method5157(local710.aByteArray75, 0, Static418.anInt6631);
						local710.anInt4989 = 0;
						Static157.anInt2920 = local710.method3981();
						Static380.anInt4486 = local710.method3981();
						Static148.aBoolean171 = local710.method3981() == 1;
						Static419.aBoolean437 = local710.method3981() == 1;
						Static384.aBoolean492 = local710.method3981() == 1;
						Static22.aBoolean309 = local710.method3981() == 1;
						Static296.anInt4920 = local710.method3943();
						Static263.aBoolean285 = local710.method3981() == 1;
						Static87.aBoolean98 = local710.method3981() == 1;
						if (Static267.anInt4536 == 3) {
							@Pc(826) boolean local826 = local710.method3981() == 1;
							if (local826) {
								@Pc(832) long local832 = local710.method3941();
								@Pc(836) String local836 = Static65.method1861(local832);
								@Pc(840) int local840 = local710.method3981();
								@Pc(843) byte[] local843 = new byte[local840];
								local710.method1357(local843, local840);
								@Pc(857) String local857 = Static436.method5607(local843);
								@Pc(859) Class266 local859 = null;
								try {
									@Pc(865) Class236 local865 = Static230.aClass61_4.method1456("3", false);
									while (local865.anInt6178 == 0) {
										Static214.method2089(1L);
									}
									if (local865.anInt6178 == 1) {
										local859 = (Class266) local865.anObject8;
										@Pc(899) int local899 = local836.length() + local857.length() + 3 + 2 + 4;
										if (local899 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(914) Class7_Sub14 local914 = new Class7_Sub14(local899 + 1);
										local914.method3970(local899);
										local914.method3970(0);
										local914.method3929(local836);
										local914.method3929(local857);
										local914.method3988();
										local859.method5678(0, local914.anInt4989, local914.aByteArray75);
									}
								} catch (@Pc(944) Exception local944) {
								}
								try {
									if (local859 != null) {
										local859.method5674();
									}
								} catch (@Pc(951) Exception local951) {
								}
							}
						}
						Static411.aClass142_4.method3154(Static87.aBoolean98);
						Static259.aClass206_2.method4315(Static87.aBoolean98);
						Static442.aClass98_1.method2235(Static87.aBoolean98);
					} else if (Static211.aClass247_4.method5161() >= Static418.anInt6631) {
						Static211.aClass247_4.method5157(local710.aByteArray75, 0, Static418.anInt6631);
						local710.anInt4989 = 0;
						Static157.anInt2920 = local710.method3981();
						Static380.anInt4486 = local710.method3981();
						Static148.aBoolean171 = local710.method3981() == 1;
						Static419.aBoolean437 = local710.method3981() == 1;
						Static384.aBoolean492 = local710.method3981() == 1;
						Static301.anInt5053 = local710.method3943();
						Static263.aBoolean285 = Static301.anInt5053 > 0;
						Static206.anInt3636 = local710.method3943();
						Static323.anInt5342 = local710.method3943();
						Static147.anInt2782 = local710.method3943();
						Static203.anInt3587 = local710.method3938();
						Static421.aClass236_7 = Static230.aClass61_4.method1469(Static203.anInt3587);
						Static383.anInt6160 = local710.method3981();
						Static338.anInt5484 = local710.method3943();
						Static451.anInt7440 = local710.method3943();
						Static118.aBoolean132 = local710.method3981() == 1;
						Static104.aClass26_Sub2_Sub4_Sub2_2.aString69 = Static104.aClass26_Sub2_Sub4_Sub2_2.aString70 = local710.method3987();
						Static214.aClass124_3 = new Class124();
						Static214.aClass124_3.anInt3453 = local710.method3943();
						if (Static214.aClass124_3.anInt3453 == 65535) {
							Static214.aClass124_3.anInt3453 = -1;
						}
						Static214.aClass124_3.aString37 = local710.method3987();
						if (Static50.aClass136_1 != Static313.aClass136_7 && Static393.aClass124_5 == Static393.aClass124_6) {
							Static393.aClass124_5 = Static214.aClass124_3;
						}
						if (Static313.aClass136_7 != Static167.aClass136_5) {
							Static214.aClass124_3.anInt3455 = Static214.aClass124_3.anInt3453 + 40000;
							Static214.aClass124_3.anInt3454 = Static214.aClass124_3.anInt3453 + 50000;
						}
					} else {
						return;
					}
					if (Static148.aBoolean171 && !Static384.aBoolean492 || Static263.aBoolean285) {
						try {
							Static468.method5098(Static230.aClass61_4.anApplet1, "zap");
						} catch (@Pc(1157) Throwable local1157) {
							if (Static138.aBoolean149) {
								try {
									Static230.aClass61_4.anApplet1.getAppletContext().showDocument(new URL(Static230.aClass61_4.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1173) Exception local1173) {
								}
							}
						}
					} else {
						try {
							Static468.method5098(Static230.aClass61_4.anApplet1, "unzap");
						} catch (@Pc(1147) Throwable local1147) {
						}
					}
					if (Static167.aClass136_5 == Static313.aClass136_7) {
						try {
							Static468.method5098(Static230.aClass61_4.anApplet1, "loggedin");
						} catch (@Pc(1185) Throwable local1185) {
						}
					}
					if (Static267.anInt4536 != 2 && Static267.anInt4536 != 3) {
						Static64.anInt1229 = 0;
						Static221.method3102(2);
						Static433.method5569();
						Static138.method2151(6);
						Static316.aClass253_117 = null;
						return;
					}
					Static64.anInt1229 = 11;
				}
				if (Static64.anInt1229 == 11) {
					if (Static211.aClass247_4.method5161() < 3) {
						return;
					}
					Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, 3);
					Static64.anInt1229 = 12;
				}
				if (Static64.anInt1229 == 12) {
					local710 = Static210.aClass7_Sub14_Sub1_4;
					local710.anInt4989 = 0;
					if (local710.method1355()) {
						if (Static211.aClass247_4.method5161() < 1) {
							return;
						}
						Static211.aClass247_4.method5157(local710.aByteArray75, 3, 1);
					}
					Static316.aClass253_117 = Static382.method4858()[local710.method1350()];
					Static205.anInt3627 = local710.method3943();
					Static64.anInt1229 = 10;
				}
				if (Static64.anInt1229 == 10) {
					if (Static211.aClass247_4.method5161() >= Static205.anInt3627) {
						Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, Static205.anInt3627);
						Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
						local508 = Static205.anInt3627;
						Static64.anInt1229 = 0;
						Static221.method3102(2);
						Static346.method4465();
						Static283.method3744(Static210.aClass7_Sub14_Sub1_4);
						Static213.anInt3813 = -1;
						Static354.method4563();
						if (Static210.aClass7_Sub14_Sub1_4.anInt4989 != local508) {
							throw new RuntimeException("lswp pos:" + Static210.aClass7_Sub14_Sub1_4.anInt4989 + " psize:" + local508);
						}
						Static316.aClass253_117 = null;
					}
				} else if (Static64.anInt1229 == 14) {
					if (Static205.anInt3627 == -2) {
						if (Static211.aClass247_4.method5161() < 2) {
							return;
						}
						Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, 2);
						Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
						Static205.anInt3627 = Static210.aClass7_Sub14_Sub1_4.method3943();
					}
					if (Static211.aClass247_4.method5161() >= Static205.anInt3627) {
						Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, Static205.anInt3627);
						Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
						local508 = Static205.anInt3627;
						Static64.anInt1229 = 0;
						Static221.method3102(15);
						Static439.method5619();
						Static283.method3744(Static210.aClass7_Sub14_Sub1_4);
						if (Static210.aClass7_Sub14_Sub1_4.anInt4989 != local508) {
							throw new RuntimeException("lswpr pos:" + Static210.aClass7_Sub14_Sub1_4.anInt4989 + " psize:" + local508);
						}
						Static316.aClass253_117 = null;
					}
				}
			} else if (Static211.aClass247_4.method5161() >= 1) {
				Static418.anInt6631 = Static211.aClass247_4.method5155();
				Static64.anInt1229 = 9;
			}
		} catch (@Pc(1431) IOException local1431) {
			if (Static211.aClass247_4 != null) {
				Static211.aClass247_4.method5162();
				Static211.aClass247_4 = null;
			}
			if (Static88.anInt1767 >= 1) {
				Static64.anInt1229 = 0;
				Static221.method3102(-4);
				Static427.method5530();
			} else {
				Static64.anInt1229 = 1;
				Static88.anInt1767++;
				Static398.anInt6357 = 0;
				if (Static267.anInt4536 == 2 || Static267.anInt4536 == 3) {
					Static393.aClass124_5.aBoolean208 = !Static393.aClass124_5.aBoolean208;
				} else {
					Static257.aClass124_4.aBoolean208 = !Static257.aClass124_4.aBoolean208;
				}
			}
		}
	}
}
