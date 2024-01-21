import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!la", name = "K", descriptor = "Lclient!jb;")
	public static Class37 aClass37_3;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_733 = Static109.method1737("(U5");

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_734 = Static109.method1737("sideicons");

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_735 = Static109.method1737("logo");

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[Lclient!lc;")
	public static Class3_Sub1_Sub4_Sub5[] aClass3_Sub1_Sub4_Sub5Array1 = new Class3_Sub1_Sub4_Sub5[4];

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!na;")
	private static Class53 aClass53_736 = Static109.method1737("From");

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_737 = Static109.method1737("Type");

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_738 = Static109.method1737("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!la", name = "B", descriptor = "I")
	public static final int anInt1659 = 2301979;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "I")
	public static int anInt1661 = -1;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "I")
	public static volatile int anInt1662 = 0;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "Lclient!na;")
	public static Class53 aClass53_739 = Static109.method1737("::gc");

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Lclient!na;")
	public static Class53 aClass53_740 = Static109.method1737("mapmarker");

	@OriginalMember(owner = "client!la", name = "M", descriptor = "Lclient!na;")
	public static Class53 aClass53_741 = aClass53_736;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "Lclient!na;")
	public static Class53 aClass53_742 = Static109.method1737("Handel)4Duell");

	@OriginalMember(owner = "client!la", name = "T", descriptor = "I")
	public static int anInt1668 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/awt/Component;ILclient!ba;)Lclient!fe;")
	public static Class1 method1127(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3) {
		if (Static38.anInt1141 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class1 local30 = (Class1) Class.forName("Class1_Sub2").getDeclaredConstructor().newInstance();
			local30.anIntArray263 = new int[(Static49.aBoolean48 ? 2 : 1) * 256];
			local30.anInt2003 = arg0;
			local30.method1389(arg1);
			local30.anInt2007 = (arg0 & 0xFFFFFC00) + 1024;
			if (local30.anInt2007 > 16384) {
				local30.anInt2007 = 16384;
			}
			local30.method1395(local30.anInt2007);
			if (Static96.anInt1447 > 0 && Static80.aClass69_1 == null) {
				Static80.aClass69_1 = new Class69();
				arg3.method122(Static80.aClass69_1, Static96.anInt1447);
			}
			if (Static80.aClass69_1 != null) {
				if (Static80.aClass69_1.aClass1Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static80.aClass69_1.aClass1Array1[arg2] = local30;
			}
			return local30;
		} catch (@Pc(102) Throwable local102) {
			try {
				@Pc(108) Class1_Sub1 local108 = new Class1_Sub1(arg3, arg2);
				local108.anInt2003 = arg0;
				local108.anIntArray263 = new int[(Static49.aBoolean48 ? 2 : 1) * 256];
				local108.method1389(arg1);
				local108.anInt2007 = 16384;
				local108.method1395(local108.anInt2007);
				if (Static96.anInt1447 > 0 && Static80.aClass69_1 == null) {
					Static80.aClass69_1 = new Class69();
					arg3.method122(Static80.aClass69_1, Static96.anInt1447);
				}
				if (Static80.aClass69_1 != null) {
					if (Static80.aClass69_1.aClass1Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static80.aClass69_1.aClass1Array1[arg2] = local108;
				}
				return local108;
			} catch (@Pc(164) Throwable local164) {
				return new Class1();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!we;Lclient!we;I)V")
	public static void method1128(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1) {
		Static101.aClass62_23 = arg0;
		Static77.aClass62_13 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public static void method1129() {
		aClass53_740 = null;
		aClass3_Sub1_Sub4_Sub5Array1 = null;
		aClass53_739 = null;
		aClass53_741 = null;
		aClass37_3 = null;
		aClass53_737 = null;
		aClass53_738 = null;
		aClass53_736 = null;
		aClass53_735 = null;
		aClass53_742 = null;
		aClass53_734 = null;
		aClass53_733 = null;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1130() {
		Static31.aClass75_27.method1724();
		Static125.aClass75_81.method1724();
		Static27.aClass75_22.method1724();
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
	public static void method1132() {
		if (Static36.anInt1122 < 2 && Static91.anInt2201 == 0 && !Static117.aBoolean119) {
			return;
		}
		@Pc(36) Class53 local36;
		if (Static91.anInt2201 == 1 && Static36.anInt1122 < 2) {
			local36 = Static103.method1689(new Class53[] { Static94.aClass53_1084, Static76.aClass53_854, Static5.aClass53_81, Static45.aClass53_579 });
		} else if (Static117.aBoolean119 && Static36.anInt1122 < 2) {
			local36 = Static103.method1689(new Class53[] { Static57.aClass53_672, Static76.aClass53_854, Static102.aClass53_1162, Static45.aClass53_579 });
		} else {
			local36 = Static99.aClass53Array17[Static36.anInt1122 - 1];
		}
		if (Static36.anInt1122 > 2) {
			local36 = Static103.method1689(new Class53[] { local36, Static54.aClass53_1424, Static108.method1725(Static36.anInt1122 - 2), Static23.aClass53_288 });
		}
		Static43.aClass3_Sub1_Sub5_Sub2_1.method740(local36, 4, 16777215, Static27.anInt843 / 1000);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method1134(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class3_Sub8 local8 = (Class3_Sub8) Static44.aClass77_6.method1803(); local8 != null; local8 = (Class3_Sub8) Static44.aClass77_6.method1802()) {
			if ((long) arg0 == (local8.aLong94 >> 48 & 0xFFFFL)) {
				local8.method1962();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)I")
	public static int method1135(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
