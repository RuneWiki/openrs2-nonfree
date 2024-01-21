import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_562 = Static41.method597("mapscene");

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!od;")
	private static Class60 aClass60_564 = Static41.method597("Loaded fonts");

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_563 = aClass60_564;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt1560 = 0;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
	public static int[] anIntArray172 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_565 = Static41.method597(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_566 = Static41.method597("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_567 = Static41.method597("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
	public static int[] anIntArray173 = new int[32768];

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_568 = Static41.method597("sl_button");

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
	public static int anInt1563 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
	public static int method973(@OriginalArg(1) int arg0) {
		@Pc(3) Class4_Sub3_Sub17 local3 = Static12.method1771(arg0);
		@Pc(14) int local14 = local3.anInt2973;
		@Pc(17) int local17 = local3.anInt2974;
		@Pc(20) int local20 = local3.anInt2970;
		@Pc(27) int local27 = Class49.anIntArray190[local17 - local20];
		return local27 & Static53.anIntArray141[local14] >> local20;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method974() {
		Static128.aClass12_28.method284();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method975() {
		anIntArray173 = null;
		aClass60_563 = null;
		anIntArray172 = null;
		aClass60_565 = null;
		aClass60_568 = null;
		aClass60_567 = null;
		aClass60_562 = null;
		aClass60_564 = null;
		aClass60_566 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}
}
