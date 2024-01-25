import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_60 = new Class96("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "[I")
	public static int[] anIntArray299 = new int[2];

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
	public static int anInt3819 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIBI[B)V")
	public static void method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg1 > 0 && !Static362.method5163(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static362.method5163(arg2)) {
			@Pc(31) int local31 = Static415.method5634(arg0);
			@Pc(33) int local33 = 0;
			@Pc(52) int local52 = arg2 > arg1 ? arg1 : arg2;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) byte[] local62 = arg5;
			@Pc(69) byte[] local69 = new byte[local31 * local56 * local60];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local33, arg3, arg1, arg2, 0, arg0, 5121, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(90) int local90 = local31 * arg1;
				@Pc(92) byte[] local92 = local69;
				for (@Pc(94) int local94 = 0; local94 < local31; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local90 + local94;
					for (@Pc(106) int local106 = 0; local106 < local60; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local56; local110++) {
							@Pc(116) byte local116 = local62[local100];
							local100 += local31;
							@Pc(126) int local126 = local116 + local62[local100];
							@Pc(132) int local132 = local126 + local62[local104];
							local100 += local31;
							local104 += local31;
							@Pc(146) int local146 = local132 + local62[local104];
							local104 += local31;
							local69[local98] = (byte) (local146 >> 2);
							local98 += local31;
						}
						local100 += local90;
						local104 += local90;
					}
				}
				local69 = local62;
				arg1 = local56;
				arg2 = local60;
				local62 = local92;
				local60 >>= 0x1;
				local52 >>= 0x1;
				local56 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3201(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static224.method3272(Static257.aClass254_89);
			Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(arg0));
			Static201.aClass1_Sub14_Sub2_2.method4512(arg0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBZ)V")
	public static void method3203(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static447.aClass121_11 = Static319.method4644(Static159.aCanvas3, arg0, Static327.aClass230_Sub1_1.anInt7312 * 2, Static403.aClass42_6, Static80.anInterface5_18);
		} else {
			if (arg1) {
				Static447.aClass121_11 = Static319.method4644(Static159.aCanvas3, 0, 0, Static403.aClass42_6, Static80.anInterface5_18);
				Static447.aClass121_11.M(0);
				@Pc(37) Class62 local37 = Static224.method3273(Static381.aClass109_12, Static162.anInt2876);
				@Pc(46) Class4 local46 = Static447.aClass121_11.method4612(local37, Static457.method1166(Static353.aClass109_79, Static162.anInt2876));
				Static210.method3170(true, Static293.aClass96_81.method1935(Static389.anInt7061), local46);
				Static447.aClass121_11.method4602();
				Static299.method4092();
				Static447.aClass121_11.method4598();
			}
			try {
				Static447.aClass121_11 = Static319.method4644(Static159.aCanvas3, arg0, Static327.aClass230_Sub1_1.anInt7312 * 2, Static403.aClass42_6, Static80.anInterface5_18);
				if (Static447.aClass121_11.method4576()) {
					@Pc(79) Class1_Sub27 local79 = Static447.aClass121_11.method4615();
					Static447.aClass121_11.method4618(local79);
				}
			} catch (@Pc(84) Throwable local84) {
				arg0 = 0;
				Static447.aClass121_11 = Static319.method4644(Static159.aCanvas3, 0, 0, Static403.aClass42_6, Static80.anInterface5_18);
			}
		}
		Static146.anInt2664 = arg0;
		Static442.method5919();
		if (!Static447.aClass121_11.method4640()) {
			Static144.anInt2601 = 1;
		}
		Static447.aClass121_11.method4577(Static144.anInt2601);
		Static447.aClass121_11.method4609(0);
		Static447.aClass121_11.na(8);
		Static198.aClass43_2 = Static447.aClass121_11.method4592();
		Static407.aClass43_4 = Static447.aClass121_11.method4592();
		Static319.method4629();
		Static447.aClass121_11.method4571(!Static327.aClass230_Sub1_1.aBoolean604);
		if (Static447.aClass121_11.method4622()) {
			Static124.method1938(Static327.aClass230_Sub1_1.aBoolean612);
		}
		Static283.method3905(Static104.anInt2048 >> 3, Static80.anInt6558 >> 3, Static447.aClass121_11);
		Static92.method1453();
		Static291.aBoolean656 = false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
	public static void method3205() {
		if (Static403.anInt7143 == 0 || Static403.anInt7143 == 5) {
			return;
		}
		try {
			if (++Static264.anInt4482 > 2000) {
				if (Static169.aClass114_4 != null) {
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
				}
				if (Static97.anInt1904 >= 1) {
					Static195.anInt3545 = -5;
					Static403.anInt7143 = 0;
					return;
				}
				Static97.anInt1904++;
				Static264.anInt4482 = 0;
				Static403.anInt7143 = 1;
				if (Static29.anInt481 == Static168.anInt3019) {
					Static29.anInt481 = Static11.anInt231;
				} else {
					Static29.anInt481 = Static168.anInt3019;
				}
			}
			if (Static403.anInt7143 == 1) {
				Static439.aClass159_9 = Static403.aClass42_6.method656(Static63.aString24, Static29.anInt481);
				Static403.anInt7143 = 2;
			}
			@Pc(111) int local111;
			if (Static403.anInt7143 == 2) {
				if (Static439.aClass159_9.anInt4271 == 2) {
					throw new IOException();
				}
				if (Static439.aClass159_9.anInt4271 != 1) {
					return;
				}
				Static169.aClass114_4 = new Class114((Socket) Static439.aClass159_9.anObject8, Static403.aClass42_6);
				Static439.aClass159_9 = null;
				@Pc(104) long local104 = Static279.aLong227 = Static112.method1763(Static392.aString83);
				local111 = (int) (local104 >> 16 & 0x1FL);
				Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
				Static201.aClass1_Sub14_Sub2_2.method4553(Static121.aClass44_1.anInt793);
				Static201.aClass1_Sub14_Sub2_2.method4553(local111);
				Static169.aClass114_4.method2497(2, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
				Static206.method3160();
				@Pc(136) int local136 = Static169.aClass114_4.method2499();
				Static206.method3160();
				if (local136 != 0) {
					Static403.anInt7143 = 0;
					Static195.anInt3545 = local136;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
					return;
				}
				Static403.anInt7143 = 3;
			}
			if (Static403.anInt7143 == 3) {
				if (Static169.aClass114_4.method2495() < 8) {
					return;
				}
				Static169.aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 8);
				Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
				Static376.aLong202 = Static116.aClass1_Sub14_Sub2_1.method4547();
				@Pc(180) Class1_Sub14 local180 = new Class1_Sub14(70);
				@Pc(183) int[] local183 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static376.aLong202 >> 32), (int) Static376.aLong202 };
				local180.method4553(10);
				local180.method4522(local183[0]);
				local180.method4522(local183[1]);
				local180.method4522(local183[2]);
				local180.method4522(local183[3]);
				local180.method4502(Static112.method1763(Static392.aString83));
				local180.method4512(Static241.aString60);
				local180.method4543(Static233.aBigInteger1, Static321.aBigInteger2);
				Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
				if (Static40.anInt629 == 40) {
					Static201.aClass1_Sub14_Sub2_2.method4553(Static121.aClass44_5.anInt793);
				} else {
					Static201.aClass1_Sub14_Sub2_2.method4553(Static121.aClass44_3.anInt793);
				}
				Static201.aClass1_Sub14_Sub2_2.method4504(0);
				local111 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
				Static201.aClass1_Sub14_Sub2_2.method4522(588);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static214.anInt6459);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static174.method2768());
				Static201.aClass1_Sub14_Sub2_2.method4504(Static403.anInt7142);
				Static201.aClass1_Sub14_Sub2_2.method4504(Static324.anInt5725);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static327.aClass230_Sub1_1.anInt7312);
				Static172.method2738(Static201.aClass1_Sub14_Sub2_2);
				Static201.aClass1_Sub14_Sub2_2.method4512(Static87.aString67);
				Static201.aClass1_Sub14_Sub2_2.method4522(Static311.anInt6534);
				@Pc(318) Class1_Sub14 local318 = Static327.aClass230_Sub1_1.method5648();
				Static201.aClass1_Sub14_Sub2_2.method4553(local318.anInt5695);
				Static201.aClass1_Sub14_Sub2_2.method4506(local318.aByteArray65, local318.anInt5695);
				Static291.aBoolean656 = true;
				Static201.aClass1_Sub14_Sub2_2.method4504(Static100.anInt1967);
				Static201.aClass1_Sub14_Sub2_2.method4522(Static188.aClass109_52.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static368.aClass109_83.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static225.aClass109_57.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static19.aClass109_4.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static453.aClass109_44.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static162.aClass109_37.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static297.aClass109_69.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static172.aClass109_40.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static353.aClass109_79.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static279.aClass109_97.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static21.aClass109_7.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static21.aClass109_8.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static29.aClass109_14.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static381.aClass109_12.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static360.aClass109_80.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static263.aClass109_61.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static134.aClass109_35.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static221.aClass109_98.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static131.aClass109_31.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static388.aClass109_94.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static200.aClass109_53.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static173.aClass109_42.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static278.aClass109_95.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static44.aClass109_20.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static184.aClass109_48.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static222.aClass109_56.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static454.aClass109_100.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static116.aClass109_29.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static140.aClass109_36.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4522(Static369.aClass109_84.method2325());
				Static201.aClass1_Sub14_Sub2_2.method4506(local180.aByteArray65, local180.anInt5695);
				Static201.aClass1_Sub14_Sub2_2.method4537(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local111);
				Static169.aClass114_4.method2497(Static201.aClass1_Sub14_Sub2_2.anInt5695, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
				Static201.aClass1_Sub14_Sub2_2.method4568(local183);
				for (@Pc(547) int local547 = 0; local547 < 4; local547++) {
					local183[local547] += 50;
				}
				Static116.aClass1_Sub14_Sub2_1.method4568(local183);
				Static403.anInt7143 = 4;
			}
			@Pc(581) int local581;
			if (Static403.anInt7143 == 4) {
				if (Static169.aClass114_4.method2495() < 1) {
					return;
				}
				local581 = Static169.aClass114_4.method2499();
				if (local581 == 21) {
					Static403.anInt7143 = 7;
				} else if (local581 == 29) {
					Static403.anInt7143 = 11;
				} else if (local581 == 1) {
					Static195.anInt3545 = local581;
					Static403.anInt7143 = 5;
					return;
				} else if (local581 == 2) {
					Static403.anInt7143 = 8;
				} else if (local581 == 15) {
					Static403.anInt7143 = 12;
					Static282.anInt4732 = -2;
				} else if (local581 == 23 && Static97.anInt1904 < 1) {
					Static264.anInt4482 = 0;
					Static403.anInt7143 = 1;
					Static97.anInt1904++;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
					return;
				} else {
					Static403.anInt7143 = 0;
					Static195.anInt3545 = local581;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
					return;
				}
			}
			if (Static403.anInt7143 == 6) {
				Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
				Static201.aClass1_Sub14_Sub2_2.method4562(Static121.aClass44_4.anInt793);
				Static169.aClass114_4.method2497(Static201.aClass1_Sub14_Sub2_2.anInt5695, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
				Static403.anInt7143 = 4;
			} else if (Static403.anInt7143 == 7) {
				if (Static169.aClass114_4.method2495() >= 1) {
					Static97.anInt1903 = Static169.aClass114_4.method2499() * 60 + 180;
					Static195.anInt3545 = 21;
					Static403.anInt7143 = 0;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
				}
			} else if (Static403.anInt7143 != 11) {
				if (Static403.anInt7143 == 8) {
					if (Static169.aClass114_4.method2495() < 13) {
						return;
					}
					Static169.aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 13);
					Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
					Static64.anInt1161 = Static116.aClass1_Sub14_Sub2_1.method4548();
					Static343.anInt6242 = Static116.aClass1_Sub14_Sub2_1.method4548();
					Static406.aBoolean595 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
					Static151.aBoolean219 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
					Static59.aBoolean92 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
					Static195.aBoolean276 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
					Static179.anInt3373 = Static116.aClass1_Sub14_Sub2_1.method4498();
					Static97.aBoolean142 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
					Static175.aBoolean433 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
					Static251.aClass207_2.method4986(Static175.aBoolean433);
					Static388.aClass193_3.method4251(Static175.aBoolean433);
					Static268.aClass26_1.method437(Static175.aBoolean433);
					if (Static406.aBoolean595 && !Static59.aBoolean92 || Static97.aBoolean142) {
						try {
							Static455.method622("zap", Static403.aClass42_6.anApplet1);
						} catch (@Pc(868) Throwable local868) {
							if (Static388.aBoolean610) {
								try {
									Static403.aClass42_6.anApplet1.getAppletContext().showDocument(new URL(Static403.aClass42_6.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(884) Exception local884) {
								}
							}
						}
					} else {
						try {
							Static455.method622("unzap", Static403.aClass42_6.anApplet1);
						} catch (@Pc(858) Throwable local858) {
						}
					}
					if (Static191.aClass174_5 == Static153.aClass174_7) {
						try {
							Static455.method622("loggedin", Static403.aClass42_6.anApplet1);
						} catch (@Pc(896) Throwable local896) {
						}
					}
					Static403.anInt7143 = 10;
				}
				if (Static403.anInt7143 == 10) {
					if (Static116.aClass1_Sub14_Sub2_1.method4560()) {
						if (Static169.aClass114_4.method2495() < 1) {
							return;
						}
						Static169.aClass114_4.method2493(Static116.aClass1_Sub14_Sub2_1.anInt5695 + 2, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 1);
					}
					Static397.aClass12_345 = Static378.method5322()[Static116.aClass1_Sub14_Sub2_1.method4556()];
					Static282.anInt4732 = Static116.aClass1_Sub14_Sub2_1.method4498();
					Static403.anInt7143 = 9;
				}
				if (Static403.anInt7143 == 9) {
					if (Static169.aClass114_4.method2495() >= Static282.anInt4732) {
						Static169.aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, Static282.anInt4732);
						Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
						Static195.anInt3545 = 2;
						Static403.anInt7143 = 0;
						local581 = Static282.anInt4732;
						Static102.method1638();
						Static100.method1618(Static116.aClass1_Sub14_Sub2_1);
						Static254.anInt4366 = -1;
						Static400.method5477();
						if (local581 != Static116.aClass1_Sub14_Sub2_1.anInt5695) {
							throw new RuntimeException("lswp pos:" + Static116.aClass1_Sub14_Sub2_1.anInt5695 + " psize:" + local581);
						}
						Static397.aClass12_345 = null;
					}
				} else if (Static403.anInt7143 == 12) {
					if (Static282.anInt4732 == -2) {
						if (Static169.aClass114_4.method2495() < 2) {
							return;
						}
						Static169.aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 2);
						Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
						Static282.anInt4732 = Static116.aClass1_Sub14_Sub2_1.method4498();
					}
					if (Static169.aClass114_4.method2495() >= Static282.anInt4732) {
						Static169.aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, Static282.anInt4732);
						Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
						Static403.anInt7143 = 0;
						local581 = Static282.anInt4732;
						Static195.anInt3545 = 15;
						Static81.method1176();
						Static100.method1618(Static116.aClass1_Sub14_Sub2_1);
						if (local581 != Static116.aClass1_Sub14_Sub2_1.anInt5695) {
							throw new RuntimeException("lswpr pos:" + Static116.aClass1_Sub14_Sub2_1.anInt5695 + " psize:" + local581);
						}
						Static397.aClass12_345 = null;
					}
				}
			} else if (Static169.aClass114_4.method2495() >= 1) {
				Static379.anInt6822 = Static169.aClass114_4.method2499();
				Static195.anInt3545 = 29;
				Static403.anInt7143 = 0;
				Static169.aClass114_4.method2496();
				Static169.aClass114_4 = null;
			}
		} catch (@Pc(1077) IOException local1077) {
			if (Static169.aClass114_4 != null) {
				Static169.aClass114_4.method2496();
				Static169.aClass114_4 = null;
			}
			if (Static97.anInt1904 >= 1) {
				Static195.anInt3545 = -4;
				Static403.anInt7143 = 0;
			} else {
				if (Static29.anInt481 == Static168.anInt3019) {
					Static29.anInt481 = Static11.anInt231;
				} else {
					Static29.anInt481 = Static168.anInt3019;
				}
				Static264.anInt4482 = 0;
				Static97.anInt1904++;
				Static403.anInt7143 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!ir;)V")
	public static void method3213(@OriginalArg(1) Class47_Sub1_Sub5 arg0) {
		arg0.aBoolean434 = false;
		@Pc(18) Class58 local18;
		if (arg0.anInt5393 != -1) {
			local18 = Static322.aClass45_5.method690(arg0.anInt5393);
			if (local18 == null || local18.anIntArray65 == null) {
				arg0.aBoolean432 = false;
				arg0.anInt5393 = -1;
			} else {
				label394: {
					arg0.anInt5388++;
					if (local18.anIntArray65.length > arg0.anInt5407 && arg0.anInt5388 > local18.anIntArray66[arg0.anInt5407]) {
						arg0.anInt5388 = 1;
						arg0.anInt5391++;
						arg0.anInt5407++;
						Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5407, local18, arg0 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg0.anInt7060);
					}
					if (local18.anIntArray65.length <= arg0.anInt5407) {
						arg0.anInt5388 = 0;
						arg0.anInt5407 = 0;
						if (arg0.aBoolean432) {
							arg0.anInt5393 = arg0.method4327().method5402();
							if (arg0.anInt5393 == -1) {
								arg0.aBoolean432 = false;
								break label394;
							}
							local18 = Static322.aClass45_5.method690(arg0.anInt5393);
						}
						Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5407, local18, Static255.aClass47_Sub1_Sub5_Sub2_2 == arg0, arg0.anInt7060);
					}
					arg0.anInt5391 = arg0.anInt5407 + 1;
					if (local18.anIntArray65.length <= arg0.anInt5391) {
						arg0.anInt5391 = 0;
					}
				}
			}
		}
		@Pc(178) int local178;
		@Pc(186) Class58 local186;
		@Pc(175) Class166 local175;
		if (arg0.anInt5381 != -1 && arg0.anInt5412 <= Static123.anInt2333) {
			local175 = Static294.aClass125_2.method2961(arg0.anInt5381);
			local178 = local175.anInt4334;
			if (local178 == -1) {
				arg0.anInt5381 = -1;
			} else {
				label396: {
					local186 = Static322.aClass45_5.method690(local178);
					if (local175.aBoolean344) {
						if (local186.anInt1437 == 3) {
							if (arg0.anInt5420 > 0 && arg0.anInt5344 <= Static123.anInt2333 && Static123.anInt2333 > arg0.anInt5380) {
								arg0.anInt5381 = -1;
								break label396;
							}
						} else if (local186.anInt1437 == 1 && arg0.anInt5420 > 0 && arg0.anInt5344 <= Static123.anInt2333 && Static123.anInt2333 > arg0.anInt5380) {
							arg0.anInt5412 = Static123.anInt2333 + 1;
							break label396;
						}
					}
					if (local186 == null || local186.anIntArray65 == null) {
						arg0.anInt5381 = -1;
					} else {
						if (arg0.anInt5382 < 0) {
							arg0.anInt5382 = 0;
							Static385.method5367(arg0.aByte97, arg0.anInt7066, 0, local186, arg0 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg0.anInt7060);
						}
						arg0.anInt5374++;
						if (arg0.anInt5382 < local186.anIntArray65.length && arg0.anInt5374 > local186.anIntArray66[arg0.anInt5382]) {
							arg0.anInt5374 = 1;
							arg0.anInt5382++;
							Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5382, local186, Static255.aClass47_Sub1_Sub5_Sub2_2 == arg0, arg0.anInt7060);
						}
						if (arg0.anInt5382 >= local186.anIntArray65.length) {
							if (local175.aBoolean344) {
								arg0.anInt5359++;
								arg0.anInt5382 -= local186.anInt1434;
								if (local186.anInt1429 <= arg0.anInt5359) {
									arg0.anInt5381 = -1;
								} else if (arg0.anInt5382 >= 0 && arg0.anInt5382 < local186.anIntArray65.length) {
									Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5382, local186, arg0 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg0.anInt7060);
								} else {
									arg0.anInt5381 = -1;
								}
							} else {
								arg0.anInt5381 = -1;
							}
						}
						arg0.anInt5345 = arg0.anInt5382 + 1;
						if (local186.anIntArray65.length <= arg0.anInt5345) {
							if (local175.aBoolean344) {
								arg0.anInt5345 -= local186.anInt1434;
								if (arg0.anInt5359 + 1 >= local186.anInt1429) {
									arg0.anInt5345 = -1;
								} else if (arg0.anInt5345 < 0 || local186.anIntArray65.length <= arg0.anInt5345) {
									arg0.anInt5345 = -1;
								}
							} else {
								arg0.anInt5345 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5392 != -1 && Static123.anInt2333 >= arg0.anInt5360) {
			local175 = Static294.aClass125_2.method2961(arg0.anInt5392);
			local178 = local175.anInt4334;
			if (local178 == -1) {
				arg0.anInt5392 = -1;
			} else {
				label399: {
					local186 = Static322.aClass45_5.method690(local178);
					if (local175.aBoolean344) {
						if (local186.anInt1437 == 3) {
							if (arg0.anInt5420 > 0 && arg0.anInt5344 <= Static123.anInt2333 && arg0.anInt5380 < Static123.anInt2333) {
								arg0.anInt5392 = -1;
								break label399;
							}
						} else if (local186.anInt1437 == 1 && arg0.anInt5420 > 0 && Static123.anInt2333 >= arg0.anInt5344 && Static123.anInt2333 > arg0.anInt5380) {
							arg0.anInt5360 = Static123.anInt2333 + 1;
							break label399;
						}
					}
					if (local186 == null || local186.anIntArray65 == null) {
						arg0.anInt5392 = -1;
					} else {
						if (arg0.anInt5400 < 0) {
							arg0.anInt5400 = 0;
							Static385.method5367(arg0.aByte97, arg0.anInt7066, 0, local186, arg0 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg0.anInt7060);
						}
						arg0.anInt5354++;
						if (arg0.anInt5400 < local186.anIntArray65.length && arg0.anInt5354 > local186.anIntArray66[arg0.anInt5400]) {
							arg0.anInt5354 = 1;
							arg0.anInt5400++;
							Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5400, local186, arg0 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg0.anInt7060);
						}
						if (local186.anIntArray65.length <= arg0.anInt5400) {
							if (local175.aBoolean344) {
								arg0.anInt5400 -= local186.anInt1434;
								arg0.anInt5366++;
								if (local186.anInt1429 <= arg0.anInt5366) {
									arg0.anInt5392 = -1;
								} else if (arg0.anInt5400 >= 0 && local186.anIntArray65.length > arg0.anInt5400) {
									Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5400, local186, arg0 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg0.anInt7060);
								} else {
									arg0.anInt5392 = -1;
								}
							} else {
								arg0.anInt5392 = -1;
							}
						}
						arg0.anInt5349 = arg0.anInt5400 + 1;
						if (arg0.anInt5349 >= local186.anIntArray65.length) {
							if (local175.aBoolean344) {
								arg0.anInt5349 -= local186.anInt1434;
								if (local186.anInt1429 <= arg0.anInt5366 + 1) {
									arg0.anInt5349 = -1;
								} else if (arg0.anInt5349 < 0 || arg0.anInt5349 >= local186.anIntArray65.length) {
									arg0.anInt5349 = -1;
								}
							} else {
								arg0.anInt5349 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5348 != -1 && arg0.anInt5370 <= 1) {
			local18 = Static322.aClass45_5.method690(arg0.anInt5348);
			if (local18.anInt1437 == 3) {
				if (arg0.anInt5420 > 0 && Static123.anInt2333 >= arg0.anInt5344 && arg0.anInt5380 < Static123.anInt2333) {
					arg0.anInt5348 = -1;
				}
			} else if (local18.anInt1437 == 1 && arg0.anInt5420 > 0 && arg0.anInt5344 <= Static123.anInt2333 && Static123.anInt2333 > arg0.anInt5380) {
				arg0.anInt5370 = 2;
			}
		}
		if (arg0.anInt5348 != -1 && arg0.anInt5370 == 0) {
			local18 = Static322.aClass45_5.method690(arg0.anInt5348);
			if (local18 == null || local18.anIntArray65 == null) {
				arg0.anInt5348 = -1;
			} else {
				arg0.anInt5403++;
				if (arg0.anInt5350 < local18.anIntArray65.length && local18.anIntArray66[arg0.anInt5350] < arg0.anInt5403) {
					arg0.anInt5350++;
					arg0.anInt5403 = 1;
					Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5350, local18, Static255.aClass47_Sub1_Sub5_Sub2_2 == arg0, arg0.anInt7060);
				}
				if (arg0.anInt5350 >= local18.anIntArray65.length) {
					arg0.anInt5350 -= local18.anInt1434;
					arg0.anInt5339++;
					if (arg0.anInt5339 >= local18.anInt1429) {
						arg0.anInt5348 = -1;
					} else if (arg0.anInt5350 >= 0 && arg0.anInt5350 < local18.anIntArray65.length) {
						Static385.method5367(arg0.aByte97, arg0.anInt7066, arg0.anInt5350, local18, Static255.aClass47_Sub1_Sub5_Sub2_2 == arg0, arg0.anInt7060);
					} else {
						arg0.anInt5348 = -1;
					}
				}
				arg0.anInt5372 = arg0.anInt5350 + 1;
				if (arg0.anInt5372 >= local18.anIntArray65.length) {
					arg0.anInt5372 -= local18.anInt1434;
					if (local18.anInt1429 <= arg0.anInt5339 + 1) {
						arg0.anInt5372 = -1;
					} else if (arg0.anInt5372 < 0 || arg0.anInt5372 >= local18.anIntArray65.length) {
						arg0.anInt5372 = -1;
					}
				}
				arg0.aBoolean434 = local18.aBoolean123;
			}
		}
		if (arg0.anInt5370 > 0) {
			arg0.anInt5370--;
		}
		for (@Pc(1072) int local1072 = 0; local1072 < arg0.aClass226Array3.length; local1072++) {
			@Pc(1079) Class226 local1079 = arg0.aClass226Array3[local1072];
			if (local1079 != null) {
				if (local1079.anInt6845 > 0) {
					local1079.anInt6845--;
				} else {
					local186 = Static322.aClass45_5.method690(local1079.anInt6841);
					if (local186 == null || local186.anIntArray65 == null) {
						arg0.aClass226Array3[local1072] = null;
					} else {
						local1079.anInt6842++;
						if (local186.anIntArray65.length > local1079.anInt6840 && local1079.anInt6842 > local186.anIntArray66[local1079.anInt6840]) {
							local1079.anInt6842 = 1;
							local1079.anInt6840++;
							Static385.method5367(arg0.aByte97, arg0.anInt7066, local1079.anInt6840, local186, Static255.aClass47_Sub1_Sub5_Sub2_2 == arg0, arg0.anInt7060);
						}
						if (local186.anIntArray65.length <= local1079.anInt6840) {
							local1079.anInt6844++;
							local1079.anInt6840 -= local186.anInt1434;
							if (local186.anInt1429 <= local1079.anInt6844) {
								arg0.aClass226Array3[local1072] = null;
							} else if (local1079.anInt6840 >= 0 && local1079.anInt6840 < local186.anIntArray65.length) {
								Static385.method5367(arg0.aByte97, arg0.anInt7066, local1079.anInt6840, local186, arg0 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg0.anInt7060);
							} else {
								arg0.aClass226Array3[local1072] = null;
							}
						}
						local1079.anInt6846 = local1079.anInt6840 + 1;
						if (local186.anIntArray65.length <= local1079.anInt6846) {
							local1079.anInt6846 -= local186.anInt1434;
							if (local186.anInt1429 <= local1079.anInt6844 + 1) {
								local1079.anInt6846 = -1;
							} else if (local1079.anInt6846 < 0 || local1079.anInt6846 >= local186.anIntArray65.length) {
								local1079.anInt6846 = -1;
							}
						}
					}
				}
			}
		}
	}
}
