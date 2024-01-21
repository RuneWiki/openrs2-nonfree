import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
	public static int anInt1291;

	@OriginalMember(owner = "client!fg", name = "eb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_405 = Static170.method3101("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_403 = aClass28_405;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_404 = Static170.method3101(": ");

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_6 = new Class63(50);

	@OriginalMember(owner = "client!fg", name = "kb", descriptor = "[I")
	public static int[] anIntArray238 = new int[500];

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)Z")
	public static boolean method1098() {
		@Pc(10) Class16 local10 = Static127.aClass16_1;
		synchronized (Static127.aClass16_1) {
			if (Static133.anInt3377 == Static48.anInt1377) {
				return false;
			} else {
				Static11.anInt409 = Static157.anIntArray652[Static133.anInt3377];
				Static169.anInt674 = Static98.anIntArray595[Static133.anInt3377];
				Static133.anInt3377 = Static133.anInt3377 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
	public static void method1099() {
		aClass28_404 = null;
		aClass63_6 = null;
		aClass28_405 = null;
		aClass28_403 = null;
		anIntArray238 = null;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)I")
	public static int method1100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
