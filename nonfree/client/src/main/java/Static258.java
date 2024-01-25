import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "[I")
	private static int[] anIntArray435;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!wca;")
	private static Class310 aClass310_11;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "Lclient!ki;")
	private static Class160 aClass160_1;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray25;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Lclient!wca;")
	private static Class310 aClass310_12;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "[I")
	private static final int[] anIntArray434 = new int[5];

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar6 = Calendar.getInstance();

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
	private static final int[] anIntArray436 = new int[1000];

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray24 = new String[1000];

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
	private static int anInt4653 = 0;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	private static int anInt4655 = 0;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "[Lclient!wb;")
	private static final Class308[] aClass308Array1 = new Class308[50];

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
	private static int anInt4657 = 0;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "[[I")
	private static final int[][] anIntArrayArray52 = new int[5][5000];

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray26 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_44 = new Class231(4);

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "[I")
	private static final int[] anIntArray437 = new int[3];

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
	private static int anInt4658 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "()V")
	public static void method4031() {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4032(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static475.anInt8486 == 0 && (Static89.aBoolean131 && !Static100.aBoolean147 || Static391.aBoolean559)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static236.aClass202_133.method5139(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static236.aClass202_133.method5139(0).length());
		} else if (local11.startsWith(Static219.aClass202_273.method5139(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static219.aClass202_273.method5139(0).length());
		} else if (local11.startsWith(Static256.aClass202_147.method5139(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static256.aClass202_147.method5139(0).length());
		} else if (local11.startsWith(Static199.aClass202_118.method5139(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static199.aClass202_118.method5139(0).length());
		} else if (local11.startsWith(Static294.aClass202_166.method5139(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static294.aClass202_166.method5139(0).length());
		} else if (local11.startsWith(Static50.aClass202_33.method5139(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static50.aClass202_33.method5139(0).length());
		} else if (local11.startsWith(Static327.aClass202_176.method5139(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static327.aClass202_176.method5139(0).length());
		} else if (local11.startsWith(Static389.aClass202_201.method5139(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static389.aClass202_201.method5139(0).length());
		} else if (local11.startsWith(Static476.aClass202_239.method5139(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static476.aClass202_239.method5139(0).length());
		} else if (local11.startsWith(Static200.aClass202_120.method5139(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static200.aClass202_120.method5139(0).length());
		} else if (local11.startsWith(Static488.aClass202_247.method5139(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static488.aClass202_247.method5139(0).length());
		} else if (local11.startsWith(Static393.aClass202_206.method5139(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static393.aClass202_206.method5139(0).length());
		} else if (Static172.anInt6352 != 0) {
			if (local11.startsWith(Static236.aClass202_133.method5139(Static172.anInt6352))) {
				local13 = 0;
				arg0 = arg0.substring(Static236.aClass202_133.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static219.aClass202_273.method5139(Static172.anInt6352))) {
				local13 = 1;
				arg0 = arg0.substring(Static219.aClass202_273.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static256.aClass202_147.method5139(Static172.anInt6352))) {
				local13 = 2;
				arg0 = arg0.substring(Static256.aClass202_147.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static199.aClass202_118.method5139(Static172.anInt6352))) {
				local13 = 3;
				arg0 = arg0.substring(Static199.aClass202_118.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static294.aClass202_166.method5139(Static172.anInt6352))) {
				local13 = 4;
				arg0 = arg0.substring(Static294.aClass202_166.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static50.aClass202_33.method5139(Static172.anInt6352))) {
				local13 = 5;
				arg0 = arg0.substring(Static50.aClass202_33.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static327.aClass202_176.method5139(Static172.anInt6352))) {
				local13 = 6;
				arg0 = arg0.substring(Static327.aClass202_176.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static389.aClass202_201.method5139(Static172.anInt6352))) {
				local13 = 7;
				arg0 = arg0.substring(Static389.aClass202_201.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static476.aClass202_239.method5139(Static172.anInt6352))) {
				local13 = 8;
				arg0 = arg0.substring(Static476.aClass202_239.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static200.aClass202_120.method5139(Static172.anInt6352))) {
				local13 = 9;
				arg0 = arg0.substring(Static200.aClass202_120.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static488.aClass202_247.method5139(Static172.anInt6352))) {
				local13 = 10;
				arg0 = arg0.substring(Static488.aClass202_247.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static393.aClass202_206.method5139(Static172.anInt6352))) {
				local13 = 11;
				arg0 = arg0.substring(Static393.aClass202_206.method5139(Static172.anInt6352).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static18.aClass202_14.method5139(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static18.aClass202_14.method5139(0).length());
		} else if (local11.startsWith(Static203.aClass202_122.method5139(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static203.aClass202_122.method5139(0).length());
		} else if (local11.startsWith(Static65.aClass202_46.method5139(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static65.aClass202_46.method5139(0).length());
		} else if (local11.startsWith(Static283.aClass202_159.method5139(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static283.aClass202_159.method5139(0).length());
		} else if (local11.startsWith(Static344.aClass202_188.method5139(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static344.aClass202_188.method5139(0).length());
		} else if (Static172.anInt6352 != 0) {
			if (local11.startsWith(Static18.aClass202_14.method5139(Static172.anInt6352))) {
				local451 = 1;
				arg0 = arg0.substring(Static18.aClass202_14.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static203.aClass202_122.method5139(Static172.anInt6352))) {
				local451 = 2;
				arg0 = arg0.substring(Static203.aClass202_122.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static65.aClass202_46.method5139(Static172.anInt6352))) {
				local451 = 3;
				arg0 = arg0.substring(Static65.aClass202_46.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static283.aClass202_159.method5139(Static172.anInt6352))) {
				local451 = 4;
				arg0 = arg0.substring(Static283.aClass202_159.method5139(Static172.anInt6352).length());
			} else if (local11.startsWith(Static344.aClass202_188.method5139(Static172.anInt6352))) {
				local451 = 5;
				arg0 = arg0.substring(Static344.aClass202_188.method5139(Static172.anInt6352).length());
			}
		}
		Static93.method1721(Static499.aClass243_87);
		Static381.aClass2_Sub29_Sub2_2.method5172(0);
		@Pc(646) int local646 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
		if (arg1 == 5021) {
			Static381.aClass2_Sub29_Sub2_2.method5172(1);
		} else {
			Static381.aClass2_Sub29_Sub2_2.method5172(0);
		}
		Static381.aClass2_Sub29_Sub2_2.method5172(local13);
		Static381.aClass2_Sub29_Sub2_2.method5172(local451);
		Static340.method5357(Static381.aClass2_Sub29_Sub2_2, arg0);
		Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local646);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V")
	public static void method4033() {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	private static void method4034(@OriginalArg(0) int arg0) {
		@Pc(3) Class310 local3 = Static111.method2143(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class310[] local13 = Static196.aClass310ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class310[] local19 = Static235.aClass310ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static196.aClass310ArrayArray1[local9] = new Class310[local22];
			Static553.method3372(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static553.method3372(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method4035(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar6.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar6.get(5);
		@Pc(20) int local20 = aCalendar6.get(2);
		@Pc(24) int local24 = aCalendar6.get(1);
		return local16 + "-" + aStringArray26[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
	private static void method4036(@OriginalArg(0) int arg0) {
		@Pc(3) Class310 local3 = Static111.method2143(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class310[] local13 = Static196.aClass310ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class310[] local19 = Static235.aClass310ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static196.aClass310ArrayArray1[local9] = new Class310[local22];
			Static553.method3372(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static553.method3372(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!im;)V")
	public static void method4037(@OriginalArg(0) Class2_Sub28 arg0) {
		method4038(arg0, 200000);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!im;I)V")
	private static void method4038(@OriginalArg(0) Class2_Sub28 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub13_Sub11 local12 = Static428.method6594(local8);
		if (local12 == null) {
			return;
		}
		anIntArray435 = new int[local12.anInt5175];
		@Pc(21) int local21 = 0;
		aStringArray25 = new String[local12.anInt5172];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3743;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3744;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass310_8 == null ? -1 : arg0.aClass310_8.anInt9226;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3739;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass310_8 == null ? -1 : arg0.aClass310_8.anInt9170;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass310_9 == null ? -1 : arg0.aClass310_9.anInt9226;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass310_9 == null ? -1 : arg0.aClass310_9.anInt9170;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3738;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3740;
				}
				anIntArray435[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString94;
				}
				aStringArray25[local27++] = local135;
			}
		}
		anInt4658 = arg0.anInt3745;
		method4041(local12, arg1);
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	public static void method4039(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static106.method1964(arg0)) {
			return;
		}
		@Pc(12) Class310[] local12 = Static235.aClass310ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class310 local19 = local12[local14];
			if (local19.anObjectArray28 != null) {
				@Pc(26) Class2_Sub28 local26 = new Class2_Sub28();
				local26.aClass310_8 = local19;
				local26.anObjectArray2 = local19.anObjectArray28;
				method4038(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(IZ)V")
	private static void method4040(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
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
				anIntArray436[anInt4655++] = Static357.anInt6794;
				return;
			}
			if (arg0 == 5001) {
				anInt4655 -= 3;
				Static357.anInt6794 = anIntArray436[anInt4655];
				Static322.aClass9_3 = Static301.method4739(anIntArray436[anInt4655 + 1]);
				if (Static322.aClass9_3 == null) {
					Static322.aClass9_3 = Static516.aClass9_4;
				}
				Static495.anInt8679 = anIntArray436[anInt4655 + 2];
				Static93.method1721(Static537.aClass243_93);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static357.anInt6794);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static322.aClass9_3.anInt226);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static495.anInt8679);
				return;
			}
			if (arg0 == 5002) {
				anInt4653 -= 2;
				local75 = aStringArray24[anInt4653];
				local81 = aStringArray24[anInt4653 + 1];
				anInt4655 -= 2;
				local89 = anIntArray436[anInt4655];
				local95 = anIntArray436[anInt4655 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static93.method1721(Static432.aClass243_80);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(local75) + Static332.method5299(local81) + 2);
				Static381.aClass2_Sub29_Sub2_2.method5189(local75);
				Static381.aClass2_Sub29_Sub2_2.method5172(local89 - 1);
				Static381.aClass2_Sub29_Sub2_2.method5172(local95);
				Static381.aClass2_Sub29_Sub2_2.method5189(local81);
				return;
			}
			@Pc(161) Class8 local161;
			if (arg0 == 5003) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local163 = "";
				if (local161 != null && local161.aString5 != null) {
					local163 = local161.aString5;
				}
				aStringArray24[anInt4653++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt220;
				}
				anIntArray436[anInt4655++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static322.aClass9_3 == null) {
					anIntArray436[anInt4655++] = -1;
					return;
				}
				anIntArray436[anInt4655++] = Static322.aClass9_3.anInt226;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = aStringArray24[--anInt4653];
				method4032(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4653 -= 2;
				local75 = aStringArray24[anInt4653];
				local81 = aStringArray24[anInt4653 + 1];
				if (Static475.anInt8486 != 0 || (!Static89.aBoolean131 || Static100.aBoolean147) && !Static391.aBoolean559) {
					Static93.method1721(Static99.aClass243_25);
					Static381.aClass2_Sub29_Sub2_2.method5172(0);
					local89 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
					Static381.aClass2_Sub29_Sub2_2.method5189(local75);
					Static340.method5357(Static381.aClass2_Sub29_Sub2_2, local81);
					Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local163 = "";
				if (local161 != null && local161.aString7 != null) {
					local163 = local161.aString7;
				}
				aStringArray24[anInt4653++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local163 = "";
				if (local161 != null && local161.aString4 != null) {
					local163 = local161.aString4;
				}
				aStringArray24[anInt4653++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt222;
				}
				anIntArray436[anInt4655++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static266.aClass1_Sub1_Sub2_Sub1_1 == null || Static266.aClass1_Sub1_Sub2_Sub1_1.aString82 == null) {
					local75 = Static43.aString22;
				} else {
					local75 = Static266.aClass1_Sub1_Sub2_Sub1_1.method2948();
				}
				aStringArray24[anInt4653++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray436[anInt4655++] = Static495.anInt8679;
				return;
			}
			if (arg0 == 5017) {
				anIntArray436[anInt4655++] = Static181.method3001();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt217;
				}
				anIntArray436[anInt4655++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local163 = "";
				if (local161 != null && local161.aString6 != null) {
					local163 = local161.aString6;
				}
				aStringArray24[anInt4653++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static266.aClass1_Sub1_Sub2_Sub1_1 == null || Static266.aClass1_Sub1_Sub2_Sub1_1.aString82 == null) {
					local75 = Static43.aString22;
				} else {
					local75 = Static266.aClass1_Sub1_Sub2_Sub1_1.method2952();
				}
				aStringArray24[anInt4653++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt221;
				}
				anIntArray436[anInt4655++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray436[--anInt4655];
				local161 = Static242.method3726(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt215;
				}
				anIntArray436[anInt4655++] = local89;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray436[--anInt4655];
				aStringArray24[anInt4653++] = Static70.aClass219_1.method5798(local157).aString36;
				return;
			}
			@Pc(651) Class2_Sub13_Sub1 local651;
			if (arg0 == 5051) {
				local157 = anIntArray436[--anInt4655];
				local651 = Static70.aClass219_1.method5798(local157);
				if (local651.anIntArray106 == null) {
					anIntArray436[anInt4655++] = 0;
					return;
				}
				anIntArray436[anInt4655++] = local651.anIntArray106.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				@Pc(696) Class2_Sub13_Sub1 local696 = Static70.aClass219_1.method5798(local157);
				local95 = local696.anIntArray106[local691];
				anIntArray436[anInt4655++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray436[--anInt4655];
				local651 = Static70.aClass219_1.method5798(local157);
				if (local651.anIntArray105 == null) {
					anIntArray436[anInt4655++] = 0;
					return;
				}
				anIntArray436[anInt4655++] = local651.anIntArray105.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				anIntArray436[anInt4655++] = Static70.aClass219_1.method5798(local157).anIntArray105[local691];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray436[--anInt4655];
				aStringArray24[anInt4653++] = Static389.aClass64_1.method1878(local157).method7055();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray436[--anInt4655];
				@Pc(822) Class2_Sub13_Sub17 local822 = Static389.aClass64_1.method1878(local157);
				if (local822.anIntArray646 == null) {
					anIntArray436[anInt4655++] = 0;
					return;
				}
				anIntArray436[anInt4655++] = local822.anIntArray646.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				anIntArray436[anInt4655++] = Static389.aClass64_1.method1878(local157).anIntArray646[local691];
				return;
			}
			if (arg0 == 5058) {
				aClass160_1 = new Class160();
				aClass160_1.anInt4567 = anIntArray436[--anInt4655];
				aClass160_1.aClass2_Sub13_Sub17_1 = Static389.aClass64_1.method1878(aClass160_1.anInt4567);
				aClass160_1.anIntArray429 = new int[aClass160_1.aClass2_Sub13_Sub17_1.method7056()];
				return;
			}
			if (arg0 == 5059) {
				Static93.method1721(Static116.aClass243_32);
				Static381.aClass2_Sub29_Sub2_2.method5172(0);
				local157 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
				Static381.aClass2_Sub29_Sub2_2.method5172(0);
				Static381.aClass2_Sub29_Sub2_2.method5217(aClass160_1.anInt4567);
				aClass160_1.aClass2_Sub13_Sub17_1.method7049(aClass160_1.anIntArray429, Static381.aClass2_Sub29_Sub2_2);
				Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray24[--anInt4653];
				Static93.method1721(Static511.aClass243_90);
				Static381.aClass2_Sub29_Sub2_2.method5172(0);
				local691 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
				Static381.aClass2_Sub29_Sub2_2.method5189(local75);
				Static381.aClass2_Sub29_Sub2_2.method5217(aClass160_1.anInt4567);
				aClass160_1.aClass2_Sub13_Sub17_1.method7049(aClass160_1.anIntArray429, Static381.aClass2_Sub29_Sub2_2);
				Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local691);
				return;
			}
			if (arg0 == 5061) {
				Static93.method1721(Static116.aClass243_32);
				Static381.aClass2_Sub29_Sub2_2.method5172(0);
				local157 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
				Static381.aClass2_Sub29_Sub2_2.method5172(1);
				Static381.aClass2_Sub29_Sub2_2.method5217(aClass160_1.anInt4567);
				aClass160_1.aClass2_Sub13_Sub17_1.method7049(aClass160_1.anIntArray429, Static381.aClass2_Sub29_Sub2_2);
				Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				anIntArray436[anInt4655++] = Static70.aClass219_1.method5798(local157).aCharArray4[local691];
				return;
			}
			if (arg0 == 5063) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				anIntArray436[anInt4655++] = Static70.aClass219_1.method5798(local157).aCharArray3[local691];
				return;
			}
			if (arg0 == 5064) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				if (local691 == -1) {
					anIntArray436[anInt4655++] = -1;
					return;
				}
				anIntArray436[anInt4655++] = Static70.aClass219_1.method5798(local157).method1099((char) local691);
				return;
			}
			if (arg0 == 5065) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				if (local691 == -1) {
					anIntArray436[anInt4655++] = -1;
					return;
				}
				anIntArray436[anInt4655++] = Static70.aClass219_1.method5798(local157).method1101((char) local691);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray436[--anInt4655];
				anIntArray436[anInt4655++] = Static389.aClass64_1.method1878(local157).method7056();
				return;
			}
			if (arg0 == 5067) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				local89 = Static389.aClass64_1.method1878(local157).method7048(local691).anInt7646;
				anIntArray436[anInt4655++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				aClass160_1.anIntArray429[local157] = local691;
				return;
			}
			if (arg0 == 5069) {
				anInt4655 -= 2;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				aClass160_1.anIntArray429[local157] = local691;
				return;
			}
			if (arg0 == 5070) {
				anInt4655 -= 3;
				local157 = anIntArray436[anInt4655];
				local691 = anIntArray436[anInt4655 + 1];
				local89 = anIntArray436[anInt4655 + 2];
				@Pc(1327) Class2_Sub13_Sub17 local1327 = Static389.aClass64_1.method1878(local157);
				if (local1327.method7048(local691).anInt7646 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray436[anInt4655++] = local1327.method7050(local691, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray24[--anInt4653];
				local1375 = anIntArray436[--anInt4655] == 1;
				Static191.method6948(local1375, local75);
				anIntArray436[anInt4655++] = Static319.anInt5969;
				return;
			}
			if (arg0 == 5072) {
				if (Static206.aShortArray70 != null && Static155.anInt2821 < Static319.anInt5969) {
					anIntArray436[anInt4655++] = Static206.aShortArray70[Static155.anInt2821++] & 0xFFFF;
					return;
				}
				anIntArray436[anInt4655++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static155.anInt2821 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static311.aClass189_1.method4710(86)) {
					anIntArray436[anInt4655++] = 1;
					return;
				}
				anIntArray436[anInt4655++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static311.aClass189_1.method4710(82)) {
					anIntArray436[anInt4655++] = 1;
					return;
				}
				anIntArray436[anInt4655++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static311.aClass189_1.method4710(81)) {
					anIntArray436[anInt4655++] = 1;
					return;
				}
				anIntArray436[anInt4655++] = 0;
				return;
			}
		} else {
			@Pc(2712) int local2712;
			@Pc(1986) boolean local1986;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static149.method2583(anIntArray436[--anInt4655]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray436[anInt4655++] = Static515.method3361();
					return;
				}
				if (arg0 == 5205) {
					Static246.method3901(-1, -1, false, anIntArray436[--anInt4655]);
					return;
				}
				@Pc(1575) Class2_Sub13_Sub16 local1575;
				if (arg0 == 5206) {
					local157 = anIntArray436[--anInt4655];
					local1575 = Static201.method368(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1575 == null) {
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = local1575.anInt8422;
					return;
				}
				@Pc(1608) Class2_Sub13_Sub16 local1608;
				if (arg0 == 5207) {
					local1608 = Static201.method366(anIntArray436[--anInt4655]);
					if (local1608 != null && local1608.aString174 != null) {
						aStringArray24[anInt4653++] = local1608.aString174;
						return;
					}
					aStringArray24[anInt4653++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray436[anInt4655++] = Static507.anInt2736;
					anIntArray436[anInt4655++] = Static33.anInt601;
					return;
				}
				if (arg0 == 5209) {
					anIntArray436[anInt4655++] = Static202.anInt3644 + Static201.anInt205;
					anIntArray436[anInt4655++] = Static140.anInt2619 + Static201.anInt198;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray436[--anInt4655];
					local1575 = Static201.method366(local157);
					if (local1575 == null) {
						anIntArray436[anInt4655++] = 0;
						anIntArray436[anInt4655++] = 0;
						return;
					}
					anIntArray436[anInt4655++] = local1575.anInt8420 >> 14 & 0x3FFF;
					anIntArray436[anInt4655++] = local1575.anInt8420 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray436[--anInt4655];
					local1575 = Static201.method366(local157);
					if (local1575 == null) {
						anIntArray436[anInt4655++] = 0;
						anIntArray436[anInt4655++] = 0;
						return;
					}
					anIntArray436[anInt4655++] = local1575.anInt8406 - local1575.anInt8411;
					anIntArray436[anInt4655++] = local1575.anInt8413 - local1575.anInt8407;
					return;
				}
				@Pc(1798) Class2_Sub35 local1798;
				if (arg0 == 5212) {
					local1798 = Static287.method4531();
					if (local1798 == null) {
						anIntArray436[anInt4655++] = -1;
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = local1798.anInt6264;
					local691 = local1798.anInt6266 << 28 | local1798.anInt6261 + Static201.anInt205 << 14 | local1798.anInt6260 + Static201.anInt198;
					anIntArray436[anInt4655++] = local691;
					return;
				}
				if (arg0 == 5213) {
					local1798 = Static381.method5975();
					if (local1798 == null) {
						anIntArray436[anInt4655++] = -1;
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = local1798.anInt6264;
					local691 = local1798.anInt6266 << 28 | local1798.anInt6261 + Static201.anInt205 << 14 | local1798.anInt6260 + Static201.anInt198;
					anIntArray436[anInt4655++] = local691;
					return;
				}
				@Pc(1946) boolean local1946;
				if (arg0 == 5214) {
					local157 = anIntArray436[--anInt4655];
					local1575 = Static176.method2959();
					if (local1575 != null) {
						local1946 = local1575.method7027(anIntArray437, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, local157 & 0x3FFF);
						if (local1946) {
							Static300.method4725(anIntArray437[1], anIntArray437[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					@Pc(1984) Class185 local1984 = Static201.method354(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1986 = false;
					for (@Pc(1991) Class2_Sub13_Sub16 local1991 = (Class2_Sub13_Sub16) local1984.method4623(); local1991 != null; local1991 = (Class2_Sub13_Sub16) local1984.method4617()) {
						if (local1991.anInt8422 == local691) {
							local1986 = true;
							break;
						}
					}
					if (local1986) {
						anIntArray436[anInt4655++] = 1;
						return;
					}
					anIntArray436[anInt4655++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray436[--anInt4655];
					local1575 = Static201.method366(local157);
					if (local1575 == null) {
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = local1575.anInt8419;
					return;
				}
				if (arg0 == 5220) {
					anIntArray436[anInt4655++] = Static111.anInt2224 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray436[--anInt4655];
					Static300.method4725(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1608 = Static176.method2959();
					if (local1608 != null) {
						local1375 = local1608.method7028(Static140.anInt2619 + Static201.anInt198, anIntArray437, Static202.anInt3644 + Static201.anInt205);
						if (local1375) {
							anIntArray436[anInt4655++] = anIntArray437[1];
							anIntArray436[anInt4655++] = anIntArray437[2];
							return;
						}
						anIntArray436[anInt4655++] = -1;
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = -1;
					anIntArray436[anInt4655++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					Static246.method3901(local691 >> 14 & 0x3FFF, local691 & 0x3FFF, false, local157);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray436[--anInt4655];
					local1575 = Static176.method2959();
					if (local1575 != null) {
						local1946 = local1575.method7027(anIntArray437, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, local157 & 0x3FFF);
						if (local1946) {
							anIntArray436[anInt4655++] = anIntArray437[1];
							anIntArray436[anInt4655++] = anIntArray437[2];
							return;
						}
						anIntArray436[anInt4655++] = -1;
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = -1;
					anIntArray436[anInt4655++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray436[--anInt4655];
					local1575 = Static176.method2959();
					if (local1575 != null) {
						local1946 = local1575.method7028(local157 & 0x3FFF, anIntArray437, local157 >> 14 & 0x3FFF);
						if (local1946) {
							anIntArray436[anInt4655++] = anIntArray437[1];
							anIntArray436[anInt4655++] = anIntArray437[2];
							return;
						}
						anIntArray436[anInt4655++] = -1;
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = -1;
					anIntArray436[anInt4655++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static362.method5834(anIntArray436[--anInt4655]);
					return;
				}
				if (arg0 == 5227) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					Static246.method3901(local691 >> 14 & 0x3FFF, local691 & 0x3FFF, true, local157);
					return;
				}
				if (arg0 == 5228) {
					Static329.aBoolean305 = anIntArray436[--anInt4655] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray436[anInt4655++] = Static329.aBoolean305 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray436[--anInt4655];
					Static250.method3963(local157);
					return;
				}
				@Pc(2504) Class2 local2504;
				if (arg0 == 5231) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local1375 = anIntArray436[anInt4655 + 1] == 1;
					if (Static391.aClass127_38 != null) {
						local2504 = Static391.aClass127_38.method3205((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7802();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class2();
							Static391.aClass127_38.method3213(local2504, (long) local157);
						}
					}
					return;
				}
				@Pc(2546) Class2 local2546;
				if (arg0 == 5232) {
					local157 = anIntArray436[--anInt4655];
					if (Static391.aClass127_38 != null) {
						local2546 = Static391.aClass127_38.method3205((long) local157);
						anIntArray436[anInt4655++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray436[anInt4655++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local1375 = anIntArray436[anInt4655 + 1] == 1;
					if (Static348.aClass127_35 != null) {
						local2504 = Static348.aClass127_35.method3205((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7802();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class2();
							Static348.aClass127_35.method3213(local2504, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray436[--anInt4655];
					if (Static348.aClass127_35 != null) {
						local2546 = Static348.aClass127_35.method3205((long) local157);
						anIntArray436[anInt4655++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray436[anInt4655++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray436[anInt4655++] = Static201.aClass2_Sub13_Sub16_2 == null ? -1 : Static201.aClass2_Sub13_Sub16_2.anInt8422;
					return;
				}
				if (arg0 == 5236) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = local691 >> 14 & 0x3FFF;
					local95 = local691 & 0x3FFF;
					local2712 = Static156.method2701(local95, local157, local89);
					if (local2712 < 0) {
						anIntArray436[anInt4655++] = -1;
						return;
					}
					anIntArray436[anInt4655++] = local2712;
					return;
				}
				if (arg0 == 5237) {
					Static541.method7775();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					Static301.method4737(local691, false, local157, 3);
					anIntArray436[anInt4655++] = Static36.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static36.aFrame1 != null) {
						Static301.method4737(-1, false, -1, Static281.aClass2_Sub19_Sub1_1.anInt2198);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2796) Class237[] local2796 = Static479.method7147();
					anIntArray436[anInt4655++] = local2796.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray436[--anInt4655];
					@Pc(2820) Class237[] local2820 = Static479.method7147();
					anIntArray436[anInt4655++] = local2820[local157].anInt7570;
					anIntArray436[anInt4655++] = local2820[local157].anInt7571;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static281.aClass2_Sub19_Sub1_1.anInt2182;
					local691 = Static281.aClass2_Sub19_Sub1_1.anInt2201;
					local89 = -1;
					@Pc(2857) Class237[] local2857 = Static479.method7147();
					for (local2712 = 0; local2712 < local2857.length; local2712++) {
						@Pc(2864) Class237 local2864 = local2857[local2712];
						if (local2864.anInt7570 == local157 && local2864.anInt7571 == local691) {
							local89 = local2712;
							break;
						}
					}
					anIntArray436[anInt4655++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray436[anInt4655++] = Static181.method3002();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray436[--anInt4655];
					if (local157 >= 1 && local157 <= 2) {
						Static301.method4737(-1, false, -1, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2198;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray436[--anInt4655];
					if (local157 >= 1 && local157 <= 2) {
						Static281.aClass2_Sub19_Sub1_1.anInt2198 = local157;
						Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt4653 -= 2;
					local75 = aStringArray24[anInt4653];
					local81 = aStringArray24[anInt4653 + 1];
					local89 = anIntArray436[--anInt4655];
					Static93.method1721(Static53.aClass243_12);
					Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(local75) + Static332.method5299(local81) + 1);
					Static381.aClass2_Sub29_Sub2_2.method5189(local75);
					Static381.aClass2_Sub29_Sub2_2.method5189(local81);
					Static381.aClass2_Sub29_Sub2_2.method5172(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt4655 -= 2;
					Static433.aShortArray86[anIntArray436[anInt4655]] = (short) Static447.method6828(anIntArray436[anInt4655 + 1]);
					Static464.aClass115_1.method2969();
					Static464.aClass115_1.method2974();
					Static21.aClass255_2.method6587();
					Static190.method3102();
					return;
				}
				if (arg0 == 5405) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static16.anIntArrayArrayArray1[local157] = new int[local691 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt4655 -= 7;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1] << 1;
					local89 = anIntArray436[anInt4655 + 2];
					local95 = anIntArray436[anInt4655 + 3];
					local2712 = anIntArray436[anInt4655 + 4];
					@Pc(3132) int local3132 = anIntArray436[anInt4655 + 5];
					@Pc(3138) int local3138 = anIntArray436[anInt4655 + 6];
					if (local157 >= 0 && local157 < 2 && Static16.anIntArrayArrayArray1[local157] != null && local691 >= 0 && local691 < Static16.anIntArrayArrayArray1[local157].length) {
						Static16.anIntArrayArrayArray1[local157][local691] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3138 };
						Static16.anIntArrayArrayArray1[local157][local691 + 1] = new int[] { (local2712 >> 14 & 0x3FFF) << 7, local3132, (local2712 & 0x3FFF) << 7 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static16.anIntArrayArrayArray1[anIntArray436[--anInt4655]].length >> 1;
					anIntArray436[anInt4655++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static36.aFrame1 != null) {
						Static301.method4737(-1, false, -1, Static281.aClass2_Sub19_Sub1_1.anInt2198);
					}
					if (Static132.aFrame2 != null) {
						Static538.method7748();
						System.exit(0);
						return;
					}
					local75 = Static80.aString43 == null ? Static381.method5981() : Static80.aString43;
					Static116.method2246(local75, false, Static531.aClass283_6, Static266.anInt4923 == 1);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static17.aClass20_4 != null) {
						if (Static17.aClass20_4.anObject2 == null) {
							local75 = Static374.method5905(Static17.aClass20_4.anInt594);
						} else {
							local75 = (String) Static17.aClass20_4.anObject2;
						}
					}
					aStringArray24[anInt4653++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray436[anInt4655++] = Static482.anInt8574 == 3 ? 1 : 0;
					return;
				}
				if (arg0 == 5421) {
					if (Static36.aFrame1 != null) {
						Static301.method4737(-1, false, -1, Static281.aClass2_Sub19_Sub1_1.anInt2198);
					}
					local75 = aStringArray24[--anInt4653];
					local1375 = anIntArray436[--anInt4655] == 1;
					local163 = Static381.method5981() + local75;
					Static116.method2246(local163, local1375, Static531.aClass283_6, Static266.anInt4923 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt4653 -= 2;
					local75 = aStringArray24[anInt4653];
					local81 = aStringArray24[anInt4653 + 1];
					local89 = anIntArray436[--anInt4655];
					if (local75.length() > 0) {
						if (Static154.aStringArray16 == null) {
							Static154.aStringArray16 = new String[Static9.anIntArray19[Static185.aClass212_1.anInt6307]];
						}
						Static154.aStringArray16[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static105.aStringArray9 == null) {
							Static105.aStringArray9 = new String[Static9.anIntArray19[Static185.aClass212_1.anInt6307]];
						}
						Static105.aStringArray9[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray24[--anInt4653]);
					return;
				}
				if (arg0 == 5424) {
					anInt4655 -= 11;
					Static103.anInt1992 = anIntArray436[anInt4655];
					Static431.anInt7912 = anIntArray436[anInt4655 + 1];
					Static539.anInt9336 = anIntArray436[anInt4655 + 2];
					Static61.anInt1175 = anIntArray436[anInt4655 + 3];
					Static138.anInt2610 = anIntArray436[anInt4655 + 4];
					Static6.anInt160 = anIntArray436[anInt4655 + 5];
					Static451.anInt8201 = anIntArray436[anInt4655 + 6];
					Static386.anInt7086 = anIntArray436[anInt4655 + 7];
					Static174.anInt3155 = anIntArray436[anInt4655 + 8];
					Static148.anInt2727 = anIntArray436[anInt4655 + 9];
					Static445.anInt8077 = anIntArray436[anInt4655 + 10];
					Static460.aClass53_147.method1621(Static138.anInt2610);
					Static460.aClass53_147.method1621(Static6.anInt160);
					Static460.aClass53_147.method1621(Static451.anInt8201);
					Static460.aClass53_147.method1621(Static386.anInt7086);
					Static460.aClass53_147.method1621(Static174.anInt3155);
					Static298.aClass35_24 = null;
					Static275.aClass35_28 = null;
					Static281.aClass35_23 = null;
					Static107.aClass35_16 = null;
					Static254.aClass35_21 = null;
					Static82.aClass35_6 = null;
					Static274.aClass35_22 = null;
					Static251.aClass35_20 = null;
					Static254.aBoolean340 = true;
					return;
				}
				if (arg0 == 5425) {
					Static119.method2312();
					Static254.aBoolean340 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt4655 -= 2;
					Static161.anInt2925 = anIntArray436[anInt4655];
					Static145.anInt2686 = anIntArray436[anInt4655 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt4655 -= 2;
					Static4.anInt114 = anIntArray436[anInt4655 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					anIntArray436[anInt4655++] = Static359.method5800(local157, local691) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static172.method5411(false, false, aStringArray24[--anInt4653]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static559.method6631("accountcreated", Static531.aClass283_6.anApplet1);
						return;
					} catch (@Pc(3667) Throwable local3667) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static559.method6631("accountcreatestarted", Static531.aClass283_6.anApplet1);
						return;
					} catch (@Pc(3679) Throwable local3679) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt4655 -= 4;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					local95 = anIntArray436[anInt4655 + 3];
					Static211.method6680(local691, false, (local157 >> 14 & 0x3FFF) - Static238.anInt4280, local89, local95, (local157 & 0x3FFF) - Static371.anInt6936);
					return;
				}
				if (arg0 == 5501) {
					anInt4655 -= 4;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					local95 = anIntArray436[anInt4655 + 3];
					Static282.method4467(local691, (local157 & 0x3FFF) - Static371.anInt6936, local95, local89, (local157 >> 14 & 0x3FFF) - Static238.anInt4280);
					return;
				}
				if (arg0 == 5502) {
					anInt4655 -= 6;
					local157 = anIntArray436[anInt4655];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static28.anInt525 = local157;
					local691 = anIntArray436[anInt4655 + 1];
					if (local691 + 1 >= Static16.anIntArrayArrayArray1[Static28.anInt525].length >> 1) {
						throw new RuntimeException();
					}
					Static145.anInt2688 = local691;
					Static160.anInt2916 = 0;
					Static92.anInt1815 = anIntArray436[anInt4655 + 2];
					Static394.anInt7459 = anIntArray436[anInt4655 + 3];
					local89 = anIntArray436[anInt4655 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static401.anInt7597 = local89;
					local95 = anIntArray436[anInt4655 + 5];
					if (local95 + 1 >= Static16.anIntArrayArrayArray1[Static401.anInt7597].length >> 1) {
						throw new RuntimeException();
					}
					Static452.anInt8228 = local95;
					Static427.anInt7875 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static522.method7565();
					return;
				}
				if (arg0 == 5504) {
					anInt4655 -= 2;
					Static448.method6844(anIntArray436[anInt4655], anIntArray436[anInt4655 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray436[anInt4655++] = (int) Static265.aFloat182 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray436[anInt4655++] = (int) Static161.aFloat56 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static520.method1885();
					return;
				}
				if (arg0 == 5508) {
					Static52.method955();
					return;
				}
				if (arg0 == 5509) {
					Static287.method4532();
					return;
				}
				if (arg0 == 5510) {
					Static429.method6700();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray436[--anInt4655];
					local691 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local691 -= Static238.anInt4280;
					if (local691 < 0) {
						local691 = 0;
					} else if (local691 >= Static363.anInt1158) {
						local691 = Static363.anInt1158;
					}
					local89 -= Static371.anInt6936;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static511.anInt8889) {
						local89 = Static511.anInt8889;
					}
					Static4.anInt115 = (local691 << 7) + 64;
					Static365.anInt6883 = (local89 << 7) + 64;
					Static427.anInt7875 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static475.method7099();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt4653 -= 2;
					local75 = aStringArray24[anInt4653];
					local81 = aStringArray24[anInt4653 + 1];
					local89 = anIntArray436[--anInt4655];
					if (Static271.anInt8654 != 2) {
						return;
					}
					if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						Static43.aString22 = local75;
						Static454.aString170 = local81;
						Static456.anInt8316 = local89;
						Static301.method4738(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static249.method3955();
					return;
				}
				if (arg0 == 5602) {
					if (Static528.anInt9122 == 0) {
						Static397.anInt7572 = -2;
						Static420.anInt7814 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt4655 -= 4;
					if (Static271.anInt8654 != 2) {
						return;
					}
					if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						Static315.method4854(anIntArray436[anInt4655 + 1], anIntArray436[anInt4655 + 3], anIntArray436[anInt4655 + 2], anIntArray436[anInt4655]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt4653--;
					if (Static271.anInt8654 != 2) {
						return;
					}
					if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						Static452.method6902(Static156.method2700(aStringArray24[anInt4653]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt4653 -= 2;
					if (Static271.anInt8654 != 2) {
						return;
					}
					if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						Static17.method506(aStringArray24[anInt4653 + 1], Static156.method2700(aStringArray24[anInt4653]), false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static378.anInt7010 == 0) {
						Static55.anInt972 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray436[anInt4655++] = Static420.anInt7814;
					return;
				}
				if (arg0 == 5608) {
					anIntArray436[anInt4655++] = Static273.anInt4975;
					return;
				}
				if (arg0 == 5609) {
					anIntArray436[anInt4655++] = Static55.anInt972;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray24[anInt4653++] = Static123.aStringArray14.length > local157 ? Static477.method7127(Static123.aStringArray14[local157]) : "";
					}
					Static123.aStringArray14 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray436[anInt4655++] = Static13.anInt295;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray436[--anInt4655];
					if (Static271.anInt8654 != 6) {
						return;
					}
					if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						if (Static497.aClass173_2 != null) {
							Static497.aClass173_2.method7261();
							Static497.aClass173_2 = null;
						}
						Static456.anInt8316 = local157;
						Static301.method4738(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray436[anInt4655++] = Static420.anInt7814;
					return;
				}
				if (arg0 == 5615) {
					anInt4653 -= 2;
					local75 = aStringArray24[anInt4653];
					local81 = aStringArray24[anInt4653 + 1];
					if (Static271.anInt8654 != 2) {
						return;
					}
					if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						if (Static497.aClass173_2 != null) {
							Static497.aClass173_2.method7261();
							Static497.aClass173_2 = null;
						}
						Static43.aString22 = local75;
						Static454.aString170 = local81;
						Static301.method4738(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static346.method6463(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray436[anInt4655++] = Static397.anInt7572;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray436[--anInt4655];
					Static67.method1238(false, local157);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray436[--anInt4655];
					Static67.method1238(true, local157);
					return;
				}
				if (arg0 == 5620) {
					Static83.method1623();
					if (Static47.aString24 != "" && Static47.aString24 != "") {
						anIntArray436[anInt4655++] = 1;
						return;
					}
					anIntArray436[anInt4655++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt4653 -= 2;
					if (Static271.anInt8654 != 2) {
						return;
					}
					if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						Static17.method506(aStringArray24[anInt4653 + 1], Static156.method2700(aStringArray24[anInt4653]), true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4469) Class20 local4469 = Static531.aClass283_6.method7180("3", false);
					while (local4469.anInt593 == 0) {
						Static379.method5233(1L);
					}
					if (local4469.anInt593 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4489) Class133 local4489 = (Class133) local4469.anObject2;
					if (local4489.method3310().exists()) {
						@Pc(4499) Class2_Sub29 local4499 = new Class2_Sub29(50);
						try {
							local4489.method3307(0, 50, local4499.aByteArray96);
						} catch (@Pc(4508) IOException local4508) {
						}
					}
					try {
						local4489.method3306();
						return;
					} catch (@Pc(4514) Exception local4514) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static302.aString124 != null) {
						anIntArray436[anInt4655++] = 1;
						return;
					}
					anIntArray436[anInt4655++] = 0;
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2194 = local157;
					Static410.method6418();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6002) {
					Static281.aClass2_Sub19_Sub1_1.method2142(anIntArray436[--anInt4655] == 1);
					Static410.method6418();
					Static451.method6878();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6003) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean193 = anIntArray436[--anInt4655] == 1;
					Static451.method6878();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6005) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean183 = anIntArray436[--anInt4655] == 1;
					Static410.method6418();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6006) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean182 = anIntArray436[--anInt4655] == 1;
					Static103.aClass39_3.method6044(!Static281.aClass2_Sub19_Sub1_1.aBoolean182);
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6007) {
					Static281.aClass2_Sub19_Sub1_1.anInt2191 = anIntArray436[--anInt4655];
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6008) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean187 = anIntArray436[--anInt4655] == 1;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6009) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean189 = anIntArray436[--anInt4655] == 1;
					Static410.method6418();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6010) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean188 = anIntArray436[--anInt4655] == 1;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static281.aClass2_Sub19_Sub1_1.method2138(local157, Static266.anInt4923);
					Static410.method6418();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6012) {
					Static281.aClass2_Sub19_Sub1_1.method2136(anIntArray436[--anInt4655] == 1, Static266.anInt4923);
					Static436.method6681();
					Static330.method3998();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6014) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean194 = anIntArray436[--anInt4655] == 1;
					Static410.method6418();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6015) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean181 = anIntArray436[--anInt4655] == 1;
					Static410.method6418();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2192 = local157;
					Static233.method6719(Static266.anInt4923);
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					return;
				}
				if (arg0 == 6017) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean195 = anIntArray436[--anInt4655] == 1;
					Static282.method4466();
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2187 = local157;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static281.aClass2_Sub19_Sub1_1.anInt2190) {
						if (Static281.aClass2_Sub19_Sub1_1.anInt2190 == 0 && Static294.anInt5419 != -1) {
							Static286.method4519(local157, Static294.anInt5419, Static463.aClass53_134);
							Static539.aBoolean675 = false;
						} else if (local157 == 0) {
							Static20.method550();
							Static539.aBoolean675 = false;
						} else {
							Static337.method5337(local157);
						}
						Static281.aClass2_Sub19_Sub1_1.anInt2190 = local157;
					}
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2202 = local157;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6021) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean203 = anIntArray436[--anInt4655] == 1;
					Static451.method6878();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray436[--anInt4655];
					local1375 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static78.anInt1651 < 96) {
						local157 = 0;
						local1375 = true;
					}
					Static250.method3960(local157);
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					anIntArray436[anInt4655++] = local1375 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2181 = local157;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > Static58.method1074(Static78.anInt1651)) {
						local157 = 0;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2189 = local157;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static3.method262(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean190 = anIntArray436[--anInt4655] != 0;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					return;
				}
				if (arg0 == 6029) {
					Static281.aClass2_Sub19_Sub1_1.anInt2191 = anIntArray436[--anInt4655];
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					return;
				}
				if (arg0 == 6030) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean191 = anIntArray436[--anInt4655] != 0;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static410.method6418();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static233.method6719(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2180 = local157;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray436[--anInt4655];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static281.aClass2_Sub19_Sub1_1.anInt2183 = local157;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					return;
				}
				if (arg0 == 6034) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean179 = anIntArray436[--anInt4655] == 1;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static436.method6681();
					Static210.aBoolean299 = false;
					return;
				}
				if (arg0 == 6035) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean199 = anIntArray436[--anInt4655] == 1;
					Static410.method6418();
					Static451.method6878();
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2194;
					return;
				}
				if (arg0 == 6102) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.method2155(Static266.anInt4923) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean193 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean183 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean182 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2191;
					return;
				}
				if (arg0 == 6108) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean187 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean189 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean188 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923);
					return;
				}
				if (arg0 == 6112) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.method2134(Static266.anInt4923) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean194 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean181 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2192;
					return;
				}
				if (arg0 == 6117) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean195 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2187;
					return;
				}
				if (arg0 == 6119) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2190;
					return;
				}
				if (arg0 == 6120) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2202;
					return;
				}
				if (arg0 == 6121) {
					anIntArray436[anInt4655++] = Static103.aClass39_3.method6054() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray436[anInt4655++] = Static523.method7573();
					return;
				}
				if (arg0 == 6124) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2181;
					return;
				}
				if (arg0 == 6125) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2189;
					return;
				}
				if (arg0 == 6126) {
					anIntArray436[anInt4655++] = Static103.aClass39_3.method6026() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean192 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean190 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2191;
					return;
				}
				if (arg0 == 6130) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean191 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray436[anInt4655++] = Static266.anInt4923;
					return;
				}
				if (arg0 == 6132) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2180;
					return;
				}
				if (arg0 == 6133) {
					anIntArray436[anInt4655++] = Static482.anInt8574 == 1 || Static482.anInt8574 == 4 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray436[anInt4655++] = Static58.method1074(Static78.anInt1651);
					return;
				}
				if (arg0 == 6135) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2183;
					return;
				}
				if (arg0 == 6136) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean179 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(5927) boolean local5927 = true;
					try {
						local5927 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(5937) Throwable local5937) {
					}
					anIntArray436[anInt4655++] = local5927 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt4655 -= 2;
					Static232.aShort81 = (short) anIntArray436[anInt4655];
					if (Static232.aShort81 <= 0) {
						Static232.aShort81 = 256;
					}
					Static5.aShort9 = (short) anIntArray436[anInt4655 + 1];
					if (Static5.aShort9 <= 0) {
						Static5.aShort9 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt4655 -= 2;
					Static296.aShort113 = (short) anIntArray436[anInt4655];
					if (Static296.aShort113 <= 0) {
						Static296.aShort113 = 256;
					}
					Static536.aShort164 = (short) anIntArray436[anInt4655 + 1];
					if (Static536.aShort164 <= 0) {
						Static536.aShort164 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt4655 -= 4;
					Static213.aShort75 = (short) anIntArray436[anInt4655];
					if (Static213.aShort75 <= 0) {
						Static213.aShort75 = 1;
					}
					Static460.aShort153 = (short) anIntArray436[anInt4655 + 1];
					if (Static460.aShort153 <= 0) {
						Static460.aShort153 = 32767;
					} else if (Static460.aShort153 < Static213.aShort75) {
						Static460.aShort153 = Static213.aShort75;
					}
					Static54.aShort19 = (short) anIntArray436[anInt4655 + 2];
					if (Static54.aShort19 <= 0) {
						Static54.aShort19 = 1;
					}
					Static263.aShort96 = (short) anIntArray436[anInt4655 + 3];
					if (Static263.aShort96 <= 0) {
						Static263.aShort96 = 32767;
						return;
					}
					if (Static263.aShort96 < Static54.aShort19) {
						Static263.aShort96 = Static54.aShort19;
					}
					return;
				}
				if (arg0 == 6203) {
					Static241.method3722(Static65.aClass310_3.anInt9163, 0, false, 0, Static65.aClass310_3.anInt9198);
					anIntArray436[anInt4655++] = Static273.anInt4974;
					anIntArray436[anInt4655++] = Static104.anInt2002;
					return;
				}
				if (arg0 == 6204) {
					anIntArray436[anInt4655++] = Static296.aShort113;
					anIntArray436[anInt4655++] = Static536.aShort164;
					return;
				}
				if (arg0 == 6205) {
					anIntArray436[anInt4655++] = Static232.aShort81;
					anIntArray436[anInt4655++] = Static5.aShort9;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray436[anInt4655++] = (int) (Static143.method2502() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray436[anInt4655++] = (int) (Static143.method2502() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					aCalendar6.clear();
					aCalendar6.set(11, 12);
					aCalendar6.set(local89, local691, local157);
					local95 = (int) (aCalendar6.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray436[anInt4655++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar6.clear();
					aCalendar6.setTime(new Date(Static143.method2502()));
					anIntArray436[anInt4655++] = aCalendar6.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray436[--anInt4655];
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
					anIntArray436[anInt4655++] = local1375 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray436[anInt4655++] = Static227.method3579() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray436[anInt4655++] = Static6.method312() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static271.anInt8654 == 6 && Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						if (Static521.aBoolean646) {
							anIntArray436[anInt4655++] = 0;
							return;
						}
						if (Static431.aLong188 > Static143.method2502() - 1000L) {
							anIntArray436[anInt4655++] = 1;
							return;
						}
						Static521.aBoolean646 = true;
						Static93.method1721(Static272.aClass243_57);
						Static381.aClass2_Sub29_Sub2_2.method5185(Static424.anInt7846);
						anIntArray436[anInt4655++] = 0;
						return;
					}
					anIntArray436[anInt4655++] = 1;
					return;
				}
				@Pc(6470) Class203 local6470;
				@Pc(6437) Class178_Sub1 local6437;
				if (arg0 == 6501) {
					local6437 = Static136.method2446();
					if (local6437 != null) {
						anIntArray436[anInt4655++] = local6437.anInt5263;
						anIntArray436[anInt4655++] = local6437.anInt5255;
						aStringArray24[anInt4653++] = local6437.aString117;
						local6470 = local6437.method4516();
						anIntArray436[anInt4655++] = local6470.anInt6041;
						aStringArray24[anInt4653++] = local6470.aString130;
						anIntArray436[anInt4655++] = local6437.anInt5251;
						anIntArray436[anInt4655++] = local6437.anInt5261;
						aStringArray24[anInt4653++] = local6437.aString116;
						return;
					}
					anIntArray436[anInt4655++] = -1;
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					anIntArray436[anInt4655++] = 0;
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6437 = Static50.method897();
					if (local6437 != null) {
						anIntArray436[anInt4655++] = local6437.anInt5263;
						anIntArray436[anInt4655++] = local6437.anInt5255;
						aStringArray24[anInt4653++] = local6437.aString117;
						local6470 = local6437.method4516();
						anIntArray436[anInt4655++] = local6470.anInt6041;
						aStringArray24[anInt4653++] = local6470.aString130;
						anIntArray436[anInt4655++] = local6437.anInt5251;
						anIntArray436[anInt4655++] = local6437.anInt5261;
						aStringArray24[anInt4653++] = local6437.aString116;
						return;
					}
					anIntArray436[anInt4655++] = -1;
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					anIntArray436[anInt4655++] = 0;
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray436[--anInt4655];
					local81 = aStringArray24[--anInt4653];
					if (Static271.anInt8654 == 6 && Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
						anIntArray436[anInt4655++] = Static528.method7626(local157, local81) ? 1 : 0;
						return;
					}
					anIntArray436[anInt4655++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static281.aClass2_Sub19_Sub1_1.anInt2196 = anIntArray436[--anInt4655];
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					return;
				}
				if (arg0 == 6505) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2196;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray436[--anInt4655];
					@Pc(6827) Class178_Sub1 local6827 = Static71.method1449(local157);
					if (local6827 != null) {
						anIntArray436[anInt4655++] = local6827.anInt5255;
						aStringArray24[anInt4653++] = local6827.aString117;
						@Pc(6851) Class203 local6851 = local6827.method4516();
						anIntArray436[anInt4655++] = local6851.anInt6041;
						aStringArray24[anInt4653++] = local6851.aString130;
						anIntArray436[anInt4655++] = local6827.anInt5251;
						anIntArray436[anInt4655++] = local6827.anInt5261;
						aStringArray24[anInt4653++] = local6827.aString116;
						return;
					}
					anIntArray436[anInt4655++] = -1;
					aStringArray24[anInt4653++] = "";
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					anIntArray436[anInt4655++] = 0;
					anIntArray436[anInt4655++] = 0;
					aStringArray24[anInt4653++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt4655 -= 4;
					local157 = anIntArray436[anInt4655];
					local1375 = anIntArray436[anInt4655 + 1] == 1;
					local89 = anIntArray436[anInt4655 + 2];
					local1986 = anIntArray436[anInt4655 + 3] == 1;
					Static31.method4803(local157, local89, local1375, local1986);
					return;
				}
				if (arg0 == 6508) {
					Static131.method2412();
					return;
				}
				if (arg0 == 6509) {
					if (Static271.anInt8654 != 6) {
						return;
					}
					Static251.aBoolean335 = anIntArray436[--anInt4655] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray436[anInt4655++] = Static332.anInt6223;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static281.aClass2_Sub19_Sub1_1.aBoolean196 = anIntArray436[--anInt4655] == 1;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					return;
				}
				if (arg0 == 6601) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.aBoolean196 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static183.aClass306_1 == Static324.aClass306_3) {
				if (arg0 == 6700) {
					local157 = Static110.aClass127_21.method3209();
					if (Static387.anInt7341 != -1) {
						local157++;
					}
					anIntArray436[anInt4655++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray436[--anInt4655];
					if (Static387.anInt7341 != -1) {
						if (local157 == 0) {
							anIntArray436[anInt4655++] = Static387.anInt7341;
							return;
						}
						local157--;
					}
					@Pc(7138) Class2_Sub9 local7138 = (Class2_Sub9) Static110.aClass127_21.method3203();
					while (local157-- > 0) {
						local7138 = (Class2_Sub9) Static110.aClass127_21.method3212();
					}
					anIntArray436[anInt4655++] = local7138.anInt833;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray436[--anInt4655];
					if (Static235.aClass310ArrayArray2[local157] == null) {
						aStringArray24[anInt4653++] = "";
						return;
					}
					local81 = Static235.aClass310ArrayArray2[local157][0].aString205;
					if (local81 == null) {
						aStringArray24[anInt4653++] = "";
						return;
					}
					aStringArray24[anInt4653++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray436[--anInt4655];
					if (Static235.aClass310ArrayArray2[local157] == null) {
						anIntArray436[anInt4655++] = 0;
						return;
					}
					anIntArray436[anInt4655++] = Static235.aClass310ArrayArray2[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					if (Static235.aClass310ArrayArray2[local157] == null) {
						aStringArray24[anInt4653++] = "";
						return;
					}
					local163 = Static235.aClass310ArrayArray2[local157][local691].aString205;
					if (local163 == null) {
						aStringArray24[anInt4653++] = "";
						return;
					}
					aStringArray24[anInt4653++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					if (Static235.aClass310ArrayArray2[local157] == null) {
						anIntArray436[anInt4655++] = 0;
						return;
					}
					anIntArray436[anInt4655++] = Static235.aClass310ArrayArray2[local157][local691].anInt9210;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(1, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6708) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(2, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6709) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(3, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6710) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(4, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6711) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(5, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6712) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(6, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6713) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(7, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6714) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(8, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6715) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(9, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6716) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					Static72.method1459(10, local89, local157 << 16 | local691, "");
					return;
				}
				if (arg0 == 6717) {
					anInt4655 -= 3;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					local89 = anIntArray436[anInt4655 + 2];
					@Pc(7726) Class310 local7726 = Static519.method7538(local157 << 16 | local691, local89);
					Static465.method7011();
					@Pc(7731) Class2_Sub39 local7731 = Static67.method1257(local7726);
					Static260.method4053(local7731.anInt7452, local7726, local7731.method6272());
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(7759) Class182 local7759;
				if (arg0 == 6800) {
					local157 = anIntArray436[--anInt4655];
					local7759 = Static387.aClass56_4.method1680(local157);
					if (local7759.aString118 == null) {
						aStringArray24[anInt4653++] = "";
						return;
					}
					aStringArray24[anInt4653++] = local7759.aString118;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray436[--anInt4655];
					local7759 = Static387.aClass56_4.method1680(local157);
					anIntArray436[anInt4655++] = local7759.anInt5350;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray436[--anInt4655];
					local7759 = Static387.aClass56_4.method1680(local157);
					anIntArray436[anInt4655++] = local7759.anInt5326;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray436[--anInt4655];
					local7759 = Static387.aClass56_4.method1680(local157);
					anIntArray436[anInt4655++] = local7759.anInt5322;
					return;
				}
				if (arg0 == 6804) {
					anInt4655 -= 2;
					local157 = anIntArray436[anInt4655];
					local691 = anIntArray436[anInt4655 + 1];
					@Pc(7881) Class73 local7881 = Static66.aClass247_1.method6470(local691);
					if (local7881.method2116()) {
						aStringArray24[anInt4653++] = Static387.aClass56_4.method1680(local157).method4597(local691, local7881.aString53);
						return;
					}
					anIntArray436[anInt4655++] = Static387.aClass56_4.method1680(local157).method4596(local691, local7881.anInt2133);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray436[anInt4655++] = Static89.aBoolean131 && !Static100.aBoolean147 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray436[anInt4655++] = Static24.anInt486;
					return;
				}
				if (arg0 == 6902) {
					anIntArray436[anInt4655++] = Static429.anInt7992;
					return;
				}
				if (arg0 == 6903) {
					anIntArray436[anInt4655++] = Static97.anInt1929;
					return;
				}
				if (arg0 == 6904) {
					anIntArray436[anInt4655++] = Static115.anInt2320;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static17.aClass20_4 != null) {
						if (Static17.aClass20_4.anObject2 == null) {
							local75 = Static374.method5905(Static17.aClass20_4.anInt594);
						} else {
							local75 = (String) Static17.aClass20_4.anObject2;
						}
					}
					aStringArray24[anInt4653++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray436[anInt4655++] = Static465.anInt8381;
					return;
				}
				if (arg0 == 6907) {
					anIntArray436[anInt4655++] = Static110.anInt2150;
					return;
				}
				if (arg0 == 6908) {
					anIntArray436[anInt4655++] = Static415.anInt7715;
					return;
				}
				if (arg0 == 6909) {
					anIntArray436[anInt4655++] = Static259.aBoolean198 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray436[anInt4655++] = Static349.anInt6441;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static281.aClass2_Sub19_Sub1_1.method2149();
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2225 = Static266.anInt4923;
					anIntArray436[anInt4655++] = local157;
					Static410.method6418();
					return;
				}
				if (arg0 == 7001) {
					Static281.aClass2_Sub19_Sub1_1.method2141();
					Static410.method6418();
					return;
				}
				if (arg0 == 7002) {
					Static281.aClass2_Sub19_Sub1_1.method2148();
					Static410.method6418();
					return;
				}
				if (arg0 == 7003) {
					Static281.aClass2_Sub19_Sub1_1.method2144();
					Static410.method6418();
					return;
				}
				if (arg0 == 7004) {
					Static281.aClass2_Sub19_Sub1_1.method2150();
					Static410.method6418();
					return;
				}
				if (arg0 == 7005) {
					Static281.aClass2_Sub19_Sub1_1.anInt2195 = 0;
					return;
				}
				if (arg0 == 7006) {
					if (Static281.aClass2_Sub19_Sub1_1.anInt2225 == 2) {
						Static281.aClass2_Sub19_Sub1_1.aBoolean202 = true;
						return;
					}
					if (Static281.aClass2_Sub19_Sub1_1.anInt2225 == 1) {
						Static281.aClass2_Sub19_Sub1_1.aBoolean200 = true;
						return;
					}
					if (Static281.aClass2_Sub19_Sub1_1.anInt2225 == 3) {
						Static281.aClass2_Sub19_Sub1_1.aBoolean201 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray436[anInt4655++] = Static281.aClass2_Sub19_Sub1_1.anInt2195;
					return;
				}
				if (arg0 == 7008) {
					if (Static266.anInt4923 == 0 && Static78.anInt1651 < 96) {
						anIntArray436[anInt4655++] = 2;
						return;
					}
					anIntArray436[anInt4655++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ln;I)V")
	private static void method4041(@OriginalArg(0) Class2_Sub13_Sub11 arg0, @OriginalArg(1) int arg1) {
		anInt4655 = 0;
		anInt4653 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray456;
		@Pc(11) int[] local11 = arg0.anIntArray455;
		@Pc(13) byte local13 = -1;
		anInt4657 = 0;
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
						method4042(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4040(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray436[anInt4655++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray436[anInt4655++] = Static84.aClass302_1.anIntArray692[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static84.aClass302_1.method7518(local54, anIntArray436[--anInt4655]);
					} else if (local31 == 3) {
						aStringArray24[anInt4653++] = arg0.aStringArray28[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt4655 -= 2;
						if (anIntArray436[anInt4655] != anIntArray436[anInt4655 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt4655 -= 2;
						if (anIntArray436[anInt4655] == anIntArray436[anInt4655 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt4655 -= 2;
						if (anIntArray436[anInt4655] < anIntArray436[anInt4655 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt4655 -= 2;
						if (anIntArray436[anInt4655] > anIntArray436[anInt4655 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt4657 == 0) {
							return;
						}
						@Pc(216) Class308 local216 = aClass308Array1[--anInt4657];
						arg0 = local216.aClass2_Sub13_Sub11_1;
						local8 = arg0.anIntArray456;
						local11 = arg0.anIntArray455;
						local5 = local216.anInt9118;
						anIntArray435 = local216.anIntArray702;
						aStringArray25 = local216.aStringArray44;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray436[anInt4655++] = Static84.aClass302_1.method7514(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static84.aClass302_1.method7516(local54, anIntArray436[--anInt4655]);
					} else if (local31 == 31) {
						anInt4655 -= 2;
						if (anIntArray436[anInt4655] <= anIntArray436[anInt4655 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt4655 -= 2;
						if (anIntArray436[anInt4655] >= anIntArray436[anInt4655 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray436[anInt4655++] = anIntArray435[local11[local5]];
					} else if (local31 == 34) {
						anIntArray435[local11[local5]] = anIntArray436[--anInt4655];
					} else if (local31 == 35) {
						aStringArray24[anInt4653++] = aStringArray25[local11[local5]];
					} else if (local31 == 36) {
						aStringArray25[local11[local5]] = aStringArray24[--anInt4653];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt4653 -= local54;
						@Pc(400) String local400 = Static161.method2735(anInt4653, aStringArray24, local54);
						aStringArray24[anInt4653++] = local400;
					} else if (local31 == 38) {
						anInt4655--;
					} else if (local31 == 39) {
						anInt4653--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub13_Sub11 local436 = Static428.method6594(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5175];
							@Pc(450) String[] local450 = new String[local436.anInt5172];
							for (local452 = 0; local452 < local436.anInt5174; local452++) {
								local446[local452] = anIntArray436[anInt4655 + local452 - local436.anInt5174];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5176; local471++) {
								local450[local471] = aStringArray24[anInt4653 + local471 - local436.anInt5176];
							}
							anInt4655 -= local436.anInt5174;
							anInt4653 -= local436.anInt5176;
							@Pc(502) Class308 local502 = new Class308();
							local502.aClass2_Sub13_Sub11_1 = arg0;
							local502.anInt9118 = local5;
							local502.anIntArray702 = anIntArray435;
							local502.aStringArray44 = aStringArray25;
							if (anInt4657 >= aClass308Array1.length) {
								throw new RuntimeException();
							}
							aClass308Array1[anInt4657++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray456;
							local11 = local436.anIntArray455;
							local5 = -1;
							anIntArray435 = local446;
							aStringArray25 = local450;
						} else if (local31 == 42) {
							anIntArray436[anInt4655++] = Static399.anIntArray113[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static399.anIntArray113[local54] = anIntArray436[--anInt4655];
							Static52.method956(local54);
							Static242.aBoolean326 |= Static432.aBooleanArray35[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray436[--anInt4655];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray434[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray52[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray436[--anInt4655];
							if (local603 < 0 || local603 >= anIntArray434[local54]) {
								throw new RuntimeException();
							}
							anIntArray436[anInt4655++] = anIntArrayArray52[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt4655 -= 2;
							local603 = anIntArray436[anInt4655];
							if (local603 < 0 || local603 >= anIntArray434[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray52[local54][local603] = anIntArray436[anInt4655 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static14.aStringArray2[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray24[anInt4653++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static14.aStringArray2[local54] = aStringArray24[--anInt4653];
							Static463.method7002(local54);
						} else if (local31 == 51) {
							@Pc(774) Class127 local774 = arg0.aClass127Array1[local11[local5]];
							@Pc(787) Class2_Sub32 local787 = (Class2_Sub32) local774.method3205((long) anIntArray436[--anInt4655]);
							if (local787 != null) {
								local5 += local787.anInt5391;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString112 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong241).append(" ");
				for (local603 = anInt4657 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass308Array1[local603].aClass2_Sub13_Sub11_1.aLong241).append(" ");
				}
				local855.append("op: ").append(local13);
				Static459.method6984(local855.toString(), local837);
			} else {
				Static215.method6797("Clientscript error in: " + arg0.aString112);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString112).append("\n");
				for (local603 = anInt4657 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass308Array1[local603].aClass2_Sub13_Sub11_1.aString112).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static459.method6984(local855.toString(), local837);
				Static120.method2321(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(IZ)V")
	private static void method4042(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class310 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(158) Class310 local158;
		@Pc(35) Class310 local35;
		@Pc(210) Class310 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt4655 -= 3;
				local13 = anIntArray436[anInt4655];
				local19 = anIntArray436[anInt4655 + 1];
				local25 = anIntArray436[anInt4655 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static111.method2143(local13);
				if (local35.aClass310Array2 == null) {
					local35.aClass310Array2 = new Class310[local25 + 1];
				}
				if (local35.aClass310Array2.length <= local25) {
					@Pc(54) Class310[] local54 = new Class310[local25 + 1];
					for (local56 = 0; local56 < local35.aClass310Array2.length; local56++) {
						local54[local56] = local35.aClass310Array2[local56];
					}
					local35.aClass310Array2 = local54;
				}
				if (local25 > 0 && local35.aClass310Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class310 local99 = new Class310();
				local99.anInt9220 = local19;
				local99.anInt9167 = local99.anInt9226 = local35.anInt9226;
				local99.anInt9170 = local25;
				local35.aClass310Array2[local25] = local99;
				if (arg1) {
					aClass310_11 = local99;
				} else {
					aClass310_12 = local99;
				}
				Static273.method4342(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass310_11 : aClass310_12;
				if (local137.anInt9170 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static111.method2143(local137.anInt9226);
				local158.aClass310Array2[local137.anInt9170] = null;
				Static273.method4342(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static111.method2143(anIntArray436[--anInt4655]);
				local137.aClass310Array2 = null;
				Static273.method4342(local137);
				return;
			}
			if (arg0 == 200) {
				anInt4655 -= 2;
				local13 = anIntArray436[anInt4655];
				local19 = anIntArray436[anInt4655 + 1];
				local210 = Static519.method7538(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray436[anInt4655++] = 1;
					if (arg1) {
						aClass310_11 = local210;
						return;
					}
					aClass310_12 = local210;
					return;
				}
				anIntArray436[anInt4655++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray436[--anInt4655];
				local158 = Static111.method2143(local13);
				if (local158 != null) {
					anIntArray436[anInt4655++] = 1;
					if (arg1) {
						aClass310_11 = local158;
						return;
					}
					aClass310_12 = local158;
					return;
				}
				anIntArray436[anInt4655++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray436[--anInt4655];
				method4034(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray436[--anInt4655];
				method4036(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt4655 -= 2;
					local13 = anIntArray436[anInt4655];
					local19 = anIntArray436[anInt4655 + 1];
					for (local25 = 0; local25 < Static184.anIntArray369.length; local25++) {
						if (Static184.anIntArray369[local25] == local13) {
							Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1.method3571(Static289.aClass125_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static63.anIntArray110.length; local353++) {
						if (Static63.anIntArray110[local353] == local13) {
							Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1.method3571(Static289.aClass125_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt4655 -= 2;
					local13 = anIntArray436[anInt4655];
					local19 = anIntArray436[anInt4655 + 1];
					Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1.method3576(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray436[--anInt4655] != 0;
					Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1.method3574(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static111.method2143(anIntArray436[--anInt4655]);
				} else {
					local137 = arg1 ? aClass310_11 : aClass310_12;
				}
				if (arg0 == 1000) {
					anInt4655 -= 4;
					local137.anInt9155 = anIntArray436[anInt4655];
					local137.anInt9229 = anIntArray436[anInt4655 + 1];
					local19 = anIntArray436[anInt4655 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray436[anInt4655 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte106 = (byte) local19;
					local137.aByte107 = (byte) local25;
					Static273.method4342(local137);
					Static476.method7103(local137);
					if (local137.anInt9170 == -1) {
						Static68.method1442(local137.anInt9226);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt4655 -= 4;
					local137.anInt9165 = anIntArray436[anInt4655];
					local137.anInt9159 = anIntArray436[anInt4655 + 1];
					local137.anInt9195 = 0;
					local137.anInt9216 = 0;
					local19 = anIntArray436[anInt4655 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray436[anInt4655 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte109 = (byte) local19;
					local137.aByte108 = (byte) local25;
					Static273.method4342(local137);
					Static476.method7103(local137);
					if (local137.anInt9220 == 0) {
						Static113.method2228(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray436[--anInt4655] == 1;
					if (local137.aBoolean655 != local620) {
						local137.aBoolean655 = local620;
						Static273.method4342(local137);
					}
					if (local137.anInt9170 == -1) {
						Static452.method6903(local137.anInt9226);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt4655 -= 2;
					local137.anInt9233 = anIntArray436[anInt4655];
					local137.anInt9181 = anIntArray436[anInt4655 + 1];
					Static273.method4342(local137);
					Static476.method7103(local137);
					if (local137.anInt9220 == 0) {
						Static113.method2228(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean654 = anIntArray436[--anInt4655] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static111.method2143(anIntArray436[--anInt4655]);
					} else {
						local137 = arg1 ? aClass310_11 : aClass310_12;
					}
					if (arg0 == 1100) {
						anInt4655 -= 2;
						local137.anInt9230 = anIntArray436[anInt4655];
						if (local137.anInt9230 > local137.anInt9191 - local137.anInt9163) {
							local137.anInt9230 = local137.anInt9191 - local137.anInt9163;
						}
						if (local137.anInt9230 < 0) {
							local137.anInt9230 = 0;
						}
						local137.anInt9227 = anIntArray436[anInt4655 + 1];
						if (local137.anInt9227 > local137.anInt9178 - local137.anInt9198) {
							local137.anInt9227 = local137.anInt9178 - local137.anInt9198;
						}
						if (local137.anInt9227 < 0) {
							local137.anInt9227 = 0;
						}
						Static273.method4342(local137);
						if (local137.anInt9170 == -1) {
							Static298.method4700(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9172 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						if (local137.anInt9170 == -1) {
							Static43.method828(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean665 = anIntArray436[--anInt4655] == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9219 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9179 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray436[--anInt4655];
						if (local137.anInt9182 != local19) {
							local137.anInt9182 = local19;
							Static273.method4342(local137);
						}
						if (local137.anInt9170 == -1) {
							Static238.method3690(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9187 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean657 = anIntArray436[--anInt4655] == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9158 = 1;
						local137.anInt9218 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						if (local137.anInt9170 == -1) {
							Static371.method5898(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt4655 -= 6;
						local137.anInt9173 = anIntArray436[anInt4655];
						local137.anInt9160 = anIntArray436[anInt4655 + 1];
						local137.anInt9154 = anIntArray436[anInt4655 + 2];
						local137.anInt9183 = anIntArray436[anInt4655 + 3];
						local137.anInt9190 = anIntArray436[anInt4655 + 4];
						local137.anInt9215 = anIntArray436[anInt4655 + 5];
						Static273.method4342(local137);
						if (local137.anInt9170 == -1) {
							Static284.method7810(local137.anInt9226);
							Static164.method2785(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray436[--anInt4655];
						if (local137.anInt9203 != local19) {
							local137.anInt9203 = local19;
							local137.anInt9196 = 0;
							local137.anInt9146 = 1;
							local137.anInt9162 = 0;
							Static273.method4342(local137);
						}
						if (local137.anInt9170 == -1) {
							Static209.method3331(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean652 = anIntArray436[--anInt4655] == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray24[--anInt4653];
						if (!local1101.equals(local137.aString204)) {
							local137.aString204 = local1101;
							Static273.method4342(local137);
						}
						if (local137.anInt9170 == -1) {
							Static457.method6976(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9148 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						if (local137.anInt9170 == -1) {
							Static318.method5085(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt4655 -= 3;
						local137.anInt9197 = anIntArray436[anInt4655];
						local137.anInt9168 = anIntArray436[anInt4655 + 1];
						local137.anInt9151 = anIntArray436[anInt4655 + 2];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean651 = anIntArray436[--anInt4655] == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9185 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9169 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean653 = anIntArray436[--anInt4655] == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean662 = anIntArray436[--anInt4655] == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt4655 -= 2;
						local137.anInt9191 = anIntArray436[anInt4655];
						local137.anInt9178 = anIntArray436[anInt4655 + 1];
						Static273.method4342(local137);
						if (local137.anInt9220 == 0) {
							Static113.method2228(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt4655 -= 2;
						local137.anInt9189 = (short) anIntArray436[anInt4655];
						local137.anInt9188 = (short) anIntArray436[anInt4655 + 1];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean661 = anIntArray436[--anInt4655] == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9215 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						if (local137.anInt9170 == -1) {
							Static284.method7810(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray436[--anInt4655];
						local137.aBoolean650 = local19 == 1;
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt4655 -= 2;
						local137.anInt9212 = anIntArray436[anInt4655];
						local137.anInt9225 = anIntArray436[anInt4655 + 1];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9174 = anIntArray436[--anInt4655];
						Static273.method4342(local137);
						return;
					}
					@Pc(1454) Class73 local1454;
					if (arg0 == 1127) {
						anInt4655 -= 2;
						local19 = anIntArray436[anInt4655];
						local25 = anIntArray436[anInt4655 + 1];
						local1454 = Static66.aClass247_1.method6470(local19);
						if (local25 != local1454.anInt2133) {
							local137.method7638(local19, local25);
							return;
						}
						local137.method7636(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray436[--anInt4655];
						local1488 = aStringArray24[--anInt4653];
						local1454 = Static66.aClass247_1.method6470(local19);
						if (!local1454.aString53.equals(local1488)) {
							local137.method7637(local19, local1488);
							return;
						}
						local137.method7636(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static111.method2143(anIntArray436[--anInt4655]);
						} else {
							local137 = arg1 ? aClass310_11 : aClass310_12;
						}
						if (arg0 == 1300) {
							local19 = anIntArray436[--anInt4655] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7644(aStringArray24[--anInt4653], local19);
								return;
							}
							anInt4653--;
							return;
						}
						if (arg0 == 1301) {
							anInt4655 -= 2;
							local19 = anIntArray436[anInt4655];
							local25 = anIntArray436[anInt4655 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass310_17 = null;
								return;
							}
							local137.aClass310_17 = Static519.method7538(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray436[--anInt4655];
							if (local19 != Static464.anInt8376 && local19 != Static466.anInt8395 && local19 != Static289.anInt5335) {
								return;
							}
							local137.anInt9199 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9237 = anIntArray436[--anInt4655];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9231 = anIntArray436[--anInt4655];
							return;
						}
						if (arg0 == 1305) {
							local137.aString203 = aStringArray24[--anInt4653];
							return;
						}
						if (arg0 == 1306) {
							local137.aString208 = aStringArray24[--anInt4653];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray45 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9202 = anIntArray436[--anInt4655];
							local137.anInt9157 = anIntArray436[--anInt4655];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray436[--anInt4655];
							local25 = anIntArray436[--anInt4655];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7647(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString207 = aStringArray24[--anInt4653];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9180 = anIntArray436[--anInt4655];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt4655 -= 3;
								local19 = anIntArray436[anInt4655] - 1;
								local25 = anIntArray436[anInt4655 + 1];
								local353 = anIntArray436[anInt4655 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt4655 -= 2;
								local19 = 10;
								local25 = anIntArray436[anInt4655];
								local353 = anIntArray436[anInt4655 + 1];
							}
							if (local137.aByteArray120 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray120 = new byte[11];
								local137.aByteArray121 = new byte[11];
								local137.anIntArray712 = new int[11];
							}
							local137.aByteArray120[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean658 = false;
								for (local2290 = 0; local2290 < local137.aByteArray120.length; local2290++) {
									if (local137.aByteArray120[local2290] != 0) {
										local137.aBoolean658 = true;
										break;
									}
								}
							} else {
								local137.aBoolean658 = true;
							}
							local137.aByteArray121[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9205 = anIntArray436[--anInt4655];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static111.method2143(anIntArray436[--anInt4655]);
						} else {
							local137 = arg1 ? aClass310_11 : aClass310_12;
						}
						local1101 = aStringArray24[--anInt4653];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray436[--anInt4655];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray436[--anInt4655];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray24[--anInt4653];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray436[--anInt4655]);
							}
						}
						local56 = anIntArray436[--anInt4655];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray30 = local2421;
							local137.anIntArray708 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1411) {
							local137.lb = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray11 = local2421;
							local137.anIntArray707 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray25 = local2421;
							local137.anIntArray711 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray34 = local2421;
							local137.anIntArray709 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray23 = local2421;
							local137.anIntArray706 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray32 = local2421;
						}
						local137.aBoolean664 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass310_11 : aClass310_12;
						if (arg0 == 1500) {
							anIntArray436[anInt4655++] = local137.anInt9184;
							return;
						}
						if (arg0 == 1501) {
							anIntArray436[anInt4655++] = local137.anInt9175;
							return;
						}
						if (arg0 == 1502) {
							anIntArray436[anInt4655++] = local137.anInt9163;
							return;
						}
						if (arg0 == 1503) {
							anIntArray436[anInt4655++] = local137.anInt9198;
							return;
						}
						if (arg0 == 1504) {
							anIntArray436[anInt4655++] = local137.aBoolean655 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray436[anInt4655++] = local137.anInt9167;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static448.method6843(local137);
							anIntArray436[anInt4655++] = local158 == null ? -1 : local158.anInt9226;
							return;
						}
					} else {
						@Pc(3017) Class73 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass310_11 : aClass310_12;
							if (arg0 == 1600) {
								anIntArray436[anInt4655++] = local137.anInt9230;
								return;
							}
							if (arg0 == 1601) {
								anIntArray436[anInt4655++] = local137.anInt9227;
								return;
							}
							if (arg0 == 1602) {
								aStringArray24[anInt4653++] = local137.aString204;
								return;
							}
							if (arg0 == 1603) {
								anIntArray436[anInt4655++] = local137.anInt9191;
								return;
							}
							if (arg0 == 1604) {
								anIntArray436[anInt4655++] = local137.anInt9178;
								return;
							}
							if (arg0 == 1605) {
								anIntArray436[anInt4655++] = local137.anInt9215;
								return;
							}
							if (arg0 == 1606) {
								anIntArray436[anInt4655++] = local137.anInt9154;
								return;
							}
							if (arg0 == 1607) {
								anIntArray436[anInt4655++] = local137.anInt9190;
								return;
							}
							if (arg0 == 1608) {
								anIntArray436[anInt4655++] = local137.anInt9183;
								return;
							}
							if (arg0 == 1609) {
								anIntArray436[anInt4655++] = local137.anInt9219;
								return;
							}
							if (arg0 == 1610) {
								anIntArray436[anInt4655++] = local137.anInt9173;
								return;
							}
							if (arg0 == 1611) {
								anIntArray436[anInt4655++] = local137.anInt9160;
								return;
							}
							if (arg0 == 1612) {
								anIntArray436[anInt4655++] = local137.anInt9182;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray436[--anInt4655];
								local3017 = Static66.aClass247_1.method6470(local19);
								if (local3017.method2116()) {
									aStringArray24[anInt4653++] = local137.method7641(local3017.aString53, local19);
									return;
								}
								anIntArray436[anInt4655++] = local137.method7642(local3017.anInt2133, local19);
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass310_11 : aClass310_12;
							if (arg0 == 1700) {
								anIntArray436[anInt4655++] = local137.anInt9224;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt9224 != -1) {
									anIntArray436[anInt4655++] = local137.anInt9153;
									return;
								}
								anIntArray436[anInt4655++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray436[anInt4655++] = local137.anInt9170;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass310_11 : aClass310_12;
							if (arg0 == 1800) {
								anIntArray436[anInt4655++] = Static67.method1257(local137).method6272();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray436[--anInt4655];
								local19--;
								if (local137.aStringArray45 != null && local19 < local137.aStringArray45.length && local137.aStringArray45[local19] != null) {
									aStringArray24[anInt4653++] = local137.aStringArray45[local19];
									return;
								}
								aStringArray24[anInt4653++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString203 == null) {
									aStringArray24[anInt4653++] = "";
									return;
								}
								aStringArray24[anInt4653++] = local137.aString203;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static111.method2143(anIntArray436[--anInt4655]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass310_11 : aClass310_12;
							}
							if (anInt4658 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray6 == null) {
									return;
								}
								@Pc(3254) Class2_Sub28 local3254 = new Class2_Sub28();
								local3254.aClass310_8 = local137;
								local3254.anObjectArray2 = local137.anObjectArray6;
								local3254.anInt3745 = anInt4658 + 1;
								Static17.aClass249_4.method6523(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static111.method2143(anIntArray436[--anInt4655]);
							if (arg0 == 2500) {
								anIntArray436[anInt4655++] = local137.anInt9184;
								return;
							}
							if (arg0 == 2501) {
								anIntArray436[anInt4655++] = local137.anInt9175;
								return;
							}
							if (arg0 == 2502) {
								anIntArray436[anInt4655++] = local137.anInt9163;
								return;
							}
							if (arg0 == 2503) {
								anIntArray436[anInt4655++] = local137.anInt9198;
								return;
							}
							if (arg0 == 2504) {
								anIntArray436[anInt4655++] = local137.aBoolean655 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray436[anInt4655++] = local137.anInt9167;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static448.method6843(local137);
								anIntArray436[anInt4655++] = local158 == null ? -1 : local158.anInt9226;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static111.method2143(anIntArray436[--anInt4655]);
							if (arg0 == 2600) {
								anIntArray436[anInt4655++] = local137.anInt9230;
								return;
							}
							if (arg0 == 2601) {
								anIntArray436[anInt4655++] = local137.anInt9227;
								return;
							}
							if (arg0 == 2602) {
								aStringArray24[anInt4653++] = local137.aString204;
								return;
							}
							if (arg0 == 2603) {
								anIntArray436[anInt4655++] = local137.anInt9191;
								return;
							}
							if (arg0 == 2604) {
								anIntArray436[anInt4655++] = local137.anInt9178;
								return;
							}
							if (arg0 == 2605) {
								anIntArray436[anInt4655++] = local137.anInt9215;
								return;
							}
							if (arg0 == 2606) {
								anIntArray436[anInt4655++] = local137.anInt9154;
								return;
							}
							if (arg0 == 2607) {
								anIntArray436[anInt4655++] = local137.anInt9190;
								return;
							}
							if (arg0 == 2608) {
								anIntArray436[anInt4655++] = local137.anInt9183;
								return;
							}
							if (arg0 == 2609) {
								anIntArray436[anInt4655++] = local137.anInt9219;
								return;
							}
							if (arg0 == 2610) {
								anIntArray436[anInt4655++] = local137.anInt9173;
								return;
							}
							if (arg0 == 2611) {
								anIntArray436[anInt4655++] = local137.anInt9160;
								return;
							}
							if (arg0 == 2612) {
								anIntArray436[anInt4655++] = local137.anInt9182;
								return;
							}
						} else {
							@Pc(3751) Class2_Sub9 local3751;
							@Pc(3649) Class2_Sub9 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static111.method2143(anIntArray436[--anInt4655]);
									anIntArray436[anInt4655++] = local137.anInt9224;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static111.method2143(anIntArray436[--anInt4655]);
									if (local137.anInt9224 != -1) {
										anIntArray436[anInt4655++] = local137.anInt9153;
										return;
									}
									anIntArray436[anInt4655++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray436[--anInt4655];
									local3649 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local13);
									if (local3649 != null) {
										anIntArray436[anInt4655++] = 1;
										return;
									}
									anIntArray436[anInt4655++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static111.method2143(anIntArray436[--anInt4655]);
									if (local137.aClass310Array2 == null) {
										anIntArray436[anInt4655++] = 0;
										return;
									}
									local19 = local137.aClass310Array2.length;
									for (local25 = 0; local25 < local137.aClass310Array2.length; local25++) {
										if (local137.aClass310Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray436[anInt4655++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt4655 -= 2;
									local13 = anIntArray436[anInt4655];
									local19 = anIntArray436[anInt4655 + 1];
									local3751 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local13);
									if (local3751 != null && local3751.anInt833 == local19) {
										anIntArray436[anInt4655++] = 1;
										return;
									} else {
										anIntArray436[anInt4655++] = 0;
										return;
									}
								}
							} else if (arg0 < 2900) {
								local137 = Static111.method2143(anIntArray436[--anInt4655]);
								if (arg0 == 2800) {
									anIntArray436[anInt4655++] = Static67.method1257(local137).method6272();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray436[--anInt4655];
									local19--;
									if (local137.aStringArray45 != null && local19 < local137.aStringArray45.length && local137.aStringArray45[local19] != null) {
										aStringArray24[anInt4653++] = local137.aStringArray45[local19];
										return;
									}
									aStringArray24[anInt4653++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString203 == null) {
										aStringArray24[anInt4653++] = "";
										return;
									}
									aStringArray24[anInt4653++] = local137.aString203;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray24[--anInt4653];
										Static215.method6797(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt4655 -= 2;
										Static481.method7156(anIntArray436[anInt4655 + 1], anIntArray436[anInt4655], Static266.aClass1_Sub1_Sub2_Sub1_1);
										return;
									}
									if (arg0 == 3103) {
										Static279.method4414();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray24[--anInt4653];
										local19 = 0;
										if (Static9.method378(local3888)) {
											local19 = Static359.method5799(local3888);
										}
										Static93.method1721(Static464.aClass243_83);
										Static381.aClass2_Sub29_Sub2_2.method5185(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray24[--anInt4653];
										Static93.method1721(Static8.aClass243_4);
										Static381.aClass2_Sub29_Sub2_2.method5172(local3888.length() + 1);
										Static381.aClass2_Sub29_Sub2_2.method5189(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray24[--anInt4653];
										Static93.method1721(Static220.aClass243_47);
										Static381.aClass2_Sub29_Sub2_2.method5172(local3888.length() + 1);
										Static381.aClass2_Sub29_Sub2_2.method5189(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray436[--anInt4655];
										local1101 = aStringArray24[--anInt4653];
										Static429.method6702(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt4655 -= 3;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local25 = anIntArray436[anInt4655 + 2];
										local35 = Static111.method2143(local25);
										Static498.method7333(local13, local35, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local210 = arg1 ? aClass310_11 : aClass310_12;
										Static498.method7333(local13, local210, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray436[--anInt4655];
										Static93.method1721(Static403.aClass243_76);
										Static381.aClass2_Sub29_Sub2_2.method5217(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local3751 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local13);
										if (local3751 != null) {
											Static368.method5870(local3751.anInt833 != local19, local3751, true);
										}
										Static195.method3168(local19, local13, true, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt4655--;
										local13 = anIntArray436[anInt4655];
										local3649 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local13);
										if (local3649 != null && local3649.anInt832 == 3) {
											Static368.method5870(true, local3649, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static490.method6646(aStringArray24[--anInt4653]);
										return;
									}
									if (arg0 == 3114) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local1488 = aStringArray24[--anInt4653];
										Static62.method1145(local1488, "", local19, "", local13);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt4655 -= 3;
										Static484.method7208(anIntArray436[anInt4655 + 1], 255, anIntArray436[anInt4655 + 2], anIntArray436[anInt4655]);
										return;
									}
									if (arg0 == 3201) {
										Static492.method7263(50, anIntArray436[--anInt4655], 255);
										return;
									}
									if (arg0 == 3202) {
										anInt4655 -= 2;
										Static202.method3261(255, anIntArray436[anInt4655 + 1], anIntArray436[anInt4655]);
										return;
									}
									if (arg0 == 3203) {
										anInt4655 -= 4;
										Static484.method7208(anIntArray436[anInt4655 + 1], anIntArray436[anInt4655 + 3], anIntArray436[anInt4655 + 2], anIntArray436[anInt4655]);
										return;
									}
									if (arg0 == 3204) {
										anInt4655 -= 3;
										Static492.method7263(anIntArray436[anInt4655 + 2], anIntArray436[anInt4655], anIntArray436[anInt4655 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt4655 -= 3;
										Static202.method3261(anIntArray436[anInt4655 + 2], anIntArray436[anInt4655 + 1], anIntArray436[anInt4655]);
										return;
									}
									if (arg0 == 3206) {
										anInt4655 -= 4;
										Static451.method6882(anIntArray436[anInt4655 + 2], anIntArray436[anInt4655 + 3], anIntArray436[anInt4655 + 1], anIntArray436[anInt4655]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray436[anInt4655++] = Static115.anInt2326;
										return;
									}
									if (arg0 == 3301) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static381.method5979(local19, false, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static142.method2488(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static260.method4051(local19, false, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static209.aClass270_1.method6979(local13).anInt7589;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static121.anIntArray313[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static454.anIntArray634[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static450.anIntArray626[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90;
										local19 = (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7) + Static238.anInt4280;
										local25 = (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7) + Static371.anInt6936;
										anIntArray436[anInt4655++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray436[anInt4655++] = Static165.aBoolean245 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static381.method5979(local19, true, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static142.method2488(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static260.method4051(local19, true, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static475.anInt8486 >= 2) {
											anIntArray436[anInt4655++] = Static475.anInt8486;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray436[anInt4655++] = Static78.anInt1655;
										return;
									}
									if (arg0 == 3318) {
										anIntArray436[anInt4655++] = Static471.aClass163_5.anInt4593;
										return;
									}
									if (arg0 == 3321) {
										anIntArray436[anInt4655++] = Static262.anInt7270;
										return;
									}
									if (arg0 == 3322) {
										anIntArray436[anInt4655++] = Static270.anInt8543;
										return;
									}
									if (arg0 == 3323) {
										if (Static531.anInt9252 >= 5 && Static531.anInt9252 <= 9) {
											anIntArray436[anInt4655++] = 1;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static531.anInt9252 >= 5 && Static531.anInt9252 <= 9) {
											anIntArray436[anInt4655++] = Static531.anInt9252;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray436[anInt4655++] = Static415.aBoolean571 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray436[anInt4655++] = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252;
										return;
									}
									if (arg0 == 3327) {
										anIntArray436[anInt4655++] = Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1.aBoolean316 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray436[anInt4655++] = Static391.aBoolean559 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static16.method466(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static319.method5096(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = Static319.method5096(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray436[anInt4655++] = Static456.anInt8316;
										return;
									}
									if (arg0 == 3335) {
										anIntArray436[anInt4655++] = Static172.anInt6352;
										return;
									}
									if (arg0 == 3336) {
										anInt4655 -= 4;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local25 = anIntArray436[anInt4655 + 2];
										local353 = anIntArray436[anInt4655 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray436[anInt4655++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray436[anInt4655++] = Static224.anInt4041;
										return;
									}
									if (arg0 == 3338) {
										anIntArray436[anInt4655++] = Static222.method1471();
										return;
									}
									if (arg0 == 3339) {
										anIntArray436[anInt4655++] = Static278.aBoolean388 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray436[anInt4655++] = Static186.aBoolean264 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray436[anInt4655++] = Static362.aBoolean519 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray436[anInt4655++] = Static61.aClass214_1.method7241();
										return;
									}
									if (arg0 == 3343) {
										anIntArray436[anInt4655++] = Static61.aClass214_1.method7240();
										return;
									}
									if (arg0 == 3344) {
										aStringArray24[anInt4653++] = Static476.method7102();
										return;
									}
									if (arg0 == 3345) {
										aStringArray24[anInt4653++] = Static493.method7269();
										return;
									}
									if (arg0 == 3346) {
										anIntArray436[anInt4655++] = Static352.method5537();
										return;
									}
									if (arg0 == 3347) {
										anIntArray436[anInt4655++] = Static545.anInt9377;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5340) Class251 local5340;
									if (arg0 == 3400) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local5340 = Static171.aClass17_1.method621(local13);
										aStringArray24[anInt4653++] = local5340.method6537(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt4655 -= 4;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local25 = anIntArray436[anInt4655 + 2];
										local353 = anIntArray436[anInt4655 + 3];
										@Pc(5386) Class251 local5386 = Static171.aClass17_1.method621(local25);
										if (local5386.aChar4 == local13 && local5386.aChar5 == local19) {
											if (local19 == 115) {
												aStringArray24[anInt4653++] = local5386.method6537(local353);
												return;
											}
											anIntArray436[anInt4655++] = local5386.method6538(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt4655 -= 3;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local25 = anIntArray436[anInt4655 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5462) Class251 local5462 = Static171.aClass17_1.method621(local19);
										if (local5462.aChar5 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray436[anInt4655++] = local5462.method6544(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray436[--anInt4655];
										local1101 = aStringArray24[--anInt4653];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5340 = Static171.aClass17_1.method621(local13);
										if (local5340.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray436[anInt4655++] = local5340.method6539(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray436[--anInt4655];
										@Pc(5560) Class251 local5560 = Static171.aClass17_1.method621(local13);
										anIntArray436[anInt4655++] = local5560.aClass127_39.method3209();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static265.anInt6991 == 0) {
											anIntArray436[anInt4655++] = -2;
											return;
										}
										if (Static265.anInt6991 == 1) {
											anIntArray436[anInt4655++] = -1;
											return;
										}
										anIntArray436[anInt4655++] = Static12.anInt264;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray436[--anInt4655];
										if (Static265.anInt6991 == 2 && local13 < Static12.anInt264) {
											aStringArray24[anInt4653++] = Static145.aStringArray15[local13];
											if (Static8.aStringArray1[local13] != null) {
												aStringArray24[anInt4653++] = Static8.aStringArray1[local13];
												return;
											}
											aStringArray24[anInt4653++] = "";
											return;
										}
										aStringArray24[anInt4653++] = "";
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray436[--anInt4655];
										if (Static265.anInt6991 == 2 && local13 < Static12.anInt264) {
											anIntArray436[anInt4655++] = Static399.anIntArray114[local13];
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray436[--anInt4655];
										if (Static265.anInt6991 == 2 && local13 < Static12.anInt264) {
											anIntArray436[anInt4655++] = Static393.anIntArray575[local13];
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray24[--anInt4653];
										local19 = anIntArray436[--anInt4655];
										Static490.method6648(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray24[--anInt4653];
										Static207.method3299(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray24[--anInt4653];
										Static71.method1453(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray24[--anInt4653];
										Static155.method2654(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray24[--anInt4653];
										Static228.method3589(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray24[--anInt4653];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray436[anInt4655++] = Static278.method4402(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray436[--anInt4655];
										if (Static265.anInt6991 == 2 && local13 < Static12.anInt264) {
											aStringArray24[anInt4653++] = Static421.aStringArray35[local13];
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static269.aString107 != null) {
											aStringArray24[anInt4653++] = Static477.method7127(Static269.aString107);
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static269.aString107 != null) {
											anIntArray436[anInt4655++] = Static162.anInt2943;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray436[--anInt4655];
										if (Static269.aString107 != null && local13 < Static162.anInt2943) {
											aStringArray24[anInt4653++] = Static308.aClass105Array1[local13].aString75;
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray436[--anInt4655];
										if (Static269.aString107 != null && local13 < Static162.anInt2943) {
											anIntArray436[anInt4655++] = Static308.aClass105Array1[local13].anInt3005;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray436[--anInt4655];
										if (Static269.aString107 != null && local13 < Static162.anInt2943) {
											anIntArray436[anInt4655++] = Static308.aClass105Array1[local13].aByte41;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray436[anInt4655++] = Static124.aByte38;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray24[--anInt4653];
										Static417.method6514(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray436[anInt4655++] = Static106.aByte34;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray24[--anInt4653];
										Static443.method6746(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static231.method3628();
										return;
									}
									if (arg0 == 3621) {
										if (Static265.anInt6991 == 0) {
											anIntArray436[anInt4655++] = -1;
											return;
										}
										anIntArray436[anInt4655++] = Static60.anInt1162;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray436[--anInt4655];
										if (Static265.anInt6991 != 0 && local13 < Static60.anInt1162) {
											aStringArray24[anInt4653++] = Static73.aStringArray6[local13];
											if (Static185.aStringArray19[local13] != null) {
												aStringArray24[anInt4653++] = Static185.aStringArray19[local13];
												return;
											}
											aStringArray24[anInt4653++] = "";
											return;
										}
										aStringArray24[anInt4653++] = "";
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray24[--anInt4653];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray436[anInt4655++] = Static196.method3174(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray436[--anInt4655];
										if (Static308.aClass105Array1 != null && local13 < Static162.anInt2943 && Static308.aClass105Array1[local13].aString74.equalsIgnoreCase(Static266.aClass1_Sub1_Sub2_Sub1_1.aString83)) {
											anIntArray436[anInt4655++] = 1;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static131.aString65 != null) {
											aStringArray24[anInt4653++] = Static131.aString65;
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray436[--anInt4655];
										if (Static269.aString107 != null && local13 < Static162.anInt2943) {
											aStringArray24[anInt4653++] = Static308.aClass105Array1[local13].aString76;
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray436[--anInt4655];
										if (Static265.anInt6991 == 2 && local13 >= 0 && local13 < Static12.anInt264) {
											anIntArray436[anInt4655++] = Static242.aBooleanArray23[local13] ? 1 : 0;
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray24[--anInt4653];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray436[anInt4655++] = Static441.method6722(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray436[anInt4655++] = Static517.anInt9000;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray24[--anInt4653];
										Static155.method2654(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static115.aBooleanArray20[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray436[--anInt4655];
										if (Static269.aString107 != null && local13 < Static162.anInt2943) {
											aStringArray24[anInt4653++] = Static308.aClass105Array1[local13].aString74;
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray436[--anInt4655];
										if (Static265.anInt6991 != 0 && local13 < Static60.anInt1162) {
											aStringArray24[anInt4653++] = Static290.aStringArray30[local13];
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static472.aClass264Array4[local13].method6748();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static472.aClass264Array4[local13].anInt8061;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static472.aClass264Array4[local13].anInt8059;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static472.aClass264Array4[local13].anInt8062;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static472.aClass264Array4[local13].anInt8063;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static472.aClass264Array4[local13].anInt8058;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray436[--anInt4655];
										local19 = Static472.aClass264Array4[local13].method6747();
										anIntArray436[anInt4655++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray436[--anInt4655];
										local19 = Static472.aClass264Array4[local13].method6747();
										anIntArray436[anInt4655++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray436[--anInt4655];
										local19 = Static472.aClass264Array4[local13].method6747();
										anIntArray436[anInt4655++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray436[--anInt4655];
										local19 = Static472.aClass264Array4[local13].method6747();
										anIntArray436[anInt4655++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt4655 -= 5;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local25 = anIntArray436[anInt4655 + 2];
										local353 = anIntArray436[anInt4655 + 3];
										local2290 = anIntArray436[anInt4655 + 4];
										anIntArray436[anInt4655++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7070) long local7070;
									@Pc(7063) long local7063;
									if (arg0 == 4007) {
										anInt4655 -= 2;
										local7063 = anIntArray436[anInt4655];
										local7070 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = (int) (local7063 + local7063 * local7070 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										if (local13 == 0) {
											anIntArray436[anInt4655++] = 0;
											return;
										}
										anIntArray436[anInt4655++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										if (local13 == 0) {
											anIntArray436[anInt4655++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray436[anInt4655++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray436[anInt4655++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt4655 -= 3;
										local7063 = anIntArray436[anInt4655];
										local7070 = anIntArray436[anInt4655 + 1];
										@Pc(7451) long local7451 = (long) anIntArray436[anInt4655 + 2];
										anIntArray436[anInt4655++] = (int) (local7063 * local7451 / local7070);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray24[--anInt4653];
										local19 = anIntArray436[--anInt4655];
										aStringArray24[anInt4653++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt4653 -= 2;
										local3888 = aStringArray24[anInt4653];
										local1101 = aStringArray24[anInt4653 + 1];
										aStringArray24[anInt4653++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray24[--anInt4653];
										local19 = anIntArray436[--anInt4655];
										aStringArray24[anInt4653++] = local3888 + Static96.method1768(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray24[--anInt4653];
										aStringArray24[anInt4653++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray24[anInt4653++] = method4035(anIntArray436[--anInt4655]);
										return;
									}
									if (arg0 == 4105) {
										anInt4653 -= 2;
										local3888 = aStringArray24[anInt4653];
										local1101 = aStringArray24[anInt4653 + 1];
										if (Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1 != null && Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1.aBoolean316) {
											aStringArray24[anInt4653++] = local1101;
											return;
										}
										aStringArray24[anInt4653++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray436[--anInt4655];
										aStringArray24[anInt4653++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt4653 -= 2;
										anIntArray436[anInt4655++] = Static206.method3293(aStringArray24[anInt4653], aStringArray24[anInt4653 + 1], Static172.anInt6352);
										return;
									}
									@Pc(7734) Class52 local7734;
									if (arg0 == 4108) {
										local3888 = aStringArray24[--anInt4653];
										anInt4655 -= 2;
										local19 = anIntArray436[anInt4655];
										local25 = anIntArray436[anInt4655 + 1];
										local7734 = Static337.method5338(local25, Static36.aClass53_10);
										anIntArray436[anInt4655++] = local7734.method1587(local3888, Static42.aClass35Array3, local19);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray24[--anInt4653];
										anInt4655 -= 2;
										local19 = anIntArray436[anInt4655];
										local25 = anIntArray436[anInt4655 + 1];
										local7734 = Static337.method5338(local25, Static36.aClass53_10);
										anIntArray436[anInt4655++] = local7734.method1584(Static42.aClass35Array3, local3888, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt4653 -= 2;
										local3888 = aStringArray24[anInt4653];
										local1101 = aStringArray24[anInt4653 + 1];
										if (anIntArray436[--anInt4655] == 1) {
											aStringArray24[anInt4653++] = local3888;
											return;
										}
										aStringArray24[anInt4653++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray24[--anInt4653];
										aStringArray24[anInt4653++] = Static187.method3067(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray24[--anInt4653];
										local19 = anIntArray436[--anInt4655];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray24[anInt4653++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static365.method5857((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static76.method1565((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static352.method5539((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static53.method969((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray24[--anInt4653];
										if (local3888 != null) {
											anIntArray436[anInt4655++] = local3888.length();
											return;
										}
										anIntArray436[anInt4655++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray24[--anInt4653];
										anInt4655 -= 2;
										local19 = anIntArray436[anInt4655];
										local25 = anIntArray436[anInt4655 + 1];
										aStringArray24[anInt4653++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray24[--anInt4653];
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
										aStringArray24[anInt4653++] = local8097.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray24[--anInt4653];
										anInt4655 -= 2;
										local19 = anIntArray436[anInt4655];
										local25 = anIntArray436[anInt4655 + 1];
										anIntArray436[anInt4655++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt4653 -= 2;
										local3888 = aStringArray24[anInt4653];
										local1101 = aStringArray24[anInt4653 + 1];
										local25 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray436[--anInt4655] != 0;
										local19 = anIntArray436[--anInt4655];
										aStringArray24[anInt4653++] = Static186.method3044(local412, (long) local19, Static172.anInt6352, 0);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray24[--anInt4653];
										local19 = anIntArray436[--anInt4655];
										@Pc(8320) Class52 local8320 = Static337.method5338(local19, Static36.aClass53_10);
										anIntArray436[anInt4655++] = local8320.method1580(local3888, Static42.aClass35Array3);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray436[--anInt4655];
										aStringArray24[anInt4653++] = Static464.aClass115_1.method2970(local13).aString197;
										return;
									}
									@Pc(8382) Class300 local8382;
									if (arg0 == 4201) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local8382 = Static464.aClass115_1.method2970(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray43[local19 - 1] != null) {
											aStringArray24[anInt4653++] = local8382.aStringArray43[local19 - 1];
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local8382 = Static464.aClass115_1.method2970(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.lb[local19 - 1] != null) {
											aStringArray24[anInt4653++] = local8382.lb[local19 - 1];
											return;
										}
										aStringArray24[anInt4653++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static464.aClass115_1.method2970(local13).anInt8941;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static464.aClass115_1.method2970(local13).anInt8930 == 1 ? 1 : 0;
										return;
									}
									@Pc(8545) Class300 local8545;
									if (arg0 == 4205) {
										local13 = anIntArray436[--anInt4655];
										local8545 = Static464.aClass115_1.method2970(local13);
										if (local8545.anInt8920 == -1 && local8545.anInt8951 >= 0) {
											anIntArray436[anInt4655++] = local8545.anInt8951;
											return;
										}
										anIntArray436[anInt4655++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray436[--anInt4655];
										local8545 = Static464.aClass115_1.method2970(local13);
										if (local8545.anInt8920 >= 0 && local8545.anInt8951 >= 0) {
											anIntArray436[anInt4655++] = local8545.anInt8951;
											return;
										}
										anIntArray436[anInt4655++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray436[--anInt4655];
										anIntArray436[anInt4655++] = Static464.aClass115_1.method2970(local13).aBoolean644 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local3017 = Static66.aClass247_1.method6470(local19);
										if (local3017.method2116()) {
											aStringArray24[anInt4653++] = Static464.aClass115_1.method2970(local13).method7486(local3017.aString53, local19);
											return;
										}
										anIntArray436[anInt4655++] = Static464.aClass115_1.method2970(local13).method7473(local19, local3017.anInt2133);
										return;
									}
									if (arg0 == 4209) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1] - 1;
										local8382 = Static464.aClass115_1.method2970(local13);
										if (local8382.anInt8892 == local19) {
											anIntArray436[anInt4655++] = local8382.anInt8899;
											return;
										}
										if (local8382.anInt8898 == local19) {
											anIntArray436[anInt4655++] = local8382.anInt8919;
											return;
										}
										anIntArray436[anInt4655++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray24[--anInt4653];
										local19 = anIntArray436[--anInt4655];
										Static355.method5747(local19 == 1, local3888);
										anIntArray436[anInt4655++] = Static319.anInt5969;
										return;
									}
									if (arg0 == 4211) {
										if (Static206.aShortArray70 != null && Static155.anInt2821 < Static319.anInt5969) {
											anIntArray436[anInt4655++] = Static206.aShortArray70[Static155.anInt2821++] & 0xFFFF;
											return;
										}
										anIntArray436[anInt4655++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static155.anInt2821 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local3017 = Static66.aClass247_1.method6470(local19);
										if (local3017.method2116()) {
											aStringArray24[anInt4653++] = Static21.aClass255_2.method6583(local13).method453(local3017.aString53, local19);
											return;
										}
										anIntArray436[anInt4655++] = Static21.aClass255_2.method6583(local13).method461(local3017.anInt2133, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local3017 = Static66.aClass247_1.method6470(local19);
										if (local3017.method2116()) {
											aStringArray24[anInt4653++] = Static505.aClass206_4.method5326(local13).method3273(local3017.aString53, local19);
											return;
										}
										anIntArray436[anInt4655++] = Static505.aClass206_4.method5326(local13).method3266(local3017.anInt2133, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt4655 -= 2;
										local13 = anIntArray436[anInt4655];
										local19 = anIntArray436[anInt4655 + 1];
										local3017 = Static66.aClass247_1.method6470(local19);
										if (local3017.method2116()) {
											aStringArray24[anInt4653++] = Static172.aClass211_2.method5365(local13).method3621(local19, local3017.aString53);
											return;
										}
										anIntArray436[anInt4655++] = Static172.aClass211_2.method5365(local13).method3627(local3017.anInt2133, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray436[--anInt4655];
									@Pc(9046) Class24 local9046 = Static492.aClass218_1.method5796(local13);
									if (local9046.anIntArray47 != null && local9046.anIntArray47.length > 0) {
										local25 = 0;
										local353 = local9046.anIntArray48[0];
										for (local2290 = 1; local2290 < local9046.anIntArray47.length; local2290++) {
											if (local9046.anIntArray48[local2290] > local353) {
												local25 = local2290;
												local353 = local9046.anIntArray48[local2290];
											}
										}
										anIntArray436[anInt4655++] = local9046.anIntArray47[local25];
										return;
									}
									anIntArray436[anInt4655++] = local9046.anInt675;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static111.method2143(anIntArray436[--anInt4655]);
					} else {
						local137 = arg1 ? aClass310_11 : aClass310_12;
					}
					Static273.method4342(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt4655 -= 2;
						local19 = anIntArray436[anInt4655];
						local25 = anIntArray436[anInt4655 + 1];
						if (local137.anInt9170 == -1) {
							Static318.method5089(local137.anInt9226);
							Static284.method7810(local137.anInt9226);
							Static164.method2785(local137.anInt9226);
						}
						if (local19 == -1) {
							local137.anInt9158 = 1;
							local137.anInt9218 = -1;
							local137.anInt9224 = -1;
							return;
						}
						local137.anInt9224 = local19;
						local137.anInt9153 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean660 = true;
						} else {
							local137.aBoolean660 = false;
						}
						@Pc(1630) Class300 local1630 = Static464.aClass115_1.method2970(local19);
						local137.anInt9154 = local1630.anInt8954;
						local137.anInt9183 = local1630.anInt8940;
						local137.anInt9190 = local1630.anInt8907;
						local137.anInt9173 = local1630.anInt8929;
						local137.anInt9160 = local1630.anInt8931;
						local137.anInt9215 = local1630.anInt8934;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9152 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9152 = 1;
						} else {
							local137.anInt9152 = 2;
						}
						if (local137.anInt9195 > 0) {
							local137.anInt9215 = local137.anInt9215 * 32 / local137.anInt9195;
							return;
						}
						if (local137.anInt9165 > 0) {
							local137.anInt9215 = local137.anInt9215 * 32 / local137.anInt9165;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9158 = 2;
						local137.anInt9218 = anIntArray436[--anInt4655];
						if (local137.anInt9170 == -1) {
							Static371.method5898(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9158 = 3;
						local137.anInt9218 = -1;
						if (local137.anInt9170 == -1) {
							Static371.method5898(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9158 = 6;
						local137.anInt9218 = anIntArray436[--anInt4655];
						if (local137.anInt9170 == -1) {
							Static371.method5898(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9158 = 5;
						local137.anInt9218 = anIntArray436[--anInt4655];
						if (local137.anInt9170 == -1) {
							Static371.method5898(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt4655 -= 4;
						local137.anInt9235 = anIntArray436[anInt4655];
						local137.anInt9193 = anIntArray436[anInt4655 + 1];
						local137.anInt9209 = anIntArray436[anInt4655 + 2];
						local137.anInt9222 = anIntArray436[anInt4655 + 3];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt4655 -= 2;
						local137.anInt9206 = anIntArray436[anInt4655];
						local137.anInt9147 = anIntArray436[anInt4655 + 1];
						Static273.method4342(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt4655 -= 4;
						local137.anInt9218 = anIntArray436[anInt4655];
						local137.anInt9200 = anIntArray436[anInt4655 + 1];
						if (anIntArray436[anInt4655 + 2] == 1) {
							local137.anInt9158 = 9;
						} else {
							local137.anInt9158 = 8;
						}
						if (anIntArray436[anInt4655 + 3] == 1) {
							local137.aBoolean660 = true;
						} else {
							local137.aBoolean660 = false;
						}
						if (local137.anInt9170 == -1) {
							Static371.method5898(local137.anInt9226);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9158 = 5;
						local137.anInt9218 = Static174.anInt3154;
						local137.anInt9200 = 0;
						if (local137.anInt9170 == -1) {
							Static371.method5898(local137.anInt9226);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!mh;II)V")
	public static void method4043(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub13_Sub11 local5 = Static145.method2531(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray435 = new int[local5.anInt5175];
		aStringArray25 = new String[local5.anInt5172];
		if (local5.aClass188_5 == Static454.aClass188_9 || local5.aClass188_5 == Static174.aClass188_3 || local5.aClass188_5 == Static71.aClass188_2) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static292.aClass310_13 != null) {
				local30 = Static292.aClass310_13.anInt9184;
				local32 = Static292.aClass310_13.anInt9175;
			}
			anIntArray435[0] = Static61.aClass214_1.method7241() - local30;
			anIntArray435[1] = Static61.aClass214_1.method7240() - local32;
		}
		method4041(local5, 200000);
	}
}
