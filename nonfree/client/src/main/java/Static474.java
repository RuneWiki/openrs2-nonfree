import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
	public static int anInt2217;

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_50 = new Class44(74, -1);

	@OriginalMember(owner = "client!qca", name = "v", descriptor = "[B")
	public static final byte[] aByteArray38 = new byte[2048];

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "Lclient!ol;")
	public static final Class14_Sub40 aClass14_Sub40_2 = new Class14_Sub40(0, 0);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BIII)Z")
	public static boolean method1892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface19 local9 = (Interface19) Static622.method8738(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static272.method3964(local9) & true;
		}
		local9 = (Interface19) Static595.method8438(arg1, arg2, arg0, nq.class);
		if (local9 != null) {
			local11 &= Static272.method3964(local9);
		}
		local9 = (Interface19) Static430.method6312(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static272.method3964(local9);
		}
		return local11;
	}
}
