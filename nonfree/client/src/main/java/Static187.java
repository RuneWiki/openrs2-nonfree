import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!je", name = "p", descriptor = "J")
	public static long aLong117 = -1L;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
	public static final int[] anIntArray305 = new int[1];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method2734() {
		try {
			if (Static351.anInt5638 == 1) {
				@Pc(17) int local17 = Static108.aClass7_Sub8_Sub3_1.method4483();
				if (local17 > 0 && Static108.aClass7_Sub8_Sub3_1.method4500()) {
					local17 -= Static415.anInt6610;
					if (local17 < 0) {
						local17 = 0;
					}
					Static108.aClass7_Sub8_Sub3_1.method4486(local17);
				} else {
					Static108.aClass7_Sub8_Sub3_1.method4501();
					Static108.aClass7_Sub8_Sub3_1.method4508();
					Static367.aClass77_1 = null;
					Static123.aClass7_Sub36_1 = null;
					if (Static126.aClass178_41 == null) {
						Static351.anInt5638 = 0;
					} else {
						Static351.anInt5638 = 2;
					}
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static108.aClass7_Sub8_Sub3_1.method4501();
			Static367.aClass77_1 = null;
			Static351.anInt5638 = 0;
			Static126.aClass178_41 = null;
			Static123.aClass7_Sub36_1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Z")
	public static boolean method2739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
