import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!gg;")
	public static Class117 aClass117_2;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "F")
	public static float aFloat175;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_77 = new Class257(44, 8);

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[2048];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	public static int method6373(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public static void method6375() {
		for (@Pc(12) Class8_Sub5_Sub6 local12 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local12 != null; local12 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
			if (local12.anInt3391 > 1) {
				local12.anInt3391 = 0;
				Static565.aClass236_33.method6241(((Class8_Sub5_Sub7) local12.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66).aLong92, local12);
				local12.aClass302_2.method7322();
			}
		}
		Static156.anInt3931 = 0;
		Static548.anInt9471 = 0;
		Static72.aClass43_17.method1431();
		Static555.aClass253_37.method6598();
		Static414.aClass302_11.method7322();
		Static211.aBoolean370 = false;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6380(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class8_Sub44 local7 = null;
		for (@Pc(12) Class8_Sub44 local12 = (Class8_Sub44) Static41.aClass43_12.method1422(); local12 != null; local12 = (Class8_Sub44) Static41.aClass43_12.method1426()) {
			if (local12.anInt9149 == arg2 && arg1 == local12.anInt9146 && local12.anInt9150 == arg5 && local12.anInt9148 == arg0) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class8_Sub44();
			local7.anInt9149 = arg2;
			local7.anInt9148 = arg0;
			local7.anInt9150 = arg5;
			local7.anInt9146 = arg1;
			if (arg1 >= 0 && arg5 >= 0 && arg1 < Static372.anInt7082 && arg5 < Static218.anInt5023) {
				Static132.method2907(local7);
			}
			Static41.aClass43_12.method1424(local7);
		}
		local7.anInt9154 = arg6;
		local7.anInt9155 = arg4;
		local7.anInt9152 = arg3;
		local7.anInt9143 = 0;
		local7.anInt9151 = -1;
	}
}
