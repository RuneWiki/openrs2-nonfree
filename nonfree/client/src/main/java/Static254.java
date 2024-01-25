import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!df;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "[Lclient!dh;")
	public static Class69[] aClass69Array1;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Lclient!rb;")
	public static final Class276 aClass276_1 = new Class276("RC", 1);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)I")
	public static int method4031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(CII)I")
	public static int method4032(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(21) char local21 = Character.toLowerCase(arg0);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
	public static void method4033() {
		Static550.aClient1.method1552();
		Static316.method4805();
		Static401.anInt6897 = 0;
		Static478.aClass81_193 = null;
		Static320.aClass81_135 = null;
		Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
		Static587.aClass81_229 = null;
		Static562.anInt9131 = 0;
		Static114.method1982();
		Static382.aString69 = null;
		aClass69Array1 = null;
		Static280.anInt5146 = 0;
		Static454.anInt7768 = 0;
		Static184.anInt5417 = 0;
	}
}
