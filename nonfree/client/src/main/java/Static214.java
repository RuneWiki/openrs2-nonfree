import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!bt;")
	public static final Class43 aClass43_7 = new Class43();

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "[J")
	public static final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
	public static boolean method3114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
