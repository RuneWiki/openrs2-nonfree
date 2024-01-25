import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_23 = new Class102(64);

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
	public static int anInt3463 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!qk;IBI)V")
	public static void method3117(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte110 == 0) {
			arg0.anInt8139 = arg0.anInt8151;
		} else if (arg0.aByte110 == 1) {
			arg0.anInt8139 = (arg1 - arg0.anInt8141) / 2 + arg0.anInt8151;
		} else if (arg0.aByte110 == 2) {
			arg0.anInt8139 = arg1 - arg0.anInt8141 - arg0.anInt8151;
		} else if (arg0.aByte110 == 3) {
			arg0.anInt8139 = arg0.anInt8151 * arg1 >> 14;
		} else if (arg0.aByte110 == 4) {
			arg0.anInt8139 = (arg0.anInt8151 * arg1 >> 14) + (arg1 - arg0.anInt8141) / 2;
		} else {
			arg0.anInt8139 = arg1 - arg0.anInt8141 - (arg0.anInt8151 * arg1 >> 14);
		}
		if (arg0.aByte109 == 0) {
			arg0.anInt8200 = arg0.anInt8157;
		} else if (arg0.aByte109 == 1) {
			arg0.anInt8200 = (arg2 - arg0.anInt8153) / 2 + arg0.anInt8157;
		} else if (arg0.aByte109 == 2) {
			arg0.anInt8200 = arg2 - arg0.anInt8157 - arg0.anInt8153;
		} else if (arg0.aByte109 == 3) {
			arg0.anInt8200 = arg2 * arg0.anInt8157 >> 14;
		} else if (arg0.aByte109 == 4) {
			arg0.anInt8200 = (arg2 - arg0.anInt8153) / 2 + (arg0.anInt8157 * arg2 >> 14);
		} else {
			arg0.anInt8200 = arg2 - arg0.anInt8153 - (arg0.anInt8157 * arg2 >> 14);
		}
		if (!Static351.aBoolean491 || Static76.method1833(arg0).anInt2466 == 0 && arg0.anInt8204 != 0) {
			return;
		}
		if (arg0.anInt8200 < 0) {
			arg0.anInt8200 = 0;
		} else if (arg0.anInt8200 + arg0.anInt8153 > arg2) {
			arg0.anInt8200 = arg2 - arg0.anInt8153;
		}
		if (arg0.anInt8139 < 0) {
			arg0.anInt8139 = 0;
		} else if (arg0.anInt8139 + arg0.anInt8141 > arg1) {
			arg0.anInt8139 = arg1 - arg0.anInt8141;
			return;
		}
	}
}
