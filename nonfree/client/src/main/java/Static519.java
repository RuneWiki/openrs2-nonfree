import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static519 {

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!wm;")
	public static Class390 aClass390_100;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_201 = new Class359(100, 1);

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)[Lclient!dl;")
	public static Class87[] method7342() {
		return new Class87[] { Static136.aClass87_1, Static329.aClass87_3, Static207.aClass87_2 };
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public static void method7343() {
		Static505.aClass340_50.method7996(50);
		Static598.aClass340_61.method7996(50);
		Static399.aClass340_41.method7996(50);
		Static553.aClass340_57.method7996(50);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I")
	public static int method7345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static200.anIntArray189[arg1 & 0x3] : Static416.anIntArray419[arg1 & 0x3];
	}
}
