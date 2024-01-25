import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!iba", name = "L", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!iba", name = "I", descriptor = "[I")
	public static final int[] anIntArray341 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method3760(@OriginalArg(0) Class43 arg0) {
		@Pc(7) int local7 = Static50.anInt1065;
		@Pc(9) int local9 = Static343.anInt6039;
		@Pc(11) int local11 = Static324.anInt5822;
		@Pc(13) int local13 = Static32.anInt717;
		arg0.method7185(local9, local13, local11, local7, -10660793);
		arg0.method7185(local9 + 1, 16, local11 - 2, local7 + 1, -16777216);
		arg0.method7145(local13 - 19, -16777216, -2 + local11, local7 + 1, local9 + 18);
		Static480.aClass117_9.method7654(Static48.aClass33_26.method797(Static131.anInt2839), local9 + 14, -10660793, local7 + 3, -1);
		@Pc(76) int local76 = Static563.aClass156_1.method5689();
		@Pc(82) int local82 = Static563.aClass156_1.method5690();
		@Pc(84) int local84 = 0;
		for (@Pc(91) Class3_Sub44 local91 = (Class3_Sub44) Static187.aClass130_15.method3543(); local91 != null; local91 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			@Pc(106) int local106 = local9 + (Static151.anInt3123 - local84 - 1) * 16 + 31;
			@Pc(108) short local108 = -1;
			if (local76 > local7 && local76 < local11 + local7 && local106 - 13 < local82 && local106 + 3 > local82 && local91.aBoolean608) {
				local108 = -256;
			}
			@Pc(145) int[] local145 = null;
			if (Static336.method5142(local91.anInt7685)) {
				local145 = Static517.aClass145_1.method3798((int) local91.aLong219).anIntArray646;
			} else if (local91.anInt7688 != -1) {
				local145 = Static517.aClass145_1.method3798(local91.anInt7688).anIntArray646;
			} else if (Static505.method2637(local91.anInt7685)) {
				@Pc(214) Class3_Sub39 local214 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local91.aLong219);
				if (local214 != null) {
					@Pc(219) Class9_Sub1_Sub1_Sub2_Sub1 local219 = local214.aClass9_Sub1_Sub1_Sub2_Sub1_2;
					@Pc(222) Class294 local222 = local219.aClass294_1;
					if (local222.anIntArray588 != null) {
						local222 = local222.method6429(Static427.aClass56_1);
					}
					if (local222 != null) {
						local145 = local222.lb;
					}
				}
			} else if (Static377.method5578(local91.anInt7685)) {
				@Pc(183) Class23 local183;
				if (local91.anInt7685 == 1001) {
					local183 = Static476.aClass69_5.method2181((int) local91.aLong219);
				} else {
					local183 = Static476.aClass69_5.method2181((int) (local91.aLong219 >>> 32 & 0x7FFFFFFFL));
				}
				if (local183.anIntArray78 != null) {
					local183 = local183.method587(Static427.aClass56_1);
				}
				if (local183 != null) {
					local145 = local183.anIntArray79;
				}
			}
			@Pc(256) String local256 = Static581.method7689(local91);
			if (local145 != null) {
				local256 = local256 + Static480.method6570(local145);
			}
			Static480.aClass117_9.method7645(local106, local108, Static370.anIntArray501, Static187.aClass46Array6, local7 + 3, local256);
			local84++;
			if (local91.aBoolean607) {
				Static569.aClass46_33.method7606(Static159.aClass58_7.method1767(local256) + local7 + 5, local106 - 12);
			}
		}
		Static202.method3647(Static32.anInt717, Static50.anInt1065, Static343.anInt6039, Static324.anInt5822);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!om;B)Lclient!daa;")
	public static Class58 method3761(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1) {
		@Pc(8) byte[] local8 = arg1.method5679(arg0);
		return local8 == null ? null : new Class58(local8);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZ)Z")
	public static boolean method3763(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "(I)V")
	public static void method3764() {
		@Pc(8) int local8 = Static259.aByteArrayArray29.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static259.aByteArrayArray29[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static265.anInt4979; local20++) {
					if (Static548.anIntArray650[local10] == Static126.anIntArray243[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static126.anIntArray243[Static265.anInt4979] = Static548.anIntArray650[local10];
					local18 = Static265.anInt4979++;
				}
				@Pc(59) Class3_Sub11 local59 = new Class3_Sub11(Static259.aByteArrayArray29[local10]);
				@Pc(61) int local61 = 0;
				while (Static259.aByteArrayArray29[local10].length > local59.anInt3520 && local61 < 511 && Static49.anInt1058 < 1023) {
					@Pc(78) int local78 = local61++ << 6 | local18;
					@Pc(82) int local82 = local59.method3109();
					@Pc(86) int local86 = local82 >> 14;
					@Pc(92) int local92 = local82 >> 7 & 0x3F;
					@Pc(96) int local96 = local82 & 0x3F;
					@Pc(109) int local109 = local92 + (Static548.anIntArray650[local10] >> 8) * 64 - Static529.anInt8344;
					@Pc(122) int local122 = (Static548.anIntArray650[local10] & 0xFF) * 64 + local96 - Static463.anInt7588;
					@Pc(131) Class294 local131 = Static510.aClass284_2.method6281(local59.method3109());
					@Pc(140) Class3_Sub39 local140 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local78);
					if (local140 == null && (local131.aByte112 & 0x1) > 0 && local86 == Static65.anInt1778 && local109 >= 0 && Static400.anInt6818 > local131.anInt7615 + local109 && local122 >= 0 && local122 + local131.anInt7615 < Static271.anInt5050) {
						@Pc(184) Class9_Sub1_Sub1_Sub2_Sub1 local184 = new Class9_Sub1_Sub1_Sub2_Sub1();
						local184.anInt6429 = local78;
						@Pc(192) Class3_Sub39 local192 = new Class3_Sub39(local184);
						Static243.aClass310_16.method6603(local192, (long) local78);
						Static341.aClass3_Sub39Array1[Static568.anInt9131++] = local192;
						Static480.anIntArray603[Static49.anInt1058++] = local78;
						local184.anInt6391 = Static305.anInt5560;
						local184.method425(local131);
						local184.method5565(local184.aClass294_1.anInt7615);
						local184.anInt6383 = local184.aClass294_1.anInt7589 << 3;
						local184.method5559(local184.aClass294_1.aByte107 + 4 << 11 & 0x3C85, true);
						local184.method417(local122, local86, true, local184.method5569(), local109);
					}
				}
			}
		}
	}
}
