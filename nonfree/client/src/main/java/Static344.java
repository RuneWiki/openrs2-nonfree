import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static344 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public static int anInt6182;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Lclient!fc;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	public static int anInt6187;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	public static int anInt6188;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "[Lclient!sk;")
	public static final Class150[] aClass150Array1 = new Class150[128];

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)I")
	public static int method4802() {
		return Static13.anInt399;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BII)Z")
	public static boolean method4803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
