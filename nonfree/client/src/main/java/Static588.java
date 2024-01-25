import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!gv;BLclient!gv;)V")
	public static void method7903(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class23 arg1) {
		if (arg1.aClass23_68 != null) {
			arg1.method8588();
		}
		arg1.aClass23_68 = arg0.aClass23_68;
		arg1.aClass23_67 = arg0;
		arg1.aClass23_68.aClass23_67 = arg1;
		arg1.aClass23_67.aClass23_68 = arg1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIBII)V")
	public static void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static658.anInt10079 || arg2 < Static255.anInt4818) {
			return;
		}
		@Pc(22) boolean local22;
		if (arg1 < Static303.anInt9951) {
			arg1 = Static303.anInt9951;
			local22 = false;
		} else if (arg1 > Static408.anInt6951) {
			local22 = false;
			arg1 = Static408.anInt6951;
		} else {
			local22 = true;
		}
		@Pc(43) boolean local43;
		if (Static303.anInt9951 > arg0) {
			local43 = false;
			arg0 = Static303.anInt9951;
		} else if (Static408.anInt6951 < arg0) {
			local43 = false;
			arg0 = Static408.anInt6951;
		} else {
			local43 = true;
		}
		if (Static255.anInt4818 > arg3) {
			arg3 = Static255.anInt4818;
		} else {
			Static526.method7369(Static299.anIntArrayArray58[arg3++], arg0, arg1, arg4);
		}
		if (arg2 <= Static658.anInt10079) {
			Static526.method7369(Static299.anIntArrayArray58[arg2--], arg0, arg1, arg4);
		} else {
			arg2 = Static658.anInt10079;
		}
		@Pc(105) int local105;
		if (local22 && local43) {
			for (local105 = arg3; local105 <= arg2; local105++) {
				@Pc(151) int[] local151 = Static299.anIntArrayArray58[local105];
				local151[arg1] = local151[arg0] = arg4;
			}
		} else if (local22) {
			for (local105 = arg3; local105 <= arg2; local105++) {
				Static299.anIntArrayArray58[local105][arg1] = arg4;
			}
		} else if (local43) {
			for (local105 = arg3; local105 <= arg2; local105++) {
				Static299.anIntArrayArray58[local105][arg0] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	public static void method7906() {
		Static131.aClass279_13.method6638();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
	public static void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub6_Sub7 local14 = Static198.method3146((long) arg0, 17);
		local14.method1712();
		local14.anInt1790 = arg1;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V")
	public static void method7908() {
		if (Static353.aString79.toLowerCase().indexOf("microsoft") != -1) {
			Static349.anIntArray402[192] = 58;
			Static349.anIntArray402[223] = 28;
			Static349.anIntArray402[219] = 42;
			Static349.anIntArray402[221] = 43;
			Static349.anIntArray402[187] = 27;
			Static349.anIntArray402[190] = 72;
			Static349.anIntArray402[220] = 74;
			Static349.anIntArray402[191] = 73;
			Static349.anIntArray402[188] = 71;
			Static349.anIntArray402[186] = 57;
			Static349.anIntArray402[222] = 59;
			Static349.anIntArray402[189] = 26;
			return;
		}
		Static349.anIntArray402[59] = 57;
		Static349.anIntArray402[92] = 74;
		Static349.anIntArray402[61] = 27;
		Static349.anIntArray402[47] = 73;
		if (Static353.aMethod1 == null) {
			Static349.anIntArray402[222] = 59;
			Static349.anIntArray402[192] = 58;
		} else {
			Static349.anIntArray402[192] = 28;
			Static349.anIntArray402[520] = 59;
			Static349.anIntArray402[222] = 58;
		}
		Static349.anIntArray402[45] = 26;
		Static349.anIntArray402[46] = 72;
		Static349.anIntArray402[44] = 71;
		Static349.anIntArray402[93] = 43;
		Static349.anIntArray402[91] = 42;
	}
}
