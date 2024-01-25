import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!oca", name = "u", descriptor = "Lclient!gp;")
	public static Class143 aClass143_4;

	@OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
	private static int anInt7214;

	@OriginalMember(owner = "client!oca", name = "x", descriptor = "F")
	public static float aFloat121 = 1.0F;

	@OriginalMember(owner = "client!oca", name = "o", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_70 = new Class144(60, 4);

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "[Lclient!wo;")
	public static final Interface26[] anInterface26Array1 = new Interface26[75];

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method6256(@OriginalArg(0) long arg0) {
		Static214.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static214.aCalendar1.get(7);
		@Pc(17) int local17 = Static214.aCalendar1.get(5);
		@Pc(21) int local21 = Static214.aCalendar1.get(2);
		@Pc(25) int local25 = Static214.aCalendar1.get(1);
		@Pc(29) int local29 = Static214.aCalendar1.get(11);
		@Pc(33) int local33 = Static214.aCalendar1.get(12);
		@Pc(37) int local37 = Static214.aCalendar1.get(13);
		return Static127.aStringArray9[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static426.aStringArray26[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!rv;Lclient!rv;B)V")
	public static void method6257(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_66 != null) {
			arg1.method9251();
		}
		arg1.aClass3_Sub7_67 = arg0.aClass3_Sub7_67;
		arg1.aClass3_Sub7_66 = arg0;
		arg1.aClass3_Sub7_66.aClass3_Sub7_67 = arg1;
		arg1.aClass3_Sub7_67.aClass3_Sub7_66 = arg1;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!ik;B)V")
	public static void method6258(@OriginalArg(0) Class182 arg0) {
		Static212.anInt3495 = arg0.method3978("hitbar_default");
		Static96.anInt10761 = arg0.method3978("timerbar_default");
		Static486.anInt7654 = arg0.method3978("headicons_pk");
		Static336.anInt5407 = arg0.method3978("headicons_prayer");
		Static117.anInt2409 = arg0.method3978("hint_headicons");
		Static189.anInt3241 = arg0.method3978("hint_mapmarkers");
		Static413.anInt6380 = arg0.method3978("mapflag");
		Static642.anInt9924 = arg0.method3978("cross");
		Static533.anInt8302 = arg0.method3978("mapdots");
		Static217.anInt3585 = arg0.method3978("scrollbar");
		Static39.anInt1223 = arg0.method3978("name_icons");
		Static642.anInt9932 = arg0.method3978("floorshadows");
		Static45.anInt1287 = arg0.method3978("compass");
		Static137.anInt2610 = arg0.method3978("otherlevel");
		Static354.anInt5610 = arg0.method3978("hint_mapedge");
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)Z")
	public static boolean method6259(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
	public static void method6262() {
		if (Static74.anInt1708 == 0 || Static74.anInt1708 == 10) {
			return;
		}
		try {
			@Pc(21) short local21;
			if (Static607.anInt9202 == 0) {
				local21 = 250;
			} else {
				local21 = 2000;
			}
			if (Static11.anInt525 != 2 || Static74.anInt1708 != 20 && Static289.anInt4432 != 42) {
				Static5.anInt218++;
			}
			if (Static251.aBoolean246 && Static74.anInt1708 >= 6) {
				local21 = 6000;
			}
			if (Static5.anInt218 > local21) {
				Static265.aClass292_3.method6852();
				if (Static607.anInt9202 >= 3) {
					Static74.anInt1708 = 0;
					Static625.method8221(-5);
					return;
				}
				if (Static11.anInt525 == 2) {
					Static226.aClass43_3.method1304();
				} else {
					Static120.aClass43_1.method1304();
				}
				Static607.anInt9202++;
				Static5.anInt218 = 0;
				Static74.anInt1708 = 1;
			}
			if (Static74.anInt1708 == 1) {
				if (Static11.anInt525 == 2) {
					Static265.aClass292_3.aClass338_6 = Static226.aClass43_3.method1307(Static122.aClass47_1);
				} else {
					Static265.aClass292_3.aClass338_6 = Static120.aClass43_1.method1307(Static122.aClass47_1);
				}
				Static74.anInt1708 = 2;
			}
			@Pc(183) Class3_Sub29 local183;
			@Pc(210) int local210;
			@Pc(259) int local259;
			if (Static74.anInt1708 == 2) {
				if (Static265.aClass292_3.aClass338_6.anInt8934 == 2) {
					throw new IOException();
				}
				if (Static265.aClass292_3.aClass338_6.anInt8934 != 1) {
					return;
				}
				Static265.aClass292_3.aClass118_2 = Static665.method8673((Socket) Static265.aClass292_3.aClass338_6.anObject16);
				Static265.aClass292_3.aClass338_6 = null;
				Static265.aClass292_3.method6856();
				local183 = Static248.method3511();
				if (Static251.aBoolean246) {
					local183.aClass3_Sub2_Sub1_1.method2065(Static596.aClass146_12.anInt3686);
					local183.aClass3_Sub2_Sub1_1.method2032(0);
					local210 = local183.aClass3_Sub2_Sub1_1.anInt2178;
					local183.aClass3_Sub2_Sub1_1.method2018(665);
					if (Static11.anInt525 == 2) {
						local183.aClass3_Sub2_Sub1_1.method2065(Static98.anInt2140 == 14 ? 1 : 0);
					}
					@Pc(238) Class3_Sub2 local238 = Static191.method2977();
					local238.method2065(Static66.anInt1579);
					local238.method2032((int) (Math.random() * 9.9999999E7D));
					local238.method2065(Static456.anInt7118);
					local238.method2018(Static281.anInt4321);
					for (local259 = 0; local259 < 6; local259++) {
						local238.method2018((int) (Math.random() * 9.9999999E7D));
					}
					local238.method2016(Static194.aLong127);
					local238.method2065(Static346.aClass309_6.anInt8217);
					local238.method2065((int) (Math.random() * 9.9999999E7D));
					local238.method2040(Static242.aBigInteger3, Static473.aBigInteger5);
					local183.aClass3_Sub2_Sub1_1.method2068(0, local238.anInt2178, local238.aByteArray20);
					local183.aClass3_Sub2_Sub1_1.method2076(local183.aClass3_Sub2_Sub1_1.anInt2178 - local210);
				} else {
					local183.aClass3_Sub2_Sub1_1.method2065(Static596.aClass146_1.anInt3686);
				}
				Static265.aClass292_3.method6855(local183);
				Static265.aClass292_3.method6851();
				Static74.anInt1708 = 3;
			}
			@Pc(364) int local364;
			if (Static74.anInt1708 == 3) {
				if (!Static265.aClass292_3.aClass118_2.method7795(1)) {
					return;
				}
				Static265.aClass292_3.aClass118_2.method7796(1, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				local364 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF;
				if (local364 != 0) {
					Static74.anInt1708 = 0;
					Static625.method8221(local364);
					Static265.aClass292_3.method6852();
					Static27.method978();
					return;
				}
				if (Static251.aBoolean246) {
					Static74.anInt1708 = 4;
				} else {
					Static74.anInt1708 = 8;
				}
			}
			if (Static74.anInt1708 == 4) {
				if (!Static265.aClass292_3.aClass118_2.method7795(2)) {
					return;
				}
				Static265.aClass292_3.aClass118_2.method7796(2, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.method2028(-14795);
				Static74.anInt1708 = 5;
			}
			if (Static74.anInt1708 == 5) {
				if (!Static265.aClass292_3.aClass118_2.method7795(Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178)) {
					return;
				}
				Static265.aClass292_3.aClass118_2.method7796(Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.method2038(Static155.anIntArray176);
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
				@Pc(472) String local472 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.method2027();
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
				@Pc(480) String local480 = "opensn";
				if (!Static304.aBoolean320 || Static537.method7125(1, Static122.aClass47_1, local480, local472).anInt8934 == 2) {
					Static521.method6990(local472, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 1, Static122.aClass47_1, true, local480);
				}
				Static74.anInt1708 = 6;
			}
			if (Static74.anInt1708 == 6) {
				if (!Static265.aClass292_3.aClass118_2.method7795(1)) {
					return;
				}
				Static265.aClass292_3.aClass118_2.method7796(1, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				if ((Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF) == 1) {
					Static74.anInt1708 = 7;
				}
			}
			if (Static74.anInt1708 == 7) {
				if (!Static265.aClass292_3.aClass118_2.method7795(16)) {
					return;
				}
				Static265.aClass292_3.aClass118_2.method7796(16, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 16;
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.method2038(Static155.anIntArray176);
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
				Static110.aString41 = Static441.aString88 = Static248.method3508(Static265.aClass292_3.aClass3_Sub2_Sub1_2.method2063(), -116);
				Static605.aLong302 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.method2063();
				Static74.anInt1708 = 8;
			}
			@Pc(627) Class3_Sub2_Sub1 local627;
			if (Static74.anInt1708 == 8) {
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
				Static265.aClass292_3.method6856();
				local183 = Static248.method3511();
				local627 = local183.aClass3_Sub2_Sub1_1;
				@Pc(655) int local655;
				@Pc(683) Class3_Sub2 local683;
				@Pc(636) Class146 local636;
				if (Static11.anInt525 == 2) {
					if (Static251.aBoolean246) {
						local636 = Static596.aClass146_13;
					} else {
						local636 = Static596.aClass146_3;
					}
					local627.method2065(local636.anInt3686);
					local627.method2032(0);
					local259 = local627.anInt2178;
					local655 = local627.anInt2178;
					if (!Static251.aBoolean246) {
						local627.method2018(665);
						local627.method2065(Static98.anInt2140 == 14 ? 1 : 0);
						local655 = local627.anInt2178;
						local683 = Static19.method612();
						local627.method2068(0, local683.anInt2178, local683.aByteArray20);
						local655 = local627.anInt2178;
						local627.method2073(Static110.aString41);
					}
					local627.method2065(Static565.anInt8601);
					local627.method2065(Static276.method3880(3));
					local627.method2032(Static681.anInt10652);
					local627.method2032(Static76.anInt1720);
					local627.method2065(Static580.aClass3_Sub22_24.aClass21_Sub6_2.method3188());
					Static263.method3738(local627);
					local627.method2073(Static65.aString113);
					local627.method2018(Static281.anInt4321);
					local683 = Static580.aClass3_Sub22_24.method2420();
					local627.method2065(local683.anInt2178);
					local627.method2068(0, local683.anInt2178, local683.aByteArray20);
					Static569.aBoolean580 = true;
					@Pc(761) Class3_Sub2 local761 = new Class3_Sub2(Static12.aClass3_Sub39_12.method5124());
					Static12.aClass3_Sub39_12.method5125(local761);
					local627.method2068(0, local761.aByteArray20.length, local761.aByteArray20);
					local627.method2018(Static407.anInt6329);
					local627.method2016(Static268.aLong150);
					local627.method2065(Static353.aString68 == null ? 0 : 1);
					if (Static353.aString68 != null) {
						local627.method2073(Static353.aString68);
					}
					local627.method2065(Static437.method5770("jagtheora") ? 1 : 0);
					local627.method2065(Static304.aBoolean320 ? 1 : 0);
					Static673.method9179(local627);
					local627.method2021(Static155.anIntArray176, local627.anInt2178, local655);
					local627.method2076(local627.anInt2178 - local259);
				} else {
					if (Static251.aBoolean246) {
						local636 = Static596.aClass146_13;
					} else {
						local636 = Static596.aClass146_5;
					}
					local627.method2065(local636.anInt3686);
					local627.method2032(0);
					local259 = local627.anInt2178;
					local655 = local627.anInt2178;
					if (!Static251.aBoolean246) {
						local627.method2018(665);
						local683 = Static19.method612();
						local627.method2068(0, local683.anInt2178, local683.aByteArray20);
						local655 = local627.anInt2178;
						local627.method2073(Static110.aString41);
					}
					local627.method2065(Static346.aClass309_6.anInt8217);
					local627.method2065(Static456.anInt7118);
					Static263.method3738(local627);
					local627.method2073(Static65.aString113);
					local627.method2018(Static281.anInt4321);
					Static673.method9179(local627);
					local627.method2021(Static155.anIntArray176, local627.anInt2178, local655);
					local627.method2076(local627.anInt2178 - local259);
				}
				Static265.aClass292_3.method6855(local183);
				Static265.aClass292_3.method6851();
				Static265.aClass292_3.aClass88_2 = new Class88(Static155.anIntArray176);
				for (@Pc(949) int local949 = 0; local949 < 4; local949++) {
					Static155.anIntArray176[local949] += 50;
				}
				Static265.aClass292_3.aClass3_Sub2_Sub1_2.method222(Static155.anIntArray176);
				Static155.anIntArray176 = null;
				Static74.anInt1708 = 9;
			}
			if (Static74.anInt1708 == 9) {
				if (!Static265.aClass292_3.aClass118_2.method7795(1)) {
					return;
				}
				Static265.aClass292_3.aClass118_2.method7796(1, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				local364 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF;
				if (local364 == 21) {
					Static74.anInt1708 = 12;
				} else if (local364 == 29 || local364 == 45) {
					anInt7214 = local364;
					Static74.anInt1708 = 18;
				} else if (local364 == 1) {
					Static74.anInt1708 = 10;
					Static625.method8221(local364);
					return;
				} else if (local364 == 2) {
					Static74.anInt1708 = 13;
				} else if (local364 == 15) {
					Static265.aClass292_3.anInt8012 = -2;
					Static74.anInt1708 = 19;
				} else if (local364 == 23 && Static607.anInt9202 < 3) {
					Static74.anInt1708 = 1;
					Static607.anInt9202++;
					Static5.anInt218 = 0;
					Static265.aClass292_3.aClass118_2.method7800();
					Static265.aClass292_3.aClass118_2 = null;
					return;
				} else if (local364 == 42) {
					Static74.anInt1708 = 20;
					Static625.method8221(local364);
					return;
				} else if (!Static217.aBoolean224 || Static251.aBoolean246 || Static66.anInt1579 == -1 || local364 != 35) {
					Static74.anInt1708 = 0;
					Static625.method8221(local364);
					Static265.aClass292_3.aClass118_2.method7800();
					Static265.aClass292_3.aClass118_2 = null;
					Static27.method978();
					return;
				} else {
					Static251.aBoolean246 = true;
					Static74.anInt1708 = 1;
					Static5.anInt218 = 0;
					Static265.aClass292_3.aClass118_2.method7800();
					Static265.aClass292_3.aClass118_2 = null;
					return;
				}
			}
			if (Static74.anInt1708 == 11) {
				Static265.aClass292_3.method6856();
				local183 = Static248.method3511();
				local627 = local183.aClass3_Sub2_Sub1_1;
				local627.method221(Static265.aClass292_3.aClass88_2);
				local627.method220(Static596.aClass146_9.anInt3686);
				Static265.aClass292_3.method6855(local183);
				Static265.aClass292_3.method6851();
				Static74.anInt1708 = 9;
			} else if (Static74.anInt1708 == 12) {
				if (Static265.aClass292_3.aClass118_2.method7795(1)) {
					Static265.aClass292_3.aClass118_2.method7796(1, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
					local364 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF;
					Static151.anInt2726 = local364 * 50;
					Static74.anInt1708 = 0;
					Static625.method8221(21);
					Static265.aClass292_3.aClass118_2.method7800();
					Static265.aClass292_3.aClass118_2 = null;
					Static27.method978();
				}
			} else if (Static74.anInt1708 == 20) {
				if (Static265.aClass292_3.aClass118_2.method7795(2)) {
					Static265.aClass292_3.aClass118_2.method7796(2, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
					Static321.anInt5167 = ((Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF) << 8) + (Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[1] & 0xFF);
					Static74.anInt1708 = 9;
				}
			} else if (Static74.anInt1708 == 18) {
				if (anInt7214 == 29) {
					if (!Static265.aClass292_3.aClass118_2.method7795(1)) {
						return;
					}
					Static265.aClass292_3.aClass118_2.method7796(1, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
					Static92.anInt2098 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF;
				} else if (anInt7214 == 45) {
					if (!Static265.aClass292_3.aClass118_2.method7795(3)) {
						return;
					}
					Static265.aClass292_3.aClass118_2.method7796(3, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
					Static325.anInt5284 = (Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[2] & 0xFF) + ((Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[1] & 0xFF) << 8);
					Static92.anInt2098 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF;
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + anInt7214);
				}
				Static74.anInt1708 = 0;
				Static625.method8221(anInt7214);
				Static265.aClass292_3.aClass118_2.method7800();
				Static265.aClass292_3.aClass118_2 = null;
				Static27.method978();
			} else if (Static74.anInt1708 != 13) {
				@Pc(1464) Class3_Sub2_Sub1 local1464;
				if (Static74.anInt1708 == 14) {
					local1464 = Static265.aClass292_3.aClass3_Sub2_Sub1_2;
					if (Static11.anInt525 == 2) {
						if (!Static265.aClass292_3.aClass118_2.method7795(Static695.anInt7835)) {
							return;
						}
						Static265.aClass292_3.aClass118_2.method7796(Static695.anInt7835, local1464.aByteArray20, 0);
						local1464.anInt2178 = 0;
						Static432.anInt6579 = local1464.method2048(255);
						Static541.anInt8426 = local1464.method2048(255);
						Static24.aBoolean48 = local1464.method2048(255) == 1;
						Static584.aBoolean596 = local1464.method2048(255) == 1;
						Static159.aBoolean179 = local1464.method2048(255) == 1;
						Static297.aBoolean293 = local1464.method2048(255) == 1;
						Static574.anInt8718 = local1464.method2028(-14795);
						Static601.aBoolean608 = local1464.method2048(255) == 1;
						Static426.anInt6539 = local1464.method2047();
						Static5.aBoolean3 = local1464.method2048(255) == 1;
						Static225.aString53 = local1464.method2014();
						Static216.aClass53_3.method1527(Static5.aBoolean3);
						Static606.aClass62_2.method1892(Static5.aBoolean3);
						Static255.aClass14_1.method623(Static5.aBoolean3);
					} else if (Static265.aClass292_3.aClass118_2.method7795(Static695.anInt7835)) {
						Static265.aClass292_3.aClass118_2.method7796(Static695.anInt7835, local1464.aByteArray20, 0);
						local1464.anInt2178 = 0;
						Static432.anInt6579 = local1464.method2048(255);
						Static541.anInt8426 = local1464.method2048(255);
						Static24.aBoolean48 = local1464.method2048(255) == 1;
						Static584.aBoolean596 = local1464.method2048(255) == 1;
						Static159.aBoolean179 = local1464.method2048(255) == 1;
						Static57.aLong45 = local1464.method2063();
						Static643.aLong315 = Static57.aLong45 - Static517.method6965() - local1464.method2035();
						local210 = local1464.method2048(255);
						Static141.aBoolean170 = (local210 & 0x2) != 0;
						Static601.aBoolean608 = (local210 & 0x1) != 0;
						Static529.anInt8251 = local1464.method2036();
						Static232.aBoolean233 = local1464.method2048(255) == 1;
						Static348.anInt5563 = local1464.method2036();
						Static445.anInt6825 = local1464.method2028(-14795);
						Static337.anInt5412 = local1464.method2028(-14795);
						Static334.anInt5362 = local1464.method2028(-14795);
						Static220.anInt3605 = local1464.method2036();
						Static85.aClass338_3 = Static122.aClass47_1.method1398(Static220.anInt3605);
						Static73.anInt1696 = local1464.method2048(255);
						Static574.anInt8715 = local1464.method2028(-14795);
						Static543.anInt8438 = local1464.method2028(-14795);
						Static701.aBoolean741 = local1464.method2048(255) == 1;
						Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString3 = Static293.aString60 = local1464.method2027();
						Static290.anInt4445 = local1464.method2048(255);
						Static384.anInt5960 = local1464.method2036();
						Static353.aBoolean363 = local1464.method2048(255) == 1;
						Static124.aClass43_2 = new Class43();
						Static124.aClass43_2.anInt1402 = local1464.method2028(-14795);
						if (Static124.aClass43_2.anInt1402 == 65535) {
							Static124.aClass43_2.anInt1402 = -1;
						}
						Static124.aClass43_2.aString20 = local1464.method2027();
						if (Static416.aClass379_6 != Static286.aClass379_8) {
							Static124.aClass43_2.anInt1400 = Static124.aClass43_2.anInt1402 + 40000;
							Static124.aClass43_2.anInt1404 = Static124.aClass43_2.anInt1402 + 50000;
						}
						if (Static301.aClass379_9 != Static416.aClass379_6 && (Static253.aClass379_7 != Static416.aClass379_6 || Static432.anInt6579 < 2) && Static226.aClass43_3.method1308(Static320.aClass43_4)) {
							Static683.method9053();
						}
					} else {
						return;
					}
					if (Static24.aBoolean48 && !Static159.aBoolean179 || Static601.aBoolean608) {
						try {
							Static728.method688(Static41.anApplet1, "zap");
						} catch (@Pc(1892) Throwable local1892) {
							if (Static608.aBoolean613) {
								try {
									Static41.anApplet1.getAppletContext().showDocument(new URL(Static41.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1910) Exception local1910) {
								}
							}
						}
					} else {
						try {
							Static728.method688(Static41.anApplet1, "unzap");
						} catch (@Pc(1921) Throwable local1921) {
						}
					}
					if (Static416.aClass379_6 == Static286.aClass379_8) {
						try {
							Static728.method688(Static41.anApplet1, "loggedin");
						} catch (@Pc(1936) Throwable local1936) {
						}
					}
					if (Static11.anInt525 != 2) {
						Static74.anInt1708 = 0;
						Static625.method8221(2);
						Static582.method7516();
						Static336.method4832(7);
						Static265.aClass292_3.aClass397_131 = null;
						return;
					}
					Static74.anInt1708 = 16;
				}
				if (Static74.anInt1708 == 16) {
					if (!Static265.aClass292_3.aClass118_2.method7795(3)) {
						return;
					}
					Static265.aClass292_3.aClass118_2.method7796(3, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
					Static74.anInt1708 = 17;
				}
				if (Static74.anInt1708 == 17) {
					local1464 = Static265.aClass292_3.aClass3_Sub2_Sub1_2;
					local1464.anInt2178 = 0;
					if (local1464.method224()) {
						if (!Static265.aClass292_3.aClass118_2.method7795(1)) {
							return;
						}
						Static265.aClass292_3.aClass118_2.method7796(1, local1464.aByteArray20, 3);
					}
					Static265.aClass292_3.aClass397_131 = Static368.method5069()[local1464.method218()];
					Static265.aClass292_3.anInt8012 = local1464.method2028(-14795);
					Static74.anInt1708 = 15;
				}
				if (Static74.anInt1708 == 15) {
					if (Static265.aClass292_3.aClass118_2.method7795(Static265.aClass292_3.anInt8012)) {
						Static265.aClass292_3.aClass118_2.method7796(Static265.aClass292_3.anInt8012, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
						Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
						local364 = Static265.aClass292_3.anInt8012;
						Static74.anInt1708 = 0;
						Static625.method8221(2);
						Static458.method5832();
						Static562.method7336(Static265.aClass292_3.aClass3_Sub2_Sub1_2);
						Static67.anInt1612 = -1;
						if (Static265.aClass292_3.aClass397_131 == Static614.aClass397_167) {
							Static609.method7804();
						} else {
							Static363.method5381();
						}
						if (local364 != Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178) {
							throw new RuntimeException("lswp pos:" + Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 + " psize:" + local364);
						}
						Static265.aClass292_3.aClass397_131 = null;
					}
				} else if (Static74.anInt1708 == 19) {
					if (Static265.aClass292_3.anInt8012 == -2) {
						if (!Static265.aClass292_3.aClass118_2.method7795(2)) {
							return;
						}
						Static265.aClass292_3.aClass118_2.method7796(2, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
						Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
						Static265.aClass292_3.anInt8012 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.method2028(-14795);
					}
					if (Static265.aClass292_3.aClass118_2.method7795(Static265.aClass292_3.anInt8012)) {
						Static265.aClass292_3.aClass118_2.method7796(Static265.aClass292_3.anInt8012, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
						Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 = 0;
						local364 = Static265.aClass292_3.anInt8012;
						Static74.anInt1708 = 0;
						Static625.method8221(15);
						Static511.method6941();
						Static562.method7336(Static265.aClass292_3.aClass3_Sub2_Sub1_2);
						if (Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 != local364) {
							throw new RuntimeException("lswpr pos:" + Static265.aClass292_3.aClass3_Sub2_Sub1_2.anInt2178 + " psize:" + local364);
						}
						Static265.aClass292_3.aClass397_131 = null;
					}
				}
			} else if (Static265.aClass292_3.aClass118_2.method7795(1)) {
				Static265.aClass292_3.aClass118_2.method7796(1, Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				Static695.anInt7835 = Static265.aClass292_3.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF;
				Static74.anInt1708 = 14;
			}
		} catch (@Pc(2240) IOException local2240) {
			Static265.aClass292_3.method6852();
			if (Static607.anInt9202 >= 3) {
				Static74.anInt1708 = 0;
				Static625.method8221(-4);
				Static27.method978();
			} else {
				if (Static11.anInt525 == 2) {
					Static226.aClass43_3.method1304();
				} else {
					Static120.aClass43_1.method1304();
				}
				Static607.anInt9202++;
				Static5.anInt218 = 0;
				Static74.anInt1708 = 1;
			}
		}
	}
}
