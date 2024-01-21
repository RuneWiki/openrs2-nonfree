import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
	public static int anInt529;

	@OriginalMember(owner = "client!c", name = "W", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_205 = Static187.method3089("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_206 = Static187.method3089("cookiehost");

	@OriginalMember(owner = "client!c", name = "db", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_207 = Static187.method3089("Examine");

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_210 = Static187.method3089("Members only world");

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_208 = aClass92_210;

	@OriginalMember(owner = "client!c", name = "ib", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_209 = Static187.method3089("K");

	@OriginalMember(owner = "client!c", name = "mb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_211 = aClass92_209;

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_212 = aClass92_207;

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "Lclient!gg;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!c", name = "tb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_213 = aClass92_209;

	@OriginalMember(owner = "client!c", name = "ub", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_214 = Static187.method3089("; Expires=");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IIJ)Lclient!vd;")
	public static Class92 method428(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(14) Class1_Sub3_Sub14 local14 = Static180.method3389(arg1[0]);
			return local14.method1634((int) arg2);
		} else if (arg0 == 1) {
			@Pc(28) Class1_Sub3_Sub22 local28 = Static102.method1549((int) arg2);
			return local28.aClass92_1846;
		} else if (arg0 == 5) {
			return Static179.method2937(arg2).method3198();
		} else if (arg0 == 6) {
			return Static180.method3389(arg1[0]).method1634((int) arg2);
		} else {
			return Static202.method3343(arg2);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	public static int method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg1) {
			return arg0;
		} else if (arg1 > arg2) {
			return arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Lclient!ka;BI)Lclient!vd;")
	public static Class92 method431(@OriginalArg(0) Class1_Sub14 arg0) {
		try {
			@Pc(7) Class92 local7 = new Class92();
			local7.anInt4244 = arg0.method3047();
			if (local7.anInt4244 > 32767) {
				local7.anInt4244 = 32767;
			}
			local7.aByteArray52 = new byte[local7.anInt4244];
			arg0.anInt4061 += Static24.aClass50_1.method1359(0, arg0.anInt4061, local7.aByteArray52, arg0.aByteArray49, local7.anInt4244);
			return local7;
		} catch (@Pc(53) Exception local53) {
			return Static9.aClass92_1503;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ge;II)V")
	public static void method433(@OriginalArg(0) Class8_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static154.method2359(arg0.anInt3606, arg1, arg0.anInt3600);
	}
}
