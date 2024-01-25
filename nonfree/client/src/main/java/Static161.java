import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "[J")
	public static final long[] aLongArray11 = new long[100];

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)Z")
	public static boolean method2612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static601.method7730(arg1, arg0) | (arg1 & 0x70000) != 0 || Static493.method6693(arg1, arg0);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)Z")
	public static boolean method2613(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
