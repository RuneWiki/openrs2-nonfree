import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dr", name = "cb", descriptor = "I")
	public static int anInt1794;

	@OriginalMember(owner = "client!dr", name = "X", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_13 = new Class134(10);

	@OriginalMember(owner = "client!dr", name = "ab", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_14 = new Class134(4);

	@OriginalMember(owner = "client!dr", name = "bb", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_64 = new Class107(43, 1);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZII)Lclient!ij;")
	public static Class1_Sub23 method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub23 local7 = new Class1_Sub23();
		local7.anInt3058 = arg1;
		local7.anInt3059 = arg0;
		Static101.aClass96_16.method2341((long) arg3, local7);
		Static433.method5754(arg0);
		@Pc(26) Class251 local26 = Static378.method3544(arg3);
		if (local26 != null) {
			Static408.method5469(local26);
		}
		if (Static182.aClass251_6 != null) {
			Static408.method5469(Static182.aClass251_6);
			Static182.aClass251_6 = null;
		}
		Static456.method6005();
		if (local26 != null) {
			Static157.method3072(!arg2, local26);
		}
		if (!arg2) {
			Static13.method362(arg0);
		}
		if (!arg2 && Static407.anInt6564 != -1) {
			Static204.method5978(Static407.anInt6564, 1);
		}
		return local7;
	}
}
