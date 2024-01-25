import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!hba;")
	public static Class5_Sub19 aClass5_Sub19_1;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt8867 = -1;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "Z")
	public static boolean aBoolean674 = false;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	public static void method7596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class5_Sub5_Sub6 local11 = Static478.method6972((long) arg0, 5);
		local11.method2687();
		local11.anInt3058 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(FFFI)I")
	public static int method7605(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(13) float local13 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(29) float local29 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(39) float local39 = arg1 < 0.0F ? -arg1 : arg1;
		if (local29 > local13 && local39 < local29) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local13 < local39 && local39 > local29) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
