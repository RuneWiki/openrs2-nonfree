import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "I")
	public static int anInt2317;

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "Lclient!el;")
	public static final Class109 aClass109_60 = new Class109(66, 4);

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "I")
	public static int anInt2319 = 0;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(III)Z")
	public static boolean method2010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
