import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_16;

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_17;

	@OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
	public static int anInt3278;

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lclient!pb;")
	public static Class71 aClass71_29;

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1128 = Static151.method2243("Login server offline)3");

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1131 = Static151.method2243("flash2:");

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1129 = aClass62_1131;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1133 = Static151.method2243("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!pe", name = "ib", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1130 = aClass62_1133;

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1132 = aClass62_1131;

	@OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
	public static int anInt3279 = 100;

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1134 = aClass62_1128;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass85_1 != null && local7.aClass85_1.aLong114 == arg3) {
			return true;
		} else if (local7.aClass100_1 != null && local7.aClass100_1.aLong135 == arg3) {
			return true;
		} else if (local7.aClass10_1 != null && local7.aClass10_1.aLong23 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt3292; local46++) {
				if (local7.aClass39Array2[local46].aLong54 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!wb;IZII)V")
	public static void method2281(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Static83.anInt1739 >= 50 || (arg1.anIntArray390 == null || arg0 >= arg1.anIntArray390.length)) {
			return;
		}
		@Pc(21) int local21 = arg1.anIntArray390[arg0];
		if (local21 == 0) {
			return;
		}
		@Pc(33) int local33 = local21 >> 4 & 0x7;
		@Pc(41) int local41 = local21 >> 8;
		@Pc(45) int local45 = local21 & 0xF;
		if (local45 == 0) {
			if (arg3) {
				Static192.method2745(local41, local33, 0);
			}
		} else if (Static81.anInt4473 != 0) {
			@Pc(67) int local67 = (arg2 - 64) / 128;
			@Pc(73) int local73 = (arg4 - 64) / 128;
			Static53.anIntArray85[Static83.anInt1739] = local41;
			Static56.anIntArray89[Static83.anInt1739] = local33;
			Static108.anIntArray221[Static83.anInt1739] = 0;
			Static125.aClass27Array1[Static83.anInt1739] = null;
			Static111.anIntArray225[Static83.anInt1739] = local45 + (local73 << 8) + (local67 << 16);
			Static83.anInt1739++;
		}
	}
}
