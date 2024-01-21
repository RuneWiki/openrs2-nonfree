import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
	public static int[] anIntArray305 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public static int anInt2785 = 0;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
	public static int[] anIntArray306 = new int[500];

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!ec;")
	public static Class22 aClass22_866 = Static60.method1113("swe");

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_867 = Static60.method1113("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_868 = Static60.method1113(" <col=00ff80>");

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!ec;")
	private static Class22 aClass22_869 = Static60.method1113("Examine");

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_870 = aClass22_869;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_871 = Static60.method1113("<col=ff3000>");

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_872 = Static60.method1113("(U5");

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	public static int anInt2788 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!b;IZ)V")
	public static void method1800(@OriginalArg(0) Class6 arg0, @OriginalArg(2) boolean arg1) {
		if (Static4.aClass6_1 != null) {
			try {
				Static4.aClass6_1.method136();
			} catch (@Pc(8) Exception local8) {
			}
			Static4.aClass6_1 = null;
		}
		Static4.aClass6_1 = arg0;
		Static78.method1298(arg1);
		Static50.aClass4_Sub11_1.anInt1099 = 0;
		Static33.anInt842 = 0;
		Static88.aClass4_Sub11_2 = null;
		Static126.aClass4_Sub1_Sub11_1 = null;
		while (true) {
			@Pc(37) Class4_Sub1_Sub11 local37 = (Class4_Sub1_Sub11) Static93.aClass81_13.method2017();
			if (local37 == null) {
				while (true) {
					local37 = (Class4_Sub1_Sub11) Static27.aClass81_3.method2017();
					if (local37 == null) {
						if (Static76.aByte3 != 0) {
							try {
								@Pc(89) Class4_Sub11 local89 = new Class4_Sub11(4);
								local89.method701(4);
								local89.method701(Static76.aByte3);
								local89.method700(0);
								Static4.aClass6_1.method133(local89.aByteArray9, 4);
							} catch (@Pc(110) IOException local110) {
								try {
									Static4.aClass6_1.method136();
								} catch (@Pc(115) Exception local115) {
								}
								Static4.aClass6_1 = null;
								Static50.anInt1407++;
							}
						}
						Static111.anInt2753 = 0;
						Static114.aLong85 = Static44.method861();
						return;
					}
					Static105.aClass78_2.method1972(local37);
					Static110.aClass81_14.method2015(local37.aLong99, local37);
					Static29.anInt686++;
					Static55.anInt1109--;
				}
			}
			Static79.aClass81_10.method2015(local37.aLong99, local37);
			Static133.anInt3145++;
			Static53.anInt1498--;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method1801() {
		aClass22_866 = null;
		aClass22_868 = null;
		Class72.anIntArray307 = null;
		anIntArray305 = null;
		aClass22_869 = null;
		aShortArrayArray3 = null;
		anIntArray306 = null;
		aClass22_870 = null;
		aClass22_871 = null;
		aClass22_867 = null;
		aClass22_872 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method1802(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static72.method1188(local13) : local13;
		} else if (arg1 instanceof Class8) {
			@Pc(32) Class8 local32 = (Class8) arg1;
			return local32.method152();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method1803() {
		@Pc(5) int local5 = Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1392(Static5.aClass22_40);
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < Static99.anInt2589; local7++) {
			local15 = Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1392(Static92.method1620(local7));
			if (local15 > local5) {
				local5 = local15;
			}
		}
		Static91.anInt2422 = Static99.anInt2589 * 15 + 22;
		local5 += 8;
		Static22.aBoolean250 = true;
		local15 = Static99.anInt2589 * 15 + 21;
		@Pc(62) int local62 = Static8.anInt2382 - local5 / 2;
		Static39.anInt974 = local5;
		@Pc(66) int local66 = Static55.anInt1118;
		if (local5 + local62 > 765) {
			local62 = 765 - local5;
		}
		if (local66 + local15 > 503) {
			local66 = 503 - local15;
		}
		if (local66 < 0) {
			local66 = 0;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		Static101.anInt2612 = local66;
		Static31.anInt801 = local62;
	}
}
