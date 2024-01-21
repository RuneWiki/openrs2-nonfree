import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
	public static int anInt2959;

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_21;

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1417 = Static187.method3089("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1418 = Static187.method3089("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1419 = Static187.method3089("::tele 0)1");

	@OriginalMember(owner = "client!pc", name = "eb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1420 = Static187.method3089("Ausw-=hlen");

	@OriginalMember(owner = "client!pc", name = "lb", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray33 = new byte[4][104][104];

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1421 = aClass92_1417;

	@OriginalMember(owner = "client!pc", name = "nb", descriptor = "J")
	public static long aLong159 = 0L;

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1422 = aClass92_1418;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)I")
	public static int method2173(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
	public static void method2174(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static103.anInt2229; local19++) {
			if (arg0 == Static57.aLongArray3[local19]) {
				Static103.anInt2229--;
				for (@Pc(41) int local41 = local19; local41 < Static103.anInt2229; local41++) {
					Static57.aLongArray3[local41] = Static57.aLongArray3[local41 + 1];
					Static75.aClass92Array13[local41] = Static75.aClass92Array13[local41 + 1];
				}
				Static61.anInt1468 = Static25.anInt588;
				Static38.aClass1_Sub14_Sub1_3.method3067(194);
				Static38.aClass1_Sub14_Sub1_3.method3016(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI)V")
	public static void method2178(@OriginalArg(0) byte[] arg0) {
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(arg0);
		@Pc(19) int local19 = local11.method3023();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) Class1_Sub7 local27 = new Class1_Sub7();
			@Pc(31) Class92 local31 = local11.method3022();
			local27.anInt1032 = local11.method3023();
			local27.anInt1033 = local11.method3023();
			local27.anInt1030 = local11.method3010();
			local27.aClass92_400 = local31.method3218();
			local27.aClass92Array10 = local31.method3229(47);
			Static117.aClass20_14.method466(local27);
		}
	}
}
