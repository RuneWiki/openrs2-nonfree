import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array7;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!te;")
	public static Class75 aClass75_59 = new Class75(64);

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!na;")
	private static Class53 aClass53_992 = Static109.method1737("To create a new account you need to");

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	public static int[] anIntArray274 = new int[500];

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_993 = Static109.method1737("lila:");

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_994 = aClass53_992;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public static int anInt2087 = 0;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!na;")
	private static Class53 aClass53_995 = Static109.method1737("Too many connections from your address)3");

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_996 = Static109.method1737("backright2");

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_997 = aClass53_995;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method1444() {
		aClass75_59 = null;
		aClass3_Sub1_Sub5_Sub3Array7 = null;
		aClass53_993 = null;
		aClass53_994 = null;
		aClass53_996 = null;
		anIntArray273 = null;
		aClass53_997 = null;
		aClass53_992 = null;
		aClass53_995 = null;
		anIntArray274 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Z")
	public static boolean method1445(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public static void method1446(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static15.aBooleanArray1[arg0]) {
			return;
		}
		Static88.aClass62_17.method1508(arg0);
		if (Static107.aClass3_Sub1_Sub15ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(32) int local32 = 0; local32 < Static107.aClass3_Sub1_Sub15ArrayArray1[arg0].length; local32++) {
			if (Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local32] != null) {
				if (Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local32].anInt2707 == 2) {
					local25 = false;
				} else {
					Static107.aClass3_Sub1_Sub15ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local25) {
			Static107.aClass3_Sub1_Sub15ArrayArray1[arg0] = null;
		}
		Static15.aBooleanArray1[arg0] = false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[Lclient!na;)[Lclient!na;")
	public static Class53[] method1447(@OriginalArg(1) Class53[] arg0) {
		@Pc(13) Class53[] local13 = new Class53[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static103.method1689(new Class53[] { Static108.method1725(local15), Static61.aClass53_708 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static103.method1689(new Class53[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}
}
