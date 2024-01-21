import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[Lclient!jc;")
	public static Class47[] aClass47Array10;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_14;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_965 = Static161.method2452("Die Verbindung konnte");

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_27 = new Class8(100);

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public static int anInt2649 = 0;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_966 = Static161.method2452("Fri");

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_967 = Static161.method2452("Thu");

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_968 = Static161.method2452("Sun");

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_969 = Static161.method2452("Mon");

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_970 = Static161.method2452("Wed");

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_971 = Static161.method2452("Tue");

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_972 = Static161.method2452("Sat");

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array23 = new Class20[] { aClass20_968, aClass20_969, aClass20_971, aClass20_970, aClass20_967, aClass20_966, aClass20_972 };

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Lclient!nh;")
	public static Class73 method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass73_1 == null ? null : local7.aClass73_1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1971() {
		for (@Pc(3) int local3 = 0; local3 < Static17.anInt347; local3++) {
			@Pc(14) int local14 = Static188.anIntArray395[local3];
			@Pc(18) Class1_Sub2_Sub2 local18 = Static6.aClass1_Sub2_Sub2Array1[local14];
			@Pc(22) int local22 = Static10.aClass5_Sub6_Sub1_1.method3062();
			if ((local22 & 0x8) != 0) {
				local22 += Static10.aClass5_Sub6_Sub1_1.method3062() << 8;
			}
			Static110.method1756(local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1972() {
		Static123.aClass8_26.method233();
		aClass8_27.method233();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)I")
	public static int method1974(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
