import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	public static int anInt5500;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)V")
	public static void method4421() {
		Static169.aClass46_29.method1068(5);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method4422() {
		Static165.aClass46_28.method1077();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIFIIZII)[[I")
	public static int[][] method4424(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub1_Sub35 local13 = new Class2_Sub1_Sub35();
		local13.aBoolean473 = false;
		local13.anInt5875 = (int) (arg0 * 4096.0F);
		local13.anInt5865 = 8;
		local13.anInt5873 = 4;
		local13.anInt5868 = 3;
		local13.method4934();
		Static155.method4925(64, 256);
		for (@Pc(42) int local42 = 0; local42 < 256; local42++) {
			local13.method4712(local42, local9[local42]);
		}
		return local9;
	}
}
