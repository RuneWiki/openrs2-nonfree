import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
	public static int[] anIntArray180;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!gb;")
	public static Class12 aClass12_3;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_336 = Static129.method2060("Standort");

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_337 = Static129.method2060("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!r;")
	private static Class61 aClass61_338 = Static129.method2060("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[I")
	public static int[] anIntArray181 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_339 = Static129.method2060(")1p");

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt1118 = 0;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_340 = Static129.method2060("<br>(X100(U(Y");

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!r;")
	public static Class61 aClass61_341 = aClass61_338;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public static int anInt1121 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!pa;)Lclient!r;")
	public static Class61 method760(@OriginalArg(1) Class5_Sub14 arg0) {
		return method770(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	public static void method764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int[] local13 = new int[4];
		@Pc(16) int[] local16 = new int[4];
		@Pc(18) int local18 = 1;
		local16[0] = arg1;
		local13[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static70.anIntArray252[local28] != arg1) {
				local16[local18] = Static70.anIntArray252[local28];
				local13[local18] = Static76.anIntArray267[local28];
				local18++;
			}
		}
		Static70.anIntArray252 = local16;
		Static76.anIntArray267 = local13;
		Static37.method704(Static39.aClass18Array1.length - 1, Static70.anIntArray252, Static39.aClass18Array1, 0, Static76.anIntArray267);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Lclient!vb;")
	public static Class5_Sub2_Sub16 method767(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub16 local10 = (Class5_Sub2_Sub16) Static108.aClass29_3.method766((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static62.aClass26_8.method1038(6, arg0);
		local10 = new Class5_Sub2_Sub16();
		local10.anInt3135 = arg0;
		if (local22 != null) {
			local10.method1967(new Class5_Sub14(local22));
		}
		local10.method1961();
		if (local10.aBoolean112) {
			local10.anInt3133 = 0;
			local10.aBoolean111 = false;
		}
		Static108.aClass29_3.method762(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V")
	public static void method768(@OriginalArg(0) int arg0) {
		if (Static21.method461(arg0)) {
			Static116.method1884(Static56.aClass5_Sub11ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method769() {
		aClass61_339 = null;
		anIntArray180 = null;
		aClass61_340 = null;
		aClass61_338 = null;
		aClass12_3 = null;
		anIntArray181 = null;
		aClass61_336 = null;
		aClass61_337 = null;
		aClass61_341 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!pa;B)Lclient!r;")
	private static Class61 method770(@OriginalArg(1) Class5_Sub14 arg0) {
		try {
			@Pc(7) Class61 local7 = new Class61();
			local7.anInt2675 = arg0.method1455();
			if (local7.anInt2675 > 32767) {
				local7.anInt2675 = 32767;
			}
			local7.aByteArray38 = new byte[local7.anInt2675];
			arg0.anInt2199 += Static91.aClass32_1.method858(arg0.anInt2199, arg0.aByteArray33, 0, local7.anInt2675, local7.aByteArray38);
			return local7;
		} catch (@Pc(49) Exception local49) {
			return Static38.aClass61_463;
		}
	}
}
