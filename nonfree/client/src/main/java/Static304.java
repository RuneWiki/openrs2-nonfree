import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!rea;")
	public static Class291 aClass291_5;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
	public static int anInt8390;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Lclient!gh;")
	public static Class3_Sub3_Sub3 aClass3_Sub3_Sub3_3;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!st;")
	public static final Class314 aClass314_124 = new Class314(10, -1);

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "D")
	public static double aDouble18 = -1.0D;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt8391 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I")
	public static int method7230(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
	public static void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static424.anInt7715 != 1) {
			return;
		}
		@Pc(15) int local15 = arg2 / Static557.anInt9256;
		@Pc(19) int local19 = arg0 / Static557.anInt9256;
		@Pc(23) int local23 = arg3 / Static126.anInt2688;
		@Pc(27) int local27 = arg1 / Static126.anInt2688;
		if (Static492.anInt8358 <= local15 || local19 < 0 || Static515.anInt8713 <= local23 || local27 < 0) {
			return;
		}
		if (Static515.anInt8713 <= local27) {
			local27 = Static515.anInt8713 - 1;
		}
		if (local23 < 0) {
			local23 = 0;
		}
		if (local15 < 0) {
			local15 = 0;
		}
		if (Static492.anInt8358 <= local19) {
			local19 = Static492.anInt8358 - 1;
		}
		for (@Pc(76) int local76 = local23; local76 <= local27; local76++) {
			@Pc(88) int local88 = Static459.method6825(Static515.anInt8713, local76 + Static229.anInt4626) * Static492.anInt8358;
			for (@Pc(90) int local90 = local15; local90 <= local19; local90++) {
				@Pc(102) int local102 = local88 + Static459.method6825(Static492.anInt8358, Static38.anInt732 + local90);
				Static241.anIntArray264[local102] = Static624.anInt9972;
			}
		}
	}
}
