import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!in;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	public static final int[] anIntArray517 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[S")
	public static final short[] aShortArray87 = new short[] { 58, 10, 4, 21, 16, 18, 22, 30 };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
	public static int method4923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static214.anIntArray338[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII)I")
	public static int method4925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static107.method1788(arg0 - 1, arg1 + -1) + Static107.method1788(arg0 - 1, arg1 + 1) + Static107.method1788(arg0 + 1, arg1 + -1) + Static107.method1788(arg0 + 1, arg1 + 1);
		@Pc(69) int local69 = Static107.method1788(arg0, arg1 - 1) + Static107.method1788(arg0, arg1 + 1) + Static107.method1788(arg0 - 1, arg1) + Static107.method1788(arg0 + 1, arg1);
		@Pc(74) int local74 = Static107.method1788(arg0, arg1);
		return local74 / 4 + local69 / 8 + local41 / 16;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)[Lclient!lm;")
	public static Class163[] method4926() {
		return new Class163[] { Static71.aClass163_4, Static284.aClass163_12, Static92.aClass163_6, Static372.aClass163_18, Static269.aClass163_7, Static362.aClass163_17, Static317.aClass163_13, Static340.aClass163_16, Static143.aClass163_9, Static45.aClass163_1, Static337.aClass163_15, Static143.aClass163_8, Static84.aClass163_20, Static259.aClass163_11, Static325.aClass163_14 };
	}
}
