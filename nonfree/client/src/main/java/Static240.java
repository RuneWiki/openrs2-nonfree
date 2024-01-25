import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!em;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	public static int anInt4514;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
	public static void method3638() {
		if (Static398.anInt5978 == 0 || Static398.anInt5978 == 5) {
			return;
		}
		try {
			if (++Static296.anInt5335 > 2000) {
				if (Static423.aClass199_11 != null) {
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
				}
				if (Static91.anInt2066 >= 1) {
					Static33.anInt668 = -5;
					Static398.anInt5978 = 0;
					return;
				}
				if (Static219.anInt4190 == Static276.anInt5074) {
					Static219.anInt4190 = Static133.anInt2586;
				} else {
					Static219.anInt4190 = Static276.anInt5074;
				}
				Static398.anInt5978 = 1;
				Static91.anInt2066++;
				Static296.anInt5335 = 0;
			}
			if (Static398.anInt5978 == 1) {
				Static195.aClass128_4 = Static303.aClass131_4.method3068(Static219.anInt4190, Static373.aString7);
				Static398.anInt5978 = 2;
			}
			@Pc(115) int local115;
			if (Static398.anInt5978 == 2) {
				if (Static195.aClass128_4.anInt3727 == 2) {
					throw new IOException();
				}
				if (Static195.aClass128_4.anInt3727 != 1) {
					return;
				}
				Static423.aClass199_11 = new Class199((Socket) Static195.aClass128_4.anObject4, Static303.aClass131_4);
				Static195.aClass128_4 = null;
				@Pc(108) long local108 = Static289.aLong189 = Static41.method777(Static230.aString39);
				local115 = (int) (local108 >> 16 & 0x1FL);
				Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
				Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_1.anInt7355);
				Static98.aClass2_Sub20_Sub1_1.method3699(local115);
				Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, 2);
				Static347.method4871();
				@Pc(140) int local140 = Static423.aClass199_11.method4491();
				Static347.method4871();
				if (local140 != 0) {
					Static398.anInt5978 = 0;
					Static33.anInt668 = local140;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
					return;
				}
				Static398.anInt5978 = 3;
			}
			if (Static398.anInt5978 == 3) {
				if (Static423.aClass199_11.method4483() < 8) {
					return;
				}
				Static423.aClass199_11.method4488(8, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
				Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
				Static46.aLong36 = Static426.aClass2_Sub20_Sub1_2.method3719();
				@Pc(186) Class2_Sub20 local186 = new Class2_Sub20(70);
				@Pc(189) int[] local189 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static46.aLong36 >> 32), (int) Static46.aLong36 };
				local186.method3699(10);
				local186.method3713(local189[0]);
				local186.method3713(local189[1]);
				local186.method3713(local189[2]);
				local186.method3713(local189[3]);
				local186.method3692(Static41.method777(Static230.aString39));
				local186.method3715(Static266.aString44);
				local186.method3749(Static133.aBigInteger1, Static334.aBigInteger2);
				Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
				if (Static297.anInt5339 == 40) {
					Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_5.anInt7355);
				} else {
					Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_3.anInt7355);
				}
				Static98.aClass2_Sub20_Sub1_1.method3745(0);
				local115 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
				Static98.aClass2_Sub20_Sub1_1.method3713(585);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static110.anInt2286);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static405.method5498());
				Static98.aClass2_Sub20_Sub1_1.method3745(Static96.anInt2175);
				Static98.aClass2_Sub20_Sub1_1.method3745(Static216.anInt4171);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static399.aClass167_Sub1_1.anInt5559);
				Static421.method5712(Static98.aClass2_Sub20_Sub1_1);
				Static98.aClass2_Sub20_Sub1_1.method3715(Static438.aString70);
				Static98.aClass2_Sub20_Sub1_1.method3713(Static160.anInt3171);
				@Pc(324) Class2_Sub20 local324 = Static399.aClass167_Sub1_1.method4526();
				Static98.aClass2_Sub20_Sub1_1.method3699(local324.anInt4608);
				Static98.aClass2_Sub20_Sub1_1.method3710(local324.anInt4608, local324.aByteArray136);
				Static45.aBoolean626 = true;
				Static98.aClass2_Sub20_Sub1_1.method3745(Static436.anInt7620);
				Static98.aClass2_Sub20_Sub1_1.method3713(Static260.aClass188_70.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static285.aClass188_77.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static102.aClass188_33.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static203.aClass188_55.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static310.aClass188_83.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static438.aClass188_126.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static329.aClass188_90.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static155.aClass188_43.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static351.aClass188_97.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static373.aClass188_22.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static381.aClass188_109.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static22.aClass188_10.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static317.aClass188_86.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static48.aClass188_23.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static10.aClass188_6.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static88.aClass188_28.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static419.aClass188_123.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static96.aClass188_32.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static444.aClass188_128.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static269.aClass188_72.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static1.aClass188_1.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static317.aClass188_87.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static153.aClass188_42.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static309.aClass188_82.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static349.aClass188_96.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static348.aClass188_95.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static299.aClass188_79.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static260.aClass188_69.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static397.aClass188_116.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3713(Static46.aClass188_20.method4301());
				Static98.aClass2_Sub20_Sub1_1.method3710(local186.anInt4608, local186.aByteArray136);
				Static98.aClass2_Sub20_Sub1_1.method3723(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local115);
				Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, Static98.aClass2_Sub20_Sub1_1.anInt4608);
				Static98.aClass2_Sub20_Sub1_1.method2503(local189);
				for (@Pc(552) int local552 = 0; local552 < 4; local552++) {
					local189[local552] += 50;
				}
				Static426.aClass2_Sub20_Sub1_2.method2503(local189);
				Static398.anInt5978 = 4;
			}
			if (Static398.anInt5978 == 4) {
				if (Static423.aClass199_11.method4483() < 1) {
					return;
				}
				@Pc(588) int local588 = Static423.aClass199_11.method4491();
				if (local588 == 21) {
					Static398.anInt5978 = 7;
				} else if (local588 == 29) {
					Static398.anInt5978 = 11;
				} else if (local588 == 1) {
					Static398.anInt5978 = 5;
					Static33.anInt668 = local588;
					return;
				} else if (local588 == 2) {
					Static398.anInt5978 = 8;
				} else if (local588 == 15) {
					Static398.anInt5978 = 12;
					Static193.anInt3787 = -2;
				} else if (local588 == 23 && Static91.anInt2066 < 1) {
					Static398.anInt5978 = 1;
					Static296.anInt5335 = 0;
					Static91.anInt2066++;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
					return;
				} else {
					Static33.anInt668 = local588;
					Static398.anInt5978 = 0;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
					return;
				}
			}
			if (Static398.anInt5978 == 6) {
				Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
				Static98.aClass2_Sub20_Sub1_1.method2498(Static119.aClass254_4.anInt7355);
				Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, Static98.aClass2_Sub20_Sub1_1.anInt4608);
				Static398.anInt5978 = 4;
			} else if (Static398.anInt5978 == 7) {
				if (Static423.aClass199_11.method4483() >= 1) {
					Static95.anInt2154 = (Static423.aClass199_11.method4491() + 3) * 60;
					Static398.anInt5978 = 0;
					Static33.anInt668 = 21;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
				}
			} else if (Static398.anInt5978 != 11) {
				if (Static398.anInt5978 == 8) {
					if (Static423.aClass199_11.method4483() < 13) {
						return;
					}
					Static423.aClass199_11.method4488(13, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
					Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
					Static255.anInt4802 = Static426.aClass2_Sub20_Sub1_2.method3737();
					Static381.anInt6752 = Static426.aClass2_Sub20_Sub1_2.method3737();
					Static217.aBoolean41 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
					Static296.aBoolean462 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
					Static180.aBoolean298 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
					Static407.aBoolean597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
					Static393.anInt6881 = Static426.aClass2_Sub20_Sub1_2.method3711();
					Static168.aBoolean279 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
					Static67.aBoolean153 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
					Static406.aClass150_3.method3518(Static67.aBoolean153);
					Static350.aClass149_2.method3491(Static67.aBoolean153);
					Static417.aClass234_2.method5356(Static67.aBoolean153);
					if (Static217.aBoolean41 && !Static180.aBoolean298 || Static168.aBoolean279) {
						try {
							Static461.method3590(Static303.aClass131_4.anApplet1, "zap");
						} catch (@Pc(861) Throwable local861) {
							if (Static254.aBoolean595) {
								try {
									Static303.aClass131_4.anApplet1.getAppletContext().showDocument(new URL(Static303.aClass131_4.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(877) Exception local877) {
								}
							}
						}
					} else {
						try {
							Static461.method3590(Static303.aClass131_4.anApplet1, "unzap");
						} catch (@Pc(887) Throwable local887) {
						}
					}
					if (Static343.aClass269_11 == Static293.aClass269_10) {
						try {
							Static461.method3590(Static303.aClass131_4.anApplet1, "loggedin");
						} catch (@Pc(899) Throwable local899) {
						}
					}
					Static398.anInt5978 = 10;
				}
				if (Static398.anInt5978 == 10) {
					if (Static426.aClass2_Sub20_Sub1_2.method2502()) {
						if (Static423.aClass199_11.method4483() < 1) {
							return;
						}
						Static423.aClass199_11.method4488(1, Static426.aClass2_Sub20_Sub1_2.aByteArray136, Static426.aClass2_Sub20_Sub1_2.anInt4608 + 2);
					}
					Static141.aClass81_59 = Static24.method341()[Static426.aClass2_Sub20_Sub1_2.method2507()];
					Static193.anInt3787 = Static426.aClass2_Sub20_Sub1_2.method3711();
					Static398.anInt5978 = 9;
				}
				@Pc(965) int local965;
				if (Static398.anInt5978 == 9) {
					if (Static423.aClass199_11.method4483() >= Static193.anInt3787) {
						Static423.aClass199_11.method4488(Static193.anInt3787, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
						Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
						Static33.anInt668 = 2;
						Static398.anInt5978 = 0;
						local965 = Static193.anInt3787;
						Static118.method1728();
						Static268.method4011(Static426.aClass2_Sub20_Sub1_2);
						Static447.anInt4685 = -1;
						Static293.method4558();
						if (local965 != Static426.aClass2_Sub20_Sub1_2.anInt4608) {
							throw new RuntimeException("lswp pos:" + Static426.aClass2_Sub20_Sub1_2.anInt4608 + " psize:" + local965);
						}
						Static141.aClass81_59 = null;
					}
				} else if (Static398.anInt5978 == 12) {
					if (Static193.anInt3787 == -2) {
						if (Static423.aClass199_11.method4483() < 2) {
							return;
						}
						Static423.aClass199_11.method4488(2, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
						Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
						Static193.anInt3787 = Static426.aClass2_Sub20_Sub1_2.method3711();
					}
					if (Static423.aClass199_11.method4483() >= Static193.anInt3787) {
						Static423.aClass199_11.method4488(Static193.anInt3787, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
						Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
						local965 = Static193.anInt3787;
						Static398.anInt5978 = 0;
						Static33.anInt668 = 15;
						Static365.method5075();
						Static268.method4011(Static426.aClass2_Sub20_Sub1_2);
						if (Static426.aClass2_Sub20_Sub1_2.anInt4608 != local965) {
							throw new RuntimeException("lswpr pos:" + Static426.aClass2_Sub20_Sub1_2.anInt4608 + " psize:" + local965);
						}
						Static141.aClass81_59 = null;
					}
				}
			} else if (Static423.aClass199_11.method4483() >= 1) {
				Static282.anInt5151 = Static423.aClass199_11.method4491();
				Static398.anInt5978 = 0;
				Static33.anInt668 = 29;
				Static423.aClass199_11.method4490();
				Static423.aClass199_11 = null;
			}
		} catch (@Pc(1078) IOException local1078) {
			if (Static423.aClass199_11 != null) {
				Static423.aClass199_11.method4490();
				Static423.aClass199_11 = null;
			}
			if (Static91.anInt2066 < 1) {
				Static91.anInt2066++;
				Static296.anInt5335 = 0;
				if (Static219.anInt4190 == Static276.anInt5074) {
					Static219.anInt4190 = Static133.anInt2586;
				} else {
					Static219.anInt4190 = Static276.anInt5074;
				}
				Static398.anInt5978 = 1;
			} else {
				Static33.anInt668 = -4;
				Static398.anInt5978 = 0;
			}
		}
	}
}
