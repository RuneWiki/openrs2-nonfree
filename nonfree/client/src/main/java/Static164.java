import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Lclient!wr;")
	public static Class5_Sub2_Sub18 aClass5_Sub2_Sub18_3;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
	public static int anInt2787;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_72 = new Class129(40, 4);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2261(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = Static318.method3932(arg0.charAt(local19)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
	public static void method2262() {
		if (Static265.anInt4230 != -1) {
			Static209.method2790(false, Static265.anInt4230, -1, -1);
			Static265.anInt4230 = -1;
		}
	}
}
