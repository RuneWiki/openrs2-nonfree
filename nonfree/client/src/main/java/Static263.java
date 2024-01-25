import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
	public static int anInt4843;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "J")
	public static long aLong121;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "Lclient!jv;")
	public static final Class181 aClass181_1 = new Class181(0, 3, Static47.aClass42_8);

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "Lclient!jv;")
	public static final Class181 aClass181_2 = new Class181(1, 3, Static47.aClass42_8);

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "Lclient!jv;")
	public static final Class181 aClass181_3 = new Class181(2, 4, Static47.aClass42_4);

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "Lclient!jv;")
	public static final Class181 aClass181_4 = new Class181(3, 1, Static47.aClass42_8);

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "Lclient!jv;")
	public static final Class181 aClass181_5 = new Class181(4, 2, Static47.aClass42_8);

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "Lclient!jv;")
	public static final Class181 aClass181_6 = new Class181(5, 3, Static47.aClass42_8);

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!jv;")
	public static final Class181 aClass181_7 = new Class181(6, 4, Static47.aClass42_8);

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
	public static final int anInt4842 = Static233.method3626(16);

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_86 = new Class286(83, -1);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)Lclient!jv;")
	public static Class181 method4045(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass181_1;
		} else if (arg0 == 1) {
			return aClass181_2;
		} else if (arg0 == 2) {
			return aClass181_3;
		} else if (arg0 == 3) {
			return aClass181_4;
		} else if (arg0 == 4) {
			return aClass181_5;
		} else if (arg0 == 5) {
			return aClass181_6;
		} else if (arg0 == 6) {
			return aClass181_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)Z")
	public static boolean method4046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static480.method6784(arg1, arg0)) {
			return Static282.method4208(arg1, arg0) | (arg0 & 0x9000) != 0 | Static236.method3656(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static64.method1032(arg1, arg0) | Static58.method949(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!pl;IIIIZI)V")
	public static void method4047(@OriginalArg(0) Class259 arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2) {
		Static554.aClass259_166 = arg0;
		Static526.anInt8654 = arg2;
		Static219.anInt4151 = 0;
		Static409.anInt7111 = 1;
		Static185.anInt9183 = arg1;
		Static206.anInt4003 = 2;
		Static362.aBoolean487 = false;
	}
}
