import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Z")
	public static boolean method989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static61.method1332(arg0, arg1) | (arg1 & 0x60000) != 0 || Static401.method6295(arg0, arg1) || Static329.method5265(arg1, arg0);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)I")
	public static int method990() {
		return Static139.anIntArray225 == null ? 0 : Static139.anIntArray225.length * 2;
	}
}
