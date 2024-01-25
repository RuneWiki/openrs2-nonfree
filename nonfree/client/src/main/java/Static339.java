import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static339 {

	@OriginalMember(owner = "client!re", name = "G", descriptor = "I")
	public static int anInt5870;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "I")
	public static int anInt5874;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "Lclient!ji;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_80 = new Class215(34, 11);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)Z")
	public static boolean method4609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static303.method4110(arg1, arg0) | (arg1 & 0x800) != 0 || Static13.method137(arg0, arg1);
	}
}
