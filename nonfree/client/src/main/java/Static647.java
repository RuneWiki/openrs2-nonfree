import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIB)Z")
	public static boolean method8699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface17 local11 = (Interface17) Static454.method6134(arg0, arg2, arg1);
		if (local11 != null) {
			local5 = Static273.method4020(local11) & true;
		}
		local11 = (Interface17) Static180.method2823(arg0, arg2, arg1, nf.class);
		if (local11 != null) {
			local5 &= Static273.method4020(local11);
		}
		local11 = (Interface17) Static609.method8264(arg0, arg2, arg1);
		if (local11 != null) {
			local5 &= Static273.method4020(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)Z")
	public static boolean method8700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static315.aByteArrayArrayArray13[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static315.aByteArrayArrayArray13[arg2][arg3][arg0] & 0x10) == 0) {
			return Static508.method6633(arg2, arg0, arg3) == arg1;
		} else {
			return false;
		}
	}
}
