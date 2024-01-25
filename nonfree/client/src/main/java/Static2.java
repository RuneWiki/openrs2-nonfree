import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "Lclient!raa;")
	public static Class295 aClass295_1 = null;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
	public static int anInt7 = 0;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "[I")
	public static final int[] anIntArray1 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIII)V")
	public static void method20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		if (arg1 > arg3) {
			for (local14 = arg3; local14 < arg1; local14++) {
				Static249.anIntArrayArray23[local14][arg0] = arg2;
			}
		} else {
			for (local14 = arg1; local14 < arg3; local14++) {
				Static249.anIntArrayArray23[local14][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIB)V")
	public static void method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class5_Sub5_Sub21 local16 = Static101.method1629(8, arg3);
		local16.method8958();
		local16.anInt10537 = arg0;
		local16.anInt10530 = arg2;
		local16.anInt10533 = arg1;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!ofa;)Lclient!jr;")
	public static Class185 method23(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(12) int local12 = arg0.method5968();
		return new Class185(local12);
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)I")
	public static int method27() {
		if ((double) Static620.aFloat146 == 3.0D) {
			return 37;
		} else if ((double) Static620.aFloat146 == 4.0D) {
			return 50;
		} else if ((double) Static620.aFloat146 == 6.0D) {
			return 75;
		} else if ((double) Static620.aFloat146 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V")
	public static void method29() {
		Static59.method980();
		Static142.aBoolean190 = false;
		Static129.method1916(Static346.anInt4654, Static644.anInt10625, Static115.anInt2157, Static612.anInt10212);
	}
}
