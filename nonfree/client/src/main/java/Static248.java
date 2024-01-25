import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!je;")
	public static final Class156 aClass156_1 = new Class156(0, 3, Static331.aClass204_17);

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!je;")
	public static final Class156 aClass156_2 = new Class156(1, 3, Static331.aClass204_17);

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!je;")
	public static final Class156 aClass156_3 = new Class156(2, 4, Static331.aClass204_13);

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!je;")
	public static final Class156 aClass156_4 = new Class156(3, 1, Static331.aClass204_17);

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!je;")
	public static final Class156 aClass156_5 = new Class156(4, 2, Static331.aClass204_17);

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!je;")
	public static final Class156 aClass156_6 = new Class156(5, 3, Static331.aClass204_17);

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!je;")
	public static final Class156 aClass156_7 = new Class156(6, 4, Static331.aClass204_17);

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public static final int anInt4911 = Static402.method5690(16);

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!jo;")
	public static final Class161 aClass161_4 = new Class161("", 14);

	@OriginalMember(owner = "client!je", name = "q", descriptor = "I")
	public static int anInt4912 = 1;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_79 = new Class287(17, 1);

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_162 = new Class123(108, -2);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lclient!je;")
	public static Class156 method3936(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass156_1;
		} else if (arg0 == 1) {
			return aClass156_2;
		} else if (arg0 == 2) {
			return aClass156_3;
		} else if (arg0 == 3) {
			return aClass156_4;
		} else if (arg0 == 4) {
			return aClass156_5;
		} else if (arg0 == 5) {
			return aClass156_6;
		} else if (arg0 == 6) {
			return aClass156_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(BI)I")
	public static int method3937(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
