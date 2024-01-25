import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt232;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_11 = new Class194(86, 4);

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	public static int anInt233 = -1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILclient!dw;I)Lclient!gv;")
	public static Class94_Sub2_Sub1 method237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (arg2.aBoolean180 || Static112.method1840(arg3) && Static112.method1840(arg0)) {
			return new Class94_Sub2_Sub1(arg2, 3553, arg1, arg3, arg0);
		} else if (arg2.aBoolean176) {
			return new Class94_Sub2_Sub1(arg2, 34037, arg1, arg3, arg0);
		} else {
			return new Class94_Sub2_Sub1(arg2, arg1, arg3, arg0, Static533.method1203(arg3), Static533.method1203(arg0));
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	public static void method238() {
		for (@Pc(7) int local7 = 0; local7 < Static515.anInt8713; local7++) {
			@Pc(18) int local18 = Static459.method6825(Static515.anInt8713, Static229.anInt4626 + local7) * Static492.anInt8358;
			for (@Pc(20) int local20 = 0; local20 < Static492.anInt8358; local20++) {
				@Pc(31) int local31 = Static459.method6825(Static492.anInt8358, local20 + Static38.anInt732) + local18;
				if (Static624.anInt9972 == Static241.anIntArray264[local31]) {
					Static494.anInterface7Array1[local31].method8435(0, 0, Static557.anInt9256, Static126.anInt2688, local20 * Static557.anInt9256, Static126.anInt2688 * local7);
				}
			}
		}
	}
}
