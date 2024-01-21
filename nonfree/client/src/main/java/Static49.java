import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_843 = Static72.method1077("");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_842 = aClass74_843;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!u;")
	private static Class74 aClass74_844 = Static72.method1077("Friends");

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_845 = Static72.method1077("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_846 = Static72.method1077("sch-Utteln:");

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_847 = aClass74_843;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_848 = aClass74_844;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!e;")
	public static Class16 aClass16_39 = new Class16(100);

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_849 = aClass74_843;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_850 = aClass74_843;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_851 = aClass74_843;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!u;")
	private static Class74 aClass74_852 = Static72.method1077("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_853 = aClass74_843;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_854 = aClass74_852;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_855 = Static72.method1077("Regelversto-8 melden");

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_856 = Static72.method1077("backleft1");

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!u;")
	private static Class74 aClass74_858 = Static72.method1077("Loading fonts )2 ");

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_857 = aClass74_858;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ve;)Z")
	public static boolean method798(@OriginalArg(1) Class2_Sub2_Sub17 arg0) {
		@Pc(2) int local2 = arg0.anInt2796;
		if (Static54.anInt1325 == 2) {
			if (local2 == 201) {
				Static36.anInt869 = 0;
				Static97.aClass74_1733 = Static97.aClass74_1736;
				Static121.anInt2602 = 1;
				Static55.aBoolean16 = true;
				Static29.aBoolean25 = true;
				Static97.aClass74_1726 = Static12.aClass74_332;
			}
			if (local2 == 202) {
				Static55.aBoolean16 = true;
				Static29.aBoolean25 = true;
				Static121.anInt2602 = 2;
				Static36.anInt869 = 0;
				Static97.aClass74_1733 = Static97.aClass74_1736;
				Static97.aClass74_1726 = Static91.aClass74_1310;
			}
		}
		if (local2 == 205) {
			Static21.anInt619 = 250;
			return true;
		}
		if (local2 == 501) {
			Static36.anInt869 = 0;
			Static55.aBoolean16 = true;
			Static97.aClass74_1726 = Static5.aClass74_50;
			Static121.anInt2602 = 4;
			Static29.aBoolean25 = true;
			Static97.aClass74_1733 = Static97.aClass74_1736;
		}
		if (local2 == 502) {
			Static121.anInt2602 = 5;
			Static29.aBoolean25 = true;
			Static55.aBoolean16 = true;
			Static97.aClass74_1733 = Static97.aClass74_1736;
			Static36.anInt869 = 0;
			Static97.aClass74_1726 = Static17.aClass74_440;
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (local2 >= 300 && local2 <= 313) {
			local94 = (local2 - 300) / 2;
			local98 = local2 & 0x1;
			Static109.aClass14_1.method440(local94, local98 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local94 = (local2 - 314) / 2;
			local98 = local2 & 0x1;
			Static109.aClass14_1.method442(local98 == 1, local94);
		}
		if (local2 == 324) {
			Static109.aClass14_1.method446(false);
		}
		if (local2 == 325) {
			Static109.aClass14_1.method446(true);
		}
		if (local2 == 326) {
			Static128.aClass2_Sub10_Sub1_3.method1533(171);
			Static109.aClass14_1.method445(Static128.aClass2_Sub10_Sub1_3);
			return true;
		}
		if (local2 == 620) {
			Static105.aBoolean98 = !Static105.aBoolean98;
		}
		if (local2 >= 601 && local2 <= 613) {
			Static80.method1255();
			if (Static97.aClass74_1722.method1695() > 0) {
				Static128.aClass2_Sub10_Sub1_3.method1533(43);
				Static128.aClass2_Sub10_Sub1_3.method1495(Static97.aClass74_1722.method1696());
				Static128.aClass2_Sub10_Sub1_3.method1486(local2 - 601);
				Static128.aClass2_Sub10_Sub1_3.method1486(Static105.aBoolean98 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method799() {
		aClass74_847 = null;
		aClass74_855 = null;
		aClass74_846 = null;
		aClass74_858 = null;
		aClass74_857 = null;
		aClass74_849 = null;
		aClass74_852 = null;
		aClass74_850 = null;
		aClass74_853 = null;
		aClass74_842 = null;
		aClass74_848 = null;
		aClass74_844 = null;
		aClass74_843 = null;
		aClass74_845 = null;
		aClass74_854 = null;
		aClass74_851 = null;
		aClass16_39 = null;
		aClass74_856 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!g;II)[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] method800(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static65.method1010(arg0, arg2, arg1) ? Static101.method1552() : null;
	}
}
