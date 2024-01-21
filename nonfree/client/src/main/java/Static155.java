import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static int anInt3844;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1314 = Static146.method2172("Abbrechen");

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1316 = Static146.method2172("Loaded interfaces");

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1315 = aClass77_1316;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1317 = Static146.method2172("(U4");

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1318 = Static146.method2172("<col=ff3000>");

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1319 = Static146.method2172("Loaded textures");

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1320 = aClass77_1319;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method2643() {
		if (Static84.aClass30_2 != null) {
			@Pc(7) Class30 local7 = Static84.aClass30_2;
			synchronized (Static84.aClass30_2) {
				Static84.aClass30_2 = null;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!v;)V")
	public static void method2644(@OriginalArg(1) Class2_Sub2_Sub1_Sub6 arg0) {
		arg0.aBoolean180 = false;
		@Pc(13) Class2_Sub2_Sub15 local13;
		if (arg0.anInt4389 != -1) {
			local13 = Static140.method2333(arg0.anInt4389);
			if (local13 == null || local13.anIntArray548 == null) {
				arg0.anInt4389 = -1;
			} else {
				arg0.anInt4391++;
				if (local13.anIntArray548.length > arg0.anInt4373 && arg0.anInt4391 > local13.anIntArray549[arg0.anInt4373]) {
					arg0.anInt4373++;
					arg0.anInt4391 = 1;
					Static57.method2989(local13, arg0.anInt4400, arg0 == Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11, arg0.anInt4373, arg0.anInt4385);
				}
				if (arg0.anInt4373 >= local13.anIntArray548.length) {
					arg0.anInt4373 = 0;
					arg0.anInt4391 = 0;
					Static57.method2989(local13, arg0.anInt4400, arg0 == Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11, arg0.anInt4373, arg0.anInt4385);
				}
			}
		}
		if (arg0.anInt4404 != -1 && Static143.anInt3513 >= arg0.anInt4382) {
			if (arg0.anInt4390 < 0) {
				arg0.anInt4390 = 0;
			}
			@Pc(128) int local128 = Static41.method808(arg0.anInt4404).anInt1862;
			if (local128 == -1) {
				arg0.anInt4404 = -1;
			} else {
				@Pc(140) Class2_Sub2_Sub15 local140 = Static140.method2333(local128);
				if (local140 == null || local140.anIntArray548 == null) {
					arg0.anInt4404 = -1;
				} else {
					arg0.anInt4411++;
					if (arg0.anInt4390 < local140.anIntArray548.length && arg0.anInt4411 > local140.anIntArray549[arg0.anInt4390]) {
						arg0.anInt4411 = 1;
						arg0.anInt4390++;
						Static57.method2989(local140, arg0.anInt4400, arg0 == Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11, arg0.anInt4390, arg0.anInt4385);
					}
					if (arg0.anInt4390 >= local140.anIntArray548.length && (arg0.anInt4390 < 0 || local140.anIntArray548.length <= arg0.anInt4390)) {
						arg0.anInt4404 = -1;
					}
				}
			}
		}
		if (arg0.anInt4399 != -1 && arg0.anInt4376 <= 1) {
			local13 = Static140.method2333(arg0.anInt4399);
			if (local13.anInt3727 == 1 && arg0.anInt4421 > 0 && Static143.anInt3513 >= arg0.anInt4396 && Static143.anInt3513 > arg0.anInt4414) {
				arg0.anInt4376 = 1;
				return;
			}
		}
		if (arg0.anInt4399 != -1 && arg0.anInt4376 == 0) {
			local13 = Static140.method2333(arg0.anInt4399);
			if (local13 == null || local13.anIntArray548 == null) {
				arg0.anInt4399 = -1;
			} else {
				arg0.anInt4394++;
				if (local13.anIntArray548.length > arg0.anInt4406 && local13.anIntArray549[arg0.anInt4406] < arg0.anInt4394) {
					arg0.anInt4394 = 1;
					arg0.anInt4406++;
					Static57.method2989(local13, arg0.anInt4400, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11 == arg0, arg0.anInt4406, arg0.anInt4385);
				}
				if (local13.anIntArray548.length <= arg0.anInt4406) {
					arg0.anInt4408++;
					arg0.anInt4406 -= local13.anInt3736;
					if (local13.anInt3732 <= arg0.anInt4408) {
						arg0.anInt4399 = -1;
					} else if (arg0.anInt4406 >= 0 && arg0.anInt4406 < local13.anIntArray548.length) {
						Static57.method2989(local13, arg0.anInt4400, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11 == arg0, arg0.anInt4406, arg0.anInt4385);
					} else {
						arg0.anInt4399 = -1;
					}
				}
				arg0.aBoolean180 = local13.aBoolean151;
			}
		}
		if (arg0.anInt4376 > 0) {
			arg0.anInt4376--;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method2645() {
		Static101.aClass82_41.method2698();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	public static void method2646() {
		aClass77_1320 = null;
		aClass77_1319 = null;
		aClass77_1314 = null;
		aClass77_1315 = null;
		aClass77_1316 = null;
		aClass77_1317 = null;
		aClass77_1318 = null;
	}
}
