import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "Lclient!wu;")
	public static Class380 aClass380_74;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "Lclient!lba;")
	public static final Class202 aClass202_1 = new Class202(0, 3, Static290.aClass189_15);

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "Lclient!lba;")
	public static final Class202 aClass202_2 = new Class202(1, 3, Static290.aClass189_15);

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "Lclient!lba;")
	public static final Class202 aClass202_3 = new Class202(2, 4, Static290.aClass189_11);

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Lclient!lba;")
	public static final Class202 aClass202_4 = new Class202(3, 1, Static290.aClass189_15);

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "Lclient!lba;")
	public static final Class202 aClass202_5 = new Class202(4, 2, Static290.aClass189_15);

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "Lclient!lba;")
	public static final Class202 aClass202_6 = new Class202(5, 3, Static290.aClass189_15);

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "Lclient!lba;")
	public static final Class202 aClass202_7 = new Class202(6, 4, Static290.aClass189_15);

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
	public static final int anInt5014 = Static418.method5598(16);

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_8 = new Class168(12, 5);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Lclient!lba;")
	public static Class202 method4224(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass202_1;
		} else if (arg0 == 1) {
			return aClass202_2;
		} else if (arg0 == 2) {
			return aClass202_3;
		} else if (arg0 == 3) {
			return aClass202_4;
		} else if (arg0 == 4) {
			return aClass202_5;
		} else if (arg0 == 5) {
			return aClass202_6;
		} else if (arg0 == 6) {
			return aClass202_7;
		} else {
			return null;
		}
	}
}
