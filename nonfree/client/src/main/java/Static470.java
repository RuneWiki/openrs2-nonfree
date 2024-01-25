import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "[I")
	public static int[] anIntArray532;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
	public static int anInt8027 = -2;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)V")
	public static void method6600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(8, arg3);
		local8.method6098();
		local8.anInt7258 = arg2;
		local8.anInt7256 = arg1;
		local8.anInt7261 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)Z")
	public static boolean method6601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface24 local11 = (Interface24) Static353.method5256(arg2, arg1, arg0);
		if (local11 != null) {
			local5 = Static419.method5466(local11) & true;
		}
		local11 = (Interface24) Static224.method3516(arg2, arg1, arg0, vda.class);
		if (local11 != null) {
			local5 &= Static419.method5466(local11);
		}
		local11 = (Interface24) Static317.method4928(arg2, arg1, arg0);
		if (local11 != null) {
			local5 &= Static419.method5466(local11);
		}
		return local5;
	}
}
