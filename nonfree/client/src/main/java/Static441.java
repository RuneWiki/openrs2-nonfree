import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
	public static int anInt7393;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_179 = new Class25(34, -1);

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Z")
	public static boolean aBoolean501 = false;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)I")
	public static int method5937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static326.aByteArrayArrayArray15[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static326.aByteArrayArrayArray15[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
