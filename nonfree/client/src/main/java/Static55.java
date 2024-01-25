import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
	public static int anInt1125;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "Lclient!ui;")
	public static Class231 aClass231_1;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_22 = new Class57("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "Z")
	public static boolean aBoolean64 = true;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "Lclient!us;")
	public static final Class234 aClass234_22 = new Class234(16, -2);

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Lclient!us;")
	public static final Class234 aClass234_23 = new Class234(54, 2);

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
	public static int anInt1126 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public static void method996() {
		Static246.anInt4422 = 0;
		@Pc(13) int local13 = (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7) + Static21.anInt265;
		@Pc(25) int local25 = Static103.anInt2044 + (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static246.anInt4422 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static246.anInt4422 = 1;
		}
		if (Static246.anInt4422 == 1 && local13 >= 3139 && local13 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static246.anInt4422 = 0;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!dt;II)V")
	public static void method1001(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) int arg2) {
		Static103.anInt2048 = arg2;
		Static110.anInt2157 = arg0;
		Static221.aClass62_13 = arg1;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)Lclient!pc;")
	public static Class52 method1004() {
		try {
			return (Class52) Class.forName("Class52_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)I")
	public static int method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static337.aClass7Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static12.anInt161 - 1 || Static44.anInt787 - 1 < local15) {
			return 0;
		}
		@Pc(40) int local40 = arg1;
		if (arg1 < 3 && (Static13.aByteArrayArrayArray17[1][local11][local15] & 0x2) != 0) {
			local40 = arg1 + 1;
		}
		return Static337.aClass7Array3[local40].method5638(arg2, arg0);
	}
}
