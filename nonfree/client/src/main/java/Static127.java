import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIILclient!pc;Lclient!pc;)V")
	public static void method2546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub1_Sub4 arg3, @OriginalArg(4) Class9_Sub1_Sub4 arg4) {
		@Pc(4) Class63 local4 = Static343.method5228(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub1_Sub4_1 = arg3;
		local4.aClass9_Sub1_Sub4_2 = arg4;
		@Pc(19) int local19 = Static29.aClass139Array6 == Static168.aClass139Array22 ? 1 : 0;
		if (!arg3.method7481()) {
			Static225.aClass9_Sub1ArrayArray1[local19][Static1.anIntArray1[local19]++] = arg3;
		} else if (arg3.method7473()) {
			Static239.aClass9_Sub1ArrayArray2[local19][Static343.anIntArray471[local19]++] = arg3;
		} else {
			Static499.aClass9_Sub1ArrayArray3[local19][Static332.anIntArray459[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7481()) {
			if (arg4.method7473()) {
				Static239.aClass9_Sub1ArrayArray2[local19][Static343.anIntArray471[local19]++] = arg4;
				return;
			}
			Static499.aClass9_Sub1ArrayArray3[local19][Static332.anIntArray459[local19]++] = arg4;
			return;
		}
		Static225.aClass9_Sub1ArrayArray1[local19][Static1.anIntArray1[local19]++] = arg4;
	}
}
