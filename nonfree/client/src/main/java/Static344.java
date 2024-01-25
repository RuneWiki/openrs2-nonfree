import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "Z")
	public static boolean aBoolean476 = false;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)[Lclient!bi;")
	public static Class33[] method5419() {
		return new Class33[] { Static132.aClass33_4, Static42.aClass33_1, Static428.aClass33_6 };
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZ[B)[B")
	public static byte[] method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) byte[] local10;
		if (arg0 > 0) {
			local10 = new byte[arg1];
			for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
				local10[local12] = arg2[local12 + arg0];
			}
		} else {
			local10 = arg2;
		}
		@Pc(43) Class250 local43 = new Class250();
		local43.method6238();
		local43.method6242((long) (arg1 * 8), local10);
		@Pc(57) byte[] local57 = new byte[64];
		local43.method6243(local57);
		return local57;
	}
}
