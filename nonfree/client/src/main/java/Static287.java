import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	public static int anInt4910;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_112 = new Class180(72, 6);

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
	public static int[] anIntArray442 = new int[2];

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
	public static int anInt4913 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)I")
	public static int method4535() {
		if (Static660.anInt10547 == 0) {
			Static155.aClass100_2.method2825(new Class278("jaclib"));
			if (Static155.aClass100_2.method2828().method8681() != 100) {
				return 1;
			}
			if (!((Class278) Static155.aClass100_2.method2828()).method6826()) {
				Static200.aClient1.method1506();
			}
			Static660.anInt10547 = 1;
		}
		@Pc(233) int local233;
		@Pc(256) int local256;
		@Pc(270) int local270;
		@Pc(276) int local276;
		if (Static660.anInt10547 == 1) {
			Static229.aClass100Array1 = Static155.method2824();
			Static155.aClass100_1.method2825(new Class351(Static631.aClass15_155));
			Static155.aClass100_3.method2825(new Class278("jaggl"));
			Static155.aClass100_4.method2825(new Class278("jagdx"));
			Static155.aClass100_5.method2825(new Class278("jagmisc"));
			Static155.aClass100_6.method2825(new Class278("sw3d"));
			Static155.aClass100_7.method2825(new Class278("hw3d"));
			Static155.aClass100_8.method2825(new Class278("jagtheora"));
			Static155.aClass100_9.method2825(new Class351(Static512.aClass15_130));
			Static155.aClass100_10.method2825(new Class351(Static116.aClass15_37));
			Static155.aClass100_11.method2825(new Class351(Static277.aClass15_108));
			Static155.aClass100_12.method2825(new Class351(Static577.aClass15_165));
			Static155.aClass100_13.method2825(new Class351(Static468.aClass15_118));
			Static155.aClass100_14.method2825(new Class351(Static20.aClass15_119));
			Static155.aClass100_15.method2825(new Class351(Static474.aClass15_121));
			Static155.aClass100_16.method2825(new Class351(Static364.aClass15_96));
			Static155.aClass100_17.method2825(new Class351(Static254.aClass15_72));
			Static155.aClass100_18.method2825(new Class351(Static341.aClass15_90));
			Static155.aClass100_19.method2825(new Class351(Static206.aClass15_56));
			Static155.aClass100_20.method2825(new Class351(Static165.aClass15_154));
			Static155.aClass100_21.method2825(new Class351(Static102.aClass15_28));
			Static155.aClass100_22.method2825(new Class351(Static483.aClass15_123));
			Static155.aClass100_23.method2825(new Class80(Static548.aClass15_136, "huffman"));
			Static155.aClass100_24.method2825(new Class351(Static466.aClass15_117));
			Static155.aClass100_25.method2825(new Class351(Static532.aClass15_135));
			Static155.aClass100_26.method2825(new Class351(Static218.aClass15_62));
			Static155.aClass100_27.method2825(new Class354(Static267.aClass15_75, "details"));
			for (local233 = 0; local233 < Static229.aClass100Array1.length; local233++) {
				if (Static229.aClass100Array1[local233].method2828() == null) {
					throw new RuntimeException();
				}
			}
			local256 = 0;
			@Pc(258) Class100[] local258 = Static229.aClass100Array1;
			for (@Pc(260) int local260 = 0; local260 < local258.length; local260++) {
				@Pc(266) Class100 local266 = local258[local260];
				local270 = local266.method2827();
				local276 = local266.method2828().method8681();
				local256 += local276 * local270 / 100;
			}
			Static660.anInt10547 = 2;
			Static513.anInt8251 = local256;
		}
		if (Static229.aClass100Array1 == null) {
			return 100;
		}
		local233 = 0;
		local256 = 0;
		@Pc(303) boolean local303 = true;
		@Pc(305) Class100[] local305 = Static229.aClass100Array1;
		for (@Pc(307) int local307 = 0; local307 < local305.length; local307++) {
			@Pc(313) Class100 local313 = local305[local307];
			local276 = local313.method2827();
			@Pc(323) int local323 = local313.method2828().method8681();
			if (local323 < 100) {
				local303 = false;
			}
			local233 += local276;
			local256 += local276 * local323 / 100;
		}
		if (local303) {
			if (!((Class278) Static155.aClass100_5.method2828()).method6826()) {
				Static200.aClient1.method1500();
			}
			if (!((Class278) Static155.aClass100_8.method2828()).method6826()) {
				Static18.aBoolean36 = Static200.aClient1.method1493();
			}
			Static229.aClass100Array1 = null;
		}
		local256 -= Static513.anInt8251;
		local233 -= Static513.anInt8251;
		local270 = local233 <= 0 ? 100 : local256 * 100 / local233;
		if (!local303 && local270 > 99) {
			local270 = 99;
		}
		return local270;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!or;BZII)V")
	public static void method4536(@OriginalArg(0) Class260 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt6963;
		if (arg0.aByte94 == 0) {
			arg0.anInt6963 = arg0.anInt6931;
		} else if (arg0.aByte94 == 1) {
			arg0.anInt6963 = arg3 - arg0.anInt6931;
		} else if (arg0.aByte94 == 2) {
			arg0.anInt6963 = arg3 * arg0.anInt6931 >> 14;
		}
		@Pc(53) int local53 = arg0.anInt6971;
		if (arg0.aByte95 == 0) {
			arg0.anInt6971 = arg0.anInt6957;
		} else if (arg0.aByte95 == 1) {
			arg0.anInt6971 = arg2 - arg0.anInt6957;
		} else if (arg0.aByte95 == 2) {
			arg0.anInt6971 = arg2 * arg0.anInt6957 >> 14;
		}
		if (arg0.aByte94 == 4) {
			arg0.anInt6963 = arg0.anInt6971 * arg0.anInt7009 / arg0.anInt6928;
		}
		if (arg0.aByte95 == 4) {
			arg0.anInt6971 = arg0.anInt6928 * arg0.anInt6963 / arg0.anInt7009;
		}
		if (Static561.aBoolean714 && (Static79.method1526(arg0).anInt8078 != 0 || arg0.anInt7003 == 0)) {
			if (arg0.anInt6971 < 5 && arg0.anInt6963 < 5) {
				arg0.anInt6971 = 5;
				arg0.anInt6963 = 5;
			} else {
				if (arg0.anInt6971 <= 0) {
					arg0.anInt6971 = 5;
				}
				if (arg0.anInt6963 <= 0) {
					arg0.anInt6963 = 5;
				}
			}
		}
		if (arg0.anInt6958 == Static502.anInt4118) {
			Static242.aClass260_16 = arg0;
		}
		if (arg1 && arg0.anObjectArray25 != null && (arg0.anInt6963 != local8 || local53 != arg0.anInt6971)) {
			@Pc(196) Class3_Sub17 local196 = new Class3_Sub17();
			local196.aClass260_6 = arg0;
			local196.anObjectArray2 = arg0.anObjectArray25;
			Static510.aClass338_126.method8171(local196);
		}
	}
}
