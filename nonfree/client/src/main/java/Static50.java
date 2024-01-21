import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!ve;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array5;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!ic;")
	private static Class34 aClass34_655 = Static56.method816("Loaded interfaces");

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!m;")
	public static Class49 aClass49_6 = new Class49();

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
	public static int[] anIntArray164 = new int[32768];

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_656 = aClass34_655;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	public static int anInt1320 = 0;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!ic;")
	private static Class34 aClass34_663 = Static56.method816("glow3:");

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_657 = aClass34_663;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_658 = Static56.method816("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public static int anInt1321 = 0;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!ic;")
	public static Class34 aClass34_659 = Static56.method816("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_660 = aClass34_663;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
	public static int[] anIntArray165 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_661 = Static56.method816("(U4");

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_662 = Static56.method816("mapmarker");

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "[I")
	public static int[] anIntArray166 = new int[500];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Lclient!qa;")
	public static Class8_Sub1_Sub15 method750(@OriginalArg(1) int arg0) {
		@Pc(6) Class8_Sub1_Sub15 local6 = (Class8_Sub1_Sub15) Static56.aClass48_28.method1100((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static30.aClass14_9.method1156(arg0, 5);
		local6 = new Class8_Sub1_Sub15();
		if (local20 != null) {
			local6.method1446(new Class8_Sub20(local20));
		}
		Static56.aClass48_28.method1097(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!jf;I)V")
	public static void method751(@OriginalArg(0) Class8_Sub1_Sub1_Sub4 arg0) {
		if (arg0.anInt2028 == 0) {
			return;
		}
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg0.anInt2029 != -1 && arg0.anInt2029 < 32768) {
			@Pc(27) Class8_Sub1_Sub1_Sub4_Sub2 local27 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[arg0.anInt2029];
			if (local27 != null) {
				local36 = arg0.anInt2043 - local27.anInt2043;
				local43 = arg0.anInt2059 - local27.anInt2059;
				if (local36 != 0 || local43 != 0) {
					arg0.anInt2022 = (int) (Math.atan2((double) local36, (double) local43) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt2029 >= 32768) {
			local73 = arg0.anInt2029 - 32768;
			if (Static2.anInt33 == local73) {
				local73 = 2047;
			}
			@Pc(82) Class8_Sub1_Sub1_Sub4_Sub1 local82 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local73];
			if (local82 != null) {
				local43 = arg0.anInt2043 - local82.anInt2043;
				@Pc(98) int local98 = arg0.anInt2059 - local82.anInt2059;
				if (local43 != 0 || local98 != 0) {
					arg0.anInt2022 = (int) (Math.atan2((double) local43, (double) local98) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2053 != 0 || arg0.anInt2040 != 0) && (arg0.anInt2032 == 0 || arg0.anInt2020 > 0)) {
			local73 = arg0.anInt2043 - (arg0.anInt2053 - Static82.anInt1959 - Static82.anInt1959) * 64;
			local36 = arg0.anInt2059 - (arg0.anInt2040 - Static64.anInt2062 - Static64.anInt2062) * 64;
			if (local73 != 0 || local36 != 0) {
				arg0.anInt2022 = (int) (Math.atan2((double) local73, (double) local36) * 325.949D) & 0x7FF;
			}
			arg0.anInt2053 = 0;
			arg0.anInt2040 = 0;
		}
		local73 = arg0.anInt2022 - arg0.anInt2038 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt2014 = 0;
			return;
		}
		arg0.anInt2014++;
		@Pc(227) boolean local227;
		if (local73 <= 1024) {
			arg0.anInt2038 += arg0.anInt2028;
			local227 = true;
			if (local73 < arg0.anInt2028 || local73 > 2048 - arg0.anInt2028) {
				arg0.anInt2038 = arg0.anInt2022;
				local227 = false;
			}
			if (arg0.anInt2063 == arg0.anInt2010 && (arg0.anInt2014 > 25 || local227)) {
				if (arg0.anInt2033 == -1) {
					arg0.anInt2010 = arg0.anInt2054;
				} else {
					arg0.anInt2010 = arg0.anInt2033;
				}
			}
		} else {
			arg0.anInt2038 -= arg0.anInt2028;
			local227 = true;
			if (local73 < arg0.anInt2028 || local73 > 2048 - arg0.anInt2028) {
				local227 = false;
				arg0.anInt2038 = arg0.anInt2022;
			}
			if (arg0.anInt2063 == arg0.anInt2010 && (arg0.anInt2014 > 25 || local227)) {
				if (arg0.anInt2048 == -1) {
					arg0.anInt2010 = arg0.anInt2054;
				} else {
					arg0.anInt2010 = arg0.anInt2048;
				}
			}
		}
		arg0.anInt2038 &= 0x7FF;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lclient!cd;")
	public static Class8_Sub1_Sub4 method752(@OriginalArg(0) int arg0) {
		@Pc(12) Class8_Sub1_Sub4 local12 = (Class8_Sub1_Sub4) Static58.aClass48_29.method1100((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static105.aClass14_24.method1156(arg0, 6);
		local12 = new Class8_Sub1_Sub4();
		local12.anInt440 = arg0;
		if (local27 != null) {
			local12.method266(new Class8_Sub20(local27));
		}
		local12.method257();
		if (local12.aBoolean24) {
			local12.aBoolean22 = false;
			local12.anInt424 = 0;
		}
		Static58.aClass48_29.method1097(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method753() {
		aClass34_658 = null;
		aClass34_661 = null;
		aClass34_656 = null;
		aClass34_663 = null;
		anIntArray165 = null;
		aClass8_Sub1_Sub3_Sub2Array5 = null;
		anIntArray164 = null;
		aClass34_655 = null;
		anIntArray166 = null;
		aClass34_660 = null;
		aClass34_657 = null;
		aClass3_1 = null;
		aClass49_6 = null;
		aClass34_662 = null;
		aClass34_659 = null;
	}
}
