import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public static int anInt4205;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!qfa;")
	public static Class272 aClass272_125;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_6 = new Class158(13, 0, 1, 0);

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_126 = new Class272(65, 11);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
	public static boolean method3720() {
		return Static246.anInt4542 >= 1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!r;)V")
	public static void method3722(@OriginalArg(1) Class43 arg0) {
		for (@Pc(10) Class9_Sub6 local10 = (Class9_Sub6) Static337.aClass309_10.method6590(); local10 != null; local10 = (Class9_Sub6) Static337.aClass309_10.method6594()) {
			if (local10.aBoolean276) {
				local10.method3057(arg0);
			}
		}
	}
}
