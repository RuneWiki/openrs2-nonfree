import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
	public static int anInt10085;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIILclient!hf;)V")
	public static void method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub5 arg3) {
		@Pc(4) Class77 local4 = Static323.method5276(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub1_Sub5_1 = arg3;
		@Pc(16) int local16 = Static364.aClass51Array3 == Static2.aClass51Array1 ? 1 : 0;
		if (arg3.method7693()) {
			if (arg3.method7702()) {
				Static368.aClass4_Sub1ArrayArray2[local16][Static62.anIntArray650[local16]++] = arg3;
				return;
			}
			Static276.aClass4_Sub1ArrayArray1[local16][Static93.anIntArray83[local16]++] = arg3;
			Static585.aBoolean690 = true;
			return;
		}
		Static491.aClass4_Sub1ArrayArray3[local16][Static582.anIntArray612[local16]++] = arg3;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIZZI)V")
	public static void method8644(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static351.method5812(arg0, arg3, Static528.aClass96_Sub1Array2.length - 1, arg1, 0, arg2);
		Static100.anInt2253 = 0;
		Static442.aClass3_Sub42_1 = null;
	}
}
