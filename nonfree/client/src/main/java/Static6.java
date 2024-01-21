import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] aClass5_Sub1_Sub10_Sub3Array1;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "[Lclient!vc;")
	public static Class71[] aClass71Array2;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "Lclient!oa;")
	public static Class7 aClass7_10;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_156 = Static38.method736("Titelbild geladen)3");

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!vc;")
	private static Class71 aClass71_157 = Static38.method736("Unable to find ");

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_158 = Static38.method736("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_159 = aClass71_157;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_160 = Static38.method736(" )2> @lre@");

	@OriginalMember(owner = "client!b", name = "n", descriptor = "I")
	public static int anInt222 = -1;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!qa;")
	public static Class54 aClass54_3 = new Class54(20);

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	public static int anInt226 = 0;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "[I")
	public static int[] anIntArray11 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!vc;")
	public static Class71 aClass71_161 = Static38.method736("Handel)4Duell");

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Lclient!vc;")
	public static Class71 aClass71_162 = Static38.method736("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!b", name = "y", descriptor = "I")
	public static int anInt227 = 0;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_163 = Static38.method736("::qa_op_test");

	@OriginalMember(owner = "client!b", name = "B", descriptor = "Lclient!vc;")
	public static Class71 aClass71_164 = Static38.method736("");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)I")
	public static int method152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 & arg1 - 1;
		@Pc(13) int local13 = arg0 / arg1;
		@Pc(19) int local19 = arg1 - 1 & arg0;
		@Pc(23) int local23 = arg2 / arg1;
		@Pc(33) int local33 = Static105.method1658(local23, local13);
		@Pc(40) int local40 = Static105.method1658(local23 + 1, local13);
		@Pc(47) int local47 = Static105.method1658(local23, local13 + 1);
		@Pc(56) int local56 = Static105.method1658(local23 + 1, local13 - -1);
		@Pc(63) int local63 = Static58.method1030(arg1, local33, local9, local40);
		@Pc(70) int local70 = Static58.method1030(arg1, local47, local9, local56);
		return Static58.method1030(arg1, local63, local19, local70);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	public static int method154() {
		return 19;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!nb;III)Z")
	public static boolean method156(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) byte[] local17 = arg0.method679(arg1, arg2);
		if (local17 == null) {
			return false;
		} else {
			Static109.method1741(local17);
			return true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!me;I)Z")
	public static boolean method159(@OriginalArg(0) Class5_Sub1_Sub11 arg0) {
		if (Static3.aBoolean3) {
			if (Static23.method545(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1790 == 0) {
				return false;
			}
		}
		return arg0.aBoolean78;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method160() {
		aClass71_163 = null;
		aClass54_3 = null;
		aClass71Array2 = null;
		anIntArray11 = null;
		anIntArray10 = null;
		aClass71_164 = null;
		aClass71_156 = null;
		aClass7_10 = null;
		aClass71_157 = null;
		aClass71_160 = null;
		aClass71_161 = null;
		aClass71_159 = null;
		aClass71_158 = null;
		aClass71_162 = null;
		aClass5_Sub1_Sub10_Sub3Array1 = null;
	}
}
