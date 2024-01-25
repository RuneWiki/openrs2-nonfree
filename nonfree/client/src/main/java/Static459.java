import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_153 = new Class151(111, 8);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
	public static void method6401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static641.aClass31_10.method1024(Static279.aClass179_24.method4066(Static164.anInt2984));
		@Pc(72) int local72;
		@Pc(34) int local34;
		if (Static19.aBoolean35) {
			for (@Pc(20) Class4_Sub5_Sub12 local20 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local20 != null; local20 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
				if (local20.anInt4687 == 1) {
					local34 = Static485.method6637((Class4_Sub5_Sub17) local20.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67);
				} else {
					local34 = Static311.method4335(local20);
				}
				if (local34 > local13) {
					local13 = local34;
				}
			}
			Static342.anInt8649 = Static579.anInt8938 * 16 + (Static523.aBoolean633 ? 26 : 22);
			local72 = Static579.anInt8938 * 16 + 21;
			local13 += 8;
		} else {
			for (@Pc(80) Class4_Sub5_Sub17 local80 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local80 != null; local80 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
				local34 = Static485.method6637(local80);
				if (local13 < local34) {
					local13 = local34;
				}
			}
			local72 = Static574.anInt8895 * 16 + 21;
			local13 += 8;
			Static342.anInt8649 = Static574.anInt8895 * 16 + (Static523.aBoolean633 ? 26 : 22);
		}
		@Pc(121) int local121 = arg0 - local13 / 2;
		if (Static632.anInt9867 < local121 + local13) {
			local121 = Static632.anInt9867 - local13;
		}
		if (local121 < 0) {
			local121 = 0;
		}
		local34 = arg1;
		if (local72 + arg1 > Static357.anInt5421) {
			local34 = Static357.anInt5421 - local72;
		}
		Static357.anInt5417 = local121;
		if (local34 < 0) {
			local34 = 0;
		}
		Static333.aBoolean400 = true;
		Static430.anInt6771 = local34;
		Static506.anInt7915 = local13;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILclient!et;Lclient!et;)V")
	public static void method6403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub4 arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4) {
		@Pc(4) Class73 local4 = Static558.method7416(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass3_Sub1_Sub4_1 = arg3;
		local4.aClass3_Sub1_Sub4_2 = arg4;
		@Pc(19) int local19 = Static140.aClass42Array4 == Static146.aClass42Array3 ? 1 : 0;
		if (!arg3.method8500()) {
			arg3.aClass3_Sub1_23 = Static596.aClass3_Sub1Array4[local19];
			Static596.aClass3_Sub1Array4[local19] = arg3;
		} else if (arg3.method8501()) {
			arg3.aClass3_Sub1_23 = Static506.aClass3_Sub1Array3[local19];
			Static506.aClass3_Sub1Array3[local19] = arg3;
		} else {
			arg3.aClass3_Sub1_23 = Static114.aClass3_Sub1Array1[local19];
			Static114.aClass3_Sub1Array1[local19] = arg3;
			Static42.aBoolean73 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8500()) {
			if (arg4.method8501()) {
				arg4.aClass3_Sub1_23 = Static506.aClass3_Sub1Array3[local19];
				Static506.aClass3_Sub1Array3[local19] = arg4;
				return;
			}
			arg4.aClass3_Sub1_23 = Static114.aClass3_Sub1Array1[local19];
			Static114.aClass3_Sub1Array1[local19] = arg4;
			Static42.aBoolean73 = true;
			return;
		}
		arg4.aClass3_Sub1_23 = Static596.aClass3_Sub1Array4[local19];
		Static596.aClass3_Sub1Array4[local19] = arg4;
	}
}
