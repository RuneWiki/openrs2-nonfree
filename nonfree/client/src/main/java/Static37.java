import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
	public static int anInt680;

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
	public static int anInt689;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString30 = "Please wait...";

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
	public static int anInt686 = 0;

	@OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
	public static int anInt687 = 0;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
	public static void method639() {
		for (@Pc(7) int local7 = -1; local7 < Static275.anInt5043; local7++) {
			@Pc(26) int local26;
			if (local7 == -1) {
				local26 = 2047;
			} else {
				local26 = Static135.anIntArray210[local7];
			}
			@Pc(36) Class11_Sub4_Sub1 local36 = Static14.aClass11_Sub4_Sub1Array1[local26];
			if (local36 != null) {
				Static17.method275(local36.method3347(), local36);
			}
		}
	}
}
