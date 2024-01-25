import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public static int anInt7458 = 1;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_383 = new Class123(10, 12);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZB)V")
	public static void method6116(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class6_Sub37 local10 = Static375.method5604(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray408.length; local15++) {
				local10.anIntArray408[local15] = -1;
				local10.anIntArray409[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Z")
	public static boolean method6120() {
		try {
			return Static124.method2124();
		} catch (@Pc(16) IOException local16) {
			Static406.method6008();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(79) String local79 = "T2 - " + (Static73.aClass123_88 == null ? -1 : Static73.aClass123_88.method2952()) + "," + (Static210.aClass123_197 == null ? -1 : Static210.aClass123_197.method2952()) + "," + (Static25.aClass123_44 == null ? -1 : Static25.aClass123_44.method2952()) + " - " + Static334.anInt5833 + "," + (Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray458[0] + Static2.anInt6396) + "," + (Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray459[0] + Static348.anInt6273) + " - ";
			for (@Pc(81) int local81 = 0; Static334.anInt5833 > local81 && local81 < 50; local81++) {
				local79 = local79 + Static232.aClass6_Sub1_Sub1_4.aByteArray96[local81] + ",";
			}
			Static390.method5741(local21, local79);
			Static63.method1342();
			return true;
		}
	}
}
