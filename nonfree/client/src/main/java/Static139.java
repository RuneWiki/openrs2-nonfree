import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Lclient!cw;")
	public static Class68 aClass68_3;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[J")
	public static long[] aLongArray9;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
	public static int method2387(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!tv;)V")
	public static void method2389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub1_Sub4 arg3) {
		@Pc(4) Class364 local4 = Static309.method4578(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub1_Sub4_1 = arg3;
		@Pc(19) int local19 = Static477.aClass259Array3 == Static378.aClass259Array2 ? 1 : 0;
		if (arg3.method9093()) {
			if (arg3.method9084()) {
				arg3.aClass9_Sub1_24 = Static120.aClass9_Sub1Array2[local19];
				Static120.aClass9_Sub1Array2[local19] = arg3;
				return;
			}
			arg3.aClass9_Sub1_24 = Static356.aClass9_Sub1Array4[local19];
			Static356.aClass9_Sub1Array4[local19] = arg3;
			Static632.aBoolean653 = true;
			return;
		}
		arg3.aClass9_Sub1_24 = Static52.aClass9_Sub1Array1[local19];
		Static52.aClass9_Sub1Array1[local19] = arg3;
	}
}
