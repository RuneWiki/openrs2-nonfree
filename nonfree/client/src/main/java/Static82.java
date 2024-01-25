import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "Lclient!ls;")
	public static final Class199 aClass199_2 = new Class199("RC", 1);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IBI)I")
	public static int method1635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)Lclient!kaa;")
	public static Class168 method1636(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static217.aFloat73 == 3.0D) {
				return Static180.aClass168_6;
			}
			if ((double) Static217.aFloat73 == 4.0D) {
				return Static479.aClass168_9;
			}
			if ((double) Static217.aFloat73 == 6.0D) {
				return Static413.aClass168_8;
			}
			if ((double) Static217.aFloat73 >= 8.0D) {
				return Static387.aClass168_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static217.aFloat73 == 3.0D) {
				return Static413.aClass168_8;
			}
			if ((double) Static217.aFloat73 == 4.0D) {
				return Static387.aClass168_7;
			}
			if ((double) Static217.aFloat73 == 6.0D) {
				return Static173.aClass168_5;
			}
			if ((double) Static217.aFloat73 >= 8.0D) {
				return Static68.aClass168_10;
			}
		} else if (arg0 == 2) {
			if ((double) Static217.aFloat73 == 3.0D) {
				return Static173.aClass168_5;
			}
			if ((double) Static217.aFloat73 == 4.0D) {
				return Static68.aClass168_10;
			}
			if ((double) Static217.aFloat73 == 6.0D) {
				return Static40.aClass168_1;
			}
			if ((double) Static217.aFloat73 >= 8.0D) {
				return Static121.aClass168_4;
			}
		}
		return null;
	}
}
