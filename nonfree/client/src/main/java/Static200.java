import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "Lclient!sga;")
	public static Class297 aClass297_9;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!pe;")
	public static Class254 aClass254_66;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public static int anInt3899 = 0;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[Lclient!dl;")
	public static Class64[] aClass64Array1 = new Class64[50];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)Z")
	public static boolean method3363(@OriginalArg(0) boolean arg0) {
		@Pc(21) boolean local21 = Static546.aClass15_16.method5325();
		if (arg0 == local21) {
			return true;
		}
		if (!arg0) {
			Static546.aClass15_16.method5295();
		} else if (!Static546.aClass15_16.method5314()) {
			arg0 = false;
		}
		if (local21 == arg0) {
			return false;
		} else {
			Static455.aClass3_Sub27_Sub1_1.aBoolean380 = arg0;
			Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
			return true;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!mca;")
	public static Class2_Sub2 method3364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class302 local14 = local7.aClass302_1; local14 != null; local14 = local14.aClass302_2) {
			@Pc(18) Class2_Sub2 local18 = local14.aClass2_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort120 == arg1 && local18.aShort122 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;JLjava/lang/String;IIZIIZB)V")
	public static void method3365(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		if (!Static256.aBoolean474 && Static309.anInt6170 < 500) {
			@Pc(19) int local19 = arg7 == -1 ? Static68.anInt1810 : arg7;
			@Pc(33) Class3_Sub40 local33 = new Class3_Sub40(arg3, arg1, local19, arg4, arg5, arg2, arg8, arg0, arg9, arg6);
			Static342.aClass183_44.method4792(local33);
			Static309.anInt6170++;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;ZZII)V")
	public static void method3366(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static178.method3156(arg3, null, arg2, false, arg1, arg0);
	}
}
