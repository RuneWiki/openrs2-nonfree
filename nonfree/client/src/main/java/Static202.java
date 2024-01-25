import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_63 = new Class57("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!li", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!li", name = "t", descriptor = "[S")
	public static final short[] aShortArray63 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method3147(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(2, arg0);
		local13.method3219();
		local13.aString37 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lclient!wm;")
	public static Class28_Sub4 method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub4_2;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!nm;Z)Z")
	public static boolean method3149(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static337.aClass7Array3 == Static25.aClass7Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5188();
		if (arg0.aShort89 < 0 || arg0.aShort87 < 0 || arg0.aShort88 >= Static44.anInt791 || arg0.aShort90 >= Static103.anInt2050) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort89; local34 <= arg0.aShort88; local34++) {
			for (local38 = arg0.aShort87; local38 <= arg0.aShort90; local38++) {
				@Pc(45) Class48 local45 = Static382.method5674(arg0.aByte73, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort89) {
						local49++;
					}
					if (local34 < arg0.aShort88) {
						local49 += 4;
					}
					if (local38 > arg0.aShort87) {
						local49 += 8;
					}
					if (local38 < arg0.aShort90) {
						local49 += 2;
					}
					@Pc(74) Class50 local74 = Static4.method84(local49, arg0);
					@Pc(77) Class50 local77 = local45.aClass50_1;
					if (local77 == null) {
						local45.aClass50_1 = local74;
					} else {
						while (local77.aClass50_2 != null) {
							local77 = local77.aClass50_2;
						}
						local77.aClass50_2 = local74;
					}
					local45.aByte13 = (byte) (local45.aByte13 | local49);
					if (local6 && (Static185.anIntArrayArray35[local34][local38] & 0xFF000000) != 0) {
						local8 = Static185.anIntArrayArray35[local34][local38];
						local10 = Static278.aByteArrayArray17[local34][local38];
						local12 = Static231.aByteArrayArray14[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort89; local38 <= arg0.aShort88; local38++) {
				for (@Pc(150) int local150 = arg0.aShort87; local150 <= arg0.aShort90; local150++) {
					if ((Static185.anIntArrayArray35[local38][local150] & 0xFF000000) == 0) {
						Static185.anIntArrayArray35[local38][local150] = local8;
						Static278.aByteArrayArray17[local38][local150] = local10;
						Static231.aByteArrayArray14[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static316.aClass28_Sub1Array2[Static30.anInt545++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
	public static void method3159() {
		@Pc(7) int local7 = Static366.anInt4870;
		@Pc(9) int[] local9 = Static3.anIntArray9;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class28_Sub1_Sub1_Sub2 local19 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt4318 > 0) {
				local19.anInt4318--;
				if (local19.anInt4318 == 0) {
					local19.aString49 = null;
				}
			}
		}
		for (@Pc(46) int local46 = 0; local46 < Static23.anInt305; local46++) {
			@Pc(52) int local52 = Static369.anIntArray664[local46];
			@Pc(56) Class28_Sub1_Sub1_Sub1 local56 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local52];
			if (local56 != null && local56.anInt4318 > 0) {
				local56.anInt4318--;
				if (local56.anInt4318 == 0) {
					local56.aString49 = null;
				}
			}
		}
	}
}
