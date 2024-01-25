import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "Lclient!o;")
	public static Class80 aClass80_18;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!os;")
	public static final Class182 aClass182_194 = new Class182("M", "M", "M", "M");

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[128][128];

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	public static int anInt5441 = -1;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ph;Lclient!ph;B)V")
	public static void method4329(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Class187 arg1) {
		Static394.aClass187_117 = arg0;
		Static211.aClass187_73 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BJ)V")
	public static void method4330(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static414.anInt6929 + Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092;
		@Pc(15) int local15 = Static427.anInt7191 + Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094;
		if (Static399.anInt6746 - local10 < -500 || Static399.anInt6746 - local10 > 500 || Static440.anInt7366 - local15 < -500 || Static440.anInt7366 - local15 > 500) {
			Static440.anInt7366 = local15;
			Static399.anInt6746 = local10;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (Static399.anInt6746 != local10) {
			local59 = local10 - Static399.anInt6746;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 <= 0) {
				if (local67 == 0) {
					local67 = -1;
				} else if (local59 > local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = 1;
			} else if (local59 < local67) {
				local67 = local59;
			}
			Static399.anInt6746 += local67;
		}
		if (local15 != Static440.anInt7366) {
			local59 = local15 - Static440.anInt7366;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 <= 0) {
				if (local67 == 0) {
					local67 = -1;
				} else if (local59 > local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = 1;
			} else if (local59 < local67) {
				local67 = local59;
			}
			Static440.anInt7366 += local67;
		}
		if (!Static361.aClass85_Sub1_1.aBoolean164) {
			Static149.aFloat53 += (float) arg0 * Static231.aFloat70 / 6.0F;
			Static16.aFloat6 += (float) arg0 * Static141.aFloat52 / 6.0F;
		}
		Static428.method5674();
	}
}
