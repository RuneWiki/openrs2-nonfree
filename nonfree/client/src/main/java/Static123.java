import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
	public static int anInt1278;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
	public static int anInt1281 = 0;

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	public static int anInt1284 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BB)V")
	public static void method885(@OriginalArg(0) byte arg0) {
		if (Static132.aByteArrayArrayArray10 == null) {
			Static132.aByteArrayArrayArray10 = new byte[4][104][104];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < 104; local22++) {
				for (@Pc(26) int local26 = 0; local26 < 104; local26++) {
					Static132.aByteArrayArrayArray10[local18][local22][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZ)V")
	public static void method886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static158.aFloat32 = arg0;
		Static230.aFloat51 = arg1;
		if (Static61.anInt1682 == 2) {
			Static200.anInt4412 = arg0;
			Static127.anInt3198 = arg1;
		}
		Static248.method4050();
		Static89.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIII)V")
	public static void method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static249.anInt5332 = -1;
		Static39.anInt1086 = arg1 * Static124.anInt3160 / arg0;
		Static206.anInt4549 = -1;
		Static239.anInt5151 = arg2 * Static174.anInt3997 / arg3;
		Static99.method2088();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)I")
	public static int method895(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local3 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local3 == 19 || local3 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
