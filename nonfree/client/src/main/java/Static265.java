import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Z")
	public static boolean aBoolean367 = true;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_112 = new Class362(117, 6);

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_113 = new Class362(21, 2);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!mt;B)Lclient!mt;")
	public static Class4_Sub7_Sub3 method4455(@OriginalArg(0) Class4_Sub7_Sub3 arg0) {
		@Pc(19) Class4_Sub7_Sub3 local19 = arg0 == null ? new Class4_Sub7_Sub3() : new Class4_Sub7_Sub3(arg0);
		local19.method5466();
		return local19;
	}
}
