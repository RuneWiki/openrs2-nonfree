import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_169 = new Class337(48, -2);

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_108 = new Class46(34, 2);

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_109 = new Class46(10, 0);

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_18 = new Class216(0, 2, 2, 1);

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "J")
	public static long aLong275 = 0L;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method8976() {
		for (@Pc(14) Class5_Sub21 local14 = (Class5_Sub21) Static115.aClass273_5.method6577(); local14 != null; local14 = (Class5_Sub21) Static115.aClass273_5.method6589()) {
			if (local14.aClass73_Sub1_1.method5422()) {
				Static563.method8170(local14.anInt2436);
			} else {
				local14.aClass73_Sub1_1.method5427();
				try {
					local14.aClass73_Sub1_1.method5412();
				} catch (@Pc(39) Exception local39) {
					Static524.method7740(local39, "TV: " + local14.anInt2436);
					Static563.method8170(local14.anInt2436);
				}
				if (!local14.aBoolean187 && !local14.aBoolean188) {
					@Pc(65) Class5_Sub34_Sub1 local65 = local14.aClass73_Sub1_1.method5416();
					if (local65 != null) {
						@Pc(71) Class5_Sub1_Sub3 local71 = local65.method5206();
						if (local71 != null) {
							local71.method7606(local14.anInt2440);
							Static26.aClass5_Sub1_Sub2_1.method5055(local71);
							local14.aBoolean187 = true;
						}
					}
				}
			}
		}
	}
}
