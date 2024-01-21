import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_22;

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1222 = Static161.method2452("Please enter your username)3");

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1221 = aClass20_1222;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1223 = Static161.method2452("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_15 = new Class91();

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
	public static int anInt3315 = 0;

	@OriginalMember(owner = "client!rf", name = "ab", descriptor = "[S")
	public static short[] aShortArray46 = new short[256];

	@OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
	public static int anInt3320 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)I")
	public static int method2507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub17 local8 = (Class5_Sub17) Static38.aClass75_5.method2072((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(34) int local34 = 0; local34 < local8.anIntArray231.length; local34++) {
				if (local8.anIntArray233[local34] == arg1) {
					local24 += local8.anIntArray231[local34];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1 method2508() {
		@Pc(13) int local13 = Static153.anIntArray337[0] * Static210.anIntArray84[0];
		@Pc(17) byte[] local17 = Static191.aByteArrayArray9[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static3.anIntArray9[local17[local22] & 0xFF];
		}
		@Pc(62) Class5_Sub2_Sub10_Sub1 local62 = new Class5_Sub2_Sub10_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[0], Static5.anIntArray10[0], Static153.anIntArray337[0], Static210.anIntArray84[0], local20);
		Static85.method1452();
		return local62;
	}
}
