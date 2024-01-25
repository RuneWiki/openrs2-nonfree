import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!wu;")
	public static Class384 aClass384_57;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_88 = new Class136(4, 1);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(CI)I")
	public static int method3661(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class190.anIntArray377.length ? Class190.anIntArray377[arg0] : -1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)Lclient!pf;")
	public static Class5_Sub40 method3662() {
		return Static639.anInt10354 == 0 ? new Class5_Sub40() : Static475.aClass5_Sub40Array7[--Static639.anInt10354];
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(FFFB)I")
	public static int method3663(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local21 > local12 && local21 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local35 > local21) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
