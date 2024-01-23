import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!og;")
	public static Class126 aClass126_1 = new Class126();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public static int anInt2664 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIII)I")
	public static int method2258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22 = 65536 - Class66.anIntArray153[arg3 * 1024 / arg1] >> 1;
		return (local22 * arg0 >> 16) + ((65536 - local22) * arg2 >> 16);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!wm;)Lclient!sk;")
	public static Class74_Sub1 method2259(@OriginalArg(1) Class2_Sub26 arg0) {
		return new Class74_Sub1(arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4245(), arg0.method4245(), arg0.method4261());
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)V")
	public static void method2263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static91.anInt2030 * arg1 >> 8;
		if (arg0 == -1 && !Static145.aBoolean257) {
			Static1.method6();
		} else if (arg0 != -1 && (arg0 != Static149.anInt3177 || !Static270.method4505()) && local9 != 0 && !Static145.aBoolean257) {
			Static183.method3144(arg0, local9, Static152.aClass84_61);
		}
		Static149.anInt3177 = arg0;
	}
}
