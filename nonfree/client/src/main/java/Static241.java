import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "Lclient!fh;")
	public static Class58 aClass58_86;

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array11;

	@OriginalMember(owner = "client!ri", name = "ab", descriptor = "[Lclient!we;")
	public static Class188[] aClass188Array12;

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString283 = "Unable to find ";

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "Lclient!cc;")
	public static Class26 aClass26_48 = new Class26(200);

	@OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
	public static int anInt4596 = 0;

	@OriginalMember(owner = "client!ri", name = "Z", descriptor = "[I")
	public static int[] anIntArray489 = new int[2];

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(ZI)V")
	public static void method3770(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class4_Sub11 local8;
		for (local8 = (Class4_Sub11) Static11.aClass114_2.method2623(); local8 != null; local8 = (Class4_Sub11) Static11.aClass114_2.method2629()) {
			if (local8.aClass4_Sub6_Sub4_3 != null) {
				Static211.aClass4_Sub6_Sub3_2.method2683(local8.aClass4_Sub6_Sub4_3);
				local8.aClass4_Sub6_Sub4_3 = null;
			}
			if (local8.aClass4_Sub6_Sub4_2 != null) {
				Static211.aClass4_Sub6_Sub3_2.method2683(local8.aClass4_Sub6_Sub4_2);
				local8.aClass4_Sub6_Sub4_2 = null;
			}
			local8.method4854();
		}
		if (!arg0) {
			return;
		}
		for (local8 = (Class4_Sub11) Static82.aClass114_9.method2623(); local8 != null; local8 = (Class4_Sub11) Static82.aClass114_9.method2629()) {
			if (local8.aClass4_Sub6_Sub4_3 != null) {
				Static211.aClass4_Sub6_Sub3_2.method2683(local8.aClass4_Sub6_Sub4_3);
				local8.aClass4_Sub6_Sub4_3 = null;
			}
			local8.method4854();
		}
		for (local8 = (Class4_Sub11) Static206.aClass85_18.method1843(); local8 != null; local8 = (Class4_Sub11) Static206.aClass85_18.method1844()) {
			if (local8.aClass4_Sub6_Sub4_3 != null) {
				Static211.aClass4_Sub6_Sub3_2.method2683(local8.aClass4_Sub6_Sub4_3);
				local8.aClass4_Sub6_Sub4_3 = null;
			}
			local8.method4854();
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Lclient!vf;")
	public static Class183 method3771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class183 local14 = local7.aClass183_1;
			local7.aClass183_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3773(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(21) int local21 = arg0.indexOf(arg2); local21 != -1; local21 = arg0.indexOf(arg2, local21 + arg1.length())) {
			arg0 = arg0.substring(0, local21) + arg1 + arg0.substring(local21 + arg2.length());
		}
		return arg0;
	}
}
