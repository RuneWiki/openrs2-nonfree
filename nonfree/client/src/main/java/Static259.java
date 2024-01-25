import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "[Lclient!hv;")
	public static Class148[] aClass148Array1;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	public static int anInt4808 = 0;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_7 = new Class357(4, 1);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIIBI)Lclient!tt;")
	public static Class2_Sub44 method4033(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub44 local7 = new Class2_Sub44();
		local7.anInt8607 = arg1;
		local7.anInt8608 = arg3;
		Static217.aClass162_20.method3522(local7, (long) arg2);
		Static335.method5131(arg3);
		@Pc(34) Class196 local34 = Static117.method1748(arg2);
		if (local34 != null) {
			Static515.method7134(local34);
		}
		if (Static454.aClass196_9 != null) {
			Static515.method7134(Static454.aClass196_9);
			Static454.aClass196_9 = null;
		}
		Static227.method3536();
		if (local34 != null) {
			Static274.method4155(local34, !arg0);
		}
		if (!arg0) {
			Static552.method7488(arg3);
		}
		if (!arg0 && Static554.anInt9121 != -1) {
			Static58.method952(Static554.anInt9121, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Z")
	public static boolean method4034() {
		@Pc(12) boolean local12 = true;
		if (Static499.aClass13_3 == null) {
			if (Static490.aClass259_153.method5988(Static289.anInt5286)) {
				Static499.aClass13_3 = Static596.method253(Static490.aClass259_153, Static289.anInt5286);
			} else {
				local12 = false;
			}
		}
		if (Static45.aClass13_1 == null) {
			if (Static490.aClass259_153.method5988(Static95.anInt2025)) {
				Static45.aClass13_1 = Static596.method253(Static490.aClass259_153, Static95.anInt2025);
			} else {
				local12 = false;
			}
		}
		if (Static205.aClass13_2 == null) {
			if (Static490.aClass259_153.method5988(Static33.anInt856)) {
				Static205.aClass13_2 = Static596.method253(Static490.aClass259_153, Static33.anInt856);
			} else {
				local12 = false;
			}
		}
		if (Static289.aClass294_7 == null) {
			if (Static72.aClass259_33.method5988(Static63.anInt1460)) {
				Static289.aClass294_7 = Static461.method6506(Static72.aClass259_33, Static63.anInt1460);
			} else {
				local12 = false;
			}
		}
		if (Static540.aClass13Array1 == null) {
			if (Static490.aClass259_153.method5988(Static63.anInt1460)) {
				Static540.aClass13Array1 = Static596.method248(Static490.aClass259_153, Static63.anInt1460);
			} else {
				local12 = false;
			}
		}
		return local12;
	}
}
