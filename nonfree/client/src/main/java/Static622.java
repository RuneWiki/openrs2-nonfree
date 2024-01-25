import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static622 {

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Lclient!fq;")
	public static Class2_Sub11_Sub2 aClass2_Sub11_Sub2_2;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
	public static int anInt10160;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "[I")
	public static int[] anIntArray715;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!vt;")
	public static final Class371 aClass371_1 = new Class371(0, 3, Static638.aClass381_19);

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!vt;")
	public static final Class371 aClass371_2 = new Class371(1, 3, Static638.aClass381_19);

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Lclient!vt;")
	public static final Class371 aClass371_3 = new Class371(2, 4, Static638.aClass381_15);

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!vt;")
	public static final Class371 aClass371_4 = new Class371(3, 1, Static638.aClass381_19);

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!vt;")
	public static final Class371 aClass371_5 = new Class371(4, 2, Static638.aClass381_19);

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Lclient!vt;")
	public static final Class371 aClass371_6 = new Class371(5, 3, Static638.aClass381_19);

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "Lclient!vt;")
	public static final Class371 aClass371_7 = new Class371(6, 4, Static638.aClass381_19);

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
	public static final int anInt10159 = Static138.method2523(16);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lclient!vt;")
	public static Class371 method8630(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass371_1;
		} else if (arg0 == 1) {
			return aClass371_2;
		} else if (arg0 == 2) {
			return aClass371_3;
		} else if (arg0 == 3) {
			return aClass371_4;
		} else if (arg0 == 4) {
			return aClass371_5;
		} else if (arg0 == 5) {
			return aClass371_6;
		} else if (arg0 == 6) {
			return aClass371_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Z")
	public static boolean method8631() {
		if (Static284.aClass2_Sub7_Sub21_3 == null) {
			return false;
		} else {
			if (Static284.aClass2_Sub7_Sub21_3.anInt10014 >= 2000) {
				Static284.aClass2_Sub7_Sub21_3.anInt10014 -= 2000;
			}
			return Static284.aClass2_Sub7_Sub21_3.anInt10014 == 1007;
		}
	}
}
