import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!vd;")
	public static Class83 aClass83_7;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_9;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 aClass3_Sub1_Sub3_Sub3_4;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!sd;")
	public static Class73 aClass73_541 = null;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
	public static int anInt910 = 0;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
	public static int anInt918 = 0;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "Lclient!sd;")
	public static Class73 aClass73_542 = Static122.method531("null");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method691() {
		aClass73_542 = null;
		aClass3_Sub1_Sub3_Sub3_4 = null;
		aClass3_Sub1_Sub3_Sub4_9 = null;
		aClass83_7 = null;
		aClass73_541 = null;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public static void method692() {
		if (Static139.aClass2_5 != null) {
			Static139.aClass2_5.method12();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZ)I")
	public static int method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(22) int local22 = Static60.method1110(local17, local7);
		@Pc(28) int local28 = arg1 - 1 & arg2;
		@Pc(35) int local35 = Static60.method1110(local17, local7 + 1);
		@Pc(42) int local42 = Static60.method1110(local17 + 1, local7);
		@Pc(51) int local51 = Static60.method1110(local17 + 1, local7 - -1);
		@Pc(58) int local58 = Static112.method2033(local35, local22, local13, arg1);
		@Pc(65) int local65 = Static112.method2033(local51, local42, local13, arg1);
		return Static112.method2033(local65, local58, local28, arg1);
	}
}
