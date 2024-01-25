import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eq", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
	public static void method1997() {
		Static537.aClass306_38.method6936();
		Static424.aClass388_12.method9021();
		Static188.aClass388_16.method9021();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(25) int local25;
		if (arg2 <= arg3) {
			for (local25 = arg2; local25 < arg3; local25++) {
				Static120.anIntArrayArray18[local25][arg0] = arg1;
			}
		} else {
			for (local25 = arg3; local25 < arg2; local25++) {
				Static120.anIntArrayArray18[local25][arg0] = arg1;
			}
		}
	}
}
