import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	public static int anInt2130;

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "Lclient!mv;")
	public static Class229 aClass229_26;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!oba;")
	public static final Class250 aClass250_3 = new Class250();

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
	public static int anInt2131 = 0;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "J")
	public static long aLong51 = 0L;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_34 = new Class349(30, 7);

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "[I")
	public static final int[] anIntArray179 = new int[14];

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)V")
	public static void method1764(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub18 local12 = Static508.method6607(arg0, 9);
		local12.method6229();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)Lclient!hi;")
	public static Class2_Sub20 method1765() {
		if (Static476.aClass70_47 == null || Static565.aClass314_1 == null) {
			return null;
		}
		for (@Pc(24) Class2_Sub20 local24 = (Class2_Sub20) Static565.aClass314_1.method6304(); local24 != null; local24 = (Class2_Sub20) Static565.aClass314_1.method6304()) {
			@Pc(32) Class142 local32 = Static476.aClass360_4.method7576(local24.anInt2970);
			if (local32 != null && local32.aBoolean211 && local32.method2521(Static476.anInterface23_2)) {
				return local24;
			}
		}
		return null;
	}
}
