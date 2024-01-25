import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_10 = new Class358(10, 2, 2, 0);

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Z")
	public static boolean method4786() {
		return Static32.anInt602 >= 1;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V")
	public static void method4787() {
		if (Static126.aFloat84 < 1024.0F) {
			Static126.aFloat84 = 1024.0F;
		}
		if (Static126.aFloat84 > 3072.0F) {
			Static126.aFloat84 = 3072.0F;
		}
		while (Static43.aFloat20 >= 16384.0F) {
			Static43.aFloat20 -= 16384.0F;
		}
		while (Static43.aFloat20 < 0.0F) {
			Static43.aFloat20 += 16384.0F;
		}
		@Pc(45) int local45 = Static205.anInt3767 >> 9;
		@Pc(49) int local49 = Static18.anInt315 >> 9;
		@Pc(55) int local55 = Static475.method6537(Static18.anInt315, Static117.anInt2694, Static205.anInt3767);
		@Pc(57) int local57 = 0;
		@Pc(87) int local87;
		if (local45 > 3 && local49 > 3 && local45 < Static54.anInt1038 - 4 && Static140.anInt3026 - 4 > local49) {
			for (local87 = local45 - 4; local87 <= local45 + 4; local87++) {
				for (@Pc(93) int local93 = local49 - 4; local93 <= local49 + 4; local93++) {
					@Pc(97) int local97 = Static117.anInt2694;
					if (local97 < 3 && Static511.method6886(local93, local87)) {
						local97++;
					}
					@Pc(108) int local108 = 0;
					if (Static25.aClass26_Sub1_1.aByteArrayArrayArray15 != null && Static25.aClass26_Sub1_1.aByteArrayArrayArray15[local97] != null) {
						local108 = (Static25.aClass26_Sub1_1.aByteArrayArrayArray15[local97][local87][local93] & 0xFF) * 8;
					}
					if (Static68.aClass34Array1 != null && Static68.aClass34Array1[local97] != null) {
						@Pc(148) int local148 = local55 + local108 - Static68.aClass34Array1[local97].method6525(local93, local87);
						if (local148 > local57) {
							local57 = local148;
						}
					}
				}
			}
		}
		local87 = (local57 >> 2) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > Static504.anInt8194) {
			Static504.anInt8194 += (local87 - Static504.anInt8194) / 24;
		} else if (local87 < Static504.anInt8194) {
			Static504.anInt8194 += (local87 - Static504.anInt8194) / 80;
			return;
		}
	}
}
