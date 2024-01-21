import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] aClass4_Sub1_Sub7_Sub3Array3;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "[S")
	public static final short[] aShortArray7 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_355 = Static177.method3050("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "Lclient!jd;")
	public static Class46 aClass46_356 = aClass46_355;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
	public static int anInt1039 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)I")
	public static int method687(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIII[Lclient!mb;)V")
	public static void method688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class58[] arg3) {
		@Pc(6) Class4_Sub11 local6 = new Class4_Sub11(arg0);
		@Pc(13) int local13 = -1;
		while (true) {
			@Pc(21) int local21 = local6.method1278();
			if (local21 == 0) {
				return;
			}
			@Pc(25) int local25 = 0;
			local13 += local21;
			while (true) {
				@Pc(33) int local33 = local6.method1240();
				if (local33 == 0) {
					break;
				}
				local25 += local33 - 1;
				@Pc(48) int local48 = local25 & 0x3F;
				@Pc(54) int local54 = local25 >> 6 & 0x3F;
				@Pc(58) int local58 = local25 >> 12;
				@Pc(62) int local62 = arg2 + local54;
				@Pc(66) int local66 = local6.method1253();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				@Pc(78) int local78 = local48 + arg1;
				if (local62 > 0 && local78 > 0 && local62 < 103 && local78 < 103) {
					@Pc(90) int local90 = local58;
					if ((Static53.aByteArrayArrayArray2[1][local62][local78] & 0x2) == 2) {
						local90 = local58 - 1;
					}
					@Pc(106) Class58 local106 = null;
					if (local90 >= 0) {
						local106 = arg3[local90];
					}
					Static85.method1708(local78, local106, local13, local58, local74, local62, local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method689() {
		for (@Pc(7) int local7 = 0; local7 < Static57.anInt1406; local7++) {
			@Pc(13) int local13 = Static186.anIntArray438[local7]--;
			if (Static186.anIntArray438[local7] >= -10) {
				@Pc(80) Class13 local80 = Static6.aClass13Array1[local7];
				if (local80 == null) {
					local80 = Static191.method352(Static188.aClass62_Sub1_103, Static50.anIntArray124[local7], 0);
					if (local80 == null) {
						continue;
					}
					Static186.anIntArray438[local7] += local80.method355();
					Static6.aClass13Array1[local7] = local80;
				}
				if (Static186.anIntArray438[local7] < 0) {
					@Pc(121) int local121;
					if (Static91.anIntArray223[local7] == 0) {
						local121 = Static26.anInt647;
					} else {
						@Pc(131) int local131 = (Static91.anIntArray223[local7] & 0xFF) * 128;
						@Pc(139) int local139 = Static91.anIntArray223[local7] >> 16 & 0xFF;
						@Pc(147) int local147 = Static91.anIntArray223[local7] >> 8 & 0xFF;
						@Pc(157) int local157 = local147 * 128 + 64 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803;
						@Pc(166) int local166 = local139 * 128 + 64 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832;
						if (local157 < 0) {
							local157 = -local157;
						}
						if (local166 < 0) {
							local166 = -local166;
						}
						@Pc(182) int local182 = local166 + local157 - 128;
						if (local131 < local182) {
							Static186.anIntArray438[local7] = -100;
							continue;
						}
						if (local182 < 0) {
							local182 = 0;
						}
						local121 = (local131 - local182) * Static122.anInt2962 / local131;
					}
					if (local121 > 0) {
						@Pc(218) Class4_Sub12_Sub1 local218 = local80.method354().method3060(Static60.aClass25_1);
						@Pc(223) Class4_Sub2_Sub2 local223 = Static192.method1306(local218, local121);
						local223.method1335(Static67.anIntArray168[local7] - 1);
						Static50.aClass4_Sub2_Sub1_1.method1076(local223);
					}
					Static186.anIntArray438[local7] = -100;
				}
			} else {
				Static57.anInt1406--;
				for (@Pc(27) int local27 = local7; local27 < Static57.anInt1406; local27++) {
					Static50.anIntArray124[local27] = Static50.anIntArray124[local27 + 1];
					Static6.aClass13Array1[local27] = Static6.aClass13Array1[local27 + 1];
					Static67.anIntArray168[local27] = Static67.anIntArray168[local27 + 1];
					Static186.anIntArray438[local27] = Static186.anIntArray438[local27 + 1];
					Static91.anIntArray223[local27] = Static91.anIntArray223[local27 + 1];
				}
				local7--;
			}
		}
		if (Static106.aBoolean114 && !Static86.method1710()) {
			if (Static135.anInt3218 != 0 && Static104.anInt2619 != -1) {
				Static118.method2141(Static135.anInt3218, Static104.anInt2619, Static73.aClass62_Sub1_47);
			}
			Static106.aBoolean114 = false;
		} else if (Static135.anInt3218 != 0 && Static104.anInt2619 != -1 && !Static86.method1710()) {
			Static90.aClass4_Sub11_Sub1_1.method1285(75);
			Static90.aClass4_Sub11_Sub1_1.method1256(Static104.anInt2619);
			Static104.anInt2619 = -1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	public static void method690() {
		if (!Static86.aBoolean97) {
			return;
		}
		@Pc(11) Class1 local11 = Static132.method2334(Static106.anInt2649, Static124.anInt2981);
		if (local11 != null && local11.anObjectArray25 != null) {
			@Pc(20) Class4_Sub21 local20 = new Class4_Sub21();
			local20.anObjectArray28 = local11.anObjectArray25;
			local20.aClass1_40 = local11;
			Static2.method18(local20);
		}
		Static86.aBoolean97 = false;
		Static3.method21(local11);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!jd;Lclient!jd;ILclient!nh;)[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] method691(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(8) int local8 = arg2.method2859(arg1);
		@Pc(22) int local22 = arg2.method2860(local8, arg0);
		return Static71.method1494(local22, local8, arg2);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB[B)I")
	public static int method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg0; local14++) {
			local3 = local3 >>> 8 ^ Class4_Sub3_Sub22.anIntArray228[(local3 ^ arg2[local14]) & 0xFF];
		}
		return ~local3;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lclient!cg;")
	public static Class17 method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass17_1 == null ? null : local7.aClass17_1;
	}
}
