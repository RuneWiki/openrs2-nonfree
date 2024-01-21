import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_460 = Static187.method3089("hint_mapmarkers");

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_461 = Static187.method3089("event_opbase");

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
	public static int anInt1136 = 0;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_462 = Static187.method3089("");

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_464 = Static187.method3089("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Lclient!vd;")
	public static Class92 aClass92_463 = aClass92_464;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	public static int anInt1138 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method789() {
		try {
			if (Static52.anInt1299 == 1) {
				@Pc(14) int local14 = Static16.aClass1_Sub12_Sub3_2.method2251();
				if (local14 > 0 && Static16.aClass1_Sub12_Sub3_2.method2237()) {
					local14 -= Static41.anInt1087;
					if (local14 < 0) {
						local14 = 0;
					}
					Static16.aClass1_Sub12_Sub3_2.method2253(local14);
				} else {
					Static16.aClass1_Sub12_Sub3_2.method2231();
					Static16.aClass1_Sub12_Sub3_2.method2250();
					Static9.aClass1_Sub21_2 = null;
					Static123.aClass79_1 = null;
					if (Static37.aClass3_5 == null) {
						Static52.anInt1299 = 0;
					} else {
						Static52.anInt1299 = 2;
					}
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static16.aClass1_Sub12_Sub3_2.method2231();
			Static37.aClass3_5 = null;
			Static9.aClass1_Sub21_2 = null;
			Static52.anInt1299 = 0;
			Static123.aClass79_1 = null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
	public static int method790(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
