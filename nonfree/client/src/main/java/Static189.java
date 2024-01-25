import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
	public static int anInt3711;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!waa;")
	public static Class350 aClass350_14 = new Class350(8);

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	public static int anInt3714 = -1;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_83 = new Class362(10, 7);

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_53 = new Class173(78, 8);

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIILclient!ec;ILclient!ec;IZI)V")
	public static void method3307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub4_Sub2_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub4_Sub2_Sub1 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg3.method6932();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class78 local21 = (Class78) Static95.aClass223_14.method5388((long) local7);
		if (local21 == null) {
			@Pc(28) Class261[] local28 = Static598.method6315(Static281.aClass176_74, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static440.aClass44_12.method5018(local28[0], true);
			Static95.aClass223_14.method5394(local21, (long) local7);
		}
		Static161.method524(arg5.anInt9934, arg6 >> 1, arg5.anInt9935, 0, arg5.method6925() * 256, arg5.aByte126, arg1 >> 1);
		@Pc(74) int local74 = arg0 + Static258.anIntArray241[0] - 18;
		@Pc(82) int local82 = local74 + arg4 / 4 * 18;
		@Pc(90) int local90 = arg2 + Static258.anIntArray241[1] - 70;
		@Pc(98) int local98 = local90 + arg4 % 4 * 18;
		local21.method8185(local82, local98);
		if (arg3 == arg5) {
			Static440.aClass44_12.method5030(18, -256, local98 - 1, 18, local82 - 1);
		}
		@Pc(120) Class1_Sub6 local120 = Static134.method2660();
		local120.anInt5073 = local98;
		local120.anInt5072 = local82 + 16;
		local120.anInt5071 = local82;
		local120.aClass1_Sub4_Sub2_Sub1_1 = arg3;
		local120.anInt5074 = local98 + 16;
		Static110.aClass136_3.method3289(local120);
	}
}
