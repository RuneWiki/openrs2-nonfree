import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "Lclient!va;")
	public static Class248 aClass248_1;

	@OriginalMember(owner = "client!aq", name = "P", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_12 = new Class209("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "[Lclient!vf;")
	public static final Class250[] aClass250Array1 = new Class250[14];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!mg;ILclient!mg;)V")
	public static void method291(@OriginalArg(0) Class160 arg0, @OriginalArg(2) Class160 arg1) {
		Static425.aClass160_84 = arg1;
		Static425.aClass160_83 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static16.method318(arg4)) {
			return;
		}
		if (Static344.aClass68ArrayArray2[arg4] == null) {
			Static47.method779(Static60.aClass68ArrayArray1[arg4], -1, arg3, arg5, arg0, arg1, arg2, arg6, arg7, arg8);
		} else {
			Static47.method779(Static344.aClass68ArrayArray2[arg4], -1, arg3, arg5, arg0, arg1, arg2, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method293(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static159.method2586(Static450.aClass54_108);
		Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(arg1) + 1);
		Static424.aClass2_Sub23_Sub2_1.method5496(arg1);
		Static424.aClass2_Sub23_Sub2_1.method5463(arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIZ)V")
	public static void method294(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) Class2_Sub38 local12 = Static448.method5748(arg0, arg1);
		if (local12 != null) {
			for (@Pc(24) int local24 = 0; local24 < local12.anIntArray512.length; local24++) {
				local12.anIntArray512[local24] = -1;
				local12.anIntArray513[local24] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)V")
	public static void method295() {
		if (Static305.anInt5413 == 0 || Static305.anInt5413 == 5) {
			return;
		}
		try {
			if (++Static385.anInt6453 > 2000) {
				if (Static34.aClass34_2 != null) {
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
				}
				if (Static103.anInt2415 >= 1) {
					Static305.anInt5413 = 0;
					Static378.anInt6415 = -5;
					return;
				}
				Static103.anInt2415++;
				Static385.anInt6453 = 0;
				Static305.anInt5413 = 1;
				if (Static45.anInt816 == Static395.anInt6580) {
					Static45.anInt816 = Static432.anInt7151;
				} else {
					Static45.anInt816 = Static395.anInt6580;
				}
			}
			if (Static305.anInt5413 == 1) {
				Static145.aClass138_5 = Static43.aClass59_5.method1353(Static45.anInt816, Static266.aString47);
				Static305.anInt5413 = 2;
			}
			@Pc(113) int local113;
			if (Static305.anInt5413 == 2) {
				if (Static145.aClass138_5.anInt3723 == 2) {
					throw new IOException();
				}
				if (Static145.aClass138_5.anInt3723 != 1) {
					return;
				}
				Static34.aClass34_2 = new Class34((Socket) Static145.aClass138_5.anObject7, Static43.aClass59_5);
				Static145.aClass138_5 = null;
				@Pc(106) long local106 = Static3.aLong6 = Static346.method4767(Static159.aString38);
				local113 = (int) (local106 >> 16 & 0x1FL);
				Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
				Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_1.anInt6576);
				Static424.aClass2_Sub23_Sub2_1.method5449(local113);
				Static34.aClass34_2.method606(2, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
				Static148.method2441();
				@Pc(142) int local142 = Static34.aClass34_2.method615();
				Static148.method2441();
				if (local142 != 0) {
					Static378.anInt6415 = local142;
					Static305.anInt5413 = 0;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
					return;
				}
				Static305.anInt5413 = 3;
			}
			if (Static305.anInt5413 == 3) {
				if (Static34.aClass34_2.method613() < 8) {
					return;
				}
				Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 8);
				Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
				Static24.aLong139 = Static438.aClass2_Sub23_Sub2_2.method5453();
				@Pc(188) Class2_Sub23 local188 = new Class2_Sub23(70);
				@Pc(191) int[] local191 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static24.aLong139 >> 32), (int) Static24.aLong139 };
				local188.method5449(10);
				local188.method5506(local191[0]);
				local188.method5506(local191[1]);
				local188.method5506(local191[2]);
				local188.method5506(local191[3]);
				local188.method5450(Static346.method4767(Static159.aString38));
				local188.method5496(Static217.aString44);
				local188.method5510(Static100.aBigInteger2, Static57.aBigInteger1);
				Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
				if (Static162.anInt3250 == 40) {
					Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_5.anInt6576);
				} else {
					Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_3.anInt6576);
				}
				Static424.aClass2_Sub23_Sub2_1.method5502(0);
				local113 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
				Static424.aClass2_Sub23_Sub2_1.method5506(591);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static40.anInt755);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static359.method4899());
				Static424.aClass2_Sub23_Sub2_1.method5502(Static86.anInt4394);
				Static424.aClass2_Sub23_Sub2_1.method5502(Static395.anInt6582);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static12.aClass79_Sub1_1.anInt4930);
				Static286.method4126(Static424.aClass2_Sub23_Sub2_1);
				Static424.aClass2_Sub23_Sub2_1.method5496(Static92.aString37);
				Static424.aClass2_Sub23_Sub2_1.method5506(Static352.anInt5971);
				@Pc(342) Class2_Sub23 local342 = Static12.aClass79_Sub1_1.method3963();
				Static424.aClass2_Sub23_Sub2_1.method5449(local342.anInt6952);
				Static424.aClass2_Sub23_Sub2_1.method5462(local342.anInt6952, local342.aByteArray130);
				Static120.aBoolean204 = true;
				Static424.aClass2_Sub23_Sub2_1.method5502(Static25.anInt589);
				Static424.aClass2_Sub23_Sub2_1.method5506(Static438.aClass160_89.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static441.aClass160_4.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static49.aClass160_6.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static191.aClass160_35.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static285.aClass160_58.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static368.aClass160_73.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static186.aClass160_34.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static307.aClass160_60.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static153.aClass160_25.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static394.aClass160_74.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static180.aClass160_30.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static223.aClass160_42.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static424.aClass160_81.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static410.aClass160_77.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static167.aClass160_28.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static453.aClass160_92.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static331.aClass160_65.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static395.aClass160_76.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static234.aClass160_47.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static138.aClass160_20.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static217.aClass160_40.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static146.aClass160_23.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static353.aClass160_68.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static323.aClass160_64.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static282.aClass160_57.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static287.aClass160_59.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static355.aClass160_69.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static183.aClass160_32.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static146.aClass160_24.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5506(Static128.aClass160_19.method3707());
				Static424.aClass2_Sub23_Sub2_1.method5462(local188.anInt6952, local188.aByteArray130);
				Static424.aClass2_Sub23_Sub2_1.method5465(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local113);
				Static34.aClass34_2.method606(Static424.aClass2_Sub23_Sub2_1.anInt6952, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
				Static424.aClass2_Sub23_Sub2_1.method5517(local191);
				for (@Pc(591) int local591 = 0; local591 < 4; local591++) {
					local191[local591] += 50;
				}
				Static438.aClass2_Sub23_Sub2_2.method5517(local191);
				Static305.anInt5413 = 4;
			}
			@Pc(631) int local631;
			if (Static305.anInt5413 == 4) {
				if (Static34.aClass34_2.method613() < 1) {
					return;
				}
				local631 = Static34.aClass34_2.method615();
				if (local631 == 21) {
					Static305.anInt5413 = 7;
				} else if (local631 == 29) {
					Static305.anInt5413 = 11;
				} else if (local631 == 1) {
					Static305.anInt5413 = 5;
					Static378.anInt6415 = local631;
					return;
				} else if (local631 == 2) {
					Static305.anInt5413 = 8;
				} else if (local631 == 15) {
					Static305.anInt5413 = 12;
					Static379.anInt6425 = -2;
				} else if (local631 == 23 && Static103.anInt2415 < 1) {
					Static103.anInt2415++;
					Static385.anInt6453 = 0;
					Static305.anInt5413 = 1;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
					return;
				} else {
					Static305.anInt5413 = 0;
					Static378.anInt6415 = local631;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
					return;
				}
			}
			if (Static305.anInt5413 == 6) {
				Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
				Static424.aClass2_Sub23_Sub2_1.method5518(Static94.aClass240_4.anInt6576);
				Static34.aClass34_2.method606(Static424.aClass2_Sub23_Sub2_1.anInt6952, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
				Static305.anInt5413 = 4;
			} else if (Static305.anInt5413 == 7) {
				if (Static34.aClass34_2.method613() >= 1) {
					Static316.anInt5474 = Static34.aClass34_2.method615() * 60 + 180;
					Static305.anInt5413 = 0;
					Static378.anInt6415 = 21;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
				}
			} else if (Static305.anInt5413 != 11) {
				if (Static305.anInt5413 == 8) {
					if (Static34.aClass34_2.method613() < 13) {
						return;
					}
					Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 13);
					Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
					Static193.anInt3710 = Static438.aClass2_Sub23_Sub2_2.method5495();
					Static411.anInt6852 = Static438.aClass2_Sub23_Sub2_2.method5495();
					Static340.aBoolean411 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
					Static62.aBoolean83 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
					Static178.aBoolean480 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
					Static223.aBoolean314 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
					Static399.anInt6656 = Static438.aClass2_Sub23_Sub2_2.method5500();
					Static192.aBoolean280 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
					Static333.aBoolean406 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
					Static118.aClass165_2.method3805(Static333.aBoolean406);
					Static318.aClass144_6.method3275(Static333.aBoolean406);
					Static219.aClass76_2.method1891(Static333.aBoolean406);
					if (Static340.aBoolean411 && !Static178.aBoolean480 || Static192.aBoolean280) {
						try {
							Static463.method4344("zap", Static43.aClass59_5.anApplet1);
						} catch (@Pc(910) Throwable local910) {
							if (Static30.aBoolean33) {
								try {
									Static43.aClass59_5.anApplet1.getAppletContext().showDocument(new URL(Static43.aClass59_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(926) Exception local926) {
								}
							}
						}
					} else {
						try {
							Static463.method4344("unzap", Static43.aClass59_5.anApplet1);
						} catch (@Pc(900) Throwable local900) {
						}
					}
					if (Static53.aClass56_2 == Static23.aClass56_1) {
						try {
							Static463.method4344("loggedin", Static43.aClass59_5.anApplet1);
						} catch (@Pc(938) Throwable local938) {
						}
					}
					Static305.anInt5413 = 10;
				}
				if (Static305.anInt5413 == 10) {
					if (Static438.aClass2_Sub23_Sub2_2.method5514()) {
						if (Static34.aClass34_2.method613() < 1) {
							return;
						}
						Static34.aClass34_2.method604(Static438.aClass2_Sub23_Sub2_2.anInt6952 + 2, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 1);
					}
					Static138.aClass265_54 = Static354.method4833()[Static438.aClass2_Sub23_Sub2_2.method5524()];
					Static379.anInt6425 = Static438.aClass2_Sub23_Sub2_2.method5500();
					Static305.anInt5413 = 9;
				}
				if (Static305.anInt5413 == 9) {
					if (Static34.aClass34_2.method613() >= Static379.anInt6425) {
						Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, Static379.anInt6425);
						Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
						local631 = Static379.anInt6425;
						Static378.anInt6415 = 2;
						Static305.anInt5413 = 0;
						Static69.method1322();
						Static131.method2235(Static438.aClass2_Sub23_Sub2_2);
						Static455.anInt5548 = -1;
						Static444.method5712();
						if (local631 != Static438.aClass2_Sub23_Sub2_2.anInt6952) {
							throw new RuntimeException("lswp pos:" + Static438.aClass2_Sub23_Sub2_2.anInt6952 + " psize:" + local631);
						}
						Static138.aClass265_54 = null;
					}
				} else if (Static305.anInt5413 == 12) {
					if (Static379.anInt6425 == -2) {
						if (Static34.aClass34_2.method613() < 2) {
							return;
						}
						Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 2);
						Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
						Static379.anInt6425 = Static438.aClass2_Sub23_Sub2_2.method5500();
					}
					if (Static34.aClass34_2.method613() >= Static379.anInt6425) {
						Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, Static379.anInt6425);
						Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
						local631 = Static379.anInt6425;
						Static305.anInt5413 = 0;
						Static378.anInt6415 = 15;
						Static291.method4187();
						Static131.method2235(Static438.aClass2_Sub23_Sub2_2);
						if (local631 != Static438.aClass2_Sub23_Sub2_2.anInt6952) {
							throw new RuntimeException("lswpr pos:" + Static438.aClass2_Sub23_Sub2_2.anInt6952 + " psize:" + local631);
						}
						Static138.aClass265_54 = null;
					}
				}
			} else if (Static34.aClass34_2.method613() >= 1) {
				Static362.anInt6210 = Static34.aClass34_2.method615();
				Static378.anInt6415 = 29;
				Static305.anInt5413 = 0;
				Static34.aClass34_2.method610();
				Static34.aClass34_2 = null;
			}
		} catch (@Pc(1125) IOException local1125) {
			if (Static34.aClass34_2 != null) {
				Static34.aClass34_2.method610();
				Static34.aClass34_2 = null;
			}
			if (Static103.anInt2415 < 1) {
				Static103.anInt2415++;
				Static305.anInt5413 = 1;
				Static385.anInt6453 = 0;
				if (Static395.anInt6580 == Static45.anInt816) {
					Static45.anInt816 = Static432.anInt7151;
				} else {
					Static45.anInt816 = Static395.anInt6580;
				}
			} else {
				Static305.anInt5413 = 0;
				Static378.anInt6415 = -4;
			}
		}
	}
}
