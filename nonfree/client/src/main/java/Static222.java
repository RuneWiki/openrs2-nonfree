import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!qe", name = "Bc", descriptor = "I")
	public static int anInt4454;

	@OriginalMember(owner = "client!qe", name = "Qc", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!qe", name = "Vc", descriptor = "I")
	public static int anInt4471;

	@OriginalMember(owner = "client!qe", name = "Ic", descriptor = "I")
	public static int anInt4461 = 0;

	@OriginalMember(owner = "client!qe", name = "ad", descriptor = "Ljava/lang/String;")
	public static String aString149 = "slide:";

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)V")
	public static void method3492() {
		for (@Pc(1) int local1 = 0; local1 < Static139.anInt2755; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static246.anInt4853; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static64.anInt1393; local11++) {
					@Pc(22) Class4_Sub21 local22 = Static261.aClass4_Sub21ArrayArrayArray4[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class181 local27 = local22.aClass181_1;
						if (local27 != null && local27.aClass13_9.method4264()) {
							Static188.method4644(local27.aClass13_9, local1, local6, local11, 1, 1);
							if (local27.aClass13_10 != null && local27.aClass13_10.method4264()) {
								Static188.method4644(local27.aClass13_10, local1, local6, local11, 1, 1);
								local27.aClass13_9.method4261(local27.aClass13_10, 0, 0, 0, false);
								local27.aClass13_10 = local27.aClass13_10.method4268();
							}
							local27.aClass13_9 = local27.aClass13_9.method4268();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt2694; local83++) {
							@Pc(92) Class99 local92 = local22.aClass99Array19[local83];
							if (local92 != null && local92.aClass13_4.method4264()) {
								Static188.method4644(local92.aClass13_4, local1, local6, local11, local92.anInt3223 + 1 - local92.anInt3225, local92.anInt3221 - local92.anInt3222 + 1);
								local92.aClass13_4 = local92.aClass13_4.method4268();
							}
						}
						@Pc(131) Class67 local131 = local22.aClass67_1;
						if (local131 != null && local131.aClass13_3.method4264()) {
							Static106.method1798(local131.aClass13_3, local1, local6, local11);
							local131.aClass13_3 = local131.aClass13_3.method4268();
						}
					}
				}
			}
		}
	}
}
