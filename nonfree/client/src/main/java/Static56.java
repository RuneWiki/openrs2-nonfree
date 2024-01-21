import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!je", name = "Hb", descriptor = "I")
	public static int anInt1700;

	@OriginalMember(owner = "client!je", name = "Kb", descriptor = "Lclient!ma;")
	public static Class3_Sub1_Sub11 aClass3_Sub1_Sub11_1;

	@OriginalMember(owner = "client!je", name = "db", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array13 = new Class26[500];

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "Lclient!he;")
	private static Class26 aClass26_852 = Static6.method100("Loading sprites )2 ");

	@OriginalMember(owner = "client!je", name = "jc", descriptor = "Lclient!he;")
	private static Class26 aClass26_861 = Static6.method100("Continue");

	@OriginalMember(owner = "client!je", name = "nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_853 = aClass26_861;

	@OriginalMember(owner = "client!je", name = "tb", descriptor = "Lclient!he;")
	public static Class26 aClass26_854 = aClass26_852;

	@OriginalMember(owner = "client!je", name = "Ab", descriptor = "I")
	public static int anInt1695 = 0;

	@OriginalMember(owner = "client!je", name = "Bb", descriptor = "Lclient!he;")
	private static Class26 aClass26_855 = Static6.method100("Please try again)3");

	@OriginalMember(owner = "client!je", name = "Sb", descriptor = "Lclient!he;")
	private static Class26 aClass26_859 = Static6.method100("Loading wordpack )2 ");

	@OriginalMember(owner = "client!je", name = "Cb", descriptor = "Lclient!he;")
	public static Class26 aClass26_856 = aClass26_859;

	@OriginalMember(owner = "client!je", name = "Qb", descriptor = "Lclient!he;")
	public static Class26 aClass26_858 = aClass26_855;

	@OriginalMember(owner = "client!je", name = "hc", descriptor = "Lclient!he;")
	public static Class26 aClass26_860 = Static6.method100("cross");

	@OriginalMember(owner = "client!je", name = "ic", descriptor = "Lclient!sf;")
	public static Class66 aClass66_16 = new Class66(64);

	@OriginalMember(owner = "client!je", name = "oc", descriptor = "Lclient!vd;")
	public static Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!je", name = "pc", descriptor = "I")
	public static int anInt1720 = 255;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public static void method1126() {
		aClass26_855 = null;
		aClass66_16 = null;
		aClass26_859 = null;
		aClass26_854 = null;
		aClass26_856 = null;
		aClass26_852 = null;
		aClass26_858 = null;
		aClass26_860 = null;
		aClass3_Sub1_Sub11_1 = null;
		aClass26_861 = null;
		aClass77_1 = null;
		aClass26Array13 = null;
		aClass26_853 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1128(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static123.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static86.aClass19_1);
		arg0.addFocusListener(Static86.aClass19_1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method1131(@OriginalArg(0) Class16 arg0) {
		Static80.aClass16_94 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!ef;Lclient!ef;)V")
	public static void method1134(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1) {
		Static28.aClass16_40 = arg1;
		Static48.aClass16_69 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BBLclient!td;[Lclient!ac;II)V")
	public static void method1135(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) Class4[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class3_Sub11 local12 = new Class3_Sub11(arg0);
		while (true) {
			@Pc(20) int local20 = local12.method979();
			if (local20 == 0) {
				return;
			}
			local7 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local12.method979();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(46) int local46 = local28 >> 6 & 0x3F;
				@Pc(50) int local50 = local28 >> 12;
				@Pc(54) int local54 = local12.method981();
				@Pc(58) int local58 = local28 & 0x3F;
				@Pc(62) int local62 = local54 >> 2;
				@Pc(66) int local66 = local54 & 0x3;
				@Pc(70) int local70 = arg3 + local58;
				@Pc(75) int local75 = local46 + arg4;
				if (local75 > 0 && local70 > 0 && local75 < 103 && local70 < 103) {
					@Pc(92) int local92 = local50;
					@Pc(94) Class4 local94 = null;
					if ((Static74.aByteArrayArrayArray5[1][local75][local70] & 0x2) == 2) {
						local92 = local50 - 1;
					}
					if (local92 >= 0) {
						local94 = arg2[local92];
					}
					Static66.method1637(local66, local50, local75, local7, local70, local62, local94, arg1);
				}
			}
		}
	}
}
