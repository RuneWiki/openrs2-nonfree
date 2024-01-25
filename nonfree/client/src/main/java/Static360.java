import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!lfa", name = "A", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_112 = new Class186(142, 4);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BI)Lclient!bt;")
	public static Class38 method5154(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static654.aFloat160 == 3.0D) {
				return Static702.aClass38_8;
			}
			if ((double) Static654.aFloat160 == 4.0D) {
				return Static281.aClass38_4;
			}
			if ((double) Static654.aFloat160 == 6.0D) {
				return Static11.aClass38_1;
			}
			if ((double) Static654.aFloat160 >= 8.0D) {
				return Static288.aClass38_5;
			}
		} else if (arg0 == 1) {
			if ((double) Static654.aFloat160 == 3.0D) {
				return Static11.aClass38_1;
			}
			if ((double) Static654.aFloat160 == 4.0D) {
				return Static288.aClass38_5;
			}
			if ((double) Static654.aFloat160 == 6.0D) {
				return Static155.aClass38_3;
			}
			if ((double) Static654.aFloat160 >= 8.0D) {
				return Static687.aClass38_7;
			}
		} else if (arg0 == 2) {
			if ((double) Static654.aFloat160 == 3.0D) {
				return Static155.aClass38_3;
			}
			if ((double) Static654.aFloat160 == 4.0D) {
				return Static687.aClass38_7;
			}
			if ((double) Static654.aFloat160 == 6.0D) {
				return Static419.aClass38_6;
			}
			if ((double) Static654.aFloat160 >= 8.0D) {
				return Static23.aClass38_2;
			}
		}
		return null;
	}
}
