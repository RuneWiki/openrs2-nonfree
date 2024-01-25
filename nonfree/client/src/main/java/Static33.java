import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

	@OriginalMember(owner = "client!bda", name = "bd", descriptor = "Lclient!io;")
	public static final Class148 aClass148_1 = new Class148(1, 2, 2, 0);

	@OriginalMember(owner = "client!bda", name = "qd", descriptor = "I")
	public static int anInt859 = -1;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIB)Z")
	public static boolean method799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
