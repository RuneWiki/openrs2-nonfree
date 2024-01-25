import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gia", name = "B", descriptor = "Lclient!bw;")
	public static final Class43 aClass43_1 = new Class43(true);

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V")
	public static void method2972() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static111.anInt1752; local9++) {
			for (@Pc(21) int local21 = 0; local21 < Static279.anInt4567; local21++) {
				if (Static649.method8907(local7, local21, true, local9, Static535.aClass156ArrayArrayArray2)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)V")
	public static void method2975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static139.method2092(local7.aClass14_Sub1_Sub2_2);
		Static139.method2092(local7.aClass14_Sub1_Sub2_1);
		if (local7.aClass14_Sub1_Sub2_2 != null) {
			local7.aClass14_Sub1_Sub2_2 = null;
		}
		if (local7.aClass14_Sub1_Sub2_1 != null) {
			local7.aClass14_Sub1_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
	public static void method2976() {
		Static214.method3254(11);
		Static636.method8772();
		System.gc();
	}
}
