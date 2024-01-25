import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!mga", name = "u", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_43 = new Class102();

	@OriginalMember(owner = "client!mga", name = "G", descriptor = "Lclient!el;")
	public static final Class109 aClass109_127 = new Class109(128, 1);

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BI)V")
	public static void method5408(@OriginalArg(1) int arg0) {
		if (!Static596.method8616(arg0)) {
			return;
		}
		@Pc(20) Class73[] local20 = Static489.aClass73ArrayArray2[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(28) Class73 local28 = local20[local22];
			if (local28 != null) {
				local28.anInt1335 = 0;
				local28.anInt1373 = 1;
				local28.anInt1338 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BIIILclient!rn;I)V")
	public static void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class309 arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1 || arg4 < 1 || arg1 > Static544.anInt9261 - 2 || arg4 > Static282.anInt4887 - 2) {
			return;
		}
		if (Static260.aClass174ArrayArrayArray2 == null) {
			return;
		}
		@Pc(52) Interface16 local52 = Static38.aClass153_Sub1_1.method3035(arg2, arg0, arg4, arg1);
		if (local52 == null) {
			return;
		}
		if (!(local52 instanceof Class8_Sub1_Sub3_Sub3)) {
			if (local52 instanceof Class8_Sub1_Sub1_Sub2) {
				((Class8_Sub1_Sub1_Sub2) local52).method238(arg3);
			} else if (local52 instanceof Class8_Sub1_Sub4_Sub1) {
				((Class8_Sub1_Sub4_Sub1) local52).method4223(arg3);
				return;
			} else if (local52 instanceof Class8_Sub1_Sub2_Sub1) {
				((Class8_Sub1_Sub2_Sub1) local52).method616(arg3);
				return;
			}
			return;
		}
		((Class8_Sub1_Sub3_Sub3) local52).method2444(arg3);
		return;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!la;I)V")
	public static void method5413(@OriginalArg(0) Class208 arg0) {
		Static462.aClass208_106 = arg0;
	}
}
