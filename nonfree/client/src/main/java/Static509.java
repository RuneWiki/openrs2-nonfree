import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
	public static int anInt8820;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "Lclient!laa;")
	public static Class198 aClass198_5;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_13 = new Class295(6, 7);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIIFIIIB)[I")
	public static int[] method7127(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub1_Sub8 local10 = new Class1_Sub1_Sub8();
		local10.anInt1849 = 8;
		local10.anInt1855 = 8;
		local10.anInt1852 = (int) (arg0 * 4096.0F);
		local10.anInt1846 = 4;
		local10.anInt1843 = 35;
		local10.aBoolean125 = true;
		local10.method7831();
		Static584.method7821(2048, 1);
		local10.method1547(local6, 0);
		return local6;
	}
}
