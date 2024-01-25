import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public static int anInt1934;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public static int anInt1935 = 0;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	public static int anInt1936 = -1;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
	public static int anInt1937 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Lclient!wv;")
	public static Class15_Sub5 method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class15_Sub5 local14 = local7.aClass15_Sub5_1;
			local7.aClass15_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIII)I")
	public static int method1763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
