import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "J")
	public static long aLong158;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZII)V")
	public static void method3614(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static212.anInt3924 = arg1;
		Static436.anInt6898 = 3;
		Static276.method3740(Static68.aClass112_3.anInt2708, Static68.aClass112_3.aString28);
		if (arg0) {
			Static130.method1657("", "");
		} else {
			Static348.method4539();
			Static130.method1657(Static290.aString53, Static244.aString3);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I")
	public static int method3623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static105.anIntArrayArray18 == null ? 0 : Static105.anIntArrayArray18[arg0][arg1] & 0xFFFFFF;
	}
}
