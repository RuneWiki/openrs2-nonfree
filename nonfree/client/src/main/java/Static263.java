import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public static int anInt5182 = -1;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public static int anInt5184 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)Z")
	public static boolean method4380(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIB)Z")
	public static boolean method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static66.method1217(arg1, arg0) || Static404.method5867(arg0, arg1);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method4382(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) byte[] local12;
		if (arg2 <= 0) {
			local12 = arg1;
		} else {
			local12 = new byte[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				local12[local19] = arg1[local19 + arg2];
			}
		}
		@Pc(37) Class309 local37 = new Class309();
		local37.method7225();
		local37.method7223((long) (arg0 * 8), local12);
		@Pc(58) byte[] local58 = new byte[64];
		local37.method7224(local58);
		return local58;
	}
}
