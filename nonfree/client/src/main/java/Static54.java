import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "[I")
	public static final int[] anIntArray58 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	public static boolean method984(@OriginalArg(3) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(31) boolean local31 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = arg0.length();
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			@Pc(52) char local52 = arg0.charAt(local47);
			if (local47 == 0) {
				if (local52 == '-') {
					local31 = true;
					continue;
				}
				if (local52 == '+' && true) {
					continue;
				}
			}
			@Pc(101) int local101;
			if (local52 >= '0' && local52 <= '9') {
				local101 = local52 - '0';
			} else if (local52 >= 'A' && local52 <= 'Z') {
				local101 = local52 - '7';
			} else if (local52 >= 'a' && local52 <= 'z') {
				local101 = local52 - 'W';
			} else {
				return false;
			}
			if (local101 >= 10) {
				return false;
			}
			if (local31) {
				local101 = -local101;
			}
			@Pc(136) int local136 = local42 * 10 + local101;
			if (local136 / 10 != local42) {
				return false;
			}
			local42 = local136;
			local40 = true;
		}
		return local40;
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)Lclient!id;")
	public static Class169_Sub1 method986() {
		Static4.anInt57 = 0;
		return Static418.method6270();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZIIIII)I")
	public static int method987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg1;
			arg1 = local8;
		}
		@Pc(26) int local26 = arg5 & 0x3;
		if (local26 == 0) {
			return arg2;
		} else if (local26 == 1) {
			return arg0;
		} else if (local26 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return 1 + 7 - arg0 - arg1;
		}
	}

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "(I)V")
	public static void method988() {
		@Pc(5) short local5 = 1024;
		@Pc(7) short local7 = 3072;
		if (Static6.aBoolean9) {
			if (Static420.aBoolean502) {
				local5 = 2048;
			}
			local7 = 4096;
		}
		if ((float) local5 > Static680.aFloat210) {
			Static680.aFloat210 = (float) local5;
		}
		if ((float) local7 < Static680.aFloat210) {
			Static680.aFloat210 = (float) local7;
		}
		while (Static139.aFloat16 >= 16384.0F) {
			Static139.aFloat16 -= 16384.0F;
		}
		while (Static139.aFloat16 < 0.0F) {
			Static139.aFloat16 += 16384.0F;
		}
		@Pc(59) int local59 = Static173.anInt2835 >> 9;
		@Pc(63) int local63 = Static660.anInt6758 >> 9;
		@Pc(83) int local83 = Static388.method5919(Static660.anInt6758, Static173.anInt2835, Static391.anInt6811);
		@Pc(85) int local85 = 0;
		@Pc(121) int local121;
		if (local59 > 3 && local63 > 3 && Static380.anInt6689 - 4 > local59 && local63 < Static542.anInt9214 - 4) {
			for (local121 = local59 - 4; local121 <= local59 + 4; local121++) {
				for (@Pc(126) int local126 = local63 - 4; local126 <= local63 + 4; local126++) {
					@Pc(129) int local129 = Static391.anInt6811;
					if (local129 < 3 && Static551.method7974(local121, local126)) {
						local129++;
					}
					@Pc(146) int local146 = 0;
					if (Static15.aClass49_Sub1_1.aByteArrayArrayArray15 != null && Static15.aClass49_Sub1_1.aByteArrayArrayArray15[local129] != null) {
						local146 = (Static15.aClass49_Sub1_1.aByteArrayArrayArray15[local129][local121][local126] & 0xFF) * 8 << 2;
					}
					if (Static258.aClass159Array1 != null && Static258.aClass159Array1[local129] != null) {
						@Pc(192) int local192 = local83 + local146 - Static258.aClass159Array1[local129].method8207(local126, local121);
						if (local192 > local85) {
							local85 = local192;
						}
					}
				}
			}
		}
		local121 = (local85 >> 2) * 1536;
		if (local121 > 786432) {
			local121 = 786432;
		}
		if (local121 < 262144) {
			local121 = 262144;
		}
		if (Static609.anInt10035 < local121) {
			Static609.anInt10035 += (local121 - Static609.anInt10035) / 24;
		} else if (local121 < Static609.anInt10035) {
			Static609.anInt10035 += (local121 - Static609.anInt10035) / 80;
			return;
		}
	}
}
