import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!sea", name = "W", descriptor = "I")
	public static int anInt8894;

	@OriginalMember(owner = "client!sea", name = "cb", descriptor = "[Lclient!aga;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!sea", name = "gb", descriptor = "Lclient!hla;")
	public static Class3_Sub7_Sub10 aClass3_Sub7_Sub10_3;

	@OriginalMember(owner = "client!sea", name = "pb", descriptor = "Lclient!ula;")
	public static final Class379 aClass379_10 = new Class379("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!sea", name = "S", descriptor = "Lclient!ula;")
	public static final Class379 aClass379_11 = new Class379("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)I")
	public static int method7558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = 0;
		while (arg1 > 0) {
			local14 = arg0 & 0x1 | local14 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local14;
	}

	@OriginalMember(owner = "client!sea", name = "h", descriptor = "(B)V")
	public static void method7560() {
		@Pc(5) int local5 = 0;
		if (Static580.aClass3_Sub22_24.aClass21_Sub2_1.method1740() == 1) {
			local5 = 55;
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub27_1.method8320() == 0) {
			local5 |= 0x40;
		}
		Static79.method1741(local5);
		Static216.aClass53_3.method1529(local5);
		Static606.aClass62_2.method1886(local5);
		Static255.aClass14_1.method626(local5);
		Static381.aClass106_2.method2616(local5);
		Static182.method2885(local5);
		Static15.method523(local5);
		Static53.method1299(local5);
		Static295.method4101(local5);
		Static19.method616();
	}
}
