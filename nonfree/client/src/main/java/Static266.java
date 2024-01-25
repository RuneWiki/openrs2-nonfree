import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!bd;")
	private static Class26 aClass26_1;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!oh;")
	private static Class220 aClass220_12;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Lclient!oh;")
	private static Class220 aClass220_13;

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "[I")
	private static int[] anIntArray325;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray23;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar3 = Calendar.getInstance();

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "[[I")
	private static final int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "[I")
	private static final int[] anIntArray324 = new int[5];

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "[Lclient!st;")
	private static final Class276[] aClass276Array1 = new Class276[50];

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	private static int anInt5223 = 0;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	private static int anInt5226 = 0;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[1000];

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
	private static int anInt5228 = 0;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "[I")
	private static final int[] anIntArray326 = new int[1000];

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray24 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_37 = new Class288(4);

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "[I")
	private static final int[] anIntArray327 = new int[3];

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
	private static int anInt5229 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ah;I)V")
	private static void method4398(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		anInt5226 = 0;
		anInt5223 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray16;
		@Pc(11) int[] local11 = arg0.anIntArray17;
		@Pc(13) byte local13 = -1;
		anInt5228 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method4408(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4399(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray326[anInt5226++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray326[anInt5226++] = Static540.aClass242_1.anIntArray553[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static540.aClass242_1.method5725(local54, anIntArray326[--anInt5226]);
					} else if (local31 == 3) {
						aStringArray22[anInt5223++] = arg0.aStringArray5[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5226 -= 2;
						if (anIntArray326[anInt5226] != anIntArray326[anInt5226 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5226 -= 2;
						if (anIntArray326[anInt5226] == anIntArray326[anInt5226 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5226 -= 2;
						if (anIntArray326[anInt5226] < anIntArray326[anInt5226 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5226 -= 2;
						if (anIntArray326[anInt5226] > anIntArray326[anInt5226 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5228 == 0) {
							return;
						}
						@Pc(216) Class276 local216 = aClass276Array1[--anInt5228];
						arg0 = local216.aClass5_Sub2_Sub1_1;
						local8 = arg0.anIntArray16;
						local11 = arg0.anIntArray17;
						local5 = local216.anInt7888;
						anIntArray325 = local216.anIntArray601;
						aStringArray23 = local216.aStringArray34;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray326[anInt5226++] = Static540.aClass242_1.method5717(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static540.aClass242_1.method5720(local54, anIntArray326[--anInt5226]);
					} else if (local31 == 31) {
						anInt5226 -= 2;
						if (anIntArray326[anInt5226] <= anIntArray326[anInt5226 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5226 -= 2;
						if (anIntArray326[anInt5226] >= anIntArray326[anInt5226 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray326[anInt5226++] = anIntArray325[local11[local5]];
					} else if (local31 == 34) {
						anIntArray325[local11[local5]] = anIntArray326[--anInt5226];
					} else if (local31 == 35) {
						aStringArray22[anInt5223++] = aStringArray23[local11[local5]];
					} else if (local31 == 36) {
						aStringArray23[local11[local5]] = aStringArray22[--anInt5223];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5223 -= local54;
						@Pc(400) String local400 = Static60.method6855(aStringArray22, anInt5223, local54);
						aStringArray22[anInt5223++] = local400;
					} else if (local31 == 38) {
						anInt5226--;
					} else if (local31 == 39) {
						anInt5223--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class5_Sub2_Sub1 local436 = Static335.method5243(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt213];
							@Pc(450) String[] local450 = new String[local436.anInt209];
							for (local452 = 0; local452 < local436.anInt211; local452++) {
								local446[local452] = anIntArray326[anInt5226 + local452 - local436.anInt211];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt210; local471++) {
								local450[local471] = aStringArray22[anInt5223 + local471 - local436.anInt210];
							}
							anInt5226 -= local436.anInt211;
							anInt5223 -= local436.anInt210;
							@Pc(502) Class276 local502 = new Class276();
							local502.aClass5_Sub2_Sub1_1 = arg0;
							local502.anInt7888 = local5;
							local502.anIntArray601 = anIntArray325;
							local502.aStringArray34 = aStringArray23;
							if (anInt5228 >= aClass276Array1.length) {
								throw new RuntimeException();
							}
							aClass276Array1[anInt5228++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray16;
							local11 = local436.anIntArray17;
							local5 = -1;
							anIntArray325 = local446;
							aStringArray23 = local450;
						} else if (local31 == 42) {
							anIntArray326[anInt5226++] = Static481.anIntArray650[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static481.anIntArray650[local54] = anIntArray326[--anInt5226];
							Static157.method2864(local54);
							Static218.aBoolean249 |= Static466.aBooleanArray34[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray326[--anInt5226];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray324[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray30[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray326[--anInt5226];
							if (local603 < 0 || local603 >= anIntArray324[local54]) {
								throw new RuntimeException();
							}
							anIntArray326[anInt5226++] = anIntArrayArray30[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5226 -= 2;
							local603 = anIntArray326[anInt5226];
							if (local603 < 0 || local603 >= anIntArray324[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray30[local54][local603] = anIntArray326[anInt5226 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static37.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray22[anInt5223++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static37.aStringArray11[local54] = aStringArray22[--anInt5223];
							Static239.method4077(local54);
						} else if (local31 == 51) {
							@Pc(774) Class42 local774 = arg0.aClass42Array1[local11[local5]];
							@Pc(787) Class5_Sub27 local787 = (Class5_Sub27) local774.method1109((long) anIntArray326[--anInt5226]);
							if (local787 != null) {
								local5 += local787.anInt4812;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString9 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong253).append(" ");
				for (local603 = anInt5228 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass276Array1[local603].aClass5_Sub2_Sub1_1.aLong253).append(" ");
				}
				local855.append("op: ").append(local13);
				Static370.method6434(local855.toString(), local837);
			} else {
				Static340.method5291("Clientscript error in: " + arg0.aString9);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString9).append("\n");
				for (local603 = anInt5228 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass276Array1[local603].aClass5_Sub2_Sub1_1.aString9).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static370.method6434(local855.toString(), local837);
				Static360.method5527(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)V")
	private static void method4399(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(691) int local691;
		@Pc(89) int local89;
		@Pc(95) int local95;
		@Pc(1375) boolean local1375;
		@Pc(163) String local163;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray326[anInt5226++] = Static58.anInt1190;
				return;
			}
			if (arg0 == 5001) {
				anInt5226 -= 3;
				Static58.anInt1190 = anIntArray326[anInt5226];
				Static439.aClass127_10 = Static311.method5046(anIntArray326[anInt5226 + 1]);
				if (Static439.aClass127_10 == null) {
					Static439.aClass127_10 = Static143.aClass127_2;
				}
				Static450.anInt7828 = anIntArray326[anInt5226 + 2];
				Static415.method5995(Static221.aClass236_44);
				Static164.aClass5_Sub3_Sub1_2.method4192(Static58.anInt1190);
				Static164.aClass5_Sub3_Sub1_2.method4192(Static439.aClass127_10.anInt3507);
				Static164.aClass5_Sub3_Sub1_2.method4192(Static450.anInt7828);
				return;
			}
			if (arg0 == 5002) {
				anInt5223 -= 2;
				local75 = aStringArray22[anInt5223];
				local81 = aStringArray22[anInt5223 + 1];
				anInt5226 -= 2;
				local89 = anIntArray326[anInt5226];
				local95 = anIntArray326[anInt5226 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static415.method5995(Static96.aClass236_16);
				Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(local75) + Static52.method1102(local81) + 2);
				Static164.aClass5_Sub3_Sub1_2.method4208(local75);
				Static164.aClass5_Sub3_Sub1_2.method4192(local89 - 1);
				Static164.aClass5_Sub3_Sub1_2.method4192(local95);
				Static164.aClass5_Sub3_Sub1_2.method4208(local81);
				return;
			}
			@Pc(161) Class14 local161;
			if (arg0 == 5003) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local163 = "";
				if (local161 != null && local161.aString13 != null) {
					local163 = local161.aString13;
				}
				aStringArray22[anInt5223++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt407;
				}
				anIntArray326[anInt5226++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static439.aClass127_10 == null) {
					anIntArray326[anInt5226++] = -1;
					return;
				}
				anIntArray326[anInt5226++] = Static439.aClass127_10.anInt3507;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = aStringArray22[--anInt5223];
				method4401(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5223 -= 2;
				local75 = aStringArray22[anInt5223];
				local81 = aStringArray22[anInt5223 + 1];
				if (Static137.anInt1383 != 0 || (!Static260.aBoolean605 || Static143.aBoolean200) && !Static411.aBoolean519) {
					Static415.method5995(Static450.aClass236_76);
					Static164.aClass5_Sub3_Sub1_2.method4192(0);
					local89 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
					Static164.aClass5_Sub3_Sub1_2.method4208(local75);
					Static139.method2599(Static164.aClass5_Sub3_Sub1_2, local81);
					Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local163 = "";
				if (local161 != null && local161.aString11 != null) {
					local163 = local161.aString11;
				}
				aStringArray22[anInt5223++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local163 = "";
				if (local161 != null && local161.aString12 != null) {
					local163 = local161.aString12;
				}
				aStringArray22[anInt5223++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt408;
				}
				anIntArray326[anInt5226++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static35.aClass15_Sub2_Sub1_Sub1_1 == null || Static35.aClass15_Sub2_Sub1_Sub1_1.aString19 == null) {
					local75 = Static17.aString14;
				} else {
					local75 = Static35.aClass15_Sub2_Sub1_Sub1_1.method806();
				}
				aStringArray22[anInt5223++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray326[anInt5226++] = Static450.anInt7828;
				return;
			}
			if (arg0 == 5017) {
				anIntArray326[anInt5226++] = Static423.method6074();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt406;
				}
				anIntArray326[anInt5226++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local163 = "";
				if (local161 != null && local161.aString10 != null) {
					local163 = local161.aString10;
				}
				aStringArray22[anInt5223++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static35.aClass15_Sub2_Sub1_Sub1_1 == null || Static35.aClass15_Sub2_Sub1_Sub1_1.aString19 == null) {
					local75 = Static17.aString14;
				} else {
					local75 = Static35.aClass15_Sub2_Sub1_Sub1_1.method802();
				}
				aStringArray22[anInt5223++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt405;
				}
				anIntArray326[anInt5226++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray326[--anInt5226];
				local161 = Static451.method6359(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt409;
				}
				anIntArray326[anInt5226++] = local89;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray326[--anInt5226];
				aStringArray22[anInt5223++] = Static110.aClass180_2.method4495(local157).aString29;
				return;
			}
			@Pc(651) Class5_Sub2_Sub9 local651;
			if (arg0 == 5051) {
				local157 = anIntArray326[--anInt5226];
				local651 = Static110.aClass180_2.method4495(local157);
				if (local651.anIntArray180 == null) {
					anIntArray326[anInt5226++] = 0;
					return;
				}
				anIntArray326[anInt5226++] = local651.anIntArray180.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				@Pc(696) Class5_Sub2_Sub9 local696 = Static110.aClass180_2.method4495(local157);
				local95 = local696.anIntArray180[local691];
				anIntArray326[anInt5226++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray326[--anInt5226];
				local651 = Static110.aClass180_2.method4495(local157);
				if (local651.anIntArray181 == null) {
					anIntArray326[anInt5226++] = 0;
					return;
				}
				anIntArray326[anInt5226++] = local651.anIntArray181.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				anIntArray326[anInt5226++] = Static110.aClass180_2.method4495(local157).anIntArray181[local691];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray326[--anInt5226];
				aStringArray22[anInt5223++] = Static166.aClass278_2.method6455(local157).method2003();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray326[--anInt5226];
				@Pc(822) Class5_Sub2_Sub10 local822 = Static166.aClass278_2.method6455(local157);
				if (local822.anIntArray188 == null) {
					anIntArray326[anInt5226++] = 0;
					return;
				}
				anIntArray326[anInt5226++] = local822.anIntArray188.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				anIntArray326[anInt5226++] = Static166.aClass278_2.method6455(local157).anIntArray188[local691];
				return;
			}
			if (arg0 == 5058) {
				aClass26_1 = new Class26();
				aClass26_1.anInt642 = anIntArray326[--anInt5226];
				aClass26_1.aClass5_Sub2_Sub10_1 = Static166.aClass278_2.method6455(aClass26_1.anInt642);
				aClass26_1.anIntArray49 = new int[aClass26_1.aClass5_Sub2_Sub10_1.method1997()];
				return;
			}
			if (arg0 == 5059) {
				Static415.method5995(Static438.aClass236_72);
				Static164.aClass5_Sub3_Sub1_2.method4192(0);
				local157 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
				Static164.aClass5_Sub3_Sub1_2.method4192(0);
				Static164.aClass5_Sub3_Sub1_2.method4181(aClass26_1.anInt642);
				aClass26_1.aClass5_Sub2_Sub10_1.method1995(aClass26_1.anIntArray49, Static164.aClass5_Sub3_Sub1_2);
				Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray22[--anInt5223];
				Static415.method5995(Static409.aClass236_66);
				Static164.aClass5_Sub3_Sub1_2.method4192(0);
				local691 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
				Static164.aClass5_Sub3_Sub1_2.method4208(local75);
				Static164.aClass5_Sub3_Sub1_2.method4181(aClass26_1.anInt642);
				aClass26_1.aClass5_Sub2_Sub10_1.method1995(aClass26_1.anIntArray49, Static164.aClass5_Sub3_Sub1_2);
				Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local691);
				return;
			}
			if (arg0 == 5061) {
				Static415.method5995(Static438.aClass236_72);
				Static164.aClass5_Sub3_Sub1_2.method4192(0);
				local157 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
				Static164.aClass5_Sub3_Sub1_2.method4192(1);
				Static164.aClass5_Sub3_Sub1_2.method4181(aClass26_1.anInt642);
				aClass26_1.aClass5_Sub2_Sub10_1.method1995(aClass26_1.anIntArray49, Static164.aClass5_Sub3_Sub1_2);
				Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				anIntArray326[anInt5226++] = Static110.aClass180_2.method4495(local157).aCharArray3[local691];
				return;
			}
			if (arg0 == 5063) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				anIntArray326[anInt5226++] = Static110.aClass180_2.method4495(local157).aCharArray2[local691];
				return;
			}
			if (arg0 == 5064) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				if (local691 == -1) {
					anIntArray326[anInt5226++] = -1;
					return;
				}
				anIntArray326[anInt5226++] = Static110.aClass180_2.method4495(local157).method1975((char) local691);
				return;
			}
			if (arg0 == 5065) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				if (local691 == -1) {
					anIntArray326[anInt5226++] = -1;
					return;
				}
				anIntArray326[anInt5226++] = Static110.aClass180_2.method4495(local157).method1980((char) local691);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray326[--anInt5226];
				anIntArray326[anInt5226++] = Static166.aClass278_2.method6455(local157).method1997();
				return;
			}
			if (arg0 == 5067) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				local89 = Static166.aClass278_2.method6455(local157).method1994(local691).anInt4062;
				anIntArray326[anInt5226++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				aClass26_1.anIntArray49[local157] = local691;
				return;
			}
			if (arg0 == 5069) {
				anInt5226 -= 2;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				aClass26_1.anIntArray49[local157] = local691;
				return;
			}
			if (arg0 == 5070) {
				anInt5226 -= 3;
				local157 = anIntArray326[anInt5226];
				local691 = anIntArray326[anInt5226 + 1];
				local89 = anIntArray326[anInt5226 + 2];
				@Pc(1327) Class5_Sub2_Sub10 local1327 = Static166.aClass278_2.method6455(local157);
				if (local1327.method1994(local691).anInt4062 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray326[anInt5226++] = local1327.method2001(local89, local691);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray22[--anInt5223];
				local1375 = anIntArray326[--anInt5226] == 1;
				Static518.method7128(local75, local1375);
				anIntArray326[anInt5226++] = Static273.anInt5367;
				return;
			}
			if (arg0 == 5072) {
				if (Static235.aShortArray46 != null && Static265.anInt5240 < Static273.anInt5367) {
					anIntArray326[anInt5226++] = Static235.aShortArray46[Static265.anInt5240++] & 0xFFFF;
					return;
				}
				anIntArray326[anInt5226++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static265.anInt5240 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static59.aClass18_1.method5977(86)) {
					anIntArray326[anInt5226++] = 1;
					return;
				}
				anIntArray326[anInt5226++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static59.aClass18_1.method5977(82)) {
					anIntArray326[anInt5226++] = 1;
					return;
				}
				anIntArray326[anInt5226++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static59.aClass18_1.method5977(81)) {
					anIntArray326[anInt5226++] = 1;
					return;
				}
				anIntArray326[anInt5226++] = 0;
				return;
			}
		} else {
			@Pc(2712) int local2712;
			@Pc(1986) boolean local1986;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static377.method5649(anIntArray326[--anInt5226]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray326[anInt5226++] = Static365.method5576();
					return;
				}
				if (arg0 == 5205) {
					Static272.method4490(-1, -1, false, anIntArray326[--anInt5226]);
					return;
				}
				@Pc(1575) Class5_Sub2_Sub5 local1575;
				if (arg0 == 5206) {
					local157 = anIntArray326[--anInt5226];
					local1575 = Static245.method5947(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1575 == null) {
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = local1575.anInt888;
					return;
				}
				@Pc(1608) Class5_Sub2_Sub5 local1608;
				if (arg0 == 5207) {
					local1608 = Static245.method5949(anIntArray326[--anInt5226]);
					if (local1608 != null && local1608.aString21 != null) {
						aStringArray22[anInt5223++] = local1608.aString21;
						return;
					}
					aStringArray22[anInt5223++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray326[anInt5226++] = Static469.anInt8088;
					anIntArray326[anInt5226++] = Static214.anInt4061;
					return;
				}
				if (arg0 == 5209) {
					anIntArray326[anInt5226++] = Static435.anInt7668 + Static245.anInt7314;
					anIntArray326[anInt5226++] = Static489.anInt8411 + Static245.anInt7315;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray326[--anInt5226];
					local1575 = Static245.method5949(local157);
					if (local1575 == null) {
						anIntArray326[anInt5226++] = 0;
						anIntArray326[anInt5226++] = 0;
						return;
					}
					anIntArray326[anInt5226++] = local1575.anInt876 >> 14 & 0x3FFF;
					anIntArray326[anInt5226++] = local1575.anInt876 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray326[--anInt5226];
					local1575 = Static245.method5949(local157);
					if (local1575 == null) {
						anIntArray326[anInt5226++] = 0;
						anIntArray326[anInt5226++] = 0;
						return;
					}
					anIntArray326[anInt5226++] = local1575.anInt886 - local1575.anInt880;
					anIntArray326[anInt5226++] = local1575.anInt882 - local1575.anInt878;
					return;
				}
				@Pc(1798) Class5_Sub18 local1798;
				if (arg0 == 5212) {
					local1798 = Static168.method5835();
					if (local1798 == null) {
						anIntArray326[anInt5226++] = -1;
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = local1798.anInt3138;
					local691 = local1798.anInt3136 << 28 | local1798.anInt3137 + Static245.anInt7314 << 14 | local1798.anInt3144 + Static245.anInt7315;
					anIntArray326[anInt5226++] = local691;
					return;
				}
				if (arg0 == 5213) {
					local1798 = Static298.method4946();
					if (local1798 == null) {
						anIntArray326[anInt5226++] = -1;
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = local1798.anInt3138;
					local691 = local1798.anInt3136 << 28 | local1798.anInt3137 + Static245.anInt7314 << 14 | local1798.anInt3144 + Static245.anInt7315;
					anIntArray326[anInt5226++] = local691;
					return;
				}
				@Pc(1946) boolean local1946;
				if (arg0 == 5214) {
					local157 = anIntArray326[--anInt5226];
					local1575 = Static47.method1047();
					if (local1575 != null) {
						local1946 = local1575.method822(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray327);
						if (local1946) {
							Static145.method2742(anIntArray327[2], anIntArray327[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					@Pc(1984) Class187 local1984 = Static245.method5963(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1986 = false;
					for (@Pc(1991) Class5_Sub2_Sub5 local1991 = (Class5_Sub2_Sub5) local1984.method4805(); local1991 != null; local1991 = (Class5_Sub2_Sub5) local1984.method4810()) {
						if (local1991.anInt888 == local691) {
							local1986 = true;
							break;
						}
					}
					if (local1986) {
						anIntArray326[anInt5226++] = 1;
						return;
					}
					anIntArray326[anInt5226++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray326[--anInt5226];
					local1575 = Static245.method5949(local157);
					if (local1575 == null) {
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = local1575.anInt889;
					return;
				}
				if (arg0 == 5220) {
					anIntArray326[anInt5226++] = Static213.anInt4055 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray326[--anInt5226];
					Static145.method2742(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1608 = Static47.method1047();
					if (local1608 != null) {
						local1375 = local1608.method826(Static435.anInt7668 + Static245.anInt7314, Static489.anInt8411 + Static245.anInt7315, anIntArray327);
						if (local1375) {
							anIntArray326[anInt5226++] = anIntArray327[1];
							anIntArray326[anInt5226++] = anIntArray327[2];
							return;
						}
						anIntArray326[anInt5226++] = -1;
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = -1;
					anIntArray326[anInt5226++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					Static272.method4490(local691 & 0x3FFF, local691 >> 14 & 0x3FFF, false, local157);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray326[--anInt5226];
					local1575 = Static47.method1047();
					if (local1575 != null) {
						local1946 = local1575.method822(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray327);
						if (local1946) {
							anIntArray326[anInt5226++] = anIntArray327[1];
							anIntArray326[anInt5226++] = anIntArray327[2];
							return;
						}
						anIntArray326[anInt5226++] = -1;
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = -1;
					anIntArray326[anInt5226++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray326[--anInt5226];
					local1575 = Static47.method1047();
					if (local1575 != null) {
						local1946 = local1575.method826(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray327);
						if (local1946) {
							anIntArray326[anInt5226++] = anIntArray327[1];
							anIntArray326[anInt5226++] = anIntArray327[2];
							return;
						}
						anIntArray326[anInt5226++] = -1;
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = -1;
					anIntArray326[anInt5226++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static307.method5027(anIntArray326[--anInt5226]);
					return;
				}
				if (arg0 == 5227) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					Static272.method4490(local691 & 0x3FFF, local691 >> 14 & 0x3FFF, true, local157);
					return;
				}
				if (arg0 == 5228) {
					Static325.aBoolean426 = anIntArray326[--anInt5226] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray326[anInt5226++] = Static325.aBoolean426 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray326[--anInt5226];
					Static461.method6411(local157);
					return;
				}
				@Pc(2504) Class5 local2504;
				if (arg0 == 5231) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local1375 = anIntArray326[anInt5226 + 1] == 1;
					if (Static445.aClass42_33 != null) {
						local2504 = Static445.aClass42_33.method1109((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7425();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class5();
							Static445.aClass42_33.method1106((long) local157, local2504);
						}
					}
					return;
				}
				@Pc(2546) Class5 local2546;
				if (arg0 == 5232) {
					local157 = anIntArray326[--anInt5226];
					if (Static445.aClass42_33 != null) {
						local2546 = Static445.aClass42_33.method1109((long) local157);
						anIntArray326[anInt5226++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray326[anInt5226++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local1375 = anIntArray326[anInt5226 + 1] == 1;
					if (Static142.aClass42_9 != null) {
						local2504 = Static142.aClass42_9.method1109((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7425();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class5();
							Static142.aClass42_9.method1106((long) local157, local2504);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray326[--anInt5226];
					if (Static142.aClass42_9 != null) {
						local2546 = Static142.aClass42_9.method1109((long) local157);
						anIntArray326[anInt5226++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray326[anInt5226++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray326[anInt5226++] = Static245.aClass5_Sub2_Sub5_3 == null ? -1 : Static245.aClass5_Sub2_Sub5_3.anInt888;
					return;
				}
				if (arg0 == 5236) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = local691 >> 14 & 0x3FFF;
					local95 = local691 & 0x3FFF;
					local2712 = Static453.method6366(local157, local89, local95);
					if (local2712 < 0) {
						anIntArray326[anInt5226++] = -1;
						return;
					}
					anIntArray326[anInt5226++] = local2712;
					return;
				}
				if (arg0 == 5237) {
					Static162.method2906();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					Static302.method4984(local157, local691, false, 3);
					anIntArray326[anInt5226++] = Static254.aFrame32 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static254.aFrame32 != null) {
						Static302.method4984(-1, -1, false, Static300.aClass5_Sub28_Sub1_1.anInt4891);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2796) Class196[] local2796 = Static71.method4213();
					anIntArray326[anInt5226++] = local2796.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray326[--anInt5226];
					@Pc(2820) Class196[] local2820 = Static71.method4213();
					anIntArray326[anInt5226++] = local2820[local157].anInt6049;
					anIntArray326[anInt5226++] = local2820[local157].anInt6050;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static300.aClass5_Sub28_Sub1_1.anInt4888;
					local691 = Static300.aClass5_Sub28_Sub1_1.anInt4890;
					local89 = -1;
					@Pc(2857) Class196[] local2857 = Static71.method4213();
					for (local2712 = 0; local2712 < local2857.length; local2712++) {
						@Pc(2864) Class196 local2864 = local2857[local2712];
						if (local2864.anInt6049 == local157 && local2864.anInt6050 == local691) {
							local89 = local2712;
							break;
						}
					}
					anIntArray326[anInt5226++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray326[anInt5226++] = Static503.method6935();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray326[--anInt5226];
					if (local157 >= 1 && local157 <= 2) {
						Static302.method4984(-1, -1, false, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4891;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray326[--anInt5226];
					if (local157 >= 1 && local157 <= 2) {
						Static300.aClass5_Sub28_Sub1_1.anInt4891 = local157;
						Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt5223 -= 2;
					local75 = aStringArray22[anInt5223];
					local81 = aStringArray22[anInt5223 + 1];
					local89 = anIntArray326[--anInt5226];
					Static415.method5995(Static388.aClass236_61);
					Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(local75) + Static52.method1102(local81) + 1);
					Static164.aClass5_Sub3_Sub1_2.method4208(local75);
					Static164.aClass5_Sub3_Sub1_2.method4208(local81);
					Static164.aClass5_Sub3_Sub1_2.method4192(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt5226 -= 2;
					Static382.aShortArray110[anIntArray326[anInt5226]] = (short) Static441.method6250(anIntArray326[anInt5226 + 1]);
					Static451.aClass67_2.method2004();
					Static451.aClass67_2.method2008();
					Static204.aClass282_1.method6599();
					Static544.method2108();
					return;
				}
				if (arg0 == 5405) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static438.anIntArrayArrayArray11[local157] = new int[local691 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt5226 -= 7;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1] << 1;
					local89 = anIntArray326[anInt5226 + 2];
					local95 = anIntArray326[anInt5226 + 3];
					local2712 = anIntArray326[anInt5226 + 4];
					@Pc(3132) int local3132 = anIntArray326[anInt5226 + 5];
					@Pc(3138) int local3138 = anIntArray326[anInt5226 + 6];
					if (local157 >= 0 && local157 < 2 && Static438.anIntArrayArrayArray11[local157] != null && local691 >= 0 && local691 < Static438.anIntArrayArrayArray11[local157].length) {
						Static438.anIntArrayArrayArray11[local157][local691] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3138 };
						Static438.anIntArrayArrayArray11[local157][local691 + 1] = new int[] { (local2712 >> 14 & 0x3FFF) << 7, local3132, (local2712 & 0x3FFF) << 7 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static438.anIntArrayArrayArray11[anIntArray326[--anInt5226]].length >> 1;
					anIntArray326[anInt5226++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static254.aFrame32 != null) {
						Static302.method4984(-1, -1, false, Static300.aClass5_Sub28_Sub1_1.anInt4891);
					}
					if (Static265.aFrame25 != null) {
						Static520.method7265();
						System.exit(0);
						return;
					}
					local75 = Static103.aString24 == null ? Static135.method2554() : Static103.aString24;
					Static459.method6390(Static159.aClass9_10, false, Static17.anInt459 == 1, local75);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static10.aClass83_3 != null) {
						if (Static10.aClass83_3.anObject8 == null) {
							local75 = Static17.method594(Static10.aClass83_3.anInt2494);
						} else {
							local75 = (String) Static10.aClass83_3.anObject8;
						}
					}
					aStringArray22[anInt5223++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray326[anInt5226++] = Static9.anInt148 == 3 ? 1 : 0;
					return;
				}
				if (arg0 == 5421) {
					if (Static254.aFrame32 != null) {
						Static302.method4984(-1, -1, false, Static300.aClass5_Sub28_Sub1_1.anInt4891);
					}
					local75 = aStringArray22[--anInt5223];
					local1375 = anIntArray326[--anInt5226] == 1;
					local163 = Static135.method2554() + local75;
					Static459.method6390(Static159.aClass9_10, local1375, Static17.anInt459 == 1, local163);
					return;
				}
				if (arg0 == 5422) {
					anInt5223 -= 2;
					local75 = aStringArray22[anInt5223];
					local81 = aStringArray22[anInt5223 + 1];
					local89 = anIntArray326[--anInt5226];
					if (local75.length() > 0) {
						if (Static75.aStringArray13 == null) {
							Static75.aStringArray13 = new String[Static4.anIntArray502[Static525.aClass155_4.anInt4200]];
						}
						Static75.aStringArray13[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static513.aStringArray38 == null) {
							Static513.aStringArray38 = new String[Static4.anIntArray502[Static525.aClass155_4.anInt4200]];
						}
						Static513.aStringArray38[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray22[--anInt5223]);
					return;
				}
				if (arg0 == 5424) {
					anInt5226 -= 11;
					Static151.anInt3120 = anIntArray326[anInt5226];
					Static413.anInt9078 = anIntArray326[anInt5226 + 1];
					Static458.anInt7887 = anIntArray326[anInt5226 + 2];
					Static373.anInt6911 = anIntArray326[anInt5226 + 3];
					Static247.anInt5009 = anIntArray326[anInt5226 + 4];
					Static460.anInt7895 = anIntArray326[anInt5226 + 5];
					Static106.anInt2329 = anIntArray326[anInt5226 + 6];
					Static215.anInt4065 = anIntArray326[anInt5226 + 7];
					Static93.anInt2150 = anIntArray326[anInt5226 + 8];
					Static275.anInt5378 = anIntArray326[anInt5226 + 9];
					Static65.anInt1249 = anIntArray326[anInt5226 + 10];
					Static533.aClass117_228.method2973(Static247.anInt5009);
					Static533.aClass117_228.method2973(Static460.anInt7895);
					Static533.aClass117_228.method2973(Static106.anInt2329);
					Static533.aClass117_228.method2973(Static215.anInt4065);
					Static533.aClass117_228.method2973(Static93.anInt2150);
					Static318.aClass25_16 = null;
					Static126.aClass25_25 = null;
					Static353.aClass25_20 = null;
					Static235.aClass25_14 = null;
					Static169.aClass25_8 = null;
					Static12.aClass25_1 = null;
					Static494.aClass25_26 = null;
					Static53.aClass25_4 = null;
					Static8.aBoolean8 = true;
					return;
				}
				if (arg0 == 5425) {
					Static393.method5726();
					Static8.aBoolean8 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt5226 -= 2;
					Static221.anInt4156 = anIntArray326[anInt5226];
					Static37.anInt895 = anIntArray326[anInt5226 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt5226 -= 2;
					Static502.anInt8572 = anIntArray326[anInt5226 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					anIntArray326[anInt5226++] = Static300.method4969(local691, local157) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static236.method4043(aStringArray22[--anInt5223], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static555.method5217(Static159.aClass9_10.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3667) Throwable local3667) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static555.method5217(Static159.aClass9_10.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3679) Throwable local3679) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt5226 -= 4;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					local95 = anIntArray326[anInt5226 + 3];
					Static259.method4373((local157 & 0x3FFF) - Static338.anInt6353, (local157 >> 14 & 0x3FFF) - Static515.anInt3214, local89, local95, false, local691);
					return;
				}
				if (arg0 == 5501) {
					anInt5226 -= 4;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					local95 = anIntArray326[anInt5226 + 3];
					Static410.method5972((local157 & 0x3FFF) - Static338.anInt6353, local89, local95, (local157 >> 14 & 0x3FFF) - Static515.anInt3214, local691);
					return;
				}
				if (arg0 == 5502) {
					anInt5226 -= 6;
					local157 = anIntArray326[anInt5226];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static93.anInt2151 = local157;
					local691 = anIntArray326[anInt5226 + 1];
					if (local691 + 1 >= Static438.anIntArrayArrayArray11[Static93.anInt2151].length >> 1) {
						throw new RuntimeException();
					}
					Static195.anInt3784 = local691;
					Static10.anInt155 = 0;
					Static26.anInt529 = anIntArray326[anInt5226 + 2];
					Static132.anInt2748 = anIntArray326[anInt5226 + 3];
					local89 = anIntArray326[anInt5226 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static466.anInt7999 = local89;
					local95 = anIntArray326[anInt5226 + 5];
					if (local95 + 1 >= Static438.anIntArrayArrayArray11[Static466.anInt7999].length >> 1) {
						throw new RuntimeException();
					}
					Static228.anInt4308 = local95;
					Static166.anInt3343 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static448.method6330();
					return;
				}
				if (arg0 == 5504) {
					anInt5226 -= 2;
					Static63.method1192(anIntArray326[anInt5226], anIntArray326[anInt5226 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray326[anInt5226++] = (int) Static535.aFloat364 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray326[anInt5226++] = (int) Static476.aFloat339 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static340.method5292();
					return;
				}
				if (arg0 == 5508) {
					Static121.method2298();
					return;
				}
				if (arg0 == 5509) {
					Static509.method6987();
					return;
				}
				if (arg0 == 5510) {
					Static240.method4085();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray326[--anInt5226];
					local691 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local691 -= Static515.anInt3214;
					if (local691 < 0) {
						local691 = 0;
					} else if (local691 >= Static460.anInt7894) {
						local691 = Static460.anInt7894;
					}
					local89 -= Static338.anInt6353;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static235.anInt4493) {
						local89 = Static235.anInt4493;
					}
					Static409.anInt7303 = (local691 << 7) + 64;
					Static433.anInt7633 = (local89 << 7) + 64;
					Static166.anInt3343 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static398.method5797();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt5223 -= 2;
					local75 = aStringArray22[anInt5223];
					local81 = aStringArray22[anInt5223 + 1];
					local89 = anIntArray326[--anInt5226];
					if (Static389.anInt7024 != 2) {
						return;
					}
					if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						Static17.aString14 = local75;
						Static469.aString73 = local81;
						Static523.anInt8857 = local89;
						Static287.method4831(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static410.method5973();
					return;
				}
				if (arg0 == 5602) {
					if (Static118.anInt2542 == 0) {
						Static415.anInt7356 = -2;
						Static126.anInt8434 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt5226 -= 4;
					if (Static389.anInt7024 != 2) {
						return;
					}
					if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						Static507.method6975(anIntArray326[anInt5226], anIntArray326[anInt5226 + 1], anIntArray326[anInt5226 + 3], anIntArray326[anInt5226 + 2]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt5223--;
					if (Static389.anInt7024 != 2) {
						return;
					}
					if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						Static341.method6474(Static525.method7179(aStringArray22[anInt5223]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt5223 -= 2;
					if (Static389.anInt7024 != 2) {
						return;
					}
					if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						Static101.method2097(Static525.method7179(aStringArray22[anInt5223]), aStringArray22[anInt5223 + 1], false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static83.anInt1578 == 0) {
						Static464.anInt7964 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray326[anInt5226++] = Static126.anInt8434;
					return;
				}
				if (arg0 == 5608) {
					anIntArray326[anInt5226++] = Static148.anInt3092;
					return;
				}
				if (arg0 == 5609) {
					anIntArray326[anInt5226++] = Static464.anInt7964;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray22[anInt5223++] = Static494.aStringArray36.length > local157 ? Static199.method3282(Static494.aStringArray36[local157]) : "";
					}
					Static494.aStringArray36 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray326[anInt5226++] = Static37.anInt891;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray326[--anInt5226];
					if (Static389.anInt7024 != 6) {
						return;
					}
					if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						if (client.lb != null) {
							client.lb.method4920();
							client.lb = null;
						}
						Static523.anInt8857 = local157;
						Static287.method4831(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray326[anInt5226++] = Static126.anInt8434;
					return;
				}
				if (arg0 == 5615) {
					anInt5223 -= 2;
					local75 = aStringArray22[anInt5223];
					local81 = aStringArray22[anInt5223 + 1];
					if (Static389.anInt7024 != 2) {
						return;
					}
					if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						if (client.lb != null) {
							client.lb.method4920();
							client.lb = null;
						}
						Static17.aString14 = local75;
						Static469.aString73 = local81;
						Static287.method4831(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static286.method4827(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray326[anInt5226++] = Static415.anInt7356;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray326[--anInt5226];
					Static510.method6990(local157, false);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray326[--anInt5226];
					Static510.method6990(local157, true);
					return;
				}
				if (arg0 == 5620) {
					Static463.method6459();
					if (Static125.aString32 != "" && Static125.aString32 != "") {
						anIntArray326[anInt5226++] = 1;
						return;
					}
					anIntArray326[anInt5226++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt5223 -= 2;
					if (Static389.anInt7024 != 2) {
						return;
					}
					if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						Static101.method2097(Static525.method7179(aStringArray22[anInt5223]), aStringArray22[anInt5223 + 1], true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4469) Class83 local4469 = Static159.aClass9_10.method293(false, "3");
					while (local4469.anInt2495 == 0) {
						Static213.method3465(1L);
					}
					if (local4469.anInt2495 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4489) Class97 local4489 = (Class97) local4469.anObject8;
					if (local4489.method2498().exists()) {
						@Pc(4499) Class5_Sub3 local4499 = new Class5_Sub3(50);
						try {
							local4489.method2497(local4499.aByteArray66, 0, 50);
						} catch (@Pc(4508) IOException local4508) {
						}
					}
					try {
						local4489.method2499();
						return;
					} catch (@Pc(4514) Exception local4514) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static291.aString59 != null) {
						anIntArray326[anInt5226++] = 1;
						return;
					}
					anIntArray326[anInt5226++] = 0;
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4878 = local157;
					Static27.method672();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6002) {
					Static300.aClass5_Sub28_Sub1_1.method4135(anIntArray326[--anInt5226] == 1);
					Static27.method672();
					Static112.method2231();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6003) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean336 = anIntArray326[--anInt5226] == 1;
					Static112.method2231();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6005) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean333 = anIntArray326[--anInt5226] == 1;
					Static27.method672();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6006) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean337 = anIntArray326[--anInt5226] == 1;
					Static110.aClass62_15.method7058(!Static300.aClass5_Sub28_Sub1_1.aBoolean337);
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6007) {
					Static300.aClass5_Sub28_Sub1_1.anInt4877 = anIntArray326[--anInt5226];
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6008) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean324 = anIntArray326[--anInt5226] == 1;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6009) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean326 = anIntArray326[--anInt5226] == 1;
					Static27.method672();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6010) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean340 = anIntArray326[--anInt5226] == 1;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static300.aClass5_Sub28_Sub1_1.method4112(Static17.anInt459, local157);
					Static27.method672();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6012) {
					Static300.aClass5_Sub28_Sub1_1.method4111(anIntArray326[--anInt5226] == 1, Static17.anInt459);
					Static507.method6976();
					Static81.method1438();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6014) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean330 = anIntArray326[--anInt5226] == 1;
					Static27.method672();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6015) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean339 = anIntArray326[--anInt5226] == 1;
					Static27.method672();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4872 = local157;
					Static77.method4915(Static17.anInt459);
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					return;
				}
				if (arg0 == 6017) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean338 = anIntArray326[--anInt5226] == 1;
					Static4.method5500();
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4871 = local157;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static300.aClass5_Sub28_Sub1_1.anInt4889) {
						if (Static300.aClass5_Sub28_Sub1_1.anInt4889 == 0 && Static161.anInt3277 != -1) {
							Static19.method6150(Static161.anInt3277, Static108.aClass117_61, local157);
							Static359.aBoolean477 = false;
						} else if (local157 == 0) {
							Static369.method5025();
							Static359.aBoolean477 = false;
						} else {
							Static184.method5420(local157);
						}
						Static300.aClass5_Sub28_Sub1_1.anInt4889 = local157;
					}
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4870 = local157;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6021) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean342 = anIntArray326[--anInt5226] == 1;
					Static112.method2231();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray326[--anInt5226];
					local1375 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static193.anInt3735 < 96) {
						local157 = 0;
						local1375 = true;
					}
					Static296.method4924(local157);
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					anIntArray326[anInt5226++] = local1375 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4873 = local157;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > Static509.method6985(Static193.anInt3735)) {
						local157 = 0;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4869 = local157;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static194.method3241(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean332 = anIntArray326[--anInt5226] != 0;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					return;
				}
				if (arg0 == 6029) {
					Static300.aClass5_Sub28_Sub1_1.anInt4877 = anIntArray326[--anInt5226];
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					return;
				}
				if (arg0 == 6030) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean328 = anIntArray326[--anInt5226] != 0;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static27.method672();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static77.method4915(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4887 = local157;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray326[--anInt5226];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static300.aClass5_Sub28_Sub1_1.anInt4868 = local157;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					return;
				}
				if (arg0 == 6034) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean327 = anIntArray326[--anInt5226] == 1;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static507.method6976();
					Static495.aBoolean612 = false;
					return;
				}
				if (arg0 == 6035) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean344 = anIntArray326[--anInt5226] == 1;
					Static27.method672();
					Static112.method2231();
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4878;
					return;
				}
				if (arg0 == 6102) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.method4120(Static17.anInt459) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean336 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean333 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean337 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4877;
					return;
				}
				if (arg0 == 6108) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean324 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean326 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean340 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459);
					return;
				}
				if (arg0 == 6112) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.method4113(Static17.anInt459) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean330 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean339 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4872;
					return;
				}
				if (arg0 == 6117) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean338 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4871;
					return;
				}
				if (arg0 == 6119) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4889;
					return;
				}
				if (arg0 == 6120) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4870;
					return;
				}
				if (arg0 == 6121) {
					anIntArray326[anInt5226++] = Static110.aClass62_15.method7023() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray326[anInt5226++] = Static337.method5257();
					return;
				}
				if (arg0 == 6124) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4873;
					return;
				}
				if (arg0 == 6125) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4869;
					return;
				}
				if (arg0 == 6126) {
					anIntArray326[anInt5226++] = Static110.aClass62_15.method7050() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean335 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean332 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4877;
					return;
				}
				if (arg0 == 6130) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean328 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray326[anInt5226++] = Static17.anInt459;
					return;
				}
				if (arg0 == 6132) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4887;
					return;
				}
				if (arg0 == 6133) {
					anIntArray326[anInt5226++] = Static9.anInt148 == 1 || Static9.anInt148 == 4 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray326[anInt5226++] = Static509.method6985(Static193.anInt3735);
					return;
				}
				if (arg0 == 6135) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4868;
					return;
				}
				if (arg0 == 6136) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean327 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(5927) boolean local5927 = true;
					try {
						local5927 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(5937) Throwable local5937) {
					}
					anIntArray326[anInt5226++] = local5927 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt5226 -= 2;
					Static261.aShort68 = (short) anIntArray326[anInt5226];
					if (Static261.aShort68 <= 0) {
						Static261.aShort68 = 256;
					}
					Static459.aShort101 = (short) anIntArray326[anInt5226 + 1];
					if (Static459.aShort101 <= 0) {
						Static459.aShort101 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt5226 -= 2;
					Static537.aShort117 = (short) anIntArray326[anInt5226];
					if (Static537.aShort117 <= 0) {
						Static537.aShort117 = 256;
					}
					Static44.aShort15 = (short) anIntArray326[anInt5226 + 1];
					if (Static44.aShort15 <= 0) {
						Static44.aShort15 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt5226 -= 4;
					Static26.aShort2 = (short) anIntArray326[anInt5226];
					if (Static26.aShort2 <= 0) {
						Static26.aShort2 = 1;
					}
					Static381.aShort89 = (short) anIntArray326[anInt5226 + 1];
					if (Static381.aShort89 <= 0) {
						Static381.aShort89 = 32767;
					} else if (Static381.aShort89 < Static26.aShort2) {
						Static381.aShort89 = Static26.aShort2;
					}
					Static435.aShort98 = (short) anIntArray326[anInt5226 + 2];
					if (Static435.aShort98 <= 0) {
						Static435.aShort98 = 1;
					}
					Static137.aShort38 = (short) anIntArray326[anInt5226 + 3];
					if (Static137.aShort38 <= 0) {
						Static137.aShort38 = 32767;
						return;
					}
					if (Static137.aShort38 < Static435.aShort98) {
						Static137.aShort38 = Static435.aShort98;
					}
					return;
				}
				if (arg0 == 6203) {
					Static155.method2830(Static24.aClass220_9.anInt6627, 0, 0, false, Static24.aClass220_9.anInt6681);
					anIntArray326[anInt5226++] = Static482.anInt8344;
					anIntArray326[anInt5226++] = Static540.anInt9077;
					return;
				}
				if (arg0 == 6204) {
					anIntArray326[anInt5226++] = Static537.aShort117;
					anIntArray326[anInt5226++] = Static44.aShort15;
					return;
				}
				if (arg0 == 6205) {
					anIntArray326[anInt5226++] = Static261.aShort68;
					anIntArray326[anInt5226++] = Static459.aShort101;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray326[anInt5226++] = (int) (Static105.method2132() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray326[anInt5226++] = (int) (Static105.method2132() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					aCalendar3.clear();
					aCalendar3.set(11, 12);
					aCalendar3.set(local89, local691, local157);
					local95 = (int) (aCalendar3.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray326[anInt5226++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar3.clear();
					aCalendar3.setTime(new Date(Static105.method2132()));
					anIntArray326[anInt5226++] = aCalendar3.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray326[--anInt5226];
					local1375 = true;
					if (local157 < 0) {
						local1375 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1375 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1375 = false;
					} else if (local157 % 100 != 0) {
						local1375 = true;
					} else if (local157 % 400 != 0) {
						local1375 = false;
					}
					anIntArray326[anInt5226++] = local1375 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray326[anInt5226++] = Static468.method6570() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray326[anInt5226++] = Static159.method2891() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static389.anInt7024 == 6 && Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						if (Static248.aBoolean407) {
							anIntArray326[anInt5226++] = 0;
							return;
						}
						if (Static361.aLong183 > Static105.method2132() - 1000L) {
							anIntArray326[anInt5226++] = 1;
							return;
						}
						Static248.aBoolean407 = true;
						Static415.method5995(Static331.aClass236_55);
						Static164.aClass5_Sub3_Sub1_2.method4184(Static299.anInt5951);
						anIntArray326[anInt5226++] = 0;
						return;
					}
					anIntArray326[anInt5226++] = 1;
					return;
				}
				@Pc(6470) Class195 local6470;
				@Pc(6437) Class35_Sub1 local6437;
				if (arg0 == 6501) {
					local6437 = Static62.method6705();
					if (local6437 != null) {
						anIntArray326[anInt5226++] = local6437.anInt1002;
						anIntArray326[anInt5226++] = local6437.anInt998;
						aStringArray22[anInt5223++] = local6437.aString25;
						local6470 = local6437.method912();
						anIntArray326[anInt5226++] = local6470.anInt5995;
						aStringArray22[anInt5223++] = local6470.aString60;
						anIntArray326[anInt5226++] = local6437.anInt990;
						anIntArray326[anInt5226++] = local6437.anInt999;
						aStringArray22[anInt5223++] = local6437.aString26;
						return;
					}
					anIntArray326[anInt5226++] = -1;
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					anIntArray326[anInt5226++] = 0;
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6437 = Static112.method2221();
					if (local6437 != null) {
						anIntArray326[anInt5226++] = local6437.anInt1002;
						anIntArray326[anInt5226++] = local6437.anInt998;
						aStringArray22[anInt5223++] = local6437.aString25;
						local6470 = local6437.method912();
						anIntArray326[anInt5226++] = local6470.anInt5995;
						aStringArray22[anInt5223++] = local6470.aString60;
						anIntArray326[anInt5226++] = local6437.anInt990;
						anIntArray326[anInt5226++] = local6437.anInt999;
						aStringArray22[anInt5223++] = local6437.aString26;
						return;
					}
					anIntArray326[anInt5226++] = -1;
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					anIntArray326[anInt5226++] = 0;
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray326[--anInt5226];
					local81 = aStringArray22[--anInt5223];
					if (Static389.anInt7024 == 6 && Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
						anIntArray326[anInt5226++] = Static139.method2597(local81, local157) ? 1 : 0;
						return;
					}
					anIntArray326[anInt5226++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static300.aClass5_Sub28_Sub1_1.anInt4875 = anIntArray326[--anInt5226];
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					return;
				}
				if (arg0 == 6505) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4875;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray326[--anInt5226];
					@Pc(6827) Class35_Sub1 local6827 = Static3.method208(local157);
					if (local6827 != null) {
						anIntArray326[anInt5226++] = local6827.anInt998;
						aStringArray22[anInt5223++] = local6827.aString25;
						@Pc(6851) Class195 local6851 = local6827.method912();
						anIntArray326[anInt5226++] = local6851.anInt5995;
						aStringArray22[anInt5223++] = local6851.aString60;
						anIntArray326[anInt5226++] = local6827.anInt990;
						anIntArray326[anInt5226++] = local6827.anInt999;
						aStringArray22[anInt5223++] = local6827.aString26;
						return;
					}
					anIntArray326[anInt5226++] = -1;
					aStringArray22[anInt5223++] = "";
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					anIntArray326[anInt5226++] = 0;
					anIntArray326[anInt5226++] = 0;
					aStringArray22[anInt5223++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt5226 -= 4;
					local157 = anIntArray326[anInt5226];
					local1375 = anIntArray326[anInt5226 + 1] == 1;
					local89 = anIntArray326[anInt5226 + 2];
					local1986 = anIntArray326[anInt5226 + 3] == 1;
					Static520.method7268(local89, local1375, local1986, local157);
					return;
				}
				if (arg0 == 6508) {
					Static199.method3284();
					return;
				}
				if (arg0 == 6509) {
					if (Static389.anInt7024 != 6) {
						return;
					}
					Static264.aBoolean363 = anIntArray326[--anInt5226] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray326[anInt5226++] = Static252.anInt5081;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static300.aClass5_Sub28_Sub1_1.aBoolean334 = anIntArray326[--anInt5226] == 1;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					return;
				}
				if (arg0 == 6601) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.aBoolean334 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static449.aClass125_4 == Static108.aClass125_1) {
				if (arg0 == 6700) {
					local157 = Static307.aClass42_24.method1111();
					if (Static395.anInt7085 != -1) {
						local157++;
					}
					anIntArray326[anInt5226++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray326[--anInt5226];
					if (Static395.anInt7085 != -1) {
						if (local157 == 0) {
							anIntArray326[anInt5226++] = Static395.anInt7085;
							return;
						}
						local157--;
					}
					@Pc(7138) Class5_Sub43 local7138 = (Class5_Sub43) Static307.aClass42_24.method1103();
					while (local157-- > 0) {
						local7138 = (Class5_Sub43) Static307.aClass42_24.method1105();
					}
					anIntArray326[anInt5226++] = local7138.anInt7801;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray326[--anInt5226];
					if (Static139.aClass220ArrayArray1[local157] == null) {
						aStringArray22[anInt5223++] = "";
						return;
					}
					local81 = Static139.aClass220ArrayArray1[local157][0].aString64;
					if (local81 == null) {
						aStringArray22[anInt5223++] = "";
						return;
					}
					aStringArray22[anInt5223++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray326[--anInt5226];
					if (Static139.aClass220ArrayArray1[local157] == null) {
						anIntArray326[anInt5226++] = 0;
						return;
					}
					anIntArray326[anInt5226++] = Static139.aClass220ArrayArray1[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					if (Static139.aClass220ArrayArray1[local157] == null) {
						aStringArray22[anInt5223++] = "";
						return;
					}
					local163 = Static139.aClass220ArrayArray1[local157][local691].aString64;
					if (local163 == null) {
						aStringArray22[anInt5223++] = "";
						return;
					}
					aStringArray22[anInt5223++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					if (Static139.aClass220ArrayArray1[local157] == null) {
						anIntArray326[anInt5226++] = 0;
						return;
					}
					anIntArray326[anInt5226++] = Static139.aClass220ArrayArray1[local157][local691].anInt6647;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 1);
					return;
				}
				if (arg0 == 6708) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 2);
					return;
				}
				if (arg0 == 6709) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 3);
					return;
				}
				if (arg0 == 6710) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 4);
					return;
				}
				if (arg0 == 6711) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 5);
					return;
				}
				if (arg0 == 6712) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 6);
					return;
				}
				if (arg0 == 6713) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 7);
					return;
				}
				if (arg0 == 6714) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 8);
					return;
				}
				if (arg0 == 6715) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 9);
					return;
				}
				if (arg0 == 6716) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					Static307.method5028(local157 << 16 | local691, local89, "", 10);
					return;
				}
				if (arg0 == 6717) {
					anInt5226 -= 3;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					local89 = anIntArray326[anInt5226 + 2];
					@Pc(7726) Class220 local7726 = Static485.method6724(local89, local157 << 16 | local691);
					Static187.method3151();
					@Pc(7731) Class5_Sub11 local7731 = Static68.method1303(local7726);
					Static121.method2295(local7726, local7731.method1953(), local7731.anInt2105);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(7759) Class101 local7759;
				if (arg0 == 6800) {
					local157 = anIntArray326[--anInt5226];
					local7759 = Static358.aClass246_3.method5847(local157);
					if (local7759.aString34 == null) {
						aStringArray22[anInt5223++] = "";
						return;
					}
					aStringArray22[anInt5223++] = local7759.aString34;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray326[--anInt5226];
					local7759 = Static358.aClass246_3.method5847(local157);
					anIntArray326[anInt5226++] = local7759.anInt2867;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray326[--anInt5226];
					local7759 = Static358.aClass246_3.method5847(local157);
					anIntArray326[anInt5226++] = local7759.anInt2878;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray326[--anInt5226];
					local7759 = Static358.aClass246_3.method5847(local157);
					anIntArray326[anInt5226++] = local7759.anInt2886;
					return;
				}
				if (arg0 == 6804) {
					anInt5226 -= 2;
					local157 = anIntArray326[anInt5226];
					local691 = anIntArray326[anInt5226 + 1];
					@Pc(7881) Class135 local7881 = Static216.aClass298_11.method6969(local691);
					if (local7881.method3275()) {
						aStringArray22[anInt5223++] = Static358.aClass246_3.method5847(local157).method2601(local7881.aString38, local691);
						return;
					}
					anIntArray326[anInt5226++] = Static358.aClass246_3.method5847(local157).method2605(local7881.anInt3793, local691);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray326[anInt5226++] = Static260.aBoolean605 && !Static143.aBoolean200 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray326[anInt5226++] = Static52.anInt1136;
					return;
				}
				if (arg0 == 6902) {
					anIntArray326[anInt5226++] = Static194.anInt3739;
					return;
				}
				if (arg0 == 6903) {
					anIntArray326[anInt5226++] = Static273.anInt5366;
					return;
				}
				if (arg0 == 6904) {
					anIntArray326[anInt5226++] = Static192.anInt3699;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static10.aClass83_3 != null) {
						if (Static10.aClass83_3.anObject8 == null) {
							local75 = Static17.method594(Static10.aClass83_3.anInt2494);
						} else {
							local75 = (String) Static10.aClass83_3.anObject8;
						}
					}
					aStringArray22[anInt5223++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray326[anInt5226++] = Static291.anInt5878;
					return;
				}
				if (arg0 == 6907) {
					anIntArray326[anInt5226++] = Static7.anInt139;
					return;
				}
				if (arg0 == 6908) {
					anIntArray326[anInt5226++] = Static275.anInt5377;
					return;
				}
				if (arg0 == 6909) {
					anIntArray326[anInt5226++] = Static186.aBoolean219 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray326[anInt5226++] = Static364.anInt6810;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static300.aClass5_Sub28_Sub1_1.method4134();
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4895 = Static17.anInt459;
					anIntArray326[anInt5226++] = local157;
					Static27.method672();
					return;
				}
				if (arg0 == 7001) {
					Static300.aClass5_Sub28_Sub1_1.method4122();
					Static27.method672();
					return;
				}
				if (arg0 == 7002) {
					Static300.aClass5_Sub28_Sub1_1.method4119();
					Static27.method672();
					return;
				}
				if (arg0 == 7003) {
					Static300.aClass5_Sub28_Sub1_1.method4127();
					Static27.method672();
					return;
				}
				if (arg0 == 7004) {
					Static300.aClass5_Sub28_Sub1_1.method4124();
					Static27.method672();
					return;
				}
				if (arg0 == 7005) {
					Static300.aClass5_Sub28_Sub1_1.anInt4874 = 0;
					return;
				}
				if (arg0 == 7006) {
					if (Static300.aClass5_Sub28_Sub1_1.anInt4895 == 2) {
						Static300.aClass5_Sub28_Sub1_1.aBoolean345 = true;
						return;
					}
					if (Static300.aClass5_Sub28_Sub1_1.anInt4895 == 1) {
						Static300.aClass5_Sub28_Sub1_1.aBoolean343 = true;
						return;
					}
					if (Static300.aClass5_Sub28_Sub1_1.anInt4895 == 3) {
						Static300.aClass5_Sub28_Sub1_1.aBoolean346 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray326[anInt5226++] = Static300.aClass5_Sub28_Sub1_1.anInt4874;
					return;
				}
				if (arg0 == 7008) {
					if (Static17.anInt459 == 0 && Static193.anInt3735 < 96) {
						anIntArray326[anInt5226++] = 2;
						return;
					}
					anIntArray326[anInt5226++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
	public static void method4400() {
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4401(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static137.anInt1383 == 0 && (Static260.aBoolean605 && !Static143.aBoolean200 || Static411.aBoolean519)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static113.aClass40_36.method1063(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static113.aClass40_36.method1063(0).length());
		} else if (local11.startsWith(Static140.aClass40_41.method1063(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static140.aClass40_41.method1063(0).length());
		} else if (local11.startsWith(Static449.aClass40_128.method1063(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static449.aClass40_128.method1063(0).length());
		} else if (local11.startsWith(Static219.aClass40_65.method1063(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static219.aClass40_65.method1063(0).length());
		} else if (local11.startsWith(Static308.aClass40_92.method1063(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static308.aClass40_92.method1063(0).length());
		} else if (local11.startsWith(Static509.aClass40_145.method1063(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static509.aClass40_145.method1063(0).length());
		} else if (local11.startsWith(Static325.aClass40_95.method1063(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static325.aClass40_95.method1063(0).length());
		} else if (local11.startsWith(Static88.aClass40_25.method1063(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static88.aClass40_25.method1063(0).length());
		} else if (local11.startsWith(Static325.aClass40_96.method1063(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static325.aClass40_96.method1063(0).length());
		} else if (local11.startsWith(Static255.aClass40_79.method1063(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static255.aClass40_79.method1063(0).length());
		} else if (local11.startsWith(Static150.aClass40_49.method1063(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static150.aClass40_49.method1063(0).length());
		} else if (local11.startsWith(Static86.aClass40_24.method1063(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static86.aClass40_24.method1063(0).length());
		} else if (Static194.anInt3737 != 0) {
			if (local11.startsWith(Static113.aClass40_36.method1063(Static194.anInt3737))) {
				local13 = 0;
				arg0 = arg0.substring(Static113.aClass40_36.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static140.aClass40_41.method1063(Static194.anInt3737))) {
				local13 = 1;
				arg0 = arg0.substring(Static140.aClass40_41.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static449.aClass40_128.method1063(Static194.anInt3737))) {
				local13 = 2;
				arg0 = arg0.substring(Static449.aClass40_128.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static219.aClass40_65.method1063(Static194.anInt3737))) {
				local13 = 3;
				arg0 = arg0.substring(Static219.aClass40_65.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static308.aClass40_92.method1063(Static194.anInt3737))) {
				local13 = 4;
				arg0 = arg0.substring(Static308.aClass40_92.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static509.aClass40_145.method1063(Static194.anInt3737))) {
				local13 = 5;
				arg0 = arg0.substring(Static509.aClass40_145.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static325.aClass40_95.method1063(Static194.anInt3737))) {
				local13 = 6;
				arg0 = arg0.substring(Static325.aClass40_95.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static88.aClass40_25.method1063(Static194.anInt3737))) {
				local13 = 7;
				arg0 = arg0.substring(Static88.aClass40_25.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static325.aClass40_96.method1063(Static194.anInt3737))) {
				local13 = 8;
				arg0 = arg0.substring(Static325.aClass40_96.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static255.aClass40_79.method1063(Static194.anInt3737))) {
				local13 = 9;
				arg0 = arg0.substring(Static255.aClass40_79.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static150.aClass40_49.method1063(Static194.anInt3737))) {
				local13 = 10;
				arg0 = arg0.substring(Static150.aClass40_49.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static86.aClass40_24.method1063(Static194.anInt3737))) {
				local13 = 11;
				arg0 = arg0.substring(Static86.aClass40_24.method1063(Static194.anInt3737).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static188.aClass40_59.method1063(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static188.aClass40_59.method1063(0).length());
		} else if (local11.startsWith(Static356.aClass40_101.method1063(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static356.aClass40_101.method1063(0).length());
		} else if (local11.startsWith(Static84.aClass40_23.method1063(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static84.aClass40_23.method1063(0).length());
		} else if (local11.startsWith(Static335.aClass40_97.method1063(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static335.aClass40_97.method1063(0).length());
		} else if (local11.startsWith(Static253.aClass40_142.method1063(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static253.aClass40_142.method1063(0).length());
		} else if (Static194.anInt3737 != 0) {
			if (local11.startsWith(Static188.aClass40_59.method1063(Static194.anInt3737))) {
				local451 = 1;
				arg0 = arg0.substring(Static188.aClass40_59.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static356.aClass40_101.method1063(Static194.anInt3737))) {
				local451 = 2;
				arg0 = arg0.substring(Static356.aClass40_101.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static84.aClass40_23.method1063(Static194.anInt3737))) {
				local451 = 3;
				arg0 = arg0.substring(Static84.aClass40_23.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static335.aClass40_97.method1063(Static194.anInt3737))) {
				local451 = 4;
				arg0 = arg0.substring(Static335.aClass40_97.method1063(Static194.anInt3737).length());
			} else if (local11.startsWith(Static253.aClass40_142.method1063(Static194.anInt3737))) {
				local451 = 5;
				arg0 = arg0.substring(Static253.aClass40_142.method1063(Static194.anInt3737).length());
			}
		}
		Static415.method5995(Static517.aClass236_91);
		Static164.aClass5_Sub3_Sub1_2.method4192(0);
		@Pc(646) int local646 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
		if (arg1 == 5021) {
			Static164.aClass5_Sub3_Sub1_2.method4192(1);
		} else {
			Static164.aClass5_Sub3_Sub1_2.method4192(0);
		}
		Static164.aClass5_Sub3_Sub1_2.method4192(local13);
		Static164.aClass5_Sub3_Sub1_2.method4192(local451);
		Static139.method2599(Static164.aClass5_Sub3_Sub1_2, arg0);
		Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local646);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public static void method4402(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static348.method5412(arg0)) {
			return;
		}
		@Pc(12) Class220[] local12 = Static139.aClass220ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class220 local19 = local12[local14];
			if (local19.anObjectArray11 != null) {
				@Pc(26) Class5_Sub17 local26 = new Class5_Sub17();
				local26.aClass220_5 = local19;
				local26.anObjectArray3 = local19.anObjectArray11;
				method4405(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!fp;)V")
	public static void method4403(@OriginalArg(0) Class5_Sub17 arg0) {
		method4405(arg0, 200000);
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	private static void method4404(@OriginalArg(0) int arg0) {
		@Pc(3) Class220 local3 = Static352.method5447(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class220[] local13 = Static424.aClass220ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class220[] local19 = Static139.aClass220ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static424.aClass220ArrayArray2[local9] = new Class220[local22];
			Static553.method2531(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static553.method2531(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!fp;I)V")
	private static void method4405(@OriginalArg(0) Class5_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub2_Sub1 local12 = Static335.method5243(local8);
		if (local12 == null) {
			return;
		}
		anIntArray325 = new int[local12.anInt213];
		@Pc(21) int local21 = 0;
		aStringArray23 = new String[local12.anInt209];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2983;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2985;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass220_5 == null ? -1 : arg0.aClass220_5.anInt6661;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2980;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass220_5 == null ? -1 : arg0.aClass220_5.anInt6674;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass220_6 == null ? -1 : arg0.aClass220_6.anInt6661;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass220_6 == null ? -1 : arg0.aClass220_6.anInt6674;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2976;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2979;
				}
				anIntArray325[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString35;
				}
				aStringArray23[local27++] = local135;
			}
		}
		anInt5229 = arg0.anInt2981;
		method4398(local12, arg1);
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method4406(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar3.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar3.get(5);
		@Pc(20) int local20 = aCalendar3.get(2);
		@Pc(24) int local24 = aCalendar3.get(1);
		return local16 + "-" + aStringArray24[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(IZ)V")
	private static void method4408(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class220 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(158) Class220 local158;
		@Pc(35) Class220 local35;
		@Pc(210) Class220 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5226 -= 3;
				local13 = anIntArray326[anInt5226];
				local19 = anIntArray326[anInt5226 + 1];
				local25 = anIntArray326[anInt5226 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static352.method5447(local13);
				if (local35.aClass220Array6 == null) {
					local35.aClass220Array6 = new Class220[local25 + 1];
				}
				if (local35.aClass220Array6.length <= local25) {
					@Pc(54) Class220[] local54 = new Class220[local25 + 1];
					for (local56 = 0; local56 < local35.aClass220Array6.length; local56++) {
						local54[local56] = local35.aClass220Array6[local56];
					}
					local35.aClass220Array6 = local54;
				}
				if (local25 > 0 && local35.aClass220Array6[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class220 local99 = new Class220();
				local99.anInt6669 = local19;
				local99.anInt6605 = local99.anInt6661 = local35.anInt6661;
				local99.anInt6674 = local25;
				local35.aClass220Array6[local25] = local99;
				if (arg1) {
					aClass220_12 = local99;
				} else {
					aClass220_13 = local99;
				}
				Static377.method5650(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass220_12 : aClass220_13;
				if (local137.anInt6674 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static352.method5447(local137.anInt6661);
				local158.aClass220Array6[local137.anInt6674] = null;
				Static377.method5650(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static352.method5447(anIntArray326[--anInt5226]);
				local137.aClass220Array6 = null;
				Static377.method5650(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5226 -= 2;
				local13 = anIntArray326[anInt5226];
				local19 = anIntArray326[anInt5226 + 1];
				local210 = Static485.method6724(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray326[anInt5226++] = 1;
					if (arg1) {
						aClass220_12 = local210;
						return;
					}
					aClass220_13 = local210;
					return;
				}
				anIntArray326[anInt5226++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray326[--anInt5226];
				local158 = Static352.method5447(local13);
				if (local158 != null) {
					anIntArray326[anInt5226++] = 1;
					if (arg1) {
						aClass220_12 = local158;
						return;
					}
					aClass220_13 = local158;
					return;
				}
				anIntArray326[anInt5226++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray326[--anInt5226];
				method4410(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray326[--anInt5226];
				method4404(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5226 -= 2;
					local13 = anIntArray326[anInt5226];
					local19 = anIntArray326[anInt5226 + 1];
					for (local25 = 0; local25 < Static479.anIntArray647.length; local25++) {
						if (Static479.anIntArray647[local25] == local13) {
							Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1.method5870(local19, local25, Static261.aClass211_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static27.anIntArray32.length; local353++) {
						if (Static27.anIntArray32[local353] == local13) {
							Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1.method5870(local19, local353, Static261.aClass211_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5226 -= 2;
					local13 = anIntArray326[anInt5226];
					local19 = anIntArray326[anInt5226 + 1];
					Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1.method5877(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray326[--anInt5226] != 0;
					Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1.method5871(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static352.method5447(anIntArray326[--anInt5226]);
				} else {
					local137 = arg1 ? aClass220_12 : aClass220_13;
				}
				if (arg0 == 1000) {
					anInt5226 -= 4;
					local137.anInt6676 = anIntArray326[anInt5226];
					local137.anInt6622 = anIntArray326[anInt5226 + 1];
					local19 = anIntArray326[anInt5226 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray326[anInt5226 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte65 = (byte) local19;
					local137.aByte67 = (byte) local25;
					Static377.method5650(local137);
					Static248.method4846(local137);
					if (local137.anInt6674 == -1) {
						Static418.method6021(local137.anInt6661);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5226 -= 4;
					local137.anInt6630 = anIntArray326[anInt5226];
					local137.anInt6634 = anIntArray326[anInt5226 + 1];
					local137.anInt6621 = 0;
					local137.anInt6615 = 0;
					local19 = anIntArray326[anInt5226 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray326[anInt5226 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte68 = (byte) local19;
					local137.aByte66 = (byte) local25;
					Static377.method5650(local137);
					Static248.method4846(local137);
					if (local137.anInt6669 == 0) {
						Static428.method6119(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray326[--anInt5226] == 1;
					if (local137.aBoolean463 != local620) {
						local137.aBoolean463 = local620;
						Static377.method5650(local137);
					}
					if (local137.anInt6674 == -1) {
						Static352.method5445(local137.anInt6661);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5226 -= 2;
					local137.anInt6645 = anIntArray326[anInt5226];
					local137.anInt6673 = anIntArray326[anInt5226 + 1];
					Static377.method5650(local137);
					Static248.method4846(local137);
					if (local137.anInt6669 == 0) {
						Static428.method6119(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean470 = anIntArray326[--anInt5226] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static352.method5447(anIntArray326[--anInt5226]);
					} else {
						local137 = arg1 ? aClass220_12 : aClass220_13;
					}
					if (arg0 == 1100) {
						anInt5226 -= 2;
						local137.anInt6626 = anIntArray326[anInt5226];
						if (local137.anInt6626 > local137.anInt6635 - local137.anInt6627) {
							local137.anInt6626 = local137.anInt6635 - local137.anInt6627;
						}
						if (local137.anInt6626 < 0) {
							local137.anInt6626 = 0;
						}
						local137.anInt6609 = anIntArray326[anInt5226 + 1];
						if (local137.anInt6609 > local137.anInt6670 - local137.anInt6681) {
							local137.anInt6609 = local137.anInt6670 - local137.anInt6681;
						}
						if (local137.anInt6609 < 0) {
							local137.anInt6609 = 0;
						}
						Static377.method5650(local137);
						if (local137.anInt6674 == -1) {
							Static198.method3280(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6680 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						if (local137.anInt6674 == -1) {
							Static305.method5009(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean458 = anIntArray326[--anInt5226] == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6642 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6654 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray326[--anInt5226];
						if (local137.anInt6633 != local19) {
							local137.anInt6633 = local19;
							Static377.method5650(local137);
						}
						if (local137.anInt6674 == -1) {
							Static356.method5506(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6686 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.lb = anIntArray326[--anInt5226] == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6675 = 1;
						local137.anInt6612 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						if (local137.anInt6674 == -1) {
							Static453.method6368(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5226 -= 6;
						local137.anInt6692 = anIntArray326[anInt5226];
						local137.anInt6672 = anIntArray326[anInt5226 + 1];
						local137.anInt6683 = anIntArray326[anInt5226 + 2];
						local137.anInt6617 = anIntArray326[anInt5226 + 3];
						local137.anInt6666 = anIntArray326[anInt5226 + 4];
						local137.anInt6650 = anIntArray326[anInt5226 + 5];
						Static377.method5650(local137);
						if (local137.anInt6674 == -1) {
							Static286.method4828(local137.anInt6661);
							Static173.method3022(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray326[--anInt5226];
						if (local137.anInt6643 != local19) {
							local137.anInt6643 = local19;
							local137.anInt6649 = 0;
							local137.anInt6604 = 1;
							local137.anInt6619 = 0;
							Static377.method5650(local137);
						}
						if (local137.anInt6674 == -1) {
							Static526.method7199(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean461 = anIntArray326[--anInt5226] == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray22[--anInt5223];
						if (!local1101.equals(local137.aString65)) {
							local137.aString65 = local1101;
							Static377.method5650(local137);
						}
						if (local137.anInt6674 == -1) {
							Static463.method6458(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6658 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						if (local137.anInt6674 == -1) {
							Static419.method6027(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5226 -= 3;
						local137.anInt6610 = anIntArray326[anInt5226];
						local137.anInt6628 = anIntArray326[anInt5226 + 1];
						local137.anInt6613 = anIntArray326[anInt5226 + 2];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean465 = anIntArray326[--anInt5226] == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6608 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6638 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean468 = anIntArray326[--anInt5226] == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean467 = anIntArray326[--anInt5226] == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5226 -= 2;
						local137.anInt6635 = anIntArray326[anInt5226];
						local137.anInt6670 = anIntArray326[anInt5226 + 1];
						Static377.method5650(local137);
						if (local137.anInt6669 == 0) {
							Static428.method6119(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt5226 -= 2;
						local137.anInt6652 = (short) anIntArray326[anInt5226];
						local137.anInt6648 = (short) anIntArray326[anInt5226 + 1];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean471 = anIntArray326[--anInt5226] == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6650 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						if (local137.anInt6674 == -1) {
							Static286.method4828(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray326[--anInt5226];
						local137.aBoolean464 = local19 == 1;
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5226 -= 2;
						local137.anInt6640 = anIntArray326[anInt5226];
						local137.anInt6606 = anIntArray326[anInt5226 + 1];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6614 = anIntArray326[--anInt5226];
						Static377.method5650(local137);
						return;
					}
					@Pc(1454) Class135 local1454;
					if (arg0 == 1127) {
						anInt5226 -= 2;
						local19 = anIntArray326[anInt5226];
						local25 = anIntArray326[anInt5226 + 1];
						local1454 = Static216.aClass298_11.method6969(local19);
						if (local25 != local1454.anInt3793) {
							local137.method5472(local19, local25);
							return;
						}
						local137.method5476(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray326[--anInt5226];
						local1488 = aStringArray22[--anInt5223];
						local1454 = Static216.aClass298_11.method6969(local19);
						if (!local1454.aString38.equals(local1488)) {
							local137.method5484(local1488, local19);
							return;
						}
						local137.method5476(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static352.method5447(anIntArray326[--anInt5226]);
						} else {
							local137 = arg1 ? aClass220_12 : aClass220_13;
						}
						if (arg0 == 1300) {
							local19 = anIntArray326[--anInt5226] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5489(aStringArray22[--anInt5223], local19);
								return;
							}
							anInt5223--;
							return;
						}
						if (arg0 == 1301) {
							anInt5226 -= 2;
							local19 = anIntArray326[anInt5226];
							local25 = anIntArray326[anInt5226 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass220_15 = null;
								return;
							}
							local137.aClass220_15 = Static485.method6724(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray326[--anInt5226];
							if (local19 != Static390.anInt8665 && local19 != Static201.anInt3832 && local19 != Static410.anInt7322) {
								return;
							}
							local137.anInt6601 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6668 = anIntArray326[--anInt5226];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6655 = anIntArray326[--anInt5226];
							return;
						}
						if (arg0 == 1305) {
							local137.aString63 = aStringArray22[--anInt5223];
							return;
						}
						if (arg0 == 1306) {
							local137.aString62 = aStringArray22[--anInt5223];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray29 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6685 = anIntArray326[--anInt5226];
							local137.anInt6691 = anIntArray326[--anInt5226];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray326[--anInt5226];
							local25 = anIntArray326[--anInt5226];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5483(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString66 = aStringArray22[--anInt5223];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6616 = anIntArray326[--anInt5226];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5226 -= 3;
								local19 = anIntArray326[anInt5226] - 1;
								local25 = anIntArray326[anInt5226 + 1];
								local353 = anIntArray326[anInt5226 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5226 -= 2;
								local19 = 10;
								local25 = anIntArray326[anInt5226];
								local353 = anIntArray326[anInt5226 + 1];
							}
							if (local137.aByteArray89 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray89 = new byte[11];
								local137.aByteArray90 = new byte[11];
								local137.anIntArray493 = new int[11];
							}
							local137.aByteArray89[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean459 = false;
								for (local2290 = 0; local2290 < local137.aByteArray89.length; local2290++) {
									if (local137.aByteArray89[local2290] != 0) {
										local137.aBoolean459 = true;
										break;
									}
								}
							} else {
								local137.aBoolean459 = true;
							}
							local137.aByteArray90[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6611 = anIntArray326[--anInt5226];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static352.method5447(anIntArray326[--anInt5226]);
						} else {
							local137 = arg1 ? aClass220_12 : aClass220_13;
						}
						local1101 = aStringArray22[--anInt5223];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray326[--anInt5226];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray326[--anInt5226];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray22[--anInt5223];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray326[--anInt5226]);
							}
						}
						local56 = anIntArray326[--anInt5226];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray17 = local2421;
							local137.anIntArray500 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray28 = local2421;
							local137.anIntArray495 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray27 = local2421;
							local137.anIntArray498 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray36 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray21 = local2421;
							local137.anIntArray496 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray33 = local2421;
							local137.anIntArray491 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray24 = local2421;
						}
						local137.aBoolean472 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass220_12 : aClass220_13;
						if (arg0 == 1500) {
							anIntArray326[anInt5226++] = local137.anInt6603;
							return;
						}
						if (arg0 == 1501) {
							anIntArray326[anInt5226++] = local137.anInt6631;
							return;
						}
						if (arg0 == 1502) {
							anIntArray326[anInt5226++] = local137.anInt6627;
							return;
						}
						if (arg0 == 1503) {
							anIntArray326[anInt5226++] = local137.anInt6681;
							return;
						}
						if (arg0 == 1504) {
							anIntArray326[anInt5226++] = local137.aBoolean463 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray326[anInt5226++] = local137.anInt6605;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static73.method1344(local137);
							anIntArray326[anInt5226++] = local158 == null ? -1 : local158.anInt6661;
							return;
						}
					} else {
						@Pc(3017) Class135 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass220_12 : aClass220_13;
							if (arg0 == 1600) {
								anIntArray326[anInt5226++] = local137.anInt6626;
								return;
							}
							if (arg0 == 1601) {
								anIntArray326[anInt5226++] = local137.anInt6609;
								return;
							}
							if (arg0 == 1602) {
								aStringArray22[anInt5223++] = local137.aString65;
								return;
							}
							if (arg0 == 1603) {
								anIntArray326[anInt5226++] = local137.anInt6635;
								return;
							}
							if (arg0 == 1604) {
								anIntArray326[anInt5226++] = local137.anInt6670;
								return;
							}
							if (arg0 == 1605) {
								anIntArray326[anInt5226++] = local137.anInt6650;
								return;
							}
							if (arg0 == 1606) {
								anIntArray326[anInt5226++] = local137.anInt6683;
								return;
							}
							if (arg0 == 1607) {
								anIntArray326[anInt5226++] = local137.anInt6666;
								return;
							}
							if (arg0 == 1608) {
								anIntArray326[anInt5226++] = local137.anInt6617;
								return;
							}
							if (arg0 == 1609) {
								anIntArray326[anInt5226++] = local137.anInt6642;
								return;
							}
							if (arg0 == 1610) {
								anIntArray326[anInt5226++] = local137.anInt6692;
								return;
							}
							if (arg0 == 1611) {
								anIntArray326[anInt5226++] = local137.anInt6672;
								return;
							}
							if (arg0 == 1612) {
								anIntArray326[anInt5226++] = local137.anInt6633;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray326[--anInt5226];
								local3017 = Static216.aClass298_11.method6969(local19);
								if (local3017.method3275()) {
									aStringArray22[anInt5223++] = local137.method5477(local3017.aString38, local19);
									return;
								}
								anIntArray326[anInt5226++] = local137.method5475(local19, local3017.anInt3793);
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass220_12 : aClass220_13;
							if (arg0 == 1700) {
								anIntArray326[anInt5226++] = local137.anInt6641;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6641 != -1) {
									anIntArray326[anInt5226++] = local137.anInt6664;
									return;
								}
								anIntArray326[anInt5226++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray326[anInt5226++] = local137.anInt6674;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass220_12 : aClass220_13;
							if (arg0 == 1800) {
								anIntArray326[anInt5226++] = Static68.method1303(local137).method1953();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray326[--anInt5226];
								local19--;
								if (local137.aStringArray29 != null && local19 < local137.aStringArray29.length && local137.aStringArray29[local19] != null) {
									aStringArray22[anInt5223++] = local137.aStringArray29[local19];
									return;
								}
								aStringArray22[anInt5223++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString63 == null) {
									aStringArray22[anInt5223++] = "";
									return;
								}
								aStringArray22[anInt5223++] = local137.aString63;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static352.method5447(anIntArray326[--anInt5226]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass220_12 : aClass220_13;
							}
							if (anInt5229 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray6 == null) {
									return;
								}
								@Pc(3254) Class5_Sub17 local3254 = new Class5_Sub17();
								local3254.aClass220_5 = local137;
								local3254.anObjectArray3 = local137.anObjectArray6;
								local3254.anInt2981 = anInt5229 + 1;
								Static287.aClass99_49.method2513(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static352.method5447(anIntArray326[--anInt5226]);
							if (arg0 == 2500) {
								anIntArray326[anInt5226++] = local137.anInt6603;
								return;
							}
							if (arg0 == 2501) {
								anIntArray326[anInt5226++] = local137.anInt6631;
								return;
							}
							if (arg0 == 2502) {
								anIntArray326[anInt5226++] = local137.anInt6627;
								return;
							}
							if (arg0 == 2503) {
								anIntArray326[anInt5226++] = local137.anInt6681;
								return;
							}
							if (arg0 == 2504) {
								anIntArray326[anInt5226++] = local137.aBoolean463 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray326[anInt5226++] = local137.anInt6605;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static73.method1344(local137);
								anIntArray326[anInt5226++] = local158 == null ? -1 : local158.anInt6661;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static352.method5447(anIntArray326[--anInt5226]);
							if (arg0 == 2600) {
								anIntArray326[anInt5226++] = local137.anInt6626;
								return;
							}
							if (arg0 == 2601) {
								anIntArray326[anInt5226++] = local137.anInt6609;
								return;
							}
							if (arg0 == 2602) {
								aStringArray22[anInt5223++] = local137.aString65;
								return;
							}
							if (arg0 == 2603) {
								anIntArray326[anInt5226++] = local137.anInt6635;
								return;
							}
							if (arg0 == 2604) {
								anIntArray326[anInt5226++] = local137.anInt6670;
								return;
							}
							if (arg0 == 2605) {
								anIntArray326[anInt5226++] = local137.anInt6650;
								return;
							}
							if (arg0 == 2606) {
								anIntArray326[anInt5226++] = local137.anInt6683;
								return;
							}
							if (arg0 == 2607) {
								anIntArray326[anInt5226++] = local137.anInt6666;
								return;
							}
							if (arg0 == 2608) {
								anIntArray326[anInt5226++] = local137.anInt6617;
								return;
							}
							if (arg0 == 2609) {
								anIntArray326[anInt5226++] = local137.anInt6642;
								return;
							}
							if (arg0 == 2610) {
								anIntArray326[anInt5226++] = local137.anInt6692;
								return;
							}
							if (arg0 == 2611) {
								anIntArray326[anInt5226++] = local137.anInt6672;
								return;
							}
							if (arg0 == 2612) {
								anIntArray326[anInt5226++] = local137.anInt6633;
								return;
							}
						} else {
							@Pc(3751) Class5_Sub43 local3751;
							@Pc(3649) Class5_Sub43 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static352.method5447(anIntArray326[--anInt5226]);
									anIntArray326[anInt5226++] = local137.anInt6641;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static352.method5447(anIntArray326[--anInt5226]);
									if (local137.anInt6641 != -1) {
										anIntArray326[anInt5226++] = local137.anInt6664;
										return;
									}
									anIntArray326[anInt5226++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray326[--anInt5226];
									local3649 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local13);
									if (local3649 != null) {
										anIntArray326[anInt5226++] = 1;
										return;
									}
									anIntArray326[anInt5226++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static352.method5447(anIntArray326[--anInt5226]);
									if (local137.aClass220Array6 == null) {
										anIntArray326[anInt5226++] = 0;
										return;
									}
									local19 = local137.aClass220Array6.length;
									for (local25 = 0; local25 < local137.aClass220Array6.length; local25++) {
										if (local137.aClass220Array6[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray326[anInt5226++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5226 -= 2;
									local13 = anIntArray326[anInt5226];
									local19 = anIntArray326[anInt5226 + 1];
									local3751 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local13);
									if (local3751 != null && local3751.anInt7801 == local19) {
										anIntArray326[anInt5226++] = 1;
										return;
									} else {
										anIntArray326[anInt5226++] = 0;
										return;
									}
								}
							} else if (arg0 < 2900) {
								local137 = Static352.method5447(anIntArray326[--anInt5226]);
								if (arg0 == 2800) {
									anIntArray326[anInt5226++] = Static68.method1303(local137).method1953();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray326[--anInt5226];
									local19--;
									if (local137.aStringArray29 != null && local19 < local137.aStringArray29.length && local137.aStringArray29[local19] != null) {
										aStringArray22[anInt5223++] = local137.aStringArray29[local19];
										return;
									}
									aStringArray22[anInt5223++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString63 == null) {
										aStringArray22[anInt5223++] = "";
										return;
									}
									aStringArray22[anInt5223++] = local137.aString63;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray22[--anInt5223];
										Static340.method5291(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt5226 -= 2;
										Static420.method7302(Static35.aClass15_Sub2_Sub1_Sub1_1, anIntArray326[anInt5226], anIntArray326[anInt5226 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static100.method2089();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray22[--anInt5223];
										local19 = 0;
										if (Static359.method5525(local3888)) {
											local19 = Static412.method5992(local3888);
										}
										Static415.method5995(Static141.aClass236_25);
										Static164.aClass5_Sub3_Sub1_2.method4184(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray22[--anInt5223];
										Static415.method5995(Static252.aClass236_47);
										Static164.aClass5_Sub3_Sub1_2.method4192(local3888.length() + 1);
										Static164.aClass5_Sub3_Sub1_2.method4208(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray22[--anInt5223];
										Static415.method5995(Static507.aClass236_89);
										Static164.aClass5_Sub3_Sub1_2.method4192(local3888.length() + 1);
										Static164.aClass5_Sub3_Sub1_2.method4208(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray326[--anInt5226];
										local1101 = aStringArray22[--anInt5223];
										Static332.method5223(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt5226 -= 3;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local25 = anIntArray326[anInt5226 + 2];
										local35 = Static352.method5447(local25);
										Static26.method669(local35, local19, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local210 = arg1 ? aClass220_12 : aClass220_13;
										Static26.method669(local210, local19, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray326[--anInt5226];
										Static415.method5995(Static46.aClass236_7);
										Static164.aClass5_Sub3_Sub1_2.method4181(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local3751 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local13);
										if (local3751 != null) {
											Static343.method5317(local3751.anInt7801 != local19, true, local3751);
										}
										Static194.method3243(3, local13, local19, true);
										return;
									}
									if (arg0 == 3112) {
										anInt5226--;
										local13 = anIntArray326[anInt5226];
										local3649 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local13);
										if (local3649 != null && local3649.anInt7805 == 3) {
											Static343.method5317(true, true, local3649);
										}
										return;
									}
									if (arg0 == 3113) {
										Static185.method3136(aStringArray22[--anInt5223]);
										return;
									}
									if (arg0 == 3114) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local1488 = aStringArray22[--anInt5223];
										Static328.method5200("", local19, local13, local1488, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5226 -= 3;
										Static532.method7260(anIntArray326[anInt5226], 255, anIntArray326[anInt5226 + 1], anIntArray326[anInt5226 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static398.method5796(255, 50, anIntArray326[--anInt5226]);
										return;
									}
									if (arg0 == 3202) {
										anInt5226 -= 2;
										Static40.method855(anIntArray326[anInt5226], anIntArray326[anInt5226 + 1], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt5226 -= 4;
										Static532.method7260(anIntArray326[anInt5226], anIntArray326[anInt5226 + 3], anIntArray326[anInt5226 + 1], anIntArray326[anInt5226 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt5226 -= 3;
										Static398.method5796(anIntArray326[anInt5226 + 1], anIntArray326[anInt5226 + 2], anIntArray326[anInt5226]);
										return;
									}
									if (arg0 == 3205) {
										anInt5226 -= 3;
										Static40.method855(anIntArray326[anInt5226], anIntArray326[anInt5226 + 1], anIntArray326[anInt5226 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt5226 -= 4;
										Static231.method3801(anIntArray326[anInt5226], anIntArray326[anInt5226 + 2], anIntArray326[anInt5226 + 3], anIntArray326[anInt5226 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray326[anInt5226++] = Static481.anInt8318;
										return;
									}
									if (arg0 == 3301) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static255.method4326(local19, false, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static475.method6635(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static86.method1502(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static403.aClass134_1.method3273(local13).anInt5830;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static99.anIntArray197[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static460.anIntArray602[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static191.anIntArray489[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91;
										local19 = (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7) + Static515.anInt3214;
										local25 = (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7) + Static338.anInt6353;
										anIntArray326[anInt5226++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray326[anInt5226++] = Static433.aBoolean542 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static255.method4326(local19, true, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static475.method6635(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static86.method1502(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static137.anInt1383 >= 2) {
											anIntArray326[anInt5226++] = Static137.anInt1383;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray326[anInt5226++] = Static34.anInt869;
										return;
									}
									if (arg0 == 3318) {
										anIntArray326[anInt5226++] = Static212.aClass43_2.anInt1149;
										return;
									}
									if (arg0 == 3321) {
										anIntArray326[anInt5226++] = Static151.anInt3118;
										return;
									}
									if (arg0 == 3322) {
										anIntArray326[anInt5226++] = Static16.anInt456;
										return;
									}
									if (arg0 == 3323) {
										if (Static127.anInt2678 >= 5 && Static127.anInt2678 <= 9) {
											anIntArray326[anInt5226++] = 1;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static127.anInt2678 >= 5 && Static127.anInt2678 <= 9) {
											anIntArray326[anInt5226++] = Static127.anInt2678;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray326[anInt5226++] = Static153.aBoolean206 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray326[anInt5226++] = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852;
										return;
									}
									if (arg0 == 3327) {
										anIntArray326[anInt5226++] = Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1.aBoolean511 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray326[anInt5226++] = Static411.aBoolean519 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static344.method5353(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static158.method2882(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = Static158.method2882(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray326[anInt5226++] = Static523.anInt8857;
										return;
									}
									if (arg0 == 3335) {
										anIntArray326[anInt5226++] = Static194.anInt3737;
										return;
									}
									if (arg0 == 3336) {
										anInt5226 -= 4;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local25 = anIntArray326[anInt5226 + 2];
										local353 = anIntArray326[anInt5226 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray326[anInt5226++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray326[anInt5226++] = Static433.anInt7630;
										return;
									}
									if (arg0 == 3338) {
										anIntArray326[anInt5226++] = Static308.method5030();
										return;
									}
									if (arg0 == 3339) {
										anIntArray326[anInt5226++] = Static379.aBoolean490 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray326[anInt5226++] = Static538.aBoolean658 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray326[anInt5226++] = Static420.aBoolean656 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray326[anInt5226++] = Static280.aClass214_1.method6766();
										return;
									}
									if (arg0 == 3343) {
										anIntArray326[anInt5226++] = Static280.aClass214_1.method6770();
										return;
									}
									if (arg0 == 3344) {
										aStringArray22[anInt5223++] = Static527.method7226();
										return;
									}
									if (arg0 == 3345) {
										aStringArray22[anInt5223++] = Static141.method2631();
										return;
									}
									if (arg0 == 3346) {
										anIntArray326[anInt5226++] = Static372.method2814();
										return;
									}
									if (arg0 == 3347) {
										anIntArray326[anInt5226++] = Static422.anInt7463;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5340) Class254 local5340;
									if (arg0 == 3400) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local5340 = Static518.aClass241_1.method5714(local13);
										aStringArray22[anInt5223++] = local5340.method6085(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt5226 -= 4;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local25 = anIntArray326[anInt5226 + 2];
										local353 = anIntArray326[anInt5226 + 3];
										@Pc(5386) Class254 local5386 = Static518.aClass241_1.method5714(local25);
										if (local5386.aChar5 == local13 && local5386.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray22[anInt5223++] = local5386.method6085(local353);
												return;
											}
											anIntArray326[anInt5226++] = local5386.method6083(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt5226 -= 3;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local25 = anIntArray326[anInt5226 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5462) Class254 local5462 = Static518.aClass241_1.method5714(local19);
										if (local5462.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray326[anInt5226++] = local5462.method6092(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray326[--anInt5226];
										local1101 = aStringArray22[--anInt5223];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5340 = Static518.aClass241_1.method5714(local13);
										if (local5340.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray326[anInt5226++] = local5340.method6088(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray326[--anInt5226];
										@Pc(5560) Class254 local5560 = Static518.aClass241_1.method5714(local13);
										anIntArray326[anInt5226++] = local5560.aClass42_30.method1111();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static128.anInt2703 == 0) {
											anIntArray326[anInt5226++] = -2;
											return;
										}
										if (Static128.anInt2703 == 1) {
											anIntArray326[anInt5226++] = -1;
											return;
										}
										anIntArray326[anInt5226++] = Static59.anInt1208;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray326[--anInt5226];
										if (Static128.anInt2703 == 2 && local13 < Static59.anInt1208) {
											aStringArray22[anInt5223++] = Static23.aStringArray7[local13];
											if (Static386.aStringArray18[local13] != null) {
												aStringArray22[anInt5223++] = Static386.aStringArray18[local13];
												return;
											}
											aStringArray22[anInt5223++] = "";
											return;
										}
										aStringArray22[anInt5223++] = "";
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray326[--anInt5226];
										if (Static128.anInt2703 == 2 && local13 < Static59.anInt1208) {
											anIntArray326[anInt5226++] = Static361.anIntArray507[local13];
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray326[--anInt5226];
										if (Static128.anInt2703 == 2 && local13 < Static59.anInt1208) {
											anIntArray326[anInt5226++] = Static534.anIntArray686[local13];
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray22[--anInt5223];
										local19 = anIntArray326[--anInt5226];
										Static186.method3138(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray22[--anInt5223];
										Static16.method593(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray22[--anInt5223];
										Static291.method4880(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray22[--anInt5223];
										Static225.method3577(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray22[--anInt5223];
										Static328.method5198(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray22[--anInt5223];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray326[anInt5226++] = Static444.method6295(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray326[--anInt5226];
										if (Static128.anInt2703 == 2 && local13 < Static59.anInt1208) {
											aStringArray22[anInt5223++] = Static506.aStringArray37[local13];
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static264.aString53 != null) {
											aStringArray22[anInt5223++] = Static199.method3282(Static264.aString53);
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static264.aString53 != null) {
											anIntArray326[anInt5226++] = Static280.anInt5465;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray326[--anInt5226];
										if (Static264.aString53 != null && local13 < Static280.anInt5465) {
											aStringArray22[anInt5223++] = Static482.aClass163Array1[local13].aString51;
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray326[--anInt5226];
										if (Static264.aString53 != null && local13 < Static280.anInt5465) {
											anIntArray326[anInt5226++] = Static482.aClass163Array1[local13].anInt4833;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray326[--anInt5226];
										if (Static264.aString53 != null && local13 < Static280.anInt5465) {
											anIntArray326[anInt5226++] = Static482.aClass163Array1[local13].aByte51;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray326[anInt5226++] = Static276.aByte55;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray22[--anInt5223];
										Static112.method2232(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray326[anInt5226++] = Static138.aByte33;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray22[--anInt5223];
										Static473.method6616(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static201.method3293();
										return;
									}
									if (arg0 == 3621) {
										if (Static128.anInt2703 == 0) {
											anIntArray326[anInt5226++] = -1;
											return;
										}
										anIntArray326[anInt5226++] = Static150.anInt3101;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray326[--anInt5226];
										if (Static128.anInt2703 != 0 && local13 < Static150.anInt3101) {
											aStringArray22[anInt5223++] = Static3.aStringArray3[local13];
											if (Static207.aStringArray20[local13] != null) {
												aStringArray22[anInt5223++] = Static207.aStringArray20[local13];
												return;
											}
											aStringArray22[anInt5223++] = "";
											return;
										}
										aStringArray22[anInt5223++] = "";
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray22[--anInt5223];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray326[anInt5226++] = Static359.method5523(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray326[--anInt5226];
										if (Static482.aClass163Array1 != null && local13 < Static280.anInt5465 && Static482.aClass163Array1[local13].aString49.equalsIgnoreCase(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18)) {
											anIntArray326[anInt5226++] = 1;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static42.aString22 != null) {
											aStringArray22[anInt5223++] = Static42.aString22;
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray326[--anInt5226];
										if (Static264.aString53 != null && local13 < Static280.anInt5465) {
											aStringArray22[anInt5223++] = Static482.aClass163Array1[local13].aString50;
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray326[--anInt5226];
										if (Static128.anInt2703 == 2 && local13 >= 0 && local13 < Static59.anInt1208) {
											anIntArray326[anInt5226++] = Static506.aBooleanArray36[local13] ? 1 : 0;
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray22[--anInt5223];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray326[anInt5226++] = Static306.method4959(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray326[anInt5226++] = Static353.anInt6597;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray22[--anInt5223];
										Static225.method3577(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static324.aBooleanArray22[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray326[--anInt5226];
										if (Static264.aString53 != null && local13 < Static280.anInt5465) {
											aStringArray22[anInt5223++] = Static482.aClass163Array1[local13].aString49;
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray326[--anInt5226];
										if (Static128.anInt2703 != 0 && local13 < Static150.anInt3101) {
											aStringArray22[anInt5223++] = Static357.aStringArray30[local13];
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static328.aClass315Array1[local13].method7397();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static328.aClass315Array1[local13].anInt9116;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static328.aClass315Array1[local13].anInt9110;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static328.aClass315Array1[local13].anInt9119;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static328.aClass315Array1[local13].anInt9111;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static328.aClass315Array1[local13].anInt9118;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray326[--anInt5226];
										local19 = Static328.aClass315Array1[local13].method7395();
										anIntArray326[anInt5226++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray326[--anInt5226];
										local19 = Static328.aClass315Array1[local13].method7395();
										anIntArray326[anInt5226++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray326[--anInt5226];
										local19 = Static328.aClass315Array1[local13].method7395();
										anIntArray326[anInt5226++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray326[--anInt5226];
										local19 = Static328.aClass315Array1[local13].method7395();
										anIntArray326[anInt5226++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt5226 -= 5;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local25 = anIntArray326[anInt5226 + 2];
										local353 = anIntArray326[anInt5226 + 3];
										local2290 = anIntArray326[anInt5226 + 4];
										anIntArray326[anInt5226++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7070) long local7070;
									@Pc(7063) long local7063;
									if (arg0 == 4007) {
										anInt5226 -= 2;
										local7063 = anIntArray326[anInt5226];
										local7070 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = (int) (local7063 + local7063 * local7070 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										if (local13 == 0) {
											anIntArray326[anInt5226++] = 0;
											return;
										}
										anIntArray326[anInt5226++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										if (local13 == 0) {
											anIntArray326[anInt5226++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray326[anInt5226++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray326[anInt5226++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt5226 -= 3;
										local7063 = anIntArray326[anInt5226];
										local7070 = anIntArray326[anInt5226 + 1];
										@Pc(7451) long local7451 = (long) anIntArray326[anInt5226 + 2];
										anIntArray326[anInt5226++] = (int) (local7063 * local7451 / local7070);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray22[--anInt5223];
										local19 = anIntArray326[--anInt5226];
										aStringArray22[anInt5223++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt5223 -= 2;
										local3888 = aStringArray22[anInt5223];
										local1101 = aStringArray22[anInt5223 + 1];
										aStringArray22[anInt5223++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray22[--anInt5223];
										local19 = anIntArray326[--anInt5226];
										aStringArray22[anInt5223++] = local3888 + Static382.method5669(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray22[--anInt5223];
										aStringArray22[anInt5223++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray22[anInt5223++] = method4406(anIntArray326[--anInt5226]);
										return;
									}
									if (arg0 == 4105) {
										anInt5223 -= 2;
										local3888 = aStringArray22[anInt5223];
										local1101 = aStringArray22[anInt5223 + 1];
										if (Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1 != null && Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1.aBoolean511) {
											aStringArray22[anInt5223++] = local1101;
											return;
										}
										aStringArray22[anInt5223++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray326[--anInt5226];
										aStringArray22[anInt5223++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt5223 -= 2;
										anIntArray326[anInt5226++] = Static71.method4225(aStringArray22[anInt5223 + 1], Static194.anInt3737, aStringArray22[anInt5223]);
										return;
									}
									@Pc(7734) Class256 local7734;
									if (arg0 == 4108) {
										local3888 = aStringArray22[--anInt5223];
										anInt5226 -= 2;
										local19 = anIntArray326[anInt5226];
										local25 = anIntArray326[anInt5226 + 1];
										local7734 = Static242.method4123(local25, Static145.aClass117_76);
										anIntArray326[anInt5226++] = local7734.method6110(local3888, Static22.aClass25Array1, local19);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray22[--anInt5223];
										anInt5226 -= 2;
										local19 = anIntArray326[anInt5226];
										local25 = anIntArray326[anInt5226 + 1];
										local7734 = Static242.method4123(local25, Static145.aClass117_76);
										anIntArray326[anInt5226++] = local7734.method6112(Static22.aClass25Array1, local3888, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt5223 -= 2;
										local3888 = aStringArray22[anInt5223];
										local1101 = aStringArray22[anInt5223 + 1];
										if (anIntArray326[--anInt5226] == 1) {
											aStringArray22[anInt5223++] = local3888;
											return;
										}
										aStringArray22[anInt5223++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray22[--anInt5223];
										aStringArray22[anInt5223++] = Static144.method2730(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray22[--anInt5223];
										local19 = anIntArray326[--anInt5226];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray22[anInt5223++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static442.method6260((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static117.method2267((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static540.method7343((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static121.method2297((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray22[--anInt5223];
										if (local3888 != null) {
											anIntArray326[anInt5226++] = local3888.length();
											return;
										}
										anIntArray326[anInt5226++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray22[--anInt5223];
										anInt5226 -= 2;
										local19 = anIntArray326[anInt5226];
										local25 = anIntArray326[anInt5226 + 1];
										aStringArray22[anInt5223++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray22[--anInt5223];
										@Pc(8097) StringBuffer local8097 = new StringBuffer(local3888.length());
										@Pc(8099) boolean local8099 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(8106) char local8106 = local3888.charAt(local353);
											if (local8106 == '<') {
												local8099 = true;
											} else if (local8106 == '>') {
												local8099 = false;
											} else if (!local8099) {
												local8097.append(local8106);
											}
										}
										aStringArray22[anInt5223++] = local8097.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray22[--anInt5223];
										anInt5226 -= 2;
										local19 = anIntArray326[anInt5226];
										local25 = anIntArray326[anInt5226 + 1];
										anIntArray326[anInt5226++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt5223 -= 2;
										local3888 = aStringArray22[anInt5223];
										local1101 = aStringArray22[anInt5223 + 1];
										local25 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray326[--anInt5226] != 0;
										local19 = anIntArray326[--anInt5226];
										aStringArray22[anInt5223++] = Static14.method521(local412, (long) local19, 0, Static194.anInt3737);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray22[--anInt5223];
										local19 = anIntArray326[--anInt5226];
										@Pc(8320) Class256 local8320 = Static242.method4123(local19, Static145.aClass117_76);
										anIntArray326[anInt5226++] = local8320.method6116(Static22.aClass25Array1, local3888);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray326[--anInt5226];
										aStringArray22[anInt5223++] = Static451.aClass67_2.method2006(local13).aString15;
										return;
									}
									@Pc(8382) Class22 local8382;
									if (arg0 == 4201) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local8382 = Static451.aClass67_2.method2006(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray8[local19 - 1] != null) {
											aStringArray22[anInt5223++] = local8382.aStringArray8[local19 - 1];
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local8382 = Static451.aClass67_2.method2006(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray9[local19 - 1] != null) {
											aStringArray22[anInt5223++] = local8382.aStringArray9[local19 - 1];
											return;
										}
										aStringArray22[anInt5223++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static451.aClass67_2.method2006(local13).anInt576;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static451.aClass67_2.method2006(local13).anInt589 == 1 ? 1 : 0;
										return;
									}
									@Pc(8545) Class22 local8545;
									if (arg0 == 4205) {
										local13 = anIntArray326[--anInt5226];
										local8545 = Static451.aClass67_2.method2006(local13);
										if (local8545.anInt538 == -1 && local8545.anInt565 >= 0) {
											anIntArray326[anInt5226++] = local8545.anInt565;
											return;
										}
										anIntArray326[anInt5226++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray326[--anInt5226];
										local8545 = Static451.aClass67_2.method2006(local13);
										if (local8545.anInt538 >= 0 && local8545.anInt565 >= 0) {
											anIntArray326[anInt5226++] = local8545.anInt565;
											return;
										}
										anIntArray326[anInt5226++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray326[--anInt5226];
										anIntArray326[anInt5226++] = Static451.aClass67_2.method2006(local13).aBoolean19 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local3017 = Static216.aClass298_11.method6969(local19);
										if (local3017.method3275()) {
											aStringArray22[anInt5223++] = Static451.aClass67_2.method2006(local13).method678(local19, local3017.aString38);
											return;
										}
										anIntArray326[anInt5226++] = Static451.aClass67_2.method2006(local13).method674(local19, local3017.anInt3793);
										return;
									}
									if (arg0 == 4209) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1] - 1;
										local8382 = Static451.aClass67_2.method2006(local13);
										if (local8382.anInt556 == local19) {
											anIntArray326[anInt5226++] = local8382.anInt553;
											return;
										}
										if (local8382.anInt552 == local19) {
											anIntArray326[anInt5226++] = local8382.anInt593;
											return;
										}
										anIntArray326[anInt5226++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray22[--anInt5223];
										local19 = anIntArray326[--anInt5226];
										Static503.method6936(local3888, local19 == 1);
										anIntArray326[anInt5226++] = Static273.anInt5367;
										return;
									}
									if (arg0 == 4211) {
										if (Static235.aShortArray46 != null && Static265.anInt5240 < Static273.anInt5367) {
											anIntArray326[anInt5226++] = Static235.aShortArray46[Static265.anInt5240++] & 0xFFFF;
											return;
										}
										anIntArray326[anInt5226++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static265.anInt5240 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local3017 = Static216.aClass298_11.method6969(local19);
										if (local3017.method3275()) {
											aStringArray22[anInt5223++] = Static204.aClass282_1.method6596(local13).method7144(local3017.aString38, local19);
											return;
										}
										anIntArray326[anInt5226++] = Static204.aClass282_1.method6596(local13).method7146(local19, local3017.anInt3793);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local3017 = Static216.aClass298_11.method6969(local19);
										if (local3017.method3275()) {
											aStringArray22[anInt5223++] = Static453.aClass88_3.method2294(local13).method6617(local19, local3017.aString38);
											return;
										}
										anIntArray326[anInt5226++] = Static453.aClass88_3.method2294(local13).method6618(local19, local3017.anInt3793);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt5226 -= 2;
										local13 = anIntArray326[anInt5226];
										local19 = anIntArray326[anInt5226 + 1];
										local3017 = Static216.aClass298_11.method6969(local19);
										if (local3017.method3275()) {
											aStringArray22[anInt5223++] = Static326.aClass115_3.method2913(local13).method7327(local19, local3017.aString38);
											return;
										}
										anIntArray326[anInt5226++] = Static326.aClass115_3.method2913(local13).method7329(local19, local3017.anInt3793);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray326[--anInt5226];
									@Pc(9046) Class281 local9046 = Static201.aClass85_1.method2270(local13);
									if (local9046.anIntArray629 != null && local9046.anIntArray629.length > 0) {
										local25 = 0;
										local353 = local9046.anIntArray630[0];
										for (local2290 = 1; local2290 < local9046.anIntArray629.length; local2290++) {
											if (local9046.anIntArray630[local2290] > local353) {
												local25 = local2290;
												local353 = local9046.anIntArray630[local2290];
											}
										}
										anIntArray326[anInt5226++] = local9046.anIntArray629[local25];
										return;
									}
									anIntArray326[anInt5226++] = local9046.anInt8112;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static352.method5447(anIntArray326[--anInt5226]);
					} else {
						local137 = arg1 ? aClass220_12 : aClass220_13;
					}
					Static377.method5650(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5226 -= 2;
						local19 = anIntArray326[anInt5226];
						local25 = anIntArray326[anInt5226 + 1];
						if (local137.anInt6674 == -1) {
							Static158.method2883(local137.anInt6661);
							Static286.method4828(local137.anInt6661);
							Static173.method3022(local137.anInt6661);
						}
						if (local19 == -1) {
							local137.anInt6675 = 1;
							local137.anInt6612 = -1;
							local137.anInt6641 = -1;
							return;
						}
						local137.anInt6641 = local19;
						local137.anInt6664 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean460 = true;
						} else {
							local137.aBoolean460 = false;
						}
						@Pc(1630) Class22 local1630 = Static451.aClass67_2.method2006(local19);
						local137.anInt6683 = local1630.anInt600;
						local137.anInt6617 = local1630.anInt562;
						local137.anInt6666 = local1630.anInt591;
						local137.anInt6692 = local1630.anInt545;
						local137.anInt6672 = local1630.anInt585;
						local137.anInt6650 = local1630.anInt573;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6688 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6688 = 1;
						} else {
							local137.anInt6688 = 2;
						}
						if (local137.anInt6621 > 0) {
							local137.anInt6650 = local137.anInt6650 * 32 / local137.anInt6621;
							return;
						}
						if (local137.anInt6630 > 0) {
							local137.anInt6650 = local137.anInt6650 * 32 / local137.anInt6630;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6675 = 2;
						local137.anInt6612 = anIntArray326[--anInt5226];
						if (local137.anInt6674 == -1) {
							Static453.method6368(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6675 = 3;
						local137.anInt6612 = -1;
						if (local137.anInt6674 == -1) {
							Static453.method6368(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6675 = 6;
						local137.anInt6612 = anIntArray326[--anInt5226];
						if (local137.anInt6674 == -1) {
							Static453.method6368(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6675 = 5;
						local137.anInt6612 = anIntArray326[--anInt5226];
						if (local137.anInt6674 == -1) {
							Static453.method6368(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5226 -= 4;
						local137.anInt6679 = anIntArray326[anInt5226];
						local137.anInt6620 = anIntArray326[anInt5226 + 1];
						local137.anInt6636 = anIntArray326[anInt5226 + 2];
						local137.anInt6639 = anIntArray326[anInt5226 + 3];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5226 -= 2;
						local137.anInt6677 = anIntArray326[anInt5226];
						local137.anInt6602 = anIntArray326[anInt5226 + 1];
						Static377.method5650(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5226 -= 4;
						local137.anInt6612 = anIntArray326[anInt5226];
						local137.anInt6637 = anIntArray326[anInt5226 + 1];
						if (anIntArray326[anInt5226 + 2] == 1) {
							local137.anInt6675 = 9;
						} else {
							local137.anInt6675 = 8;
						}
						if (anIntArray326[anInt5226 + 3] == 1) {
							local137.aBoolean460 = true;
						} else {
							local137.aBoolean460 = false;
						}
						if (local137.anInt6674 == -1) {
							Static453.method6368(local137.anInt6661);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6675 = 5;
						local137.anInt6612 = Static510.anInt8653;
						local137.anInt6637 = 0;
						if (local137.anInt6674 == -1) {
							Static453.method6368(local137.anInt6661);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!id;II)V")
	public static void method4409(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub2_Sub1 local5 = Static434.method6200(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray325 = new int[local5.anInt213];
		aStringArray23 = new String[local5.anInt209];
		if (local5.aClass142_1 == Static230.aClass142_11 || local5.aClass142_1 == Static74.aClass142_4 || local5.aClass142_1 == Static120.aClass142_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static75.aClass220_4 != null) {
				local30 = Static75.aClass220_4.anInt6603;
				local32 = Static75.aClass220_4.anInt6631;
			}
			anIntArray325[0] = Static280.aClass214_1.method6766() - local30;
			anIntArray325[1] = Static280.aClass214_1.method6770() - local32;
		}
		method4398(local5, 200000);
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
	private static void method4410(@OriginalArg(0) int arg0) {
		@Pc(3) Class220 local3 = Static352.method5447(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class220[] local13 = Static424.aClass220ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class220[] local19 = Static139.aClass220ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static424.aClass220ArrayArray2[local9] = new Class220[local22];
			Static553.method2531(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static553.method2531(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(IZ)V")
	public static void method4411() {
	}
}
