import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
	public static int anInt4809;

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_246 = new Class12(35, -2);

	@OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
	public static final int anInt4807 = 1338;

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_100 = new Class254(23, 7);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method3932(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static120.anIntArray126[local3] = Static120.anIntArray126[local3 - 1];
			Static412.anIntArray546[local3] = Static412.anIntArray546[local3 - 1];
			Static301.aStringArray24[local3] = Static301.aStringArray24[local3 - 1];
			Static11.aStringArray2[local3] = Static11.aStringArray2[local3 - 1];
			Static434.aStringArray44[local3] = Static434.aStringArray44[local3 - 1];
			Static448.aStringArray45[local3] = Static448.aStringArray45[local3 - 1];
			Static125.anIntArray245[local3] = Static125.anIntArray245[local3 - 1];
		}
		Static120.anIntArray126[0] = arg6;
		Static412.anIntArray546[0] = arg3;
		Static301.aStringArray24[0] = arg0;
		Static11.aStringArray2[0] = arg2;
		Static434.aStringArray44[0] = arg5;
		Static3.anInt60++;
		Static108.anInt2095 = Static270.anInt2350;
		Static125.anIntArray245[0] = arg1;
		Static448.aStringArray45[0] = arg4;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method3937() {
		if (Static327.aClass230_Sub1_1.method5644(Static146.anInt2664) || Static1.anInt41 == Static29.anInt483) {
			Static25.method354(Static447.aClass121_11);
			if (Static1.anInt41 != Static101.anInt1975) {
				Static2.method35();
			}
		} else {
			Static389.method5445(Static289.anInt4852, false, false, Static254.anInt4366);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(20) Class1_Sub13 local20 = (Class1_Sub13) Static85.aClass51_6.method930(local14);
		if (local20 == null) {
			local20 = new Class1_Sub13();
			Static85.aClass51_6.method931(local20, local14);
		}
		if (arg1 >= local20.anIntArray82.length) {
			@Pc(45) int[] local45 = new int[arg1 + 1];
			@Pc(50) int[] local50 = new int[arg1 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray82.length; local52++) {
				local45[local52] = local20.anIntArray82[local52];
				local50[local52] = local20.anIntArray80[local52];
			}
			for (@Pc(82) int local82 = local20.anIntArray82.length; local82 < arg1; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local20.anIntArray80 = local50;
			local20.anIntArray82 = local45;
		}
		local20.anIntArray82[arg1] = arg0;
		local20.anIntArray80[arg1] = arg2;
	}
}
