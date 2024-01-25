import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public static int anInt112 = 0;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_2 = new Class156(71, 6);

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Lclient!mm;")
	public static final Class240 aClass240_1 = new Class240("WIP", 2);

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "[Lclient!kt;")
	public static final Class212[] aClass212Array1 = new Class212[8];

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)I")
	public static int method133(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method134() {
		Static60.aBoolean80 = true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(CB)Z")
	public static boolean method136(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lclient!hu;")
	public static Class51_Sub1 method137(@OriginalArg(0) int arg0) {
		return Static189.aBoolean250 && arg0 >= Static13.anInt166 && arg0 <= Static470.anInt7634 ? Static186.aClass51_Sub1Array1[arg0 - Static13.anInt166] : null;
	}
}
