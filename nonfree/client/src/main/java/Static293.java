import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!go;")
	public static Class95 aClass95_12;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "Lclient!l;")
	public static Class11 aClass11_15;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "I")
	public static int anInt4886 = 0;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public static final int anInt4887 = 1337;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method3876() {
		Static255.aClass7_Sub14_Sub1_2.method3933(Static264.aClass178_80.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static432.aClass178_136.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static413.aClass178_124.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static415.aClass178_127.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static32.aClass178_12.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static402.aClass178_123.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static122.aClass178_39.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static80.aClass178_22.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static25.aClass178_9.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static15.aClass178_4.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static170.aClass178_83.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static236.aClass178_67.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static78.aClass178_20.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static249.aClass178_74.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static282.aClass178_86.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static271.aClass178_82.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static4.aClass178_137.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static398.aClass178_122.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static106.aClass178_32.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static20.aClass178_34.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static388.aClass178_120.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static419.aClass178_129.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static331.aClass178_102.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static224.aClass178_108.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static206.aClass178_58.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static197.aClass178_54.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static81.aClass178_23.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static237.aClass178_68.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static70.aClass178_19.method3846());
		Static255.aClass7_Sub14_Sub1_2.method3933(Static20.aClass178_33.method3846());
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I")
	public static int method3878(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method3879(@OriginalArg(1) Class51 arg0) {
		@Pc(7) int local7 = Static415.anInt6598;
		@Pc(9) int local9 = Static351.anInt5637;
		@Pc(11) int local11 = Static171.anInt3077;
		@Pc(13) int local13 = Static253.anInt4289;
		arg0.method5286(local11, -10660793, local7, local13, local9);
		arg0.method5286(local11 - 2, -16777216, local7 + 1, 16, local9 + 1);
		arg0.method5325(local9 + 18, -16777216, -2 + local11, local13 - 19, local7 + 1);
		Static305.aClass63_15.method4581(-1, local9 + 14, -10660793, Static448.aClass55_146.method1205(Static5.anInt20), local7 + 3);
		@Pc(79) int local79 = Static154.aClass50_1.method1860();
		@Pc(85) int local85 = Static154.aClass50_1.method1870();
		@Pc(87) int local87 = 0;
		for (@Pc(92) Class7_Sub39 local92 = (Class7_Sub39) Static237.aClass85_26.method2010(); local92 != null; local92 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			@Pc(108) int local108 = local9 + (Static102.anInt2085 - local87 - 1) * 16 + 31;
			@Pc(110) short local110 = -1;
			if (local7 < local79 && local79 < local11 + local7 && local85 > local108 - 13 && local85 < local108 + 3 && local92.aBoolean392) {
				local110 = -256;
			}
			@Pc(135) int[] local135 = null;
			if (Static59.method821(local92.anInt5893)) {
				local135 = Static259.aClass206_2.method4320((int) local92.aLong186).anIntArray81;
			} else if (local92.anInt5895 != -1) {
				local135 = Static259.aClass206_2.method4320(local92.anInt5895).anIntArray81;
			} else if (Static300.method4007(local92.anInt5893)) {
				@Pc(159) Class26_Sub2_Sub4_Sub1 local159 = Static171.aClass26_Sub2_Sub4_Sub1Array1[(int) local92.aLong186];
				if (local159 != null) {
					@Pc(164) Class249 local164 = local159.aClass249_1;
					if (local164.anIntArray579 != null) {
						local164 = local164.method5179(Static224.aClass239_7);
					}
					if (local164 != null) {
						local135 = local164.anIntArray582;
					}
				}
			} else if (Static139.method2166(local92.anInt5893)) {
				@Pc(202) Class189 local202;
				if (local92.anInt5893 == 1011) {
					local202 = Static411.aClass142_4.method3148((int) local92.aLong186);
				} else {
					local202 = Static411.aClass142_4.method3148((int) (local92.aLong186 >>> 32 & 0x7FFFFFFFL));
				}
				if (local202.anIntArray448 != null) {
					local202 = local202.method4038(Static224.aClass239_7);
				}
				if (local202 != null) {
					local135 = local202.anIntArray449;
				}
			}
			@Pc(248) String local248 = Static336.method4381(local92);
			if (local135 != null) {
				local248 = local248 + Static96.method1690(local135);
			}
			Static305.aClass63_15.method4586(local7 + 3, Static68.anIntArray99, local110, local108, Static423.aClass11Array15, local248);
			if (local92.aBoolean391) {
				Static454.aClass11_21.method4394(Static35.aClass57_13.method1387(local248) + local7 + 5, local108 + -12);
			}
			local87++;
		}
		Static261.method3518(Static253.anInt4289, Static171.anInt3077, Static415.anInt6598, Static351.anInt5637);
	}
}
