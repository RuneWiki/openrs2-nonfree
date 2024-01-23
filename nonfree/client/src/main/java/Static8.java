import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "Lclient!ud;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
	public static int anInt180;

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
	public static int anInt184;

	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
	public static int anInt188;

	@OriginalMember(owner = "client!ag", name = "pb", descriptor = "I")
	public static int anInt192;

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
	public static int anInt183 = 0;

	@OriginalMember(owner = "client!ag", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_84 = Static186.method3527("sl_flags");

	@OriginalMember(owner = "client!ag", name = "hb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1 = new Class4(64);

	@OriginalMember(owner = "client!ag", name = "nb", descriptor = "Lclient!mi;")
	public static Class75 aClass75_1 = new Class75();

	@OriginalMember(owner = "client!ag", name = "ob", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array12 = new Class50[100];

	@OriginalMember(owner = "client!ag", name = "qb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_85 = Static186.method3527("::");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIZ)Lclient!hh;")
	public static Class50 method148(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(28) int local28 = arg0 / 10;
		@Pc(30) int local30 = 1;
		while (local28 != 0) {
			local30++;
			local28 /= 10;
		}
		@Pc(53) int local53 = local30;
		if (arg0 < 0 || arg1) {
			local53 = local30 + 1;
		}
		@Pc(64) byte[] local64 = new byte[local53];
		if (arg0 < 0) {
			local64[0] = 45;
		} else if (arg1) {
			local64[0] = 43;
		}
		for (@Pc(83) int local83 = 0; local83 < local30; local83++) {
			@Pc(89) int local89 = arg0 % 10;
			arg0 /= 10;
			if (local89 < 0) {
				local89 = -local89;
			}
			if (local89 > 9) {
				local89 += 39;
			}
			local64[local53 - local83 - 1] = (byte) (local89 + 48);
		}
		@Pc(124) Class50 local124 = new Class50();
		local124.anInt1705 = local53;
		local124.aByteArray12 = local64;
		return local124;
	}
}
