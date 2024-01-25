import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "Lclient!o;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
	public static int anInt546 = 0;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "F")
	public static float aFloat5 = 0.0F;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLclient!za;Lclient!tf;)I")
	public static int method439(@OriginalArg(1) Class163 arg0, @OriginalArg(2) Class233 arg1) {
		if (arg1.anInt6330 != -1) {
			return arg1.anInt6330;
		}
		if (arg1.anInt6328 != -1) {
			@Pc(35) Class158 local35 = arg0.anInterface9_12.method1769(arg0.method5538() ? arg1.anInt6328 : arg1.anInt6337);
			if (!local35.aBoolean284) {
				return local35.aShort37;
			}
		}
		return arg1.anInt6331;
	}
}
