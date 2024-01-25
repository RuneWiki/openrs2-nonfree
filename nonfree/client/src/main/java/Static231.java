import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public static int anInt7985;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	public static int anInt7998 = 1;

	@OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
	public static int anInt8002 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)S")
	public static short method6534(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 <= 64 ? local20 * local24 >> 7 : (127 - local24) * local20 >> 7;
		@Pc(48) int local48 = local44 + local24;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local44 << 1;
		} else {
			local57 = (local44 << 8) / local48;
		}
		return (short) (local14 << 10 | local57 >> 4 << 7 | local48);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!fs;ILclient!qg;IILclient!ts;)V")
	public static void method6536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class87 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class239 arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static429.anInt7656 == 4) {
			local14 = (int) Static265.aFloat51 & 0x3FFF;
		} else {
			local14 = (int) Static265.aFloat51 + Static439.anInt418 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt6898 / 2, arg6.anInt6899 / 2) + 10;
		@Pc(44) int local44 = arg1 * arg1 + arg3 * arg3;
		if (local44 > local35 * local35) {
			return;
		}
		@Pc(58) int local58 = Class145.anIntArray279[local14];
		@Pc(62) int local62 = Class145.anIntArray280[local14];
		if (Static429.anInt7656 != 4) {
			local62 = local62 * 256 / (Static280.anInt5012 + 256);
			local58 = local58 * 256 / (Static280.anInt5012 + 256);
		}
		@Pc(96) int local96 = arg1 * local62 + arg3 * local58 >> 15;
		@Pc(107) int local107 = arg3 * local62 - local58 * arg1 >> 15;
		arg4.method6562(arg5 + arg6.anInt6898 / 2 + local96 - arg4.method6565() / 2, arg6.anInt6899 / 2 + arg0 + -local107 + -(arg4.method6561() / 2), arg2, arg5, arg0);
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	public static void method6538() {
		if (!Static110.aBoolean451) {
			return;
		}
		while (true) {
			while (Static302.anInt5365 < Static266.aClass152_Sub1Array2.length) {
				@Pc(28) Class152_Sub1 local28 = Static266.aClass152_Sub1Array2[Static302.anInt5365];
				if (local28 != null && local28.anInt5638 == -1) {
					if (Static91.aClass6_Sub30_2 == null) {
						Static91.aClass6_Sub30_2 = Static128.aClass31_1.method912(local28.aString46);
					}
					@Pc(51) int local51 = Static91.aClass6_Sub30_2.anInt5547;
					if (local51 == -1) {
						return;
					}
					Static302.anInt5365++;
					local28.anInt5638 = local51;
					Static91.aClass6_Sub30_2 = null;
				} else {
					Static302.anInt5365++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)Z")
	public static boolean method6542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ts;IB)I")
	public static int method6546(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1) {
		if (!Static50.method1150(arg0).method1218(arg1) && arg0.anObjectArray32 == null) {
			return -1;
		} else if (arg0.anIntArray483 == null || arg0.anIntArray483.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray483[arg1];
		}
	}
}
