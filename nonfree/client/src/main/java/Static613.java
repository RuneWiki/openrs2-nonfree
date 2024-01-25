import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "I")
	public static int anInt10345;

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "Lclient!js;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!vv", name = "q", descriptor = "Lclient!pt;")
	public static final Class265 aClass265_9 = new Class265();

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "Lclient!uw;")
	public static final Class348 aClass348_4 = new Class348("LIVE", 0);

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "I")
	public static int anInt10349 = 0;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)V")
	public static void method8352() {
		if (Static323.aClass16_13 != null) {
			Static323.aClass16_13.method6063();
			Static484.aClass27_16 = null;
			Static323.aClass16_13 = null;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "()V")
	public static void method8354() {
		for (@Pc(1) int local1 = Static535.anInt9214; local1 < Static192.anInt4507; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static489.anInt8688; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static596.anInt10195; local7++) {
					@Pc(16) Class56 local16 = Static405.aClass56ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class15_Sub1_Sub4 local21 = local16.aClass15_Sub1_Sub4_2;
						@Pc(24) Class15_Sub1_Sub4 local24 = local16.aClass15_Sub1_Sub4_1;
						if (local21 != null && local21.method8332()) {
							Static393.method6284(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8332()) {
								Static393.method6284(local24, local1, local4, local7, 1, 1);
								local24.method8322(false, Static269.aClass16_11, local21, 0, 0, 0);
								local24.method8317();
							}
							local21.method8317();
						}
						for (@Pc(68) Class152 local68 = local16.aClass152_2; local68 != null; local68 = local68.aClass152_3) {
							@Pc(72) Class15_Sub1_Sub2 local72 = local68.aClass15_Sub1_Sub2_1;
							if (local72 != null && local72.method8332()) {
								Static393.method6284(local72, local1, local4, local7, local72.aShort104 + 1 - local72.aShort105, local72.aShort106 - local72.aShort103 + 1);
								local72.method8317();
							}
						}
						@Pc(108) Class15_Sub1_Sub3 local108 = local16.aClass15_Sub1_Sub3_1;
						if (local108 != null && local108.method8332()) {
							Static241.method4437(local108, local1, local4, local7);
							local108.method8317();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
	public static void method8355() {
		@Pc(9) int[] local9 = new int[Static497.aClass258_21.anInt8017];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static497.aClass258_21.anInt8017; local13++) {
			@Pc(20) Class284 local20 = Static497.aClass258_21.method6652(local13);
			if (local20.anInt8518 >= 0 || local20.anInt8531 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static432.anIntArray438 = new int[local11];
		for (@Pc(46) int local46 = 0; local46 < local11; local46++) {
			Static432.anIntArray438[local46] = local9[local46];
		}
	}
}
