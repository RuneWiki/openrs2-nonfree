import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "[Lclient!n;")
	public static Class225[] aClass225Array2;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "F")
	public static float aFloat224;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "F")
	public static float aFloat225;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
	public static int anInt9872;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "[I")
	public static final int[] anIntArray529 = new int[1];

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "Lclient!sb;")
	public static final Class299 aClass299_6 = new Class299("LIVE", 0);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)Z")
	public static boolean method8056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static262.aByteArrayArrayArray16[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static262.aByteArrayArrayArray16[arg2][arg0][arg3] & 0x10) == 0) {
			return arg1 == Static86.method2015(arg0, arg3, arg2);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI[BI)[B")
	public static byte[] method8057(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) byte[] local12;
		if (arg2 <= 0) {
			local12 = arg1;
		} else {
			local12 = new byte[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				local12[local19] = arg1[arg2 + local19];
			}
		}
		@Pc(46) Class73 local46 = new Class73();
		local46.method2183();
		local46.method2188(local12, (long) (arg0 * 8));
		@Pc(60) byte[] local60 = new byte[64];
		local46.method2187(local60);
		return local60;
	}
}
