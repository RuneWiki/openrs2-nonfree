import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "[Lclient!pt;")
	public static Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "Lclient!nea;")
	public static Class241 aClass241_1;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_128 = new Class100(6, 4);

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "J")
	public static long aLong265 = -1L;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBI)Z")
	public static boolean method8432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILclient!eba;Lclient!eba;)V")
	public static void method8436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2_Sub1 arg3, @OriginalArg(4) Class12_Sub2_Sub1 arg4) {
		@Pc(4) Class58 local4 = Static125.method2096(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass12_Sub2_Sub1_1 = arg3;
		local4.aClass12_Sub2_Sub1_2 = arg4;
		@Pc(19) int local19 = Static576.aClass51Array3 == Static473.aClass51Array2 ? 1 : 0;
		if (!arg3.method9161()) {
			arg3.aClass12_Sub2_22 = Static177.aClass12_Sub2Array2[local19];
			Static177.aClass12_Sub2Array2[local19] = arg3;
		} else if (arg3.method9150()) {
			arg3.aClass12_Sub2_22 = Static154.aClass12_Sub2Array1[local19];
			Static154.aClass12_Sub2Array1[local19] = arg3;
		} else {
			arg3.aClass12_Sub2_22 = Static447.aClass12_Sub2Array8[local19];
			Static447.aClass12_Sub2Array8[local19] = arg3;
			Static17.aBoolean15 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9161()) {
			if (arg4.method9150()) {
				arg4.aClass12_Sub2_22 = Static154.aClass12_Sub2Array1[local19];
				Static154.aClass12_Sub2Array1[local19] = arg4;
				return;
			}
			arg4.aClass12_Sub2_22 = Static447.aClass12_Sub2Array8[local19];
			Static447.aClass12_Sub2Array8[local19] = arg4;
			Static17.aBoolean15 = true;
			return;
		}
		arg4.aClass12_Sub2_22 = Static177.aClass12_Sub2Array2[local19];
		Static177.aClass12_Sub2Array2[local19] = arg4;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!it;")
	public static Class12_Sub2_Sub2 method8438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class43 local14 = local7.aClass43_4; local14 != null; local14 = local14.aClass43_3) {
			@Pc(18) Class12_Sub2_Sub2 local18 = local14.aClass12_Sub2_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort111 == arg1 && local18.aShort110 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
