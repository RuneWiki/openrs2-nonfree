import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Lclient!kda;")
	public static Class160 aClass160_102;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!h;")
	public static final Class114 aClass114_167 = new Class114("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Z")
	public static boolean aBoolean614 = true;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)I")
	public static int method7431(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public static boolean method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIII)V")
	public static void method7434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static341.anInt6379 < arg2 || arg1 < Static92.anInt2338) {
			return;
		}
		@Pc(31) boolean local31;
		if (arg4 < Static95.anInt2358) {
			local31 = false;
			arg4 = Static95.anInt2358;
		} else if (Static299.anInt4491 >= arg4) {
			local31 = true;
		} else {
			local31 = false;
			arg4 = Static299.anInt4491;
		}
		@Pc(50) boolean local50;
		if (Static95.anInt2358 > arg3) {
			arg3 = Static95.anInt2358;
			local50 = false;
		} else if (Static299.anInt4491 >= arg3) {
			local50 = true;
		} else {
			local50 = false;
			arg3 = Static299.anInt4491;
		}
		if (arg2 >= Static92.anInt2338) {
			Static227.method7421(arg4, arg0, arg3, Static81.anIntArrayArray25[arg2++]);
		} else {
			arg2 = Static92.anInt2338;
		}
		if (Static341.anInt6379 < arg1) {
			arg1 = Static341.anInt6379;
		} else {
			Static227.method7421(arg4, arg0, arg3, Static81.anIntArrayArray25[arg1--]);
		}
		@Pc(113) int local113;
		if (local31 && local50) {
			for (local113 = arg2; local113 <= arg1; local113++) {
				@Pc(161) int[] local161 = Static81.anIntArrayArray25[local113];
				local161[arg4] = local161[arg3] = arg0;
			}
		} else if (local31) {
			for (local113 = arg2; local113 <= arg1; local113++) {
				Static81.anIntArrayArray25[local113][arg4] = arg0;
			}
		} else if (local50) {
			for (local113 = arg2; local113 <= arg1; local113++) {
				Static81.anIntArrayArray25[local113][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI[BI)Ljava/lang/String;")
	public static String method7435(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) char[] local11 = new char[arg2];
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg2 + arg0;
		for (@Pc(19) int local19 = arg0; local19 < local17; local19++) {
			@Pc(26) int local26 = arg1[local19] & 0xFF;
			if (local26 >= 128) {
				if (local26 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local26);
				}
				@Pc(82) int local82;
				if (local26 >= 224) {
					if (local26 >= 240) {
						if (local26 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local26);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local19 + 2 >= local17) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local19++;
					local82 = arg1[local19] & 0xFF;
					if (local82 < 128 || local82 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local19++;
					@Pc(102) int local102 = arg1[local19] & 0xFF;
					if (local102 < 128 || local102 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local102 & 0xFFFFFF7F | (local82 & 0x3FFFF7F) << 6 | (local26 & 0xFFF1F) << 12);
				} else if (local19 + 1 < local17) {
					local19++;
					local82 = arg1[local19] & 0xFF;
					if (local82 < 128 || local82 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local82 & 0xFFFFFF7F | (local26 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local11[local13++] = (char) local26;
			}
		}
		return new String(local11, 0, local13);
	}
}
