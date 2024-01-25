import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
	public static int anInt2804;

	@OriginalMember(owner = "client!eka", name = "h", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_46 = new Class186(136, 5);

	@OriginalMember(owner = "client!eka", name = "k", descriptor = "I")
	public static int anInt2805 = 0;

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_47 = new Class186(18, 3);

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(III)I")
	public static int method2438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static116.anIntArray111[arg1 & 0x3] : Static548.anIntArray506[arg1 & 0x3];
	}
}
