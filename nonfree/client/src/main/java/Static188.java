import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!go", name = "d", descriptor = "Lclient!bh;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "[Lclient!fba;")
	public static Class92[] aClass92Array4;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBI)I")
	public static int method3753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static403.method3680(arg0 + 45365, 4, arg1 + 91923) + (Static403.method3680(arg0 + 10294, 2, arg1 - -37821) + -128 >> 1) + (Static403.method3680(arg0, 1, arg1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public static void method3756() {
		Static120.anInt3091 = Static424.aClass315_16.anInt9180 + Static424.aClass315_16.anInt9174 + 2;
		Static457.aStringArray34 = new String[500];
		Static313.anInt6367 = Static224.aClass315_11.anInt9174 + Static224.aClass315_11.anInt9180 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static457.aStringArray34.length; local27++) {
			Static457.aStringArray34[local27] = "";
		}
		Static117.method2792(Static287.aClass176_1.method4986(Static380.anInt7247));
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)I")
	public static int method3759(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
