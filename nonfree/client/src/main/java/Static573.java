import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
	public static int anInt9122;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "Z")
	public static boolean aBoolean680;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString114 = null;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
	public static void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static161.method2738(local7.aClass23_Sub2_Sub5_1);
		Static161.method2738(local7.aClass23_Sub2_Sub5_2);
		if (local7.aClass23_Sub2_Sub5_1 != null) {
			local7.aClass23_Sub2_Sub5_1 = null;
		}
		if (local7.aClass23_Sub2_Sub5_2 != null) {
			local7.aClass23_Sub2_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLclient!sm;)V")
	public static void method7743(@OriginalArg(1) Class3_Sub49 arg0) {
		if (Static332.aClass247ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface2 local8 = null;
		if (arg0.anInt8928 == 0) {
			local8 = (Interface2) Static363.method5416(arg0.anInt8927, arg0.anInt8929, arg0.anInt8924);
		}
		if (arg0.anInt8928 == 1) {
			local8 = (Interface2) Static244.method3912(arg0.anInt8927, arg0.anInt8929, arg0.anInt8924);
		}
		if (arg0.anInt8928 == 2) {
			local8 = (Interface2) Static344.method5203(arg0.anInt8927, arg0.anInt8929, arg0.anInt8924, bea.class);
		}
		if (arg0.anInt8928 == 3) {
			local8 = (Interface2) Static306.method4709(arg0.anInt8927, arg0.anInt8929, arg0.anInt8924);
		}
		if (local8 == null) {
			arg0.anInt8923 = 0;
			arg0.anInt8932 = 0;
			arg0.anInt8926 = -1;
		} else {
			arg0.anInt8926 = local8.method7823();
			arg0.anInt8932 = local8.method7824();
			arg0.anInt8923 = local8.method7827();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!gj;II)Lclient!dc;")
	public static Class73 method7744(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1) {
		@Pc(9) byte[] local9 = arg1.method3125(0, arg0);
		return local9 == null ? null : new Class73(local9);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
	public static void method7745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static338.aByteArrayArrayArray13 = new byte[4][arg0][arg1];
	}
}
