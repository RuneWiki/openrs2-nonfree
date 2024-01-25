import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_62 = new Class10(64);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)[Lclient!pr;")
	public static Class265[] method7035() {
		return new Class265[] { Static102.aClass265_3, Static73.aClass265_4, Static28.aClass265_1 };
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIII)Z")
	public static boolean method7036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static32.aBoolean54) {
			return false;
		} else if (Static151.anInt3128 < 100) {
			return false;
		} else if (Static477.method6554(arg1, arg2, arg3)) {
			@Pc(24) int local24 = arg1 << Static458.anInt7508;
			@Pc(28) int local28 = arg3 << Static458.anInt7508;
			if (Static518.method6898(Static511.anInt8116, arg0, Static29.aClass139Array6[arg2].method6889(arg1, arg3), local28, local24, Static511.anInt8116)) {
				Static145.anInt3068++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(JJ)J")
	public static long method7038(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
