import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!eo;")
	public static Class68 aClass68_3;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public static int anInt2603 = 0;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIB)I")
	public static int method2152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static308.anIntArray419[arg1 & 0x3] : 256;
	}
}
