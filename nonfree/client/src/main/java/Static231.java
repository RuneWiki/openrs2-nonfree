import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
	public static boolean aBoolean215;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "J")
	public static long aLong170 = 0L;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[104][104];

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public static int anInt4421 = 3;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "[J")
	public static long[] aLongArray10 = new long[100];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)I")
	public static int method3482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILclient!pa;I)[Lclient!vf;")
	public static Class1_Sub1_Sub8[] method3484(@OriginalArg(2) Class86 arg0, @OriginalArg(3) int arg1) {
		return Static139.method2305(arg0, arg1) ? Static62.method941() : null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!hh;I)Z")
	public static boolean method3485(@OriginalArg(0) Class50 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static21.anInt420; local16++) {
			if (arg0.method1256(Static149.aClass50Array58[local16])) {
				return true;
			}
		}
		return arg0.method1256(Static230.aClass20_Sub3_Sub1_3.aClass50_493);
	}
}
