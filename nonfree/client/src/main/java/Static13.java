import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public static final int anInt158 = 12;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Lclient!ff;")
	public static final Class7_Sub16 aClass7_Sub16_1 = new Class7_Sub16(0, -1);

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "[B")
	public static final byte[] aByteArray6 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	public static void method115(@OriginalArg(0) int arg0) {
		Static352.anInt5643 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static264.anInt4480; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static295.anInt4910; local6++) {
				if (Static19.aClass223ArrayArrayArray1[arg0][local3][local6] == null) {
					Static19.aClass223ArrayArrayArray1[arg0][local3][local6] = new Class223(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIBIII)V")
	public static void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(15) int local15 = arg3 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static131.method2099(arg4, arg1, arg2, arg3);
			}
		} else if (local15 == 0) {
			Static226.method3131(arg1, arg2, arg0, arg4);
		} else {
			@Pc(44) int local44 = (local15 << 12) / local10;
			@Pc(61) int local61 = arg2 - (local44 * arg4 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (arg0 < Static293.anInt4886) {
				local73 = (Static293.anInt4886 * local44 >> 12) + local61;
				local75 = Static293.anInt4886;
			} else if (arg0 <= Static137.anInt2576) {
				local73 = arg3;
				local75 = arg0;
			} else {
				local75 = Static137.anInt2576;
				local73 = (Static137.anInt2576 * local44 >> 12) + local61;
			}
			@Pc(112) int local112;
			@Pc(110) int local110;
			if (Static293.anInt4886 > arg4) {
				local110 = (Static293.anInt4886 * local44 >> 12) + local61;
				local112 = Static293.anInt4886;
			} else if (Static137.anInt2576 < arg4) {
				local112 = Static137.anInt2576;
				local110 = (local44 * Static137.anInt2576 >> 12) + local61;
			} else {
				local112 = arg4;
				local110 = arg2;
			}
			if (local110 < Static316.anInt5188) {
				local110 = Static316.anInt5188;
				local112 = (Static316.anInt5188 - local61 << 12) / local44;
			} else if (Static82.anInt1667 < local110) {
				local110 = Static82.anInt1667;
				local112 = (Static82.anInt1667 - local61 << 12) / local44;
			}
			if (local73 < Static316.anInt5188) {
				local73 = Static316.anInt5188;
				local75 = (Static316.anInt5188 - local61 << 12) / local44;
			} else if (local73 > Static82.anInt1667) {
				local73 = Static82.anInt1667;
				local75 = (Static82.anInt1667 - local61 << 12) / local44;
			}
			Static197.method2829(arg1, local73, local112, local75, local110);
		}
	}
}
