import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "Lclient!vd;")
	public static Class353 aClass353_74;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_10 = new Class242(1);

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_11 = new Class242(2);

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_12 = new Class242(4);

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_13 = new Class242(1);

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_14 = new Class242(2);

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_15 = new Class242(4);

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_16 = new Class242(2);

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Lclient!ok;")
	public static final Class242 aClass242_17 = new Class242(4);

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_38 = new Class166(8);

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILclient!ha;IIIB)V")
	public static void method6501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(5) int arg4) {
		arg3.method8815(arg0, -10660793, arg1, arg2, arg4);
		arg3.method8815(arg0 + 1, -16777216, -2 + arg1, arg2 + 1, 16);
		arg3.method8814(-16777216, arg0 + 1, arg2 + 18, arg1 - 2, arg4 + -19);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIII)V")
	public static void method6503(@OriginalArg(0) boolean arg0) {
		Static339.aBoolean677 = arg0;
		Static360.anInt6666 = 2;
		Static78.anInt1661 = 22050;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!sca;IZ)V")
	public static void method6504(@OriginalArg(0) Class302 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13 = arg0.anInt8812 == 0 ? arg0.anInt8801 : arg0.anInt8812;
		@Pc(25) int local25 = arg0.anInt8813 == 0 ? arg0.anInt8814 : arg0.anInt8813;
		Static106.method1753(local13, local25, arg1, arg0.anInt8838, Static605.aClass302ArrayArray4[arg0.anInt8838 >> 16]);
		if (arg0.aClass302Array2 != null) {
			Static106.method1753(local13, local25, arg1, arg0.anInt8838, arg0.aClass302Array2);
		}
		@Pc(58) Class6_Sub29 local58 = (Class6_Sub29) Static507.aClass128_42.method3560((long) arg0.anInt8838);
		if (local58 != null) {
			Static232.method4003(local58.anInt6361, arg1, local13, local25);
		}
	}
}
