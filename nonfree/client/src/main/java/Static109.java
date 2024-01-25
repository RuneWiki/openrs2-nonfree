import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!eba", name = "v", descriptor = "Lclient!ni;")
	public static Class226 aClass226_3;

	@OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
	public static int anInt2480;

	@OriginalMember(owner = "client!eba", name = "z", descriptor = "[I")
	public static final int[] anIntArray196 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!eba", name = "B", descriptor = "Lclient!uba;")
	public static Class6_Sub47 aClass6_Sub47_1 = null;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method2238(@OriginalArg(1) Class9 arg0) {
		if (Static205.anInt4369 < 2 && !Static25.aBoolean80 || Static122.aClass93_7 != null) {
			return;
		}
		@Pc(39) String local39;
		if (Static25.aBoolean80 && Static205.anInt4369 < 2) {
			local39 = Static467.aString104 + Static222.aClass152_77.method4002(Static286.anInt5468) + Static568.aString113 + " ->";
		} else if (Static478.aBoolean650 && Static387.aClass273_1.method6617(81) && Static205.anInt4369 > 2) {
			local39 = Static84.method1839((Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284.aClass6_284);
		} else {
			@Pc(35) Class6_Sub42 local35 = (Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284;
			local39 = Static84.method1839(local35);
			@Pc(41) int[] local41 = null;
			if (Static394.method6227(local35.anInt8285)) {
				local41 = Static98.aClass203_1.method4899((int) local35.aLong200).anIntArray288;
			} else if (local35.anInt8289 != -1) {
				local41 = Static98.aClass203_1.method4899(local35.anInt8289).anIntArray288;
			} else if (Static390.method6168(local35.anInt8285)) {
				@Pc(119) Class6_Sub33 local119 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local35.aLong200);
				if (local119 != null) {
					@Pc(124) Class11_Sub1_Sub1_Sub1 local124 = local119.aClass11_Sub1_Sub1_Sub1_2;
					@Pc(127) Class222 local127 = local124.aClass222_1;
					if (local127.anIntArray464 != null) {
						local127 = local127.method5329(Static435.aClass234_1);
					}
					if (local127 != null) {
						local41 = local127.anIntArray463;
					}
				}
			} else if (Static472.method5255(local35.anInt8285)) {
				@Pc(88) Class31 local88;
				if (local35.anInt8285 == 1009) {
					local88 = Static480.aClass57_11.method1469((int) local35.aLong200);
				} else {
					local88 = Static480.aClass57_11.method1469((int) (local35.aLong200 >>> 32 & 0x7FFFFFFFL));
				}
				if (local88.anIntArray69 != null) {
					local88 = local88.method1029(Static435.aClass234_1);
				}
				if (local88 != null) {
					local41 = local88.anIntArray72;
				}
			}
			if (local41 != null) {
				local39 = local39 + Static506.method7533(local41);
			}
		}
		if (Static205.anInt4369 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static205.anInt4369 - 2) + Static222.aClass152_70.method4002(Static286.anInt5468);
		}
		if (Static361.aClass93_11 != null) {
			@Pc(254) Class73 local254 = Static361.aClass93_11.method2493(arg0);
			if (local254 == null) {
				local254 = Static489.aClass73_5;
			}
			local254.method7884(local39, Static229.anInt4757, Static451.aClass66Array11, Static361.aClass93_11.anInt2787, Static361.aClass93_11.anInt2738, Static361.aClass93_11.anInt2777, Static361.aClass93_11.anInt2821, Static235.anIntArray314, Static406.anInt9844, Static21.anInt892, Static240.aRandom3, Static361.aClass93_11.lb, Static150.anIntArray525, Static361.aClass93_11.anInt2785);
			Static550.method7860(Static150.anIntArray525[2], Static150.anIntArray525[1], Static150.anIntArray525[3], Static150.anIntArray525[0]);
		} else if (Static166.aClass93_10 != null && Static38.aClass162_1 == Static476.aClass162_3) {
			@Pc(234) int local234 = Static489.aClass73_5.method7881(Static451.aClass66Array11, Static235.anIntArray314, local39, Static240.aRandom3, Static499.anInt8902 + 16, Static430.anInt867 + 4, Static21.anInt892);
			Static550.method7860(local234 + Static1.aClass82_1.method2292(local39), Static499.anInt8902, 16, Static430.anInt867 + 4);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	public static void method2239() {
		@Pc(5) Class245 local5 = Static428.aClass245_59;
		synchronized (Static428.aClass245_59) {
			Static428.aClass245_59.method6076();
		}
		local5 = Static180.aClass245_33;
		synchronized (Static180.aClass245_33) {
			Static180.aClass245_33.method6076();
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
	public static void method2240() {
		Static86.method1939(Static104.aClass6_Sub6_Sub1_4.anInt1162);
		@Pc(18) int local18 = (Static86.anInt2132 >> 12) + (Static191.anInt4147 >> 3);
		@Pc(26) int local26 = (Static390.anInt7318 >> 12) + (Static247.anInt5049 >> 3);
		Static493.anInt8836 = Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 = 0;
		Static350.aClass11_Sub1_Sub1_Sub2_4.method6232(8, 8);
		Static388.anIntArrayArray49 = new int[18][4];
		Static106.anIntArray185 = new int[18];
		Static204.anIntArray282 = new int[18];
		Static325.aByteArrayArray21 = new byte[18][];
		Static61.aByteArrayArray4 = new byte[18][];
		Static150.anIntArray523 = new int[18];
		Static69.aByteArrayArray5 = new byte[18][];
		Static341.anIntArray470 = new int[18];
		Static422.anIntArray560 = new int[18];
		Static74.aByteArrayArray30 = new byte[18][];
		Static224.anIntArray302 = new int[18];
		Static22.aByteArrayArray1 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(102) int local102;
		for (@Pc(91) int local91 = (local18 - (Static228.anInt4746 >> 4)) / 8; local91 <= ((Static228.anInt4746 >> 4) + local18) / 8; local91++) {
			for (local102 = (local26 - (Static44.anInt1275 >> 4)) / 8; local102 <= (local26 + (Static44.anInt1275 >> 4)) / 8; local102++) {
				@Pc(110) int local110 = local102 + (local91 << 8);
				Static341.anIntArray470[local77] = local110;
				Static106.anIntArray185[local77] = Static257.aClass168_64.method4432("m" + local91 + "_" + local102);
				Static204.anIntArray282[local77] = Static257.aClass168_64.method4432("l" + local91 + "_" + local102);
				Static150.anIntArray523[local77] = Static257.aClass168_64.method4432("n" + local91 + "_" + local102);
				Static224.anIntArray302[local77] = Static257.aClass168_64.method4432("um" + local91 + "_" + local102);
				Static422.anIntArray560[local77] = Static257.aClass168_64.method4432("ul" + local91 + "_" + local102);
				if (Static150.anIntArray523[local77] == -1) {
					Static106.anIntArray185[local77] = -1;
					Static204.anIntArray282[local77] = -1;
					Static224.anIntArray302[local77] = -1;
					Static422.anIntArray560[local77] = -1;
				}
				local77++;
			}
		}
		for (local102 = local77; local102 < Static150.anIntArray523.length; local102++) {
			Static150.anIntArray523[local102] = -1;
			Static106.anIntArray185[local102] = -1;
			Static204.anIntArray282[local102] = -1;
			Static224.anIntArray302[local102] = -1;
			Static422.anIntArray560[local102] = -1;
		}
		@Pc(278) byte local278;
		if (Static325.anInt6149 == 3) {
			local278 = 4;
		} else {
			local278 = 8;
		}
		Static120.method2369(local18, false, local26, local278);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(II)I")
	public static int method2241(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
