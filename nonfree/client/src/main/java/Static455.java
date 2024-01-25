import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	public static int anInt6328;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_144 = new Class253(49, 7);

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
	public static int anInt6332 = 2;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!kh;B)V")
	public static void method5030(@OriginalArg(0) Class26_Sub2_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt7112 - Static274.anInt4617;
		@Pc(20) int local20 = arg0.anInt7105 * 128 + arg0.method5512() * 64;
		@Pc(31) int local31 = arg0.anInt7048 * 128 + arg0.method5512() * 64;
		arg0.anInt7383 += (local31 - arg0.anInt7383) / local9;
		arg0.anInt7114 = 0;
		arg0.anInt7388 += (local20 - arg0.anInt7388) / local9;
		if (arg0.anInt7093 == 0) {
			arg0.method5521(8192);
		}
		if (arg0.anInt7093 == 1) {
			arg0.method5521(12288);
		}
		if (arg0.anInt7093 == 2) {
			arg0.method5521(0);
		}
		if (arg0.anInt7093 == 3) {
			arg0.method5521(4096);
		}
	}
}
