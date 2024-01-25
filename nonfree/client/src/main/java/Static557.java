import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "Lclient!sb;")
	public static Class301 aClass301_8;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
	public static int anInt9674;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!sc;")
	public static final Class302 aClass302_13 = new Class302();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IFIIIIZB)[I")
	public static int[] method7815(@OriginalArg(1) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class8_Sub2_Sub20 local15 = new Class8_Sub2_Sub20();
		local15.anInt5421 = 8;
		local15.aBoolean400 = true;
		local15.anInt5430 = 35;
		local15.anInt5427 = (int) (arg0 * 4096.0F);
		local15.anInt5432 = 4;
		local15.anInt5426 = 8;
		local15.method8508();
		Static364.method5678(2048, 1);
		local15.method4463(0, local11);
		return local11;
	}
}
