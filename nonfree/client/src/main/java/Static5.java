import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "D", descriptor = "I")
	public static int anInt143;

	@OriginalMember(owner = "client!af", name = "M", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIILclient!co;IBILclient!co;)V")
	public static void method153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub2_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(9) Class3_Sub2_Sub1 arg6) {
		@Pc(7) int local7 = arg4.method4932();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class17 local21 = (Class17) Static228.aClass171_37.method3941((long) local7);
		if (local21 == null) {
			@Pc(28) Class85[] local28 = Static459.method2071(Static153.aClass160_25, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static33.aClass49_1.method4435(local28[0]);
			Static228.aClass171_37.method3940((long) local7, local21);
		}
		Static33.method575(arg6.anInt6119, 0, arg1 >> 1, arg6.method4935() * 64, arg3 >> 1, arg6.anInt6121, arg6.aByte89);
		@Pc(74) int local74 = Static283.anIntArray135[0] + arg2 - 18;
		@Pc(82) int local82 = local74 + arg5 / 4 * 18;
		@Pc(92) int local92 = Static283.anIntArray135[1] + arg0 - 16 - 54;
		@Pc(100) int local100 = local92 + arg5 % 4 * 18;
		local21.method5767(local82, local100);
		if (arg4 == arg6) {
			Static33.aClass49_1.method4415(18, local100 - 1, 18, local82 - 1, -256);
		}
		@Pc(122) Class8_Sub7 local122 = Static123.method2164();
		local122.anInt5820 = local82;
		local122.anInt5823 = local100 + 16;
		local122.anInt5819 = local100;
		local122.aClass3_Sub2_Sub1_1 = arg4;
		local122.anInt5821 = local82 + 16;
		Static121.aClass112_7.method2546(local122);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
	public static void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class210 local3 = new Class210();
		local3.anInt5784 = arg1 >> Static307.anInt5425;
		local3.anInt5791 = arg2 >> Static307.anInt5425;
		local3.anInt5780 = arg3 >> Static307.anInt5425;
		local3.anInt5797 = arg4 >> Static307.anInt5425;
		local3.anInt5783 = arg0;
		local3.anInt5774 = arg1;
		local3.anInt5793 = arg2;
		local3.anInt5779 = arg3;
		local3.anInt5794 = arg4;
		local3.anInt5789 = arg5;
		local3.anInt5776 = arg6;
		Static143.aClass210Array1[Static358.anInt6072++] = local3;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!em;IB)V")
	public static void method155(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2) {
		if (Static182.aClass68_7 != null || Static123.aBoolean212 || (arg1 == null || Static92.method2439(arg1) == null)) {
			return;
		}
		Static182.aClass68_7 = arg1;
		Static225.aClass68_9 = Static92.method2439(arg1);
		Static383.anInt6438 = 0;
		Static350.anInt5952 = arg0;
		Static205.aBoolean296 = false;
		Static74.anInt1617 = arg2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZB[IILclient!ef;)Lclient!tq;")
	public static Class55_Sub3_Sub1 method158(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class49_Sub2 arg3) {
		if (arg3.aBoolean132 || Static54.method895(arg0) && Static54.method895(arg2)) {
			return new Class55_Sub3_Sub1(arg3, 3553, arg0, arg2, false, arg1);
		} else if (arg3.aBoolean126) {
			return new Class55_Sub3_Sub1(arg3, 34037, arg0, arg2, false, arg1);
		} else {
			return new Class55_Sub3_Sub1(arg3, arg0, arg2, Static51.method863(arg0), Static51.method863(arg2), arg1);
		}
	}
}
