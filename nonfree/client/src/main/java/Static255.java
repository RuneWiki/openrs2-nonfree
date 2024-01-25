import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public static int anInt5644;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
	public static final int anInt5650 = 0;

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
	public static int anInt5651 = -1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	public static boolean method4808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(13) Class272 local13 = Static541.aClass349_4.method8123(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local13.method6858(arg1);
	}
}
