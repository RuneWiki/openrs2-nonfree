import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	public static int anInt4093 = 0;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "[I")
	public static final int[] anIntArray298 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_92 = new Class151(104, 8);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([BBII)[B")
	public static byte[] method3664(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) byte[] local20;
		if (arg1 <= 0) {
			local20 = arg0;
		} else {
			local20 = new byte[arg2];
			for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
				local20[local27] = arg0[arg1 + local27];
			}
		}
		@Pc(45) Class272 local45 = new Class272();
		local45.method6068();
		local45.method6072((long) (arg2 * 8), local20);
		@Pc(59) byte[] local59 = new byte[64];
		local45.method6071(local59);
		return local59;
	}
}
