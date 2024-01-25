import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!gia", name = "J", descriptor = "I")
	public static int anInt3807;

	@OriginalMember(owner = "client!gia", name = "he", descriptor = "I")
	public static int anInt3810;

	@OriginalMember(owner = "client!gia", name = "Fb", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_68 = new Class186(120, 0);

	@OriginalMember(owner = "client!gia", name = "u", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(CZ)C")
	public static char method3231(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!gia", name = "p", descriptor = "(I)V")
	public static void method3251() {
		@Pc(12) short local12 = 1024;
		@Pc(14) short local14 = 3072;
		if (Static568.aBoolean784) {
			local14 = 4096;
			if (Static671.aBoolean769) {
				local12 = 2048;
			}
		}
		if (Static27.aFloat4 < (float) local12) {
			Static27.aFloat4 = (float) local12;
		}
		while (Static658.aFloat196 >= 16384.0F) {
			Static658.aFloat196 -= 16384.0F;
		}
		if ((float) local14 < Static27.aFloat4) {
			Static27.aFloat4 = (float) local14;
		}
		while (Static658.aFloat196 < 0.0F) {
			Static658.aFloat196 += 16384.0F;
		}
		@Pc(74) int local74 = Static680.anInt10754 >> 9;
		@Pc(78) int local78 = Static270.anInt4887 >> 9;
		@Pc(84) int local84 = Static505.method7237(Static712.anInt11117, Static270.anInt4887, Static680.anInt10754);
		@Pc(86) int local86 = 0;
		@Pc(114) int local114;
		if (local74 > 3 && local78 > 3 && Static362.anInt8653 - 4 > local74 && local78 < Static206.anInt11291 - 4) {
			for (local114 = local74 - 4; local114 <= local74 + 4; local114++) {
				for (@Pc(122) int local122 = local78 - 4; local122 <= local78 + 4; local122++) {
					@Pc(126) int local126 = Static712.anInt11117;
					if (local126 < 3 && Static135.method2226(local114, local122)) {
						local126++;
					}
					@Pc(141) int local141 = 0;
					if (Static462.aClass131_Sub1_2.aByteArrayArrayArray12 != null && Static462.aClass131_Sub1_2.aByteArrayArrayArray12[local126] != null) {
						local141 = (Static462.aClass131_Sub1_2.aByteArrayArrayArray12[local126][local114][local122] & 0xFF) * 8 << 2;
					}
					if (Static639.aClass313Array2 != null && Static639.aClass313Array2[local126] != null) {
						@Pc(188) int local188 = local84 + local141 - Static639.aClass313Array2[local126].method9095(local122, local114);
						if (local86 < local188) {
							local86 = local188;
						}
					}
				}
			}
		}
		local114 = (local86 >> 2) * 1536;
		if (local114 > 786432) {
			local114 = 786432;
		}
		if (local114 < 262144) {
			local114 = 262144;
		}
		if (local114 > Static678.anInt11088) {
			Static678.anInt11088 += (local114 - Static678.anInt11088) / 24;
		} else if (Static678.anInt11088 > local114) {
			Static678.anInt11088 += (local114 - Static678.anInt11088) / 80;
			return;
		}
	}
}
