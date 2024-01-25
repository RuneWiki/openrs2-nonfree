import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public static int anInt4454;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!ela;")
	public static final Class96 aClass96_3 = new Class96();

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	public static int anInt4458 = 1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JB)V")
	public static void method3652(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static599.anInt9774;
		@Pc(9) int local9 = Static46.anInt795;
		@Pc(17) int local17;
		@Pc(25) int local25;
		if (Static680.anInt10754 != local7) {
			local17 = local7 - Static680.anInt10754;
			local25 = (int) ((long) local17 * arg0 / 320L);
			if (local17 > 0) {
				if (local25 == 0) {
					local25 = 1;
				} else if (local25 > local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = -1;
			} else if (local25 < local17) {
				local25 = local17;
			}
			Static680.anInt10754 += local25;
		}
		if (local9 != Static270.anInt4887) {
			local17 = local9 - Static270.anInt4887;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local17 > local25) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local25 > local17) {
				local25 = local17;
			}
			Static270.anInt4887 += local25;
		}
		Static658.aFloat196 += (float) arg0 * Static144.aFloat56 / 40.0F * 8.0F;
		Static27.aFloat4 += Static18.aFloat197 * (float) arg0 / 40.0F * 8.0F;
		Static212.method3251();
	}
}
