import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static335 {

	@OriginalMember(owner = "client!qs", name = "D", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_99 = new Class186(102, 6);

	@OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
	public static int anInt5653 = 0;

	@OriginalMember(owner = "client!qs", name = "H", descriptor = "[I")
	public static final int[] anIntArray501 = new int[32];

	@OriginalMember(owner = "client!qs", name = "I", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_90 = new Class25(65, -1);

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_100 = new Class186(41, 5);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z")
	public static boolean method4766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static324.method4598(arg0, arg1) | (arg0 & 0x70000) != 0 || Static371.method5157(arg0, arg1);
	}
}
