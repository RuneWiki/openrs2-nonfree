import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[5];

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!uea;")
	public static final Class314 aClass314_4 = new Class314("stellardawn", 1);

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
	public static final int[] anIntArray684 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z")
	public static boolean method7407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIII)V")
	public static void method7409(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static480.aClass6_Sub37_Sub1_1.anInt6047 != 0 && arg2 != 0 && Static231.anInt3927 < 50 && arg1 != -1) {
			Static103.aClass172Array7[Static231.anInt3927++] = new Class172((byte) 1, arg1, arg2, arg3, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dga;B)Lclient!pu;")
	public static Class253 method7410(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method6006();
		@Pc(14) Class277 local14 = Static478.method6658()[arg0.method6041()];
		@Pc(21) Class137 local21 = Static344.method5181()[arg0.method6041()];
		@Pc(25) int local25 = arg0.method6008();
		@Pc(29) int local29 = arg0.method6008();
		return new Class253(local7, local14, local21, local25, local29);
	}
}
