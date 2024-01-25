import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
	public static int anInt6382;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject13 = null;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "[I")
	public static final int[] anIntArray364 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIII[BB)Z")
	public static boolean method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class3_Sub11 local17 = new Class3_Sub11(arg4);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local17.method5218();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(99) Class280 local99;
				do {
					@Pc(68) int local68;
					@Pc(73) int local73;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method5217();
										if (local39 == 0) {
											continue label68;
										}
										local17.method5175();
									}
									local39 = local17.method5217();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local17.method5175() >> 2;
									local68 = local57 + arg1;
									local73 = local51 + arg2;
								} while (local68 <= 0);
							} while (local73 <= 0);
						} while (arg0 - 1 <= local68);
					} while (arg3 - 1 <= local73);
					local99 = Static478.aClass212_3.method4793(local19);
				} while (local63 == 22 && !Static405.aClass3_Sub3_Sub1_1.aBoolean591 && local99.anInt7380 == 0 && local99.anInt7359 != 1 && !local99.aBoolean549);
				local33 = true;
				if (!local99.method6175()) {
					Static303.anInt5123++;
					local7 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)I")
	public static int method5424(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}
