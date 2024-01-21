import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!e", name = "U", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_333 = Static177.method3050("(U0a )2 in: ");

	@OriginalMember(owner = "client!e", name = "V", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_334 = Static177.method3050("(Y<)4col>");

	@OriginalMember(owner = "client!e", name = "W", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_335 = Static177.method3050("::autoshadow on");

	@OriginalMember(owner = "client!e", name = "X", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_336 = Static177.method3050("Weiter");

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_337 = Static177.method3050("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V")
	public static void method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt1040; local12++) {
			@Pc(18) Class86 local18 = local7.aClass86Array1[local12];
			if ((local18.aLong129 >> 29 & 0x3L) == 2L && local18.anInt3583 == arg1 && local18.anInt3581 == arg2) {
				Static60.method1146(local18);
				return;
			}
		}
	}
}
