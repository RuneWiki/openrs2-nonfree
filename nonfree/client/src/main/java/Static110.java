import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ie", name = "Cb", descriptor = "I")
	public static int anInt2430 = -1;

	@OriginalMember(owner = "client!ie", name = "Eb", descriptor = "I")
	public static volatile int anInt2432 = 0;

	@OriginalMember(owner = "client!ie", name = "Ib", descriptor = "[I")
	public static int[] anIntArray228 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ie", name = "Jb", descriptor = "[J")
	public static long[] aLongArray5 = new long[1000];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!p;B)V")
	public static void method1902(@OriginalArg(0) Class4_Sub17 arg0) {
		label85: while (true) {
			if (arg0.aByteArray30.length > arg0.anInt2400) {
				@Pc(14) boolean local14 = false;
				@Pc(16) int local16 = 0;
				@Pc(18) int local18 = 0;
				if (arg0.method1874() == 1) {
					local14 = true;
					local16 = arg0.method1874();
					local18 = arg0.method1874();
				}
				@Pc(39) int local39 = arg0.method1874();
				@Pc(43) int local43 = arg0.method1874();
				@Pc(55) int local55 = Static92.anInt1912 + Static132.anInt2785 - local43 * 64 - 1;
				@Pc(62) int local62 = local39 * 64 - Static81.anInt4033;
				@Pc(146) byte local146;
				@Pc(94) int local94;
				if (local62 >= 0 && local55 - 63 >= 0 && Static269.anInt5031 > local62 + 63 && Static92.anInt1912 > local55) {
					local94 = local62 >> 6;
					@Pc(98) int local98 = local55 >> 6;
					@Pc(100) int local100 = 0;
					while (true) {
						if (local100 >= 64) {
							continue label85;
						}
						for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
							if (!local14 || local16 * 8 <= local100 && local16 * 8 + 8 > local100 && local18 * 8 <= local107 && local18 * 8 + 8 > local107) {
								local146 = arg0.method1892();
								if (local146 != 0) {
									if (Static106.aByteArrayArrayArray5[local94][local98] == null) {
										Static106.aByteArrayArrayArray5[local94][local98] = new byte[4096];
									}
									Static106.aByteArrayArrayArray5[local94][local98][(63 - local107 << 6) + local100] = local146;
									@Pc(185) byte local185 = arg0.method1892();
									if (Static147.aByteArrayArrayArray8[local94][local98] == null) {
										Static147.aByteArrayArrayArray8[local94][local98] = new byte[4096];
									}
									Static147.aByteArrayArrayArray8[local94][local98][(63 - local107 << 6) + local100] = local185;
								}
							}
						}
						local100++;
					}
				}
				local94 = 0;
				while (true) {
					if ((local14 ? 64 : 4096) <= local94) {
						continue label85;
					}
					local146 = arg0.method1892();
					if (local146 != 0) {
						arg0.anInt2400++;
					}
					local94++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "(I)V")
	public static void method1903() {
		anIntArray228 = null;
		aLongArray5 = null;
	}
}
