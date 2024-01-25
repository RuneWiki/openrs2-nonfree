import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
	public static int anInt8215 = 0;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7023(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static544.anInt9946 >= 200 && !Static601.aBoolean608 || Static544.anInt9946 >= 200) {
			Static304.method4498(Static430.aClass257_11.method5699(Static456.anInt7118));
			return;
		}
		@Pc(34) String local34 = Static69.method1531(arg0);
		if (local34 == null) {
			return;
		}
		@Pc(82) String local82;
		for (@Pc(40) int local40 = 0; local40 < Static544.anInt9946; local40++) {
			@Pc(48) String local48 = Static69.method1531(Static636.aStringArray41[local40]);
			if (local48 != null && local48.equals(local34)) {
				Static304.method4498(arg0 + Static430.aClass257_37.method5699(Static456.anInt7118));
				return;
			}
			if (Static61.aStringArray3[local40] != null) {
				local82 = Static69.method1531(Static61.aStringArray3[local40]);
				if (local82 != null && local82.equals(local34)) {
					Static304.method4498(arg0 + Static430.aClass257_37.method5699(Static456.anInt7118));
					return;
				}
			}
		}
		for (@Pc(125) int local125 = 0; local125 < Static453.anInt6954; local125++) {
			local82 = Static69.method1531(Static501.aStringArray34[local125]);
			if (local82 != null && local82.equals(local34)) {
				Static304.method4498(Static430.aClass257_42.method5699(Static456.anInt7118) + arg0 + Static430.aClass257_43.method5699(Static456.anInt7118));
				return;
			}
			if (Static166.aStringArray15[local125] != null) {
				@Pc(174) String local174 = Static69.method1531(Static166.aStringArray15[local125]);
				if (local174 != null && local174.equals(local34)) {
					Static304.method4498(Static430.aClass257_42.method5699(Static456.anInt7118) + arg0 + Static430.aClass257_43.method5699(Static456.anInt7118));
					return;
				}
			}
		}
		if (Static69.method1531(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4).equals(local34)) {
			Static304.method4498(Static430.aClass257_40.method5699(Static456.anInt7118));
			return;
		}
		@Pc(238) Class292 local238 = Static631.method8307();
		@Pc(244) Class3_Sub29 local244 = Static507.method6901(Static691.aClass144_107, local238.aClass88_2);
		local244.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(arg0));
		local244.aClass3_Sub2_Sub1_1.method2073(arg0);
		local238.method6855(local244);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)[Lclient!lea;")
	public static Class223[] method7024() {
		return new Class223[] { Static530.aClass223_10, Static334.aClass223_7, Static57.aClass223_1 };
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII[[[BIIILclient!ha;III)V")
	public static void method7025(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class22 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg11 == 0 || arg7 == 0) {
			return;
		}
		if (arg11 == 9) {
			arg2 = arg2 + 1 & 0x3;
			arg11 = 1;
		}
		if (arg11 == 10) {
			arg11 = 1;
			arg2 = arg2 + 3 & 0x3;
		}
		if (arg11 == 11) {
			arg11 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg8.Q(arg5, arg6, arg3, arg10, arg9, arg0, arg4[arg11 - 1][arg2], arg7, arg1);
	}
}
