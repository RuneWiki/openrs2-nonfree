import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!di", name = "Y", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!di", name = "ob", descriptor = "I")
	public static int anInt1194;

	@OriginalMember(owner = "client!di", name = "nb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_414 = Static161.method2971("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_413 = aClass13_414;

	@OriginalMember(owner = "client!di", name = "ib", descriptor = "Lclient!bi;")
	public static Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!di", name = "pb", descriptor = "I")
	public static int anInt1195 = 0;

	@OriginalMember(owner = "client!di", name = "qb", descriptor = "Lclient!ld;")
	public static Class47 aClass47_8 = new Class47(64);

	@OriginalMember(owner = "client!di", name = "sb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_415 = Static161.method2971("::autoshadow on");

	@OriginalMember(owner = "client!di", name = "tb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20 = new byte[4][104][104];

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
	public static void method976() {
		anIntArray128 = null;
		aClass47_8 = null;
		aClass13_414 = null;
		aClass13_413 = null;
		aClass13_415 = null;
		aClass6_1 = null;
		aByteArrayArrayArray20 = null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZII)V")
	public static void method978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static53.anInt1722 < 2 && Static116.anInt3103 == 0 && !Static118.aBoolean233) {
			return;
		}
		@Pc(45) Class13 local45;
		if (Static116.anInt3103 == 1 && Static53.anInt1722 < 2) {
			local45 = Static57.method1349(new Class13[] { Static57.aClass13_608, Static69.aClass13_679, Static141.aClass13_1202, Static50.aClass13_556 });
		} else if (Static118.aBoolean233 && Static53.anInt1722 < 2) {
			local45 = Static57.method1349(new Class13[] { Static113.aClass13_1022, Static69.aClass13_679, Static147.aClass13_1236, Static50.aClass13_556 });
		} else {
			local45 = Static98.method2705(Static53.anInt1722 - 1);
		}
		if (Static53.anInt1722 > 2) {
			local45 = Static57.method1349(new Class13[] { local45, Static59.aClass13_625, Static3.method75(Static53.anInt1722 - 2), Static19.aClass13_269 });
		}
		@Pc(125) int local125 = Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method256(local45, arg1 + 4, arg0 + 15, Static155.aRandom3, Static65.anInt1932);
		Static186.method3019(15, local125 + Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method246(local45), arg1 + 4, arg0);
	}
}
