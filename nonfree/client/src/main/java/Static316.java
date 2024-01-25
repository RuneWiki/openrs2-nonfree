import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "[I")
	public static int[] anIntArray580;

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
	public static int anInt5813;

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "Lclient!im;")
	public static final Class140 aClass140_82 = new Class140(63, 3);

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
	public static int anInt5814 = 0;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)Z")
	public static boolean method4933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static475.method5204(arg0, arg1) | (arg0 & 0x70000) != 0 || Static499.method6935(arg1, arg0);
	}
}
