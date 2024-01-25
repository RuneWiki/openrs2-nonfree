import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!aca", name = "M", descriptor = "Lclient!pe;")
	public static Class254 aClass254_1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method210(@OriginalArg(0) Class15 arg0) {
		for (@Pc(1) int local1 = Static216.anInt4414; local1 < Static264.anInt8587; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static223.anInt4520; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static416.anInt10065; local7++) {
					@Pc(16) Class125 local16 = Static580.aClass125ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class2_Sub4 local21 = local16.aClass2_Sub4_1;
						@Pc(24) Class2_Sub4 local24 = local16.aClass2_Sub4_2;
						if (local21 != null && local21.method8388()) {
							Static174.method3120(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8388()) {
								Static174.method3120(arg0, local24, local1, local4, local7, 1, 1);
								local24.method8387(0, 0, arg0, 0, local21, false);
								local24.method8386();
							}
							local21.method8386();
						}
						for (@Pc(70) Class302 local70 = local16.aClass302_1; local70 != null; local70 = local70.aClass302_2) {
							@Pc(74) Class2_Sub2 local74 = local70.aClass2_Sub2_1;
							if (local74 != null && local74.method8388()) {
								Static174.method3120(arg0, local74, local1, local4, local7, local74.aShort121 + 1 - local74.aShort120, local74.aShort123 - local74.aShort122 + 1);
								local74.method8386();
							}
						}
						@Pc(111) Class2_Sub1 local111 = local16.aClass2_Sub1_1;
						if (local111 != null && local111.method8388()) {
							Static489.method7449(arg0, local111, local1, local4, local7);
							local111.method8386();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZLclient!cda;)I")
	public static int method213(@OriginalArg(1) Class3_Sub7_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method1499(2);
		@Pc(35) int local35;
		if (local15 == 0) {
			local35 = 0;
		} else if (local15 == 1) {
			local35 = arg0.method1499(5);
		} else if (local15 == 2) {
			local35 = arg0.method1499(8);
		} else {
			local35 = arg0.method1499(11);
		}
		return local35;
	}

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "(I)V")
	public static void method215() {
		Static228.anInt4641 = 0;
		Static200.aClass64Array1 = new Class64[50];
	}
}
