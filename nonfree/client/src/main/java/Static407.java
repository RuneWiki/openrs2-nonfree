import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nw", name = "ad", descriptor = "[Lclient!iu;")
	public static Class180_Sub1[] aClass180_Sub1Array2;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "([BIIZ)Ljava/lang/String;")
	public static String method6006(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = arg2;
		@Pc(23) int local23 = arg1 + arg2;
		while (local19 < local23) {
			@Pc(32) int local32 = arg0[local19++] & 0xFF;
			@Pc(81) int local81;
			if (local32 >= 128) {
				if (local32 < 192) {
					local81 = 65533;
				} else if (local32 >= 224) {
					if (local32 < 240) {
						if (local23 > local19 + 1 && (arg0[local19] & 0xC0) == 128 && (arg0[local19 + 1] & 0xC0) == 128) {
							local81 = (arg0[local19++] & 0x3F) << 6 | (local32 & 0xF) << 12 | arg0[local19++] & 0x3F;
							if (local81 < 2048) {
								local81 = 65533;
							}
						} else {
							local81 = 65533;
						}
					} else if (local32 >= 248) {
						local81 = 65533;
					} else if (local23 > local19 + 2 && (arg0[local19] & 0xC0) == 128 && (arg0[local19 + 1] & 0xC0) == 128 && (arg0[local19 + 2] & 0xC0) == 128) {
						local81 = (arg0[local19++] & 0x3F) << 12 | (local32 & 0x7) << 18 | (arg0[local19++] & 0x3F) << 6 | arg0[local19++] & 0x3F;
						if (local81 >= 65536 && local81 <= 1114111) {
							local81 = 65533;
						} else {
							local81 = 65533;
						}
					} else {
						local81 = 65533;
					}
				} else if (local19 < local23 && (arg0[local19] & 0xC0) == 128) {
					local81 = (local32 & 0x1F) << 6 | arg0[local19++] & 0x3F;
					if (local81 < 128) {
						local81 = 65533;
					}
				} else {
					local81 = 65533;
				}
			} else if (local32 == 0) {
				local81 = 65533;
			} else {
				local81 = local32;
			}
			local8[local17++] = (char) local81;
		}
		return new String(local8, 0, local17);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6009(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "([Ljava/lang/Object;III[J)V")
	public static void method6013(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) long local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) Object local42 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local42;
		@Pc(63) int local63 = ~local28 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg1; local65 < arg2; local65++) {
			if (arg3[local65] < local28 + (long) (local63 & local65)) {
				@Pc(84) long local84 = arg3[local65];
				arg3[local65] = arg3[local24];
				arg3[local24] = local84;
				@Pc(98) Object local98 = arg0[local65];
				arg0[local65] = arg0[local24];
				arg0[local24++] = local98;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg0[arg2] = arg0[local24];
		arg0[local24] = local42;
		method6013(arg0, arg1, local24 - 1, arg3);
		method6013(arg0, local24 + 1, arg2, arg3);
	}
}
