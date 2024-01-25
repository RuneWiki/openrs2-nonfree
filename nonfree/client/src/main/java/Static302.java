import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static302 {

	@OriginalMember(owner = "client!maa", name = "u", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_105 = new Class73(37, 12);

	@OriginalMember(owner = "client!maa", name = "w", descriptor = "[I")
	public static final int[] anIntArray412 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!maa", name = "y", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_106 = new Class73(65, 4);

	@OriginalMember(owner = "client!maa", name = "z", descriptor = "Lclient!rr;")
	public static Class292 aClass292_5 = null;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)I")
	public static int method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static132.aShortArrayArray1 == null ? 0 : Static132.aShortArrayArray1[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIII)V")
	public static void method4795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static154.aByteArrayArrayArray4 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!jaa;BIIII)Lclient!hq;")
	public static Class51_Sub1_Sub1 method4796(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean311 || Static404.method5927(arg2) && Static404.method5927(arg3)) {
			return new Class51_Sub1_Sub1(arg0, 3553, arg1, arg4, arg2, arg3, true);
		} else if (arg0.aBoolean299) {
			return new Class51_Sub1_Sub1(arg0, 34037, arg1, arg4, arg2, arg3, true);
		} else {
			return new Class51_Sub1_Sub1(arg0, arg1, arg4, arg2, arg3, Static253.method4296(arg2), Static253.method4296(arg3), true);
		}
	}
}
