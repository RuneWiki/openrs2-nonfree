import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "Lclient!gj;")
	public static Class86 aClass86_4;

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "[J")
	public static final long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_100 = new Class208(66, 0);

	@OriginalMember(owner = "client!jh", name = "U", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
	public static void method2878(@OriginalArg(0) int arg0) {
		Static382.anInt6948 = arg0;
		@Pc(11) Class41 local11 = Static157.aClass41_40;
		synchronized (Static157.aClass41_40) {
			Static157.aClass41_40.method825();
		}
		local11 = Static236.aClass41_55;
		synchronized (Static236.aClass41_55) {
			Static236.aClass41_55.method825();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!oj;)V")
	public static void method2879(@OriginalArg(1) Class48 arg0) {
		if (Static233.anInt4642 < 2 && !Static45.aBoolean446 || Static268.aClass3_13 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static45.aBoolean446 && Static233.anInt4642 < 2) {
			local36 = Static207.aString34 + Static250.aClass62_174.method1389(Static200.anInt4144) + Static343.aString60 + " ->";
		} else if (Static228.aBoolean332 && Static68.aClass98_1.method4517(81) && Static233.anInt4642 > 2) {
			local36 = Static264.method3357((Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243.aClass2_243);
		} else {
			@Pc(55) Class2_Sub43 local55 = (Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243;
			local36 = Static264.method3357(local55);
			@Pc(61) int[] local61 = null;
			if (Static102.method1833(local55.anInt7126)) {
				local61 = Static57.aClass196_1.method4827((int) local55.aLong212).anIntArray314;
			} else if (local55.anInt7124 != -1) {
				local61 = Static57.aClass196_1.method4827(local55.anInt7124).anIntArray314;
			} else if (Static379.method5976(local55.anInt7126)) {
				@Pc(142) Class1_Sub2_Sub1_Sub2 local142 = Static223.aClass1_Sub2_Sub1_Sub2Array1[(int) local55.aLong212];
				if (local142 != null) {
					@Pc(147) Class197 local147 = local142.aClass197_1;
					if (local147.anIntArray468 != null) {
						local147 = local147.method4832(Static179.aClass115_1);
					}
					if (local147 != null) {
						local61 = local147.anIntArray467;
					}
				}
			} else if (Static54.method845(local55.anInt7126)) {
				@Pc(114) Class47 local114;
				if (local55.anInt7126 == 1004) {
					local114 = Static230.aClass96_4.method2303((int) local55.aLong212);
				} else {
					local114 = Static230.aClass96_4.method2303((int) (local55.aLong212 >>> 32 & 0x7FFFFFFFL));
				}
				if (local114.anIntArray95 != null) {
					local114 = local114.method903(Static179.aClass115_1);
				}
				if (local114 != null) {
					local61 = local114.anIntArray93;
				}
			}
			if (local61 != null) {
				local36 = local36 + Static350.method5582(local61);
			}
		}
		if (Static233.anInt4642 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static233.anInt4642 - 2) + Static214.aClass62_154.method1389(Static200.anInt4144);
		}
		if (Static187.aClass3_9 != null) {
			@Pc(219) Class44 local219 = Static187.aClass3_9.method50(arg0);
			if (local219 == null) {
				local219 = Static180.aClass44_4;
			}
			local219.method4646(Static54.anInt1172, Static187.aClass3_9.anInt74, Static315.aClass27Array51, Static187.aClass3_9.anInt116, Static187.aClass3_9.anInt113, Static128.anInt2774, Static224.aRandom1, Static187.aClass3_9.anInt64, Static273.anIntArray444, Static131.anInt2859, Static2.anIntArray588, Static187.aClass3_9.anInt96, Static187.aClass3_9.anInt103, local36);
			Static330.method5311(Static273.anIntArray444[0], Static273.anIntArray444[2], Static273.anIntArray444[1], Static273.anIntArray444[3]);
		} else if (Static16.aClass3_2 != null && Static85.aClass38_1 == Static255.aClass38_3) {
			@Pc(284) int local284 = Static180.aClass44_4.method4663(local36, Static284.anInt5624 + 16, Static224.aRandom1, Static2.anIntArray588, Static352.anInt6483 + 4, Static315.aClass27Array51, Static131.anInt2859);
			Static330.method5311(Static352.anInt6483 + 4, Static121.aClass24_10.method325(local36) - -local284, Static284.anInt5624, 16);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			Static69.method1257();
		}
		if (Static33.aFrame2 != null && (arg1 != 3 || Static120.anInt2646 != arg3 || Static260.anInt4975 != arg2)) {
			Static108.method1966(Static154.aClass123_2, Static33.aFrame2);
			Static33.aFrame2 = null;
		}
		if (arg1 == 3 && Static33.aFrame2 == null) {
			Static33.aFrame2 = Static371.method5910(arg2, Static154.aClass123_2, 0, arg3);
			if (Static33.aFrame2 != null) {
				Static260.anInt4975 = arg2;
				Static120.anInt2646 = arg3;
				Static237.method4219(Static154.aClass123_2);
			}
		}
		if (arg1 == 3 && Static33.aFrame2 == null) {
			method2880(arg0, Static202.anInt4200, -1, -1, true);
			return;
		}
		@Pc(78) Container local78;
		@Pc(91) Insets local91;
		if (Static33.aFrame2 != null) {
			Static72.anInt1616 = arg2;
			local78 = Static33.aFrame2;
			Static316.anInt5775 = arg3;
		} else if (Static115.aFrame3 == null) {
			local78 = Static154.aClass123_2.anApplet1;
			Static316.anInt5775 = local78.getSize().width;
			Static72.anInt1616 = local78.getSize().height;
		} else {
			local91 = Static115.aFrame3.getInsets();
			Static316.anInt5775 = Static115.aFrame3.getSize().width - local91.left - local91.right;
			@Pc(108) int local108 = -local91.bottom;
			Static72.anInt1616 = Static115.aFrame3.getSize().height + local108 - local91.top;
			local78 = Static115.aFrame3;
		}
		@Pc(143) int local143;
		if (arg1 == 1) {
			Static275.anInt6176 = 0;
			Static336.anInt6217 = Static125.anInt2718;
			Static7.anInt157 = Static26.anInt374;
			Static324.anInt5937 = (Static316.anInt5775 - Static26.anInt374) / 2;
		} else if (Static199.anInt4131 < 96 && Static36.anInt2910 == 0) {
			local143 = Static316.anInt5775 <= 1024 ? Static316.anInt5775 : 1024;
			Static324.anInt5937 = (Static316.anInt5775 - local143) / 2;
			@Pc(157) int local157 = Static72.anInt1616 <= 768 ? Static72.anInt1616 : 768;
			Static7.anInt157 = local143;
			Static336.anInt6217 = local157;
			Static275.anInt6176 = 0;
		} else {
			Static7.anInt157 = Static316.anInt5775;
			Static275.anInt6176 = 0;
			Static336.anInt6217 = Static72.anInt1616;
			Static324.anInt5937 = 0;
		}
		if (Static158.aClass49_3 != Static306.aClass49_7) {
			@Pc(200) boolean local200;
			if (Static7.anInt157 < 1024 && Static336.anInt6217 < 768) {
				local200 = true;
			} else {
				local200 = false;
			}
		}
		if (arg4) {
			Static364.method5791(Static36.anInt2910);
		} else {
			Static343.aCanvas5.setSize(Static7.anInt157, Static336.anInt6217);
			if (Static383.aClass48_9 != null) {
				Static383.aClass48_9.method2471();
			}
			if (Static115.aFrame3 == local78) {
				local91 = Static115.aFrame3.getInsets();
				Static343.aCanvas5.setLocation(Static324.anInt5937 + local91.left, local91.top + Static275.anInt6176);
			} else {
				Static343.aCanvas5.setLocation(Static324.anInt5937, Static275.anInt6176);
			}
		}
		if (arg1 >= 2) {
			Static336.aBoolean455 = true;
		} else {
			Static336.aBoolean455 = false;
		}
		if (Static388.anInt7080 != -1) {
			Static357.method5625(true);
		}
		if (Static386.aClass226_4 != null && (Static121.anInt6774 == 30 || Static121.anInt6774 == 25)) {
			Static212.method3829();
		}
		for (local143 = 0; local143 < 100; local143++) {
			Static93.aBooleanArray10[local143] = true;
		}
		Static347.aBoolean459 = true;
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
	public static int method2881() {
		if ((double) Static20.aFloat51 == 3.0D) {
			return 37;
		} else if ((double) Static20.aFloat51 == 4.0D) {
			return 50;
		} else if ((double) Static20.aFloat51 == 6.0D) {
			return 75;
		} else if ((double) Static20.aFloat51 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
