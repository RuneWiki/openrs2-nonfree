import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "Z")
	public static boolean aBoolean63;

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "[Lclient!ki;")
	public static final Class11_Sub5_Sub2_Sub1[] aClass11_Sub5_Sub2_Sub1Array1 = new Class11_Sub5_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_36 = new Class214(104, 19);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Lclient!pl;")
	public static Class11_Sub3 method805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_2;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method806(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static315.method4358(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static65.anInt1626; local29++) {
			@Pc(35) String local35 = Static75.aStringArray9[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static315.method4358(local35);
			if (local35 != null && local35.equals(local24)) {
				Static65.anInt1626--;
				for (@Pc(59) int local59 = local29; local59 < Static65.anInt1626; local59++) {
					Static75.aStringArray9[local59] = Static75.aStringArray9[local59 + 1];
					Static108.aStringArray10[local59] = Static108.aStringArray10[local59 + 1];
					Static269.anIntArray390[local59] = Static269.anIntArray390[local59 + 1];
					Static5.aStringArray1[local59] = Static5.aStringArray1[local59 + 1];
					Static158.anIntArray216[local59] = Static158.anIntArray216[local59 + 1];
					Static121.aBooleanArray154[local59] = Static121.aBooleanArray154[local59 + 1];
				}
				Static368.anInt6378 = Static446.anInt7635;
				Static448.method6134(Static80.aClass212_22);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(arg0));
				Static457.aClass4_Sub20_Sub1_5.method4599(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "(II)V")
	public static void method808(@OriginalArg(1) int arg0) {
		Static452.anInt7756 = arg0;
		@Pc(7) Class83 local7 = Static164.aClass83_24;
		synchronized (Static164.aClass83_24) {
			Static164.aClass83_24.method2346();
		}
		local7 = Static199.aClass83_5;
		synchronized (Static199.aClass83_5) {
			Static199.aClass83_5.method2346();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)Z")
	public static boolean method809(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ci;III)Lclient!ch;")
	public static Class37 method813(@OriginalArg(0) Class38 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method1039(0, arg1);
		return local9 == null ? null : new Class37(local9);
	}

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "(II)Z")
	public static boolean method814(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
