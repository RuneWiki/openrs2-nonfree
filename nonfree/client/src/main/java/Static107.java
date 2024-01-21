import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "[Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4[] aClass10_Sub1_Sub1_Sub4Array5;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!w;")
	public static Class15 aClass15_36;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Lclient!eb;")
	public static Class17 aClass17_5;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!he;")
	public static Class11 aClass11_59;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public static int anInt2431;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!va;")
	private static Class61 aClass61_968 = Static88.method1421("Loaded wordpack");

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!va;")
	public static Class61 aClass61_969 = aClass61_968;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!i;")
	public static Class29 aClass29_66 = new Class29(64);

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_970 = Static88.method1421("Mem:");

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!i;")
	public static Class29 aClass29_67 = new Class29(100);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method1498() {
		aClass61_969 = null;
		aClass61_970 = null;
		aClass61_968 = null;
		aClass17_5 = null;
		aClass29_67 = null;
		aClass11_59 = null;
		aClass29_66 = null;
		aClass15_36 = null;
		aClass10_Sub1_Sub1_Sub4Array5 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZZ)I")
	public static int method1499() {
		return Static102.anInt2598 + Static81.anInt2196;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!va;I)V")
	public static void method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class61 arg4) {
		if (Static23.anInt747 >= 500) {
			return;
		}
		Static19.aClass61Array7[Static23.anInt747] = arg4;
		Static29.anIntArray96[Static23.anInt747] = arg2;
		Static33.anIntArray108[Static23.anInt747] = arg3;
		Static38.anIntArray121[Static23.anInt747] = arg1;
		Static22.anIntArray78[Static23.anInt747] = arg0;
		Static23.anInt747++;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public static void method1507() {
		Static79.aClass29_58.method646();
	}
}
