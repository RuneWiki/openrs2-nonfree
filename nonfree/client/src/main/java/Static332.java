import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lha", name = "o", descriptor = "Lclient!hw;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!lha", name = "k", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!lha", name = "j", descriptor = "I")
	public static int anInt5594 = -2;

	@OriginalMember(owner = "client!lha", name = "p", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[2];

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "I")
	public static int anInt5596 = 0;

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)V")
	public static void method5021() {
		if (!Static448.aBoolean496) {
			Static669.aBoolean763 = true;
			Static448.aBoolean496 = true;
			Static449.aFloat140 += (24.0F - Static449.aFloat140) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIII)V")
	public static void method5022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static518.anInt8219 == arg2 && arg1 == Static110.anInt9536 && Static503.anInt9738 == arg0) {
			return;
		}
		Static518.anInt8219 = arg2;
		Static110.anInt9536 = arg1;
		Static503.anInt9738 = arg0;
		Static597.aBoolean675 = true;
		@Pc(40) double local40 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(50) double local50 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(53) double local53 = Math.cos(local50);
		@Pc(56) double local56 = Math.sin(local50);
		@Pc(59) double local59 = Math.cos(local40);
		@Pc(62) double local62 = Math.sin(local40);
		Static343.aDouble13 = local59;
		Static549.aDouble29 = -local56 * local59;
		Static554.aDouble30 = local53;
		Static633.aDouble34 = local56 * local62;
		Static367.aDouble16 = local62;
		Static475.aDouble35 = 0.0D;
		Static237.aDouble8 = local56;
		Static356.aDouble14 = local53 * local59;
		Static602.aDouble33 = -local53 * local62;
	}
}
