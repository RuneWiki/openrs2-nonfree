import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "Lclient!uw;")
	public static Class342 aClass342_1;

	@OriginalMember(owner = "client!baa", name = "r", descriptor = "Lclient!sba;")
	public static Class300 aClass300_1;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_1 = new Class210(7, 0, 1, 1);

	@OriginalMember(owner = "client!baa", name = "o", descriptor = "Lclient!db;")
	public static final Class64 aClass64_30 = new Class64(87, 16);

	@OriginalMember(owner = "client!baa", name = "p", descriptor = "Lclient!pca;")
	public static final Class263 aClass263_1 = new Class263("stellardawn", 1);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IC)Z")
	public static boolean method494(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static88.method2052(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static38.aCharArray3;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static547.aCharArray7;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(62) char local62 = local46[local48];
				if (arg0 == local62) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)V")
	public static void method497() {
		Static564.method7257();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static15.aClass84Array1[local13].method2344();
		}
		Static180.method3365();
		Static409.method7475();
		System.gc();
	}
}
