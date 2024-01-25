import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "[Lclient!nk;")
	public static Class9_Sub8_Sub2_Sub1[] aClass9_Sub8_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!wa;")
	public static final Class356 aClass356_2 = new Class356();

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!wa;")
	public static final Class356 aClass356_5 = new Class356();

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!wa;")
	public static final Class356 aClass356_3 = new Class356();

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!wa;")
	public static final Class356 aClass356_4 = new Class356();

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "[I")
	public static final int[] anIntArray678 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	public static int anInt9173 = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qh;I)Lclient!fga;")
	public static Class94 method7617(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(15) Class300 local15 = Static175.method3039()[arg0.method3118()];
		@Pc(22) Class140 local22 = Static53.method999()[arg0.method3118()];
		@Pc(26) int local26 = arg0.method3107();
		@Pc(30) int local30 = arg0.method3107();
		@Pc(34) int local34 = arg0.method3109();
		@Pc(38) int local38 = arg0.method3109();
		@Pc(42) int local42 = arg0.method3107();
		@Pc(46) int local46 = arg0.method3116();
		@Pc(50) int local50 = arg0.method3116();
		return new Class94(local15, local22, local26, local30, local34, local38, local42, local46, local50);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILclient!qu;I)J")
	public static long method7619(@OriginalArg(1) int arg0, @OriginalArg(2) Interface22 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class23 local14 = Static476.aClass69_5.method2181(arg1.method7088());
		@Pc(40) long local40 = (long) ((arg1.method7091() | 0x10000) << 14 | arg0 << 7 | arg2 | arg1.method7093() << 20);
		if (local14.anInt772 == 0) {
			local40 |= local7;
		}
		if (local14.anInt756 == 1) {
			local40 |= local5;
		}
		return local40 | (long) arg1.method7088() << 32;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B)I")
	public static int method7620(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static578.method7668(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
	public static void method7621(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class177 local9 = Static252.aClass177Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static252.aClass177Array1[local11] = Static252.aClass177Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class177(arg6, arg4, arg2, arg0, arg3, arg7, arg1, arg5);
		} else {
			local9.method4351(arg2, arg7, arg5, arg0, arg1, arg3, arg4, arg6);
		}
		Static252.aClass177Array1[0] = local9;
		Static427.anInt7126 = Static251.anInt4580;
		Static596.anInt9430++;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIII)V")
	public static void method7622(@OriginalArg(0) boolean arg0) {
		Static124.anInt3635 = 22050;
		Static134.aBoolean244 = arg0;
		Static286.anInt6174 = 2;
	}
}
