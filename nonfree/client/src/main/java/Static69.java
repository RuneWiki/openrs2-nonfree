import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public static int anInt1978;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_25;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!dd;")
	private static Class13 aClass13_682 = Static161.method2971("Loading config )2 ");

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_678 = aClass13_682;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!dd;")
	private static Class13 aClass13_680 = Static161.method2971(" ");

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_679 = aClass13_680;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public static int anInt1980 = -2;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "[I")
	public static int[] anIntArray211 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public static int anInt1982 = 0;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_681 = Static161.method2971("hel");

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	public static int anInt1983 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public static void method1458() {
		@Pc(9) int local9 = Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method246(Static55.aClass13_598);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static53.anInt1722; local11++) {
			local19 = Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method246(Static98.method2705(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		Static46.aBoolean106 = true;
		Static51.anInt1676 = local9;
		local19 = Static53.anInt1722 * 15 + 21;
		Static164.anInt3861 = Static53.anInt1722 * 15 + 22;
		@Pc(52) int local52 = Static122.anInt3191 - local9 / 2;
		if (local52 + local9 > 765) {
			local52 = 765 - local9;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(71) int local71 = Static8.anInt293;
		if (local19 + local71 > 503) {
			local71 = 503 - local19;
		}
		Static85.anInt2436 = local52;
		if (local71 < 0) {
			local71 = 0;
		}
		Static101.anInt2829 = local71;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method1459() {
		aClass4_Sub1_25 = null;
		aClass13_681 = null;
		aClass13_679 = null;
		aClass13_678 = null;
		aClass13_682 = null;
		aClass13_680 = null;
		anIntArray211 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ag;Lclient!ag;Lclient!ag;I)V")
	public static void method1460(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) Class4 arg2) {
		Static42.aClass4_41 = arg2;
		Static82.aClass4_54 = arg1;
		Static122.aClass4_76 = arg0;
	}
}
