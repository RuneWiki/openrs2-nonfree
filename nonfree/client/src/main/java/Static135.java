import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
	public static int anInt2883;

	@OriginalMember(owner = "client!gt", name = "D", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_52 = new Class265(53, 2);

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Z")
	public static boolean method2303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Z")
	public static boolean method2305(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZ)V")
	public static void method2306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(0, 15);
		local8.method4547();
		local8.anInt5641 = arg0;
		local8.anInt5643 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V")
	public static void method2307(@OriginalArg(1) int arg0) {
		if (Static195.anIntArray332 == null || Static195.anIntArray332.length < arg0) {
			Static195.anIntArray332 = new int[arg0];
		}
	}
}
