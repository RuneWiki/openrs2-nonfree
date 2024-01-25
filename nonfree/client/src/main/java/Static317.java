import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static317 {

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
	public static final int[] anIntArray582 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!jq;I)V")
	public static void method4943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2) {
		if (Static86.aClass156_4 != null || Static15.aBoolean16 || (arg2 == null || Static110.method1888(arg2) == null)) {
			return;
		}
		Static86.aClass156_4 = arg2;
		Static197.aClass156_16 = Static110.method1888(arg2);
		Static412.anInt6618 = 0;
		Static341.aBoolean437 = false;
		Static127.anInt4394 = arg0;
		Static321.anInt5867 = arg1;
	}
}
