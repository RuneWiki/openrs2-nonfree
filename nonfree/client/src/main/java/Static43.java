import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
	public static int anInt1126;

	@OriginalMember(owner = "client!ee", name = "ub", descriptor = "I")
	public static int anInt1134;

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_350 = Static181.method2795("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "[S")
	public static final short[] aShortArray14 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ee", name = "wb", descriptor = "I")
	public static int anInt1135 = 0;

	@OriginalMember(owner = "client!ee", name = "zb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_351 = Static181.method2795("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ee", name = "Eb", descriptor = "Lclient!s;")
	public static final Class86 aClass86_15 = new Class86(64);

	@OriginalMember(owner = "client!ee", name = "Fb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_352 = aClass83_350;

	@OriginalMember(owner = "client!ee", name = "Hb", descriptor = "I")
	public static int anInt1142 = 20;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!qe;IILclient!qe;SBJ)V")
	public static void method884(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) short arg4, @OriginalArg(6) long arg5) {
		if (Static159.aBoolean152 || Static98.anInt2124 >= 500) {
			return;
		}
		Static189.aClass83Array55[Static98.anInt2124] = arg0;
		Static22.aClass83Array12[Static98.anInt2124] = arg3;
		Static22.aShortArray9[Static98.anInt2124] = arg4;
		Static212.aLongArray9[Static98.anInt2124] = arg5;
		Static2.anIntArray1[Static98.anInt2124] = arg1;
		Static94.anIntArray201[Static98.anInt2124] = arg2;
		Static98.anInt2124++;
	}
}
