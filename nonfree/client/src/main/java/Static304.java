import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Lclient!nt;")
	public static Class173 aClass173_4;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "Lclient!wt;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_70 = new Class44(75, -1);

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	public static int anInt5397 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)Z")
	public static boolean method4372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)Z")
	public static boolean method4373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static67.method1264(arg1, arg0) | (arg1 & 0x70000) != 0 || Static266.method3986(arg1, arg0);
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(II)Lclient!fr;")
	public static Class90 method4377(@OriginalArg(1) int arg0) {
		@Pc(8) Class90[] local8 = Static351.method4912();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class90 local24 = local8[local18];
			if (arg0 == local24.anInt2417) {
				return local24;
			}
		}
		return null;
	}
}
