import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static652 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
	public static int anInt10893;

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_186 = new Class44(28, 2);

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
	public static int anInt10896 = -1;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BII)V")
	public static void method9071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static14.method139()) {
			return;
		}
		anInt10896 = arg0;
		if (arg1 != Static242.anInt4374) {
			Static521.aString85 = "";
		}
		Static242.anInt4374 = arg1;
		Static67.method1345(6);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIB)Z")
	public static boolean method9072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
