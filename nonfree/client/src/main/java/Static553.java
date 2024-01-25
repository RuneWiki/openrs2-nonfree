import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_163 = new Class73(23, 0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!f;IIIIILclient!ha;IIIII)V")
	public static void method7738(@OriginalArg(0) Class6_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg5 < arg2 && arg2 < arg5 + arg9 && arg4 > arg7 - 13 && arg4 < arg7 + 3) {
			arg1 = arg8;
		}
		@Pc(31) String local31 = Static45.method8618(arg0);
		Static537.aClass34_12.method8600(arg7, Static92.anIntArray89, local31, arg1, arg5 + 3, Static388.aClass4Array10);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLjava/lang/String;IZ)V")
	public static void method7740(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		Static119.method2560();
		if (arg1 == 0) {
			Static467.aClass5_13 = Static635.method8714(Static87.aClass6_Sub33_6.aClass14_Sub23_2.method7320() * 2, Static428.aCanvas12, Static295.anInterface7_9, 0, Static382.aClass223_83);
			if (arg0 != null) {
				Static467.aClass5_13.GA(0);
				@Pc(35) Class213 local35 = Static198.method3584(Static473.anInt8397, Static74.aClass223_31);
				@Pc(44) Class34 local44 = Static467.aClass5_13.method6167(local35, Static655.method7887(Static436.aClass223_98, Static473.anInt8397));
				Static465.method6954();
				Static52.method1637(local35, local44, true, Static467.aClass5_13, arg0);
			}
		} else {
			@Pc(57) Class5 local57 = null;
			@Pc(87) Class34 local87;
			if (arg0 != null) {
				local57 = Static635.method8714(0, Static428.aCanvas12, Static295.anInterface7_9, 0, Static382.aClass223_83);
				local57.GA(0);
				@Pc(78) Class213 local78 = Static198.method3584(Static473.anInt8397, Static74.aClass223_31);
				local87 = local57.method6167(local78, Static655.method7887(Static436.aClass223_98, Static473.anInt8397));
				Static465.method6954();
				Static52.method1637(local78, local87, true, local57, arg0);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static467.aClass5_13 = Static635.method8714(Static87.aClass6_Sub33_6.aClass14_Sub23_2.method7320() * 2, Static428.aCanvas12, Static295.anInterface7_9, arg1, Static382.aClass223_83);
					if (arg0 != null) {
						local57.GA(0);
						@Pc(120) Class213 local120 = Static198.method3584(Static473.anInt8397, Static74.aClass223_31);
						@Pc(129) Class34 local129 = local57.method6167(local120, Static655.method7887(Static436.aClass223_98, Static473.anInt8397));
						Static465.method6954();
						Static52.method1637(local120, local129, true, local57, arg0);
					}
					if (Static467.aClass5_13.method6187()) {
						@Pc(143) boolean local143 = true;
						try {
							local143 = Static18.aClass6_Sub38_1.anInt7891 > 256;
						} catch (@Pc(153) Throwable local153) {
						}
						@Pc(159) Class6_Sub16 local159;
						if (local143) {
							local159 = Static467.aClass5_13.method6125(146800640);
						} else {
							local159 = Static467.aClass5_13.method6125(104857600);
						}
						Static467.aClass5_13.method6171(local159);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(170) Throwable local170) {
					@Pc(175) int local175 = Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640();
					if (local175 == 2) {
						Static398.aBoolean584 = true;
					}
					Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub8_1);
					method7740(arg0, local175, arg2);
					@Pc(194) Object local194 = null;
					var14 = false;
				} finally {
					if (var14) {
						local87 = null;
						if (local57 != null) {
							try {
								local57.method6106();
							} catch (@Pc(349) Throwable local349) {
							}
						}
					}
				}
				if (local57 != null) {
					try {
						local57.method6106();
					} catch (@Pc(329) Throwable local329) {
					}
				}
				return;
			}
			local87 = null;
			if (local57 != null) {
				try {
					local57.method6106();
				} catch (@Pc(339) Throwable local339) {
				}
			}
		}
		Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2639(!arg2);
		Static87.aClass6_Sub33_6.method4996(arg1, Static87.aClass6_Sub33_6.aClass14_Sub8_1);
		Static77.method5031();
		Static467.aClass5_13.method6161();
		Static467.aClass5_13.X(32);
		Static469.aClass115_8 = Static467.aClass5_13.method6184();
		Static267.aClass115_2 = Static467.aClass5_13.method6184();
		Static537.method7608();
		Static467.aClass5_13.method6112(Static87.aClass6_Sub33_6.aClass14_Sub9_1.method2803() == 1);
		if (Static467.aClass5_13.method6130()) {
			Static157.method3090(Static87.aClass6_Sub33_6.aClass14_Sub5_1.method2299() == 1);
		}
		Static299.method5102(Static306.anInt6176 >> 3, Static108.anInt2930 >> 3, Static467.aClass5_13);
		Static638.method8737();
		Static68.aBoolean183 = true;
		Static131.aClass273Array1 = null;
		Static406.aBoolean589 = false;
		Static409.method6426();
	}
}
