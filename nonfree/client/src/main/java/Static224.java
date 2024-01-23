import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt4442;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!t;")
	public static Interface5 anInterface5_1;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!bh;")
	public static Class15 aClass15_7;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public static int anInt4445 = 0;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "[I")
	public static int[] anIntArray398 = new int[14];

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString144 = "Select";

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIII)V")
	public static void method3574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > arg3) {
			Static129.method2127(arg1, arg3, arg0, Static234.anIntArrayArray40[arg2]);
		} else {
			Static129.method2127(arg3, arg1, arg0, Static234.anIntArrayArray40[arg2]);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)Lclient!kg;")
	public static Class4_Sub2_Sub12_Sub1 method3575(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub2_Sub12_Sub1 local6 = (Class4_Sub2_Sub12_Sub1) Static95.aClass33_14.method841((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static197.aClass98_116.method2396(0, arg0);
		local6 = new Class4_Sub2_Sub12_Sub1(local20);
		local6.method4199(Static88.aClass59Array2, null);
		Static95.aClass33_14.method845(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(ZI)I")
	public static int method3576(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
	public static void method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static261.method3958(false);
		Static63.anInt1188 = arg2;
		Static28.anInt530 = arg0;
		Static246.method4394(arg1);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method3581() {
		Static145.aClass33_24.method839();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method3582() {
		aClass15_7 = null;
		anInterface5_1 = null;
		aString144 = null;
		anIntArray398 = null;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public static void method3583() {
		for (@Pc(7) int local7 = -1; local7 < Static41.anInt856; local7++) {
			@Pc(21) int local21;
			if (local7 == -1) {
				local21 = 2047;
			} else {
				local21 = Static85.anIntArray179[local7];
			}
			@Pc(31) Class12_Sub3_Sub2 local31 = Static257.aClass12_Sub3_Sub2Array1[local21];
			if (local31 != null) {
				Static197.method3084(local31.method3375(), local31);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)V")
	public static void method3584(@OriginalArg(0) boolean arg0) {
		@Pc(19) byte local19;
		@Pc(17) byte[][] local17;
		if (Static178.aBoolean216 && arg0) {
			local19 = 1;
			local17 = Static207.aByteArrayArray17;
		} else {
			local17 = Static249.aByteArrayArray19;
			local19 = 4;
		}
		@Pc(28) int local28 = local17.length;
		@Pc(30) int local30;
		@Pc(55) int local55;
		for (local30 = 0; local30 < local28; local30++) {
			@Pc(39) int[] local39 = null;
			@Pc(43) byte[] local43 = local17[local30];
			@Pc(49) int local49 = Static262.anIntArray442[local30] >> 8;
			local55 = Static262.anIntArray442[local30] & 0xFF;
			@Pc(62) int local62 = local49 * 64 - Static170.anInt3385;
			@Pc(69) int local69 = local55 * 64 - Static239.anInt4613;
			if (local43 != null) {
				Static81.method3275();
				local39 = Static197.method3081(Static121.aClass63Array1, Static239.anInt4613, Static170.anInt3385, arg0, local69, local62, local43);
			}
			if (!arg0 && local49 == Static25.anInt450 / 8 && local55 == Static257.anInt4842 / 8) {
				if (local39 == null) {
					Static1.anInt4 = -1;
				} else {
					Static185.anInt3643 = local39[3];
					Static231.anInt4521 = local39[2];
					Static49.anInt1022 = local39[1];
					Static1.anInt4 = local39[0];
					Static11.anInt205 = local39[4];
				}
			}
		}
		for (local30 = 0; local30 < local28; local30++) {
			@Pc(150) int local150 = (Static262.anIntArray442[local30] >> 8) * 64 - Static170.anInt3385;
			@Pc(161) int local161 = (Static262.anIntArray442[local30] & 0xFF) * 64 - Static239.anInt4613;
			@Pc(165) byte[] local165 = local17[local30];
			if (local165 == null && Static257.anInt4842 < 800) {
				Static81.method3275();
				for (local55 = 0; local55 < local19; local55++) {
					Static255.method3838(64, local161, local150, 64, local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3585(@OriginalArg(0) String arg0) {
		return Static98.method1592(10, arg0);
	}
}
