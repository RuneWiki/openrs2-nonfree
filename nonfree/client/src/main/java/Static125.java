import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!gj;")
	public static Class124 aClass124_3;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt2486 = 0;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "[I")
	public static int[] anIntArray210 = new int[1];

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(III)Lclient!cja;")
	public static Class58 method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static486.aClass58ArrayArrayArray2[0][arg1][arg2] != null && Static486.aClass58ArrayArrayArray2[0][arg1][arg2].aClass58_1 != null;
			if (local28 && arg0 >= Static613.anInt10338 - 1) {
				return null;
			}
			Static143.method2263(arg0, arg1, arg2);
		}
		return Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!so;)Lclient!ht;")
	public static Class92_Sub1_Sub1 method2097(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(7) Class92_Sub1 local7 = Static108.method1901(arg0);
		@Pc(18) int local18 = arg0.method5890();
		return new Class92_Sub1_Sub1(local7.aClass168_13, local7.aClass339_13, local7.anInt10908, local7.anInt10902, local7.anInt10903, local7.anInt10907, local7.anInt10904, local7.anInt10910, local7.anInt10905, local7.anInt4239, local7.anInt4234, local7.anInt4237, local7.anInt4235, local7.anInt4233, local7.anInt4236, local18);
	}
}
