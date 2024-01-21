import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public static int anInt1132;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_453 = Static187.method3089("null");

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[B")
	public static final byte[] aByteArray4 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_454 = Static187.method3089("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_455 = Static187.method3089(":tradereq:");

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_8 = new Class47(64);

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
	public static final int[] anIntArray88 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_456 = Static187.method3089("Standort");

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_457 = Static187.method3089("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "Lclient!vd;")
	public static Class92 aClass92_458 = aClass92_457;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_459 = Static187.method3089("AUS");

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ka;I)V")
	public static void method783(@OriginalArg(0) Class1_Sub14 arg0) {
		if (Static63.aClass96_39 != null) {
			try {
				Static63.aClass96_39.method3341(0L);
				Static63.aClass96_39.method3336(24, arg0.anInt4061, arg0.aByteArray49);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt4061 += 24;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method785() {
		Static147.anInt2991 = 0;
		Static158.anInt3294 = 0;
		Static92.method1360();
		Static6.method120();
		Static3.method3254();
		Static101.method1525();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static158.anInt3294; local25++) {
			local31 = Static38.anIntArray80[local25];
			if (Static47.aClass8_Sub3_Sub1Array1[local31].anInt3595 != Static155.anInt2981) {
				Static47.aClass8_Sub3_Sub1Array1[local31] = null;
			}
		}
		if (Static63.anInt3562 != Static18.aClass1_Sub14_Sub1_2.anInt4061) {
			throw new RuntimeException("gpp1 pos:" + Static18.aClass1_Sub14_Sub1_2.anInt4061 + " psize:" + Static63.anInt3562);
		}
		for (local31 = 0; local31 < Static35.anInt992; local31++) {
			if (Static47.aClass8_Sub3_Sub1Array1[Static111.anIntArray181[local31]] == null) {
				throw new RuntimeException("gpp2 pos:" + local31 + " size:" + Static35.anInt992);
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	public static void method786() {
		Static48.aClass47_9.method1276();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([Lclient!vd;I)Lclient!vd;")
	public static Class92 method787(@OriginalArg(0) Class92[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static179.method2928(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!de;II)V")
	public static void method788(@OriginalArg(1) Class8_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3575 == arg2 && arg2 != -1) {
			@Pc(77) Class1_Sub3_Sub20 local77 = Static84.method1279(arg2);
			@Pc(80) int local80 = local77.anInt3405;
			if (local80 == 1) {
				arg0.anInt3620 = 0;
				arg0.anInt3605 = 0;
				arg0.anInt3589 = arg1;
				arg0.anInt3570 = 0;
				Static109.method1646(local77, arg0.anInt3570, arg0 == Static15.aClass8_Sub3_Sub1_1, arg0.anInt3600, arg0.anInt3606);
			}
			if (local80 == 2) {
				arg0.anInt3620 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt3575 == -1 || Static84.method1279(arg2).anInt3386 >= Static84.method1279(arg0.anInt3575).anInt3386) {
			arg0.anInt3575 = arg2;
			arg0.anInt3609 = arg0.anInt3578;
			arg0.anInt3589 = arg1;
			arg0.anInt3570 = 0;
			arg0.anInt3620 = 0;
			arg0.anInt3605 = 0;
			if (arg0.anInt3575 == -1) {
				return;
			}
			Static109.method1646(Static84.method1279(arg0.anInt3575), arg0.anInt3570, arg0 == Static15.aClass8_Sub3_Sub1_1, arg0.anInt3600, arg0.anInt3606);
		}
	}
}
