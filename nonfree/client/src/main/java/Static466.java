import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!ro", name = "G", descriptor = "Lclient!qa;")
	public static Class276 aClass276_1;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
	public static int anInt7862;

	@OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
	public static int anInt7863;

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!ro", name = "V", descriptor = "I")
	public static int anInt7871;

	@OriginalMember(owner = "client!ro", name = "W", descriptor = "I")
	public static int anInt7872 = 0;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(IIII)V")
	public static void method6512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg0 * Static189.aClass4_Sub2_Sub1_1.anInt9295 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static565.method7768(arg2, local6, Static159.aClass31_36);
			Static327.aBoolean615 = true;
		}
	}
}
