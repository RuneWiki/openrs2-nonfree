import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array9;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!qc;")
	public static Class60 aClass60_525 = Static121.method2047("p12_full");

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	public static int anInt1376 = 0;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "Lclient!ab;")
	public static Class3 aClass3_1 = new Class3();

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	public static int anInt1381 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method995() {
		Static8.aClass48_5.method1393();
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	public static void method996() {
		for (@Pc(15) Class4_Sub19 local15 = (Class4_Sub19) Static52.aClass70_12.method1939(); local15 != null; local15 = (Class4_Sub19) Static52.aClass70_12.method1936()) {
			if (local15.anInt2486 == -1) {
				local15.anInt2487 = 0;
				Static10.method202(local15);
			} else {
				local15.method2124();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	public static void method998() {
		aClass60Array9 = null;
		aClass3_1 = null;
		aClass60_525 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
	public static int method1000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub12 local12 = (Class4_Sub12) Static111.aClass66_13.method1834((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local12.anIntArray151.length; local26++) {
				if (arg0 == local12.anIntArray149[local26]) {
					local24 += local12.anIntArray151[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZII)I")
	public static int method1001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg2;
		@Pc(36) int local36 = arg1 & 0x7F;
		if (arg2 < 3 && (Static95.aByteArrayArrayArray5[1][local7][local11] & 0x2) == 2) {
			local32 = arg2 + 1;
		}
		@Pc(59) int local59 = arg0 & 0x7F;
		@Pc(86) int local86 = local59 * Static58.anIntArrayArrayArray5[local32][local7 + 1][local11] + (128 - local59) * Static58.anIntArrayArrayArray5[local32][local7][local11] >> 7;
		@Pc(117) int local117 = Static58.anIntArrayArrayArray5[local32][local7][local11 + 1] * (128 - local59) + local59 * Static58.anIntArrayArrayArray5[local32][local7 + 1][local11 + 1] >> 7;
		return local86 * (128 - local36) + local36 * local117 >> 7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILclient!q;)V")
	public static void method1002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub17 arg2) {
		if (Static60.aClass4_Sub17_12 != null || Static93.aBoolean105 || (arg2 == null || Static111.method1897(arg2) == null)) {
			return;
		}
		Static60.aClass4_Sub17_12 = arg2;
		Static114.aClass4_Sub17_15 = Static111.method1897(arg2);
		Static9.anInt156 = arg0;
		Static103.anInt1662 = arg1;
		Static82.anInt1968 = 0;
		Static71.aBoolean69 = false;
	}
}
