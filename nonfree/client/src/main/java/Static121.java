import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!vh;")
	public static final Class95 aClass95_106 = new Class95();

	@OriginalMember(owner = "client!md", name = "b", descriptor = "J")
	public static long aLong250 = 0L;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2059 = Static187.method3089("null");

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_2062 = Static187.method3089("Location");

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!vd;")
	public static Class92 aClass92_2060 = aClass92_2062;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_2061 = Static187.method3089("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2063 = Static187.method3089("auf der Hautpseite)3");

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Lclient!vd;")
	public static Class92 aClass92_2064 = aClass92_2061;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public static int anInt4508 = 0;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2065 = Static187.method3089("Fertigkeit)2");

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	public static void method3412() {
		for (@Pc(15) Class1_Sub3_Sub6 local15 = (Class1_Sub3_Sub6) Static89.aClass20_9.method467(); local15 != null; local15 = (Class1_Sub3_Sub6) Static89.aClass20_9.method468()) {
			@Pc(20) Class8_Sub1 local20 = local15.aClass8_Sub1_1;
			if (Static192.anInt4180 != local20.anInt190 || local20.aBoolean14) {
				local15.method3414();
			} else if (local20.anInt187 <= Static155.anInt2981) {
				local20.method157(Static110.anInt2383);
				if (local20.aBoolean14) {
					local15.method3414();
				} else {
					Static5.method99(local20.anInt190, local20.anInt191, local20.anInt182, local20.anInt180, 60, local20, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method3413() {
		Static71.aClass97_7 = new Class97(32);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!ve;I)V")
	public static void method3415(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1 arg1) {
		if (Static51.aClass1_Sub14_2 == null) {
			Static25.method476(255, 255, true, 0, (byte) 0, null);
			Static110.aClass3_Sub1Array1[arg0] = arg1;
		} else {
			Static51.aClass1_Sub14_2.anInt4061 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static51.aClass1_Sub14_2.method3058();
			@Pc(20) int local20 = Static51.aClass1_Sub14_2.method3058();
			arg1.method3284(local16, local20);
		}
	}
}
