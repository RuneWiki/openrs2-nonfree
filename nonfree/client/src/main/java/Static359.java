import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	public static int anInt9617;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "Lclient!kha;")
	public static Class181 aClass181_114;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
	public static int anInt9618 = 0;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	public static void method7954() {
		Static173.method8281();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Lclient!pda;")
	public static Class2_Sub3_Sub3 method7955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub3_Sub3_1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZB)I")
	public static int method7957(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = Static178.anInt4220;
		if (local13 == 0) {
			return arg0 ? 0 : Static640.anInt10507;
		} else if (local13 == 1) {
			return Static640.anInt10507;
		} else if (local13 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(CI)Z")
	public static boolean method7960(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
