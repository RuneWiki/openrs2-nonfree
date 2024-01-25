import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Lclient!pj;")
	public static Class248 aClass248_58;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!nk;")
	public static final Class217 aClass217_1 = new Class217(0, 3, Static407.aClass254_18);

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!nk;")
	public static final Class217 aClass217_2 = new Class217(1, 3, Static407.aClass254_18);

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!nk;")
	public static final Class217 aClass217_3 = new Class217(2, 4, Static407.aClass254_14);

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!nk;")
	public static final Class217 aClass217_4 = new Class217(3, 1, Static407.aClass254_18);

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "Lclient!nk;")
	public static final Class217 aClass217_5 = new Class217(4, 2, Static407.aClass254_18);

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!nk;")
	public static final Class217 aClass217_6 = new Class217(5, 3, Static407.aClass254_18);

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Lclient!nk;")
	private static final Class217 aClass217_7 = new Class217(6, 4, Static407.aClass254_18);

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
	public static final int anInt6537 = Static1.method54(16);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)[Lclient!nk;")
	public static Class217[] method5277() {
		return new Class217[] { aClass217_1, aClass217_2, aClass217_3, aClass217_4, aClass217_5, aClass217_6, aClass217_7 };
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILclient!va;IILclient!va;III)V")
	public static void method5278(@OriginalArg(2) int arg0, @OriginalArg(3) Class15_Sub2_Sub4 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class15_Sub2_Sub4 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg1.method7137();
		if (local7 == -1) {
			return;
		}
		@Pc(28) Class71 local28 = (Class71) Static518.aClass330_63.method7677((long) local7);
		if (local28 == null) {
			@Pc(35) Class177[] local35 = Static593.method4140(Static114.aClass248_20, local7);
			if (local35 == null) {
				return;
			}
			local28 = Static554.aClass90_12.method7522(local35[0]);
			Static518.aClass330_63.method7676(local28, (long) local7);
		}
		Static61.method887(arg0 >> 1, arg6 >> 1, arg4.anInt8911, 0, arg4.method7135() * 256, arg4.anInt8913, arg4.aByte98);
		@Pc(81) int local81 = arg3 + Static10.anIntArray8[0] - 18;
		@Pc(89) int local89 = local81 + arg2 / 4 * 18;
		@Pc(99) int local99 = arg5 + Static10.anIntArray8[1] - 16 - 54;
		@Pc(107) int local107 = local99 + arg2 % 4 * 18;
		local28.method7775(local89, local107);
		if (arg1 == arg4) {
			Static554.aClass90_12.method7516(-256, 18, local89 - 1, local107 + -1, 18);
		}
		@Pc(129) Class60_Sub3 local129 = Static207.method3394();
		local129.anInt3155 = local107 + 16;
		local129.anInt3152 = local107;
		local129.aClass15_Sub2_Sub4_1 = arg1;
		local129.anInt3153 = local89 + 16;
		local129.anInt3154 = local89;
		Static359.aClass349_16.method7893(local129);
	}
}
