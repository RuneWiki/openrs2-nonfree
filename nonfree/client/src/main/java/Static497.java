import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!uo", name = "L", descriptor = "Lclient!fba;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "Lclient!kr;")
	public static Class171 aClass171_147;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
	public static int anInt8187 = 500;

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "Lclient!im;")
	public static final Class140 aClass140_138 = new Class140(75, -2);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qa;Lclient!ra;IIZII)V")
	public static void method6752(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg4) {
			Static136.aClass2_17.method7364((Static83.anInt1567 - Static136.aClass2_17.EA()) / 2, (Static350.anInt6255 - Static136.aClass2_17.ma()) / 2);
			Static146.aClass2_18.method7364((Static83.anInt1567 - Static146.aClass2_18.EA()) / 2, 18);
		}
		@Pc(31) String local31 = "";
		if (Static442.aClass101_3 == Static304.aClass101_1) {
			local31 = Static90.aClass306_26.method7165(Static179.anInt3168);
		} else if (Static542.aClass101_4 == Static304.aClass101_1) {
			local31 = Static282.aClass306_114.method7165(Static179.anInt3168);
		}
		arg1.method7489(arg2, -1, Static350.anInt6255 / 2 - 26, Static83.anInt1567 / 2, local31);
		@Pc(69) int local69 = Static350.anInt6255 / 2 - 18;
		arg0.method7282(Static83.anInt1567 / 2 - 152, local69, 304, 34, arg3, 0);
		arg0.method7282(Static83.anInt1567 / 2 - 151, local69 + 1, 302, 32, 0, 0);
		arg0.f(Static83.anInt1567 / 2 - 150, local69 + 2, Static227.anInt4490 * 3, 30, arg5, 0);
		arg0.f(Static227.anInt4490 * 3 + Static83.anInt1567 / 2 - 150, local69 - -2, 300 - Static227.anInt4490 * 3, 30, 0, 0);
		arg1.method7489(arg2, -1, Static350.anInt6255 / 2 + 4, Static83.anInt1567 / 2, Static304.aString50);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIIIIII)V")
	public static void method6755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg2 < 0 || arg0 >= Static459.anInt7799 - 1 || arg2 >= Static482.anInt7990 - 1) {
			return;
		}
		if (Static242.aClass255ArrayArrayArray2 == null) {
			return;
		}
		@Pc(65) Interface18 local65;
		if (arg6 != 0) {
			if (arg6 != 1) {
				if (arg6 == 2) {
					local65 = (Interface18) Static156.method2467(arg4, arg0, arg2, vaa.class);
					if (local65 != null) {
						if (arg5 == 11) {
							arg5 = 10;
						}
						if (!(local65 instanceof Class49_Sub2_Sub6)) {
							Static443.method6359(arg1, arg3, arg5, local65.method7467(), arg6, arg0, arg4, arg2);
							return;
						}
						((Class49_Sub2_Sub6) local65).aClass80_3.method1897(arg1);
						return;
					}
				} else if (arg6 == 3) {
					local65 = (Interface18) Static117.method1983(arg4, arg0, arg2);
					if (local65 == null) {
						return;
					}
					if (!(local65 instanceof Class49_Sub5_Sub1)) {
						Static443.method6359(arg1, arg3, arg5, local65.method7467(), arg6, arg0, arg4, arg2);
						return;
					}
					((Class49_Sub5_Sub1) local65).aClass80_2.method1897(arg1);
				} else {
					return;
				}
				return;
			}
			local65 = (Interface18) Static53.method1029(arg4, arg0, arg2);
			if (local65 != null) {
				if (local65 instanceof Class49_Sub3_Sub2) {
					((Class49_Sub3_Sub2) local65).aClass80_1.method1897(arg1);
					return;
				}
				@Pc(153) int local153 = local65.method7467();
				if (arg5 == 4 || arg5 == 5) {
					Static443.method6359(arg1, arg3, 4, local153, arg6, arg0, arg4, arg2);
					return;
				}
				if (arg5 == 6) {
					Static443.method6359(arg1, arg3 + 4, 4, local153, arg6, arg0, arg4, arg2);
					return;
				}
				if (arg5 == 7) {
					Static443.method6359(arg1, (arg3 + 2 & 0x3) + 4, 4, local153, arg6, arg0, arg4, arg2);
					return;
				}
				if (arg5 == 8) {
					Static443.method6359(arg1, arg3 + 4, 4, local153, arg6, arg0, arg4, arg2);
					Static443.method6359(arg1, (arg3 + 2 & 0x3) + 4, 4, local153, arg6, arg0, arg4, arg2);
					return;
				}
			}
			return;
		}
		local65 = (Interface18) Static453.method6441(arg4, arg0, arg2);
		@Pc(260) Interface18 local260 = (Interface18) Static291.method4698(arg4, arg0, arg2);
		if (local65 != null && arg5 != 2) {
			if (local65 instanceof Class49_Sub1_Sub3) {
				((Class49_Sub1_Sub3) local65).aClass80_4.method1897(arg1);
			} else {
				Static443.method6359(arg1, arg3, arg5, local65.method7467(), arg6, arg0, arg4, arg2);
			}
		}
		if (local260 == null) {
			return;
		}
		if (!(local260 instanceof Class49_Sub1_Sub3)) {
			Static443.method6359(arg1, arg3, arg5, local260.method7467(), arg6, arg0, arg4, arg2);
			return;
		}
		((Class49_Sub1_Sub3) local260).aClass80_4.method1897(arg1);
		return;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method6756(@OriginalArg(0) Class122 arg0) {
		if (Static541.aBoolean640) {
			Static283.method4574(arg0);
		} else {
			Static491.method6718(arg0);
		}
	}
}
