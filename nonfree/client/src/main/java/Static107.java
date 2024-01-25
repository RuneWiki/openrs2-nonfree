import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
	public static int anInt2175;

	@OriginalMember(owner = "client!dw", name = "ib", descriptor = "Lclient!th;")
	public static Class312 aClass312_1;

	@OriginalMember(owner = "client!dw", name = "Zb", descriptor = "J")
	public static long aLong100;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)I")
	public static int method1921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static512.anIntArray584[arg1 & 0x3] : Static194.anIntArray221[arg1 & 0x3];
	}
}
