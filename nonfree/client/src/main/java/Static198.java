import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static198 {

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "Lclient!nq;")
	public static Class144 aClass144_58;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Lclient!sg;")
	public static Class97 aClass97_15;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "[I")
	public static final int[] anIntArray311 = new int[2500];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)Lclient!bo;")
	public static Class30 method3598(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static271.aFloat47 == 3.0D) {
				return Static306.aClass30_8;
			}
			if ((double) Static271.aFloat47 == 4.0D) {
				return Static124.aClass30_3;
			}
			if ((double) Static271.aFloat47 == 6.0D) {
				return Static16.aClass30_1;
			}
			if ((double) Static271.aFloat47 >= 8.0D) {
				return Static237.aClass30_5;
			}
		} else if (arg0 == 1) {
			if ((double) Static271.aFloat47 == 3.0D) {
				return Static16.aClass30_1;
			}
			if ((double) Static271.aFloat47 == 4.0D) {
				return Static237.aClass30_5;
			}
			if ((double) Static271.aFloat47 == 6.0D) {
				return Static71.aClass30_2;
			}
			if ((double) Static271.aFloat47 >= 8.0D) {
				return Static287.aClass30_7;
			}
		} else if (arg0 == 2) {
			if ((double) Static271.aFloat47 == 3.0D) {
				return Static71.aClass30_2;
			}
			if ((double) Static271.aFloat47 == 4.0D) {
				return Static287.aClass30_7;
			}
			if ((double) Static271.aFloat47 == 6.0D) {
				return Static221.aClass30_4;
			}
			if ((double) Static271.aFloat47 >= 8.0D) {
				return Static244.aClass30_6;
			}
		}
		return null;
	}
}
