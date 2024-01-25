import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!ia;")
	public static final Class140 aClass140_17 = new Class140();

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_182 = new Class298(33, 11);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method7823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class16 local13 = local7.aClass16_3; local13 != null; local13 = local13.aClass16_1) {
			@Pc(17) Class9_Sub1_Sub1 local17 = local13.aClass9_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort112 == arg1 && local17.aShort115 == arg2) {
				Static200.method3627(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!eq;Lclient!eq;)V")
	public static void method7825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub1_Sub2 arg3, @OriginalArg(4) Class9_Sub1_Sub2 arg4) {
		@Pc(4) Class63 local4 = Static343.method5228(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub1_Sub2_1 = arg3;
		local4.aClass9_Sub1_Sub2_2 = arg4;
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

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)V")
	public static void method7826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg1, 5);
		local8.method839();
		local8.anInt1088 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!bw;Z)I")
	public static int method7827(@OriginalArg(0) Class3_Sub11_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method990(2);
		@Pc(28) int local28;
		if (local10 == 0) {
			local28 = 0;
		} else if (local10 == 1) {
			local28 = arg0.method990(5);
		} else if (local10 == 2) {
			local28 = arg0.method990(8);
		} else {
			local28 = arg0.method990(11);
		}
		return local28;
	}
}
