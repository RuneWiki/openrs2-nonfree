import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static247 {

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_59 = new Class306("Profiling", "Profiling", "Profilage", "Profiling");

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "Z")
	public static boolean aBoolean344 = true;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Lclient!bda;")
	public static final Class21 aClass21_5 = new Class21("LOCAL", 4);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method4219(@OriginalArg(1) Class122 arg0) {
		if (Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != Static474.anInt7955 && (Static242.aClass255ArrayArrayArray2 != null && Static45.method920(arg0, Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98))) {
			Static474.anInt7955 = Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)Z")
	public static boolean method4220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
