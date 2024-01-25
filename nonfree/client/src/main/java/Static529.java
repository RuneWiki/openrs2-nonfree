import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_71 = new Class47(52, 7);

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
	public static int anInt4675 = -1;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIFIIIZII)[[I")
	public static int[][] method4038(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub4_Sub7 local13 = new Class6_Sub4_Sub7();
		local13.anInt1263 = 4;
		local13.anInt1260 = 3;
		local13.anInt1258 = (int) (arg0 * 4096.0F);
		local13.anInt1268 = 8;
		local13.aBoolean68 = false;
		local13.method7754();
		Static533.method7242(64, 256);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local13.method1252(local46, local9[local46]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)I")
	public static int method4041() {
		@Pc(10) Class136 local10 = Static367.aClass136_73;
		synchronized (Static367.aClass136_73) {
			return Static367.aClass136_73.method3478();
		}
	}
}
