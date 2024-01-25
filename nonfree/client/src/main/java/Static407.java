import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "[I")
	public static final int[] anIntArray549 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	public static int anInt6912 = 0;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "[Lclient!gaa;")
	public static final Class110[] aClass110Array1 = new Class110[16];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIII)I")
	public static int method5894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class3_Sub17.anIntArray177[arg1 * 8192 / arg3] >> 1;
		return (arg2 * local15 >> 16) + (arg0 * (65536 - local15) >> 16);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(JI)V")
	public static void method5896(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static527.anInt8331 + Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975;
		@Pc(15) int local15 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 + Static581.anInt9295;
		if (Static45.anInt998 - local10 < -2000 || Static45.anInt998 - local10 > 2000 || Static498.anInt7926 - local15 < -2000 || Static498.anInt7926 - local15 > 2000) {
			Static498.anInt7926 = local15;
			Static45.anInt998 = local10;
		}
		@Pc(56) int local56;
		@Pc(64) int local64;
		if (Static45.anInt998 != local10) {
			local56 = local10 - Static45.anInt998;
			local64 = (int) ((long) local56 * arg0 / 320L);
			if (local56 > 0) {
				if (local64 == 0) {
					local64 = 1;
				} else if (local56 < local64) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = -1;
			} else if (local64 < local56) {
				local64 = local56;
			}
			Static45.anInt998 += local64;
		}
		if (Static498.anInt7926 != local15) {
			local56 = local15 - Static498.anInt7926;
			local64 = (int) (arg0 * (long) local56 / 320L);
			if (local56 > 0) {
				if (local64 == 0) {
					local64 = 1;
				} else if (local56 < local64) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = -1;
			} else if (local64 < local56) {
				local64 = local56;
			}
			Static498.anInt7926 += local64;
		}
		if (!Static278.aClass3_Sub13_Sub1_1.lb) {
			Static439.aFloat151 += (float) arg0 * Static443.aFloat152 / 6.0F;
			Static527.aFloat183 += (float) arg0 * Static4.aFloat1 / 6.0F;
		}
		Static89.method2014();
	}
}
