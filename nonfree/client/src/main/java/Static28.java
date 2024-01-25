import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[J")
	public static final long[] aLongArray34 = new long[100];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!wn;")
	public static Class269 method5136(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static98.aFloat84 == 3.0D) {
				return Static276.aClass269_39;
			}
			if ((double) Static98.aFloat84 == 4.0D) {
				return Static119.aClass269_28;
			}
			if ((double) Static98.aFloat84 == 6.0D) {
				return Static26.aClass269_8;
			}
			if ((double) Static98.aFloat84 >= 8.0D) {
				return Static263.aClass269_36;
			}
		} else if (arg0 == 1) {
			if ((double) Static98.aFloat84 == 3.0D) {
				return Static26.aClass269_8;
			}
			if ((double) Static98.aFloat84 == 4.0D) {
				return Static263.aClass269_36;
			}
			if ((double) Static98.aFloat84 == 6.0D) {
				return Static260.aClass269_35;
			}
			if ((double) Static98.aFloat84 >= 8.0D) {
				return Static405.aClass269_50;
			}
		} else if (arg0 == 2) {
			if ((double) Static98.aFloat84 == 3.0D) {
				return Static260.aClass269_35;
			}
			if ((double) Static98.aFloat84 == 4.0D) {
				return Static405.aClass269_50;
			}
			if ((double) Static98.aFloat84 == 6.0D) {
				return Static102.aClass269_14;
			}
			if ((double) Static98.aFloat84 >= 8.0D) {
				return Static251.aClass269_32;
			}
		}
		return null;
	}
}
