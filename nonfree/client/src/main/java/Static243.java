import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "B")
	public static byte aByte65;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString185 = null;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Z")
	public static boolean aBoolean429 = true;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString186 = null;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIZ)I")
	public static int method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	public static int method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static170.anIntArrayArray37 == null ? 0 : Static170.anIntArrayArray37[arg0][arg1] >>> 21 & 0x7F8;
	}
}
