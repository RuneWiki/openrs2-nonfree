import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public static int anInt609;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!l;")
	public static Interface9 anInterface9_5;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_20 = new Class211(107, 8);

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_21 = new Class211(103, 7);

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;IIIII)V")
	public static void method472(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt607 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static174.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class250 local35 = Static210.aClass250Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt607; local37++) {
							if (arg0.aClass2_Sub29Array2[local37] == local35.aClass2_Sub29_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub29Array2[arg0.anInt607++] = local35.aClass2_Sub29_2;
						if (arg0.anInt607 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt607; local7 < 4; local7++) {
			arg0.aClass2_Sub29Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method473() {
		Static26.aClass2_Sub13_Sub2_1.method3612();
		@Pc(15) int local15 = Static26.aClass2_Sub13_Sub2_1.method3615(8);
		@Pc(24) int local24;
		if (Static351.anInt5969 > local15) {
			for (local24 = local15; local24 < Static351.anInt5969; local24++) {
				Static146.anIntArray200[Static429.anInt6930++] = Static40.anIntArray84[local24];
			}
		}
		if (local15 > Static351.anInt5969) {
			throw new RuntimeException("gnpov1");
		}
		Static351.anInt5969 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(70) int local70 = Static40.anIntArray84[local24];
			@Pc(78) Class3_Sub4_Sub1_Sub1 local78 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) local70)).aClass3_Sub4_Sub1_Sub1_1;
			@Pc(85) int local85 = Static26.aClass2_Sub13_Sub2_1.method3615(1);
			if (local85 == 0) {
				Static40.anIntArray84[Static351.anInt5969++] = local70;
				local78.anInt4942 = Static266.anInt4392;
			} else {
				@Pc(105) int local105 = Static26.aClass2_Sub13_Sub2_1.method3615(2);
				if (local105 == 0) {
					Static40.anIntArray84[Static351.anInt5969++] = local70;
					local78.anInt4942 = Static266.anInt4392;
					Static25.anIntArray41[Static332.anInt5613++] = local70;
				} else {
					@Pc(151) int local151;
					@Pc(161) int local161;
					if (local105 == 1) {
						Static40.anIntArray84[Static351.anInt5969++] = local70;
						local78.anInt4942 = Static266.anInt4392;
						local151 = Static26.aClass2_Sub13_Sub2_1.method3615(3);
						local78.method2632(local151, 1);
						local161 = Static26.aClass2_Sub13_Sub2_1.method3615(1);
						if (local161 == 1) {
							Static25.anIntArray41[Static332.anInt5613++] = local70;
						}
					} else if (local105 == 2) {
						Static40.anIntArray84[Static351.anInt5969++] = local70;
						local78.anInt4942 = Static266.anInt4392;
						if (Static26.aClass2_Sub13_Sub2_1.method3615(1) == 1) {
							local151 = Static26.aClass2_Sub13_Sub2_1.method3615(3);
							local78.method2632(local151, 2);
							local161 = Static26.aClass2_Sub13_Sub2_1.method3615(3);
							local78.method2632(local161, 2);
						} else {
							local151 = Static26.aClass2_Sub13_Sub2_1.method3615(3);
							local78.method2632(local151, 0);
						}
						local151 = Static26.aClass2_Sub13_Sub2_1.method3615(1);
						if (local151 == 1) {
							Static25.anIntArray41[Static332.anInt5613++] = local70;
						}
					} else if (local105 == 3) {
						Static146.anIntArray200[Static429.anInt6930++] = local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!dk;)V")
	public static void method475(@OriginalArg(1) Class54 arg0) {
		Static357.aClass54_93 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method476() {
		Static212.aClass16Array2 = null;
		Static442.method5597(Static141.anInt2513, Static314.anInt5426, Static142.anInt2523, 0, -1, 0, 0, 0);
		if (Static212.aClass16Array2 != null) {
			Static283.method3766(-1412584499, Static428.anInt6929, Static43.anInt805, Static190.aClass16_9.anInt258, Static212.aClass16Array2, 0, Static141.anInt2513, 0, Static314.anInt5426);
			Static212.aClass16Array2 = null;
		}
	}
}
