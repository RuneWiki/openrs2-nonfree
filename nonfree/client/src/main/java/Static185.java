import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1597 = Static49.method1293("flash3:");

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1603 = Static49.method1293("Login");

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1598 = aClass70_1603;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1599 = Static49.method1293("FULL");

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1600 = aClass70_1597;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1601 = aClass70_1597;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1602 = Static49.method1293("(Y<)4col>");

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
	public static int[] anIntArray440 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1604 = Static49.method1293("::qa_op_test");

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	public static int anInt4576 = 2;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1605 = aClass70_1599;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public static void method3518(@OriginalArg(1) int arg0) {
		Static26.anInt709 += arg0 * 128;
		@Pc(31) int local31;
		if (Static26.anInt709 > Static57.anIntArray187.length) {
			Static26.anInt709 -= Static57.anIntArray187.length;
			local31 = (int) (Math.random() * 12.0D);
			Static61.method1471(Static51.aClass1_Sub1_Sub1_Sub3Array4[local31]);
		}
		local31 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local75 = Static41.anIntArray132[local42 + local31] - arg0 * Static57.anIntArray187[Static57.anIntArray187.length - 1 & Static26.anInt709 + local31] / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static41.anIntArray132[local31++] = local75;
		}
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(115) int local115;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local106 = local75 * 128;
			for (local108 = 0; local108 < 128; local108++) {
				local115 = (int) (Math.random() * 100.0D);
				if (local115 < 50 && local108 > 10 && local108 < 118) {
					Static41.anIntArray132[local106 + local108] = 255;
				} else {
					Static41.anIntArray132[local108 + local106] = 0;
				}
			}
		}
		if (Static171.anInt4442 > 0) {
			Static171.anInt4442 -= arg0 * 4;
		}
		if (Static138.anInt3621 > 0) {
			Static138.anInt3621 -= arg0 * 4;
		}
		if (Static171.anInt4442 == 0 && Static138.anInt3621 == 0) {
			local106 = (int) ((double) (2000 / arg0) * Math.random());
			if (local106 == 1) {
				Static138.anInt3621 = 1024;
			}
			if (local106 == 0) {
				Static171.anInt4442 = 1024;
			}
		}
		for (local106 = 0; local106 < 256 - arg0; local106++) {
			Static35.anIntArray200[local106] = Static35.anIntArray200[local106 + arg0];
		}
		for (local108 = 256 - arg0; local108 < 256; local108++) {
			Static35.anIntArray200[local108] = (int) (Math.sin((double) Static68.anInt2116 / 14.0D) * 16.0D + Math.sin((double) Static68.anInt2116 / 15.0D) * 14.0D + Math.sin((double) Static68.anInt2116 / 16.0D) * 12.0D);
			Static68.anInt2116++;
		}
		Static86.anInt2580 += arg0;
		local115 = (arg0 + (Static47.anInt1654 & 0x1)) / 2;
		if (local115 <= 0) {
			return;
		}
		@Pc(300) int local300;
		@Pc(307) int local307;
		for (@Pc(291) int local291 = 0; local291 < Static86.anInt2580 * 100; local291++) {
			local300 = (int) (Math.random() * 124.0D) + 2;
			local307 = (int) (Math.random() * 128.0D) + 128;
			Static41.anIntArray132[local300 + (local307 << 7)] = 192;
		}
		Static86.anInt2580 = 0;
		@Pc(337) int local337;
		@Pc(340) int local340;
		for (local300 = 0; local300 < 256; local300++) {
			local307 = 0;
			local337 = local300 * 128;
			for (local340 = -local115; local340 < 128; local340++) {
				if (local115 + local340 < 128) {
					local307 += Static41.anIntArray132[local337 + local340 + local115];
				}
				if (local340 - local115 - 1 >= 0) {
					local307 -= Static41.anIntArray132[local337 + local340 - local115 - 1];
				}
				if (local340 >= 0) {
					Static24.anIntArray40[local340 + local337] = local307 / (local115 * 2 + 1);
				}
			}
		}
		for (local307 = 0; local307 < 128; local307++) {
			local337 = 0;
			for (local340 = -local115; local340 < 256; local340++) {
				@Pc(419) int local419 = local340 * 128;
				if (local340 + local115 < 256) {
					local337 += Static24.anIntArray40[local115 * 128 + local419 + local307];
				}
				if (local340 - local115 - 1 >= 0) {
					local337 -= Static24.anIntArray40[local307 + local419 - local115 * 128 - 128];
				}
				if (local340 >= 0) {
					Static41.anIntArray132[local419 + local307] = local337 / (local115 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)I")
	public static int method3519(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(25) int local25 = (local14 & 0x33333333) + ((local14 & 0xCCCCCCCF) >>> 2);
		@Pc(33) int local33 = (local25 >>> 4) + local25 & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(53) int local53 = local39 + (local39 >>> 16);
		return local53 & 0xFF;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method3520() {
		for (@Pc(7) int local7 = 0; local7 < Static86.anInt2582; local7++) {
			@Pc(13) int local13 = Static152.anIntArray208[local7];
			@Pc(17) Class1_Sub1_Sub4_Sub2_Sub2 local17 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local13];
			if (local17 != null) {
				Static44.method1096(local17, local17.aClass1_Sub1_Sub13_1.anInt3234);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	public static void method3521() {
		aClass70_1601 = null;
		anIntArray441 = null;
		aClass70_1605 = null;
		aClass70_1604 = null;
		aClass70_1599 = null;
		anIntArray440 = null;
		aClass70_1597 = null;
		aClass70_1598 = null;
		aClass70_1600 = null;
		aClass70_1603 = null;
		aClass70_1602 = null;
	}
}
