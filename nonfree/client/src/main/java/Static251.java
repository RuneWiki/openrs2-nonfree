import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static251 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "J")
	public static long aLong170;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI)Z")
	public static boolean method5133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
