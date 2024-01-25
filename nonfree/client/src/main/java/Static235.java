import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lv", name = "E", descriptor = "I")
	public static int anInt4487;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "[I")
	public static final int[] anIntArray299 = new int[1];

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
	public static void method3519() {
		if (Static168.anInt3253 < 0) {
			return;
		}
		@Pc(16) long local16 = Static282.method3962();
		Static168.anInt3253 = (int) ((long) Static168.anInt3253 + Static442.aLong219 - local16);
		if (Static168.anInt3253 <= 0) {
			Static434.aFloat228 = Static419.aClass155_2.aFloat151;
			Static352.anInt6110 = Static419.aClass155_2.anInt4774;
			Static8.anInt116 = Static419.aClass155_2.anInt4777;
			Static396.aClass99_4 = Static419.aClass155_2.aClass99_3;
			Static374.aFloat194 = Static419.aClass155_2.aFloat146;
			Static350.aFloat187 = Static419.aClass155_2.aFloat150;
			Static231.aFloat138 = Static419.aClass155_2.aFloat147;
			Static398.anInt6606 = Static419.aClass155_2.anInt4773;
			Static168.anInt3253 = -1;
			Static216.aFloat131 = Static419.aClass155_2.aFloat149;
			Static54.aFloat31 = Static419.aClass155_2.aFloat148;
		} else {
			@Pc(67) int local67 = (Static168.anInt3253 << 8) / Static392.anInt6542;
			@Pc(72) int local72 = 255 - local67;
			@Pc(77) float local77 = (float) local67 / 255.0F;
			Static398.anInt6606 = (local72 * (Static419.aClass155_2.anInt4773 & 0xFF00) + local67 * (Static127.anInt2675 & 0xFF00) & 0xFF0000) + ((Static419.aClass155_2.anInt4773 & 0xFF00FF) * local72 + (Static127.anInt2675 & 0xFF00FF) * local67 & 0xFF00FF00) >>> 8;
			@Pc(114) float local114 = 1.0F - local77;
			Static350.aFloat187 = Static150.aFloat103 + (Static419.aClass155_2.aFloat150 - Static150.aFloat103) * local114;
			Static8.anInt116 = local67 * Static223.anInt4343 + local72 * Static419.aClass155_2.anInt4777 >> 8;
			Static231.aFloat138 = Static360.aFloat190 + (Static419.aClass155_2.aFloat147 - Static360.aFloat190) * local114;
			Static352.anInt6110 = ((Static40.anInt715 & 0xFF00) * local67 + (Static419.aClass155_2.anInt4774 & 0xFF00) * local72 & 0xFF0000) + ((Static40.anInt715 & 0xFF00FF) * local67 + ((Static419.aClass155_2.anInt4774 & 0xFF00FF) * local72) & 0xFF00FF00) >>> 8;
			Static216.aFloat131 = local114 * (Static419.aClass155_2.aFloat149 - Static105.aFloat78) + Static105.aFloat78;
			Static374.aFloat194 = Static180.aFloat114 + (Static419.aClass155_2.aFloat146 - Static180.aFloat114) * local114;
			Static434.aFloat228 = Static226.aFloat136 + local114 * (Static419.aClass155_2.aFloat151 - Static226.aFloat136);
			Static54.aFloat31 = (Static419.aClass155_2.aFloat148 - Static305.aFloat169) * local114 + Static305.aFloat169;
			if (Static293.aClass99_6 != Static419.aClass155_2.aClass99_3) {
				Static396.aClass99_4 = Static57.aClass19_7.method4298(Static293.aClass99_6, Static419.aClass155_2.aClass99_3, local114, Static396.aClass99_4);
			}
		}
		Static442.aLong219 = local16;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!wn;[[BI)V")
	public static void method3523(@OriginalArg(0) Class266_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class4_Sub12 local30 = new Class4_Sub12(local23);
				local36 = Static308.anIntArray372[local17] >> 8;
				@Pc(42) int local42 = Static308.anIntArray372[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static180.anInt3453;
				@Pc(55) int local55 = local42 * 64 - Static86.anInt1771;
				Static159.method2701();
				arg0.method5634(Static180.anInt3453, Static86.anInt1771, local30, local49, Static175.aClass213Array1, local55);
				arg0.method5644(local12, local55, Static122.aClass19_16, local49, local30);
				if (!arg0.aBoolean687 && local36 == Static169.anInt3265 / 8 && local42 == Static453.anInt7373 / 8 && local12[0] != -1) {
					Static10.aClass242_1 = Static296.aClass217_1.method4934(local12[1], local12[0], local12[2], local12[3], Static238.aClass226_1);
					Static100.anInt2023 = local12[4];
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local15; local136++) {
			@Pc(149) int local149 = (Static308.anIntArray372[local136] >> 8) * 64 - Static180.anInt3453;
			local36 = (Static308.anIntArray372[local136] & 0xFF) * 64 - Static86.anInt1771;
			@Pc(164) byte[] local164 = arg1[local136];
			if (local164 == null && Static453.anInt7373 < 800) {
				Static159.method2701();
				arg0.method5630(local149, local36);
			}
		}
	}
}
