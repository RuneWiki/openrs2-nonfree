import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Lclient!lg;")
	public static Class60 aClass60_8;

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	public static int anInt2272 = -1;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "Lclient!ph;")
	public static Class154 aClass154_35 = new Class154(64);

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString77 = "";

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
	public static int anInt2288 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLclient!am;)V")
	public static void method1853(@OriginalArg(1) Class11 arg0) {
		Static143.aClass11_67 = arg0;
		Static44.anInt942 = Static143.aClass11_67.method292(15);
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
	public static void method1854() {
		for (@Pc(10) Class4_Sub26 local10 = (Class4_Sub26) Static332.aClass130_149.method3499(); local10 != null; local10 = (Class4_Sub26) Static332.aClass130_149.method3512()) {
			if (local10.anInt3643 > 0) {
				local10.anInt3643--;
			}
			if (local10.anInt3643 != 0) {
				if (local10.anInt3642 > 0) {
					local10.anInt3642--;
				}
				if (local10.anInt3642 == 0 && local10.anInt3634 >= 1 && local10.anInt3641 >= 1 && local10.anInt3634 <= Static92.anInt2048 - 2 && Static290.anInt5893 - 2 >= local10.anInt3641 && (local10.anInt3631 < 0 || Static154.method2992(local10.anInt3631, local10.anInt3636))) {
					Static32.method3141(local10.anInt3626, local10.anInt3628, local10.anInt3634, local10.anInt3639, -1, local10.anInt3641, local10.anInt3636, local10.anInt3631);
					local10.anInt3642 = -1;
					if (local10.anInt3631 == local10.anInt3638 && local10.anInt3638 == -1) {
						local10.method5667();
					} else if (local10.anInt3638 == local10.anInt3631 && local10.anInt3628 == local10.anInt3629 && local10.anInt3636 == local10.anInt3640) {
						local10.method5667();
					}
				}
			} else if (local10.anInt3638 < 0 || Static154.method2992(local10.anInt3638, local10.anInt3640)) {
				Static32.method3141(local10.anInt3626, local10.anInt3629, local10.anInt3634, local10.anInt3639, -1, local10.anInt3641, local10.anInt3640, local10.anInt3638);
				local10.method5667();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
	public static void method1855() {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(0, 15);
		local8.method2034();
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(IB)V")
	public static void method1856(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub41 local12 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg0);
		if (local12 != null) {
			for (@Pc(24) int local24 = 0; local24 < local12.anIntArray538.length; local24++) {
				local12.anIntArray538[local24] = -1;
				local12.anIntArray537[local24] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)I")
	public static int method1857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static249.method4314(arg1 - 1, arg0 + -1) + Static249.method4314(arg1 - 1, arg0 + 1) + Static249.method4314(arg1 + 1, arg0 + -1) + Static249.method4314(arg1 + 1, arg0 + 1);
		@Pc(75) int local75 = Static249.method4314(arg1, arg0 - 1) + Static249.method4314(arg1, arg0 + 1) + Static249.method4314(arg1 + -1, arg0) + Static249.method4314(arg1 + 1, arg0);
		@Pc(80) int local80 = Static249.method4314(arg1, arg0);
		return local41 / 16 + local75 / 8 + local80 / 4;
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
	public static void method1858() {
		Static113.anInt6467 = 0;
		@Pc(12) int local12 = Static10.anInt231 + (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7);
		@Pc(25) int local25 = (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7) + Static81.anInt1732;
		if (local12 >= 3053 && local12 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static113.anInt6467 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static113.anInt6467 = 1;
		}
		if (Static113.anInt6467 == 1 && local12 >= 3139 && local12 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static113.anInt6467 = 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
	public static void method1860() {
		if (Static156.aBoolean292) {
			return;
		}
		if (Static166.aBoolean307) {
			Static174.aFloat39 = (int) Static174.aFloat39 + 47 & 0xFFFFFFF0;
		} else {
			Static203.aFloat41 += (12.0F - Static203.aFloat41) / 2.0F;
		}
		Static275.aBoolean495 = true;
		Static156.aBoolean292 = true;
	}
}
