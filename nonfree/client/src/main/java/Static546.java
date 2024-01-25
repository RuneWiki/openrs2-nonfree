import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "Lclient!tf;")
	public static Class322 aClass322_149;

	@OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
	public static int anInt8712 = 0;

	@OriginalMember(owner = "client!vba", name = "u", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_1 = new Class224(14, 1);

	@OriginalMember(owner = "client!vba", name = "E", descriptor = "[[B")
	public static final byte[][] aByteArrayArray21 = new byte[1000][];

	@OriginalMember(owner = "client!vba", name = "J", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_2 = new Class224(15, 4);

	@OriginalMember(owner = "client!vba", name = "L", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_3 = new Class224(16, -2);

	@OriginalMember(owner = "client!vba", name = "N", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_4 = new Class224(17, 0);

	@OriginalMember(owner = "client!vba", name = "Q", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_5 = new Class224(18, -2);

	@OriginalMember(owner = "client!vba", name = "V", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_6 = new Class224(19, -2);

	@OriginalMember(owner = "client!vba", name = "W", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_7 = new Class224(20, 6);

	@OriginalMember(owner = "client!vba", name = "X", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_8 = new Class224(21, 9);

	@OriginalMember(owner = "client!vba", name = "Y", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_9 = new Class224(22, -2);

	@OriginalMember(owner = "client!vba", name = "Z", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_10 = new Class224(23, 4);

	@OriginalMember(owner = "client!vba", name = "ab", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_11 = new Class224(24, -1);

	@OriginalMember(owner = "client!vba", name = "bb", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_12 = new Class224(25, -2);

	@OriginalMember(owner = "client!vba", name = "cb", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_13 = new Class224(26, 0);

	@OriginalMember(owner = "client!vba", name = "db", descriptor = "Lclient!nfa;")
	public static final Class224 aClass224_14 = new Class224(27, 0);

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method7274(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static68.aClass34Array1 == Static426.aClass34Array5) {
			return;
		}
		@Pc(10) int local10 = Static108.aClass34Array6[arg1].method6530(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class34 local23 = Static108.aClass34Array6[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method6530(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V")
	public static void method7277() {
		@Pc(11) int local11 = Static403.anInt6982;
		@Pc(13) int[] local13 = Static430.anIntArray447;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class41_Sub2_Sub1_Sub4_Sub2 local23 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local13[local15]];
			if (local23 != null) {
				Static333.method4751(local23.method7858(), local23);
			}
		}
	}
}
