import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public static int anInt4284 = -1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public static void method3819() {
		Static99.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!ld;)I")
	public static int method3820(@OriginalArg(1) Class12_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) Class240 local8 = arg0.aClass240_1;
		if (local8.anIntArray781 != null) {
			local8 = local8.method5567(Static248.aClass125_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt6478;
		@Pc(32) Class170 local32 = arg0.method4711();
		if (arg0.aBoolean422) {
			local28 = local8.anInt6476;
		} else if (local32.anInt4562 == arg0.anInt5339 || arg0.anInt5339 == local32.anInt4530 || local32.anInt4566 == arg0.anInt5339 || arg0.anInt5339 == local32.anInt4535) {
			local28 = local8.anInt6494;
		} else if (local32.anInt4564 == arg0.anInt5339 || arg0.anInt5339 == local32.anInt4569 || arg0.anInt5339 == local32.anInt4546 || arg0.anInt5339 == local32.anInt4533) {
			local28 = local8.anInt6467;
		}
		return local28;
	}
}
