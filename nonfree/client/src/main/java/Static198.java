import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static int anInt4217;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "[[[Lclient!ea;")
	private static Class1_Sub7[][][] aClass1_Sub7ArrayArrayArray3;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array15;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1450 = Static64.method1101("Allocating memory");

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	public static int anInt4214 = 500;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1451 = Static64.method1101("Connecting to update server");

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	public static int anInt4218 = 0;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1452 = aClass51_1450;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "I")
	public static int anInt4222 = 0;

	@OriginalMember(owner = "client!th", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1453 = aClass51_1451;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1454 = Static64.method1101("Welt");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZ)Lclient!ia;")
	public static Class51 method3275(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(26) int local26 = arg0 / 10;
		@Pc(28) int local28 = 1;
		while (local26 != 0) {
			local28++;
			local26 /= 10;
		}
		@Pc(39) int local39 = local28;
		if (arg0 < 0 || arg1) {
			local39 = local28 + 1;
		}
		@Pc(55) byte[] local55 = new byte[local39];
		if (arg0 < 0) {
			local55[0] = 45;
		} else if (arg1) {
			local55[0] = 43;
		}
		for (@Pc(71) int local71 = 0; local71 < local28; local71++) {
			@Pc(77) int local77 = arg0 % 10;
			if (local77 < 0) {
				local77 = -local77;
			}
			arg0 /= 10;
			if (local77 > 9) {
				local77 += 39;
			}
			local55[local39 - local71 - 1] = (byte) (local77 + 48);
		}
		@Pc(116) Class51 local116 = new Class51();
		local116.anInt1858 = local39;
		local116.aByteArray17 = local55;
		return local116;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public static void method3277() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static73.aBooleanArray10[local7] = true;
		}
	}
}
