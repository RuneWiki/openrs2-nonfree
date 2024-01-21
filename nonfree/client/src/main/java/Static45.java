import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array31;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_8;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!sc;")
	private static Class66 aClass66_776 = Static106.method1849("Loading title screen )2 ");

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_771 = aClass66_776;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_773 = Static106.method1849("Unexpected server response)3");

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_772 = aClass66_773;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt1444 = 0;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_774 = Static106.method1849("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_775 = Static106.method1849("<col=80ff00>");

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "[I")
	public static int[] anIntArray216 = new int[] { 6, 0, 0, 0, 6, 0, 0, 11, 3, 0, 0, 0, 0, 0, 2, 4, 0, 0, 0, 6, 0, 0, 0, 0, 6, 0, 2, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 4, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, -2, 0, 0, 0, 5, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 5, 2, -2, 0, 0, 7, 0, -2, 0, 0, 3, 2, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, -2, 0, 10, 10, 0, 0, 0, 0, 6, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, -2, 0, 11, 0, 0, 1, 0, 7, -2, 0, 0, 3, 0, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 24, 0, 7, 2, 0, 0, -1, 3, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, -2, 0, 0 };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method1019() {
		Static101.anInt2503 = 0;
		Static77.anInt2149 = 0;
		Static120.method1965();
		Static32.method622();
		Static5.method161();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static77.anInt2149; local17++) {
			local23 = Static101.anIntArray421[local17];
			if (Static22.anInt636 != Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local23].anInt1285) {
				Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local23].aClass1_Sub1_Sub5_1 = null;
				Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local23] = null;
			}
		}
		if (Static133.aClass1_Sub12_Sub1_3.anInt1694 != Static105.anInt2602) {
			throw new RuntimeException("gnp1 pos:" + Static133.aClass1_Sub12_Sub1_3.anInt1694 + " psize:" + Static105.anInt2602);
		}
		for (local23 = 0; local23 < Static33.anInt854; local23++) {
			if (Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[Static54.anIntArray248[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static33.anInt854);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method1020() {
		aClass66_774 = null;
		aClass66_776 = null;
		aClass66_773 = null;
		aClass1_Sub1_Sub2_Sub1Array31 = null;
		aClass1_Sub10_8 = null;
		anIntArray216 = null;
		aClass66_775 = null;
		aClass66_771 = null;
		aClass66_772 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/awt/Component;ILclient!bb;I)Lclient!nb;")
	public static Class24 method1021(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) int arg3) {
		if (Static39.anInt1014 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class24 local38 = (Class24) Class.forName("Class24_Sub2").getDeclaredConstructor().newInstance();
			local38.anIntArray344 = new int[(Static59.aBoolean73 ? 2 : 1) * 256];
			local38.anInt2144 = arg1;
			local38.method1460(arg0);
			local38.anInt2142 = (arg1 & -1024) + 1024;
			if (local38.anInt2142 > 16384) {
				local38.anInt2142 = 16384;
			}
			local38.method1466(local38.anInt2142);
			if (Static57.anInt1797 > 0 && Static66.aClass14_2 == null) {
				Static66.aClass14_2 = new Class14();
				Static66.aClass14_2.aClass7_1 = arg2;
				arg2.method285(Static66.aClass14_2, Static57.anInt1797);
			}
			if (Static66.aClass14_2 != null) {
				if (Static66.aClass14_2.aClass24Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static66.aClass14_2.aClass24Array1[arg3] = local38;
			}
			return local38;
		} catch (@Pc(112) Throwable local112) {
			try {
				@Pc(123) Class24_Sub1 local123 = new Class24_Sub1(arg2, arg3);
				local123.anInt2144 = arg1;
				local123.anIntArray344 = new int[(Static59.aBoolean73 ? 2 : 1) * 256];
				local123.method1460(arg0);
				local123.anInt2142 = 16384;
				local123.method1466(local123.anInt2142);
				if (Static57.anInt1797 > 0 && Static66.aClass14_2 == null) {
					Static66.aClass14_2 = new Class14();
					Static66.aClass14_2.aClass7_1 = arg2;
					arg2.method285(Static66.aClass14_2, Static57.anInt1797);
				}
				if (Static66.aClass14_2 != null) {
					if (Static66.aClass14_2.aClass24Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static66.aClass14_2.aClass24Array1[arg3] = local123;
				}
				return local123;
			} catch (@Pc(187) Throwable local187) {
				return new Class24();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Lclient!sc;")
	public static Class66 method1022(@OriginalArg(0) int arg0) {
		return Static41.method897(new Class66[] { Static88.method1632(arg0 >> 24 & 0xFF), Static9.aClass66_223, Static88.method1632(arg0 >> 16 & 0xFF), Static9.aClass66_223, Static88.method1632(arg0 >> 8 & 0xFF), Static9.aClass66_223, Static88.method1632(arg0 & 0xFF) });
	}
}
