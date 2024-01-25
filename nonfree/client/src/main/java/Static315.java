import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_207 = new Class179(110, 6);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIFIIIZ)[[I")
	public static int[][] method4554(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub1_Sub13 local13 = new Class6_Sub1_Sub13();
		local13.anInt3586 = 4;
		local13.anInt3588 = 3;
		local13.anInt3593 = (int) (arg0 * 4096.0F);
		local13.anInt3585 = 4;
		local13.aBoolean213 = false;
		local13.method8964();
		Static540.method7691(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method3087(local48, local9[local48]);
		}
		return local9;
	}
}
