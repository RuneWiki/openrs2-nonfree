import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
	public static int anInt9405;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public static int anInt9400 = 0;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!db;")
	public static final Class64 aClass64_466 = new Class64(49, -1);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V")
	public static void method7722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(15, 0);
		local8.method3066();
		local8.anInt3348 = arg1;
		local8.anInt3353 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method7723() {
		if (Static11.aClass66_1 != null) {
			Static11.aClass66_1.method6838();
			Static11.aClass66_1 = null;
			Static56.aClass91_3 = null;
		}
	}
}
