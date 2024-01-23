import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!qn", name = "Hb", descriptor = "Lclient!ek;")
	public static Class42 aClass42_75;

	@OriginalMember(owner = "client!qn", name = "Kb", descriptor = "I")
	public static int anInt4770;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Lclient!sf;")
	public static Class157 aClass157_40 = new Class157(64);

	@OriginalMember(owner = "client!qn", name = "qb", descriptor = "I")
	public static int anInt4758 = 0;

	@OriginalMember(owner = "client!qn", name = "Db", descriptor = "[I")
	public static int[] anIntArray469 = new int[14];

	@OriginalMember(owner = "client!qn", name = "Jb", descriptor = "I")
	public static int anInt4769 = 0;

	@OriginalMember(owner = "client!qn", name = "Lb", descriptor = "[J")
	public static long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Z")
	public static boolean method3822(@OriginalArg(1) int arg0) {
		if (Static308.anInt5954 == arg0) {
			return false;
		}
		Static302.anIntArrayArray42 = new int[104][104];
		Static50.anIntArrayArrayArray3 = new int[4][13][13];
		Static182.anIntArrayArray46 = new int[104][104];
		Static305.anIntArrayArray45 = new int[104][104];
		Static130.anIntArrayArray16 = new int[104][104];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static89.aClass154Array1[local44] = new Class154(104, 104);
		}
		Static242.aByteArrayArrayArray19 = new byte[4][104][104];
		Static13.aByteArrayArrayArray2 = new byte[4][104][104];
		Static121.aClass44ArrayArrayArray1 = new Class44[4][104][104];
		if (Static116.aBoolean184) {
			Static212.method3537();
			Static266.method4175();
			Static90.aClass100ArrayArray1 = new Class100[13][13];
		}
		Static308.anInt5954 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZIIIZ)V")
	public static void method3824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static268.method4233(arg1)) {
			Static58.method1137(arg2, arg0, arg3, Static262.aClass56ArrayArray1[arg1], -1);
		}
	}
}
