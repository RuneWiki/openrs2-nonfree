import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eha", name = "r", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!eha", name = "m", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_36 = new Class100(63, -1);

	@OriginalMember(owner = "client!eha", name = "q", descriptor = "I")
	public static int anInt2538 = 0;

	@OriginalMember(owner = "client!eha", name = "s", descriptor = "I")
	public static int anInt2539 = 0;

	@OriginalMember(owner = "client!eha", name = "u", descriptor = "S")
	public static short aShort27 = 1;

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(BLclient!qfa;III)Lclient!cw;")
	public static Class66_Sub1_Sub1 method2131(@OriginalArg(1) Class137_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean595 || Static178.method2845(arg3) && Static178.method2845(arg2)) {
			return new Class66_Sub1_Sub1(arg0, 3553, arg1, arg3, arg2);
		} else if (arg0.aBoolean596) {
			return new Class66_Sub1_Sub1(arg0, 34037, arg1, arg3, arg2);
		} else {
			return new Class66_Sub1_Sub1(arg0, arg1, arg3, arg2, Static330.method5181(arg3), Static330.method5181(arg2));
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(BI)I")
	public static int method2134(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V")
	public static void method2136() {
		Static5.method6557();
		Static487.anInt9463 = 0;
		Static349.aClass44_113 = null;
		Static156.aClass44_62 = null;
		Static264.aClass44_88 = null;
		Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
		Static192.anInt3587 = 0;
		Static638.anInt10676 = 0;
		Static96.aClass44_46 = null;
		Static524.method7528();
		Static588.method8386();
		for (@Pc(34) int local34 = 0; local34 < 2048; local34++) {
			Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local34] = null;
		}
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 = null;
		for (@Pc(50) int local50 = 0; local50 < Static570.anInt9823; local50++) {
			@Pc(57) Class12_Sub2_Sub2_Sub1_Sub1 local57 = Static151.aClass14_Sub44Array1[local50].aClass12_Sub2_Sub2_Sub1_Sub1_2;
			if (local57 != null) {
				local57.anInt2903 = -1;
			}
		}
		Static284.method4065();
		Static115.anInt2304 = -1;
		Static667.anInt11097 = -1;
		Static378.anInt6935 = 1;
		Static67.method1345(10);
		for (@Pc(79) int local79 = 0; local79 < 100; local79++) {
			Static446.aBooleanArray18[local79] = true;
		}
		Static615.method8633();
		Static639.aLong293 = 0L;
		Static178.aClass14_Sub4_1 = null;
	}
}
