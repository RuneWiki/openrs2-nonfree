import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public static void method2288() {
		if (!Static107.aBoolean185) {
			return;
		}
		while (true) {
			while (Static538.anInt9252 < Static372.aClass217_Sub1Array1.length) {
				@Pc(27) Class217_Sub1 local27 = Static372.aClass217_Sub1Array1[Static538.anInt9252];
				if (local27 != null && local27.anInt9136 == -1) {
					if (Static419.aClass14_Sub4_2 == null) {
						Static419.aClass14_Sub4_2 = Static7.aClass361_1.method8677(local27.aString89);
					}
					@Pc(51) int local51 = Static419.aClass14_Sub4_2.anInt458;
					if (local51 == -1) {
						return;
					}
					local27.anInt9136 = local51;
					Static538.anInt9252++;
					Static419.aClass14_Sub4_2 = null;
				} else {
					Static538.anInt9252++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)Z")
	public static boolean method2291(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBI)V")
	public static void method2292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class14_Sub3_Sub9 local16 = Static142.method2219((long) arg0, 17);
		local16.method2817();
		local16.anInt3419 = arg1;
	}
}
