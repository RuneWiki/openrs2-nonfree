import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_98 = new Class218(39, 11);

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
	public static final int[] anIntArray486 = new int[13];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(DB)V")
	public static void method6574(@OriginalArg(0) double arg0) {
		if (Static117.aDouble13 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static285.anIntArray345[local15] = local27 <= 255 ? local27 : 255;
		}
		Static117.aDouble13 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)I")
	public static int method6576(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return local45 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public static void method6577() {
		@Pc(7) int local7 = Static385.anInt10557;
		@Pc(9) int[] local9 = Static493.anIntArray555;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(25) Class2_Sub3_Sub1_Sub2_Sub2 local25 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local9[local11]];
			if (local25 != null) {
				Static230.method4386(local25, local25.method5308());
			}
		}
	}
}
