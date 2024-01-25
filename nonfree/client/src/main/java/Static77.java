import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)[Lclient!qj;")
	public static Class277[] method1607() {
		return new Class277[] { Static79.aClass277_2, Static525.aClass277_17, Static31.aClass277_1, Static424.aClass277_13, Static516.aClass277_16, Static232.aClass277_9, Static400.aClass277_12, Static493.aClass277_15, Static168.aClass277_6, Static208.aClass277_8, Static276.aClass277_10, Static515.aClass277_7, Static157.aClass277_5, Static472.aClass277_14, Static375.aClass277_11 };
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(JB)V")
	public static void method1608(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
