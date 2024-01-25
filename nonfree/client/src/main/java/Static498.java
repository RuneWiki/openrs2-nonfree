import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!pu;")
	public static Class270 aClass270_102;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString86;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!no;")
	public static final Class240 aClass240_8 = new Class240();

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_90 = new Class70(43, -1);

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
	public static int anInt8553 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public static int method6985() {
		if ((double) Static226.aFloat136 == 3.0D) {
			return 37;
		} else if ((double) Static226.aFloat136 == 4.0D) {
			return 50;
		} else if ((double) Static226.aFloat136 == 6.0D) {
			return 75;
		} else if ((double) Static226.aFloat136 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZII)V")
	public static void method6987(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg0 == Static504.anInt5716 && Static188.anInt3531 == arg2 && (Static42.anInt691 == Static433.anInt7592 || Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222))) {
			return;
		}
		Static504.anInt5716 = arg0;
		Static42.anInt691 = Static433.anInt7592;
		Static188.anInt3531 = arg2;
		if (Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222)) {
			Static42.anInt691 = 0;
		}
		Static426.method5887(arg3);
		Static152.method2206(Static442.aClass64_12, true, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_16.method7651(Static307.anInt5279));
		@Pc(62) int local62 = Static541.anInt9058;
		@Pc(64) int local64 = Static116.anInt2289;
		Static541.anInt9058 = (Static504.anInt5716 - (Static71.anInt1410 >> 4)) * 8;
		Static116.anInt2289 = (Static188.anInt3531 - (Static471.anInt8012 >> 4)) * 8;
		Static505.aClass1_Sub6_Sub11_3 = Static226.method5082(Static504.anInt5716 * 8, Static188.anInt3531 * 8);
		Static439.aClass13_3 = null;
		@Pc(102) int local102 = Static541.anInt9058 - local62;
		@Pc(107) int local107 = Static116.anInt2289 - local64;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(200) int local200;
		@Pc(300) int local300;
		if (arg3 == 11) {
			for (local300 = 0; local300 < Static35.anInt540; local300++) {
				@Pc(306) Class1_Sub42 local306 = Static466.aClass1_Sub42Array1[local300];
				if (local306 != null) {
					@Pc(311) Class8_Sub3_Sub3_Sub1_Sub2 local311 = local306.aClass8_Sub3_Sub3_Sub1_Sub2_2;
					for (local130 = 0; local130 < 10; local130++) {
						local311.anIntArray534[local130] -= local102;
						local311.anIntArray533[local130] -= local107;
					}
					local311.anInt9365 -= local102 * 512;
					local311.anInt9370 -= local107 * 512;
				}
			}
		} else {
			@Pc(114) boolean local114 = false;
			Static39.anInt609 = 0;
			@Pc(122) int local122 = (Static71.anInt1410 - 1) * 512;
			local128 = (Static471.anInt8012 - 1) * 512;
			for (local130 = 0; local130 < Static35.anInt540; local130++) {
				@Pc(136) Class1_Sub42 local136 = Static466.aClass1_Sub42Array1[local130];
				if (local136 != null) {
					@Pc(141) Class8_Sub3_Sub3_Sub1_Sub2 local141 = local136.aClass8_Sub3_Sub3_Sub1_Sub2_2;
					local141.anInt9365 -= local102 * 512;
					local141.anInt9370 -= local107 * 512;
					if (local141.anInt9365 >= 0 && local122 >= local141.anInt9365 && local141.anInt9370 >= 0 && local128 >= local141.anInt9370) {
						@Pc(198) boolean local198 = true;
						for (local200 = 0; local200 < 10; local200++) {
							local141.anIntArray534[local200] -= local102;
							local141.anIntArray533[local200] -= local107;
							if (local141.anIntArray534[local200] < 0 || local141.anIntArray534[local200] >= Static71.anInt1410 || local141.anIntArray533[local200] < 0 || local141.anIntArray533[local200] >= Static471.anInt8012) {
								local198 = false;
							}
						}
						if (local198) {
							Static17.anIntArray24[Static39.anInt609++] = local141.anInt6821;
						} else {
							local141.method5450(null);
							local114 = true;
							local136.method7859();
						}
					} else {
						local141.method5450(null);
						local136.method7859();
						local114 = true;
					}
				}
			}
			if (local114) {
				Static35.anInt540 = Static84.aClass187_40.method3796();
				Static84.aClass187_40.method3802(Static466.aClass1_Sub42Array1);
			}
		}
		for (local300 = 0; local300 < 2048; local300++) {
			@Pc(369) Class8_Sub3_Sub3_Sub1_Sub1 local369 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local300];
			if (local369 != null) {
				for (local128 = 0; local128 < 10; local128++) {
					local369.anIntArray534[local128] -= local102;
					local369.anIntArray533[local128] -= local107;
				}
				local369.anInt9370 -= local107 * 512;
				local369.anInt9365 -= local102 * 512;
			}
		}
		@Pc(417) Class154[] local417 = Static41.aClass154Array1;
		for (local128 = 0; local128 < local417.length; local128++) {
			@Pc(425) Class154 local425 = local417[local128];
			if (local425 != null) {
				local425.anInt4120 -= local102 * 512;
				local425.anInt4114 -= local107 * 512;
			}
		}
		for (@Pc(457) Class1_Sub20 local457 = (Class1_Sub20) Static27.aClass353_3.method7677(); local457 != null; local457 = (Class1_Sub20) Static27.aClass353_3.method7687()) {
			local457.anInt2957 -= local107;
			local457.anInt2953 -= local102;
			if (Static90.anInt1938 != 4 && (local457.anInt2953 < 0 || local457.anInt2957 < 0 || local457.anInt2953 >= Static71.anInt1410 || Static471.anInt8012 <= local457.anInt2957)) {
				local457.method7859();
			}
		}
		if (Static90.anInt1938 != 4) {
			for (@Pc(516) Class1_Sub28 local516 = (Class1_Sub28) Static19.aClass187_3.method3799(); local516 != null; local516 = (Class1_Sub28) Static19.aClass187_3.method3805()) {
				@Pc(524) int local524 = (int) (local516.aLong301 & 0x3FFFL);
				@Pc(529) int local529 = local524 - Static541.anInt9058;
				local200 = (int) (local516.aLong301 >> 14 & 0x3FFFL);
				@Pc(542) int local542 = local200 - Static116.anInt2289;
				if (local529 < 0 || local542 < 0 || local529 >= Static71.anInt1410 || Static471.anInt8012 <= local542) {
					local516.method7859();
				}
			}
		}
		if (Static228.anInt4297 != 0) {
			Static228.anInt4297 -= local102;
			Static66.anInt1351 -= local107;
		}
		Static13.method139();
		if (arg3 != 11) {
			Static59.anInt1132 -= local107 * 512;
			Static405.anInt7085 -= local102 * 512;
			Static373.anInt6267 -= local102;
			Static458.anInt7890 -= local107;
			Static273.anInt4793 -= local107;
			Static319.anInt5419 -= local102;
			if (Math.abs(local102) > Static71.anInt1410 || Math.abs(local107) > Static471.anInt8012) {
				Static475.method6481();
			}
		} else if (Static340.anInt5707 == 4) {
			Static177.anInt3135 -= local102 * 512;
			Static308.anInt5286 -= local107 * 512;
			Static301.anInt5198 -= local107 * 512;
			Static417.anInt7669 -= local102 * 512;
		} else {
			Static243.anInt4483 = -1;
			Static442.anInt7679 = -1;
			Static340.anInt5707 = 1;
		}
		Static137.method2093();
		Static376.method5050();
		Static356.aClass353_42.method7680();
		Static87.aClass353_33.method7680();
		Static500.aClass209_10.method4186();
		Static510.method7092();
	}
}
