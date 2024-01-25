import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_119 = new Class47(66, 3);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(FIIZIIII)[I")
	public static int[] method6255(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class6_Sub4_Sub7 local10 = new Class6_Sub4_Sub7();
		local10.anInt1260 = 4;
		local10.anInt1268 = 8;
		local10.anInt1258 = (int) (arg0 * 4096.0F);
		local10.aBoolean68 = true;
		local10.anInt1262 = 35;
		local10.anInt1263 = 8;
		local10.method7754();
		Static533.method7242(2048, 1);
		local10.method1252(0, local6);
		return local6;
	}
}
