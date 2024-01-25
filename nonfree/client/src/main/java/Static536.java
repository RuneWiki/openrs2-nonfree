import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "Lclient!im;")
	public static final Class140 aClass140_148 = new Class140(59, -1);

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
	public static int anInt9052 = 0;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
	public static void method7439() {
		@Pc(7) int local7 = Static190.anInt3385;
		@Pc(9) int[] local9 = Static502.anIntArray771;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class49_Sub2_Sub2_Sub1 local24 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local9[local16]];
			if (local24 != null) {
				Static452.method6439(local24, local24.method3788());
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZZZ)Lclient!kr;")
	public static Class171 method7441(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class167 local5 = null;
		if (Static113.aClass307_1 != null) {
			local5 = new Class167(arg0, Static113.aClass307_1, Static529.aClass307Array1[arg0], 1000000);
		}
		Static527.aClass131_Sub1Array2[arg0] = Static40.aClass182_1.method4474(arg0, Static231.aClass167_1, local5);
		if (arg2) {
			Static527.aClass131_Sub1Array2[arg0].method7016();
		}
		return new Class171(Static527.aClass131_Sub1Array2[arg0], arg1, 1);
	}
}
