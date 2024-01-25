import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
	public static int anInt7604;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "Lclient!us;")
	public static final Class344 aClass344_87 = new Class344(5, 4);

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_9 = null;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
	public static void method6355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static134.anInt3477 == arg2 && Static556.anInt9465 == arg1 && Static5.anInt62 == arg0) {
			return;
		}
		Static134.anInt3477 = arg2;
		Static556.anInt9465 = arg1;
		Static160.aBoolean330 = true;
		Static5.anInt62 = arg0;
		@Pc(39) double local39 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static434.aDouble48 = 0.0D;
		Static594.aDouble62 = local58;
		Static248.aDouble33 = local52 * local58;
		Static363.aDouble40 = -local55 * local58;
		Static201.aDouble29 = local52;
		Static489.aDouble55 = -local52 * local61;
		Static585.aDouble64 = local55;
		Static482.aDouble54 = local61;
		Static92.aDouble9 = local55 * local61;
	}
}
