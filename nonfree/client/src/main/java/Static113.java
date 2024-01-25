import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
	public static int anInt2513 = 0;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_65 = new Class158("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIII)I")
	public static int method1824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg0 & arg1 - 1;
		@Pc(28) int local28 = Static324.method5503(local17, local7);
		@Pc(35) int local35 = Static324.method5503(local17, local7 + 1);
		@Pc(42) int local42 = Static324.method5503(local17 + 1, local7);
		@Pc(51) int local51 = Static324.method5503(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static228.method3477(arg1, local13, local35, local28);
		@Pc(65) int local65 = Static228.method3477(arg1, local13, local51, local42);
		return Static228.method3477(arg1, local23, local65, local58);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!pl;)I")
	public static int method1826(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(7) String local7 = Static60.method1126(arg0);
		@Pc(9) int[] local9 = null;
		if (Static57.method1071(arg0.anInt5839)) {
			local9 = Static43.aClass57_1.method1414((int) arg0.aLong166).anIntArray463;
		} else if (arg0.anInt5843 != -1) {
			local9 = Static43.aClass57_1.method1414(arg0.anInt5843).anIntArray463;
		} else if (Static370.method5159(arg0.anInt5839)) {
			@Pc(88) Class1_Sub27 local88 = (Class1_Sub27) Static24.aClass38_3.method765((long) arg0.aLong166);
			if (local88 != null) {
				@Pc(93) Class30_Sub1_Sub1_Sub1 local93 = local88.aClass30_Sub1_Sub1_Sub1_2;
				@Pc(96) Class11 local96 = local93.aClass11_1;
				if (local96.anIntArray12 != null) {
					local96 = local96.method136(Static366.aClass190_1);
				}
				if (local96 != null) {
					local9 = local96.anIntArray15;
				}
			}
		} else if (Static351.method4975(arg0.anInt5839)) {
			@Pc(53) Class192 local53;
			if (arg0.anInt5839 == 1011) {
				local53 = Static455.aClass161_4.method3628((int) arg0.aLong166);
			} else {
				local53 = Static455.aClass161_4.method3628((int) (arg0.aLong166 >>> 32 & 0x7FFFFFFFL));
			}
			if (local53.anIntArray532 != null) {
				local53 = local53.method4369(Static366.aClass190_1);
			}
			if (local53 != null) {
				local9 = local53.anIntArray535;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static445.method5849(local9);
		}
		@Pc(144) int local144 = Static394.aClass209_10.method4687(local7, Static154.aClass137Array6);
		if (arg0.aBoolean371) {
			local144 += Static96.aClass137_3.YA() + 4;
		}
		return local144;
	}
}
