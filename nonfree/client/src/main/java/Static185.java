import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
	public static int anInt3482;

	@OriginalMember(owner = "client!kr", name = "U", descriptor = "I")
	public static int anInt3487;

	@OriginalMember(owner = "client!kr", name = "N", descriptor = "[I")
	public static final int[] anIntArray675 = new int[4];

	@OriginalMember(owner = "client!kr", name = "S", descriptor = "I")
	public static int anInt3485 = 104;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!wg;IIIIILclient!gf;Lclient!nm;)V")
	public static void method3197(@OriginalArg(0) Class1_Sub5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub5_Sub1_Sub1 arg5, @OriginalArg(7) Class172 arg6) {
		@Pc(7) Class2_Sub29 local7 = new Class2_Sub29();
		local7.anInt3900 = arg3 * 128;
		local7.anInt3893 = arg4;
		local7.anInt3899 = arg1 * 128;
		if (arg6 != null) {
			local7.aClass172_1 = arg6;
			@Pc(133) int local133 = arg6.anInt4106;
			@Pc(136) int local136 = arg6.anInt4113;
			if (arg2 == 1 || arg2 == 3) {
				local136 = arg6.anInt4106;
				local133 = arg6.anInt4113;
			}
			local7.anInt3902 = arg6.anInt4122 * 128;
			local7.anIntArray770 = arg6.anIntArray805;
			local7.anInt3894 = arg6.anInt4134;
			local7.anInt3905 = arg6.anInt4143;
			local7.anInt3898 = arg6.anInt4147;
			local7.anInt3907 = arg6.anInt4123;
			local7.anInt3904 = (arg3 + local136) * 128;
			local7.anInt3896 = (arg1 + local133) * 128;
			if (arg6.anIntArray801 != null) {
				local7.aBoolean295 = true;
				local7.method3586();
			}
			if (local7.anIntArray770 != null) {
				local7.anInt3906 = (int) (Math.random() * (double) (local7.anInt3907 - local7.anInt3894)) + local7.anInt3894;
			}
			Static161.aClass30_18.method685(local7);
			return;
		}
		if (arg0 != null) {
			local7.aClass1_Sub5_Sub1_Sub2_1 = arg0;
			@Pc(30) Class133 local30 = arg0.aClass133_1;
			if (local30.anIntArray653 != null) {
				local7.aBoolean295 = true;
				local30 = local30.method3094(Static321.aClass211_1);
			}
			if (local30 != null) {
				local7.anInt3904 = (local30.anInt3332 + arg3) * 128;
				local7.anInt3896 = (local30.anInt3332 + arg1) * 128;
				local7.anInt3905 = Static121.method2479(arg0);
				local7.anInt3898 = local30.anInt3371;
				local7.anInt3902 = local30.anInt3340 * 128;
			}
			Static386.aClass30_44.method685(local7);
			return;
		}
		if (arg5 == null) {
			return;
		}
		local7.aClass1_Sub5_Sub1_Sub1_2 = arg5;
		local7.anInt3896 = (arg5.method5547() + arg1) * 128;
		local7.anInt3904 = (arg5.method5547() + arg3) * 128;
		local7.anInt3905 = Static164.method2912(arg5);
		local7.anInt3898 = arg5.anInt2299;
		local7.anInt3902 = arg5.anInt2296 * 128;
		Static367.aClass246_32.method5609(local7, (long) arg5.anInt6413);
		return;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!kk;I)Ljava/lang/String;")
	public static String method3199(@OriginalArg(0) Class2_Sub16 arg0) {
		return Static137.method4187(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([Lclient!ae;IB)V")
	public static void method3200(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class4 local15 = arg0[local7];
			if (local15 != null) {
				if (local15.anInt125 == 0) {
					if (local15.aClass4Array1 != null) {
						method3200(local15.aClass4Array1, arg1);
					}
					@Pc(38) Class2_Sub38 local38 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local15.anInt94);
					if (local38 != null) {
						Static55.method919(arg1, local38.anInt4976);
					}
				}
				@Pc(56) Class2_Sub22 local56;
				if (arg1 == 0 && local15.anObjectArray18 != null) {
					local56 = new Class2_Sub22();
					local56.anObjectArray33 = local15.anObjectArray18;
					local56.aClass4_15 = local15;
					Static256.method4003(local56);
				}
				if (arg1 == 1 && local15.anObjectArray5 != null) {
					if (local15.lb >= 0) {
						@Pc(81) Class4 local81 = Static380.method5560(local15.anInt94);
						if (local81 == null || local81.aClass4Array1 == null || local81.aClass4Array1.length <= local15.lb || local81.aClass4Array1[local15.lb] != local15) {
							continue;
						}
					}
					local56 = new Class2_Sub22();
					local56.anObjectArray33 = local15.anObjectArray5;
					local56.aClass4_15 = local15;
					Static256.method4003(local56);
				}
			}
		}
	}
}
