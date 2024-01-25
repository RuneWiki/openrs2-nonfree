import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_167 = new Class263(20, 10);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public static void method5663() {
		Static194.aClass106_7.method5917(Static269.aFloat84, Static438.aFloat102, Static162.aFloat39);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BIII)V")
	public static void method5670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static12.aClass34_Sub1_1.anInt7157 * arg0 >> 8;
		if (arg1 == -1 && !Static180.aBoolean240) {
			Static47.method5365();
		} else if (arg1 != -1 && (Static71.anInt1878 != arg1 || !Static97.method1687()) && local13 != 0 && !Static180.aBoolean240) {
			Static122.method1984(arg2, Static362.aClass211_75, arg1, local13);
		}
		Static71.anInt1878 = arg1;
	}
}
