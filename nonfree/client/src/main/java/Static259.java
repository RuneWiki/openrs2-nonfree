import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static259 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Lclient!aea;")
	public static final Class8 aClass8_3 = new Class8();

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public static int anInt5063 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Lclient!kca;")
	public static Class189 method4293(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static392.aFloat188 == 3.0D) {
				return Static142.aClass189_4;
			}
			if ((double) Static392.aFloat188 == 4.0D) {
				return Static300.aClass189_6;
			}
			if ((double) Static392.aFloat188 == 6.0D) {
				return Static40.aClass189_1;
			}
			if ((double) Static392.aFloat188 >= 8.0D) {
				return Static533.aClass189_9;
			}
		} else if (arg0 == 1) {
			if ((double) Static392.aFloat188 == 3.0D) {
				return Static40.aClass189_1;
			}
			if ((double) Static392.aFloat188 == 4.0D) {
				return Static533.aClass189_9;
			}
			if ((double) Static392.aFloat188 == 6.0D) {
				return Static382.aClass189_7;
			}
			if ((double) Static392.aFloat188 >= 8.0D) {
				return Static112.aClass189_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static392.aFloat188 == 3.0D) {
				return Static382.aClass189_7;
			}
			if ((double) Static392.aFloat188 == 4.0D) {
				return Static112.aClass189_3;
			}
			if ((double) Static392.aFloat188 == 6.0D) {
				return Static74.aClass189_2;
			}
			if ((double) Static392.aFloat188 >= 8.0D) {
				return Static413.aClass189_8;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
	public static boolean method4294(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
