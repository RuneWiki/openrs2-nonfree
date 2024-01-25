import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "Lclient!ik;")
	public static Class182 aClass182_52;

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "J")
	public static long aLong129 = 0L;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([Lclient!nt;II)V")
	public static void method3045(@OriginalArg(0) Class270[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class270 local9 = arg0[local3];
			if (local9 != null && local9.anInt7050 == arg1 && !Static85.method1865(local9)) {
				if (local9.anInt7008 == 0) {
					method3045(arg0, local9.anInt6973);
					if (local9.aClass270Array2 != null) {
						method3045(local9.aClass270Array2, local9.anInt6973);
					}
					@Pc(60) Class3_Sub20 local60 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local9.anInt6973);
					if (local60 != null) {
						Static548.method7606(local60.anInt2493);
					}
				}
				if (local9.anInt7008 == 6 && local9.anInt7026 != -1) {
					if (local9.aClass45_8 == null) {
						local9.aClass45_8 = new Class45_Sub1();
						local9.aClass45_8.method6576(local9.anInt7026);
					}
					if (local9.aClass45_8.method6593(Static286.anInt4372) && local9.aClass45_8.method6584()) {
						local9.aClass45_8.method6591();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)Lclient!tv;")
	public static Class9_Sub1_Sub4 method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass9_Sub1_Sub4_1 == null ? null : local7.aClass9_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)V")
	public static void method3050(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub7_Sub21 local14 = Static136.method2378((long) arg0, 1);
		local14.method9260();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(BC)Z")
	public static boolean method3051(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
