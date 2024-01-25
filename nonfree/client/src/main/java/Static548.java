import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!tia", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("87d2c867cb1ce29ac740deea9b15092fe92b9bb7daa489ad025ea95852070fac17ae66144119f134f0ae13236b003a8399f8ff59e9c857b81c4ef765ee48b7d7", 16);

	@OriginalMember(owner = "client!tia", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!tia", name = "q", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_104 = new Class185(33, 3);

	@OriginalMember(owner = "client!tia", name = "r", descriptor = "[I")
	public static final int[] anIntArray502 = new int[32];

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!sba;Z)V")
	public static void method7723(@OriginalArg(0) Class302 arg0) {
		@Pc(7) Class302 local7 = Static613.method8401(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static277.anInt5899;
			local13 = Static294.anInt6026;
		} else {
			local11 = local7.anInt8872;
			local13 = local7.anInt8909;
		}
		Static446.method6811(local11, local13, arg0, false);
		Static73.method2087(local13, local11, arg0);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lclient!fp;")
	public static Class108 method7724(@OriginalArg(0) int arg0) {
		@Pc(15) Class108 local15 = (Class108) Static276.aClass94_61.method2960((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static231.aClass223_56.method5954(arg0, 0);
		local15 = new Class108();
		if (local25 != null) {
			local15.method3162(new Class6_Sub8(local25));
		}
		local15.method3165();
		Static276.aClass94_61.method2963((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method7725(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static264.method4755(arg5, arg0, arg4, arg1, -1, (String) null, arg2, arg3);
	}
}
