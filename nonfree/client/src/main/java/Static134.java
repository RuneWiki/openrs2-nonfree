import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	public static int anInt2212;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	public static int anInt2213;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	public static int anInt2214;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_61 = new Class136(35, -2);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Z")
	public static boolean method1997(@OriginalArg(0) int arg0) {
		return arg0 == 21 || arg0 == 46 || arg0 == 9 || arg0 == 44 || arg0 == 60 || arg0 == 22 || arg0 == 25;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method1999(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static655.method4109(arg0, arg1, local11, 0, 32768);
		return local11;
	}
}
