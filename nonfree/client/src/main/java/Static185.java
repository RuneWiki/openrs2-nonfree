import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_25;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "[Z")
	public static final boolean[] aBooleanArray43 = new boolean[100];

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1369 = Static161.method2452("runes");

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1371 = Static161.method2452("glow2:");

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1370 = aClass20_1371;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1372 = aClass20_1371;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!ce;)Lclient!c;")
	public static Class5_Sub1 method2809(@OriginalArg(1) Class5_Sub6 arg0) {
		arg0.method3062();
		@Pc(13) int local13 = arg0.method3062();
		@Pc(17) Class5_Sub1 local17 = Static118.method2463(local13);
		local17.anInt4201 = arg0.method3062();
		@Pc(26) int local26 = arg0.method3062();
		for (@Pc(36) int local36 = 0; local36 < local26; local36++) {
			@Pc(42) int local42 = arg0.method3062();
			local17.method3190(arg0, local42);
		}
		local17.method3200();
		return local17;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
	public static void method2810() {
		Static84.aClass8_18.method233();
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
	public static void method2811() {
		Static38.aClass75_5 = new Class75(32);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!mf;)V")
	public static void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class69 arg2) {
		if (Static211.anInt4102 != 0 && Static211.anInt4102 != 3) {
			return;
		}
		@Pc(18) int local18 = arg0 - arg2.anInt2471 / 2;
		@Pc(25) int local25 = arg1 - arg2.anInt2541 / 2;
		@Pc(32) int local32 = Static72.anInt1568 + Static79.anInt1777 & 0x7FF;
		@Pc(36) int local36 = Class80.anIntArray327[local32];
		@Pc(44) int local44 = local36 * (Static109.anInt2292 + 256) >> 8;
		@Pc(48) int local48 = Class80.anIntArray324[local32];
		@Pc(64) int local64 = local48 * (Static109.anInt2292 + 256) >> 8;
		@Pc(75) int local75 = local18 * local44 - local64 * local25 >> 11;
		@Pc(86) int local86 = local64 * local18 + local44 * local25 >> 11;
		@Pc(94) int local94 = Static210.aClass1_Sub2_Sub2_2.anInt2241 + local86 >> 7;
		@Pc(102) int local102 = Static210.aClass1_Sub2_Sub2_2.anInt2234 - local75 >> 7;
		@Pc(122) boolean local122 = Static12.method231(0, local102, 1, local94, true, 0, 0, Static210.aClass1_Sub2_Sub2_2.anIntArray250[0], 0, Static210.aClass1_Sub2_Sub2_2.anIntArray253[0], 0);
		if (!local122) {
			return;
		}
		Static43.aClass5_Sub6_Sub1_2.method3061(local25);
		Static43.aClass5_Sub6_Sub1_2.method3061(local18);
		Static43.aClass5_Sub6_Sub1_2.method3044(Static72.anInt1568);
		Static43.aClass5_Sub6_Sub1_2.method3061(57);
		Static43.aClass5_Sub6_Sub1_2.method3061(Static79.anInt1777);
		Static43.aClass5_Sub6_Sub1_2.method3061(Static109.anInt2292);
		Static43.aClass5_Sub6_Sub1_2.method3061(89);
		Static43.aClass5_Sub6_Sub1_2.method3044(Static210.aClass1_Sub2_Sub2_2.anInt2241);
		Static43.aClass5_Sub6_Sub1_2.method3044(Static210.aClass1_Sub2_Sub2_2.anInt2234);
		Static43.aClass5_Sub6_Sub1_2.method3061(Static152.anInt3068);
		Static43.aClass5_Sub6_Sub1_2.method3061(63);
	}
}
