import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!lka", name = "q", descriptor = "I")
	public static int anInt5889;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "I")
	public static int anInt5896;

	@OriginalMember(owner = "client!lka", name = "v", descriptor = "I")
	public static int anInt5900;

	@OriginalMember(owner = "client!lka", name = "l", descriptor = "I")
	public static int anInt5884 = 0;

	@OriginalMember(owner = "client!lka", name = "o", descriptor = "I")
	public static int anInt5903 = -1;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IBI)Z")
	public static boolean method5276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
