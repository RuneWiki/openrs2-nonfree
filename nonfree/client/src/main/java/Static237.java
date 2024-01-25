import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "Lclient!vd;")
	public static Class353 aClass353_44;

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
	public static int anInt4766;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_8 = new Class244(9, 7);

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "Lclient!wl;")
	public static final Class377 aClass377_7 = new Class377();

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "Lclient!qg;")
	public static final Class271 aClass271_11 = new Class271("runescape", 0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lclient!sca;II)V")
	public static void method4122(@OriginalArg(0) Class302[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class302 local17 = arg0[local11];
			if (local17 != null) {
				if (local17.anInt8816 == 0) {
					if (local17.aClass302Array2 != null) {
						method4122(local17.aClass302Array2, arg1);
					}
					@Pc(41) Class6_Sub29 local41 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local17.anInt8838);
					if (local41 != null) {
						Static104.method1720(local41.anInt6361, arg1);
					}
				}
				@Pc(60) Class6_Sub10 local60;
				if (arg1 == 0 && local17.anObjectArray22 != null) {
					local60 = new Class6_Sub10();
					local60.aClass302_14 = local17;
					local60.anObjectArray1 = local17.anObjectArray22;
					Static244.method4193(local60);
				}
				if (arg1 == 1 && local17.anObjectArray7 != null) {
					if (local17.anInt8834 >= 0) {
						@Pc(83) Class302 local83 = Static386.method4914(local17.anInt8838);
						if (local83 == null || local83.aClass302Array2 == null || local83.aClass302Array2.length <= local17.anInt8834 || local17 != local83.aClass302Array2[local17.anInt8834]) {
							continue;
						}
					}
					local60 = new Class6_Sub10();
					local60.anObjectArray1 = local17.anObjectArray7;
					local60.aClass302_14 = local17;
					Static244.method4193(local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Z")
	public static boolean method4126(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
