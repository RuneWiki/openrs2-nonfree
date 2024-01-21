import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!nh;")
	public static Class62 aClass62_38;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_45 = new Class66(500);

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1257 = Static177.method3050("logo");

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1258 = Static177.method3050("cookiehost");

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1259 = Static177.method3050("<)4col>");

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1260 = Static177.method3050("Fallen lassen");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ff;III)V")
	public static void method2553(@OriginalArg(0) Class4_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class4_Sub7 local12;
		@Pc(27) Class4_Sub1_Sub1_Sub6 local27;
		if (arg2 < Static57.anInt1408) {
			local12 = Static28.aClass4_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass17_1 != null && local12.aClass17_1.aClass4_Sub1_Sub1_1 instanceof Class4_Sub1_Sub1_Sub6) {
				local27 = (Class4_Sub1_Sub1_Sub6) local12.aClass17_1.aClass4_Sub1_Sub1_1;
				Static51.method999(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static57.anInt1408) {
			local12 = Static28.aClass4_Sub7ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass17_1 != null && local12.aClass17_1.aClass4_Sub1_Sub1_1 instanceof Class4_Sub1_Sub1_Sub6) {
				local27 = (Class4_Sub1_Sub1_Sub6) local12.aClass17_1.aClass4_Sub1_Sub1_1;
				Static51.method999(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static57.anInt1408 && arg3 < Static84.anInt4112) {
			local12 = Static28.aClass4_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass17_1 != null && local12.aClass17_1.aClass4_Sub1_Sub1_1 instanceof Class4_Sub1_Sub1_Sub6) {
				local27 = (Class4_Sub1_Sub1_Sub6) local12.aClass17_1.aClass4_Sub1_Sub1_1;
				Static51.method999(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static57.anInt1408 || arg3 <= 0) {
			return;
		}
		local12 = Static28.aClass4_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass17_1 != null && local12.aClass17_1.aClass4_Sub1_Sub1_1 instanceof Class4_Sub1_Sub1_Sub6) {
			local27 = (Class4_Sub1_Sub1_Sub6) local12.aClass17_1.aClass4_Sub1_Sub1_1;
			Static51.method999(arg0, local27, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!sc;I)V")
	public static void method2554(@OriginalArg(0) Class4_Sub1_Sub7_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static84.anIntArray440.length; local9++) {
			Static84.anIntArray440[local9] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static84.anIntArray440[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(63) int local63;
		for (local32 = 0; local32 < 20; local32++) {
			for (local51 = 1; local51 < 255; local51++) {
				for (local55 = 1; local55 < 127; local55++) {
					local63 = (local51 << 7) + local55;
					Static85.anIntArray208[local63] = (Static84.anIntArray440[local63 - 128] + Static84.anIntArray440[local63 + 1] + Static84.anIntArray440[local63 + -1] + Static84.anIntArray440[local63 - -128]) / 4;
				}
			}
			@Pc(106) int[] local106 = Static84.anIntArray440;
			Static84.anIntArray440 = Static85.anIntArray208;
			Static85.anIntArray208 = local106;
		}
		if (arg0 == null) {
			return;
		}
		local51 = 0;
		for (local55 = 0; local55 < arg0.anInt3482; local55++) {
			for (local63 = 0; local63 < arg0.anInt3484; local63++) {
				if (arg0.aByteArray39[local51++] != 0) {
					@Pc(139) int local139 = arg0.anInt3485 + local63 + 16;
					@Pc(146) int local146 = arg0.anInt3487 + local55 + 16;
					@Pc(152) int local152 = (local146 << 7) + local139;
					Static84.anIntArray440[local152] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public static void method2555() {
		Static45.aClass66_23.method2218();
		Static180.aClass66_48.method2218();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBIII)V")
	public static void method2557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static59.anInt1457; local3++) {
			if (Static66.anIntArray165[local3] + Static121.anIntArray275[local3] > arg1 && Static121.anIntArray275[local3] < arg0 + arg1 && Static167.anIntArray362[local3] + Static180.anIntArray432[local3] > arg3 && arg2 + arg3 > Static167.anIntArray362[local3]) {
				Static50.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!h;B)Lclient!je;")
	public static Class4_Sub3 method2558(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(11) int local11 = arg0.method1253();
		@Pc(15) int local15 = arg0.method1253();
		@Pc(19) Class local19 = Static183.method1446(local15);
		try {
			@Pc(23) Class4_Sub3 local23 = (Class4_Sub3) local19.getDeclaredConstructor().newInstance();
			if (local23 != null) {
				local23.anInt4117 = local11;
				local23.anInt4114 = arg0.method1253();
				@Pc(44) int local44 = arg0.method1253();
				for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
					@Pc(54) int local54 = arg0.method1253();
					local23.method3157(local54, arg0);
				}
			}
			local23.method3148();
			return local23;
		} catch (@Pc(75) IllegalAccessException local75) {
			throw new RuntimeException();
		} catch (@Pc(80) InstantiationException local80) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)J")
	public static synchronized long method2559() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (Static124.aLong108 > local6) {
			Static41.aLong34 += Static124.aLong108 - local6;
		}
		Static124.aLong108 = local6;
		return local6 + Static41.aLong34;
	}
}
