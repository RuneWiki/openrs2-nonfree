import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!s", name = "D", descriptor = "I")
	public static int anInt5567 = 0;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_51 = new Class198(50);

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	public static int anInt5568 = 0;

	@OriginalMember(owner = "client!s", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString197 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!s", name = "H", descriptor = "I")
	public static int anInt5569 = 0;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public static void method4662() {
		for (@Pc(7) int local7 = 0; local7 < Static42.anInt897; local7++) {
			@Pc(13) int local13 = Static130.anIntArray180[local7];
			@Pc(17) Class5_Sub4_Sub4_Sub2 local17 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local13];
			if (local17 != null) {
				Static182.method3250(local17.aClass119_1.anInt3645, local17);
			}
		}
	}
}
