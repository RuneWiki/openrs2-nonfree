import java.awt.event.KeyEvent;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1348 = Static177.method3050("Click to switch");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt3646 = 0;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1349 = aClass46_1348;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!bg;")
	public static final Class11 aClass11_15 = new Class11();

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1350 = Static177.method3050("Schlie-8en");

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1353 = Static177.method3050("Please use a different world)3");

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1351 = aClass46_1353;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1355 = Static177.method3050("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1352 = aClass46_1355;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1354 = aClass46_1353;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array24 = new Class46[500];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method2755(@OriginalArg(1) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Lclient!eg;")
	public static Class24 method2757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass24_1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!nh;B)V")
	public static void method2758(@OriginalArg(0) Class62 arg0) {
		Static40.aClass62_12 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Lclient!jd;")
	public static Class46 method2759(@OriginalArg(0) long arg0) {
		Static141.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static141.aCalendar2.get(7);
		@Pc(17) int local17 = Static141.aCalendar2.get(5);
		@Pc(26) int local26 = Static141.aCalendar2.get(2);
		@Pc(30) int local30 = Static141.aCalendar2.get(1);
		@Pc(34) int local34 = Static141.aCalendar2.get(11);
		@Pc(38) int local38 = Static141.aCalendar2.get(12);
		@Pc(42) int local42 = Static141.aCalendar2.get(13);
		return Static69.method1482(new Class46[] { Static27.aClass46Array5[local13 - 1], Static38.aClass46_349, Static127.method2240(local17 / 10), Static127.method2240(local17 % 10), Static118.aClass46_1061, Static79.aClass46Array13[local26], Static118.aClass46_1061, Static127.method2240(local30), Static54.aClass46_525, Static127.method2240(local34 / 10), Static127.method2240(local34 % 10), Static33.aClass46_287, Static127.method2240(local38 / 10), Static127.method2240(local38 % 10), Static33.aClass46_287, Static127.method2240(local42 / 10), Static127.method2240(local42 % 10), Static184.aClass46_1520 });
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class46 method2761(@OriginalArg(0) int arg0) {
		@Pc(7) Class46 local7 = new Class46();
		local7.aByteArray20 = new byte[arg0];
		local7.anInt2141 = 0;
		return local7;
	}
}
