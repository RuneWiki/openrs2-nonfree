import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array54;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt2969 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	public static int anInt2976 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method2068() {
		@Pc(14) int local14;
		for (@Pc(7) int local7 = -1; local7 < Static65.anInt1689; local7++) {
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static99.anIntArray243[local7];
			}
			@Pc(24) Class2_Sub1_Sub4_Sub2_Sub2 local24 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local14];
			if (local24 != null && local24.anInt2197 > 0) {
				local24.anInt2197--;
				if (local24.anInt2197 == 0) {
					local24.aClass36_1023 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static108.anInt2775; local14++) {
			@Pc(60) int local60 = Static51.anIntArray316[local14];
			@Pc(64) Class2_Sub1_Sub4_Sub2_Sub1 local64 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local60];
			if (local64 != null && local64.anInt2197 > 0) {
				local64.anInt2197--;
				if (local64.anInt2197 == 0) {
					local64.aClass36_1023 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method2069() {
		for (@Pc(16) Class2_Sub8 local16 = (Class2_Sub8) Static39.aClass8_2.method175(); local16 != null; local16 = (Class2_Sub8) Static39.aClass8_2.method173()) {
			if (local16.anInt1108 == -1) {
				local16.anInt1113 = 0;
				Static62.method1118(local16);
			} else {
				local16.method2073();
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public static void method2071() {
		aClass2_Sub1_Sub1_Sub1Array54 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!r;")
	public static Class2_Sub1_Sub13 method2072(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static62.aClass22_24.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static46.aClass3_12.method928(arg0, 6);
		local10 = new Class2_Sub1_Sub13();
		local10.anInt2317 = arg0;
		if (local27 != null) {
			local10.method1627(new Class2_Sub12(local27));
		}
		local10.method1637();
		if (local10.aBoolean99) {
			local10.aBoolean103 = false;
			local10.aBoolean95 = false;
		}
		Static62.aClass22_24.method712(local10, (long) arg0);
		return local10;
	}
}
