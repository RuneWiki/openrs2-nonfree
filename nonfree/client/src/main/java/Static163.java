import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!tc", name = "ib", descriptor = "Lclient!e;")
	public static Class16 aClass16_5;

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1320 = Static161.method2971("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1321 = Static161.method2971("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1322 = Static161.method2971(")1j");

	@OriginalMember(owner = "client!tc", name = "tb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1324 = Static161.method2971("Type");

	@OriginalMember(owner = "client!tc", name = "ob", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1323 = aClass13_1324;

	@OriginalMember(owner = "client!tc", name = "wb", descriptor = "[I")
	public static int[] anIntArray432 = new int[4000];

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	public static void method2792() {
		try {
			if (Static45.aClass3_1 == null) {
				Static45.aClass3_1 = new Class3(aClass16_5, Static57.method1349(new Class13[] { Static90.aClass13_850, Static16.aClass13_255, Static103.aClass13_948 }).method877());
			} else {
				@Pc(39) byte[] local39 = Static45.aClass3_1.method81();
				if (local39 != null) {
					@Pc(46) Class1_Sub8 local46 = new Class1_Sub8(local39);
					Static119.anInt3131 = local46.method1642();
					Static16.aClass36Array1 = new Class36[Static119.anInt3131];
					for (@Pc(55) int local55 = 0; local55 < Static119.anInt3131; local55++) {
						@Pc(65) Class36 local65 = Static16.aClass36Array1[local55] = new Class36();
						@Pc(69) int local69 = local46.method1642();
						local65.aBoolean167 = (local69 & 0x8000) != 0;
						local65.anInt2134 = local69 & 0x7FFF;
						local65.aClass13_728 = local46.method1622();
						local65.anInt2133 = local46.method1627();
						local65.anInt2128 = local55;
						local65.anInt2132 = Static124.method2289(local65.aClass13_728);
					}
					Static137.method2459(Static16.aClass36Array1.length - 1, Static108.anIntArray290, 0, Static16.aClass36Array1, Static88.anIntArray241);
					Static45.aClass3_1 = null;
					Static95.aBoolean208 = true;
				}
			}
		} catch (@Pc(129) Exception local129) {
			local129.printStackTrace();
			Static45.aClass3_1 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ce;I)Lclient!df;")
	public static Class1_Sub1 method2795(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method1607();
		@Pc(18) int local18 = arg0.method1607();
		@Pc(22) Class local22 = Static44.method1173(local18);
		try {
			@Pc(26) Class1_Sub1 local26 = (Class1_Sub1) local22.getDeclaredConstructor().newInstance();
			if (local26 != null) {
				local26.anInt4096 = local9;
				local26.anInt4100 = arg0.method1607();
				@Pc(40) int local40 = arg0.method1607();
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(50) int local50 = arg0.method1607();
					local26.method3011(local50, arg0);
				}
			}
			local26.method3009();
			return local26;
		} catch (@Pc(69) IllegalAccessException local69) {
			throw new RuntimeException();
		} catch (@Pc(74) InstantiationException local74) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
	public static int method2796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!fd;B)Z")
	public static boolean method2800(@OriginalArg(0) Class20 arg0) {
		if (arg0.anIntArray162 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray162.length; local20++) {
			@Pc(27) int local27 = Static61.method1407(local20, arg0);
			@Pc(32) int local32 = arg0.anIntArray169[local20];
			if (arg0.anIntArray162[local20] == 2) {
				if (local32 <= local27) {
					return false;
				}
			} else if (arg0.anIntArray162[local20] == 3) {
				if (local32 >= local27) {
					return false;
				}
			} else if (arg0.anIntArray162[local20] == 4) {
				if (local27 == local32) {
					return false;
				}
			} else if (local32 != local27) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public static void method2803() {
		anIntArray432 = null;
		aClass16_5 = null;
		aClass13_1322 = null;
		aClass13_1324 = null;
		aClass13_1320 = null;
		aClass13_1321 = null;
		aClass13_1323 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
	public static void method2804() {
		for (@Pc(1) int local1 = 0; local1 < Static125.anInt3234; local1++) {
			@Pc(6) Class59 local6 = Static17.aClass59Array1[local1];
			Static73.method1540(local6);
			Static17.aClass59Array1[local1] = null;
		}
		Static125.anInt3234 = 0;
	}
}
