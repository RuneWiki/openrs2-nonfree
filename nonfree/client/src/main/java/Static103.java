import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_66;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!ec;")
	private static Class22 aClass22_769 = Static60.method1113("FULL");

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
	public static int[] anIntArray292 = new int[5];

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Lclient!ec;")
	private static Class22 aClass22_773 = Static60.method1113("scroll:");

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_770 = aClass22_773;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public static int anInt2622 = 0;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_14 = null;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_771 = aClass22_769;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_772 = aClass22_773;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "[I")
	public static int[] anIntArray294 = new int[100];

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_774 = Static60.method1113("M");

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_775 = Static60.method1113("Angreifen");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI[B)I")
	public static int method1717(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static121.method1880(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	public static void method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static99.anInt2589 < 2 && Static104.anInt2636 == 0 && !Static128.aBoolean274) {
			return;
		}
		@Pc(47) Class22 local47;
		if (Static104.anInt2636 == 1 && Static99.anInt2589 < 2) {
			local47 = Static44.method856(new Class22[] { Static35.aClass22_246, Static95.aClass22_537, Static43.aClass22_290, Static48.aClass22_321 });
		} else if (Static128.aBoolean274 && Static99.anInt2589 < 2) {
			local47 = Static44.method856(new Class22[] { Static124.aClass22_927, Static95.aClass22_537, Static12.aClass22_80, Static48.aClass22_321 });
		} else {
			local47 = Static92.method1620(Static99.anInt2589 - 1);
		}
		if (Static99.anInt2589 > 2) {
			local47 = Static44.method856(new Class22[] { local47, Static30.aClass22_193, Static134.method2042(Static99.anInt2589 - 2), Static97.aClass22_746 });
		}
		Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1402(local47, arg1 + 4, arg0 + 15, Static117.anInt2877 / 1000);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZ)Lclient!ec;")
	public static Class22 method1719(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(15) int local15 = 1;
		@Pc(23) int local23 = arg0 / 10;
		while (local23 != 0) {
			local23 /= 10;
			local15++;
		}
		@Pc(37) int local37 = local15;
		if (arg0 < 0 || arg1) {
			local37 = local15 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local37];
		if (arg0 < 0) {
			local48[0] = 45;
		} else if (arg1) {
			local48[0] = 43;
		}
		for (@Pc(67) int local67 = 0; local67 < local15; local67++) {
			@Pc(73) int local73 = arg0 % 10;
			arg0 /= 10;
			if (local73 < 0) {
				local73 = -local73;
			}
			if (local73 > 9) {
				local73 += 39;
			}
			local48[local37 - local67 - 1] = (byte) (local73 + 48);
		}
		@Pc(111) Class22 local111 = new Class22();
		local111.anInt668 = local37;
		local111.aByteArray7 = local48;
		return local111;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public static void method1720() {
		aClass22_773 = null;
		aClass22_771 = null;
		aClass22_772 = null;
		aClass22_769 = null;
		anIntArray292 = null;
		aClass4_Sub7_14 = null;
		aClass22_770 = null;
		anIntArray294 = null;
		aClass20_Sub1_66 = null;
		aClass22_774 = null;
		anIntArray293 = null;
		aClass22_775 = null;
	}
}
