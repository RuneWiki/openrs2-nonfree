import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
	public static int[] anIntArray573;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Lclient!d;")
	public static Interface5 anInterface5_11;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method7848() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static40.aBoolean34) {
			if (Static207.aBoolean270) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if (Static509.aFloat152 < (float) local7) {
			Static509.aFloat152 = (float) local7;
		}
		while (Static170.aFloat71 >= 16384.0F) {
			Static170.aFloat71 -= 16384.0F;
		}
		if ((float) local9 < Static509.aFloat152) {
			Static509.aFloat152 = (float) local9;
		}
		while (Static170.aFloat71 < 0.0F) {
			Static170.aFloat71 += 16384.0F;
		}
		@Pc(57) int local57 = Static454.anInt7698 >> 9;
		@Pc(61) int local61 = Static94.anInt1851 >> 9;
		@Pc(67) int local67 = Static594.method8211(Static454.anInt7698, Static94.anInt1851, Static65.anInt1298);
		@Pc(69) int local69 = 0;
		@Pc(103) int local103;
		if (local57 > 3 && local61 > 3 && Static399.anInt7121 - 4 > local57 && Static24.anInt345 - 4 > local61) {
			for (local103 = local57 - 4; local103 <= local57 + 4; local103++) {
				for (@Pc(109) int local109 = local61 - 4; local109 <= local61 + 4; local109++) {
					@Pc(113) int local113 = Static65.anInt1298;
					if (local113 < 3 && Static97.method1657(local109, local103)) {
						local113++;
					}
					@Pc(124) int local124 = 0;
					if (Static206.aClass83_Sub1_2.aByteArrayArrayArray13 != null && Static206.aClass83_Sub1_2.aByteArrayArrayArray13[local113] != null) {
						local124 = (Static206.aClass83_Sub1_2.aByteArrayArrayArray13[local113][local103][local109] & 0xFF) * 8 << 2;
					}
					if (Static637.aClass91Array4 != null && Static637.aClass91Array4[local113] != null) {
						@Pc(166) int local166 = local67 + local124 - Static637.aClass91Array4[local113].method7724(local109, local103);
						if (local69 < local166) {
							local69 = local166;
						}
					}
				}
			}
		}
		local103 = (local69 >> 2) * 1536;
		if (local103 > 786432) {
			local103 = 786432;
		}
		if (local103 < 262144) {
			local103 = 262144;
		}
		if (Static208.anInt3810 < local103) {
			Static208.anInt3810 += (local103 - Static208.anInt3810) / 24;
		} else if (Static208.anInt3810 > local103) {
			Static208.anInt3810 += (local103 - Static208.anInt3810) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
	public static int method7850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static411.anIntArrayArray48 == null ? 0 : Static411.anIntArrayArray48[arg0][arg1] & 0xFFFFFF;
	}
}
