import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	public static int anInt10076;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_94 = new Class208(57, 0);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BJ)V")
	public static void method8504(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static614.anInt10099;
		@Pc(13) int local13 = Static559.anInt9491;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (local11 != Static96.anInt1900) {
			local25 = local11 - Static96.anInt1900;
			local33 = (int) ((long) local25 * arg0 / 320L);
			if (local25 > 0) {
				if (local33 == 0) {
					local33 = 1;
				} else if (local25 < local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = -1;
			} else if (local25 > local33) {
				local33 = local25;
			}
			Static96.anInt1900 += local33;
		}
		Static284.aFloat164 += (float) arg0 * Static48.aFloat15 / 40.0F * 8.0F;
		if (Static359.anInt6657 != local13) {
			local25 = local13 - Static359.anInt6657;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local33 < local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local25 < local33) {
				local33 = local25;
			}
			Static359.anInt6657 += local33;
		}
		Static591.aFloat197 += (float) arg0 * Static495.aFloat180 / 40.0F * 8.0F;
		Static27.method482();
	}
}
