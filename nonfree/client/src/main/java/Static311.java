import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIILclient!kg;Lclient!kg;)V")
	public static void method4313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub3_Sub4 arg3, @OriginalArg(4) Class8_Sub3_Sub4 arg4) {
		@Pc(4) Class39 local4 = Static589.method7833(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass8_Sub3_Sub4_1 = arg3;
		local4.aClass8_Sub3_Sub4_2 = arg4;
		@Pc(19) int local19 = Static199.aClass47Array1 == Static557.aClass47Array3 ? 1 : 0;
		if (!arg3.method7622()) {
			Static88.aClass8_Sub3ArrayArray2[local19][Static583.anIntArray731[local19]++] = arg3;
		} else if (arg3.method7620()) {
			Static471.aClass8_Sub3ArrayArray3[local19][Static437.anIntArray588[local19]++] = arg3;
		} else {
			Static34.aClass8_Sub3ArrayArray4[local19][Static11.anIntArray12[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7622()) {
			if (arg4.method7620()) {
				Static471.aClass8_Sub3ArrayArray3[local19][Static437.anIntArray588[local19]++] = arg4;
				return;
			}
			Static34.aClass8_Sub3ArrayArray4[local19][Static11.anIntArray12[local19]++] = arg4;
			return;
		}
		Static88.aClass8_Sub3ArrayArray2[local19][Static583.anIntArray731[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public static void method4314() {
		Static403.method5615();
		Static510.method7089();
	}
}
