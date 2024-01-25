import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jha", name = "h", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_157 = new Class288(117, 3);

	@OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
	public static int anInt4279 = 0;

	@OriginalMember(owner = "client!jha", name = "n", descriptor = "Z")
	public static boolean aBoolean291 = true;

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIBIIILclient!ha;)V")
	public static void method3732(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class95 arg4) {
		if ((Static613.aClass61_34 == null || Static169.aClass61_6 == null || Static167.aClass61_5 == null) && Static79.aClass380_22.method8638(Static220.anInt3595) && Static79.aClass380_22.method8638(Static175.anInt3082) && Static79.aClass380_22.method8638(Static368.anInt5823)) {
			@Pc(27) Class329 local27 = Static655.method7423(Static79.aClass380_22, Static175.anInt3082, 0);
			Static169.aClass61_6 = arg4.method6980(local27, true);
			local27.method7417();
			Static375.aClass61_18 = arg4.method6980(local27, true);
			Static613.aClass61_34 = arg4.method6980(Static655.method7423(Static79.aClass380_22, Static220.anInt3595, 0), true);
			@Pc(52) Class329 local52 = Static655.method7423(Static79.aClass380_22, Static368.anInt5823, 0);
			Static167.aClass61_5 = arg4.method6980(local52, true);
			local52.method7417();
			Static264.aClass61_17 = arg4.method6980(local52, true);
		}
		if (Static613.aClass61_34 == null || Static169.aClass61_6 == null || Static167.aClass61_5 == null) {
			return;
		}
		@Pc(89) int local89 = (arg2 - Static167.aClass61_5.method6445() * 2) / Static613.aClass61_34.method6445();
		for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
			Static613.aClass61_34.method6431(Static167.aClass61_5.method6445() + arg3 + local91 * Static613.aClass61_34.method6445(), arg0 + (arg1 - Static613.aClass61_34.method6447()));
		}
		@Pc(129) int local129 = (arg0 - Static167.aClass61_5.method6447() - 20) / Static169.aClass61_6.method6447();
		for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
			Static169.aClass61_6.method6431(arg3, arg1 + local131 * Static169.aClass61_6.method6447() + 20);
			Static375.aClass61_18.method6431(arg2 + arg3 - Static375.aClass61_18.method6445(), local131 * Static169.aClass61_6.method6447() + arg1 - -20);
		}
		Static167.aClass61_5.method6431(arg3, arg1 + arg0 - Static167.aClass61_5.method6447());
		Static264.aClass61_17.method6431(arg2 + arg3 - Static167.aClass61_5.method6445(), arg0 + arg1 + -Static167.aClass61_5.method6447());
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II[IIIII[FI[I[FII)V")
	public static void method3735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg7 + arg0 * arg10;
		@Pc(17) int local17 = arg4 * arg1 + arg11;
		@Pc(39) int local39 = arg0 - arg3;
		@Pc(44) int local44 = arg4 - arg3;
		@Pc(48) int local48;
		@Pc(54) int local54;
		if (arg8 == null) {
			for (local48 = 0; local48 < arg5; local48++) {
				local54 = local11 + arg3;
				while (local54 > local11) {
					arg6[local17++] = arg9[local11++];
				}
				local11 += local39;
				local17 += local44;
			}
		} else if (arg9 == null) {
			for (local48 = 0; local48 < arg5; local48++) {
				local54 = arg3 + local11;
				while (local11 < local54) {
					arg2[local17++] = arg8[local11++];
				}
				local17 += local44;
				local11 += local39;
			}
		} else {
			for (local48 = 0; local48 < arg5; local48++) {
				local54 = local11 + arg3;
				while (local54 > local11) {
					arg2[local17] = arg8[local11];
					arg6[local17++] = arg9[local11++];
				}
				local17 += local44;
				local11 += local39;
			}
		}
	}
}
