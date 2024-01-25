import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
	public static int anInt3897;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
	public static int anInt3894 = 0;

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
	public static int anInt3895 = -1;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "F")
	public static float aFloat26 = 0.0F;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!gca;)V")
	public static void method3313(@OriginalArg(0) Class115 arg0) {
		Static663.aClass115_12 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)V")
	public static void method3314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502() * arg0 >> 8;
		if (local12 == 0 || arg1 == -1) {
			return;
		}
		if (!Static416.aBoolean483 && Static278.anInt9800 != -1 && Static551.method7234() && !Static534.method7414()) {
			Static262.aClass6_Sub8_Sub4_8 = Static357.method5170();
			@Pc(40) Class6_Sub8_Sub4 local40 = Static633.method8702(Static262.aClass6_Sub8_Sub4_8);
			Static92.method1535(local40);
		}
		Static276.method4067(local12, arg1, Static365.aClass8_99);
		Static284.method4121(-1, 255);
		Static416.aBoolean483 = true;
	}
}
