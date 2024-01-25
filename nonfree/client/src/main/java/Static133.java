import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "J")
	public static long aLong77;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_42 = new Class156(54, 3);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public static void method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static370.method5508(local7.aClass4_Sub1_Sub5_2);
		Static370.method5508(local7.aClass4_Sub1_Sub5_1);
		if (local7.aClass4_Sub1_Sub5_2 != null) {
			local7.aClass4_Sub1_Sub5_2 = null;
		}
		if (local7.aClass4_Sub1_Sub5_1 != null) {
			local7.aClass4_Sub1_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)I")
	public static int method1962(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
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
		} else if (local7 == 19 || local7 == 21) {
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
