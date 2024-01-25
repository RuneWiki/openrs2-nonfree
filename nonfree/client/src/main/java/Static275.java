import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	public static int anInt5459;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
	public static int anInt5464 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method4840(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local27++;
			}
			@Pc(51) StringBuffer local51 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static164.aCharArray1[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(76) int local76 = local51.length() - 1;
					local51.setCharAt(local76, Character.toUpperCase(local51.charAt(local76)));
					local68 = ' ';
				}
				local51.append(local68);
			}
			local51.reverse();
			local51.setCharAt(0, Character.toUpperCase(local51.charAt(0)));
			return local51.toString();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method4842() {
		if (Static29.aFloat7 < 1024.0F) {
			Static29.aFloat7 = 1024.0F;
		}
		if (Static29.aFloat7 > 3072.0F) {
			Static29.aFloat7 = 3072.0F;
		}
		while (Static164.aFloat24 >= 16384.0F) {
			Static164.aFloat24 -= 16384.0F;
		}
		while (Static164.aFloat24 < 0.0F) {
			Static164.aFloat24 += 16384.0F;
		}
		@Pc(41) int local41 = Static8.anInt184 >> 7;
		@Pc(45) int local45 = Static311.anInt3611 >> 7;
		@Pc(51) int local51 = Static208.method3804(Static239.anInt4811, Static8.anInt184, Static311.anInt3611);
		@Pc(53) int local53 = 0;
		@Pc(71) int local71;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local71 = local41 - 4; local71 <= local41 + 4; local71++) {
				for (@Pc(76) int local76 = local45 - 4; local76 <= local45 + 4; local76++) {
					@Pc(79) int local79 = Static239.anInt4811;
					if (local79 < 3 && Static203.method4477(local71, local76)) {
						local79++;
					}
					@Pc(90) int local90 = 0;
					if (Static332.aByteArrayArrayArray16 != null && Static332.aByteArrayArrayArray16[local79] != null) {
						local90 = (Static332.aByteArrayArrayArray16[local79][local71][local76] & 0xFF) * 8;
					}
					@Pc(119) int local119 = local51 + local90 - Static8.aClass51Array1[local79].method1856(local71, local76);
					if (local53 < local119) {
						local53 = local119;
					}
				}
			}
		}
		local71 = local53 * 1536;
		if (local71 > 786432) {
			local71 = 786432;
		}
		if (local71 < 262144) {
			local71 = 262144;
		}
		if (Static239.anInt4812 < local71) {
			Static239.anInt4812 += (local71 - Static239.anInt4812) / 24;
		} else if (Static239.anInt4812 > local71) {
			Static239.anInt4812 += (local71 - Static239.anInt4812) / 80;
			return;
		}
	}
}
