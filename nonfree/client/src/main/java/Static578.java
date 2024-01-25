import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!we", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "F")
	public static float aFloat240;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_109 = new Class208(43, 0);

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!eg;")
	public static final Class77 aClass77_8 = new Class77();

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Z")
	public static boolean aBoolean710 = false;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "[Lclient!mc;")
	public static final Class156_Sub1[] aClass156_Sub1Array2 = new Class156_Sub1[35];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIB)Z")
	public static boolean method7757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static204.aBoolean276) {
			return false;
		} else if (Static397.anInt7106 < 100) {
			return false;
		} else if (Static120.method2175(arg0, arg3, arg1)) {
			@Pc(34) int local34 = arg1 << Static166.anInt7796;
			@Pc(38) int local38 = arg0 << Static166.anInt7796;
			if (Static396.method1621(Static165.anInt3157, Static310.aClass129Array5[arg3].method6481(arg0, arg1), local34, Static165.anInt3157, arg2, local38)) {
				Static509.anInt8820++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
