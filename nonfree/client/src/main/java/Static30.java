import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	public static int anInt535;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "[Lclient!iaa;")
	public static final Class138[] aClass138Array1 = new Class138[4];

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BII)Z")
	public static boolean method469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
	public static void method470() {
		Static113.aClass330_16.method7688();
	}
}
