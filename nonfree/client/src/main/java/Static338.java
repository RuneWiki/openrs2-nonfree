import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "Lclient!pq;")
	public static Class191 aClass191_3;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
	public static int anInt5687;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIBLclient!ga;)V")
	public static void method4720(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class82 arg3) {
		@Pc(12) int local12 = arg3.anInt2192;
		if (arg3.aByte22 == 0) {
			arg3.anInt2192 = arg3.anInt2272;
		} else if (arg3.aByte22 == 1) {
			arg3.anInt2192 = arg2 - arg3.anInt2272;
		} else if (arg3.aByte22 == 2) {
			arg3.anInt2192 = arg3.anInt2272 * arg2 >> 14;
		}
		@Pc(49) int local49 = arg3.anInt2216;
		if (arg3.aByte21 == 0) {
			arg3.anInt2216 = arg3.anInt2235;
		} else if (arg3.aByte21 == 1) {
			arg3.anInt2216 = arg0 - arg3.anInt2235;
		} else if (arg3.aByte21 == 2) {
			arg3.anInt2216 = arg0 * arg3.anInt2235 >> 14;
		}
		if (arg3.aByte22 == 4) {
			arg3.anInt2192 = arg3.anInt2216 * arg3.anInt2250 / arg3.anInt2189;
		}
		if (arg3.aByte21 == 4) {
			arg3.anInt2216 = arg3.anInt2192 * arg3.anInt2189 / arg3.anInt2250;
		}
		if (Static64.aBoolean82 && (Static54.method1060(arg3).anInt6593 != 0 || arg3.anInt2252 == 0)) {
			if (arg3.anInt2216 < 5 && arg3.anInt2192 < 5) {
				arg3.anInt2192 = 5;
				arg3.anInt2216 = 5;
			} else {
				if (arg3.anInt2216 <= 0) {
					arg3.anInt2216 = 5;
				}
				if (arg3.anInt2192 <= 0) {
					arg3.anInt2192 = 5;
				}
			}
		}
		if (Static228.anInt3814 == arg3.anInt2201) {
			Static135.aClass82_9 = arg3;
		}
		if (arg1 && arg3.anObjectArray10 != null && (local12 != arg3.anInt2192 || arg3.anInt2216 != local49)) {
			@Pc(189) Class3_Sub15 local189 = new Class3_Sub15();
			local189.aClass82_1 = arg3;
			local189.anObjectArray3 = arg3.anObjectArray10;
			Static458.aClass193_69.method4527(local189);
		}
	}
}
