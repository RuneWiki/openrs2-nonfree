import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!h", name = "p", descriptor = "I")
	public static int anInt1130;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public static int anInt1124 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!c;")
	public static Class12 aClass12_30 = new Class12(200);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public static int anInt1125 = 0;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt1128 = 0;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_668 = Static28.method504("(U");

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!ja;")
	private static Class39 aClass39_669 = Static28.method504("red:");

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_670 = Static28.method504("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!h", name = "k", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_671 = Static28.method504("leuchten1:");

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_672 = Static28.method504("(Udns");

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_673 = aClass39_669;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[Lclient!qd;")
	public static Class4_Sub2_Sub1_Sub1_Sub1[] aClass4_Sub2_Sub1_Sub1_Sub1Array1 = new Class4_Sub2_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_674 = aClass39_669;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!j;IIBII)V")
	public static void method739(@OriginalArg(0) Class4_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub7 local7 = new Class4_Sub7();
		local7.anInt1495 = arg0.anInt1409;
		local7.anInt1493 = arg0.anInt1427;
		local7.anIntArray149 = arg0.anIntArray147;
		@Pc(22) int local22 = arg0.anInt1410;
		local7.anInt1499 = arg4 * 128;
		local7.anInt1506 = arg2;
		local7.anInt1507 = arg0.anInt1391;
		local7.anInt1501 = arg0.anInt1425 * 128;
		local7.anInt1494 = arg3 * 128;
		@Pc(52) int local52 = arg0.anInt1413;
		if (arg1 == 1 || arg1 == 3) {
			local22 = arg0.anInt1413;
			local52 = arg0.anInt1410;
		}
		local7.anInt1505 = (local52 + arg4) * 128;
		local7.anInt1503 = (arg3 + local22) * 128;
		if (arg0.anIntArray144 != null) {
			local7.aClass4_Sub2_Sub10_1 = arg0;
			local7.method980();
		}
		Static112.aClass61_12.method1635(local7);
		if (local7.anIntArray149 != null) {
			local7.anInt1498 = local7.anInt1495 + (int) (Math.random() * (double) (local7.anInt1507 - local7.anInt1495));
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method740() {
		aClass4_Sub2_Sub1_Sub1_Sub1Array1 = null;
		aClass39_674 = null;
		aClass39_671 = null;
		aClass39_672 = null;
		aClass12_30 = null;
		aClass39_669 = null;
		aClass39_668 = null;
		aClass39_670 = null;
		aClass39_673 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBII)I")
	public static int method741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * local8 & 0xFF00FF00) + ((arg2 & 0xFF00) * local8 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}
}
