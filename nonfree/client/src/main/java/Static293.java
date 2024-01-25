import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
	public static int anInt5053;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!at;")
	public static final Class17 aClass17_59 = new Class17();

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "J")
	public static long aLong166 = 0L;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "Lclient!o;")
	public static final Class169 aClass169_275 = new Class169("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public static int anInt5051 = 0;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)Z")
	public static boolean method4440() {
		@Pc(8) Class1_Sub40 local8 = (Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244;
		if (local8 == null || Static358.aClass17_66.aClass1_15 == local8) {
			return false;
		} else {
			if (local8.anInt5411 >= 2000) {
				local8.anInt5411 -= 2000;
			}
			return local8.anInt5411 == 1006;
		}
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)V")
	public static void method4442() {
		Static258.aClass227_33.method4858();
		Static374.aClass227_47.method4858();
		Static82.aClass227_13.method4858();
		Static66.aClass227_9.method4858();
		Static71.aClass227_10.method4858();
	}
}
