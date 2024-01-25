import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!pg;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!ut;")
	public static final Class345 aClass345_1 = new Class345(64);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
