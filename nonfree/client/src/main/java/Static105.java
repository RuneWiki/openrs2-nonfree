import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!rv;")
	public static Class302 aClass302_1;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "Lclient!mda;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public static int anInt2311 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
	public static void method2168() {
		Static269.method4420(Static442.anInt7929);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILclient!um;Lclient!um;)V")
	public static void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub4 arg3, @OriginalArg(4) Class4_Sub1_Sub4 arg4) {
		@Pc(4) Class77 local4 = Static323.method5276(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub1_Sub4_2 = arg3;
		local4.aClass4_Sub1_Sub4_1 = arg4;
		@Pc(19) int local19 = Static364.aClass51Array3 == Static2.aClass51Array1 ? 1 : 0;
		if (!arg3.method7693()) {
			Static491.aClass4_Sub1ArrayArray3[local19][Static582.anIntArray612[local19]++] = arg3;
		} else if (arg3.method7702()) {
			Static368.aClass4_Sub1ArrayArray2[local19][Static62.anIntArray650[local19]++] = arg3;
		} else {
			Static276.aClass4_Sub1ArrayArray1[local19][Static93.anIntArray83[local19]++] = arg3;
			Static585.aBoolean690 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7693()) {
			if (arg4.method7702()) {
				Static368.aClass4_Sub1ArrayArray2[local19][Static62.anIntArray650[local19]++] = arg4;
				return;
			}
			Static276.aClass4_Sub1ArrayArray1[local19][Static93.anIntArray83[local19]++] = arg4;
			Static585.aBoolean690 = true;
			return;
		}
		Static491.aClass4_Sub1ArrayArray3[local19][Static582.anIntArray612[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!rq;Lclient!ha;BII)V")
	public static void method2172(@OriginalArg(0) int arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class296 local11 = Static9.aClass202_1.method5162(arg1.anInt8626);
		if (local11.anInt8604 == -1) {
			return;
		}
		if (arg1.aBoolean608) {
			@Pc(24) int local24 = arg0 + arg1.anInt8635;
			arg0 = local24 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(42) Class24 local42 = local11.method7392(arg1.aBoolean610, arg0, arg2);
		if (local42 == null) {
			return;
		}
		@Pc(48) int local48 = arg1.anInt8661;
		@Pc(51) int local51 = arg1.anInt8625;
		if ((arg0 & 0x1) == 1) {
			local51 = arg1.anInt8661;
			local48 = arg1.anInt8625;
		}
		@Pc(67) int local67 = local42.method8576();
		@Pc(70) int local70 = local42.method8573();
		if (local11.aBoolean597) {
			local70 = local51 * 4;
			local67 = local48 * 4;
		}
		if (local11.anInt8603 == 0) {
			local42.method8564(arg4, arg3 + 4 - local51 * 4, local67, local70);
		} else {
			local42.method8562(arg4, arg3 + 4 - local51 * 4, local67, local70, 0, local11.anInt8603 | 0xFF000000, 1);
		}
	}
}
