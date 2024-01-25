import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_68 = new Class349(83, 11);

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
	public static int[] anIntArray304 = new int[1];

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_6 = new Class222("", 17);

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
	public static int method3610(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
	public static boolean method3614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static23.method329(arg1, arg0) || Static347.method5021(arg1, arg0);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	public static void method3615() {
		Static124.aClass21_95.method313();
	}
}
