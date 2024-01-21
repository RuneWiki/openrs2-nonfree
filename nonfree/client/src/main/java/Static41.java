import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static int anInt1087;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_420 = Static187.method3089("Error connecting to server)3");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!vd;")
	public static Class92 aClass92_418 = aClass92_420;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
	public static final int[] anIntArray84 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_419 = Static187.method3089("p11_full");

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_423 = Static187.method3089("Loading wordpack )2 ");

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!vd;")
	public static Class92 aClass92_421 = aClass92_423;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_2 = new Class77(50);

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_422 = Static187.method3089("weiss:");

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_424 = Static187.method3089("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "[Lclient!ca;")
	public static final Class16[] aClass16Array2 = new Class16[100];

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_425 = Static187.method3089("(U");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method730() {
		for (@Pc(15) Class1_Sub8 local15 = (Class1_Sub8) Static73.aClass20_6.method467(); local15 != null; local15 = (Class1_Sub8) Static73.aClass20_6.method468()) {
			if (local15.anInt1243 > 0) {
				local15.anInt1243--;
			}
			if (local15.anInt1243 != 0) {
				if (local15.anInt1252 > 0) {
					local15.anInt1252--;
				}
				if (local15.anInt1252 == 0 && local15.anInt1251 >= 1 && local15.anInt1250 >= 1 && local15.anInt1251 <= 102 && local15.anInt1250 <= 102 && (local15.anInt1238 < 0 || Static5.method96(local15.anInt1240, local15.anInt1238))) {
					Static192.method3140(local15.anInt1238, local15.anInt1249, local15.anInt1248, local15.anInt1239, local15.anInt1250, local15.anInt1251, local15.anInt1240);
					local15.anInt1252 = -1;
					if (local15.anInt1238 == local15.anInt1242 && local15.anInt1242 == -1) {
						local15.method3414();
					} else if (local15.anInt1242 == local15.anInt1238 && local15.anInt1244 == local15.anInt1249 && local15.anInt1240 == local15.anInt1246) {
						local15.method3414();
					}
				}
			} else if (local15.anInt1242 < 0 || Static5.method96(local15.anInt1246, local15.anInt1242)) {
				Static192.method3140(local15.anInt1242, local15.anInt1244, local15.anInt1248, local15.anInt1239, local15.anInt1250, local15.anInt1251, local15.anInt1246);
				local15.method3414();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static void method731(@OriginalArg(1) int arg0) {
		if (Static83.anIntArray154 == null || Static83.anIntArray154.length < arg0) {
			Static83.anIntArray154 = new int[arg0];
		}
	}
}
