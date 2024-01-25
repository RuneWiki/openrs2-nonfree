import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!us", name = "ub", descriptor = "Lclient!lf;")
	public static Class201 aClass201_5;

	@OriginalMember(owner = "client!us", name = "lc", descriptor = "I")
	public static int anInt8633;

	@OriginalMember(owner = "client!us", name = "ee", descriptor = "I")
	public static int anInt8725;

	@OriginalMember(owner = "client!us", name = "Kd", descriptor = "Lclient!oda;")
	public static final Class240 aClass240_7 = new Class240();

	@OriginalMember(owner = "client!us", name = "de", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_170 = new Class298(45, 8);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([Lclient!gfa;II)V")
	public static void method7253(@OriginalArg(0) Class9_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class9_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8976;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8976 < local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7253(arg0, arg1, local10 - 1);
		method7253(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BZ)V")
	public static void method7254(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static307.anInt5578 != -1) {
				Static569.method7560(Static307.anInt5578);
			}
			for (@Pc(18) Class3_Sub28 local18 = (Class3_Sub28) Static227.aClass310_15.method6602(); local18 != null; local18 = (Class3_Sub28) Static227.aClass310_15.method6599()) {
				if (!local18.method7813()) {
					local18 = (Class3_Sub28) Static227.aClass310_15.method6602();
					if (local18 == null) {
						break;
					}
				}
				Static423.method6029(false, true, local18);
			}
			Static307.anInt5578 = -1;
			Static227.aClass310_15 = new Class310(8);
			Static403.method5866();
			Static307.anInt5578 = Static437.anInt7265;
			Static517.method6895(false);
			Static121.method2508();
			Static149.method2776(Static307.anInt5578);
		}
		Static451.aBoolean584 = true;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(II)V")
	public static void method7265(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class3 local9 = Static263.aClass310_17.method6602(); local9 != null; local9 = Static263.aClass310_17.method6599()) {
			if ((long) arg0 == (local9.aLong273 >> 48 & 0xFFFFL)) {
				local9.method7812();
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BI)I")
	public static int method7268(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
