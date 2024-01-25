import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public static int anInt3302 = 0;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray73 = new boolean[100];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V")
	public static void method3004(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static16.method490(arg0 - 1L);
			Static16.method490(1L);
		} else {
			Static16.method490(arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lclient!pc;")
	public static Class176 method3005(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static302.aFloat7 == 3.0D) {
				return Static155.aClass176_6;
			}
			if ((double) Static302.aFloat7 == 4.0D) {
				return Static170.aClass176_7;
			}
			if ((double) Static302.aFloat7 == 6.0D) {
				return Static172.aClass176_8;
			}
			if ((double) Static302.aFloat7 >= 8.0D) {
				return Static13.aClass176_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static302.aFloat7 == 3.0D) {
				return Static172.aClass176_8;
			}
			if ((double) Static302.aFloat7 == 4.0D) {
				return Static13.aClass176_1;
			}
			if ((double) Static302.aFloat7 == 6.0D) {
				return Static386.aClass176_3;
			}
			if ((double) Static302.aFloat7 >= 8.0D) {
				return Static135.aClass176_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static302.aFloat7 == 3.0D) {
				return Static386.aClass176_3;
			}
			if ((double) Static302.aFloat7 == 4.0D) {
				return Static135.aClass176_5;
			}
			if ((double) Static302.aFloat7 == 6.0D) {
				return Static118.aClass176_4;
			}
			if ((double) Static302.aFloat7 >= 8.0D) {
				return Static369.aClass176_9;
			}
		}
		return null;
	}
}
