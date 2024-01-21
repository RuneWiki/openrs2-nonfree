import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "Lclient!he;")
	public static Class39 aClass39_5;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
	public static int anInt3997 = 0;

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1501 = Static161.method2452("Could not complete login)3");

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1500 = aClass20_1501;

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
	public static int anInt4032 = 0;

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1502 = Static161.method2452(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)V")
	public static void method3045() {
		Static43.aClass5_Sub6_Sub1_2.method3087(95);
		for (@Pc(24) Class5_Sub25 local24 = (Class5_Sub25) Static75.aClass75_7.method2067(); local24 != null; local24 = (Class5_Sub25) Static75.aClass75_7.method2066()) {
			if (local24.anInt3530 == 0) {
				Static114.method500(true, local24);
			}
		}
		if (Static133.aClass69_12 != null) {
			Static184.method2779(Static133.aClass69_12);
			Static133.aClass69_12 = null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!ce;)V")
	public static void method3071(@OriginalArg(1) Class5_Sub6 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static43.aClass34_4 != null) {
			@Pc(20) int local20;
			try {
				Static43.aClass34_4.method1010(0L);
				Static43.aClass34_4.method1012(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(40) Exception local40) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method3039(local8, 24);
	}
}
