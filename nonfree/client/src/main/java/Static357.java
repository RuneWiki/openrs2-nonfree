import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Lclient!dn;")
	public static Class2_Sub13 aClass2_Sub13_1;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
	public static final int[] anIntArray509 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "J")
	public static long aLong217 = 0L;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[BII)Z")
	public static boolean method6003(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class2_Sub10 local12 = new Class2_Sub10(arg1);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local12.method4448();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(104) Class96 local104;
				do {
					@Pc(74) int local74;
					@Pc(79) int local79;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local12.method4441();
										if (local42 == 0) {
											continue label68;
										}
										local12.method4421();
									}
									local42 = local12.method4441();
									if (local42 == 0) {
										continue label68;
									}
									local34 += local42 - 1;
									@Pc(57) int local57 = local34 & 0x3F;
									@Pc(63) int local63 = local34 >> 6 & 0x3F;
									local69 = local12.method4421() >> 2;
									local74 = local63 + arg2;
									local79 = local57 + arg0;
								} while (local74 <= 0);
							} while (local79 <= 0);
						} while (Static95.anInt6381 - 1 <= local74);
					} while (Static237.anInt4532 - 1 <= local79);
					local104 = Static234.method4051(local19);
				} while (local69 == 22 && !Static89.aBoolean169 && local104.anInt3115 == 0 && local104.anInt3117 != 1 && !local104.aBoolean284);
				local36 = true;
				if (!local104.method2943()) {
					local7 = false;
					Static179.anInt3568++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg2 && arg0 == arg1 && arg4 == arg8 && arg5 == arg3) {
			Static197.method3546(arg8, arg6, arg3, arg0, arg7);
			return;
		}
		@Pc(36) int local36 = arg7;
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(62) int local62 = arg5 * 3;
		@Pc(72) int local72 = arg8 + local50 - arg7 - local58;
		@Pc(83) int local83 = arg3 + local54 - local62 - arg0;
		@Pc(93) int local93 = local42 + local58 - local50 - local50;
		@Pc(103) int local103 = local62 + local46 - local54 - local54;
		@Pc(108) int local108 = local50 - local42;
		@Pc(113) int local113 = local54 - local46;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local123 * local115 >> 12;
			@Pc(133) int local133 = local72 * local129;
			@Pc(137) int local137 = local83 * local129;
			@Pc(141) int local141 = local123 * local93;
			@Pc(145) int local145 = local123 * local103;
			@Pc(149) int local149 = local115 * local108;
			@Pc(153) int local153 = local115 * local113;
			@Pc(163) int local163 = (local141 + local133 + local149 >> 12) + arg7;
			@Pc(174) int local174 = arg0 + (local145 + local137 + local153 >> 12);
			Static197.method3546(local163, arg6, local174, local38, local36);
			local36 = local163;
			local38 = local174;
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public static void method6006() {
		Static93.anInt2121 = 0;
		Static273.anInt5577 = 0;
		Static203.anInt3384 = 0;
		Static187.anInt3715 = 0;
	}
}
