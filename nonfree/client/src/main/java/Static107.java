import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "Lclient!sb;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
	public static int anInt2777;

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
	public static int anInt2778;

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "Lclient!r;")
	private static Class61 aClass61_835 = Static129.method2060("Loading wordpack )2 ");

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
	public static volatile int anInt2767 = 0;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array19 = new Class61[500];

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "[I")
	public static int[] anIntArray337 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_836 = aClass61_835;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "Lclient!r;")
	public static Class61 aClass61_837 = Static129.method2060("null");

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
	public static int anInt2772 = 0;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "Lclient!r;")
	private static Class61 aClass61_838 = Static129.method2060("Bad session id)3");

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
	private static int anInt2773 = -1;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lclient!r;")
	public static Class61 aClass61_839 = aClass61_838;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	public static void method1787() {
		aClass6_1 = null;
		anIntArray337 = null;
		aClass61_836 = null;
		aClass61_839 = null;
		aClass61_838 = null;
		aClass61_835 = null;
		aClass61Array19 = null;
		anIntArray338 = null;
		aClass61_837 = null;
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)Z")
	public static boolean method1793() {
		return Static58.anInt1425 == 0 ? Static111.aClass5_Sub5_Sub1_2.method240() : true;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lclient!ke;I)V")
	public static void method1794(@OriginalArg(0) Class5_Sub11 arg0) {
		@Pc(6) int local6 = arg0.anInt1627;
		if (local6 == 324) {
			if (Static41.anInt2301 == -1) {
				Static41.anInt2301 = arg0.anInt1651;
				anInt2773 = arg0.anInt1639;
			}
			if (Static110.aClass37_1.aBoolean48) {
				arg0.anInt1651 = Static41.anInt2301;
			} else {
				arg0.anInt1651 = anInt2773;
			}
		} else if (local6 == 325) {
			if (Static41.anInt2301 == -1) {
				anInt2773 = arg0.anInt1639;
				Static41.anInt2301 = arg0.anInt1651;
			}
			if (Static110.aClass37_1.aBoolean48) {
				arg0.anInt1651 = anInt2773;
			} else {
				arg0.anInt1651 = Static41.anInt2301;
			}
		} else if (local6 == 327) {
			arg0.anInt1647 = 150;
			arg0.anInt1671 = (int) (Math.sin((double) Static58.anInt1422 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1679 = 0;
			arg0.anInt1649 = 5;
		} else if (local6 == 328) {
			arg0.anInt1647 = 150;
			arg0.anInt1671 = (int) (Math.sin((double) Static58.anInt1422 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1649 = 5;
			arg0.anInt1679 = 1;
		}
	}
}
