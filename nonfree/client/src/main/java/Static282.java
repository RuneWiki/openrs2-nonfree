import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
	public static final int[] anIntArray309 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method4486(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(19) int local19 = Static111.anInt2565;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) Class186 local30 = Static5.aClass301_1.method6915(arg0[local21]);
			if (local30.anInt5803 != -1) {
				@Pc(43) Class88 local43 = (Class88) Static107.aClass167_7.method3966((long) local30.anInt5803);
				if (local43 == null) {
					@Pc(51) Class103 local51 = Static598.method2462(Static159.aClass348_38, local30.anInt5803, 0);
					if (local51 != null) {
						local43 = Static39.aClass7_2.method7808(local51, true);
						Static107.aClass167_7.method3974((long) local30.anInt5803, local43);
					}
				}
				if (local43 != null) {
					Static393.aClass88Array9[local19] = local43;
					local9.append(" <img=").append(local19).append(">");
					local19++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBLclient!ufa;)V")
	public static void method4488(@OriginalArg(0) int arg0, @OriginalArg(2) Class21_Sub1_Sub1_Sub1 arg1) {
		if (arg1.anIntArray205 == null) {
			return;
		}
		@Pc(9) int local9 = arg1.anIntArray205[arg0 + 1];
		if (local9 == arg1.anInt4209) {
			return;
		}
		arg1.anInt4197 = 0;
		arg1.anInt4280 = arg1.anInt4277;
		arg1.anInt4252 = 0;
		arg1.anInt4257 = 1;
		arg1.anInt4209 = local9;
		arg1.anInt4272 = 0;
		if (arg1.anInt4209 != -1) {
			Static593.method8263(arg1.anInt4272, arg1, Static17.aClass254_1.method5936(arg1.anInt4209));
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)Lclient!sca;")
	public static Class41 method4489() {
		try {
			return (Class41) Class.forName("Class41_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
