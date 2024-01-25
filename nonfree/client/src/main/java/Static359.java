import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Lclient!ep;")
	public static final Class103 aClass103_4 = new Class103("RC", 1);

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_30 = new Class265(64);

	@OriginalMember(owner = "client!md", name = "M", descriptor = "[I")
	public static final int[] anIntArray277 = new int[1000];

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(III)Z")
	public static boolean method4146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Lclient!pb;")
	public static Class267 method4147(@OriginalArg(0) int arg0) {
		@Pc(10) Class267[] local10 = Static174.method2564();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class267 local18 = local10[local12];
			if (local18.anInt7763 == arg0) {
				return local18;
			}
		}
		return null;
	}
}
