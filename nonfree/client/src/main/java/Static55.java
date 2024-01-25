import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "[Lclient!le;")
	public static final Class194[] aClass194Array1 = new Class194[4];

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	public static final int[] anIntArray97 = new int[50];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method1266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static263.method4528(arg1, arg0) || Static188.method3617(arg1, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lclient!bv;")
	public static Class6_Sub7 method1268() {
		if (Static461.aClass211_2 == null || Static57.aClass97_41 == null) {
			return null;
		}
		for (@Pc(21) Class6_Sub7 local21 = (Class6_Sub7) Static57.aClass97_41.method2512(); local21 != null; local21 = (Class6_Sub7) Static57.aClass97_41.method2512()) {
			@Pc(29) Class137 local29 = Static461.aClass42_2.method1147(local21.anInt1365);
			if (local29 != null && local29.aBoolean353 && local29.method3765(Static461.anInterface15_2)) {
				return local21;
			}
		}
		return null;
	}
}
