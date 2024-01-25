import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "Z")
	public static boolean aBoolean327 = true;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_66 = new Class286(74, 4);

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_25 = new Class313(32);

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
	public static int anInt4044 = 0;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "[I")
	public static final int[] anIntArray253 = new int[14];

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_9 = new Class113(12, 19);

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
	public static int anInt4045 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!bfa;)I")
	public static int method3354(@OriginalArg(1) Class2_Sub5 arg0) {
		@Pc(9) String local9 = Static374.method5546(arg0);
		@Pc(11) int[] local11 = null;
		if (Static370.method5499(arg0.anInt902)) {
			local11 = Static296.aClass218_1.method5067((int) arg0.aLong30).anIntArray648;
		} else if (arg0.anInt896 != -1) {
			local11 = Static296.aClass218_1.method5067(arg0.anInt896).anIntArray648;
		} else if (Static489.method6854(arg0.anInt902)) {
			@Pc(89) Class2_Sub32 local89 = (Class2_Sub32) Static544.aClass162_40.method3519((long) arg0.aLong30);
			if (local89 != null) {
				@Pc(94) Class6_Sub1_Sub1_Sub1_Sub1 local94 = local89.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				@Pc(97) Class86 local97 = local94.aClass86_1;
				if (local97.anIntArray136 != null) {
					local97 = local97.method1567(Static70.aClass78_1);
				}
				if (local97 != null) {
					local11 = local97.anIntArray135;
				}
			}
		} else if (Static205.method3315(arg0.anInt902)) {
			@Pc(54) Class32 local54;
			if (arg0.anInt902 == 1008) {
				local54 = Static541.aClass97_4.method1794((int) arg0.aLong30);
			} else {
				local54 = Static541.aClass97_4.method1794((int) (arg0.aLong30 >>> 32 & 0x7FFFFFFFL));
			}
			if (local54.anIntArray50 != null) {
				local54 = local54.method552(Static70.aClass78_1);
			}
			if (local54 != null) {
				local11 = local54.anIntArray45;
			}
		}
		if (local11 != null) {
			local9 = local9 + Static362.method5082(local11);
		}
		@Pc(138) int local138 = Static83.aClass294_6.method6720(Static126.aClass39Array14, local9);
		if (arg0.aBoolean60) {
			local138 += Static525.aClass39_38.E() + 4;
		}
		return local138;
	}
}
