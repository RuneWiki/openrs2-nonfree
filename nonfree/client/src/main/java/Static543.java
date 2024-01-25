import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "Lclient!rh;")
	private static Class308 aClass308_3;

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "Lclient!gca;")
	private static Class3_Sub20 aClass3_Sub20_4;

	@OriginalMember(owner = "client!sga", name = "l", descriptor = "Lclient!kh;")
	private static Class208 aClass208_11;

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "Lclient!jb;")
	private static Class186 aClass186_1;

	@OriginalMember(owner = "client!sga", name = "q", descriptor = "[J")
	private static long[] aLongArray19;

	@OriginalMember(owner = "client!sga", name = "y", descriptor = "Lclient!kh;")
	private static Class208 aClass208_12;

	@OriginalMember(owner = "client!sga", name = "D", descriptor = "[I")
	private static int[] anIntArray578;

	@OriginalMember(owner = "client!sga", name = "E", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray63;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
	private static int anInt8838 = 0;

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray62 = new String[1000];

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
	private static int anInt8841 = 0;

	@OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
	private static int anInt8842 = 0;

	@OriginalMember(owner = "client!sga", name = "j", descriptor = "[I")
	private static final int[] anIntArray575 = new int[1000];

	@OriginalMember(owner = "client!sga", name = "k", descriptor = "[I")
	private static final int[] anIntArray576 = new int[3];

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "[[I")
	private static final int[][] anIntArrayArray90 = new int[5][5000];

	@OriginalMember(owner = "client!sga", name = "r", descriptor = "I")
	private static int anInt8846 = 0;

	@OriginalMember(owner = "client!sga", name = "t", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_51 = new Class279(4);

	@OriginalMember(owner = "client!sga", name = "v", descriptor = "[Lclient!li;")
	private static final Class225[] aClass225Array1 = new Class225[50];

	@OriginalMember(owner = "client!sga", name = "w", descriptor = "[J")
	private static final long[] aLongArray20 = new long[1000];

	@OriginalMember(owner = "client!sga", name = "z", descriptor = "[I")
	private static final int[] anIntArray577 = new int[5];

	@OriginalMember(owner = "client!sga", name = "F", descriptor = "I")
	private static int anInt8853 = 0;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
	private static void method7497(@OriginalArg(0) int arg0) {
		@Pc(3) Class208 local3 = Static676.method8728(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class208[] local13 = Static384.aClass208ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class208[] local19 = Static562.aClass208ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static384.aClass208ArrayArray2[local9] = new Class208[local22];
			Static689.method8053(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static689.method8053(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!dt;)V")
	public static void method7498(@OriginalArg(0) Class3_Sub13 arg0) {
		method7507(arg0, 200000);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method7499(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass308_3.method7291(Static102.aClass181_38.anInt4848 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!fp;I)V")
	private static void method7501(@OriginalArg(0) Class3_Sub6_Sub9 arg0, @OriginalArg(1) int arg1) {
		anInt8846 = 0;
		anInt8841 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray229;
		@Pc(11) int[] local11 = arg0.anIntArray228;
		@Pc(13) byte local13 = -1;
		anInt8842 = 0;
		@Pc(639) int local639;
		try {
			@Pc(17) int local17 = 0;
			label333: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 150) {
					@Pc(1134) boolean local1134;
					if (local11[local5] == 1) {
						local1134 = true;
					} else {
						local1134 = false;
					}
					if (local31 >= 150 && local31 < 5000) {
						method7508(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method7511(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray575[anInt8846++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray575[anInt8846++] = Static592.aClass47_2.anIntArray63[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static592.aClass47_2.method1437(anIntArray575[--anInt8846], local54);
					} else if (local31 == 3) {
						aStringArray62[anInt8841++] = arg0.aStringArray25[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt8846 -= 2;
						if (anIntArray575[anInt8846] != anIntArray575[anInt8846 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt8846 -= 2;
						if (anIntArray575[anInt8846] == anIntArray575[anInt8846 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt8846 -= 2;
						if (anIntArray575[anInt8846] < anIntArray575[anInt8846 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt8846 -= 2;
						if (anIntArray575[anInt8846] > anIntArray575[anInt8846 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt8842 == 0) {
							return;
						}
						@Pc(216) Class225 local216 = aClass225Array1[--anInt8842];
						arg0 = local216.aClass3_Sub6_Sub9_1;
						local8 = arg0.anIntArray229;
						local11 = arg0.anIntArray228;
						local5 = local216.anInt6159;
						anIntArray578 = local216.anIntArray394;
						aStringArray63 = local216.aStringArray43;
						aLongArray19 = local216.aLongArray12;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray575[anInt8846++] = Static592.aClass47_2.method1430(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static592.aClass47_2.method1434(local54, anIntArray575[--anInt8846]);
					} else if (local31 == 31) {
						anInt8846 -= 2;
						if (anIntArray575[anInt8846] <= anIntArray575[anInt8846 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt8846 -= 2;
						if (anIntArray575[anInt8846] >= anIntArray575[anInt8846 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray575[anInt8846++] = anIntArray578[local11[local5]];
					} else if (local31 == 34) {
						anIntArray578[local11[local5]] = anIntArray575[--anInt8846];
					} else if (local31 == 35) {
						aStringArray62[anInt8841++] = aStringArray63[local11[local5]];
					} else if (local31 == 36) {
						aStringArray63[local11[local5]] = aStringArray62[--anInt8841];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt8841 -= local54;
						@Pc(403) String local403 = Static9.method89(local54, anInt8841, aStringArray62);
						aStringArray62[anInt8841++] = local403;
					} else if (local31 == 38) {
						anInt8846--;
					} else if (local31 == 39) {
						anInt8841--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class3_Sub6_Sub9 local439 = Static478.method6826(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt3317];
						@Pc(453) String[] local453 = new String[local439.anInt3310];
						@Pc(457) long[] local457 = new long[local439.anInt3311];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt3313; local459++) {
							local449[local459] = anIntArray575[anInt8846 + local459 - local439.anInt3313];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt3316; local478++) {
							local453[local478] = aStringArray62[anInt8841 + local478 - local439.anInt3316];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt3315; local497++) {
							local457[local497] = aLongArray20[anInt8838 + local497 - local439.anInt3315];
						}
						anInt8846 -= local439.anInt3313;
						anInt8841 -= local439.anInt3316;
						anInt8838 -= local439.anInt3315;
						@Pc(533) Class225 local533 = new Class225();
						local533.aClass3_Sub6_Sub9_1 = arg0;
						local533.anInt6159 = local5;
						local533.anIntArray394 = anIntArray578;
						local533.aStringArray43 = aStringArray63;
						local533.aLongArray12 = aLongArray19;
						if (anInt8842 >= aClass225Array1.length) {
							throw new RuntimeException();
						}
						aClass225Array1[anInt8842++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray229;
						local11 = local439.anIntArray228;
						local5 = -1;
						anIntArray578 = local449;
						aStringArray63 = local453;
						aLongArray19 = local457;
					} else if (local31 == 42) {
						anIntArray575[anInt8846++] = Static79.anIntArray121[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static79.anIntArray121[local54] = anIntArray575[--anInt8846];
						Static565.method7219(local54);
						Static538.aBoolean660 |= Static440.aBooleanArray22[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray575[--anInt8846];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray577[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray90[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray575[--anInt8846];
						if (local639 < 0 || local639 >= anIntArray577[local54]) {
							throw new RuntimeException();
						}
						anIntArray575[anInt8846++] = anIntArrayArray90[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt8846 -= 2;
						local639 = anIntArray575[anInt8846];
						if (local639 < 0 || local639 >= anIntArray577[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray90[local54][local639] = anIntArray575[anInt8846 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static657.aStringArray76[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray62[anInt8841++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static657.aStringArray76[local54] = aStringArray62[--anInt8841];
						Static216.method3397(local54);
					} else if (local31 == 51) {
						@Pc(810) Class62 local810 = arg0.aClass62Array1[local11[local5]];
						@Pc(823) Class3_Sub53 local823 = (Class3_Sub53) local810.method1682((long) anIntArray575[--anInt8846]);
						if (local823 != null) {
							local5 += local823.anInt10023;
						}
					} else if (local31 == 54) {
						aLongArray20[anInt8838++] = arg0.aLongArray1[local5];
					} else if (local31 == 55) {
						anInt8838--;
					} else if (local31 == 66) {
						aLongArray20[anInt8838++] = aLongArray19[local11[local5]];
					} else if (local31 == 67) {
						aLongArray19[local11[local5]] = aLongArray20[--anInt8838];
					} else if (local31 == 68) {
						anInt8838 -= 2;
						if (aLongArray20[anInt8838] != aLongArray20[anInt8838 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt8838 -= 2;
						if (aLongArray20[anInt8838] == aLongArray20[anInt8838 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt8838 -= 2;
						if (aLongArray20[anInt8838] < aLongArray20[anInt8838 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt8838 -= 2;
						if (aLongArray20[anInt8838] > aLongArray20[anInt8838 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt8838 -= 2;
						if (aLongArray20[anInt8838] <= aLongArray20[anInt8838 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt8838 -= 2;
						if (aLongArray20[anInt8838] >= aLongArray20[anInt8838 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray575[--anInt8846] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray575[--anInt8846] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray575[anInt8846++] = method7512(local11[local5]);
					} else if (local31 == 113) {
						anIntArray575[anInt8846++] = method7506(local11[local5]);
					} else if (local31 == 114) {
						aLongArray20[anInt8838++] = method7504(local11[local5]);
					} else if (local31 == 115) {
						aStringArray62[anInt8841++] = method7499(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString35 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong309).append(" ");
				for (local639 = anInt8842 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass225Array1[local639].aClass3_Sub6_Sub9_1.aLong309).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static81.method1711(local1188.toString(), local1169);
			} else {
				Static304.method4693("Clientscript error in: " + arg0.aString35);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString35).append("\n");
				for (local639 = anInt8842 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass225Array1[local639].aClass3_Sub6_Sub9_1.aString35).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static81.method1711(local1188.toString(), local1169);
				Static339.method5160(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(C)I")
	private static int method7502(@OriginalArg(0) char arg0) {
		return Static285.method4504(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "()V")
	public static void method7503() {
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)J")
	private static long method7504(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass308_3.method7292(Static102.aClass181_38.anInt4848 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7505(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static13.anInt164 == 0 && (Static120.aBoolean200 && !Static576.aBoolean681 || Static294.aBoolean272)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static569.aClass335_48.method7694(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static569.aClass335_48.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_49.method7694(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static569.aClass335_49.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_50.method7694(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static569.aClass335_50.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_51.method7694(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static569.aClass335_51.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_52.method7694(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static569.aClass335_52.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_53.method7694(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static569.aClass335_53.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_54.method7694(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static569.aClass335_54.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_55.method7694(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static569.aClass335_55.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_56.method7694(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static569.aClass335_56.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_57.method7694(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static569.aClass335_57.method7694(0).length());
		} else if (local11.startsWith(Class335.lb.method7694(0))) {
			local13 = 10;
			arg0 = arg0.substring(Class335.lb.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_58.method7694(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static569.aClass335_58.method7694(0).length());
		} else if (Static319.anInt5939 != 0) {
			if (local11.startsWith(Static569.aClass335_48.method7694(Static319.anInt5939))) {
				local13 = 0;
				arg0 = arg0.substring(Static569.aClass335_48.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_49.method7694(Static319.anInt5939))) {
				local13 = 1;
				arg0 = arg0.substring(Static569.aClass335_49.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_50.method7694(Static319.anInt5939))) {
				local13 = 2;
				arg0 = arg0.substring(Static569.aClass335_50.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_51.method7694(Static319.anInt5939))) {
				local13 = 3;
				arg0 = arg0.substring(Static569.aClass335_51.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_52.method7694(Static319.anInt5939))) {
				local13 = 4;
				arg0 = arg0.substring(Static569.aClass335_52.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_53.method7694(Static319.anInt5939))) {
				local13 = 5;
				arg0 = arg0.substring(Static569.aClass335_53.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_54.method7694(Static319.anInt5939))) {
				local13 = 6;
				arg0 = arg0.substring(Static569.aClass335_54.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_55.method7694(Static319.anInt5939))) {
				local13 = 7;
				arg0 = arg0.substring(Static569.aClass335_55.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_56.method7694(Static319.anInt5939))) {
				local13 = 8;
				arg0 = arg0.substring(Static569.aClass335_56.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_57.method7694(Static319.anInt5939))) {
				local13 = 9;
				arg0 = arg0.substring(Static569.aClass335_57.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Class335.lb.method7694(Static319.anInt5939))) {
				local13 = 10;
				arg0 = arg0.substring(Class335.lb.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_58.method7694(Static319.anInt5939))) {
				local13 = 11;
				arg0 = arg0.substring(Static569.aClass335_58.method7694(Static319.anInt5939).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static569.aClass335_59.method7694(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static569.aClass335_59.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_60.method7694(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static569.aClass335_60.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_61.method7694(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static569.aClass335_61.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_62.method7694(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static569.aClass335_62.method7694(0).length());
		} else if (local11.startsWith(Static569.aClass335_63.method7694(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static569.aClass335_63.method7694(0).length());
		} else if (Static319.anInt5939 != 0) {
			if (local11.startsWith(Static569.aClass335_59.method7694(Static319.anInt5939))) {
				local451 = 1;
				arg0 = arg0.substring(Static569.aClass335_59.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_60.method7694(Static319.anInt5939))) {
				local451 = 2;
				arg0 = arg0.substring(Static569.aClass335_60.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_61.method7694(Static319.anInt5939))) {
				local451 = 3;
				arg0 = arg0.substring(Static569.aClass335_61.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_62.method7694(Static319.anInt5939))) {
				local451 = 4;
				arg0 = arg0.substring(Static569.aClass335_62.method7694(Static319.anInt5939).length());
			} else if (local11.startsWith(Static569.aClass335_63.method7694(Static319.anInt5939))) {
				local451 = 5;
				arg0 = arg0.substring(Static569.aClass335_63.method7694(Static319.anInt5939).length());
			}
		}
		@Pc(641) Class3_Sub44 local641 = Static275.method5689(Static164.aClass376_43, Static540.aClass282_4);
		local641.aClass3_Sub17_Sub2_3.method4849(0);
		@Pc(650) int local650 = local641.aClass3_Sub17_Sub2_3.lb;
		local641.aClass3_Sub17_Sub2_3.method4849(local13);
		local641.aClass3_Sub17_Sub2_3.method4849(local451);
		Static61.method1525(local641.aClass3_Sub17_Sub2_3, arg0);
		local641.aClass3_Sub17_Sub2_3.method4873(local641.aClass3_Sub17_Sub2_3.lb - local650);
		Static616.method8089(local641);
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)I")
	private static int method7506(@OriginalArg(0) int arg0) {
		@Pc(4) Class223 local4 = Static422.aClass214_1.method4999(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		System.out.println("activeClanSettings:" + aClass308_3);
		@Pc(35) Integer local35 = aClass308_3.method7294(local4.anInt6113, Static102.aClass181_38.anInt4848 << 16 | local4.anInt6115, local4.anInt6112);
		return local35 == null ? 0 : local35;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!dt;I)V")
	private static void method7507(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub6_Sub9 local12 = Static478.method6826(local8);
		if (local12 == null) {
			return;
		}
		anIntArray578 = new int[local12.anInt3317];
		@Pc(21) int local21 = 0;
		aStringArray63 = new String[local12.anInt3310];
		@Pc(27) int local27 = 0;
		aLongArray19 = new long[local12.anInt3311];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt2330;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt2327;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass208_2 == null ? -1 : arg0.aClass208_2.anInt5653;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt2325;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass208_2 == null ? -1 : arg0.aClass208_2.anInt5608;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass208_1 == null ? -1 : arg0.aClass208_1.anInt5653;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass208_1 == null ? -1 : arg0.aClass208_1.anInt5608;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt2324;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt2322;
				}
				anIntArray578[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString27;
				}
				aStringArray63[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray19[local33++] = local165;
			}
		}
		anInt8853 = arg0.anInt2328;
		method7501(local12, arg1);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)V")
	private static void method7508(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class208 local137;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(158) Class208 local158;
		@Pc(35) Class208 local35;
		@Pc(210) Class208 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt8846 -= 3;
				local13 = anIntArray575[anInt8846];
				local19 = anIntArray575[anInt8846 + 1];
				local25 = anIntArray575[anInt8846 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static676.method8728(local13);
				if (local35.aClass208Array20 == null) {
					local35.aClass208Array20 = new Class208[local25 + 1];
				}
				if (local35.aClass208Array20.length <= local25) {
					@Pc(54) Class208[] local54 = new Class208[local25 + 1];
					for (local56 = 0; local56 < local35.aClass208Array20.length; local56++) {
						local54[local56] = local35.aClass208Array20[local56];
					}
					local35.aClass208Array20 = local54;
				}
				if (local25 > 0 && local35.aClass208Array20[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class208 local99 = new Class208();
				local99.anInt5643 = local19;
				local99.anInt5634 = local99.anInt5653 = local35.anInt5653;
				local99.anInt5608 = local25;
				local35.aClass208Array20[local25] = local99;
				if (arg1) {
					aClass208_12 = local99;
				} else {
					aClass208_11 = local99;
				}
				Static374.method5525(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass208_12 : aClass208_11;
				if (local137.anInt5608 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static676.method8728(local137.anInt5653);
				local158.aClass208Array20[local137.anInt5608] = null;
				Static374.method5525(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static676.method8728(anIntArray575[--anInt8846]);
				local137.aClass208Array20 = null;
				Static374.method5525(local137);
				return;
			}
			if (arg0 == 200) {
				anInt8846 -= 2;
				local13 = anIntArray575[anInt8846];
				local19 = anIntArray575[anInt8846 + 1];
				local210 = Static108.method2085(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray575[anInt8846++] = 1;
					if (arg1) {
						aClass208_12 = local210;
						return;
					}
					aClass208_11 = local210;
					return;
				}
				anIntArray575[anInt8846++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray575[--anInt8846];
				local158 = Static676.method8728(local13);
				if (local158 != null) {
					anIntArray575[anInt8846++] = 1;
					if (arg1) {
						aClass208_12 = local158;
						return;
					}
					aClass208_11 = local158;
					return;
				}
				anIntArray575[anInt8846++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray575[--anInt8846];
				method7513(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray575[--anInt8846];
				method7497(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt8846 -= 2;
					local13 = anIntArray575[anInt8846];
					local19 = anIntArray575[anInt8846 + 1];
					if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static554.anIntArray550.length; local25++) {
						if (Static554.anIntArray550[local25] == local13) {
							Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1.method6986(Static605.aClass43_1, local25, local19);
							return;
						}
					}
					for (local357 = 0; local357 < Static546.anIntArray581.length; local357++) {
						if (Static546.anIntArray581[local357] == local13) {
							Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1.method6986(Static605.aClass43_1, local357, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt8846 -= 2;
					local13 = anIntArray575[anInt8846];
					local19 = anIntArray575[anInt8846 + 1];
					if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 == null) {
						return;
					}
					Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1.method6980(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray575[--anInt8846] != 0;
					if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 == null) {
						return;
					}
					Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1.method6978(local420);
					return;
				}
				if (arg0 == 411) {
					anInt8846 -= 2;
					local13 = anIntArray575[anInt8846];
					local19 = anIntArray575[anInt8846 + 1];
					if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 == null) {
						return;
					}
					Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1.method6982(local13, local19, Static237.aClass371_2);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static676.method8728(anIntArray575[--anInt8846]);
				} else {
					local137 = arg1 ? aClass208_12 : aClass208_11;
				}
				if (arg0 == 1000) {
					anInt8846 -= 4;
					local137.anInt5601 = anIntArray575[anInt8846];
					local137.anInt5589 = anIntArray575[anInt8846 + 1];
					local19 = anIntArray575[anInt8846 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray575[anInt8846 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte82 = (byte) local19;
					local137.aByte84 = (byte) local25;
					Static374.method5525(local137);
					Static74.method1623(local137);
					if (local137.anInt5608 == -1) {
						Static533.method7425(local137.anInt5653);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt8846 -= 4;
					local137.anInt5657 = anIntArray575[anInt8846];
					local137.anInt5633 = anIntArray575[anInt8846 + 1];
					local137.anInt5660 = 0;
					local137.anInt5668 = 0;
					local19 = anIntArray575[anInt8846 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray575[anInt8846 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte83 = (byte) local19;
					local137.aByte81 = (byte) local25;
					Static374.method5525(local137);
					Static74.method1623(local137);
					if (local137.anInt5643 == 0) {
						Static650.method8523(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray575[--anInt8846] == 1;
					if (local137.aBoolean445 != local661) {
						local137.aBoolean445 = local661;
						Static374.method5525(local137);
					}
					if (local137.anInt5608 == -1) {
						Static236.method3808(local137.anInt5653);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt8846 -= 2;
					local137.anInt5617 = anIntArray575[anInt8846];
					local137.anInt5588 = anIntArray575[anInt8846 + 1];
					Static374.method5525(local137);
					Static74.method1623(local137);
					if (local137.anInt5643 == 0) {
						Static650.method8523(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean434 = anIntArray575[--anInt8846] == 1;
					return;
				}
			} else {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static676.method8728(anIntArray575[--anInt8846]);
					} else {
						local137 = arg1 ? aClass208_12 : aClass208_11;
					}
					if (arg0 == 1100) {
						anInt8846 -= 2;
						local137.anInt5594 = anIntArray575[anInt8846];
						if (local137.anInt5594 > local137.anInt5604 - local137.anInt5639) {
							local137.anInt5594 = local137.anInt5604 - local137.anInt5639;
						}
						if (local137.anInt5594 < 0) {
							local137.anInt5594 = 0;
						}
						local137.anInt5648 = anIntArray575[anInt8846 + 1];
						if (local137.anInt5648 > local137.anInt5649 - local137.anInt5630) {
							local137.anInt5648 = local137.anInt5649 - local137.anInt5630;
						}
						if (local137.anInt5648 < 0) {
							local137.anInt5648 = 0;
						}
						Static374.method5525(local137);
						if (local137.anInt5608 == -1) {
							Static186.method3007(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt5600 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						if (local137.anInt5608 == -1) {
							Static409.method5649(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean447 = anIntArray575[--anInt8846] == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt5590 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt5627 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray575[--anInt8846];
						if (local137.anInt5620 != local19) {
							local137.anInt5620 = local19;
							Static374.method5525(local137);
						}
						if (local137.anInt5608 == -1) {
							Static451.method6490(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt5616 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean440 = anIntArray575[--anInt8846] == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt5599 = 1;
						local137.anInt5636 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						if (local137.anInt5608 == -1) {
							Static324.method5052(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt8846 -= 6;
						local137.anInt5628 = anIntArray575[anInt8846];
						local137.anInt5624 = anIntArray575[anInt8846 + 1];
						local137.anInt5614 = anIntArray575[anInt8846 + 2];
						local137.anInt5679 = anIntArray575[anInt8846 + 3];
						local137.anInt5672 = anIntArray575[anInt8846 + 4];
						local137.anInt5678 = anIntArray575[anInt8846 + 5];
						Static374.method5525(local137);
						if (local137.anInt5608 == -1) {
							Static201.method3188(local137.anInt5653);
							Static239.method3856(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray575[--anInt8846];
						if (local137.anInt5596 != local19) {
							local137.anInt5596 = local19;
							local137.anInt5656 = 0;
							local137.anInt5591 = 1;
							local137.anInt5655 = 0;
							@Pc(1110) Class48 local1110 = local137.anInt5596 == -1 ? null : Static483.aClass373_2.method8323(local137.anInt5596);
							if (local1110 != null) {
								Static4.method46(local1110, local137.anInt5656);
							}
							Static374.method5525(local137);
						}
						if (local137.anInt5608 == -1) {
							Static598.method7971(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean446 = anIntArray575[--anInt8846] == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray62[--anInt8841];
						if (!local1161.equals(local137.aString69)) {
							local137.aString69 = local1161;
							Static374.method5525(local137);
						}
						if (local137.anInt5608 == -1) {
							Static365.method3468(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt5641 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						if (local137.anInt5608 == -1) {
							Static263.method4136(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt8846 -= 3;
						local137.anInt5638 = anIntArray575[anInt8846];
						local137.anInt5609 = anIntArray575[anInt8846 + 1];
						local137.anInt5676 = anIntArray575[anInt8846 + 2];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean442 = anIntArray575[--anInt8846] == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt5612 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt5665 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean444 = anIntArray575[--anInt8846] == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean441 = anIntArray575[--anInt8846] == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt8846 -= 2;
						local137.anInt5604 = anIntArray575[anInt8846];
						local137.anInt5649 = anIntArray575[anInt8846 + 1];
						Static374.method5525(local137);
						if (local137.anInt5643 == 0) {
							Static650.method8523(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean435 = anIntArray575[--anInt8846] == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt5678 = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						if (local137.anInt5608 == -1) {
							Static201.method3188(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray575[--anInt8846];
						local137.aBoolean436 = local19 == 1;
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt8846 -= 2;
						local137.anInt5598 = anIntArray575[anInt8846];
						local137.anInt5661 = anIntArray575[anInt8846 + 1];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.lb = anIntArray575[--anInt8846];
						Static374.method5525(local137);
						return;
					}
					@Pc(1489) Class328 local1489;
					if (arg0 == 1127) {
						anInt8846 -= 2;
						local19 = anIntArray575[anInt8846];
						local25 = anIntArray575[anInt8846 + 1];
						local1489 = Static145.aClass165_1.method3812(local19);
						if (local25 != local1489.anInt8911) {
							local137.method4716(local25, local19);
							return;
						}
						local137.method4729(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray575[--anInt8846];
						local1523 = aStringArray62[--anInt8841];
						local1489 = Static145.aClass165_1.method3812(local19);
						if (!local1489.aString108.equals(local1523)) {
							local137.method4728(local19, local1523);
							return;
						}
						local137.method4729(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray575[--anInt8846];
						if (local137.anInt5643 != 5 && arg0 == 1129 || local137.anInt5643 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt5625 != local19) {
							local137.anInt5625 = local19;
							Static374.method5525(local137);
						}
						if (local137.anInt5608 == -1) {
							Static415.method5953(local137.anInt5653);
						}
						return;
					}
					@Pc(1610) short local1610;
					@Pc(1617) short local1617;
					if (arg0 == 1131) {
						anInt8846 -= 3;
						local19 = anIntArray575[anInt8846];
						local1610 = (short) anIntArray575[anInt8846 + 1];
						local1617 = (short) anIntArray575[anInt8846 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method4717(local19, local1610, local1617);
							Static374.method5525(local137);
							if (local137.anInt5608 == -1) {
								Static406.method5796(local137.anInt5653, local19);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt8846 -= 3;
						local19 = anIntArray575[anInt8846];
						local1610 = (short) anIntArray575[anInt8846 + 1];
						local1617 = (short) anIntArray575[anInt8846 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method4712(local1617, local1610, local19);
							Static374.method5525(local137);
							if (local137.anInt5608 == -1) {
								Static302.method4658(local137.anInt5653, local19);
							}
							return;
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static676.method8728(anIntArray575[--anInt8846]);
							} else {
								local137 = arg1 ? aClass208_12 : aClass208_11;
							}
							if (arg0 == 1499) {
								local137.method4730();
								return;
							}
							local1161 = aStringArray62[--anInt8841];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray575[--anInt8846];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray575[--anInt8846];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray62[--anInt8841];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray20[--anInt8838]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray575[--anInt8846]);
								}
							}
							local56 = anIntArray575[--anInt8846];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray12 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray34 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray10 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray16 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray17 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray11 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray29 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray5 = local2611;
								local137.anIntArray370 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray25 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray21 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray35 = local2611;
								local137.anIntArray367 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray31 = local2611;
								local137.anIntArray364 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray27 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray4 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray23 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray19 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray6 = local2611;
								local137.anIntArray368 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray28 = local2611;
								local137.anIntArray369 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray18 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray33 = local2611;
							}
							local137.aBoolean432 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass208_12 : aClass208_11;
							if (arg0 == 1500) {
								anIntArray575[anInt8846++] = local137.anInt5592;
								return;
							}
							if (arg0 == 1501) {
								anIntArray575[anInt8846++] = local137.anInt5680;
								return;
							}
							if (arg0 == 1502) {
								anIntArray575[anInt8846++] = local137.anInt5639;
								return;
							}
							if (arg0 == 1503) {
								anIntArray575[anInt8846++] = local137.anInt5630;
								return;
							}
							if (arg0 == 1504) {
								anIntArray575[anInt8846++] = local137.aBoolean445 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray575[anInt8846++] = local137.anInt5634;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static39.method1159(local137);
								anIntArray575[anInt8846++] = local158 == null ? -1 : local158.anInt5653;
								return;
							}
						} else {
							@Pc(3242) Class328 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass208_12 : aClass208_11;
								if (arg0 == 1600) {
									anIntArray575[anInt8846++] = local137.anInt5594;
									return;
								}
								if (arg0 == 1601) {
									anIntArray575[anInt8846++] = local137.anInt5648;
									return;
								}
								if (arg0 == 1602) {
									aStringArray62[anInt8841++] = local137.aString69;
									return;
								}
								if (arg0 == 1603) {
									anIntArray575[anInt8846++] = local137.anInt5604;
									return;
								}
								if (arg0 == 1604) {
									anIntArray575[anInt8846++] = local137.anInt5649;
									return;
								}
								if (arg0 == 1605) {
									anIntArray575[anInt8846++] = local137.anInt5678;
									return;
								}
								if (arg0 == 1606) {
									anIntArray575[anInt8846++] = local137.anInt5614;
									return;
								}
								if (arg0 == 1607) {
									anIntArray575[anInt8846++] = local137.anInt5672;
									return;
								}
								if (arg0 == 1608) {
									anIntArray575[anInt8846++] = local137.anInt5679;
									return;
								}
								if (arg0 == 1609) {
									anIntArray575[anInt8846++] = local137.anInt5590;
									return;
								}
								if (arg0 == 1610) {
									anIntArray575[anInt8846++] = local137.anInt5628;
									return;
								}
								if (arg0 == 1611) {
									anIntArray575[anInt8846++] = local137.anInt5624;
									return;
								}
								if (arg0 == 1612) {
									anIntArray575[anInt8846++] = local137.anInt5620;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray575[--anInt8846];
									local3242 = Static145.aClass165_1.method3812(local19);
									if (local3242.method7566()) {
										aStringArray62[anInt8841++] = local137.method4724(local19, local3242.aString108);
										return;
									}
									anIntArray575[anInt8846++] = local137.method4727(local19, local3242.anInt8911);
									return;
								}
								if (arg0 == 1614) {
									anIntArray575[anInt8846++] = local137.anInt5616;
									return;
								}
								if (arg0 == 2614) {
									anIntArray575[anInt8846++] = local137.anInt5599 == 1 ? local137.anInt5636 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass208_12 : aClass208_11;
								if (arg0 == 1700) {
									anIntArray575[anInt8846++] = local137.anInt5645;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt5645 != -1) {
										anIntArray575[anInt8846++] = local137.anInt5605;
										return;
									}
									anIntArray575[anInt8846++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray575[anInt8846++] = local137.anInt5608;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass208_12 : aClass208_11;
								if (arg0 == 1800) {
									anIntArray575[anInt8846++] = Static82.method1754(local137).method40();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray575[--anInt8846];
									local19--;
									if (local137.aStringArray41 != null && local19 < local137.aStringArray41.length && local137.aStringArray41[local19] != null) {
										aStringArray62[anInt8841++] = local137.aStringArray41[local19];
										return;
									}
									aStringArray62[anInt8841++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString70 == null) {
										aStringArray62[anInt8841++] = "";
										return;
									}
									aStringArray62[anInt8841++] = local137.aString70;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static676.method8728(anIntArray575[--anInt8846]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass208_12 : aClass208_11;
								}
								if (anInt8853 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray32 == null) {
										return;
									}
									@Pc(3511) Class3_Sub13 local3511 = new Class3_Sub13();
									local3511.aClass208_2 = local137;
									local3511.anObjectArray1 = local137.anObjectArray32;
									local3511.anInt2328 = anInt8853 + 1;
									Static257.aClass193_27.method4462(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static676.method8728(anIntArray575[--anInt8846]);
								if (arg0 == 2500) {
									anIntArray575[anInt8846++] = local137.anInt5592;
									return;
								}
								if (arg0 == 2501) {
									anIntArray575[anInt8846++] = local137.anInt5680;
									return;
								}
								if (arg0 == 2502) {
									anIntArray575[anInt8846++] = local137.anInt5639;
									return;
								}
								if (arg0 == 2503) {
									anIntArray575[anInt8846++] = local137.anInt5630;
									return;
								}
								if (arg0 == 2504) {
									anIntArray575[anInt8846++] = local137.aBoolean445 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray575[anInt8846++] = local137.anInt5634;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static39.method1159(local137);
									anIntArray575[anInt8846++] = local158 == null ? -1 : local158.anInt5653;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static676.method8728(anIntArray575[--anInt8846]);
								if (arg0 == 2600) {
									anIntArray575[anInt8846++] = local137.anInt5594;
									return;
								}
								if (arg0 == 2601) {
									anIntArray575[anInt8846++] = local137.anInt5648;
									return;
								}
								if (arg0 == 2602) {
									aStringArray62[anInt8841++] = local137.aString69;
									return;
								}
								if (arg0 == 2603) {
									anIntArray575[anInt8846++] = local137.anInt5604;
									return;
								}
								if (arg0 == 2604) {
									anIntArray575[anInt8846++] = local137.anInt5649;
									return;
								}
								if (arg0 == 2605) {
									anIntArray575[anInt8846++] = local137.anInt5678;
									return;
								}
								if (arg0 == 2606) {
									anIntArray575[anInt8846++] = local137.anInt5614;
									return;
								}
								if (arg0 == 2607) {
									anIntArray575[anInt8846++] = local137.anInt5672;
									return;
								}
								if (arg0 == 2608) {
									anIntArray575[anInt8846++] = local137.anInt5679;
									return;
								}
								if (arg0 == 2609) {
									anIntArray575[anInt8846++] = local137.anInt5590;
									return;
								}
								if (arg0 == 2610) {
									anIntArray575[anInt8846++] = local137.anInt5628;
									return;
								}
								if (arg0 == 2611) {
									anIntArray575[anInt8846++] = local137.anInt5624;
									return;
								}
								if (arg0 == 2612) {
									anIntArray575[anInt8846++] = local137.anInt5620;
									return;
								}
								if (arg0 == 2613) {
									anIntArray575[anInt8846++] = local137.anInt5616;
									return;
								}
								if (arg0 == 2614) {
									anIntArray575[anInt8846++] = local137.anInt5599 == 1 ? local137.anInt5636 : -1;
									return;
								}
							} else {
								@Pc(4040) Class3_Sub28 local4040;
								@Pc(3938) Class3_Sub28 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static676.method8728(anIntArray575[--anInt8846]);
										anIntArray575[anInt8846++] = local137.anInt5645;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static676.method8728(anIntArray575[--anInt8846]);
										if (local137.anInt5645 != -1) {
											anIntArray575[anInt8846++] = local137.anInt5605;
											return;
										}
										anIntArray575[anInt8846++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray575[--anInt8846];
										local3938 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local13);
										if (local3938 != null) {
											anIntArray575[anInt8846++] = 1;
											return;
										}
										anIntArray575[anInt8846++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static676.method8728(anIntArray575[--anInt8846]);
										if (local137.aClass208Array20 == null) {
											anIntArray575[anInt8846++] = 0;
											return;
										}
										local19 = local137.aClass208Array20.length;
										for (local25 = 0; local25 < local137.aClass208Array20.length; local25++) {
											if (local137.aClass208Array20[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray575[anInt8846++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt8846 -= 2;
										local13 = anIntArray575[anInt8846];
										local19 = anIntArray575[anInt8846 + 1];
										local4040 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local13);
										if (local4040 != null && local4040.anInt5252 == local19) {
											anIntArray575[anInt8846++] = 1;
											return;
										}
										anIntArray575[anInt8846++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static676.method8728(anIntArray575[--anInt8846]);
									if (arg0 == 2800) {
										anIntArray575[anInt8846++] = Static82.method1754(local137).method40();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray575[--anInt8846];
										local19--;
										if (local137.aStringArray41 != null && local19 < local137.aStringArray41.length && local137.aStringArray41[local19] != null) {
											aStringArray62[anInt8841++] = local137.aStringArray41[local19];
											return;
										}
										aStringArray62[anInt8841++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString70 == null) {
											aStringArray62[anInt8841++] = "";
											return;
										}
										aStringArray62[anInt8841++] = local137.aString70;
										return;
									}
								} else {
									@Pc(4266) Class3_Sub44 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray62[--anInt8841];
											Static325.method5060(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt8846 -= 2;
											Static434.method6372(anIntArray575[anInt8846], anIntArray575[anInt8846 + 1], Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2);
											return;
										}
										if (arg0 == 3103) {
											Static549.method4296();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray62[--anInt8841];
											local19 = 0;
											if (Static363.method5417(local4177)) {
												local19 = Static305.method4695(local4177);
											}
											@Pc(4237) Class3_Sub44 local4237 = Static275.method5689(Static452.aClass376_108, Static540.aClass282_4);
											local4237.aClass3_Sub17_Sub2_3.method4854(local19);
											Static616.method8089(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray62[--anInt8841];
											local4266 = Static275.method5689(Static63.aClass376_117, Static540.aClass282_4);
											local4266.aClass3_Sub17_Sub2_3.method4849(local4177.length() + 1);
											local4266.aClass3_Sub17_Sub2_3.method4878(local4177);
											Static616.method8089(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray62[--anInt8841];
											local4266 = Static275.method5689(Static132.aClass376_39, Static540.aClass282_4);
											local4266.aClass3_Sub17_Sub2_3.method4849(local4177.length() + 1);
											local4266.aClass3_Sub17_Sub2_3.method4878(local4177);
											Static616.method8089(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray575[--anInt8846];
											local1161 = aStringArray62[--anInt8841];
											Static517.method7340(local13, local1161);
											return;
										}
										if (arg0 == 3108) {
											anInt8846 -= 3;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local25 = anIntArray575[anInt8846 + 2];
											local35 = Static676.method8728(local25);
											Static677.method8740(local19, local13, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local210 = arg1 ? aClass208_12 : aClass208_11;
											Static677.method8740(local19, local13, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray575[--anInt8846];
											local4266 = Static275.method5689(Static230.aClass376_62, Static540.aClass282_4);
											local4266.aClass3_Sub17_Sub2_3.method4876(local13);
											Static616.method8089(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local4040 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local13);
											if (local4040 != null) {
												Static414.method5937(local4040.anInt5252 != local19, local4040, true);
											}
											Static624.method8248(local19, true, 3, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt8846--;
											local13 = anIntArray575[anInt8846];
											local3938 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local13);
											if (local3938 != null && local3938.anInt5253 == 3) {
												Static414.method5937(true, local3938, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static280.method4444(aStringArray62[--anInt8841]);
											return;
										}
										if (arg0 == 3114) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local1523 = aStringArray62[--anInt8841];
											Static310.method4784(local13, local1523, "", "", local19, "");
											return;
										}
										if (arg0 == 3115) {
											anInt8846 -= 11;
											@Pc(4567) Class92[] local4567 = Static146.method2531();
											@Pc(4570) Class65[] local4570 = Static657.method8561();
											Static587.method7889(local4567[anIntArray575[anInt8846]], anIntArray575[anInt8846 + 7], anIntArray575[anInt8846 + 6], anIntArray575[anInt8846 + 10], local4570[anIntArray575[anInt8846 + 1]], anIntArray575[anInt8846 + 4], anIntArray575[anInt8846 + 3], anIntArray575[anInt8846 + 9], anIntArray575[anInt8846 + 8], anIntArray575[anInt8846 + 2], anIntArray575[anInt8846 + 5]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray575[--anInt8846];
											local4266 = Static275.method5689(Static107.aClass376_31, Static540.aClass282_4);
											local4266.aClass3_Sub17_Sub2_3.method4876(local13);
											Static616.method8089(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray62[--anInt8841];
											local4266 = Static275.method5689(Static18.aClass376_5, Static540.aClass282_4);
											local4266.aClass3_Sub17_Sub2_3.method4849(local4177.length() + 1);
											local4266.aClass3_Sub17_Sub2_3.method4878(local4177);
											Static616.method8089(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt8846 -= 3;
											Static117.method2135(anIntArray575[anInt8846 + 1], anIntArray575[anInt8846], anIntArray575[anInt8846 + 2], 255, 256);
											return;
										}
										if (arg0 == 3201) {
											Static420.method5994(255, anIntArray575[--anInt8846], 50);
											return;
										}
										if (arg0 == 3202) {
											anInt8846 -= 2;
											Static310.method4787(anIntArray575[anInt8846 + 1], 255, anIntArray575[anInt8846]);
											return;
										}
										if (arg0 == 3203) {
											anInt8846 -= 4;
											Static117.method2135(anIntArray575[anInt8846 + 1], anIntArray575[anInt8846], anIntArray575[anInt8846 + 2], anIntArray575[anInt8846 + 3], 256);
											return;
										}
										if (arg0 == 3204) {
											anInt8846 -= 3;
											Static420.method5994(anIntArray575[anInt8846 + 1], anIntArray575[anInt8846], anIntArray575[anInt8846 + 2]);
											return;
										}
										if (arg0 == 3205) {
											anInt8846 -= 3;
											Static310.method4787(anIntArray575[anInt8846 + 1], anIntArray575[anInt8846 + 2], anIntArray575[anInt8846]);
											return;
										}
										if (arg0 == 3206) {
											anInt8846 -= 4;
											Static645.method8448(anIntArray575[anInt8846 + 3], anIntArray575[anInt8846 + 1], anIntArray575[anInt8846], anIntArray575[anInt8846 + 2], 256, false);
											return;
										}
										if (arg0 == 3207) {
											anInt8846 -= 4;
											Static645.method8448(anIntArray575[anInt8846 + 3], anIntArray575[anInt8846 + 1], anIntArray575[anInt8846], anIntArray575[anInt8846 + 2], 256, true);
											return;
										}
										if (arg0 == 3208) {
											anInt8846 -= 5;
											Static117.method2135(anIntArray575[anInt8846 + 1], anIntArray575[anInt8846], anIntArray575[anInt8846 + 2], anIntArray575[anInt8846 + 3], anIntArray575[anInt8846 + 4]);
											return;
										}
										if (arg0 == 3209) {
											anInt8846 -= 5;
											Static645.method8448(anIntArray575[anInt8846 + 3], anIntArray575[anInt8846 + 1], anIntArray575[anInt8846], anIntArray575[anInt8846 + 2], anIntArray575[anInt8846 + 4], false);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray575[anInt8846++] = Static621.anInt9665;
											return;
										}
										if (arg0 == 3301) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static474.method6821(false, local13, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static158.method2725(local13, local19, false);
											return;
										}
										if (arg0 == 3303) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static622.method8243(local19, false, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static483.aClass339_1.method7795(local13).anInt2359;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static185.anIntArray238[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static126.anIntArray159[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static21.anIntArray15[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142;
											local19 = (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >> 9) + Static417.anInt7047;
											local25 = (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >> 9) + Static347.anInt7851;
											anIntArray575[anInt8846++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray575[anInt8846++] = Static375.aBoolean505 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static474.method6821(true, local13, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static158.method2725(local13, local19, true);
											return;
										}
										if (arg0 == 3315) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static622.method8243(local19, true, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static13.anInt164 >= 2) {
												anIntArray575[anInt8846++] = Static13.anInt164;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray575[anInt8846++] = Static253.anInt4769;
											return;
										}
										if (arg0 == 3318) {
											anIntArray575[anInt8846++] = Static605.aClass161_7.anInt4423;
											return;
										}
										if (arg0 == 3321) {
											anIntArray575[anInt8846++] = Static58.anInt1450;
											return;
										}
										if (arg0 == 3322) {
											anIntArray575[anInt8846++] = Static339.anInt6146;
											return;
										}
										if (arg0 == 3323) {
											if (Static314.anInt5879 >= 5 && Static314.anInt5879 <= 9) {
												anIntArray575[anInt8846++] = 1;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static314.anInt5879 >= 5 && Static314.anInt5879 <= 9) {
												anIntArray575[anInt8846++] = Static314.anInt5879;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray575[anInt8846++] = Static127.aBoolean203 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray575[anInt8846++] = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3272;
											return;
										}
										if (arg0 == 3327) {
											anIntArray575[anInt8846++] = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 != null && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1.aBoolean627 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray575[anInt8846++] = Static294.aBoolean272 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static25.method796(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static128.method2247(false, local19, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											anIntArray575[anInt8846++] = Static128.method2247(true, local19, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray575[anInt8846++] = Static558.anInt8991;
											return;
										}
										if (arg0 == 3335) {
											anIntArray575[anInt8846++] = Static319.anInt5939;
											return;
										}
										if (arg0 == 3336) {
											anInt8846 -= 4;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local25 = anIntArray575[anInt8846 + 2];
											local357 = anIntArray575[anInt8846 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray575[anInt8846++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray575[anInt8846++] = Static88.anInt1933;
											return;
										}
										if (arg0 == 3338) {
											anIntArray575[anInt8846++] = Static424.method6048();
											return;
										}
										if (arg0 == 3339) {
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray575[anInt8846++] = Static474.aBoolean613 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray575[anInt8846++] = Static606.aBoolean710 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray575[anInt8846++] = Static542.aClass75_1.method8412();
											return;
										}
										if (arg0 == 3343) {
											anIntArray575[anInt8846++] = Static542.aClass75_1.method8405();
											return;
										}
										if (arg0 == 3344) {
											aStringArray62[anInt8841++] = Static41.method1181();
											return;
										}
										if (arg0 == 3345) {
											aStringArray62[anInt8841++] = Static646.method8453();
											return;
										}
										if (arg0 == 3346) {
											anIntArray575[anInt8846++] = Static6.method66();
											return;
										}
										if (arg0 == 3347) {
											anIntArray575[anInt8846++] = Static129.anInt2452;
											return;
										}
										if (arg0 == 3349) {
											anIntArray575[anInt8846++] = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass314_7.method7395() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5908) Class300 local5908;
										if (arg0 == 3400) {
											anInt8846 -= 2;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local5908 = Static466.aClass49_1.method1528(local13);
											aStringArray62[anInt8841++] = local5908.method7155(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt8846 -= 4;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local25 = anIntArray575[anInt8846 + 2];
											local357 = anIntArray575[anInt8846 + 3];
											@Pc(5954) Class300 local5954 = Static466.aClass49_1.method1528(local25);
											if (local5954.aChar3 == local13 && local5954.aChar4 == local19) {
												if (local19 == 115) {
													aStringArray62[anInt8841++] = local5954.method7155(local357);
													return;
												}
												anIntArray575[anInt8846++] = local5954.method7153(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt8846 -= 3;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local25 = anIntArray575[anInt8846 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6040) Class300 local6040 = Static466.aClass49_1.method1528(local19);
											if (local6040.aChar4 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray575[anInt8846++] = local6040.method7158(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray575[--anInt8846];
											local1161 = aStringArray62[--anInt8841];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5908 = Static466.aClass49_1.method1528(local13);
											if (local5908.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray575[anInt8846++] = local5908.method7156(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray575[--anInt8846];
											@Pc(6138) Class300 local6138 = Static466.aClass49_1.method1528(local13);
											anIntArray575[anInt8846++] = local6138.aClass62_42.method1688();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static280.anInt5246 == 0) {
												anIntArray575[anInt8846++] = -2;
												return;
											}
											if (Static280.anInt5246 == 1) {
												anIntArray575[anInt8846++] = -1;
												return;
											}
											anIntArray575[anInt8846++] = Static121.anInt2381;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray575[--anInt8846];
											if (Static280.anInt5246 == 2 && local13 < Static121.anInt2381) {
												aStringArray62[anInt8841++] = Static260.aStringArray36[local13];
												if (Static217.aStringArray32[local13] != null) {
													aStringArray62[anInt8841++] = Static217.aStringArray32[local13];
													return;
												}
												aStringArray62[anInt8841++] = "";
												return;
											}
											aStringArray62[anInt8841++] = "";
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray575[--anInt8846];
											if (Static280.anInt5246 == 2 && local13 < Static121.anInt2381) {
												anIntArray575[anInt8846++] = Static544.anIntArray579[local13];
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray575[--anInt8846];
											if (Static280.anInt5246 == 2 && local13 < Static121.anInt2381) {
												anIntArray575[anInt8846++] = Static28.anIntArray21[local13];
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray62[--anInt8841];
											local19 = anIntArray575[--anInt8846];
											Static109.method2089(local19, local4177);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray62[--anInt8841];
											Static585.method7869(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray62[--anInt8841];
											Static112.method2101(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray62[--anInt8841];
											Static87.method1797(false, local4177);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray62[--anInt8841];
											Static92.method1872(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray62[--anInt8841];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray575[anInt8846++] = Static15.method144(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray575[--anInt8846];
											if (Static280.anInt5246 == 2 && local13 < Static121.anInt2381) {
												aStringArray62[anInt8841++] = Static641.aStringArray73[local13];
												return;
											}
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static58.aString15 != null) {
												aStringArray62[anInt8841++] = Static117.method2133(Static58.aString15);
												return;
											}
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static58.aString15 != null) {
												anIntArray575[anInt8846++] = Static168.anInt3046;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray575[--anInt8846];
											if (Static58.aString15 != null && local13 < Static168.anInt3046) {
												aStringArray62[anInt8841++] = Static199.aClass172Array30[local13].aString58;
												return;
											}
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray575[--anInt8846];
											if (Static58.aString15 != null && local13 < Static168.anInt3046) {
												anIntArray575[anInt8846++] = Static199.aClass172Array30[local13].anInt4587;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray575[--anInt8846];
											if (Static58.aString15 != null && local13 < Static168.anInt3046) {
												anIntArray575[anInt8846++] = Static199.aClass172Array30[local13].aByte67;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray575[anInt8846++] = Static602.aByte133;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray62[--anInt8841];
											Static646.method8454(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray575[anInt8846++] = Static186.aByte55;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray62[--anInt8841];
											Static466.method6675(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static630.method8311();
											return;
										}
										if (arg0 == 3621) {
											if (Static280.anInt5246 == 0) {
												anIntArray575[anInt8846++] = -1;
												return;
											}
											anIntArray575[anInt8846++] = Static173.anInt3293;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray575[--anInt8846];
											if (Static280.anInt5246 != 0 && local13 < Static173.anInt3293) {
												aStringArray62[anInt8841++] = Static564.aStringArray72[local13];
												if (Static196.aStringArray26[local13] != null) {
													aStringArray62[anInt8841++] = Static196.aStringArray26[local13];
													return;
												}
												aStringArray62[anInt8841++] = "";
												return;
											}
											aStringArray62[anInt8841++] = "";
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray62[--anInt8841];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray575[anInt8846++] = Static410.method5823(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray575[--anInt8846];
											if (Static199.aClass172Array30 != null && local13 < Static168.anInt3046 && Static199.aClass172Array30[local13].aString56.equalsIgnoreCase(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34)) {
												anIntArray575[anInt8846++] = 1;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static275.aString94 != null) {
												aStringArray62[anInt8841++] = Static275.aString94;
												return;
											}
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray575[--anInt8846];
											if (Static58.aString15 != null && local13 < Static168.anInt3046) {
												aStringArray62[anInt8841++] = Static199.aClass172Array30[local13].aString57;
												return;
											}
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray575[--anInt8846];
											if (Static280.anInt5246 == 2 && local13 >= 0 && local13 < Static121.anInt2381) {
												anIntArray575[anInt8846++] = Static64.aBooleanArray7[local13] ? 1 : 0;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray62[--anInt8841];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray575[anInt8846++] = Static27.method839(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray575[anInt8846++] = Static149.anInt2811;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray62[--anInt8841];
											Static87.method1797(true, local4177);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static173.aBooleanArray14[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray575[--anInt8846];
											if (Static58.aString15 != null && local13 < Static168.anInt3046) {
												aStringArray62[anInt8841++] = Static199.aClass172Array30[local13].aString56;
												return;
											}
											aStringArray62[anInt8841++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray575[--anInt8846];
											if (Static280.anInt5246 != 0 && local13 < Static173.anInt3293) {
												aStringArray62[anInt8841++] = Static614.aStringArray68[local13];
												return;
											}
											aStringArray62[anInt8841++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static338.aClass308_2 != null) {
												anIntArray575[anInt8846++] = 1;
												aClass308_3 = Static338.aClass308_2;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static45.aClass308_1 != null) {
												anIntArray575[anInt8846++] = 1;
												aClass308_3 = Static45.aClass308_1;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray62[anInt8841++] = aClass308_3.aString106;
											return;
										}
										if (arg0 == 3703) {
											anIntArray575[anInt8846++] = aClass308_3.aBoolean644 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray575[anInt8846++] = aClass308_3.aByte117;
											return;
										}
										if (arg0 == 3705) {
											anIntArray575[anInt8846++] = aClass308_3.aByte114;
											return;
										}
										if (arg0 == 3706) {
											anIntArray575[anInt8846++] = aClass308_3.aByte115;
											return;
										}
										if (arg0 == 3707) {
											anIntArray575[anInt8846++] = aClass308_3.aByte116;
											return;
										}
										if (arg0 == 3709) {
											anIntArray575[anInt8846++] = aClass308_3.anInt8619;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray575[--anInt8846];
											aStringArray62[anInt8841++] = aClass308_3.aStringArray60[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = aClass308_3.aByteArray95[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray575[anInt8846++] = aClass308_3.anInt8618;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray575[--anInt8846];
											aStringArray62[anInt8841++] = aClass308_3.aStringArray59[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt8846 -= 3;
											local13 = anIntArray575[anInt8846];
											local19 = anIntArray575[anInt8846 + 1];
											local25 = anIntArray575[anInt8846 + 2];
											anIntArray575[anInt8846++] = aClass308_3.method7293(local25, local13, local19);
											return;
										}
										if (arg0 == 3715) {
											anIntArray575[anInt8846++] = aClass308_3.anInt8603;
											return;
										}
										if (arg0 == 3716) {
											anIntArray575[anInt8846++] = aClass308_3.anInt8605;
											return;
										}
										if (arg0 == 3750) {
											if (Static656.aClass3_Sub20_2 != null) {
												anIntArray575[anInt8846++] = 1;
												aClass3_Sub20_4 = Static656.aClass3_Sub20_2;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static430.aClass3_Sub20_3 != null) {
												anIntArray575[anInt8846++] = 1;
												aClass3_Sub20_4 = Static430.aClass3_Sub20_3;
												return;
											}
											anIntArray575[anInt8846++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray62[anInt8841++] = aClass3_Sub20_4.aString43;
											return;
										}
										if (arg0 == 3753) {
											anIntArray575[anInt8846++] = aClass3_Sub20_4.aByte56;
											return;
										}
										if (arg0 == 3754) {
											anIntArray575[anInt8846++] = aClass3_Sub20_4.aByte57;
											return;
										}
										if (arg0 == 3755) {
											anIntArray575[anInt8846++] = aClass3_Sub20_4.anInt3447;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray575[--anInt8846];
											aStringArray62[anInt8841++] = aClass3_Sub20_4.aClass170Array1[local13].aString55;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = aClass3_Sub20_4.aClass170Array1[local13].aByte66;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = aClass3_Sub20_4.aClass170Array1[local13].anInt4576;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray575[--anInt8846];
											Static39.method1162(aClass3_Sub20_4 == Static430.aClass3_Sub20_3, local13);
											return;
										}
										if (arg0 == 3760) {
											anIntArray575[anInt8846++] = aClass3_Sub20_4.method3031(aStringArray62[--anInt8841]);
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static55.aClass98Array1[local13].method2275();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static55.aClass98Array1[local13].anInt2475;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static55.aClass98Array1[local13].anInt2479;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static55.aClass98Array1[local13].anInt2476;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static55.aClass98Array1[local13].anInt2483;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray575[--anInt8846];
											anIntArray575[anInt8846++] = Static55.aClass98Array1[local13].anInt2474;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray575[--anInt8846];
											local19 = Static55.aClass98Array1[local13].method2276();
											anIntArray575[anInt8846++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray575[--anInt8846];
											local19 = Static55.aClass98Array1[local13].method2276();
											anIntArray575[anInt8846++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray575[--anInt8846];
											local19 = Static55.aClass98Array1[local13].method2276();
											anIntArray575[anInt8846++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray575[--anInt8846];
											local19 = Static55.aClass98Array1[local13].method2276();
											anIntArray575[anInt8846++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8150) long local8150;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt8846 -= 5;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												local25 = anIntArray575[anInt8846 + 2];
												local357 = anIntArray575[anInt8846 + 3];
												local2473 = anIntArray575[anInt8846 + 4];
												anIntArray575[anInt8846++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8157) long local8157;
											if (arg0 == 4007) {
												anInt8846 -= 2;
												local8150 = (long) anIntArray575[anInt8846];
												local8157 = (long) anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = (int) (local8150 + local8150 * local8157 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												if (local13 == 0) {
													anIntArray575[anInt8846++] = 0;
													return;
												}
												anIntArray575[anInt8846++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												if (local13 == 0) {
													anIntArray575[anInt8846++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray575[anInt8846++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray575[anInt8846++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt8846 -= 3;
												local8150 = (long) anIntArray575[anInt8846];
												local8157 = (long) anIntArray575[anInt8846 + 1];
												@Pc(8538) long local8538 = (long) anIntArray575[anInt8846 + 2];
												anIntArray575[anInt8846++] = (int) (local8150 * local8538 / local8157);
												return;
											}
											if (arg0 == 4019) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray575[anInt8846++] = 256;
												}
												@Pc(8597) double local8597 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray575[anInt8846++] = (int) (Math.pow(2.0D, local8597) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static422.anIntArray448[Static231.method3710(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray62[--anInt8841];
												local19 = anIntArray575[--anInt8846];
												aStringArray62[anInt8841++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt8841 -= 2;
												local4177 = aStringArray62[anInt8841];
												local1161 = aStringArray62[anInt8841 + 1];
												aStringArray62[anInt8841++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray62[--anInt8841];
												local19 = anIntArray575[--anInt8846];
												aStringArray62[anInt8841++] = local4177 + Static268.method4276(local19, true);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray62[--anInt8841];
												aStringArray62[anInt8841++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray62[anInt8841++] = Static216.method3396(Static606.method8039(anIntArray575[--anInt8846]), Static319.anInt5939);
												return;
											}
											if (arg0 == 4105) {
												anInt8841 -= 2;
												local4177 = aStringArray62[anInt8841];
												local1161 = aStringArray62[anInt8841 + 1];
												if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 != null && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1.aBoolean627) {
													aStringArray62[anInt8841++] = local1161;
													return;
												}
												aStringArray62[anInt8841++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray575[--anInt8846];
												aStringArray62[anInt8841++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt8841 -= 2;
												anIntArray575[anInt8846++] = Static499.method7105(aStringArray62[anInt8841], aStringArray62[anInt8841 + 1], Static319.anInt5939);
												return;
											}
											@Pc(8910) Class202 local8910;
											if (arg0 == 4108) {
												local4177 = aStringArray62[--anInt8841];
												anInt8846 -= 2;
												local19 = anIntArray575[anInt8846];
												local25 = anIntArray575[anInt8846 + 1];
												local8910 = Static102.method2014(local25, Static41.aClass143_11);
												anIntArray575[anInt8846++] = local8910.method4633(local4177, local19, Static111.aClass102Array25);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray62[--anInt8841];
												anInt8846 -= 2;
												local19 = anIntArray575[anInt8846];
												local25 = anIntArray575[anInt8846 + 1];
												local8910 = Static102.method2014(local25, Static41.aClass143_11);
												anIntArray575[anInt8846++] = local8910.method4626(local19, Static111.aClass102Array25, local4177);
												return;
											}
											if (arg0 == 4110) {
												anInt8841 -= 2;
												local4177 = aStringArray62[anInt8841];
												local1161 = aStringArray62[anInt8841 + 1];
												if (anIntArray575[--anInt8846] == 1) {
													aStringArray62[anInt8841++] = local4177;
													return;
												}
												aStringArray62[anInt8841++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray62[--anInt8841];
												aStringArray62[anInt8841++] = Static648.method8491(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray62[--anInt8841];
												local19 = anIntArray575[--anInt8846];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray62[anInt8841++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = method7502((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static496.method7044((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static227.method3626((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static124.method2202((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray62[--anInt8841];
												if (local4177 != null) {
													anIntArray575[anInt8846++] = local4177.length();
													return;
												}
												anIntArray575[anInt8846++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray62[--anInt8841];
												anInt8846 -= 2;
												local19 = anIntArray575[anInt8846];
												local25 = anIntArray575[anInt8846 + 1];
												aStringArray62[anInt8841++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray62[--anInt8841];
												@Pc(9268) StringBuffer local9268 = new StringBuffer(local4177.length());
												@Pc(9270) boolean local9270 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9277) char local9277 = local4177.charAt(local357);
													if (local9277 == '<') {
														local9270 = true;
													} else if (local9277 == '>') {
														local9270 = false;
													} else if (!local9270) {
														local9268.append(local9277);
													}
												}
												aStringArray62[anInt8841++] = local9268.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray62[--anInt8841];
												anInt8846 -= 2;
												local19 = anIntArray575[anInt8846];
												local25 = anIntArray575[anInt8846 + 1];
												anIntArray575[anInt8846++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt8841 -= 2;
												local4177 = aStringArray62[anInt8841];
												local1161 = aStringArray62[anInt8841 + 1];
												local25 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray575[--anInt8846] != 0;
												local19 = anIntArray575[--anInt8846];
												aStringArray62[anInt8841++] = Static529.method7390((long) local19, local420, 0, Static319.anInt5939);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray62[--anInt8841];
												local19 = anIntArray575[--anInt8846];
												@Pc(9491) Class202 local9491 = Static102.method2014(local19, Static41.aClass143_11);
												anIntArray575[anInt8846++] = local9491.method4624(local4177, Static111.aClass102Array25);
												return;
											}
											if (arg0 == 4126) {
												aStringArray62[anInt8841++] = Static515.method7298((long) anIntArray575[--anInt8846] * 60000L, Static319.anInt5939);
												return;
											}
											if (arg0 == 4127) {
												local8150 = aLongArray20[--anInt8838];
												aStringArray62[anInt8841++] = local8150 == -1L ? "" : Long.toString(local8150, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray575[--anInt8846];
												aStringArray62[anInt8841++] = Static237.aClass371_2.method8305(local13).aString46;
												return;
											}
											@Pc(9606) Class146 local9606;
											if (arg0 == 4201) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												local9606 = Static237.aClass371_2.method8305(local13);
												if (local19 >= 1 && local19 <= 5 && local9606.aStringArray29[local19 - 1] != null) {
													aStringArray62[anInt8841++] = local9606.aStringArray29[local19 - 1];
													return;
												}
												aStringArray62[anInt8841++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												local9606 = Static237.aClass371_2.method8305(local13);
												if (local19 >= 1 && local19 <= 5 && local9606.aStringArray28[local19 - 1] != null) {
													aStringArray62[anInt8841++] = local9606.aStringArray28[local19 - 1];
													return;
												}
												aStringArray62[anInt8841++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static237.aClass371_2.method8305(local13).anInt3684;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static237.aClass371_2.method8305(local13).anInt3696 == 1 ? 1 : 0;
												return;
											}
											@Pc(9769) Class146 local9769;
											if (arg0 == 4205) {
												local13 = anIntArray575[--anInt8846];
												local9769 = Static237.aClass371_2.method8305(local13);
												if (local9769.anInt3673 == -1 && local9769.anInt3709 >= 0) {
													anIntArray575[anInt8846++] = local9769.anInt3709;
													return;
												}
												anIntArray575[anInt8846++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray575[--anInt8846];
												local9769 = Static237.aClass371_2.method8305(local13);
												if (local9769.anInt3673 >= 0 && local9769.anInt3709 >= 0) {
													anIntArray575[anInt8846++] = local9769.anInt3709;
													return;
												}
												anIntArray575[anInt8846++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static237.aClass371_2.method8305(local13).aBoolean291 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												local3242 = Static145.aClass165_1.method3812(local19);
												if (local3242.method7566()) {
													aStringArray62[anInt8841++] = Static237.aClass371_2.method8305(local13).method3193(local19, local3242.aString108);
													return;
												}
												anIntArray575[anInt8846++] = Static237.aClass371_2.method8305(local13).method3206(local3242.anInt8911, local19);
												return;
											}
											if (arg0 == 4209) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1] - 1;
												local9606 = Static237.aClass371_2.method8305(local13);
												if (local9606.anInt3669 == local19) {
													anIntArray575[anInt8846++] = local9606.anInt3706;
													return;
												}
												if (local9606.anInt3677 == local19) {
													anIntArray575[anInt8846++] = local9606.anInt3662;
													return;
												}
												anIntArray575[anInt8846++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray62[--anInt8841];
												local19 = anIntArray575[--anInt8846];
												Static586.method7871(local19 == 1, local4177);
												anIntArray575[anInt8846++] = Static380.anInt6678;
												return;
											}
											if (arg0 == 4211) {
												if (Static505.aShortArray168 != null && Static341.anInt6164 < Static380.anInt6678) {
													anIntArray575[anInt8846++] = Static505.aShortArray168[Static341.anInt6164++] & 0xFFFF;
													return;
												}
												anIntArray575[anInt8846++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static341.anInt6164 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray575[--anInt8846];
												anIntArray575[anInt8846++] = Static237.aClass371_2.method8305(local13).anInt3700;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray62[--anInt8841];
												anInt8846 -= 3;
												local19 = anIntArray575[anInt8846];
												local25 = anIntArray575[anInt8846 + 1];
												local357 = anIntArray575[anInt8846 + 2];
												Static224.method3479(local25, local19 == 1, local4177, local357);
												anIntArray575[anInt8846++] = Static380.anInt6678;
												return;
											}
											if (arg0 == 4215) {
												anInt8841 -= 2;
												anInt8846 -= 2;
												local4177 = aStringArray62[anInt8841];
												local19 = anIntArray575[anInt8846];
												local25 = anIntArray575[anInt8846 + 1];
												@Pc(10168) String local10168 = aStringArray62[anInt8841 + 1];
												Static558.method7629(local10168, local19 == 1, local4177, local25);
												anIntArray575[anInt8846++] = Static380.anInt6678;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												local3242 = Static145.aClass165_1.method3812(local19);
												if (local3242.method7566()) {
													aStringArray62[anInt8841++] = Static481.aClass241_2.method5582(local13).method53(local19, local3242.aString108);
													return;
												}
												anIntArray575[anInt8846++] = Static481.aClass241_2.method5582(local13).method57(local19, local3242.anInt8911);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												local3242 = Static145.aClass165_1.method3812(local19);
												if (local3242.method7566()) {
													aStringArray62[anInt8841++] = Static349.aClass374_2.method8357(local13).method4021(local3242.aString108, local19);
													return;
												}
												anIntArray575[anInt8846++] = Static349.aClass374_2.method8357(local13).method4015(local3242.anInt8911, local19);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt8846 -= 2;
												local13 = anIntArray575[anInt8846];
												local19 = anIntArray575[anInt8846 + 1];
												local3242 = Static145.aClass165_1.method3812(local19);
												if (local3242.method7566()) {
													aStringArray62[anInt8841++] = Static415.aClass154_1.method3383(local13).method1617(local19, local3242.aString108);
													return;
												}
												anIntArray575[anInt8846++] = Static415.aClass154_1.method3383(local13).method1616(local19, local3242.anInt8911);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray575[--anInt8846];
												@Pc(10396) Class351 local10396 = Static658.aClass88_2.method2132(local13);
												if (local10396.anIntArray612 != null && local10396.anIntArray612.length > 0) {
													local25 = 0;
													local357 = local10396.anIntArray611[0];
													for (local2473 = 1; local2473 < local10396.anIntArray612.length; local2473++) {
														if (local10396.anIntArray611[local2473] > local357) {
															local25 = local2473;
															local357 = local10396.anIntArray611[local2473];
														}
													}
													anIntArray575[anInt8846++] = local10396.anIntArray612[local25];
													return;
												}
												anIntArray575[anInt8846++] = local10396.anInt9388;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray575[anInt8846++] = Static364.aBoolean496 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray62[--anInt8841];
												if (Static520.anInt6836 == 7 && Static216.anInt3999 == 0) {
													if (local4177.length() > 20) {
														Static602.aByte134 = -4;
														return;
													}
													Static602.aByte134 = -1;
													local4266 = Static275.method5689(Static593.aClass376_136, Static540.aClass282_4);
													local4266.aClass3_Sub17_Sub2_3.method4849(0);
													local25 = local4266.aClass3_Sub17_Sub2_3.lb;
													local4266.aClass3_Sub17_Sub2_3.method4878(local4177);
													local4266.aClass3_Sub17_Sub2_3.method4873(local4266.aClass3_Sub17_Sub2_3.lb - local25);
													Static616.method8089(local4266);
													return;
												}
												Static602.aByte134 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray575[anInt8846++] = Static602.aByte134;
												if (Static602.aByte134 != -1) {
													Static602.aByte134 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static676.method8728(anIntArray575[--anInt8846]);
						} else {
							local137 = arg1 ? aClass208_12 : aClass208_11;
						}
						if (arg0 == 1300) {
							local19 = anIntArray575[--anInt8846] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method4713(aStringArray62[--anInt8841], local19);
								return;
							}
							anInt8841--;
							return;
						}
						if (arg0 == 1301) {
							anInt8846 -= 2;
							local19 = anIntArray575[anInt8846];
							local25 = anIntArray575[anInt8846 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass208_6 = null;
								return;
							}
							local137.aClass208_6 = Static108.method2085(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray575[--anInt8846];
							if (local19 != Static26.anInt758 && local19 != Static301.anInt5499 && local19 != Static643.anInt9914) {
								return;
							}
							local137.anInt5675 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt5621 = anIntArray575[--anInt8846];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt5654 = anIntArray575[--anInt8846];
							return;
						}
						if (arg0 == 1305) {
							local137.aString70 = aStringArray62[--anInt8841];
							return;
						}
						if (arg0 == 1306) {
							local137.aString68 = aStringArray62[--anInt8841];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray41 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt5640 = anIntArray575[--anInt8846];
							local137.anInt5646 = anIntArray575[--anInt8846];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray575[--anInt8846];
							local25 = anIntArray575[--anInt8846];
							if (local25 >= 1 && local25 <= 10) {
								local137.method4725(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString67 = aStringArray62[--anInt8841];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt5667 = anIntArray575[--anInt8846];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt8846 -= 3;
								local19 = anIntArray575[anInt8846] - 1;
								local25 = anIntArray575[anInt8846 + 1];
								local357 = anIntArray575[anInt8846 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt8846 -= 2;
								local19 = 10;
								local25 = anIntArray575[anInt8846];
								local357 = anIntArray575[anInt8846 + 1];
							}
							if (local137.aByteArray58 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray58 = new byte[11];
								local137.aByteArray57 = new byte[11];
								local137.anIntArray371 = new int[11];
							}
							local137.aByteArray58[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean438 = false;
								for (local2473 = 0; local2473 < local137.aByteArray58.length; local2473++) {
									if (local137.aByteArray58[local2473] != 0) {
										local137.aBoolean438 = true;
										break;
									}
								}
							} else {
								local137.aBoolean438 = true;
							}
							local137.aByteArray57[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt5629 = anIntArray575[--anInt8846];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static676.method8728(anIntArray575[--anInt8846]);
					} else {
						local137 = arg1 ? aClass208_12 : aClass208_11;
					}
					Static374.method5525(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt8846 -= 2;
						local19 = anIntArray575[anInt8846];
						local25 = anIntArray575[anInt8846 + 1];
						if (local137.anInt5608 == -1) {
							Static225.method3513(local137.anInt5653);
							Static201.method3188(local137.anInt5653);
							Static239.method3856(local137.anInt5653);
						}
						if (local19 == -1) {
							local137.anInt5599 = 1;
							local137.anInt5636 = -1;
							local137.anInt5645 = -1;
							return;
						}
						local137.anInt5645 = local19;
						local137.anInt5605 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean433 = true;
						} else {
							local137.aBoolean433 = false;
						}
						@Pc(1813) Class146 local1813 = Static237.aClass371_2.method8305(local19);
						local137.anInt5614 = local1813.anInt3704;
						local137.anInt5679 = local1813.anInt3686;
						local137.anInt5672 = local1813.anInt3702;
						local137.anInt5628 = local1813.anInt3682;
						local137.anInt5624 = local1813.anInt3710;
						local137.anInt5678 = local1813.anInt3724;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt5606 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt5606 = 1;
						} else {
							local137.anInt5606 = 2;
						}
						if (local137.anInt5660 > 0) {
							local137.anInt5678 = local137.anInt5678 * 32 / local137.anInt5660;
							return;
						}
						if (local137.anInt5657 > 0) {
							local137.anInt5678 = local137.anInt5678 * 32 / local137.anInt5657;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt5599 = 2;
						local137.anInt5636 = anIntArray575[--anInt8846];
						if (local137.anInt5608 == -1) {
							Static324.method5052(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt5599 = 3;
						local137.anInt5636 = -1;
						if (local137.anInt5608 == -1) {
							Static324.method5052(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt5599 = 6;
						local137.anInt5636 = anIntArray575[--anInt8846];
						if (local137.anInt5608 == -1) {
							Static324.method5052(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt5599 = 5;
						local137.anInt5636 = anIntArray575[--anInt8846];
						if (local137.anInt5608 == -1) {
							Static324.method5052(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt8846 -= 4;
						local137.anInt5644 = anIntArray575[anInt8846];
						local137.anInt5666 = anIntArray575[anInt8846 + 1];
						local137.anInt5593 = anIntArray575[anInt8846 + 2];
						local137.anInt5663 = anIntArray575[anInt8846 + 3];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt8846 -= 2;
						local137.anInt5622 = anIntArray575[anInt8846];
						local137.anInt5658 = anIntArray575[anInt8846 + 1];
						Static374.method5525(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt8846 -= 4;
						local137.anInt5636 = anIntArray575[anInt8846];
						local137.anInt5603 = anIntArray575[anInt8846 + 1];
						if (anIntArray575[anInt8846 + 2] == 1) {
							local137.anInt5599 = 9;
						} else {
							local137.anInt5599 = 8;
						}
						if (anIntArray575[anInt8846 + 3] == 1) {
							local137.aBoolean433 = true;
						} else {
							local137.aBoolean433 = false;
						}
						if (local137.anInt5608 == -1) {
							Static324.method5052(local137.anInt5653);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt5599 = 5;
						local137.anInt5636 = Static251.anInt4687;
						local137.anInt5603 = 0;
						if (local137.anInt5608 == -1) {
							Static324.method5052(local137.anInt5653);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(IZ)V")
	public static void method7509() {
	}

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "(I)V")
	public static void method7510(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static368.method5461(arg0)) {
			return;
		}
		@Pc(12) Class208[] local12 = Static562.aClass208ArrayArray3[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class208 local19 = local12[local14];
			if (local19.anObjectArray7 != null) {
				@Pc(26) Class3_Sub13 local26 = new Class3_Sub13();
				local26.aClass208_2 = local19;
				local26.anObjectArray1 = local19.anObjectArray7;
				method7507(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(IZ)V")
	private static void method7511(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub44 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray575[anInt8846++] = Static579.anInt9187;
				return;
			}
			if (arg0 == 5001) {
				anInt8846 -= 3;
				Static579.anInt9187 = anIntArray575[anInt8846];
				Static11.aClass270_1 = Static325.method5061(anIntArray575[anInt8846 + 1]);
				if (Static11.aClass270_1 == null) {
					Static11.aClass270_1 = Static360.aClass270_14;
				}
				Static366.anInt6484 = anIntArray575[anInt8846 + 2];
				local52 = Static275.method5689(Static96.aClass376_27, Static540.aClass282_4);
				local52.aClass3_Sub17_Sub2_3.method4849(Static579.anInt9187);
				local52.aClass3_Sub17_Sub2_3.method4849(Static11.aClass270_1.anInt7654);
				local52.aClass3_Sub17_Sub2_3.method4849(Static366.anInt6484);
				Static616.method8089(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt8841 -= 2;
				local83 = aStringArray62[anInt8841];
				local89 = aStringArray62[anInt8841 + 1];
				anInt8846 -= 2;
				local97 = anIntArray575[anInt8846];
				local103 = anIntArray575[anInt8846 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub44 local125 = Static275.method5689(Static648.aClass376_144, Static540.aClass282_4);
				local125.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(local83) + Static153.method2617(local89) + 2);
				local125.aClass3_Sub17_Sub2_3.method4878(local83);
				local125.aClass3_Sub17_Sub2_3.method4849(local97 - 1);
				local125.aClass3_Sub17_Sub2_3.method4849(local103);
				local125.aClass3_Sub17_Sub2_3.method4878(local89);
				Static616.method8089(local125);
				return;
			}
			@Pc(179) Class131 local179;
			if (arg0 == 5003) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local181 = "";
				if (local179 != null && local179.aString38 != null) {
					local181 = local179.aString38;
				}
				aStringArray62[anInt8841++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3324;
				}
				anIntArray575[anInt8846++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static11.aClass270_1 == null) {
					anIntArray575[anInt8846++] = -1;
					return;
				}
				anIntArray575[anInt8846++] = Static11.aClass270_1.anInt7654;
				return;
			}
			@Pc(269) Class3_Sub44 local269;
			if (arg0 == 5006) {
				local175 = anIntArray575[--anInt8846];
				local269 = Static275.method5689(Static208.aClass376_53, Static540.aClass282_4);
				local269.aClass3_Sub17_Sub2_3.method4849(local175);
				Static616.method8089(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray62[--anInt8841];
				method7505(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt8841 -= 2;
				local83 = aStringArray62[anInt8841];
				local89 = aStringArray62[anInt8841 + 1];
				if (Static13.anInt164 != 0 || (!Static120.aBoolean200 || Static576.aBoolean681) && !Static294.aBoolean272) {
					@Pc(328) Class3_Sub44 local328 = Static275.method5689(Static510.aClass376_122, Static540.aClass282_4);
					local328.aClass3_Sub17_Sub2_3.method4849(0);
					local103 = local328.aClass3_Sub17_Sub2_3.lb;
					local328.aClass3_Sub17_Sub2_3.method4878(local83);
					Static61.method1525(local328.aClass3_Sub17_Sub2_3, local89);
					local328.aClass3_Sub17_Sub2_3.method4873(local328.aClass3_Sub17_Sub2_3.lb - local103);
					Static616.method8089(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local181 = "";
				if (local179 != null && local179.aString36 != null) {
					local181 = local179.aString36;
				}
				aStringArray62[anInt8841++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local181 = "";
				if (local179 != null && local179.aString40 != null) {
					local181 = local179.aString40;
				}
				aStringArray62[anInt8841++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3328;
				}
				anIntArray575[anInt8846++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == null || Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString33 == null) {
					local83 = "";
				} else {
					local83 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method2903();
				}
				aStringArray62[anInt8841++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray575[anInt8846++] = Static366.anInt6484;
				return;
			}
			if (arg0 == 5017) {
				anIntArray575[anInt8846++] = Static117.method2128();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt3325;
				}
				anIntArray575[anInt8846++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local181 = "";
				if (local179 != null && local179.aString37 != null) {
					local181 = local179.aString37;
				}
				aStringArray62[anInt8841++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == null || Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString33 == null) {
					local83 = "";
				} else {
					local83 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method2902();
				}
				aStringArray62[anInt8841++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3329;
				}
				anIntArray575[anInt8846++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3327;
				}
				anIntArray575[anInt8846++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray575[--anInt8846];
				local179 = Static57.method6344(local175);
				local181 = "";
				if (local179 != null && local179.aString39 != null) {
					local181 = local179.aString39;
				}
				aStringArray62[anInt8841++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray575[--anInt8846];
				aStringArray62[anInt8841++] = Static271.aClass78_1.method2042(local175).aString115;
				return;
			}
			@Pc(736) Class3_Sub6_Sub19 local736;
			if (arg0 == 5051) {
				local175 = anIntArray575[--anInt8846];
				local736 = Static271.aClass78_1.method2042(local175);
				if (local736.anIntArray600 == null) {
					anIntArray575[anInt8846++] = 0;
					return;
				}
				anIntArray575[anInt8846++] = local736.anIntArray600.length;
				return;
			}
			if (arg0 == 5052) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				@Pc(781) Class3_Sub6_Sub19 local781 = Static271.aClass78_1.method2042(local175);
				local103 = local781.anIntArray600[local776];
				anIntArray575[anInt8846++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray575[--anInt8846];
				local736 = Static271.aClass78_1.method2042(local175);
				if (local736.anIntArray601 == null) {
					anIntArray575[anInt8846++] = 0;
					return;
				}
				anIntArray575[anInt8846++] = local736.anIntArray601.length;
				return;
			}
			if (arg0 == 5054) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				anIntArray575[anInt8846++] = Static271.aClass78_1.method2042(local175).anIntArray601[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray575[--anInt8846];
				aStringArray62[anInt8841++] = Static264.aClass263_2.method6363(local175).method1165();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray575[--anInt8846];
				@Pc(907) Class3_Sub6_Sub1 local907 = Static264.aClass263_2.method6363(local175);
				if (local907.anIntArray44 == null) {
					anIntArray575[anInt8846++] = 0;
					return;
				}
				anIntArray575[anInt8846++] = local907.anIntArray44.length;
				return;
			}
			if (arg0 == 5057) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				anIntArray575[anInt8846++] = Static264.aClass263_2.method6363(local175).anIntArray44[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass186_1 = new Class186();
				aClass186_1.anInt5049 = anIntArray575[--anInt8846];
				aClass186_1.aClass3_Sub6_Sub1_1 = Static264.aClass263_2.method6363(aClass186_1.anInt5049);
				aClass186_1.anIntArray334 = new int[aClass186_1.aClass3_Sub6_Sub1_1.method1161()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static275.method5689(Static620.aClass376_146, Static540.aClass282_4);
				local52.aClass3_Sub17_Sub2_3.method4849(0);
				local776 = local52.aClass3_Sub17_Sub2_3.lb;
				local52.aClass3_Sub17_Sub2_3.method4849(0);
				local52.aClass3_Sub17_Sub2_3.method4876(aClass186_1.anInt5049);
				aClass186_1.aClass3_Sub6_Sub1_1.method1163(local52.aClass3_Sub17_Sub2_3, aClass186_1.anIntArray334);
				local52.aClass3_Sub17_Sub2_3.method4873(local52.aClass3_Sub17_Sub2_3.lb - local776);
				Static616.method8089(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray62[--anInt8841];
				local269 = Static275.method5689(Static341.aClass376_87, Static540.aClass282_4);
				local269.aClass3_Sub17_Sub2_3.method4849(0);
				local97 = local269.aClass3_Sub17_Sub2_3.lb;
				local269.aClass3_Sub17_Sub2_3.method4878(local83);
				local269.aClass3_Sub17_Sub2_3.method4876(aClass186_1.anInt5049);
				aClass186_1.aClass3_Sub6_Sub1_1.method1163(local269.aClass3_Sub17_Sub2_3, aClass186_1.anIntArray334);
				local269.aClass3_Sub17_Sub2_3.method4873(local269.aClass3_Sub17_Sub2_3.lb - local97);
				Static616.method8089(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static275.method5689(Static620.aClass376_146, Static540.aClass282_4);
				local52.aClass3_Sub17_Sub2_3.method4849(0);
				local776 = local52.aClass3_Sub17_Sub2_3.lb;
				local52.aClass3_Sub17_Sub2_3.method4849(1);
				local52.aClass3_Sub17_Sub2_3.method4876(aClass186_1.anInt5049);
				aClass186_1.aClass3_Sub6_Sub1_1.method1163(local52.aClass3_Sub17_Sub2_3, aClass186_1.anIntArray334);
				local52.aClass3_Sub17_Sub2_3.method4873(local52.aClass3_Sub17_Sub2_3.lb - local776);
				Static616.method8089(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				anIntArray575[anInt8846++] = Static271.aClass78_1.method2042(local175).aCharArray8[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				anIntArray575[anInt8846++] = Static271.aClass78_1.method2042(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				if (local776 == -1) {
					anIntArray575[anInt8846++] = -1;
					return;
				}
				anIntArray575[anInt8846++] = Static271.aClass78_1.method2042(local175).method7766((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				if (local776 == -1) {
					anIntArray575[anInt8846++] = -1;
					return;
				}
				anIntArray575[anInt8846++] = Static271.aClass78_1.method2042(local175).method7770((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray575[--anInt8846];
				anIntArray575[anInt8846++] = Static264.aClass263_2.method6363(local175).method1161();
				return;
			}
			if (arg0 == 5067) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				local97 = Static264.aClass263_2.method6363(local175).method1157(local776).anInt10234;
				anIntArray575[anInt8846++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				aClass186_1.anIntArray334[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt8846 -= 2;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				aClass186_1.anIntArray334[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt8846 -= 3;
				local175 = anIntArray575[anInt8846];
				local776 = anIntArray575[anInt8846 + 1];
				local97 = anIntArray575[anInt8846 + 2];
				@Pc(1448) Class3_Sub6_Sub1 local1448 = Static264.aClass263_2.method6363(local175);
				if (local1448.method1157(local776).anInt10234 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray575[anInt8846++] = local1448.method1158(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray62[--anInt8841];
				local1496 = anIntArray575[--anInt8846] == 1;
				Static449.method6474(local83, local1496);
				anIntArray575[anInt8846++] = Static380.anInt6678;
				return;
			}
			if (arg0 == 5072) {
				if (Static505.aShortArray168 != null && Static341.anInt6164 < Static380.anInt6678) {
					anIntArray575[anInt8846++] = Static505.aShortArray168[Static341.anInt6164++] & 0xFFFF;
					return;
				}
				anIntArray575[anInt8846++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static341.anInt6164 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static530.aClass284_1.method7637(86)) {
					anIntArray575[anInt8846++] = 1;
					return;
				}
				anIntArray575[anInt8846++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static530.aClass284_1.method7637(82)) {
					anIntArray575[anInt8846++] = 1;
					return;
				}
				anIntArray575[anInt8846++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static530.aClass284_1.method7637(81)) {
					anIntArray575[anInt8846++] = 1;
					return;
				}
				anIntArray575[anInt8846++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static621.method8231(anIntArray575[--anInt8846]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray575[anInt8846++] = Static34.method1087();
					return;
				}
				if (arg0 == 5205) {
					Static163.method2752(anIntArray575[--anInt8846], -1, false, -1);
					return;
				}
				@Pc(1696) Class3_Sub6_Sub13 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray575[--anInt8846];
					local1696 = Static574.method7092(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = local1696.anInt5161;
					return;
				}
				@Pc(1729) Class3_Sub6_Sub13 local1729;
				if (arg0 == 5207) {
					local1729 = Static574.method7076(anIntArray575[--anInt8846]);
					if (local1729 != null && local1729.aString65 != null) {
						aStringArray62[anInt8841++] = local1729.aString65;
						return;
					}
					aStringArray62[anInt8841++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray575[anInt8846++] = Static479.anInt8118;
					anIntArray575[anInt8846++] = Static104.anInt2196;
					return;
				}
				if (arg0 == 5209) {
					anIntArray575[anInt8846++] = Static176.anInt3320 + Static574.anInt8361;
					anIntArray575[anInt8846++] = Static462.anInt7931 + Static574.anInt8366;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray575[--anInt8846];
					local1696 = Static574.method7076(local175);
					if (local1696 == null) {
						anIntArray575[anInt8846++] = 0;
						anIntArray575[anInt8846++] = 0;
						return;
					}
					anIntArray575[anInt8846++] = local1696.anInt5167 >> 14 & 0x3FFF;
					anIntArray575[anInt8846++] = local1696.anInt5167 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray575[--anInt8846];
					local1696 = Static574.method7076(local175);
					if (local1696 == null) {
						anIntArray575[anInt8846++] = 0;
						anIntArray575[anInt8846++] = 0;
						return;
					}
					anIntArray575[anInt8846++] = local1696.anInt5172 - local1696.anInt5176;
					anIntArray575[anInt8846++] = local1696.anInt5169 - local1696.anInt5162;
					return;
				}
				@Pc(1919) Class3_Sub8 local1919;
				if (arg0 == 5212) {
					local1919 = Static33.method1061();
					if (local1919 == null) {
						anIntArray575[anInt8846++] = -1;
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = local1919.anInt1242;
					local776 = local1919.anInt1248 << 28 | local1919.anInt1246 + Static574.anInt8361 << 14 | local1919.anInt1249 + Static574.anInt8366;
					anIntArray575[anInt8846++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static667.method8672();
					if (local1919 == null) {
						anIntArray575[anInt8846++] = -1;
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = local1919.anInt1242;
					local776 = local1919.anInt1248 << 28 | local1919.anInt1246 + Static574.anInt8361 << 14 | local1919.anInt1249 + Static574.anInt8366;
					anIntArray575[anInt8846++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray575[--anInt8846];
					local1696 = Static610.method8050();
					if (local1696 != null) {
						local2067 = local1696.method4388(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, anIntArray576);
						if (local2067) {
							Static320.method5018(anIntArray576[1], anIntArray576[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt8846 -= 2;
					local175 = anIntArray575[anInt8846];
					local776 = anIntArray575[anInt8846 + 1];
					@Pc(2105) Class258 local2105 = Static574.method7090(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub6_Sub13 local2112 = (Class3_Sub6_Sub13) local2105.method5934(); local2112 != null; local2112 = (Class3_Sub6_Sub13) local2105.method5929()) {
						if (local2112.anInt5161 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray575[anInt8846++] = 1;
						return;
					}
					anIntArray575[anInt8846++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray575[--anInt8846];
					local1696 = Static574.method7076(local175);
					if (local1696 == null) {
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = local1696.anInt5166;
					return;
				}
				if (arg0 == 5220) {
					anIntArray575[anInt8846++] = Static678.anInt10338 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray575[--anInt8846];
					Static320.method5018(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static610.method8050();
					if (local1729 != null) {
						local1496 = local1729.method4387(Static176.anInt3320 + Static574.anInt8361, anIntArray576, Static462.anInt7931 + Static574.anInt8366);
						if (local1496) {
							anIntArray575[anInt8846++] = anIntArray576[1];
							anIntArray575[anInt8846++] = anIntArray576[2];
							return;
						}
						anIntArray575[anInt8846++] = -1;
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = -1;
					anIntArray575[anInt8846++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt8846 -= 2;
					local175 = anIntArray575[anInt8846];
					local776 = anIntArray575[anInt8846 + 1];
					Static163.method2752(local175, local776 >> 14 & 0x3FFF, false, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray575[--anInt8846];
					local1696 = Static610.method8050();
					if (local1696 != null) {
						local2067 = local1696.method4388(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, anIntArray576);
						if (local2067) {
							anIntArray575[anInt8846++] = anIntArray576[1];
							anIntArray575[anInt8846++] = anIntArray576[2];
							return;
						}
						anIntArray575[anInt8846++] = -1;
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = -1;
					anIntArray575[anInt8846++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray575[--anInt8846];
					local1696 = Static610.method8050();
					if (local1696 != null) {
						local2067 = local1696.method4387(local175 >> 14 & 0x3FFF, anIntArray576, local175 & 0x3FFF);
						if (local2067) {
							anIntArray575[anInt8846++] = anIntArray576[1];
							anIntArray575[anInt8846++] = anIntArray576[2];
							return;
						}
						anIntArray575[anInt8846++] = -1;
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = -1;
					anIntArray575[anInt8846++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static110.method2096(anIntArray575[--anInt8846]);
					return;
				}
				if (arg0 == 5227) {
					anInt8846 -= 2;
					local175 = anIntArray575[anInt8846];
					local776 = anIntArray575[anInt8846 + 1];
					Static163.method2752(local175, local776 >> 14 & 0x3FFF, true, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static290.aBoolean413 = anIntArray575[--anInt8846] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray575[anInt8846++] = Static290.aBoolean413 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray575[--anInt8846];
					Static243.method3909(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt8846 -= 2;
					local175 = anIntArray575[anInt8846];
					local1496 = anIntArray575[anInt8846 + 1] == 1;
					if (Static57.aClass62_33 != null) {
						local2625 = Static57.aClass62_33.method1682((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8770();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static57.aClass62_33.method1686((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray575[--anInt8846];
					if (Static57.aClass62_33 != null) {
						local2667 = Static57.aClass62_33.method1682((long) local175);
						anIntArray575[anInt8846++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray575[anInt8846++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt8846 -= 2;
					local175 = anIntArray575[anInt8846];
					local1496 = anIntArray575[anInt8846 + 1] == 1;
					if (Static632.aClass62_50 != null) {
						local2625 = Static632.aClass62_50.method1682((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8770();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static632.aClass62_50.method1686((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray575[--anInt8846];
					if (Static632.aClass62_50 != null) {
						local2667 = Static632.aClass62_50.method1682((long) local175);
						anIntArray575[anInt8846++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray575[anInt8846++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray575[anInt8846++] = Static574.aClass3_Sub6_Sub13_3 == null ? -1 : Static574.aClass3_Sub6_Sub13_3.anInt5161;
					return;
				}
				if (arg0 == 5236) {
					anInt8846 -= 2;
					local175 = anIntArray575[anInt8846];
					local776 = anIntArray575[anInt8846 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static268.method4278(local103, local175, local97);
					if (local2833 < 0) {
						anIntArray575[anInt8846++] = -1;
						return;
					}
					anIntArray575[anInt8846++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static74.method1619();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt8846 -= 2;
					local175 = anIntArray575[anInt8846];
					local776 = anIntArray575[anInt8846 + 1];
					Static211.method8142(local776, 3, local175, false);
					anIntArray575[anInt8846++] = Static153.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static153.aFrame3 != null) {
						Static211.method8142(-1, Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400(), -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class234[] local2919 = Static212.method3357();
					anIntArray575[anInt8846++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray575[--anInt8846];
					@Pc(2943) Class234[] local2943 = Static212.method3357();
					anIntArray575[anInt8846++] = local2943[local175].anInt6403;
					anIntArray575[anInt8846++] = local2943[local175].anInt6402;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static103.anInt2170;
					local776 = Static380.anInt6672;
					local97 = -1;
					@Pc(2978) Class234[] local2978 = Static212.method3357();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class234 local2985 = local2978[local2833];
						if (local2985.anInt6403 == local175 && local2985.anInt6402 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray575[anInt8846++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray575[anInt8846++] = Static545.method7549();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray575[--anInt8846];
					if (local175 >= 1 && local175 <= 2) {
						Static211.method8142(-1, local175, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray575[--anInt8846];
					if (local175 >= 1 && local175 <= 2) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub9_1, local175);
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.lb, local175);
						Static57.method6341();
						return;
					}
					return;
				}
			} else {
				@Pc(3271) int local3271;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt8841 -= 2;
						local83 = aStringArray62[anInt8841];
						local89 = aStringArray62[anInt8841 + 1];
						local97 = anIntArray575[--anInt8846];
						@Pc(3133) Class3_Sub44 local3133 = Static275.method5689(Static387.aClass376_97, Static540.aClass282_4);
						local3133.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(local83) + Static153.method2617(local89) + 1);
						local3133.aClass3_Sub17_Sub2_3.method4878(local83);
						local3133.aClass3_Sub17_Sub2_3.method4878(local89);
						local3133.aClass3_Sub17_Sub2_3.method4849(local97);
						Static616.method8089(local3133);
						return;
					}
					if (arg0 == 5401) {
						anInt8846 -= 2;
						Static119.aShortArray48[anIntArray575[anInt8846]] = (short) Static522.method7359(anIntArray575[anInt8846 + 1]);
						Static237.aClass371_2.method8309();
						Static237.aClass371_2.method8310();
						Static481.aClass241_2.method5579();
						Static517.method7334();
						return;
					}
					if (arg0 == 5405) {
						anInt8846 -= 2;
						local175 = anIntArray575[anInt8846];
						local776 = anIntArray575[anInt8846 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static278.anIntArrayArrayArray11[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt8846 -= 7;
						local175 = anIntArray575[anInt8846];
						local776 = anIntArray575[anInt8846 + 1] << 1;
						local97 = anIntArray575[anInt8846 + 2];
						local103 = anIntArray575[anInt8846 + 3];
						local2833 = anIntArray575[anInt8846 + 4];
						local3271 = anIntArray575[anInt8846 + 5];
						@Pc(3277) int local3277 = anIntArray575[anInt8846 + 6];
						if (local175 >= 0 && local175 < 2 && Static278.anIntArrayArrayArray11[local175] != null && local776 >= 0 && local776 < Static278.anIntArrayArrayArray11[local175].length) {
							Static278.anIntArrayArrayArray11[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
							Static278.anIntArrayArrayArray11[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static278.anIntArrayArrayArray11[anIntArray575[--anInt8846]].length >> 1;
						anIntArray575[anInt8846++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static153.aFrame3 != null) {
							Static211.method8142(-1, Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400(), -1, false);
						}
						if (Static90.aFrame2 != null) {
							Static540.method6275();
							System.exit(0);
							return;
						}
						local83 = Static467.aString103 == null ? Static638.method8382() : Static467.aString103;
						Static637.method8373(Static499.aClass231_4, false, Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 1, local83);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static216.aClass129_7 != null) {
							if (Static216.aClass129_7.anObject7 == null) {
								local83 = Static534.method7434(Static216.aClass129_7.anInt3300);
							} else {
								local83 = (String) Static216.aClass129_7.anObject7;
							}
						}
						aStringArray62[anInt8841++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray575[anInt8846++] = Static499.aClass231_4.aBoolean482 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static153.aFrame3 != null) {
							Static211.method8142(-1, Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400(), -1, false);
						}
						local83 = aStringArray62[--anInt8841];
						local1496 = anIntArray575[--anInt8846] == 1;
						local181 = Static638.method8382() + local83;
						Static637.method8373(Static499.aClass231_4, local1496, Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 1, local181);
						return;
					}
					if (arg0 == 5422) {
						anInt8841 -= 2;
						local83 = aStringArray62[anInt8841];
						local89 = aStringArray62[anInt8841 + 1];
						local97 = anIntArray575[--anInt8846];
						if (local83.length() > 0) {
							if (Static124.aStringArray22 == null) {
								Static124.aStringArray22 = new String[Static509.anIntArray546[Static102.aClass181_38.anInt4848]];
							}
							Static124.aStringArray22[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static516.aStringArray56 == null) {
								Static516.aStringArray56 = new String[Static509.anIntArray546[Static102.aClass181_38.anInt4848]];
							}
							Static516.aStringArray56[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray62[--anInt8841]);
						return;
					}
					if (arg0 == 5424) {
						anInt8846 -= 11;
						Static39.anInt1157 = anIntArray575[anInt8846];
						Static243.anInt4569 = anIntArray575[anInt8846 + 1];
						Static196.anInt3547 = anIntArray575[anInt8846 + 2];
						Static613.anInt9546 = anIntArray575[anInt8846 + 3];
						Static174.anInt9096 = anIntArray575[anInt8846 + 4];
						Static309.anInt5701 = anIntArray575[anInt8846 + 5];
						Static115.anInt2298 = anIntArray575[anInt8846 + 6];
						Static43.anInt1221 = anIntArray575[anInt8846 + 7];
						Static63.anInt8307 = anIntArray575[anInt8846 + 8];
						Static419.anInt7065 = anIntArray575[anInt8846 + 9];
						Static417.anInt7046 = anIntArray575[anInt8846 + 10];
						Static235.aClass143_57.method3130(Static174.anInt9096);
						Static235.aClass143_57.method3130(Static309.anInt5701);
						Static235.aClass143_57.method3130(Static115.anInt2298);
						Static235.aClass143_57.method3130(Static43.anInt1221);
						Static235.aClass143_57.method3130(Static63.anInt8307);
						Static520.aClass102_31 = null;
						Static371.aClass102_24 = null;
						Static505.aClass102_35 = null;
						Static405.aClass102_32 = null;
						Static606.aClass102_36 = null;
						Static636.aClass102_38 = null;
						Static369.aClass102_9 = null;
						Static454.aClass102_33 = null;
						Static236.aBoolean347 = true;
						return;
					}
					if (arg0 == 5425) {
						Static248.method3935();
						Static236.aBoolean347 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt8846 -= 2;
						Static503.anInt8458 = anIntArray575[anInt8846];
						Static581.anInt9234 = anIntArray575[anInt8846 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt8846 -= 2;
						Static674.anInt10304 = anIntArray575[anInt8846 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt8846 -= 2;
						local175 = anIntArray575[anInt8846];
						local776 = anIntArray575[anInt8846 + 1];
						anIntArray575[anInt8846++] = Static551.method7573(local175, local776) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static145.method2526(aStringArray62[--anInt8841], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static685.method3974(Static287.anApplet2, "accountcreated");
							return;
						} catch (@Pc(3819) Throwable local3819) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static685.method3974(Static287.anApplet2, "accountcreatestarted");
							return;
						} catch (@Pc(3830) Throwable local3830) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static60.aClipboard1 != null) {
							@Pc(3842) Transferable local3842 = Static60.aClipboard1.getContents((Object) null);
							if (local3842 != null) {
								try {
									local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3855) Exception local3855) {
								}
							}
						}
						aStringArray62[anInt8841++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static308.anInt5688 = anIntArray575[--anInt8846];
						return;
					}
					if (arg0 == 5435) {
						anIntArray575[anInt8846++] = Static133.aBoolean207 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt8846 -= 4;
						local175 = anIntArray575[anInt8846];
						local776 = anIntArray575[anInt8846 + 1];
						local97 = anIntArray575[anInt8846 + 2];
						local103 = anIntArray575[anInt8846 + 3];
						Static369.method1820(local97, local103, (local175 & 0x3FFF) - Static347.anInt7851, local776 << 2, (local175 >> 14 & 0x3FFF) - Static417.anInt7047, false);
						return;
					}
					if (arg0 == 5501) {
						anInt8846 -= 4;
						local175 = anIntArray575[anInt8846];
						local776 = anIntArray575[anInt8846 + 1];
						local97 = anIntArray575[anInt8846 + 2];
						local103 = anIntArray575[anInt8846 + 3];
						Static162.method2743(local103, (local175 >> 14 & 0x3FFF) - Static417.anInt7047, (local175 & 0x3FFF) - Static347.anInt7851, local97, local776 << 2);
						return;
					}
					if (arg0 == 5502) {
						anInt8846 -= 6;
						local175 = anIntArray575[anInt8846];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static659.anInt10095 = local175;
						local776 = anIntArray575[anInt8846 + 1];
						if (local776 + 1 >= Static278.anIntArrayArrayArray11[Static659.anInt10095].length >> 1) {
							throw new RuntimeException();
						}
						Static513.anInt8594 = local776;
						Static132.anInt2472 = 0;
						Static8.anInt98 = anIntArray575[anInt8846 + 2];
						Static125.anInt2417 = anIntArray575[anInt8846 + 3];
						local97 = anIntArray575[anInt8846 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static81.anInt1786 = local97;
						local103 = anIntArray575[anInt8846 + 5];
						if (local103 + 1 >= Static278.anIntArrayArrayArray11[Static81.anInt1786].length >> 1) {
							throw new RuntimeException();
						}
						Static293.anInt5387 = local103;
						Static378.anInt6662 = 3;
						Static18.anInt682 = -1;
						Static65.anInt1581 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static480.method6835();
						return;
					}
					if (arg0 == 5504) {
						anInt8846 -= 2;
						Static10.method98(anIntArray575[anInt8846], anIntArray575[anInt8846 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray575[anInt8846++] = (int) Static461.aFloat178 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray575[anInt8846++] = (int) Static204.aFloat82 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static537.method7475();
						return;
					}
					if (arg0 == 5508) {
						Static388.method5658();
						return;
					}
					if (arg0 == 5509) {
						Static283.method4486();
						return;
					}
					if (arg0 == 5510) {
						Static10.method96();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray575[--anInt8846];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static417.anInt7047;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static251.anInt4680) {
							local776 = Static251.anInt4680;
						}
						local97 -= Static347.anInt7851;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static406.anInt6924) {
							local97 = Static406.anInt6924;
						}
						Static140.anInt2658 = (local776 << 9) + 256;
						Static276.anInt5174 = (local97 << 9) + 256;
						Static378.anInt6662 = 4;
						Static18.anInt682 = -1;
						Static65.anInt1581 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static49.method1304();
						return;
					}
					if (arg0 == 5514) {
						Static209.anInt10102 = anIntArray575[--anInt8846];
						return;
					}
					if (arg0 == 5516) {
						anIntArray575[anInt8846++] = Static209.anInt10102;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray575[--anInt8846];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static417.anInt7047;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static251.anInt4680) {
								local776 = Static251.anInt4680;
							}
							local97 -= Static347.anInt7851;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static406.anInt6924) {
								local97 = Static406.anInt6924;
							}
							Static65.anInt1581 = (local776 << 9) + 256;
							Static18.anInt682 = (local97 << 9) + 256;
							return;
						}
						Static65.anInt1581 = -1;
						Static18.anInt682 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt8841 -= 2;
						local83 = aStringArray62[anInt8841];
						local89 = aStringArray62[anInt8841 + 1];
						local97 = anIntArray575[--anInt8846];
						if (local83.length() > 320) {
							return;
						}
						if (Static520.anInt6836 != 3) {
							return;
						}
						if (Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
							Static69.aString16 = local83;
							Static33.aString9 = local89;
							Static558.anInt8991 = local97;
							Static482.method6863(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static123.method2198();
						return;
					}
					if (arg0 == 5602) {
						if (Static216.anInt3999 == 0) {
							Static185.anInt3411 = -2;
							Static39.anInt1160 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt8841--;
						if (Static520.anInt6836 != 3) {
							return;
						}
						if (Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
							Static374.method5523(aStringArray62[anInt8841]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt8841 -= 2;
						anInt8846 -= 2;
						if (Static520.anInt6836 != 3) {
							return;
						}
						if (Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
							Static421.method6011(aStringArray62[anInt8841], aStringArray62[anInt8841 + 1], anIntArray575[anInt8846 + 1] == 1, anIntArray575[anInt8846]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static111.anInt10350 == 0) {
							Static312.anInt5782 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray575[anInt8846++] = Static39.anInt1160;
						return;
					}
					if (arg0 == 5608) {
						anIntArray575[anInt8846++] = Static568.anInt9067;
						return;
					}
					if (arg0 == 5609) {
						anIntArray575[anInt8846++] = Static312.anInt5782;
						return;
					}
					if (arg0 == 5611) {
						anIntArray575[anInt8846++] = Static680.anInt10366;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray575[--anInt8846];
						if (Static520.anInt6836 != 7) {
							return;
						}
						if (Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
							if (Static673.aClass160_3 != null) {
								Static673.aClass160_3.method3506();
								Static673.aClass160_3 = null;
							}
							Static558.anInt8991 = local175;
							Static482.method6863(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray575[anInt8846++] = Static39.anInt1160;
						return;
					}
					if (arg0 == 5615) {
						anInt8841 -= 2;
						local83 = aStringArray62[anInt8841];
						local89 = aStringArray62[anInt8841 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static520.anInt6836 != 3) {
							return;
						}
						if (Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
							if (Static673.aClass160_3 != null) {
								Static673.aClass160_3.method3506();
								Static673.aClass160_3 = null;
							}
							Static69.aString16 = local83;
							Static33.aString9 = local89;
							Static482.method6863(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static431.method6362(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray575[anInt8846++] = Static185.anInt3411;
						return;
					}
					if (arg0 == 5618) {
						anInt8846--;
						return;
					}
					if (arg0 == 5619) {
						anInt8846--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray575[anInt8846++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt8841 -= 2;
						anInt8846 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static573.aString114 != null) {
							anIntArray575[anInt8846++] = 1;
							return;
						}
						anIntArray575[anInt8846++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray575[anInt8846++] = (int) (Static450.aLong222 >> 32);
						anIntArray575[anInt8846++] = (int) (Static450.aLong222 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray575[anInt8846++] = Static515.aBoolean648 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static515.aBoolean648 = true;
						Static679.method8756();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray575[--anInt8846];
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub25_1, local175);
						Static230.method3703();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					@Pc(4802) boolean local4802;
					if (arg0 == 6002) {
						local4802 = anIntArray575[--anInt8846] == 1;
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_2, local4802 ? 1 : 0);
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_1, local4802 ? 1 : 0);
						Static230.method3703();
						Static541.method7490();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6003) {
						local4802 = anIntArray575[--anInt8846] == 1;
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_2, local4802 ? 2 : 1);
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_1, local4802 ? 2 : 1);
						Static541.method7490();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6005) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub23_1, anIntArray575[--anInt8846] == 1 ? 1 : 0);
						Static230.method3703();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6007) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub24_1, anIntArray575[--anInt8846]);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6008) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub10_1, anIntArray575[--anInt8846] == 1 ? 1 : 0);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6010) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub29_1, anIntArray575[--anInt8846] == 1 ? 1 : 0);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6011) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub21_1, anIntArray575[--anInt8846]);
						Static230.method3703();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6012) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub2_1, anIntArray575[--anInt8846] == 1 ? 1 : 0);
						Static260.method4105();
						Static225.method3512();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6014) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub5_1, anIntArray575[--anInt8846] == 1 ? 2 : 0);
						Static230.method3703();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6015) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub27_1, anIntArray575[--anInt8846] == 1 ? 1 : 0);
						Static230.method3703();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6016) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_2, anIntArray575[--anInt8846]);
						Static422.method6016(false, Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402());
						Static57.method6341();
						return;
					}
					if (arg0 == 6017) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub7_1, anIntArray575[--anInt8846] == 1 ? 1 : 0);
						Static51.method1368();
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6018) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub3_4, anIntArray575[--anInt8846]);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray575[--anInt8846];
						local776 = Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741();
						if (local175 != local776) {
							if (Static561.method7660(Static520.anInt6836)) {
								if (local776 == 0 && Static149.anInt2812 != -1) {
									Static507.method7179(Static149.anInt2812, Static510.aClass143_118, local175);
									Static361.method5397();
									Static666.aBoolean755 = false;
								} else if (local175 == 0) {
									Static365.method3470();
									Static666.aBoolean755 = false;
								} else {
									Static208.method3291(local175);
								}
							}
							Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub3_2, local175);
							Static57.method6341();
							Static411.aBoolean527 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub3_5, anIntArray575[--anInt8846]);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static227.aClass3_Sub15_11.aClass17_Sub11_2.method4522();
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_1, anIntArray575[--anInt8846] == 1 ? 0 : local175);
						Static541.method7490();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray575[--anInt8846];
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub1_1, local175);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6024) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_1, anIntArray575[--anInt8846]);
						Static57.method6341();
						return;
					}
					if (arg0 == 6025) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub14_1, anIntArray575[--anInt8846]);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray575[--anInt8846];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static455.method6554(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub4_1, anIntArray575[--anInt8846] == 0 ? 0 : 1);
						Static57.method6341();
						return;
					}
					if (arg0 == 6029) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub24_1, anIntArray575[--anInt8846]);
						Static57.method6341();
						return;
					}
					if (arg0 == 6030) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub22_1, anIntArray575[--anInt8846] == 0 ? 0 : 1);
						Static57.method6341();
						Static230.method3703();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray575[--anInt8846];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static422.method6016(false, local175);
						return;
					}
					if (arg0 == 6032) {
						anInt8846 -= 2;
						local175 = anIntArray575[anInt8846];
						local1496 = anIntArray575[anInt8846 + 1] == 1;
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, local175);
						if (!local1496) {
							Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub13_1, 0);
						}
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6033) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub6_1, anIntArray575[--anInt8846]);
						Static57.method6341();
						return;
					}
					if (arg0 == 6034) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub12_1, anIntArray575[--anInt8846] == 1 ? 1 : 0);
						Static57.method6341();
						Static260.method4105();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static227.aClass3_Sub15_11.aClass17_Sub19_2.method6025();
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_1, anIntArray575[--anInt8846] == 1 ? 1 : local175);
						Static230.method3703();
						Static541.method7490();
						return;
					}
					if (arg0 == 6036) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub8_1, anIntArray575[--anInt8846]);
						Static57.method6341();
						Static515.aBoolean646 = true;
						return;
					}
					if (arg0 == 6037) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub3_1, anIntArray575[--anInt8846]);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray575[--anInt8846];
						local776 = Static227.aClass3_Sub15_11.aClass17_Sub3_3.method741();
						if (local175 != local776 && Static149.anInt2812 == Static251.anInt4688) {
							if (!Static561.method7660(Static520.anInt6836)) {
								if (local776 == 0) {
									Static507.method7179(Static149.anInt2812, Static510.aClass143_118, local175);
									Static361.method5397();
									Static666.aBoolean755 = false;
								} else if (local175 == 0) {
									Static365.method3470();
									Static666.aBoolean755 = false;
								} else {
									Static208.method3291(local175);
								}
							}
							Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub3_3, local175);
							Static57.method6341();
							Static411.aBoolean527 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray575[--anInt8846];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static227.aClass3_Sub15_11.aClass17_Sub18_1.method5964()) {
							Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub18_1, local175);
							Static57.method6341();
							Static411.aBoolean527 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray575[--anInt8846];
						if (local175 != Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5569()) {
							Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub16_1, local175);
							Static57.method6341();
							Static411.aBoolean527 = false;
							Static566.method4437();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub25_1.method7847();
						return;
					}
					if (arg0 == 6102) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub19_2.method6025() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub11_2.method4522() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub23_1.method7173() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub24_1.method7387();
						return;
					}
					if (arg0 == 6108) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub10_1.method3894() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub29_1.method8741() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502();
						return;
					}
					if (arg0 == 6112) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub2_1.method725() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub5_1.method2068() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub27_1.method8266() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub17_2.method5808();
						return;
					}
					if (arg0 == 6117) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub7_1.method2458() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub3_4.method741();
						return;
					}
					if (arg0 == 6119) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741();
						return;
					}
					if (arg0 == 6120) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub3_5.method741();
						return;
					}
					if (arg0 == 6123) {
						anIntArray575[anInt8846++] = Static55.method1384();
						return;
					}
					if (arg0 == 6124) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub17_1.method5808();
						return;
					}
					if (arg0 == 6125) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub14_1.method4653();
						return;
					}
					if (arg0 == 6127) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub28_1.method8661() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub4_1.method1796() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub24_1.method7387();
						return;
					}
					if (arg0 == 6130) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub22_1.method6659() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402();
						return;
					}
					if (arg0 == 6132) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub20_2.method6402();
						return;
					}
					if (arg0 == 6133) {
						anIntArray575[anInt8846++] = Static499.aClass231_4.aBoolean482 && !Static499.aClass231_4.aBoolean484 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub6_1.method2225();
						return;
					}
					if (arg0 == 6136) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub12_1.method4577() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray575[anInt8846++] = Static671.method8691(Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub8_1.method3305();
						return;
					}
					if (arg0 == 6142) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub3_1.method741();
						return;
					}
					if (arg0 == 6143) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub3_3.method741();
						return;
					}
					if (arg0 == 6144) {
						anIntArray575[anInt8846++] = Static637.aBoolean724 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub18_1.method5964();
						return;
					}
					if (arg0 == 6146) {
						anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5569();
						return;
					}
					if (arg0 == 6147) {
						anIntArray575[anInt8846++] = Static447.aClass3_Sub34_1.anInt6531 < 512 || Static637.aBoolean724 || Static321.aBoolean466 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray575[anInt8846++] = Static319.aBoolean462 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt8846 -= 2;
						Static630.aShort121 = (short) anIntArray575[anInt8846];
						if (Static630.aShort121 <= 0) {
							Static630.aShort121 = 256;
						}
						Static388.aShort79 = (short) anIntArray575[anInt8846 + 1];
						if (Static388.aShort79 <= 0) {
							Static388.aShort79 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt8846 -= 2;
						Static8.aShort3 = (short) anIntArray575[anInt8846];
						if (Static8.aShort3 <= 0) {
							Static8.aShort3 = 256;
						}
						Static155.aShort36 = (short) anIntArray575[anInt8846 + 1];
						if (Static155.aShort36 <= 0) {
							Static155.aShort36 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt8846 -= 4;
						Static372.aShort77 = (short) anIntArray575[anInt8846];
						if (Static372.aShort77 <= 0) {
							Static372.aShort77 = 1;
						}
						Static24.aShort4 = (short) anIntArray575[anInt8846 + 1];
						if (Static24.aShort4 <= 0) {
							Static24.aShort4 = 32767;
						} else if (Static24.aShort4 < Static372.aShort77) {
							Static24.aShort4 = Static372.aShort77;
						}
						Static429.aShort84 = (short) anIntArray575[anInt8846 + 2];
						if (Static429.aShort84 <= 0) {
							Static429.aShort84 = 1;
						}
						Static162.aShort37 = (short) anIntArray575[anInt8846 + 3];
						if (Static162.aShort37 <= 0) {
							Static162.aShort37 = 32767;
							return;
						}
						if (Static162.aShort37 < Static429.aShort84) {
							Static162.aShort37 = Static429.aShort84;
						}
						return;
					}
					if (arg0 == 6203) {
						Static43.method1225(0, Static663.aClass208_14.anInt5639, Static663.aClass208_14.anInt5630, false, 0);
						anIntArray575[anInt8846++] = Static612.anInt9538;
						anIntArray575[anInt8846++] = Static105.anInt2207;
						return;
					}
					if (arg0 == 6204) {
						anIntArray575[anInt8846++] = Static8.aShort3;
						anIntArray575[anInt8846++] = Static155.aShort36;
						return;
					}
					if (arg0 == 6205) {
						anIntArray575[anInt8846++] = Static630.aShort121;
						anIntArray575[anInt8846++] = Static388.aShort79;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray575[anInt8846++] = (int) (Static131.method2268() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray575[anInt8846++] = (int) (Static131.method2268() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt8846 -= 3;
						local175 = anIntArray575[anInt8846];
						local776 = anIntArray575[anInt8846 + 1];
						local97 = anIntArray575[anInt8846 + 2];
						@Pc(6611) long local6611 = Static296.method6898(local97, local776, local175);
						local3271 = Static311.method4790(local6611);
						if (local97 < 1970) {
							local3271--;
						}
						anIntArray575[anInt8846++] = local3271;
						return;
					}
					if (arg0 == 6303) {
						anIntArray575[anInt8846++] = Static210.method3309(Static131.method2268());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray575[--anInt8846];
						local1496 = true;
						if (local175 < 0) {
							local1496 = (local175 + 1) % 4 == 0;
						} else if (local175 < 1582) {
							local1496 = local175 % 4 == 0;
						} else if (local175 % 4 != 0) {
							local1496 = false;
						} else if (local175 % 100 != 0) {
							local1496 = true;
						} else if (local175 % 400 != 0) {
							local1496 = false;
						}
						anIntArray575[anInt8846++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray575[--anInt8846];
						@Pc(6729) int[] local6729 = Static559.method7641(local175);
						Static689.method8054(local6729, 0, anIntArray575, anInt8846, 3);
						anInt8846 += 3;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray575[anInt8846++] = Static424.method6042() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray575[anInt8846++] = Static505.method7161() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static520.anInt6836 == 7 && Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
							if (Static140.aBoolean211) {
								anIntArray575[anInt8846++] = 0;
								return;
							}
							if (Static94.aLong59 > Static131.method2268() - 1000L) {
								anIntArray575[anInt8846++] = 1;
								return;
							}
							Static140.aBoolean211 = true;
							local52 = Static275.method5689(Static336.aClass376_132, Static540.aClass282_4);
							local52.aClass3_Sub17_Sub2_3.method4854(Static173.anInt3296);
							Static616.method8089(local52);
							anIntArray575[anInt8846++] = 0;
							return;
						}
						anIntArray575[anInt8846++] = 1;
						return;
					}
					@Pc(6889) Class331 local6889;
					@Pc(6856) Class31_Sub1 local6856;
					if (arg0 == 6501) {
						local6856 = Static339.method5155();
						if (local6856 != null) {
							anIntArray575[anInt8846++] = local6856.anInt10062;
							anIntArray575[anInt8846++] = local6856.anInt10058;
							aStringArray62[anInt8841++] = local6856.aString129;
							local6889 = local6856.method8555();
							anIntArray575[anInt8846++] = local6889.anInt9038;
							aStringArray62[anInt8841++] = local6889.aString113;
							anIntArray575[anInt8846++] = local6856.anInt10060;
							anIntArray575[anInt8846++] = local6856.anInt10063;
							aStringArray62[anInt8841++] = local6856.aString130;
							return;
						}
						anIntArray575[anInt8846++] = -1;
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						anIntArray575[anInt8846++] = 0;
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6856 = Static577.method7765();
						if (local6856 != null) {
							anIntArray575[anInt8846++] = local6856.anInt10062;
							anIntArray575[anInt8846++] = local6856.anInt10058;
							aStringArray62[anInt8841++] = local6856.aString129;
							local6889 = local6856.method8555();
							anIntArray575[anInt8846++] = local6889.anInt9038;
							aStringArray62[anInt8841++] = local6889.aString113;
							anIntArray575[anInt8846++] = local6856.anInt10060;
							anIntArray575[anInt8846++] = local6856.anInt10063;
							aStringArray62[anInt8841++] = local6856.aString130;
							return;
						}
						anIntArray575[anInt8846++] = -1;
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						anIntArray575[anInt8846++] = 0;
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray575[--anInt8846];
						local89 = aStringArray62[--anInt8841];
						if (Static520.anInt6836 == 7 && Static216.anInt3999 == 0 && Static111.anInt10350 == 0) {
							anIntArray575[anInt8846++] = Static447.method6464(local89, local175) ? 1 : 0;
							return;
						}
						anIntArray575[anInt8846++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray575[--anInt8846];
						@Pc(7216) Class31_Sub1 local7216 = Static59.method1456(local175);
						if (local7216 != null) {
							anIntArray575[anInt8846++] = local7216.anInt10058;
							aStringArray62[anInt8841++] = local7216.aString129;
							@Pc(7240) Class331 local7240 = local7216.method8555();
							anIntArray575[anInt8846++] = local7240.anInt9038;
							aStringArray62[anInt8841++] = local7240.aString113;
							anIntArray575[anInt8846++] = local7216.anInt10060;
							anIntArray575[anInt8846++] = local7216.anInt10063;
							aStringArray62[anInt8841++] = local7216.aString130;
							return;
						}
						anIntArray575[anInt8846++] = -1;
						aStringArray62[anInt8841++] = "";
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						anIntArray575[anInt8846++] = 0;
						anIntArray575[anInt8846++] = 0;
						aStringArray62[anInt8841++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt8846 -= 4;
						local175 = anIntArray575[anInt8846];
						local1496 = anIntArray575[anInt8846 + 1] == 1;
						local97 = anIntArray575[anInt8846 + 2];
						local2107 = anIntArray575[anInt8846 + 3] == 1;
						Static219.method6870(local2107, local1496, local97, local175);
						return;
					}
					if (arg0 == 6508) {
						Static98.method1957();
						return;
					}
					if (arg0 == 6509) {
						if (Static520.anInt6836 != 7) {
							return;
						}
						Static40.aBoolean104 = anIntArray575[--anInt8846] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray575[anInt8846++] = Static203.anInt3734;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static587.aClass295_5 == Static365.aClass295_2) {
						if (arg0 == 6700) {
							local175 = Static222.aClass62_21.method1688();
							if (Static277.anInt5201 != -1) {
								local175++;
							}
							anIntArray575[anInt8846++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray575[--anInt8846];
							if (Static277.anInt5201 != -1) {
								if (local175 == 0) {
									anIntArray575[anInt8846++] = Static277.anInt5201;
									return;
								}
								local175--;
							}
							@Pc(7488) Class3_Sub28 local7488 = (Class3_Sub28) Static222.aClass62_21.method1680();
							while (local175-- > 0) {
								local7488 = (Class3_Sub28) Static222.aClass62_21.method1681();
							}
							anIntArray575[anInt8846++] = local7488.anInt5252;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray575[--anInt8846];
							if (Static562.aClass208ArrayArray3[local175] == null) {
								aStringArray62[anInt8841++] = "";
								return;
							}
							local89 = Static562.aClass208ArrayArray3[local175][0].aString71;
							if (local89 == null) {
								aStringArray62[anInt8841++] = "";
								return;
							}
							aStringArray62[anInt8841++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray575[--anInt8846];
							if (Static562.aClass208ArrayArray3[local175] == null) {
								anIntArray575[anInt8846++] = 0;
								return;
							}
							anIntArray575[anInt8846++] = Static562.aClass208ArrayArray3[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt8846 -= 2;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							if (Static562.aClass208ArrayArray3[local175] == null) {
								aStringArray62[anInt8841++] = "";
								return;
							}
							local181 = Static562.aClass208ArrayArray3[local175][local776].aString71;
							if (local181 == null) {
								aStringArray62[anInt8841++] = "";
								return;
							}
							aStringArray62[anInt8841++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt8846 -= 2;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							if (Static562.aClass208ArrayArray3[local175] == null) {
								anIntArray575[anInt8846++] = 0;
								return;
							}
							anIntArray575[anInt8846++] = Static562.aClass208ArrayArray3[local175][local776].anInt5613;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 1);
							return;
						}
						if (arg0 == 6708) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 2);
							return;
						}
						if (arg0 == 6709) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 3);
							return;
						}
						if (arg0 == 6710) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 4);
							return;
						}
						if (arg0 == 6711) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 5);
							return;
						}
						if (arg0 == 6712) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 6);
							return;
						}
						if (arg0 == 6713) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 7);
							return;
						}
						if (arg0 == 6714) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 8);
							return;
						}
						if (arg0 == 6715) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 9);
							return;
						}
						if (arg0 == 6716) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							Static261.method4118(local175 << 16 | local776, local97, "", 10);
							return;
						}
						if (arg0 == 6717) {
							anInt8846 -= 3;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							local97 = anIntArray575[anInt8846 + 2];
							@Pc(8076) Class208 local8076 = Static108.method2085(local97, local175 << 16 | local776);
							Static61.method1523();
							@Pc(8081) Class3_Sub1 local8081 = Static82.method1754(local8076);
							Static433.method6368(local8081.anInt22, local8081.method40(), local8076);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8109) Class145 local8109;
						if (arg0 == 6800) {
							local175 = anIntArray575[--anInt8846];
							local8109 = Static661.aClass321_4.method7485(local175);
							if (local8109.aString44 == null) {
								aStringArray62[anInt8841++] = "";
								return;
							}
							aStringArray62[anInt8841++] = local8109.aString44;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray575[--anInt8846];
							local8109 = Static661.aClass321_4.method7485(local175);
							anIntArray575[anInt8846++] = local8109.anInt3606;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray575[--anInt8846];
							local8109 = Static661.aClass321_4.method7485(local175);
							anIntArray575[anInt8846++] = local8109.anInt3610;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray575[--anInt8846];
							local8109 = Static661.aClass321_4.method7485(local175);
							anIntArray575[anInt8846++] = local8109.anInt3628;
							return;
						}
						if (arg0 == 6804) {
							anInt8846 -= 2;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							@Pc(8231) Class328 local8231 = Static145.aClass165_1.method3812(local776);
							if (local8231.method7566()) {
								aStringArray62[anInt8841++] = Static661.aClass321_4.method7485(local175).method3150(local8231.aString108, local776);
								return;
							}
							anIntArray575[anInt8846++] = Static661.aClass321_4.method7485(local175).method3153(local8231.anInt8911, local776);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray575[anInt8846++] = Static120.aBoolean200 && !Static576.aBoolean681 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray575[anInt8846++] = (int) (Static420.aLong204 / 60000L);
							anIntArray575[anInt8846++] = Static280.aBoolean408 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray575[anInt8846++] = Static182.anInt3397;
							return;
						}
						if (arg0 == 6903) {
							anIntArray575[anInt8846++] = Static79.anInt1762;
							return;
						}
						if (arg0 == 6904) {
							anIntArray575[anInt8846++] = Static584.anInt9269;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static216.aClass129_7 != null) {
								if (Static216.aClass129_7.anObject7 == null) {
									local83 = Static534.method7434(Static216.aClass129_7.anInt3300);
								} else {
									local83 = (String) Static216.aClass129_7.anObject7;
								}
							}
							aStringArray62[anInt8841++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray575[anInt8846++] = Static179.anInt3370;
							return;
						}
						if (arg0 == 6907) {
							anIntArray575[anInt8846++] = Static658.anInt10081;
							return;
						}
						if (arg0 == 6908) {
							anIntArray575[anInt8846++] = Static566.anInt5236;
							return;
						}
						if (arg0 == 6909) {
							anIntArray575[anInt8846++] = Static121.aBoolean201 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray575[anInt8846++] = Static133.anInt2489;
							return;
						}
						if (arg0 == 6911) {
							anIntArray575[anInt8846++] = Static111.anInt10351;
							return;
						}
						if (arg0 == 6912) {
							anIntArray575[anInt8846++] = Static104.anInt2201;
							return;
						}
						if (arg0 == 6913) {
							anIntArray575[anInt8846++] = Static264.anInt4945;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static473.method6803();
							anIntArray575[anInt8846++] = Static2.anInt8 = Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402();
							anIntArray575[anInt8846++] = local175;
							Static230.method3703();
							Static57.method6341();
							Static411.aBoolean527 = false;
							return;
						}
						if (arg0 == 7001) {
							Static650.method8525();
							Static230.method3703();
							Static57.method6341();
							Static411.aBoolean527 = false;
							return;
						}
						if (arg0 == 7002) {
							Static627.method8276();
							Static230.method3703();
							Static57.method6341();
							Static411.aBoolean527 = false;
							return;
						}
						if (arg0 == 7003) {
							Static638.method8379();
							Static230.method3703();
							Static57.method6341();
							Static411.aBoolean527 = false;
							return;
						}
						if (arg0 == 7004) {
							Static53.method1374();
							Static230.method3703();
							Static57.method6341();
							Static411.aBoolean527 = false;
							return;
						}
						if (arg0 == 7005) {
							Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub13_1, 0);
							Static57.method6341();
							Static411.aBoolean527 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static2.anInt8 == 2) {
								Static464.aBoolean601 = true;
								return;
							}
							if (Static2.anInt8 == 1) {
								Static402.aBoolean517 = true;
								return;
							}
							if (Static2.anInt8 == 3) {
								Static134.aBoolean208 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub13_1.method4592();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt8846 -= 2;
							local175 = anIntArray575[anInt8846];
							local776 = anIntArray575[anInt8846 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static215.method5254(local776, false, local175);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray575[--anInt8846];
							if (local175 != -1) {
								Static492.method7030(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray575[--anInt8846];
							if (local175 != -1) {
								Static314.method4934(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray575[anInt8846++] = Static143.method2460("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub23_1.method7174() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub29_1.method8744() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6499() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub5_1.method2070() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub17_1.method5806() && Static582.aClass16_12.method8149() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub1_1.method712() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub14_1.method4651() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub28_1.method8662() && Static582.aClass16_12.method8124() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub22_1.method6657() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub12_1.method4578() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub8_1.method3307() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub27_1.method8265() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5570() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub20_2.method6398() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub23_1.method8734(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub29_1.method8734(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub21_1.method8734(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub5_1.method8734(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray575[--anInt8846];
							if (!Static582.aClass16_12.method8149()) {
								anIntArray575[anInt8846++] = 3;
								return;
							}
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub17_1.method8734(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub1_1.method8734(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub14_1.method8734(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray575[--anInt8846];
							if (!Static582.aClass16_12.method8124()) {
								anIntArray575[anInt8846++] = 3;
								return;
							}
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub28_1.method8734(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub22_1.method8734(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub12_1.method8734(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub8_1.method8734(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub27_1.method8734(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub16_1.method8734(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray575[--anInt8846];
							anIntArray575[anInt8846++] = Static227.aClass3_Sub15_11.aClass17_Sub20_2.method8734(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "(I)I")
	private static int method7512(@OriginalArg(0) int arg0) {
		@Pc(4) Class223 local4 = Static422.aClass214_1.method4999(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass308_3.method7297(Static102.aClass181_38.anInt4848 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar1 == 'i' || local4.aChar1 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "(I)V")
	private static void method7513(@OriginalArg(0) int arg0) {
		@Pc(3) Class208 local3 = Static676.method8728(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class208[] local13 = Static384.aClass208ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class208[] local19 = Static562.aClass208ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static384.aClass208ArrayArray2[local9] = new Class208[local22];
			Static689.method8053(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static689.method8053(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!mo;II)V")
	public static void method7514(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub6_Sub9 local5 = Static87.method1798(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray578 = new int[local5.anInt3317];
		aStringArray63 = new String[local5.anInt3310];
		if (local5.aClass239_5 == Static285.aClass239_8 || local5.aClass239_5 == Static660.aClass239_13 || local5.aClass239_5 == Static273.aClass239_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static647.aClass208_13 != null) {
				local30 = Static647.aClass208_13.anInt5592;
				local32 = Static647.aClass208_13.anInt5680;
			}
			anIntArray578[0] = Static542.aClass75_1.method8412() - local30;
			anIntArray578[1] = Static542.aClass75_1.method8405() - local32;
		}
		method7501(local5, 200000);
	}
}
