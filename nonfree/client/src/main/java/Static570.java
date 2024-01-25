import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static570 {

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public static int anInt9678;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public static int anInt9679;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!ug;")
	public static final Class333 aClass333_1 = new Class333(0, 3, Static137.aClass89_12);

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!ug;")
	public static final Class333 aClass333_2 = new Class333(1, 3, Static137.aClass89_12);

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!ug;")
	public static final Class333 aClass333_3 = new Class333(2, 4, Static137.aClass89_8);

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!ug;")
	public static final Class333 aClass333_4 = new Class333(3, 1, Static137.aClass89_12);

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!ug;")
	public static final Class333 aClass333_5 = new Class333(4, 2, Static137.aClass89_12);

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!ug;")
	public static final Class333 aClass333_6 = new Class333(5, 3, Static137.aClass89_12);

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Lclient!ug;")
	public static final Class333 aClass333_7 = new Class333(6, 4, Static137.aClass89_12);

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public static final int anInt9677 = Static539.method7665(16);

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray97 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)Lclient!ug;")
	public static Class333 method7995(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass333_1;
		} else if (arg0 == 1) {
			return aClass333_2;
		} else if (arg0 == 2) {
			return aClass333_3;
		} else if (arg0 == 3) {
			return aClass333_4;
		} else if (arg0 == 4) {
			return aClass333_5;
		} else if (arg0 == 5) {
			return aClass333_6;
		} else if (arg0 == 6) {
			return aClass333_7;
		} else {
			return null;
		}
	}
}
