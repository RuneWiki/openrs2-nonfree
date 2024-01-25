import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static577 {

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
	public static int anInt7611;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "Lclient!o;")
	public static final Class240 aClass240_29 = new Class240(14, 0);

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Lclient!o;")
	public static final Class240 aClass240_30 = new Class240(15, 4);

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "Lclient!o;")
	public static final Class240 aClass240_31 = new Class240(16, -2);

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Lclient!o;")
	public static final Class240 aClass240_32 = new Class240(17, 0);

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!o;")
	public static final Class240 aClass240_33 = new Class240(18, -2);

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "Lclient!o;")
	public static final Class240 aClass240_34 = new Class240(19, -2);

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "Lclient!o;")
	public static final Class240 aClass240_35 = new Class240(20, 6);

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "Lclient!o;")
	public static final Class240 aClass240_36 = new Class240(21, 9);

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Lclient!o;")
	public static final Class240 aClass240_37 = new Class240(22, -2);

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "Lclient!o;")
	public static final Class240 aClass240_38 = new Class240(23, 4);

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "Lclient!o;")
	public static final Class240 aClass240_39 = new Class240(24, -1);

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "Lclient!o;")
	public static final Class240 aClass240_40 = new Class240(26, 0);

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "Lclient!o;")
	public static final Class240 aClass240_41 = new Class240(27, 0);

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Lclient!o;")
	public static final Class240 aClass240_42 = new Class240(28, -2);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZZ)V")
	public static void method6361(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static206.anInt6644--;
			if (Static206.anInt6644 == 0) {
				Static120.anIntArray152 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static569.anInt9670--;
		if (Static569.anInt9670 == 0) {
			Static474.anIntArray530 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public static void method6364() {
		if (Static431.aClass33_15 != null) {
			Static431.aClass33_15.method6151();
			Static584.aClass25_11 = null;
			Static431.aClass33_15 = null;
		}
	}
}
