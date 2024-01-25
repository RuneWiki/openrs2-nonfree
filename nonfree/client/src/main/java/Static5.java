import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!lh;")
	public static final Class194 aClass194_1 = new Class194("LOCAL", 4);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method172() {
		for (@Pc(3) int local3 = 0; local3 < Static241.anInt4871; local3++) {
			@Pc(9) int local9 = Static150.anIntArray197[local3];
			@Pc(17) Class4_Sub1_Sub1_Sub1 local17 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) local9)).aClass4_Sub1_Sub1_Sub1_2;
			@Pc(21) int local21 = Static282.aClass6_Sub21_Sub2_1.method6069();
			if ((local21 & 0x2) != 0) {
				local21 += Static282.aClass6_Sub21_Sub2_1.method6069() << 8;
			}
			@Pc(44) int local44;
			@Pc(57) int local57;
			@Pc(61) int local61;
			if ((local21 & 0x100) != 0) {
				local44 = Static282.aClass6_Sub21_Sub2_1.method6026();
				if (local44 == 65535) {
					local44 = -1;
				}
				local57 = Static282.aClass6_Sub21_Sub2_1.method6012();
				local61 = Static282.aClass6_Sub21_Sub2_1.method6035();
				local17.method5898(local61, local57, local44, true);
			}
			if ((local21 & 0x400) != 0) {
				local44 = Static282.aClass6_Sub21_Sub2_1.method6068();
				local17.anInt7131 = Static282.aClass6_Sub21_Sub2_1.method6040();
				local17.anInt7063 = Static282.aClass6_Sub21_Sub2_1.method6048();
				local17.aBoolean494 = (local44 & 0x8000) != 0;
				local17.anInt7094 = local44 & 0x7FFF;
				local17.anInt7113 = local17.anInt7131 + local17.anInt7094 + Static312.anInt5688;
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt7091 = Static282.aClass6_Sub21_Sub2_1.method6038();
				local17.anInt7086 = Static282.aClass6_Sub21_Sub2_1.method6059();
				local17.anInt7076 = Static282.aClass6_Sub21_Sub2_1.method6038();
				local17.anInt7057 = Static282.aClass6_Sub21_Sub2_1.method6059();
				local17.anInt7105 = Static282.aClass6_Sub21_Sub2_1.method6003() + Static312.anInt5688;
				local17.anInt7084 = Static282.aClass6_Sub21_Sub2_1.method6003() + Static312.anInt5688;
				local17.anInt7056 = Static282.aClass6_Sub21_Sub2_1.method6048();
				local17.anInt7076 += local17.anIntArray521[0];
				local17.anInt7133 = 0;
				local17.anInt7132 = 1;
				local17.anInt7057 += local17.anIntArray522[0];
				local17.anInt7086 += local17.anIntArray522[0];
				local17.anInt7091 += local17.anIntArray521[0];
			}
			if ((local21 & 0x1000) != 0) {
				local17.aByte66 = Static282.aClass6_Sub21_Sub2_1.method6067();
				local17.aByte63 = Static282.aClass6_Sub21_Sub2_1.method6067();
				local17.aByte65 = Static282.aClass6_Sub21_Sub2_1.method6038();
				local17.aByte64 = (byte) Static282.aClass6_Sub21_Sub2_1.method6048();
				local17.anInt7125 = Static312.anInt5688 + Static282.aClass6_Sub21_Sub2_1.method6003();
				local17.anInt7078 = Static312.anInt5688 + Static282.aClass6_Sub21_Sub2_1.method6003();
			}
			if ((local21 & 0x200) != 0) {
				local44 = Static282.aClass6_Sub21_Sub2_1.method6048();
				@Pc(263) int[] local263 = new int[local44];
				@Pc(266) int[] local266 = new int[local44];
				@Pc(269) int[] local269 = new int[local44];
				for (@Pc(271) int local271 = 0; local271 < local44; local271++) {
					@Pc(277) int local277 = Static282.aClass6_Sub21_Sub2_1.method6026();
					if (local277 == 65535) {
						local277 = -1;
					}
					local263[local271] = local277;
					local266[local271] = Static282.aClass6_Sub21_Sub2_1.method6048();
					local269[local271] = Static282.aClass6_Sub21_Sub2_1.method6056();
				}
				Static262.method4393(local263, local17, local269, local266);
			}
			if ((local21 & 0x40) != 0) {
				@Pc(322) int[] local322 = new int[4];
				for (local57 = 0; local57 < 4; local57++) {
					local322[local57] = Static282.aClass6_Sub21_Sub2_1.method6026();
					if (local322[local57] == 65535) {
						local322[local57] = -1;
					}
				}
				local61 = Static282.aClass6_Sub21_Sub2_1.method6040();
				Static13.method6295(local322, local17, local61);
			}
			if ((local21 & 0x20) != 0) {
				local44 = Static282.aClass6_Sub21_Sub2_1.method6005();
				local57 = Static282.aClass6_Sub21_Sub2_1.method6048();
				local17.method5907(Static312.anInt5688, local57, local44);
				local17.anInt7073 = Static312.anInt5688 + 300;
				local17.anInt7068 = Static282.aClass6_Sub21_Sub2_1.method6040();
			}
			if ((local21 & 0x1) != 0) {
				if (local17.aClass273_1.method6161()) {
					Static105.method1888(local17);
				}
				local17.method152(Static577.aClass125_2.method3229(Static282.aClass6_Sub21_Sub2_1.method6056()));
				local17.method5905(local17.aClass273_1.anInt7439);
				local17.anInt7114 = local17.aClass273_1.anInt7451 << 3;
				if (local17.aClass273_1.method6161()) {
					Static588.method1990(null, local17.anIntArray521[0], local17, local17.aByte108, null, local17.anIntArray522[0], 0);
				}
			}
			if ((local21 & 0x4) != 0) {
				local17.anInt231 = Static282.aClass6_Sub21_Sub2_1.method6068();
				local17.anInt227 = Static282.aClass6_Sub21_Sub2_1.method6003();
			}
			if ((local21 & 0x10) != 0) {
				local44 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local57 = Static282.aClass6_Sub21_Sub2_1.method6066();
				if (local44 == 65535) {
					local44 = -1;
				}
				local61 = Static282.aClass6_Sub21_Sub2_1.method6040();
				local17.method5898(local61, local57, local44, false);
			}
			if ((local21 & 0x800) != 0) {
				local44 = Static282.aClass6_Sub21_Sub2_1.method6005();
				local57 = Static282.aClass6_Sub21_Sub2_1.method6040();
				local17.method5907(Static312.anInt5688, local57, local44);
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt7123 = Static282.aClass6_Sub21_Sub2_1.method6056();
				if (local17.anInt7123 == 65535) {
					local17.anInt7123 = -1;
				}
			}
			if ((local21 & 0x80) != 0) {
				local17.aString62 = Static282.aClass6_Sub21_Sub2_1.method6044();
				local17.anInt7119 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIII)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg0 < 0 || arg3 >= Static473.anInt8075 - 1 || Static165.anInt6749 - 1 <= arg0) {
			return;
		}
		if (Static270.aClass276ArrayArrayArray2 == null) {
			return;
		}
		@Pc(33) Interface18 local33;
		if (arg4 == 0) {
			local33 = (Interface18) Static162.method2962(arg6, arg3, arg0);
			@Pc(39) Interface18 local39 = (Interface18) Static342.method5296(arg6, arg3, arg0);
			if (local33 != null && arg2 != 2) {
				if (local33 instanceof Class4_Sub5_Sub1) {
					((Class4_Sub5_Sub1) local33).aClass16_3.method736(arg5);
				} else {
					Static552.method7484(arg3, arg2, arg0, local33.method6265(), arg4, arg5, arg6, arg1);
				}
			}
			if (local39 != null) {
				if (local39 instanceof Class4_Sub5_Sub1) {
					((Class4_Sub5_Sub1) local39).aClass16_3.method736(arg5);
				} else {
					Static552.method7484(arg3, arg2, arg0, local39.method6265(), arg4, arg5, arg6, arg1);
				}
			}
		} else if (arg4 == 1) {
			local33 = (Interface18) Static401.method5859(arg6, arg3, arg0);
			if (local33 != null) {
				if (local33 instanceof Class4_Sub2_Sub1) {
					((Class4_Sub2_Sub1) local33).aClass16_2.method736(arg5);
				} else {
					@Pc(217) int local217 = local33.method6265();
					if (arg2 == 4 || arg2 == 5) {
						Static552.method7484(arg3, 4, arg0, local217, arg4, arg5, arg6, arg1);
					} else if (arg2 == 6) {
						Static552.method7484(arg3, 4, arg0, local217, arg4, arg5, arg6, arg1 + 4);
					} else if (arg2 == 7) {
						Static552.method7484(arg3, 4, arg0, local217, arg4, arg5, arg6, (arg1 + 2 & 0x3) + 4);
					} else if (arg2 == 8) {
						Static552.method7484(arg3, 4, arg0, local217, arg4, arg5, arg6, arg1 + 4);
						Static552.method7484(arg3, 4, arg0, local217, arg4, arg5, arg6, (arg1 + 2 & 0x3) + 4);
					}
				}
			}
		} else if (arg4 == 2) {
			local33 = (Interface18) Static117.method2480(arg6, arg3, arg0, pba.class);
			if (local33 != null) {
				if (arg2 == 11) {
					arg2 = 10;
				}
				if (local33 instanceof Class4_Sub1_Sub2) {
					((Class4_Sub1_Sub2) local33).aClass16_1.method736(arg5);
				} else {
					Static552.method7484(arg3, arg2, arg0, local33.method6265(), arg4, arg5, arg6, arg1);
				}
			}
		} else if (arg4 == 3) {
			local33 = (Interface18) Static300.method4758(arg6, arg3, arg0);
			if (local33 != null) {
				if (local33 instanceof Class4_Sub3_Sub2) {
					((Class4_Sub3_Sub2) local33).aClass16_4.method736(arg5);
				} else {
					Static552.method7484(arg3, arg2, arg0, local33.method6265(), arg4, arg5, arg6, arg1);
				}
			}
		}
	}
}
