import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	public static int anInt2335;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_15 = new Class220(32);

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Lclient!vh;")
	public static final Class253 aClass253_1 = new Class253(2);

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
	public static final int[] anIntArray237 = new int[13];

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "Lclient!bg;")
	private static final Class25 aClass25_36 = new Class25(49, 7);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ha;I)Lclient!pn;")
	public static Class114_Sub4 method2143(@OriginalArg(0) Class6_Sub15 arg0) {
		return new Class114_Sub4(arg0.method3103(), arg0.method3103(), arg0.method3103(), arg0.method3103(), arg0.method3078(), arg0.method3078(), arg0.method3111());
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ro;III)V")
	public static void method2145(@OriginalArg(0) Class6_Sub33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || Static307.aClass88_23.aClass6_73 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt5951;
		@Pc(18) int local18 = arg0.anInt5956;
		@Pc(21) int local21 = arg0.anInt5954;
		@Pc(25) int local25 = (int) arg0.aLong176;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong176;
		@Pc(43) Class3_Sub3_Sub6_Sub1 local43;
		if (local21 == 6) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static133.anInt2347 = 0;
				Static12.anInt190 = arg1;
				Static257.anInt4382 = arg2;
				Static80.anInt1571 = 2;
				Static298.method4373(Static265.aClass25_70);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3117(local25);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 49) {
			Static12.anInt190 = arg1;
			Static257.anInt4382 = arg2;
			Static133.anInt2347 = 0;
			Static80.anInt1571 = 2;
			Static298.method4373(Static413.aClass25_108);
			Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3117(Static206.anInt3592 + local15);
			Static449.aClass6_Sub15_Sub1_2.method3100((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static449.aClass6_Sub15_Sub1_2.method3106(Static99.anInt1814 + local18);
			Static139.method3084(local18, local15, local34);
		}
		if (local21 == 46) {
			Static257.anInt4382 = arg2;
			Static12.anInt190 = arg1;
			Static80.anInt1571 = 2;
			Static133.anInt2347 = 0;
			Static298.method4373(Static262.aClass25_68);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3117(local15 + Static206.anInt3592);
			Static449.aClass6_Sub15_Sub1_2.method3117((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static449.aClass6_Sub15_Sub1_2.method3100(Static99.anInt1814 + local18);
			Static139.method3084(local18, local15, local34);
		}
		if (local21 == 50) {
			Static257.anInt4382 = arg2;
			Static133.anInt2347 = 0;
			Static12.anInt190 = arg1;
			Static80.anInt1571 = 2;
			Static298.method4373(Static444.aClass25_110);
			Static449.aClass6_Sub15_Sub1_2.method3136(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3117(local15 + Static206.anInt3592);
			Static449.aClass6_Sub15_Sub1_2.method3117(local18 + Static99.anInt1814);
			Static449.aClass6_Sub15_Sub1_2.method3121(Static391.anInt2016);
			Static449.aClass6_Sub15_Sub1_2.method3100(Static365.anInt3369);
			Static449.aClass6_Sub15_Sub1_2.method3117(Static321.anInt5236);
			Static139.method3084(local18, local15, local34);
		}
		if (local21 == 11) {
			if (Static221.anInt3810 > 0 && Static326.aClass86_1.method1867(82) && Static326.aClass86_1.method1867(81)) {
				Static54.method1012(local15 + Static206.anInt3592, local18 + Static99.anInt1814, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93);
			} else {
				Static257.anInt4382 = arg2;
				Static133.anInt2347 = 0;
				Static80.anInt1571 = 1;
				Static12.anInt190 = arg1;
				Static298.method4373(Static352.aClass25_94);
				Static449.aClass6_Sub15_Sub1_2.method3100(Static99.anInt1814 + local18);
				Static449.aClass6_Sub15_Sub1_2.method3136(Static206.anInt3592 + local15);
			}
		}
		if (local21 == 60) {
			Static12.anInt190 = arg1;
			Static80.anInt1571 = 2;
			Static133.anInt2347 = 0;
			Static257.anInt4382 = arg2;
			Static298.method4373(Static377.aClass25_105);
			Static449.aClass6_Sub15_Sub1_2.method3136(local18 + Static99.anInt1814);
			Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3100(local25);
			Static449.aClass6_Sub15_Sub1_2.method3106(Static206.anInt3592 + local15);
			Static286.method4277(local18, local15);
		}
		if (local21 == 1008) {
			Static80.anInt1571 = 2;
			Static133.anInt2347 = 0;
			Static257.anInt4382 = arg2;
			Static12.anInt190 = arg1;
			Static298.method4373(Static447.aClass25_119);
			Static449.aClass6_Sub15_Sub1_2.method3100(local25);
		}
		if (local21 == 23) {
			Static12.anInt190 = arg1;
			Static133.anInt2347 = 0;
			Static80.anInt1571 = 2;
			Static257.anInt4382 = arg2;
			Static298.method4373(Static11.aClass25_8);
			Static449.aClass6_Sub15_Sub1_2.method3100(Static99.anInt1814 + local18);
			Static449.aClass6_Sub15_Sub1_2.method3100(Static206.anInt3592 + local15);
			Static449.aClass6_Sub15_Sub1_2.method3106((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static139.method3084(local18, local15, local34);
		}
		if (local21 == 58) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static133.anInt2347 = 0;
				Static80.anInt1571 = 2;
				Static257.anInt4382 = arg2;
				Static12.anInt190 = arg1;
				Static298.method4373(Static244.aClass25_60);
				Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3106(local25);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 9) {
			Static257.anInt4382 = arg2;
			Static133.anInt2347 = 0;
			Static12.anInt190 = arg1;
			Static80.anInt1571 = 2;
			Static298.method4373(Static230.aClass25_58);
			Static449.aClass6_Sub15_Sub1_2.method3117(local15 + Static206.anInt3592);
			Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3117(Static99.anInt1814 + local18);
			Static449.aClass6_Sub15_Sub1_2.method3100(local25);
			Static286.method4277(local18, local15);
		}
		if (local21 == 51) {
			Static80.anInt1571 = 2;
			Static133.anInt2347 = 0;
			Static257.anInt4382 = arg2;
			Static12.anInt190 = arg1;
			Static298.method4373(Static406.aClass25_107);
			Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3117(local18 + Static99.anInt1814);
			Static449.aClass6_Sub15_Sub1_2.method3100(local15 + Static206.anInt3592);
			Static449.aClass6_Sub15_Sub1_2.method3117(local25);
			Static286.method4277(local18, local15);
		}
		@Pc(657) Class3_Sub3_Sub6_Sub2 local657;
		if (local21 == 1011) {
			Static257.anInt4382 = arg2;
			Static80.anInt1571 = 2;
			Static12.anInt190 = arg1;
			Static133.anInt2347 = 0;
			local657 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local25];
			if (local657 != null) {
				@Pc(662) Class17 local662 = local657.aClass17_1;
				if (local662.anIntArray26 != null) {
					local662 = local662.method288(Static71.aClass126_1);
				}
				if (local662 != null) {
					Static298.method4373(Static273.aClass25_72);
					Static449.aClass6_Sub15_Sub1_2.method3100(local662.anInt345);
				}
			}
		}
		if (local21 == 17) {
			Static80.anInt1571 = 2;
			Static12.anInt190 = arg1;
			Static257.anInt4382 = arg2;
			Static133.anInt2347 = 0;
			Static298.method4373(Static28.aClass25_11);
			Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3100(local15 + Static206.anInt3592);
			Static449.aClass6_Sub15_Sub1_2.method3100(Static99.anInt1814 + local18);
			Static449.aClass6_Sub15_Sub1_2.method3106(local25);
			Static286.method4277(local18, local15);
		}
		if (local21 == 18 || local21 == 1007) {
			Static401.method5466(local15, local18, arg0.aString52, local25);
		}
		if (local21 == 45) {
			local657 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local25];
			if (local657 != null) {
				Static80.anInt1571 = 2;
				Static257.anInt4382 = arg2;
				Static133.anInt2347 = 0;
				Static12.anInt190 = arg1;
				Static298.method4373(Static150.aClass25_41);
				Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3106(local25);
				Static367.method5800(local657.method5512(), true, local657.method5512(), -2, local657.anIntArray582[0], local657.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 10) {
			local657 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local25];
			if (local657 != null) {
				Static257.anInt4382 = arg2;
				Static80.anInt1571 = 2;
				Static12.anInt190 = arg1;
				Static133.anInt2347 = 0;
				Static298.method4373(Static153.aClass25_42);
				Static449.aClass6_Sub15_Sub1_2.method3136(local25);
				Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local657.method5512(), true, local657.method5512(), -2, local657.anIntArray582[0], local657.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 19) {
			Static12.anInt190 = arg1;
			Static257.anInt4382 = arg2;
			Static133.anInt2347 = 0;
			Static80.anInt1571 = 2;
			Static298.method4373(Static73.aClass25_19);
			Static449.aClass6_Sub15_Sub1_2.method3106(Static365.anInt3369);
			Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3113(Static391.anInt2016);
			Static449.aClass6_Sub15_Sub1_2.method3117(Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6731);
			Static449.aClass6_Sub15_Sub1_2.method3106(Static321.anInt5236);
		}
		if (local21 == 30) {
			local657 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local25];
			if (local657 != null) {
				Static12.anInt190 = arg1;
				Static80.anInt1571 = 2;
				Static133.anInt2347 = 0;
				Static257.anInt4382 = arg2;
				Static298.method4373(Static52.aClass25_16);
				Static449.aClass6_Sub15_Sub1_2.method3100(local25);
				Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local657.method5512(), true, local657.method5512(), -2, local657.anIntArray582[0], local657.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 59) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static133.anInt2347 = 0;
				Static12.anInt190 = arg1;
				Static257.anInt4382 = arg2;
				Static80.anInt1571 = 2;
				Static298.method4373(Static221.aClass25_56);
				Static449.aClass6_Sub15_Sub1_2.method3106(local25);
				Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 21) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static12.anInt190 = arg1;
				Static133.anInt2347 = 0;
				Static80.anInt1571 = 2;
				Static257.anInt4382 = arg2;
				Static298.method4373(Static288.aClass25_76);
				Static449.aClass6_Sub15_Sub1_2.method3106(local25);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 13) {
			if (Static221.anInt3810 > 0 && Static326.aClass86_1.method1867(82) && Static326.aClass86_1.method1867(81)) {
				Static54.method1012(Static206.anInt3592 + local15, local18 + Static99.anInt1814, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93);
			} else {
				Static182.method2838(local15, local18, local25);
				if (local25 == 1) {
					Static449.aClass6_Sub15_Sub1_2.method3075(-1);
					Static449.aClass6_Sub15_Sub1_2.method3075(-1);
					Static449.aClass6_Sub15_Sub1_2.method3100((int) Static397.aFloat99);
					Static449.aClass6_Sub15_Sub1_2.method3075(57);
					Static449.aClass6_Sub15_Sub1_2.method3075(Static71.anInt1484);
					Static449.aClass6_Sub15_Sub1_2.method3075(Static393.anInt5623);
					Static449.aClass6_Sub15_Sub1_2.method3075(89);
					Static449.aClass6_Sub15_Sub1_2.method3100(Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675);
					Static449.aClass6_Sub15_Sub1_2.method3100(Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677);
					Static449.aClass6_Sub15_Sub1_2.method3075(63);
				} else {
					Static133.anInt2347 = 0;
					Static80.anInt1571 = 1;
					Static12.anInt190 = arg1;
					Static257.anInt4382 = arg2;
				}
				Static367.method5800(1, true, 1, -4, local15, local18, 0, 0);
			}
		}
		if (local21 == 1006) {
			Static12.anInt190 = arg1;
			Static257.anInt4382 = arg2;
			Static133.anInt2347 = 0;
			Static80.anInt1571 = 2;
			Static298.method4373(aClass25_36);
			Static449.aClass6_Sub15_Sub1_2.method3100(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3100(local15 + Static206.anInt3592);
			Static449.aClass6_Sub15_Sub1_2.method3117(local18 + Static99.anInt1814);
			Static139.method3084(local18, local15, local34);
		}
		if (local21 == 1010 || local21 == 1003 || local21 == 1002 || local21 == 1004 || local21 == 1001) {
			Static392.method5391(local21, local15, local25);
		}
		@Pc(1320) Class239 local1320;
		if (local21 == 48) {
			local1320 = Static316.method5795(local15, local18);
			if (local1320 != null) {
				Static361.method5113(local1320);
			}
		}
		if (local21 == 20) {
			Static257.anInt4382 = arg2;
			Static80.anInt1571 = 1;
			Static133.anInt2347 = 0;
			Static12.anInt190 = arg1;
			Static298.method4373(Static45.aClass25_14);
			Static449.aClass6_Sub15_Sub1_2.method3136(Static206.anInt3592 + local15);
			Static449.aClass6_Sub15_Sub1_2.method3136(Static99.anInt1814 + local18);
			Static449.aClass6_Sub15_Sub1_2.method3106(Static321.anInt5236);
			Static449.aClass6_Sub15_Sub1_2.method3136(Static365.anInt3369);
			Static449.aClass6_Sub15_Sub1_2.method3120(Static391.anInt2016);
			Static367.method5800(1, true, 1, -4, local15, local18, 0, 0);
		}
		if (local21 == 1009) {
			Static257.anInt4382 = arg2;
			Static80.anInt1571 = 2;
			Static12.anInt190 = arg1;
			Static133.anInt2347 = 0;
			Static298.method4373(Static448.aClass25_120);
			Static449.aClass6_Sub15_Sub1_2.method3100(local25);
		}
		if (local21 == 16) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static133.anInt2347 = 0;
				Static257.anInt4382 = arg2;
				Static80.anInt1571 = 2;
				Static12.anInt190 = arg1;
				Static298.method4373(Static58.aClass25_18);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3136(local25);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 22) {
			local657 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local25];
			if (local657 != null) {
				Static133.anInt2347 = 0;
				Static80.anInt1571 = 2;
				Static12.anInt190 = arg1;
				Static257.anInt4382 = arg2;
				Static298.method4373(Static448.aClass25_121);
				Static449.aClass6_Sub15_Sub1_2.method3136(local25);
				Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local657.method5512(), true, local657.method5512(), -2, local657.anIntArray582[0], local657.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 8) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static257.anInt4382 = arg2;
				Static80.anInt1571 = 2;
				Static12.anInt190 = arg1;
				Static133.anInt2347 = 0;
				Static298.method4373(Static307.aClass25_32);
				Static449.aClass6_Sub15_Sub1_2.method3100(local25);
				Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 15) {
			local1320 = Static316.method5795(local15, local18);
			if (local1320 != null) {
				Static12.method160();
				@Pc(1614) Class6_Sub30 local1614 = Static54.method1017(local1320);
				Static270.method4109(local1614.anInt5763, local1320, local1614.method4842());
				Static26.aString21 = Static4.method30(local1320);
				if (Static26.aString21 == null) {
					Static26.aString21 = "Null";
				}
				Static263.aString38 = local1320.aString56 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 57) {
			Static133.anInt2347 = 0;
			Static80.anInt1571 = 2;
			Static12.anInt190 = arg1;
			Static257.anInt4382 = arg2;
			Static298.method4373(Static253.aClass25_62);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3136(Static206.anInt3592 + local15);
			Static449.aClass6_Sub15_Sub1_2.method3106(Static321.anInt5236);
			Static449.aClass6_Sub15_Sub1_2.method3106(local18 + Static99.anInt1814);
			Static449.aClass6_Sub15_Sub1_2.method3113(Static391.anInt2016);
			Static449.aClass6_Sub15_Sub1_2.method3117(local25);
			Static449.aClass6_Sub15_Sub1_2.method3136(Static365.anInt3369);
			Static286.method4277(local18, local15);
		}
		if (local21 == 2) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static257.anInt4382 = arg2;
				Static133.anInt2347 = 0;
				Static80.anInt1571 = 2;
				Static12.anInt190 = arg1;
				Static298.method4373(Static73.aClass25_19);
				Static449.aClass6_Sub15_Sub1_2.method3106(Static365.anInt3369);
				Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3113(Static391.anInt2016);
				Static449.aClass6_Sub15_Sub1_2.method3117(local25);
				Static449.aClass6_Sub15_Sub1_2.method3106(Static321.anInt5236);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 12) {
			Static80.anInt1571 = 2;
			Static257.anInt4382 = arg2;
			Static12.anInt190 = arg1;
			Static133.anInt2347 = 0;
			Static298.method4373(Static92.aClass25_22);
			Static449.aClass6_Sub15_Sub1_2.method3117(Static99.anInt1814 + local18);
			Static449.aClass6_Sub15_Sub1_2.method3117(Static206.anInt3592 + local15);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static449.aClass6_Sub15_Sub1_2.method3136(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static139.method3084(local18, local15, local34);
		}
		if (local21 == 4) {
			Static257.anInt4382 = arg2;
			Static80.anInt1571 = 2;
			Static133.anInt2347 = 0;
			Static12.anInt190 = arg1;
			Static298.method4373(Static424.aClass25_6);
			Static449.aClass6_Sub15_Sub1_2.method3100(local15 + Static206.anInt3592);
			Static449.aClass6_Sub15_Sub1_2.method3100(local25);
			Static449.aClass6_Sub15_Sub1_2.method3106(Static99.anInt1814 + local18);
			Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
			Static286.method4277(local18, local15);
		}
		if (local21 == 3 && Static46.aClass239_13 == null) {
			Static116.method1892(local18, local15);
			Static46.aClass239_13 = Static316.method5795(local15, local18);
			Static354.method4992(Static46.aClass239_13);
		}
		if (local21 == 47) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static257.anInt4382 = arg2;
				Static12.anInt190 = arg1;
				Static133.anInt2347 = 0;
				Static80.anInt1571 = 2;
				Static298.method4373(Static313.aClass25_82);
				Static449.aClass6_Sub15_Sub1_2.method3117(local25);
				Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 25) {
			local43 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local25];
			if (local43 != null) {
				Static80.anInt1571 = 2;
				Static12.anInt190 = arg1;
				Static257.anInt4382 = arg2;
				Static133.anInt2347 = 0;
				Static298.method4373(Static225.aClass25_57);
				Static449.aClass6_Sub15_Sub1_2.method3079(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3117(local25);
				Static367.method5800(local43.method5512(), true, local43.method5512(), -2, local43.anIntArray582[0], local43.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 5) {
			local657 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local25];
			if (local657 != null) {
				Static80.anInt1571 = 2;
				Static12.anInt190 = arg1;
				Static133.anInt2347 = 0;
				Static257.anInt4382 = arg2;
				Static298.method4373(Static443.aClass25_117);
				Static449.aClass6_Sub15_Sub1_2.method3136(Static365.anInt3369);
				Static449.aClass6_Sub15_Sub1_2.method3117(Static321.anInt5236);
				Static449.aClass6_Sub15_Sub1_2.method3100(local25);
				Static449.aClass6_Sub15_Sub1_2.method3120(Static391.anInt2016);
				Static449.aClass6_Sub15_Sub1_2.method3122(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static367.method5800(local657.method5512(), true, local657.method5512(), -2, local657.anIntArray582[0], local657.anIntArray583[0], 0, 0);
			}
		}
		if (local21 == 44) {
			local657 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local25];
			if (local657 != null) {
				Static133.anInt2347 = 0;
				Static80.anInt1571 = 2;
				Static257.anInt4382 = arg2;
				Static12.anInt190 = arg1;
				Static298.method4373(Static45.aClass25_15);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static326.aClass86_1.method1867(82) ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3106(local25);
				Static367.method5800(local657.method5512(), true, local657.method5512(), -2, local657.anIntArray582[0], local657.anIntArray583[0], 0, 0);
			}
		}
		if (Static274.aBoolean336) {
			Static12.method160();
		}
		if (Static96.aClass239_4 != null && Static38.anInt863 == 0) {
			Static354.method4992(Static96.aClass239_4);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method2146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg2 > 0 && !Static220.method3379(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static220.method3379(arg4)) {
			@Pc(47) int local47 = 0;
			@Pc(54) int local54 = arg2 < arg4 ? arg2 : arg4;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(66) int local66 = arg4 >> 1;
			@Pc(68) int[] local68 = arg5;
			@Pc(73) int[] local73 = new int[local62 * local66];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local47, arg0, arg2, arg4, 0, 32993, arg3, local68, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg2;
				for (@Pc(100) int local100 = 0; local100 < local66; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local62; local104++) {
						@Pc(111) int local111 = local68[local94++];
						@Pc(116) int local116 = local68[local98++];
						@Pc(121) int local121 = local68[local94++];
						@Pc(127) int local127 = local111 >> 24 & 0xFF;
						@Pc(133) int local133 = local111 >> 8 & 0xFF;
						@Pc(137) int local137 = local111 & 0xFF;
						@Pc(142) int local142 = local68[local98++];
						@Pc(148) int local148 = local111 >> 16 & 0xFF;
						@Pc(156) int local156 = local127 + (local121 >> 24 & 0xFF);
						@Pc(164) int local164 = local133 + (local121 >> 8 & 0xFF);
						@Pc(170) int local170 = local137 + (local121 & 0xFF);
						@Pc(178) int local178 = local148 + (local121 >> 16 & 0xFF);
						@Pc(186) int local186 = local156 + (local116 >> 24 & 0xFF);
						@Pc(192) int local192 = local170 + (local116 & 0xFF);
						@Pc(200) int local200 = local164 + (local116 >> 8 & 0xFF);
						@Pc(208) int local208 = local178 + (local116 >> 16 & 0xFF);
						@Pc(214) int local214 = local192 + (local142 & 0xFF);
						@Pc(222) int local222 = local200 + (local142 >> 8 & 0xFF);
						@Pc(230) int local230 = local208 + (local142 >> 16 & 0xFF);
						@Pc(238) int local238 = local186 + (local142 >> 24 & 0xFF);
						local73[local92++] = local214 >> 2 & 0xFF | (local238 & 0x3FC) << 22 | (local230 & 0x3FC) << 14 | (local222 & 0x3FC) << 6;
					}
					local94 += arg2;
					local98 += arg2;
				}
				@Pc(287) int[] local287 = local73;
				local73 = local68;
				arg4 = local66;
				local68 = local287;
				arg2 = local62;
				local47++;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local66 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
