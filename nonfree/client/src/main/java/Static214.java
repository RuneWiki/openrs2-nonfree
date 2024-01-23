import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!v", name = "Ab", descriptor = "[Lclient!qh;")
	public static Class93[] aClass93Array2;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
	public static int anInt4249 = 0;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
	public static int[] anIntArray490 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
	public static int anInt4250 = 2;

	@OriginalMember(owner = "client!v", name = "Cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1344 = Static186.method3527("Lade Sprites )2 ");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIII)V")
	public static void method3345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Static177.anInt3701 || arg3 < Static49.anInt1030) {
			return;
		}
		@Pc(29) boolean local29;
		if (Static131.anInt2713 > arg4) {
			local29 = false;
			arg4 = Static131.anInt2713;
		} else if (Static135.anInt2790 < arg4) {
			local29 = false;
			arg4 = Static135.anInt2790;
		} else {
			local29 = true;
		}
		@Pc(54) boolean local54;
		if (arg2 < Static131.anInt2713) {
			local54 = false;
			arg2 = Static131.anInt2713;
		} else if (Static135.anInt2790 < arg2) {
			arg2 = Static135.anInt2790;
			local54 = false;
		} else {
			local54 = true;
		}
		if (arg1 >= Static49.anInt1030) {
			Static107.method1641(arg2, arg0, Static139.anIntArrayArray21[arg1++], arg4);
		} else {
			arg1 = Static49.anInt1030;
		}
		if (arg3 > Static177.anInt3701) {
			arg3 = Static177.anInt3701;
		} else {
			Static107.method1641(arg2, arg0, Static139.anIntArrayArray21[arg3--], arg4);
		}
		@Pc(106) int local106;
		if (local54 && local29) {
			for (local106 = arg1; local106 <= arg3; local106++) {
				@Pc(112) int[] local112 = Static139.anIntArrayArray21[local106];
				local112[arg2] = local112[arg4] = arg0;
			}
		} else if (local54) {
			for (local106 = arg1; local106 <= arg3; local106++) {
				Static139.anIntArrayArray21[local106][arg2] = arg0;
			}
		} else if (local29) {
			for (local106 = arg1; local106 <= arg3; local106++) {
				Static139.anIntArrayArray21[local106][arg4] = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BB)Lclient!oh;")
	public static Class1_Sub1_Sub10 method3347(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) Class1_Sub1_Sub10_Sub1 local17 = new Class1_Sub1_Sub10_Sub1(arg0, Static169.anIntArray370, Static228.anIntArray507, Static8.anIntArray20, Static101.anIntArray191, Static191.aByteArrayArray11);
			Static216.method3375();
			return local17;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!gj;)V")
	public static void method3348(@OriginalArg(1) Class20_Sub3_Sub1 arg0) {
		@Pc(8) Class1_Sub16 local8 = (Class1_Sub16) Static153.aClass90_16.method2819(arg0.aClass50_493.method1221());
		if (local8 == null) {
			return;
		}
		if (local8.aClass1_Sub12_Sub4_2 != null) {
			Static226.aClass1_Sub12_Sub1_2.method894(local8.aClass1_Sub12_Sub4_2);
			local8.aClass1_Sub12_Sub4_2 = null;
		}
		local8.method3525();
	}
}
