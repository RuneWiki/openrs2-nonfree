import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array12;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static int anInt7030;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
	public static int[] anIntArray681;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public static int anInt7032;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!im;")
	public static final Class140 aClass140_109 = new Class140(22, -1);

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	public static byte[] method5883(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static74.method1288(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local6 <= local20 - 1 || Static74.method1288(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(72) byte[] local72 = new byte[local26];
		Static158.method2474(0, arg0, local72);
		return local72;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Z")
	public static boolean method5884(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBI)I")
	public static int method5885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(28) int local28 = (arg0 & 0x7F) * local13 + (arg2 & 0x7F) * arg1 >> 7;
		@Pc(42) int local42 = local13 * (arg0 & 0x380) + arg1 * (arg2 & 0x380) >> 7;
		@Pc(64) int local64 = (arg2 & 0xFC00) * arg1 + local13 * (arg0 & 0xFC00) >> 7;
		return local42 & 0x380 | local64 & 0xFC00 | local28 & 0x7F;
	}
}
