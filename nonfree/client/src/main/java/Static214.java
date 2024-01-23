import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
	public static int anInt4634 = 0;

	@OriginalMember(owner = "client!uh", name = "bb", descriptor = "[Lclient!dg;")
	public static Class28_Sub1[] aClass28_Sub1Array1 = new Class28_Sub1[256];

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(III)I")
	public static int method3464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		return Static191.aClass1_Sub2_Sub12_1 != null && Static191.aClass1_Sub2_Sub12_1.aLong177 == local10 ? Static158.aClass1_Sub26_4.anInt4021 * 99 / (Static158.aClass1_Sub26_4.aByteArray52.length - Static191.aClass1_Sub2_Sub12_1.aByte10) + 1 : 0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!sc;)V")
	public static void method3466(@OriginalArg(1) Class107 arg0) {
		Static30.aClass107_204 = arg0;
		if (Static117.aClass34_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) Class107 local15 = Static165.aClass107_635.method3083(Static117.aClass34_2.anApplet1);
			@Pc(21) Class107 local21 = Static220.aClass107_1302.method3083(Static117.aClass34_2.anApplet1);
			@Pc(46) Class107 local46 = Static149.method2437(new Class107[] { local15, Static94.aClass107_573, arg0, Static40.aClass107_284, local21 });
			if (arg0.method3095() == 0) {
				local46 = Static149.method2437(new Class107[] { local46, Static153.aClass107_892 });
			} else {
				local46 = Static149.method2437(new Class107[] { local46, Static212.aClass107_1239, Static168.method2685(Static209.method3309() + 94608000000L), Static132.aClass107_769, Static152.method2502(94608000L) });
			}
			Static149.method2437(new Class107[] { Static72.aClass107_477, local46, Static55.aClass107_388 }).method3088(Static117.aClass34_2.anApplet1);
		} catch (@Pc(122) Throwable local122) {
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lclient!jb;I)Z")
	public static boolean method3467(@OriginalArg(0) Class28 arg0) {
		return arg0.method824(Static121.anInt2656);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLclient!jb;)V")
	public static void method3468(@OriginalArg(1) Class28 arg0) {
		Static113.aClass28_44 = arg0;
	}
}
