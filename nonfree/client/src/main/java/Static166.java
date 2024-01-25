import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	public static int anInt7796;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!sea;")
	public static Class308 aClass308_157;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	public static int anInt7795 = 0;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_49 = new Class111();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public static void method6219() {
		@Pc(1) Class207 local1 = Static580.aClass207_60;
		synchronized (Static580.aClass207_60) {
			Static580.aClass207_60.method4392();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!lj;III)Lclient!nea;")
	public static Class46_Sub2_Sub1 method6220(@OriginalArg(1) Class78_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aBoolean412 || method6223(arg1) && method6223(arg2)) {
			return new Class46_Sub2_Sub1(arg0, 3553, 6408, arg1, arg2);
		} else if (arg0.aBoolean436) {
			return new Class46_Sub2_Sub1(arg0, 34037, 6408, arg1, arg2);
		} else {
			return new Class46_Sub2_Sub1(arg0, 6408, arg1, arg2, Static122.method2187(arg1), Static122.method2187(arg2));
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!hw;)I")
	public static int method6222(@OriginalArg(1) Class148 arg0) {
		if (arg0 == Static47.aClass148_1) {
			return 5890;
		} else if (arg0 == Static155.aClass148_2) {
			return 34167;
		} else if (Static226.aClass148_3 == arg0) {
			return 34168;
		} else if (arg0 == Static276.aClass148_4) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
	public static boolean method6223(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
