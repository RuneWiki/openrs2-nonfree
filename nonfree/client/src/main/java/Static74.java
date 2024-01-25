import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "Lclient!uj;")
	public static final Class244 aClass244_2 = new Class244();

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "Lclient!mq;")
	public static Class156 aClass156_2 = null;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_30 = new Class119(67, 12);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V")
	public static void method1473(@OriginalArg(0) int arg0) {
		Static128.anInt2675 = arg0;
		Static233.anInt4469 = -1;
		Static238.anInt4569 = 100;
		Static374.anInt6289 = 3;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Z")
	public static boolean method1474() {
		try {
			return Static184.method2934();
		} catch (@Pc(15) IOException local15) {
			Static92.method1686();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(79) String local79 = "T2 - " + (Static277.aClass119_110 == null ? -1 : Static277.aClass119_110.method2890()) + "," + (Static76.aClass119_31 == null ? -1 : Static76.aClass119_31.method2890()) + "," + (Static354.aClass119_128 == null ? -1 : Static354.aClass119_128.method2890()) + " - " + Static139.anInt7585 + "," + (Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0] + Static223.anInt7618) + "," + (Static57.anInt5085 + Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0]) + " - ";
			for (@Pc(81) int local81 = 0; local81 < Static139.anInt7585 && local81 < 50; local81++) {
				local79 = local79 + Static237.aClass3_Sub7_Sub1_1.aByteArray46[local81] + ",";
			}
			Static324.method5974(local20, local79);
			Static24.method583();
			return true;
		}
	}
}
