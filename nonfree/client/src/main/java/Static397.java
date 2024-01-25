import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "Lclient!qa;")
	public static Class9 aClass9_6;

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Lclient!qr;")
	public static final Class245 aClass245_1 = new Class245(0, 3, Static489.aClass289_17);

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!qr;")
	public static final Class245 aClass245_2 = new Class245(1, 3, Static489.aClass289_17);

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "Lclient!qr;")
	public static final Class245 aClass245_3 = new Class245(2, 4, Static489.aClass289_13);

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "Lclient!qr;")
	public static final Class245 aClass245_4 = new Class245(3, 1, Static489.aClass289_17);

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Lclient!qr;")
	public static final Class245 aClass245_5 = new Class245(4, 2, Static489.aClass289_17);

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "Lclient!qr;")
	public static final Class245 aClass245_6 = new Class245(5, 3, Static489.aClass289_17);

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "Lclient!qr;")
	private static final Class245 aClass245_7 = new Class245(6, 4, Static489.aClass289_17);

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	public static final int anInt6950 = Static124.method4359(16);

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_119 = new Class6(54, -2);

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "[I")
	public static final int[] anIntArray521 = new int[1];

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "J")
	public static long aLong182 = 0L;

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "[I")
	public static final int[] anIntArray522 = new int[500];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)[Lclient!qr;")
	public static Class245[] method5987() {
		return new Class245[] { aClass245_1, aClass245_2, aClass245_3, aClass245_4, aClass245_5, aClass245_6, aClass245_7 };
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIBILclient!ks;)V")
	public static void method5988(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class47_Sub2_Sub3_Sub2 arg2) {
		@Pc(12) int local12 = arg2.anIntArray362[0];
		@Pc(17) int local17 = arg2.anIntArray361[0];
		if (local12 < 0 || local12 >= Static542.anInt9387 || local17 < 0 || Static36.anInt1324 <= local17 || (arg0 < 0 || Static542.anInt9387 <= arg0 || arg1 < 0 || Static36.anInt1324 <= arg1)) {
			return;
		}
		@Pc(72) int local72 = Static470.method5658(0, arg1, 0, arg0, local17, Static519.anIntArray760, 0, true, Static70.aClass299Array1[arg2.aByte94], -4, 0, local12, Static329.anIntArray457, arg2.method4350());
		if (local72 >= 1 && local72 <= 3) {
			for (@Pc(82) int local82 = 0; local82 < local72 - 1; local82++) {
				arg2.method4373(Static329.anIntArray457[local82], Static519.anIntArray760[local82], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
	public static void method5989(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(14, arg0);
		local8.method4925();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public static void method5991() {
		Static158.aFont1 = null;
		Static429.anImage3 = null;
	}
}
