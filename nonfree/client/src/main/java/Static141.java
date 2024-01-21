import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
	public static int anInt3499;

	@OriginalMember(owner = "client!qg", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1200 = Static161.method2971("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!qg", name = "W", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1203 = Static161.method2971("Sorry invited players only)3");

	@OriginalMember(owner = "client!qg", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1201 = aClass13_1203;

	@OriginalMember(owner = "client!qg", name = "S", descriptor = "[B")
	public static byte[] aByteArray31 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!qg", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1202 = null;

	@OriginalMember(owner = "client!qg", name = "X", descriptor = "[I")
	public static int[] anIntArray336 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!qg", name = "Y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1204 = Static161.method2971("<col=ffffff>");

	@OriginalMember(owner = "client!qg", name = "Z", descriptor = "[I")
	public static int[] anIntArray337 = new int[25];

	@OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
	public static int anInt3501 = 0;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
	public static void method2528(@OriginalArg(0) int arg0) {
		Static84.anInt2404 += arg0 * 128;
		@Pc(26) int local26;
		if (Static84.anInt2404 > Static73.anIntArray224.length) {
			local26 = (int) (Math.random() * 12.0D);
			Static84.anInt2404 -= Static73.anIntArray224.length;
			Static52.method1289(Static120.aClass1_Sub2_Sub1_Sub4Array11[local26]);
		}
		local26 = 0;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(49) int local49 = arg0 * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			local75 = Static68.anIntArray208[local26 + local49] - arg0 * Static73.anIntArray224[local26 + Static84.anInt2404 & Static73.anIntArray224.length + -1] / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static68.anIntArray208[local26++] = local75;
		}
		@Pc(98) int local98;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local98 = local75 * 128;
			for (local100 = 0; local100 < 128; local100++) {
				local107 = (int) (Math.random() * 100.0D);
				if (local107 < 50 && local100 > 10 && local100 < 118) {
					Static68.anIntArray208[local98 + local100] = 255;
				} else {
					Static68.anIntArray208[local98 + local100] = 0;
				}
			}
		}
		if (Static170.anInt3826 > 0) {
			Static170.anInt3826 -= arg0 * 4;
		}
		if (Static16.anInt696 > 0) {
			Static16.anInt696 -= arg0 * 4;
		}
		if (Static16.anInt696 == 0 && Static170.anInt3826 == 0) {
			local98 = (int) ((double) (2000 / arg0) * Math.random());
			if (local98 == 1) {
				Static170.anInt3826 = 1024;
			}
			if (local98 == 0) {
				Static16.anInt696 = 1024;
			}
		}
		for (local98 = 0; local98 < 256 - arg0; local98++) {
			Static93.anIntArray261[local98] = Static93.anIntArray261[arg0 + local98];
		}
		for (local100 = 256 - arg0; local100 < 256; local100++) {
			Static93.anIntArray261[local100] = (int) (Math.sin((double) Static49.anInt1593 / 14.0D) * 16.0D + Math.sin((double) Static49.anInt1593 / 15.0D) * 14.0D + Math.sin((double) Static49.anInt1593 / 16.0D) * 12.0D);
			Static49.anInt1593++;
		}
		Static142.anInt3515 += arg0;
		local107 = (arg0 + (Static78.anInt2168 & 0x1)) / 2;
		if (local107 <= 0) {
			return;
		}
		@Pc(286) int local286;
		@Pc(293) int local293;
		for (@Pc(277) int local277 = 0; local277 < Static142.anInt3515 * 100; local277++) {
			local286 = (int) (Math.random() * 124.0D) + 2;
			local293 = (int) (Math.random() * 128.0D) + 128;
			Static68.anIntArray208[local286 + (local293 << 7)] = 192;
		}
		Static142.anInt3515 = 0;
		@Pc(323) int local323;
		@Pc(326) int local326;
		for (local286 = 0; local286 < 256; local286++) {
			local293 = 0;
			local323 = local286 * 128;
			for (local326 = -local107; local326 < 128; local326++) {
				if (local107 + local326 < 128) {
					local293 += Static68.anIntArray208[local323 + local326 + local107];
				}
				if (local326 - local107 - 1 >= 0) {
					local293 -= Static68.anIntArray208[local323 + local326 - local107 - 1];
				}
				if (local326 >= 0) {
					Static98.anIntArray392[local326 + local323] = local293 / (local107 * 2 + 1);
				}
			}
		}
		for (local293 = 0; local293 < 128; local293++) {
			local323 = 0;
			for (local326 = -local107; local326 < 256; local326++) {
				@Pc(407) int local407 = local326 * 128;
				if (local107 + local326 < 256) {
					local323 += Static98.anIntArray392[local407 + local293 + local107 * 128];
				}
				if (local326 - local107 - 1 >= 0) {
					local323 -= Static98.anIntArray392[local293 + local407 - (local107 + 1) * 128];
				}
				if (local326 >= 0) {
					Static68.anIntArray208[local407 + local293] = local323 / (local107 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V")
	public static void method2529() {
		aByteArray31 = null;
		aClass13_1201 = null;
		anIntArray337 = null;
		aClass13_1202 = null;
		aClass13_1203 = null;
		aClass13_1204 = null;
		aClass13_1200 = null;
		anIntArray336 = null;
	}
}
