import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!na", name = "wb", descriptor = "Lclient!vj;")
	public static Class145 aClass145_6;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	public static int anInt3643 = 0;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = new String[1000];

	@OriginalMember(owner = "client!na", name = "X", descriptor = "I")
	public static int anInt3663 = 2;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)V")
	public static void method2728(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static122.aClass1_Sub2_Sub11_2 != null) {
			Static106.anInt2860 = Static122.aClass1_Sub2_Sub11_2.anInt3844;
		} else {
			Static106.anInt2860 = -1;
		}
		Static117.aByteArrayArrayArray8 = null;
		Static191.aByteArrayArrayArray14 = null;
		Static228.anIntArrayArrayArray12 = null;
		Static67.aByteArrayArrayArray6 = null;
		Static5.anIntArrayArrayArray2 = null;
		Static45.aByteArrayArrayArray5 = null;
		Static265.anInt5546 = 0;
		Static138.aByteArrayArrayArray11 = null;
		Static25.anIntArrayArrayArray3 = null;
		Static122.aClass1_Sub2_Sub11_2 = null;
		Static93.anIntArray191 = null;
		Static68.aClass122_5 = null;
		Static225.aClass3_20.method29();
		Static57.aClass103_2 = null;
		Static119.aClass1_Sub2_Sub4_3 = null;
		Static206.anInt4549 = -1;
		Static240.aClass103_7 = null;
		Static28.aClass103_1 = null;
		Static221.aClass103_6 = null;
		Static77.aClass103_3 = null;
		Static125.aClass103_5 = null;
		Static251.aClass103_8 = null;
		Static249.anInt5332 = -1;
		Static254.aClass151_2 = null;
		Static84.aClass103_4 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILclient!gh;IIB)Lclient!gh;")
	public static Class9_Sub5 method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub5 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = (long) arg1;
		@Pc(19) Class9_Sub5 local19 = (Class9_Sub5) Static26.aClass79_4.method2483(local4);
		if (local19 == null) {
			@Pc(26) Class9_Sub3 local26 = Static27.method545(Static197.aClass51_28, arg1);
			if (local26 == null) {
				return null;
			}
			local19 = local26.method526(64, 768, -50, -10, -50);
			Static26.aClass79_4.method2486(local19, local4);
		}
		@Pc(46) int local46 = arg3.method3616();
		@Pc(49) int local49 = arg3.method3599();
		@Pc(52) int local52 = arg3.method3608();
		@Pc(55) int local55 = arg3.method3602();
		local19 = local19.method3625(true, true, true);
		if (arg5 != 0) {
			local19.method3622(arg5);
		}
		@Pc(72) Class9_Sub5_Sub1 local72 = (Class9_Sub5_Sub1) local19;
		if (arg2 != Static200.method3326(Static137.anInt3321, local52 + arg0, local46 + arg4) || arg2 != Static200.method3326(Static137.anInt3321, local55 + arg0, local49 + arg4)) {
			for (@Pc(100) int local100 = 0; local100 < local72.anInt4809; local100++) {
				local72.anIntArray398[local100] += Static200.method3326(Static137.anInt3321, arg0 + local72.anIntArray393[local100], local72.anIntArray397[local100] - -arg4) - arg2;
			}
			local72.aBoolean248 = false;
		}
		return local19;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method2735() {
		if (Static247.aBoolean268) {
			return;
		}
		Static247.aBoolean268 = true;
		Static89.aBoolean139 = true;
		if (Static138.aBoolean180) {
			Static158.aFloat32 = (int) Static158.aFloat32 - 17 & 0xFFFFFFF0;
		} else {
			Static201.aFloat40 += (-12.0F - Static201.aFloat40) / 2.0F;
		}
	}
}
