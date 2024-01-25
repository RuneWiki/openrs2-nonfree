import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "[S")
	public static final short[] aShortArray10 = new short[] { 6, 12, 3, 60, 49, 58, 45, 13 };

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
	public static int anInt2479 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(46) int local46 = Static230.aShort31 + (Static349.aShort73 - Static230.aShort31) * local21 / 100;
		if (Static29.aShort7 > local46) {
			local46 = Static29.aShort7;
		} else if (Static258.aShort38 < local46) {
			local46 = Static258.aShort38;
		}
		@Pc(72) int local72 = local46 * 512 * arg1 / (arg3 * 334);
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(81) short local81;
		if (local72 < Static247.aShort36) {
			local81 = Static247.aShort36;
			local46 = arg3 * local81 * 334 / (arg1 * 512);
			if (local46 > Static258.aShort38) {
				local46 = Static258.aShort38;
				local106 = local46 * arg1 * 512 / (local81 * 334);
				local112 = (arg3 - local106) / 2;
				if (arg4) {
					Static82.aClass163_1.va();
					Static82.aClass163_1.method5545(arg1, -16777216, local112, arg0, arg2);
					Static82.aClass163_1.method5545(arg1, -16777216, local112, arg0, arg3 + arg2 - local112);
				}
				arg2 += local112;
				arg3 -= local112 * 2;
			}
		} else if (Static458.aShort108 < local72) {
			local81 = Static458.aShort108;
			local46 = arg3 * local81 * 334 / (arg1 * 512);
			if (Static29.aShort7 > local46) {
				local46 = Static29.aShort7;
				local106 = local81 * 334 * arg3 / (local46 * 512);
				local112 = (arg1 - local106) / 2;
				if (arg4) {
					Static82.aClass163_1.va();
					Static82.aClass163_1.method5545(local112, -16777216, arg3, arg0, arg2);
					Static82.aClass163_1.method5545(local112, -16777216, arg3, arg0 + arg1 - local112, arg2);
				}
				arg1 -= local112 * 2;
				arg0 += local112;
			}
		}
		Static197.anInt3346 = (short) arg3;
		Static298.anInt166 = arg0;
		Static245.anInt3934 = local46 * arg1 / 334;
		Static22.anInt349 = (short) arg1;
		Static72.anInt1387 = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)V")
	public static void method2048() {
		Static151.aClass16ArrayArray1 = new Class16[Static445.aClass54_116.method1107()][];
		Static388.aClass16ArrayArray4 = new Class16[Static445.aClass54_116.method1107()][];
		Static119.aBooleanArray10 = new boolean[Static445.aClass54_116.method1107()];
	}
}
