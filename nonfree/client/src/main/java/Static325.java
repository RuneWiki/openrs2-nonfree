import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
	public static void method4956() {
		Static365.aClass389_9 = Static4.aClass389_16;
		Static623.anInt9970 = -1;
		Static120.anInt1966 = 1;
		Static357.method5231(true, "", Static446.aString85.equals(""), Static446.aString85);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
	public static void method4957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static73.aClass196_5.method4556(Static184.aClass131_25.method3168(Static375.anInt7800));
		@Pc(47) int local47;
		@Pc(28) int local28;
		if (Static83.aBoolean120) {
			for (@Pc(67) Class5_Sub1_Sub20 local67 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local67 != null; local67 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
				if (local67.anInt9857 == 1) {
					local28 = Static650.method8983((Class5_Sub1_Sub13) local67.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65);
				} else {
					local28 = Static47.method857(local67);
				}
				if (local28 > local13) {
					local13 = local28;
				}
			}
			Static515.anInt8186 = Static530.anInt8424 * 16 + (Static116.aBoolean570 ? 26 : 22);
			local13 += 8;
			local47 = Static530.anInt8424 * 16 + 21;
		} else {
			for (@Pc(20) Class5_Sub1_Sub13 local20 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local20 != null; local20 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
				local28 = Static650.method8983(local20);
				if (local13 < local28) {
					local13 = local28;
				}
			}
			local13 += 8;
			local47 = Static651.anInt10662 * 16 + 21;
			Static515.anInt8186 = (Static116.aBoolean570 ? 26 : 22) + Static651.anInt10662 * 16;
		}
		@Pc(136) int local136 = arg1 - local13 / 2;
		if (local13 + local136 > Static85.anInt9921) {
			local136 = Static85.anInt9921 - local13;
		}
		if (local136 < 0) {
			local136 = 0;
		}
		local28 = arg0;
		if (local47 + arg0 > Static256.anInt4629) {
			local28 = Static256.anInt4629 - local47;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		Static32.anInt5104 = local136;
		Static619.anInt9981 = local28;
		Static490.aBoolean536 = true;
		Static482.anInt7810 = local13;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)B")
	public static byte method4959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
