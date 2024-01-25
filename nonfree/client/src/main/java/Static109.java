import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_32 = new Class186(69, 6);

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "Lclient!m;")
	public static final Class235 aClass235_14 = new Class235(20);

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "[I")
	public static final int[] anIntArray107 = new int[2];

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IBI)V")
	public static void method1953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(17, (long) arg1);
		local9.method630();
		local9.anInt803 = arg0;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)Lclient!bs;")
	public static Class3_Sub12 method1955() {
		if (Static654.aClass357_50 == null || Static580.aClass60_1 == null) {
			return null;
		}
		for (@Pc(26) Class3_Sub12 local26 = (Class3_Sub12) Static580.aClass60_1.method1305(); local26 != null; local26 = (Class3_Sub12) Static580.aClass60_1.method1305()) {
			@Pc(34) Class105 local34 = Static654.aClass98_4.method2452(local26.anInt950);
			if (local34 != null && local34.aBoolean251 && local34.method2655(Static654.anInterface10_2)) {
				return local26;
			}
		}
		return null;
	}
}
