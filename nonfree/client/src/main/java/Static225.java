import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt4567;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array87;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public static int anInt4572 = 0;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_238 = new Class159("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method4041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg4 && arg0 == arg6 && arg8 == arg2 && arg3 == arg5) {
			Static129.method2645(arg5, arg6, arg7, arg1, arg8);
			return;
		}
		@Pc(27) int local27 = arg7;
		@Pc(29) int local29 = arg6;
		@Pc(33) int local33 = arg7 * 3;
		@Pc(37) int local37 = arg6 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg0 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(53) int local53 = arg3 * 3;
		@Pc(63) int local63 = local41 + arg8 - arg7 - local49;
		@Pc(73) int local73 = local45 + arg5 - arg6 - local53;
		@Pc(82) int local82 = local33 + local49 - local41 - local41;
		@Pc(91) int local91 = local37 + local53 - local45 - local45;
		@Pc(96) int local96 = local41 - local33;
		@Pc(101) int local101 = local45 - local37;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(111) int local111 = local103 * local103 >> 12;
			@Pc(117) int local117 = local103 * local111 >> 12;
			@Pc(121) int local121 = local63 * local117;
			@Pc(125) int local125 = local117 * local73;
			@Pc(129) int local129 = local111 * local82;
			@Pc(133) int local133 = local91 * local111;
			@Pc(137) int local137 = local103 * local96;
			@Pc(141) int local141 = local103 * local101;
			@Pc(152) int local152 = arg7 + (local137 + local129 + local121 >> 12);
			@Pc(163) int local163 = (local141 + local125 + local133 >> 12) + arg6;
			Static129.method2645(local163, local29, local27, arg1, local152);
			local27 = local152;
			local29 = local163;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lclient!b;")
	public static Class14 method4042(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static330.aClass198_235;
		@Pc(14) Class14 local14;
		synchronized (Static330.aClass198_235) {
			local14 = (Class14) Static330.aClass198_235.method5210((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(43) byte[] local43 = Static90.aClass193_33.method5047(Static120.method2527(arg0), Static123.method2570(arg0));
		local14 = new Class14();
		local14.anInt353 = arg0;
		if (local43 != null) {
			local14.method308(new Class4_Sub11(local43));
		}
		local14.method304();
		@Pc(66) Class198 local66 = Static330.aClass198_235;
		synchronized (Static330.aClass198_235) {
			Static330.aClass198_235.method5201(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public static void method4043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static285.anInt5603 = arg0 - Static54.anInt4748;
		Static116.anInt2756 = arg1 - Static54.anInt4745;
	}
}
