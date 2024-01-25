import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public static int anInt7097;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString195 = null;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method5579() {
		for (@Pc(7) int local7 = 0; local7 < Static332.anInt5613; local7++) {
			@Pc(13) int local13 = Static25.anIntArray41[local7];
			@Pc(21) Class3_Sub4_Sub1_Sub1 local21 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) local13)).aClass3_Sub4_Sub1_Sub1_1;
			@Pc(25) int local25 = Static26.aClass2_Sub13_Sub2_1.method3580();
			if ((local25 & 0x8) != 0) {
				local25 += Static26.aClass2_Sub13_Sub2_1.method3580() << 8;
			}
			if ((local25 & 0x2000) != 0) {
				local21.anInt4907 = Static26.aClass2_Sub13_Sub2_1.method3601();
				local21.anInt4920 = Static26.aClass2_Sub13_Sub2_1.method3601();
				local21.anInt4919 = Static26.aClass2_Sub13_Sub2_1.method3601();
				local21.anInt4949 = Static26.aClass2_Sub13_Sub2_1.method3573();
				local21.anInt4898 = Static26.aClass2_Sub13_Sub2_1.method3555() + Static266.anInt4392;
				local21.anInt4917 = Static26.aClass2_Sub13_Sub2_1.method3593() + Static266.anInt4392;
				local21.anInt4926 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local21.anInt4919 += local21.anIntArray425[0];
				local21.anInt4977 = 1;
				local21.anInt4907 += local21.anIntArray425[0];
				local21.anInt4920 += local21.anIntArray424[0];
				local21.anInt4976 = 0;
				local21.anInt4949 += local21.anIntArray424[0];
			}
			@Pc(143) int local143;
			if ((local25 & 0x1000) != 0) {
				local143 = Static26.aClass2_Sub13_Sub2_1.method3580();
				@Pc(146) int[] local146 = new int[local143];
				@Pc(149) int[] local149 = new int[local143];
				@Pc(152) int[] local152 = new int[local143];
				for (@Pc(154) int local154 = 0; local154 < local143; local154++) {
					@Pc(160) int local160 = Static26.aClass2_Sub13_Sub2_1.method3576();
					if (local160 == 65535) {
						local160 = -1;
					}
					local146[local154] = local160;
					local149[local154] = Static26.aClass2_Sub13_Sub2_1.method3556();
					local152[local154] = Static26.aClass2_Sub13_Sub2_1.method3555();
				}
				Static39.method583(local21, local149, local152, local146);
			}
			@Pc(212) int local212;
			if ((local25 & 0x1) != 0) {
				local143 = Static26.aClass2_Sub13_Sub2_1.method3588();
				local212 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local21.method4013(Static266.anInt4392, local143, local212);
			}
			if ((local25 & 0x80) != 0) {
				local143 = Static26.aClass2_Sub13_Sub2_1.method3555();
				if (local143 == 65535) {
					local143 = -1;
				}
				local212 = Static26.aClass2_Sub13_Sub2_1.method3600();
				Static200.method2690(local21, local212, local143);
			}
			@Pc(267) int local267;
			if ((local25 & 0x100) != 0) {
				local143 = Static26.aClass2_Sub13_Sub2_1.method3548();
				if (local143 == 65535) {
					local143 = -1;
				}
				local212 = Static26.aClass2_Sub13_Sub2_1.method3574();
				local267 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local21.method3996(true, local267, local143, local212);
			}
			if ((local25 & 0x4) != 0) {
				local143 = Static26.aClass2_Sub13_Sub2_1.method3588();
				local212 = Static26.aClass2_Sub13_Sub2_1.method3587();
				local21.method4013(Static266.anInt4392, local143, local212);
				local21.anInt4965 = Static266.anInt4392 + 300;
				local21.anInt4925 = Static26.aClass2_Sub13_Sub2_1.method3587();
			}
			if ((local25 & 0x40) != 0) {
				if (local21.aClass245_1.method5204()) {
					Static192.method2588(local21);
				}
				local21.method2629(Static155.aClass263_1.method5581(Static26.aClass2_Sub13_Sub2_1.method3548()));
				local21.method4008(local21.aClass245_1.anInt6704);
				local21.anInt4948 = local21.aClass245_1.anInt6705 << 3;
				if (local21.aClass245_1.method5204()) {
					Static160.method2246(local21.anIntArray424[0], local21.anIntArray425[0], null, 0, local21, null, local21.aByte91);
				}
			}
			if ((local25 & 0x800) != 0) {
				local143 = Static26.aClass2_Sub13_Sub2_1.method3548();
				local21.anInt4941 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local21.anInt4956 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local21.aBoolean352 = (local143 & 0x8000) != 0;
				local21.anInt4931 = local143 & 0x7FFF;
				local21.anInt4971 = local21.anInt4941 + Static266.anInt4392 + local21.anInt4931;
			}
			if ((local25 & 0x400) != 0) {
				local21.aByte62 = Static26.aClass2_Sub13_Sub2_1.method3573();
				local21.aByte61 = Static26.aClass2_Sub13_Sub2_1.method3545();
				local21.aByte63 = Static26.aClass2_Sub13_Sub2_1.method3601();
				local21.aByte60 = (byte) Static26.aClass2_Sub13_Sub2_1.method3580();
				local21.anInt4968 = Static266.anInt4392 + Static26.aClass2_Sub13_Sub2_1.method3593();
				local21.anInt4921 = Static266.anInt4392 + Static26.aClass2_Sub13_Sub2_1.method3555();
			}
			if ((local25 & 0x2) != 0) {
				local21.aString146 = Static26.aClass2_Sub13_Sub2_1.method3582();
				local21.anInt4961 = 100;
			}
			if ((local25 & 0x20) != 0) {
				local143 = Static26.aClass2_Sub13_Sub2_1.method3593();
				if (local143 == 65535) {
					local143 = -1;
				}
				local212 = Static26.aClass2_Sub13_Sub2_1.method3557();
				local267 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local21.method3996(false, local267, local143, local212);
			}
			if ((local25 & 0x200) != 0) {
				local21.anInt3304 = Static26.aClass2_Sub13_Sub2_1.method3593();
				local21.anInt3308 = Static26.aClass2_Sub13_Sub2_1.method3555();
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt4936 = Static26.aClass2_Sub13_Sub2_1.method3576();
				if (local21.anInt4936 == 65535) {
					local21.anInt4936 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B[[BLclient!pu;)V")
	public static void method5580(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class118_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(38) int local38;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) byte[] local25 = arg0[local17];
			if (local25 != null) {
				@Pc(32) Class2_Sub13 local32 = new Class2_Sub13(local25);
				local38 = Static225.anIntArray310[local17] >> 8;
				@Pc(44) int local44 = Static225.anIntArray310[local17] & 0xFF;
				@Pc(51) int local51 = local38 * 64 - Static275.anInt4506;
				@Pc(58) int local58 = local44 * 64 - Static209.anInt3497;
				Static123.method5625();
				arg1.method4308(Static275.anInt4506, Static209.anInt3497, local58, local51, local32, Static361.aClass71Array1);
				arg1.method4312(local12, Static82.aClass163_1, local32, local51, local58);
				if (!arg1.aBoolean408 && Static283.anInt4621 / 8 == local38 && local44 == Static429.anInt6931 / 8 && local12[0] != -1) {
					Static405.aClass157_1 = Static91.aClass180_1.method3851(local12[2], local12[1], Static231.aClass129_1, local12[0], local12[3]);
					Static431.anInt6971 = local12[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local15; local127++) {
			@Pc(140) int local140 = (Static225.anIntArray310[local127] >> 8) * 64 - Static275.anInt4506;
			local38 = (Static225.anIntArray310[local127] & 0xFF) * 64 - Static209.anInt3497;
			@Pc(155) byte[] local155 = arg0[local127];
			if (local155 == null && Static429.anInt6931 < 800) {
				Static123.method5625();
				arg1.method4303(local38, local140);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIFFFIIFIFLclient!p;)[B")
	public static byte[] method5587(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) Class9 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static365.method4802(local10, arg3, arg2, 0, arg5, arg4, arg0, arg1);
		return local10;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
	public static void method5590() {
		if (Static82.aClass163_1 == null) {
			return;
		}
		Static212.aClass93_3.method2073();
		Static251.method3194();
		Static12.method161();
		Static310.method4243();
		Static147.method2139();
		Static440.method5578();
		if (Static405.aClass157_1 != null) {
			Static405.aClass157_1.method3167();
		}
		Static422.method5327();
		Static190.method2553();
		Static296.method3929();
		Static21.method133(false);
		Static362.method4760();
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class3_Sub4_Sub1_Sub2 local43 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local37];
			if (local43 != null) {
				local43.aClass2_Sub41_3 = null;
				for (@Pc(50) int local50 = 0; local50 < local43.aClass59Array3.length; local50++) {
					local43.aClass59Array3[local50] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static384.anInt6329; local75++) {
			@Pc(82) Class3_Sub4_Sub1_Sub1 local82 = Static332.aClass2_Sub28Array1[local75].aClass3_Sub4_Sub1_Sub1_1;
			if (local82 != null) {
				for (@Pc(86) int local86 = 0; local86 < local82.aClass59Array3.length; local86++) {
					local82.aClass59Array3[local86] = null;
				}
			}
		}
		Static57.aClass31_2 = null;
		Static276.aClass31_3 = null;
		Static82.aClass163_1.method5554();
		Static82.aClass163_1 = null;
	}
}
