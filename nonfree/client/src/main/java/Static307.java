import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static307 {

	@OriginalMember(owner = "client!lw", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!lw", name = "L", descriptor = "Lclient!maa;")
	public static final Class195 aClass195_10 = new Class195("", 16);

	@OriginalMember(owner = "client!lw", name = "Q", descriptor = "Z")
	public static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!lw", name = "R", descriptor = "Lclient!of;")
	public static final Class230 aClass230_34 = new Class230(5, -1);

	@OriginalMember(owner = "client!lw", name = "T", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!lw", name = "V", descriptor = "Z")
	public static final boolean aBoolean407 = false;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4615(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
	public static void method4616() {
		if (Static154.aBoolean217) {
			return;
		}
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean598) {
			Static532.aFloat185 = (int) Static532.aFloat185 + 47 & 0xFFFFFFF0;
		} else {
			Static256.aFloat120 += (12.0F - Static256.aFloat120) / 2.0F;
		}
		Static154.aBoolean217 = true;
		Static380.aBoolean478 = true;
	}
}
