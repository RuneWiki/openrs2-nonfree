import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Lclient!ij;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
	public static int anInt3917;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	public static int anInt3918;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_3 = new Class273(7, 0, 1, 1);

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "Lclient!h;")
	public static final Class114 aClass114_81 = new Class114("K", "T", "K", "K");

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_58 = new Class6(15, 2);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIZ)I")
	public static int method3490(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub49 local18 = Static393.method5919(false, arg0);
		if (local18 == null) {
			return Static325.aClass55_4.method1979(arg0).anInt108;
		}
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18.anIntArray747.length; local30++) {
			if (local18.anIntArray747[local30] == -1) {
				local28++;
			}
		}
		return local28 + Static325.aClass55_4.method1979(arg0).anInt108 - local18.anIntArray747.length;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)I")
	public static int method3492() {
		return Static309.anInt5935;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)Lclient!kq;")
	public static Class167 method3494(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static151.aClass167Array1[arg0] : null;
	}
}
