import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	public static int anInt871;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public static int anInt874;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!oj;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	public static int anInt875;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public static int anInt876;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1 method642() {
		@Pc(13) int local13 = Static187.anIntArray397[0] * Static299.anIntArray561[0];
		@Pc(17) byte[] local17 = Static165.aByteArrayArray9[0];
		@Pc(77) Class2_Sub8_Sub1_Sub1 local77;
		if (Static68.aBooleanArray4[0]) {
			@Pc(24) int[] local24 = new int[local13];
			@Pc(28) byte[] local28 = Static299.aByteArrayArray18[0];
			for (@Pc(30) int local30 = 0; local30 < local13; local30++) {
				local24[local30] = Static199.anIntArray438[local17[local30] & 0xFF] | (local28[local30] & 0xFF) << 24;
			}
			local77 = new Class2_Sub8_Sub1_Sub1_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], local24);
		} else {
			@Pc(82) int[] local82 = new int[local13];
			for (@Pc(84) int local84 = 0; local84 < local13; local84++) {
				local82[local84] = Static199.anIntArray438[local17[local84] & 0xFF];
			}
			local77 = new Class2_Sub8_Sub1_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], local82);
		}
		Static293.method4502();
		return local77;
	}
}
