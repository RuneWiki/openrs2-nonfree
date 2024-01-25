import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "[Lclient!vi;")
	public static Class369[] aClass369Array1;

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_20 = new Class359(71, -1);

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "Lclient!hu;")
	public static final Class155 aClass155_1 = new Class155();

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)Z")
	public static boolean method978(@OriginalArg(0) int arg0) {
		return arg0 == 5 || arg0 == 53 || arg0 == 44 || arg0 == 21 || arg0 == 12 || arg0 == 49 || arg0 == 9;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIZIIIF)[I")
	public static int[] method979(@OriginalArg(7) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class5_Sub2_Sub4 local15 = new Class5_Sub2_Sub4();
		local15.anInt830 = (int) (arg0 * 4096.0F);
		local15.anInt832 = 4;
		local15.anInt833 = 8;
		local15.anInt835 = 8;
		local15.aBoolean59 = true;
		local15.anInt834 = 35;
		local15.method8951();
		Static187.method5796(1, 2048);
		local15.method731(local11, 0);
		return local11;
	}
}
