import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "[I")
	public static final int[] anIntArray143 = new int[25];

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "Lclient!faa;")
	public static final Class91 aClass91_7 = new Class91(16);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V")
	public static void method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static328.method4862(local7.aClass11_Sub1_Sub5_2);
		Static328.method4862(local7.aClass11_Sub1_Sub5_1);
		if (local7.aClass11_Sub1_Sub5_2 != null) {
			local7.aClass11_Sub1_Sub5_2 = null;
		}
		if (local7.aClass11_Sub1_Sub5_1 != null) {
			local7.aClass11_Sub1_Sub5_1 = null;
		}
	}
}
