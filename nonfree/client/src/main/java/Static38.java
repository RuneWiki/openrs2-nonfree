import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!tt;")
	public static Class1_Sub44 aClass1_Sub44_1;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt834;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_11 = new Class306("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I")
	public static int method882() {
		return 14;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I")
	public static int method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static544.aClass205Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(15) int local15 = arg2 >> 9;
		if (local11 < 0 || local15 < 0 || Static459.anInt7799 - 1 < local11 || local15 > Static482.anInt7990 - 1) {
			return 0;
		}
		@Pc(38) int local38 = arg0;
		if (arg0 < 3 && (Static530.aByteArrayArrayArray17[1][local11][local15] & 0x2) != 0) {
			local38 = arg0 + 1;
		}
		return Static544.aClass205Array3[local38].aa(arg1, arg2);
	}
}
