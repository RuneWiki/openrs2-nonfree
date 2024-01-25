import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static508 {

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_101 = new Class181(58, 3);

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "Lclient!qv;")
	public static final Class271 aClass271_8 = new Class271(4, 1);

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
	public static int anInt8998 = 0;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZ)Lclient!qq;")
	public static Class269 method7547(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static461.aFloat3 == 3.0D) {
				return Static552.aClass269_11;
			}
			if ((double) Static461.aFloat3 == 4.0D) {
				return Static30.aClass269_3;
			}
			if ((double) Static461.aFloat3 == 6.0D) {
				return Static562.aClass269_13;
			}
			if ((double) Static461.aFloat3 >= 8.0D) {
				return Static134.aClass269_12;
			}
		} else if (arg0 == 1) {
			if ((double) Static461.aFloat3 == 3.0D) {
				return Static562.aClass269_13;
			}
			if ((double) Static461.aFloat3 == 4.0D) {
				return Static134.aClass269_12;
			}
			if ((double) Static461.aFloat3 == 6.0D) {
				return Static387.aClass269_9;
			}
			if ((double) Static461.aFloat3 >= 8.0D) {
				return Static101.aClass269_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static461.aFloat3 == 3.0D) {
				return Static387.aClass269_9;
			}
			if ((double) Static461.aFloat3 == 4.0D) {
				return Static101.aClass269_4;
			}
			if ((double) Static461.aFloat3 == 6.0D) {
				return Static303.aClass269_8;
			}
			if ((double) Static461.aFloat3 >= 8.0D) {
				return Static288.aClass269_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!dj;I)I")
	public static int method7551(@OriginalArg(0) Class71 arg0) {
		if (arg0 == Static408.aClass71_3) {
			return 9216;
		} else if (Static88.aClass71_1 == arg0) {
			return 34065;
		} else if (Static338.aClass71_2 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
