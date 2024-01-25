import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "Lclient!qs;")
	public static Class211 aClass211_43;

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	public static int anInt3464;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
	public static int anInt3466 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIZII)V")
	public static void method2706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = local7 * (Static120.aShort50 - Static168.aShort40) / 100 + Static168.aShort40;
		@Pc(35) int local35 = local29 * arg5 >> 8;
		@Pc(41) int local41 = 16384 - arg4 & 0x3FFF;
		@Pc(48) int local48 = 16384 - arg6 & 0x3FFF;
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = 0;
		@Pc(58) int local58 = local35;
		if (local41 != 0) {
			local52 = -local35 * Class90_Sub1.anIntArray304[local41] >> 15;
			local58 = local35 * Class90_Sub1.anIntArray303[local41] >> 15;
		}
		if (local48 != 0) {
			local50 = Class90_Sub1.anIntArray304[local48] * local58 >> 15;
			local58 = local58 * Class90_Sub1.anIntArray303[local48] >> 15;
		}
		Static107.anInt2426 = arg3 - local52;
		Static147.anInt3170 = arg6;
		Static403.anInt7268 = 0;
		Static78.anInt1973 = arg1 - local58;
		Static217.anInt4351 = arg4;
		Static378.anInt6885 = arg0 - local50;
	}
}
