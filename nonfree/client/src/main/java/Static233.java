import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static233 {

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public static int anInt4507;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_69 = new Class322(69, -1);

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	public static int anInt4508 = 0;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	public static void method4123() {
		if (!Static587.aBoolean697) {
			Static587.aBoolean697 = true;
			Static145.aFloat52 += (-12.0F - Static145.aFloat52) / 2.0F;
			Static114.aBoolean195 = true;
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(II)Z")
	public static boolean method4127(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
