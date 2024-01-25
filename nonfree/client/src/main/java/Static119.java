import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_20 = new Class305(90, -1);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
	public static int method2232(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
