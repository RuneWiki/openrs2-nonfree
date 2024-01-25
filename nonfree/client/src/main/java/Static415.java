import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	public static int anInt7049;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!si;")
	public static final Class217 aClass217_39 = new Class217(12, 16);

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt7048 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5436(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static16.aClass30_11.method4666();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static16.aClass30_11.method4661();
		} else if (!Static16.aClass30_11.method4698()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static126.aClass67_Sub1_1.aBoolean398 = arg0;
			Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
			return true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
	public static void method5437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg1, 6);
		local8.method2762();
		local8.anInt3611 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method5438() {
		for (@Pc(11) int local11 = 0; local11 < Static249.anInt4520; local11++) {
			@Pc(17) int local17 = Static128.anIntArray171[local11];
			@Pc(21) Class6_Sub2_Sub1_Sub2 local21 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local17];
			if (local21 != null) {
				Static242.method4043(local21.aClass243_1.anInt6902, local21);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIII)I")
	public static int method5439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = ((arg0 & 0xFF00FF) * arg1 & 0xFF00FF00 | arg1 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(32) int local32 = 255 - arg1;
		return (((arg2 & 0xFF00) * local32 & 0xFF0000 | (arg2 & 0xFF00FF) * local32 & 0xFF00FF00) >>> 8) + local28;
	}
}
