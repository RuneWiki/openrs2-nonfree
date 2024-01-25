import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public static int anInt2379;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Lclient!c;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	public static int anInt2386;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
	public static int anInt2387;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_28 = new Class215(40, 3);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!lh;IIIB)V")
	public static void method2022(@OriginalArg(0) Class16_Sub1_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg0.anIntArray426[0];
		@Pc(19) int local19 = arg0.anIntArray427[0];
		if (local14 < 0 || Static326.anInt5666 <= local14 || local19 < 0 || Static283.anInt5187 <= local19 || (arg1 < 0 || arg1 >= Static326.anInt5666 || arg2 < 0 || Static283.anInt5187 <= arg2)) {
			return;
		}
		@Pc(77) int local77 = Static6.method49(Static175.aClass213Array1[arg0.aByte82], local14, arg1, 0, arg2, arg0.method4751(), 0, Static33.anIntArray36, 0, true, Static392.anIntArray498, local19, 0, -4);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(87) int local87 = 0; local87 < local77 - 1; local87++) {
				arg0.method3427(Static33.anIntArray36[local87], Static392.anIntArray498[local87], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public static void method2023() {
		Static421.aClass183_48 = new Class183();
	}
}
