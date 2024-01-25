import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bka", name = "t", descriptor = "Lclient!nca;")
	public static Class254 aClass254_32;

	@OriginalMember(owner = "client!bka", name = "u", descriptor = "I")
	public static int anInt898 = 0;

	@OriginalMember(owner = "client!bka", name = "f", descriptor = "I")
	public static int anInt901 = 999999;

	@OriginalMember(owner = "client!bka", name = "p", descriptor = "I")
	public static int anInt902 = 0;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
	public static void method810() {
		if (!Static609.aBoolean811) {
			return;
		}
		while (true) {
			while (Static313.aClass88_Sub1Array2.length > Static580.anInt9164) {
				@Pc(29) Class88_Sub1 local29 = Static313.aClass88_Sub1Array2[Static580.anInt9164];
				if (local29 != null && local29.anInt2150 == -1) {
					if (Static611.aClass2_Sub25_2 == null) {
						Static611.aClass2_Sub25_2 = Static435.aClass89_1.method1854(local29.aString21);
					}
					@Pc(58) int local58 = Static611.aClass2_Sub25_2.anInt2903;
					if (local58 == -1) {
						return;
					}
					local29.anInt2150 = local58;
					Static580.anInt9164++;
					Static611.aClass2_Sub25_2 = null;
				} else {
					Static580.anInt9164++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(BJ)V")
	public static void method811(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static670.anInt10429;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static682.anInt11014 != local7) {
			local22 = local7 - Static682.anInt11014;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local22 > local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local22 < local30) {
				local30 = local22;
			}
			Static682.anInt11014 += local30;
		}
		@Pc(77) int local77 = Static712.anInt10863;
		Static213.aFloat46 += Static298.aFloat64 * (float) arg0 / 40.0F * 8.0F;
		if (Static506.anInt8028 != local77) {
			local22 = local77 - Static506.anInt8028;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local22 > local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local22 < local30) {
				local30 = local22;
			}
			Static506.anInt8028 += local30;
		}
		Static356.aFloat90 += Static357.aFloat91 * (float) arg0 / 40.0F * 8.0F;
		Static89.method1327();
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(II)Z")
	public static boolean method812(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)I")
	public static int method813(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local14 >>> 2 & 0x33333333) + (local14 & 0x33333333);
		@Pc(39) int local39 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}
}
