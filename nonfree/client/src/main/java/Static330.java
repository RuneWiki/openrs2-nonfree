import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
	public static int anInt6459;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIILclient!fw;Lclient!fw;)V")
	public static void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13_Sub1_Sub4 arg3, @OriginalArg(4) Class13_Sub1_Sub4 arg4) {
		@Pc(4) Class53 local4 = Static435.method2767(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass13_Sub1_Sub4_1 = arg3;
		local4.aClass13_Sub1_Sub4_2 = arg4;
		@Pc(19) int local19 = Static314.aClass76Array2 == Static313.aClass76Array1 ? 1 : 0;
		if (!arg3.method8408()) {
			Static139.aClass13_Sub1ArrayArray1[local19][Static497.anIntArray571[local19]++] = arg3;
		} else if (arg3.method8413()) {
			Static417.aClass13_Sub1ArrayArray2[local19][Static28.anIntArray63[local19]++] = arg3;
		} else {
			Static597.aClass13_Sub1ArrayArray3[local19][Static369.anIntArray426[local19]++] = arg3;
			Static116.aBoolean155 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8408()) {
			if (arg4.method8413()) {
				Static417.aClass13_Sub1ArrayArray2[local19][Static28.anIntArray63[local19]++] = arg4;
				return;
			}
			Static597.aClass13_Sub1ArrayArray3[local19][Static369.anIntArray426[local19]++] = arg4;
			Static116.aBoolean155 = true;
			return;
		}
		Static139.aClass13_Sub1ArrayArray1[local19][Static497.anIntArray571[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)Lclient!cea;")
	public static Class13_Sub1_Sub3 method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass13_Sub1_Sub3_2;
	}
}
