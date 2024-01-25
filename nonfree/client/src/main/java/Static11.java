import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "[Lclient!s;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_2 = new Class46(70, -1);

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)Lclient!naa;")
	public static Class240 method209() {
		return method216();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	public static void method212(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(19) int local19 = arg0 << 3;
		Static552.aFloat176 = local3;
		if (Static254.anInt4612 == 2) {
			Static491.anInt8292 = local19;
			Static210.anInt4029 = local3;
			Static290.anInt5062 = 0;
		}
		Static311.aFloat95 = local19;
		Static485.method7194();
		Static187.aBoolean232 = true;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Lclient!naa;")
	private static Class240 method216() {
		return new Class240(1, false);
	}
}
