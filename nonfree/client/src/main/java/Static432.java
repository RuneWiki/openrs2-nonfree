import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
	public static int anInt7994;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "Lclient!h;")
	public static final Class125 aClass125_59 = new Class125(50);

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
	public static int anInt7990 = 0;

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
	public static int anInt7992 = 500;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
	public static void method6608(@OriginalArg(1) int arg0) {
		Static164.anInt3824 = arg0;
		aClass125_59.method3440();
	}
}
