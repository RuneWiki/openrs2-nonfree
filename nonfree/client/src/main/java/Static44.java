import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!gd", name = "mb", descriptor = "[[Lclient!wf;")
	public static Class8_Sub24[][] aClass8_Sub24ArrayArray1;

	@OriginalMember(owner = "client!gd", name = "yb", descriptor = "Lclient!pd;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "Lclient!ic;")
	public static Class34 aClass34_562 = Static56.method816("Hidden)2");

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
	public static int anInt1059 = 0;

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "[I")
	public static int[] anIntArray144 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!gd", name = "hb", descriptor = "[[B")
	public static byte[][] aByteArrayArray27 = new byte[1000][];

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_563 = Static56.method816("0(U");

	@OriginalMember(owner = "client!gd", name = "kb", descriptor = "Lclient!m;")
	public static Class49 aClass49_5 = new Class49();

	@OriginalMember(owner = "client!gd", name = "pb", descriptor = "[Lclient!wd;")
	public static Class8_Sub20[] aClass8_Sub20Array1 = new Class8_Sub20[2048];

	@OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
	public static int anInt1073 = -1;

	@OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!gd", name = "xb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_564 = Static56.method816("Weiter");

	@OriginalMember(owner = "client!gd", name = "zb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_565 = Static56.method816("Existing User");

	@OriginalMember(owner = "client!gd", name = "Ab", descriptor = "Lclient!ic;")
	public static Class34 aClass34_566 = aClass34_565;

	@OriginalMember(owner = "client!gd", name = "Bb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_567 = Static56.method816("<col=00ff80>");

	@OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_568 = Static56.method816("null");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILclient!wf;IIII)V")
	public static void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub24 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static82.aBoolean76) {
			Static57.anInt1478 = 32;
		} else {
			Static57.anInt1478 = 0;
		}
		Static82.aBoolean76 = false;
		@Pc(148) int local148;
		if (Static134.anInt3170 != 0) {
			if (arg6 <= arg5 && arg6 + 16 > arg5 && arg4 <= arg2 && arg4 + 16 > arg2) {
				arg3.anInt3103 -= 4;
				Static40.method608(arg3);
			} else if (arg6 <= arg5 && arg5 < arg6 + 16 && arg4 + arg1 - 16 <= arg2 && arg1 + arg4 > arg2) {
				arg3.anInt3103 += 4;
				Static40.method608(arg3);
			} else if (arg6 - Static57.anInt1478 <= arg5 && Static57.anInt1478 + arg6 + 16 > arg5 && arg2 >= arg4 + 16 && arg2 < arg4 + arg1 - 16) {
				@Pc(131) int local131 = arg1 * (arg1 - 32) / arg0;
				if (local131 < 8) {
					local131 = 8;
				}
				local148 = arg2 - arg4 - local131 / 2 - 16;
				@Pc(154) int local154 = arg1 - local131 - 32;
				arg3.anInt3103 = (arg0 - arg1) * local148 / local154;
				Static40.method608(arg3);
				Static82.aBoolean76 = true;
			}
		}
		if (Static129.anInt3044 == 0) {
			return;
		}
		local148 = arg3.anInt3154;
		if (arg6 - local148 <= arg5 && arg2 >= arg4 && arg6 + 16 > arg5 && arg1 + arg4 >= arg2) {
			arg3.anInt3103 += Static129.anInt3044 * 45;
			Static40.method608(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Lclient!oa;")
	public static Class9 method668() {
		try {
			return (Class9) Class.forName("Class9_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lclient!ic;B)Lclient!ic;")
	public static Class34 method669(@OriginalArg(0) Class34[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static30.method524(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public static void method670() {
		aClass34_567 = null;
		aClass34_562 = null;
		aClass8_Sub24ArrayArray1 = null;
		aClass8_Sub20Array1 = null;
		aClass34_565 = null;
		aClass34_564 = null;
		aClass34_563 = null;
		aClass49_5 = null;
		aClass61_1 = null;
		anIntArray144 = null;
		aClass34_568 = null;
		aClass34_566 = null;
		aByteArrayArray27 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!dd;Lclient!dd;I)V")
	public static void method671(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1) {
		Static73.aClass14_19 = arg0;
		Static20.aClass14_5 = arg1;
		Static48.anInt2954 = Static20.aClass14_5.method1144(3);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Lclient!ic;")
	public static Class34 method672(@OriginalArg(0) int arg0) {
		return Static95.method1348(false, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!wf;B)Lclient!wf;")
	public static Class8_Sub24 method674(@OriginalArg(0) Class8_Sub24 arg0) {
		@Pc(20) int local20 = Static116.method1641(Static99.method1445(arg0));
		if (local20 == 0) {
			return null;
		}
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			arg0 = Static113.method1614(arg0.anInt3166);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
