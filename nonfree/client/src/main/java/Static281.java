import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kba", name = "tc", descriptor = "Lclient!er;")
	public static final Class86 aClass86_10 = new Class86();

	@OriginalMember(owner = "client!kba", name = "Gc", descriptor = "Lclient!dfa;")
	public static final Class3_Sub15_Sub1 aClass3_Sub15_Sub1_4 = new Class3_Sub15_Sub1(7500);

	@OriginalMember(owner = "client!kba", name = "Nc", descriptor = "Z")
	public static boolean aBoolean534 = false;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZIIII)V")
	public static void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(46) int local46 = (Static103.aShort13 - Static311.aShort85) * local21 / 100 + Static311.aShort85;
		if (local46 < Static68.aShort11) {
			local46 = Static68.aShort11;
		} else if (Static423.aShort101 < local46) {
			local46 = Static423.aShort101;
		}
		@Pc(68) int local68 = local46 * 512 * arg4 / (arg2 * 334);
		@Pc(109) int local109;
		@Pc(116) int local116;
		@Pc(80) short local80;
		if (local68 < Static82.aShort12) {
			local80 = Static82.aShort12;
			local46 = arg2 * local80 * 334 / (arg4 * 512);
			if (local46 > Static423.aShort101) {
				local46 = Static423.aShort101;
				local109 = arg4 * 512 * local46 / (local80 * 334);
				local116 = (arg2 - local109) / 2;
				if (arg1) {
					Static47.aClass33_3.la();
					Static47.aClass33_3.method6209(arg0, local116, arg4, arg3, -16777216);
					Static47.aClass33_3.method6209(arg0, local116, arg4, arg2 + arg3 - local116, -16777216);
				}
				arg2 -= local116 * 2;
				arg3 += local116;
			}
		} else if (local68 > Static373.aShort95) {
			local80 = Static373.aShort95;
			local46 = local80 * arg2 * 334 / (arg4 * 512);
			if (local46 < Static68.aShort11) {
				local46 = Static68.aShort11;
				local109 = arg2 * local80 * 334 / (local46 * 512);
				local116 = (arg4 - local109) / 2;
				if (arg1) {
					Static47.aClass33_3.la();
					Static47.aClass33_3.method6209(arg0, arg2, local116, arg3, -16777216);
					Static47.aClass33_3.method6209(arg0 + arg4 - local116, arg2, local116, arg3, -16777216);
				}
				arg4 -= local116 * 2;
				arg0 += local116;
			}
		}
		Static117.anInt3028 = arg3;
		Static124.anInt3151 = arg4 * local46 / 334;
		Static590.anInt9841 = (short) arg4;
		Static539.anInt9289 = (short) arg2;
		Static470.anInt8511 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(III)Z")
	public static boolean method5317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
