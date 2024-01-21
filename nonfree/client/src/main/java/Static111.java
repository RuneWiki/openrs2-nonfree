import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!h;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_40 = new Class86(20);

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public static int anInt2531 = -1;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_750 = Static81.method1507("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public static int anInt2534 = -1;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_751 = Static81.method1507("FULL");

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!dj;")
	public static Class24 aClass24_752 = aClass24_751;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZII)I")
	public static int method1910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!dj;)Lclient!da;")
	public static Class1_Sub6 method1911(@OriginalArg(1) Class24 arg0) {
		if (arg0.method781() == 0) {
			return null;
		}
		for (@Pc(19) Class1_Sub6 local19 = (Class1_Sub6) Static162.aClass87_23.method2827(); local19 != null; local19 = (Class1_Sub6) Static162.aClass87_23.method2830()) {
			if (local19.aClass24_216.method741(arg0)) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!dj;)V")
	public static void method1912(@OriginalArg(1) Class24 arg0) {
		if (Static25.aClass1_Sub27Array1 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(20) long local20 = arg0.method747();
		if (local20 == 0L) {
			return;
		}
		while (local16 < Static25.aClass1_Sub27Array1.length && Static25.aClass1_Sub27Array1[local16].aLong149 != local20) {
			local16++;
		}
		if (local16 < Static25.aClass1_Sub27Array1.length && Static25.aClass1_Sub27Array1[local16] != null) {
			Static176.aClass1_Sub7_Sub1_34.method2808(187);
			Static176.aClass1_Sub7_Sub1_34.method2801(Static25.aClass1_Sub27Array1[local16].aLong149);
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1917() {
		Static190.aClass46_12.method1587();
	}
}
