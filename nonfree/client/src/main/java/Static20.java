import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cb", name = "Sb", descriptor = "Lclient!wc;")
	public static Class1_Sub1_Sub12_Sub3_Sub1 aClass1_Sub1_Sub12_Sub3_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "Ub", descriptor = "Lclient!re;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "Lclient!td;")
	public static Class79 aClass79_2 = new Class79(30);

	@OriginalMember(owner = "client!cb", name = "zb", descriptor = "[I")
	public static int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!cb", name = "Ab", descriptor = "Lclient!ed;")
	public static Class23 aClass23_239 = Static169.method2903("mapdots");

	@OriginalMember(owner = "client!cb", name = "Jb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_240 = Static169.method2903("hitmarks");

	@OriginalMember(owner = "client!cb", name = "Mb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_241 = Static169.method2903("Checking for updates )2 ");

	@OriginalMember(owner = "client!cb", name = "Ob", descriptor = "Lclient!ed;")
	public static Class23 aClass23_242 = aClass23_241;

	@OriginalMember(owner = "client!cb", name = "Pb", descriptor = "I")
	public static int anInt670 = 0;

	@OriginalMember(owner = "client!cb", name = "Rb", descriptor = "I")
	public static volatile int anInt672 = 0;

	@OriginalMember(owner = "client!cb", name = "Tb", descriptor = "[I")
	public static int[] anIntArray90 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method372() {
		@Pc(8) Class35 local8 = Static129.aClass35_1;
		synchronized (Static129.aClass35_1) {
			Static7.anInt324 = Static91.anInt2415;
			@Pc(16) int local16;
			if (Static170.anInt803 < 0) {
				for (local16 = 0; local16 < 112; local16++) {
					Static92.aBooleanArray11[local16] = false;
				}
				Static170.anInt803 = Static30.anInt2832;
			} else {
				while (Static30.anInt2832 != Static170.anInt803) {
					local16 = Static60.anIntArray610[Static30.anInt2832];
					Static30.anInt2832 = Static30.anInt2832 + 1 & 0x7F;
					if (local16 < 0) {
						Static92.aBooleanArray11[~local16] = false;
					} else {
						Static92.aBooleanArray11[local16] = true;
					}
				}
			}
			Static91.anInt2415 = Static97.anInt2500;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public static void method378(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static37.aBoolean48) {
			Static30.method1958();
		} else if (arg0 != -1 && (arg0 != Static77.anInt2101 || !Static67.method1187()) && Static38.anInt1035 != 0 && !Static37.aBoolean48) {
			Static139.method2445(arg0, Static167.aClass30_Sub1_18, Static38.anInt1035, 0);
		}
		Static77.anInt2101 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method379() {
		aClass23_240 = null;
		aClass23_242 = null;
		aClass23_239 = null;
		aClass79_2 = null;
		aClass73_1 = null;
		aClass23_241 = null;
		aClass1_Sub1_Sub12_Sub3_Sub1_1 = null;
		anIntArray90 = null;
		anIntArray87 = null;
	}
}
