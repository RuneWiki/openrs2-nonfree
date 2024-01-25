import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	public static int anInt4919;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_30 = new Class329(15, 0, 1, 0);

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)Z")
	public static boolean method3945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static339.method4966(arg1, arg0) & ((arg1 & 0x2000) != 0 | Static266.method4068(arg0, arg1) | Static271.method4110(arg1, arg0));
	}
}
