import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array15;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIZFIZ)[[I")
	public static int[][] method8415(@OriginalArg(6) float arg0) {
		@Pc(12) int[][] local12 = new int[256][64];
		@Pc(16) Class2_Sub10_Sub2 local16 = new Class2_Sub10_Sub2();
		local16.aBoolean87 = false;
		local16.anInt1224 = (int) (arg0 * 4096.0F);
		local16.anInt1220 = 4;
		local16.anInt1216 = 3;
		local16.anInt1223 = 4;
		local16.method8407();
		Static385.method5797(256, 64);
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			local16.method1087(local43, local12[local43]);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method8417(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static449.anInt7920; local9++) {
			if (arg0.equalsIgnoreCase(Static17.aStringArray4[local9])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static417.aStringArray29[local9])) {
				return true;
			}
		}
		return false;
	}
}
