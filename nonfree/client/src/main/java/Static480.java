import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public static int anInt7789;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Lclient!pr;")
	public static Class265 aClass265_5;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!la;")
	public static Class117 aClass117_9;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
	public static final int[] anIntArray603 = new int[1024];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method6570(@OriginalArg(1) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static109.anInt2526;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class137 local27 = Static268.aClass79_1.method2482(arg0[local18]);
			if (local27.anInt4186 != -1) {
				@Pc(42) Class46 local42 = (Class46) Static450.aClass10_48.method250((long) local27.anInt4186);
				if (local42 == null) {
					@Pc(50) Class355 local50 = Static606.method7590(Static171.aClass246_84, local27.anInt4186, 0);
					if (local50 != null) {
						local42 = Static4.aClass43_1.method7205(local50, true);
						Static450.aClass10_48.method254(local42, (long) local27.anInt4186);
					}
				}
				if (local42 != null) {
					Static187.aClass46Array6[local16] = local42;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIZIIIILclient!pl;Lclient!pl;)V")
	public static void method6571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class9_Sub1_Sub1_Sub2 arg5, @OriginalArg(9) Class9_Sub1_Sub1_Sub2 arg6) {
		@Pc(7) int local7 = arg5.method5574();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class46 local20 = (Class46) Static209.aClass10_58.method250((long) local7);
		if (local20 == null) {
			@Pc(27) Class355[] local27 = Static606.method7593(Static171.aClass246_84, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static4.aClass43_1.method7205(local27[0], true);
			Static209.aClass10_58.method254(local20, (long) local7);
		}
		Static178.method6933(arg6.anInt8975, arg6.aByte126, arg6.anInt8980, arg2 >> 1, 0, arg0 >> 1, arg6.method5569() * 256);
		@Pc(74) int local74 = arg3 + Static449.anIntArray577[0] - 18;
		@Pc(82) int local82 = local74 + arg4 / 4 * 18;
		@Pc(92) int local92 = Static449.anIntArray577[1] + arg1 - 16 - 54;
		@Pc(100) int local100 = local92 + arg4 % 4 * 18;
		local20.method7606(local82, local100);
		if (arg5 == arg6) {
			Static4.aClass43_1.method7145(18, -256, 18, local82 - 1, local100 + -1);
		}
		@Pc(127) Class9_Sub10 local127 = Static282.method4473();
		local127.aClass9_Sub1_Sub1_Sub2_1 = arg5;
		local127.anInt7902 = local100 + 16;
		local127.anInt7901 = local82 + 16;
		local127.anInt7905 = local100;
		local127.anInt7906 = local82;
		Static75.aClass309_3.method6595(local127);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZBLclient!lk;)V")
	public static void method6572(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class203 arg1) {
		@Pc(15) int local15 = arg1.anInt5490 == 0 ? arg1.anInt5513 : arg1.anInt5490;
		@Pc(27) int local27 = arg1.anInt5506 == 0 ? arg1.anInt5476 : arg1.anInt5506;
		Static233.method3929(Static59.aClass203ArrayArray3[arg1.anInt5531 >> 16], arg1.anInt5531, arg0, local27, local15);
		if (arg1.aClass203Array2 != null) {
			Static233.method3929(arg1.aClass203Array2, arg1.anInt5531, arg0, local27, local15);
		}
		@Pc(60) Class3_Sub28 local60 = (Class3_Sub28) Static227.aClass310_15.method6601((long) arg1.anInt5531);
		if (local60 != null) {
			Static59.method4455(arg0, local15, local60.anInt5333, local27);
		}
	}
}
