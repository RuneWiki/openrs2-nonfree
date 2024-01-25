import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient!ria;")
	public static Class306 aClass306_10;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_29 = new Class357("", 14);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)Z")
	public static boolean method8985(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Z")
	public static boolean method8986(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
	public static int method8988(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static509.anIntArray561[arg1 & 0x3] : Static127.anIntArray79[arg1 & 0x3];
	}
}
