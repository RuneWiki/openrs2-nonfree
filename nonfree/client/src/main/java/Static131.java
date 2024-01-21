import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "Lclient!ud;")
	public static Class19 aClass19_35;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "[I")
	public static int[] anIntArray616 = new int[500];

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1496 = Static146.method2172("Free world");

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1489 = aClass77_1496;

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1490 = Static146.method2172(" from your ignore list first)3");

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1495 = Static146.method2172("Loading )2 please wait)3");

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1491 = aClass77_1495;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1492 = Static146.method2172("Choose Option");

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1493 = aClass77_1492;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1494 = aClass77_1490;

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
	public static int anInt4357 = 0;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
	public static int anInt4359 = 0;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "Lclient!ua;")
	public static Class82 aClass82_62 = new Class82(20);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!td;")
	public static Class2_Sub2_Sub16 method2901(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub16 local10 = (Class2_Sub2_Sub16) Static169.aClass82_60.method2699((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static154.aClass43_35.method2205(arg0, 9);
		local10 = new Class2_Sub2_Sub16();
		local10.anInt3771 = arg0;
		if (local20 != null) {
			local10.method2614(new Class2_Sub18(local20));
		}
		local10.method2609();
		Static169.aClass82_60.method2701((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method2902() {
		aClass77_1492 = null;
		aClass77_1489 = null;
		aClass77_1490 = null;
		aClass82_62 = null;
		aClass77_1495 = null;
		aClass77_1491 = null;
		aClass77_1493 = null;
		aClass77_1494 = null;
		aClass19_35 = null;
		anIntArray616 = null;
		aClass77_1496 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)I")
	public static int method2903(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local14 >>> 2 & 0x33333333) + (local14 & 0x33333333);
		@Pc(36) int local36 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z")
	public static boolean method2904(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(18) int local18 = anIntArray616[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		return local18 == 1004;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)Z")
	public static boolean method2905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(29) Class2_Sub2_Sub5 local29 = Static121.method2129(arg1);
		return local29.method354(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 method2906() {
		@Pc(14) Class2_Sub2_Sub3_Sub2 local14 = new Class2_Sub2_Sub3_Sub2();
		local14.anInt568 = Static37.anIntArray175[0];
		local14.anInt570 = Static160.anIntArray642[0];
		local14.anInt572 = Static15.anInt483;
		local14.anInt571 = Static2.anIntArray15[0];
		local14.anInt567 = Static178.anIntArray637[0];
		@Pc(43) int local43 = local14.anInt567 * local14.anInt571;
		local14.anInt569 = Static138.anInt3346;
		local14.anIntArray81 = new int[local43];
		@Pc(54) byte[] local54 = Static170.aByteArrayArray10[0];
		for (@Pc(56) int local56 = 0; local56 < local43; local56++) {
			local14.anIntArray81[local56] = Static173.anIntArray623[local54[local56] & 0xFF];
		}
		Static59.method1102();
		return local14;
	}
}
