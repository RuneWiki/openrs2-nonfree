import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!ou", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ou", name = "E", descriptor = "Lclient!ica;")
	public static final Class127 aClass127_36 = new Class127(64);

	@OriginalMember(owner = "client!ou", name = "L", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_135 = new Class239(106, 6);

	@OriginalMember(owner = "client!ou", name = "O", descriptor = "[I")
	public static final int[] anIntArray518 = new int[32];

	@OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
	public static int anInt6794 = 0;

	@OriginalMember(owner = "client!ou", name = "R", descriptor = "I")
	public static int anInt6796 = -1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBII)Z")
	public static boolean method5783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface6 local11 = (Interface6) Static524.method7595(arg2, arg1, arg0);
		if (local11 != null) {
			local5 = Static98.method1914(local11) & true;
		}
		local11 = (Interface6) Static214.method3907(arg2, arg1, arg0, ej.class);
		if (local11 != null) {
			local5 &= Static98.method1914(local11);
		}
		local11 = (Interface6) Static427.method6584(arg2, arg1, arg0);
		if (local11 != null) {
			local5 &= Static98.method1914(local11);
		}
		return local5;
	}
}
