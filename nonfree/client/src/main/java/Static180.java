import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
	public static int anInt4051;

	@OriginalMember(owner = "client!gt", name = "S", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_33 = new Class245(5);

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "Lclient!pr;")
	public static Class254 aClass254_74 = null;

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_45 = new Class181(9, -1);

	@OriginalMember(owner = "client!gt", name = "W", descriptor = "I")
	public static int anInt4052 = 0;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	public static void method3563() {
		Static101.aClass9_4.ha(((float) Static104.aClass6_Sub6_Sub1_4.anInt1172 * 0.1F + 0.7F) * 1.1523438F);
		Static101.aClass9_4.YA(Static307.anInt1465, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static101.aClass9_4.X(Static51.anInt1395, -1, 0);
		Static101.aClass9_4.method5391(Static408.aClass65_95);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!wm;)V")
	public static void method3567(@OriginalArg(1) int arg0, @OriginalArg(2) Class348 arg1) {
		if (Static177.aBoolean326) {
			arg0 = 0;
			Static177.aBoolean326 = false;
		}
		if (Static275.aClass348_1 != null && Static275.aClass348_1.method8092(arg1)) {
			return;
		}
		Static275.aClass348_1 = arg1;
		Static48.aLong191 = Static174.method3502();
		Static326.anInt6153 = arg0;
		Static215.anInt4569 = arg0;
		if (Static215.anInt4569 == 0) {
			Static385.method6069();
			return;
		}
		Static431.aFloat176 = Static243.aFloat113;
		Static557.anInt9494 = Static581.anInt9824;
		Static352.aFloat152 = Static397.aFloat174;
		Static535.anInt9246 = Static263.anInt5267;
		Static43.anInt1258 = Static203.anInt4356;
		Static316.aFloat125 = Static161.aFloat92;
		Static501.aFloat116 = Static243.aFloat114;
		Static331.aClass65_142 = Static93.aClass65_29;
		Static321.aFloat128 = Static294.aFloat122;
		Static42.aFloat40 = Static552.aFloat183;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3570(@OriginalArg(0) String arg0) {
		Static277.method4595("", 0, "", "", 0, arg0);
	}
}
