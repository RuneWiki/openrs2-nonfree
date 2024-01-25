import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_4 = new Class33(7, 5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBI)V")
	public static void method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static501.anInt8508 = arg4;
		Static382.anInt6686 = arg0;
		Static217.anInt4444 = arg3;
		Static97.anInt6559 = arg2;
		Static110.anInt2572 = arg1;
		if (Static97.anInt6559 >= 100) {
			@Pc(29) int local29 = Static110.anInt2572 * 128 + 64;
			@Pc(35) int local35 = Static382.anInt6686 * 128 + 64;
			@Pc(43) int local43 = Static74.method1954(Static245.anInt4747, local35, local29) - Static217.anInt4444;
			@Pc(48) int local48 = local29 - Static308.anInt5918;
			@Pc(53) int local53 = local43 - Static520.anInt8842;
			@Pc(58) int local58 = local35 - Static347.anInt6404;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static411.anInt7178 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static339.anInt6337 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			Static304.anInt5875 = 0;
			if (Static411.anInt7178 < 1024) {
				Static411.anInt7178 = 1024;
			}
			if (Static411.anInt7178 > 3072) {
				Static411.anInt7178 = 3072;
			}
		}
		Static464.anInt8003 = 2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method1966(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) char[] local9 = new char[local6];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < local6; local13++) {
			@Pc(27) int local27 = arg0[local13] & 0xFF;
			if (local27 >= 128) {
				if (local27 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local27);
				}
				@Pc(83) int local83;
				if (local27 >= 224) {
					if (local27 >= 240) {
						if (local27 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local27);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local6 <= local13 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local13++;
					local83 = arg0[local13] & 0xFF;
					if (local83 < 128 || local83 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local13++;
					@Pc(103) int local103 = arg0[local13] & 0xFF;
					if (local103 < 128 || local103 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local9[local11++] = (char) (local103 & 0xFFFFFF7F | (local27 & 0xFFF1F) << 12 | (local83 & 0x3FFFF7F) << 6);
				} else if (local13 + 1 < local6) {
					local13++;
					local83 = arg0[local13] & 0xFF;
					if (local83 < 128 || local83 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local9[local11++] = (char) ((local27 & 0xFFFFFF3F) << 6 | local83 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local9[local11++] = (char) local27;
			}
		}
		return new String(local9, 0, local11);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1967(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static108.anInt2509; local9++) {
			if (arg0.equalsIgnoreCase(Static366.aStringArray40[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
