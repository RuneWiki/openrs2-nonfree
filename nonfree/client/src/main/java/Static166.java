import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public static int anInt6799;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Lclient!kea;")
	public static Class161 aClass161_78;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
	public static int anInt6798 = 0;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!qf;")
	public static Class245 aClass245_12 = null;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "[I")
	public static final int[] anIntArray582 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V")
	public static void method5704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static307.anInt4846) {
			Static241.anIntArray759 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static241.anIntArray759[local13] = (local13 << 12) / arg0;
			}
			Static324.anInt6207 = arg0 - 1;
			Static307.anInt4846 = arg0;
			Static113.anInt2476 = arg0 * 32;
		}
		if (arg1 == Static397.anInt7340) {
			return;
		}
		if (Static307.anInt4846 == arg1) {
			Static402.anIntArray741 = Static241.anIntArray759;
		} else {
			Static402.anIntArray741 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static402.anIntArray741[local13] = (local13 << 12) / arg1;
			}
		}
		Static485.anInt8693 = arg1 - 1;
		Static397.anInt7340 = arg1;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([BBIIII)Z")
	public static boolean method5705(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) boolean local18 = true;
		@Pc(23) Class3_Sub27 local23 = new Class3_Sub27(arg0);
		@Pc(25) int local25 = -1;
		label70: while (true) {
			@Pc(29) int local29 = local23.method7601();
			if (local29 == 0) {
				return local18;
			}
			local25 += local29;
			@Pc(40) int local40 = 0;
			@Pc(42) boolean local42 = false;
			while (true) {
				@Pc(77) int local77;
				@Pc(116) Class242 local116;
				do {
					@Pc(81) int local81;
					@Pc(86) int local86;
					do {
						do {
							do {
								do {
									@Pc(48) int local48;
									while (local42) {
										local48 = local23.method7547();
										if (local48 == 0) {
											continue label70;
										}
										local23.method7548();
									}
									local48 = local23.method7547();
									if (local48 == 0) {
										continue label70;
									}
									local40 += local48 - 1;
									@Pc(63) int local63 = local40 & 0x3F;
									@Pc(69) int local69 = local40 >> 6 & 0x3F;
									local77 = local23.method7548() >> 2;
									local81 = arg3 + local69;
									local86 = local63 + arg2;
								} while (local81 <= 0);
							} while (local86 <= 0);
						} while (local81 >= arg4 - 1);
					} while (arg1 - 1 <= local86);
					local116 = Static454.aClass298_3.method7185(local25);
				} while (local77 == 22 && !Static7.aClass3_Sub15_Sub1_1.aBoolean605 && local116.anInt7164 == 0 && local116.anInt7176 != 1 && !local116.aBoolean491);
				if (!local116.method5985()) {
					Static26.anInt760++;
					local18 = false;
				}
				local42 = true;
			}
		}
	}
}
