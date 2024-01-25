import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	public static int anInt2566 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	public static void method2238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static452.anInt7262 == 1) {
			Static98.method1762(arg0, arg1, Static144.aClass1_Sub3_4);
		} else if (Static452.anInt7262 == 2) {
			Static124.method5866(arg1, arg0);
		}
		Static144.aClass1_Sub3_4 = null;
		Static452.anInt7262 = 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public static void method2240() {
		Static155.anInt2952 = 0;
		for (@Pc(11) int local11 = 0; local11 < 2048; local11++) {
			Static164.aClass1_Sub5Array1[local11] = null;
			Static144.aByteArray49[local11] = 1;
			Static358.aClass59Array1[local11] = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!kk;B)V")
	public static void method2241(@OriginalArg(0) Class31_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt7351 - Static378.anInt4244;
		@Pc(21) int local21 = arg0.anInt7353 * 128 + arg0.method5989() * 64;
		@Pc(38) int local38 = arg0.anInt7324 * 128 + arg0.method5989() * 64;
		arg0.anInt7380 = 0;
		arg0.anInt7298 += (local38 - arg0.anInt7298) / local9;
		arg0.anInt7300 += (local21 - arg0.anInt7300) / local9;
		if (arg0.anInt7362 == 0) {
			arg0.method5981(8192);
		}
		if (arg0.anInt7362 == 1) {
			arg0.method5981(12288);
		}
		if (arg0.anInt7362 == 2) {
			arg0.method5981(0);
		}
		if (arg0.anInt7362 == 3) {
			arg0.method5981(4096);
		}
	}
}
