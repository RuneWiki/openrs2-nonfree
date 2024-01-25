import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!di;")
	public static final Class54 aClass54_14 = new Class54(76, -1);

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_11 = new Class265(24, -1);

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[Lclient!tp;")
	public static final Class237[] aClass237Array1 = new Class237[8];

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString3 = "";

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZII)V")
	public static void method451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class22 local13 = Static227.aClass22ArrayArray1[arg2][arg0];
		Static209.method3313(local13 == null ? Static344.aClass22_2 : local13, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)V")
	public static void method452(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static405.anInt6749;
		@Pc(14) int local14 = Static186.anInt3613;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static290.anInt5208 != local12) {
			local22 = local12 - Static290.anInt5208;
			local30 = (int) (arg0 * (long) local22 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local30 < local22) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local30 > local22) {
				local30 = local22;
			}
			Static290.anInt5208 += local30;
		}
		if (Static335.anInt941 != local14) {
			local22 = local14 - Static335.anInt941;
			local30 = (int) (arg0 * (long) local22 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local22 > local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local22 < local30) {
				local30 = local22;
			}
			Static335.anInt941 += local30;
		}
		if (!Static12.aClass79_Sub1_1.aBoolean363) {
			Static287.aFloat74 += (float) arg0 * Static286.aFloat73 / 40.0F * 8.0F;
			Static202.aFloat62 += Static118.aFloat53 * (float) arg0 / 40.0F * 8.0F;
		}
		Static45.method713();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!dr;B)V")
	public static void method453(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class59 arg1) {
		while (true) {
			@Pc(14) Class138 local14 = arg1.method1352(arg0);
			while (local14.anInt3723 == 0) {
				Static81.method1477(10L);
			}
			if (local14.anInt3723 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static81.method1477(100L);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method454() {
		Static365.method4986(25);
		Static55.method922();
		System.gc();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(FI)F")
	public static float method456(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}
}
