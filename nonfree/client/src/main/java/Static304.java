import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Lclient!mo;")
	public static Class143 aClass143_106;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString218 = "Cancel";

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public static int anInt5859 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5305(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static280.method5743(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static302.anInt5838; local21++) {
			@Pc(29) String local29 = Static280.method5743(Static120.aStringArray36[local21]);
			if (local29 != null && local29.equals(local12)) {
				Static302.anInt5838--;
				for (@Pc(41) int local41 = local21; local41 < Static302.anInt5838; local41++) {
					Static120.aStringArray36[local41] = Static120.aStringArray36[local41 + 1];
					Static339.aStringArray34[local41] = Static339.aStringArray34[local41 + 1];
					Static54.anIntArray81[local41] = Static54.anIntArray81[local41 + 1];
					Static156.aStringArray70[local41] = Static156.aStringArray70[local41 + 1];
					Static202.anIntArray354[local41] = Static202.anIntArray354[local41 + 1];
					Static181.aBooleanArray16[local41] = Static181.aBooleanArray16[local41 + 1];
				}
				Static342.anInt6538 = Static348.anInt5338;
				Static164.aClass14_Sub4_Sub2_3.method2557(197);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(arg0));
				Static164.aClass14_Sub4_Sub2_3.method2527(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIJB)Ljava/lang/String;")
	public static String method5306(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		if (Static263.anInterface9_1 != null) {
			@Pc(12) String local12 = Static263.anInterface9_1.method1715(arg0, arg1, arg2);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public static void method5308() {
		Static13.aClass11_56.method215(50);
		Static120.aClass11_60.method215(50);
		Static16.aClass11_9.method215(50);
		Static15.aClass11_132.method215(50);
		Static83.aClass11_141.method215(50);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!jg;IZ)Ljava/lang/String;")
	public static String method5310(@OriginalArg(0) Class14_Sub4 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2525();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt2637 += Static56.aClass218_1.method5927(local15, arg0.aByteArray74, local7, arg0.anInt2637, 0);
			return Static218.method3933(0, local7, local15);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}
