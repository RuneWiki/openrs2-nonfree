import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIIII)V")
	public static void method816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg2; local3++) {
			Static482.method7040(arg1, arg0, Static384.anIntArrayArray38[local3], arg4);
		}
		if (true) {
			;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!rba;B)Lclient!bca;")
	public static Class21_Sub2 method817(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(15) Class21 local15 = Static582.method8682(arg0);
		@Pc(19) int local19 = arg0.method5312();
		@Pc(23) int local23 = arg0.method5312();
		@Pc(27) int local27 = arg0.method5272();
		return new Class21_Sub2(local15.aClass304_9, local15.aClass216_9, local15.anInt3469, local15.anInt3465, local15.anInt3462, local15.anInt3460, local15.anInt3467, local15.anInt3463, local15.anInt3466, local19, local23, local27);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FZ)F")
	public static float method819(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}
}
