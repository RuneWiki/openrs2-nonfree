import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
	public static int anInt6866 = 0;

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "Lclient!si;")
	public static final Class338 aClass338_36 = new Class338(128, 4);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(JI)V")
	public static void method5766(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static702.anInt10990 + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204;
		@Pc(15) int local15 = Static53.anInt11213 + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211;
		if (Static680.anInt10754 - local10 < -2000 || Static680.anInt10754 - local10 > 2000 || Static270.anInt4887 - local15 < -2000 || Static270.anInt4887 - local15 > 2000) {
			Static270.anInt4887 = local15;
			Static680.anInt10754 = local10;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (Static680.anInt10754 != local10) {
			local62 = local10 - Static680.anInt10754;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local70 < local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local70 > local62) {
				local70 = local62;
			}
			Static680.anInt10754 += local70;
		}
		if (local15 != Static270.anInt4887) {
			local62 = local15 - Static270.anInt4887;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local70 > local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static270.anInt4887 += local70;
		}
		Static658.aFloat196 += Static144.aFloat56 * (float) arg0 / 6.0F;
		Static27.aFloat4 += (float) arg0 * Static18.aFloat197 / 6.0F;
		Static212.method3251();
	}
}
