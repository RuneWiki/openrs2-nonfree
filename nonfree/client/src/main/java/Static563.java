import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	public static int anInt9402;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	public static int anInt9403;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!td;")
	public static final Class301 aClass301_11 = new Class301();

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public static int anInt9404 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method7689() {
		if (Static455.anInt7908 < 0) {
			return;
		}
		@Pc(4) long local4 = Static137.method2058();
		Static455.anInt7908 = (int) ((long) Static455.anInt7908 + Static410.aLong187 - local4);
		if (Static455.anInt7908 > 0) {
			@Pc(24) int local24 = (Static455.anInt7908 << 8) / Static368.anInt6386;
			@Pc(29) int local29 = 255 - local24;
			@Pc(34) float local34 = (float) local24 / 255.0F;
			Static24.anInt5482 = ((Static98.aClass171_1.anInt4231 & 0xFF00FF) * local29 + (Static68.anInt1145 & 0xFF00FF) * local24 & 0xFF00FF00) + (local29 * (Static98.aClass171_1.anInt4231 & 0xFF00) + local24 * (Static68.anInt1145 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(72) float local72 = 1.0F - local34;
			Static435.anInt7600 = Static98.aClass171_1.anInt4239 * local29 + Static372.anInt4618 * local24 >> 8;
			Static236.aFloat55 = local72 * (Static98.aClass171_1.aFloat65 - Static545.aFloat202) + Static545.aFloat202;
			Static1.anInt35 = (local24 * (Static406.anInt7123 & 0xFF00) + (Static98.aClass171_1.anInt4232 & 0xFF00) * local29 & 0xFF0000) + (local29 * (Static98.aClass171_1.anInt4232 & 0xFF00FF) + (Static406.anInt7123 & 0xFF00FF) * local24 & 0xFF00FF00) >>> 8;
			Static577.aFloat134 = Static126.aFloat20 + (Static98.aClass171_1.aFloat62 - Static126.aFloat20) * local72;
			Static334.aFloat135 = Static217.aFloat52 + local72 * (Static98.aClass171_1.aFloat66 - Static217.aFloat52);
			Static2.aFloat3 = local72 * (Static98.aClass171_1.aFloat61 - Static242.aFloat57) + Static242.aFloat57;
			Static271.aFloat84 = Static14.aFloat6 + (Static98.aClass171_1.aFloat64 - Static14.aFloat6) * local72;
			Static212.aFloat49 = local72 * (Static98.aClass171_1.aFloat63 - Static447.aFloat180) + Static447.aFloat180;
			if (Static395.aClass17_3 != Static98.aClass171_1.aClass17_2) {
				Static183.aClass17_1 = Static246.aClass121_7.method7104(Static395.aClass17_3, Static98.aClass171_1.aClass17_2, local72, Static183.aClass17_1);
			}
		} else {
			Static236.aFloat55 = Static98.aClass171_1.aFloat65;
			Static24.anInt5482 = Static98.aClass171_1.anInt4231;
			Static435.anInt7600 = Static98.aClass171_1.anInt4239;
			Static334.aFloat135 = Static98.aClass171_1.aFloat66;
			Static577.aFloat134 = Static98.aClass171_1.aFloat62;
			Static1.anInt35 = Static98.aClass171_1.anInt4232;
			Static455.anInt7908 = -1;
			Static212.aFloat49 = Static98.aClass171_1.aFloat63;
			Static2.aFloat3 = Static98.aClass171_1.aFloat61;
			Static183.aClass17_1 = Static98.aClass171_1.aClass17_2;
			Static271.aFloat84 = Static98.aClass171_1.aFloat64;
		}
		Static410.aLong187 = local4;
	}
}
