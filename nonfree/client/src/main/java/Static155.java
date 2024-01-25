import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
	public static int anInt2673;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Lclient!wc;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public static int anInt2670 = 100;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_66 = new Class211(112, -1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIFIZIII)[[I")
	public static int[][] method2194(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub2_Sub24 local13 = new Class2_Sub2_Sub24();
		local13.aBoolean327 = false;
		local13.anInt4599 = 8;
		local13.anInt4593 = (int) (arg0 * 4096.0F);
		local13.anInt4591 = 4;
		local13.anInt4594 = 3;
		local13.method5475();
		Static427.method5592(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method3744(local9[local40], local40);
		}
		return local9;
	}
}
