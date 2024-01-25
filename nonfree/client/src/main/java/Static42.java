import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!pq;")
	public static Class251 aClass251_152;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
	public static int anInt9216;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)Z")
	public static boolean method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static550.method7576(arg0, arg1) || Static374.method5478(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static252.method3570(arg0, arg1);
		}
	}
}
