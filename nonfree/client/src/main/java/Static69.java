import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!dd;")
	public static Class14 aClass14_18;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public static int anInt1682;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_780 = Static56.method816("Angreifen");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public static int anInt1679 = 0;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!ic;")
	private static Class34 aClass34_781 = Static56.method816("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_782 = Static56.method816("<col=00ffff>");

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_783 = Static56.method816("null");

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!ic;")
	private static Class34 aClass34_784 = Static56.method816("wishes to duel with you)3");

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_785 = aClass34_781;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public static int anInt1683 = 0;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_786 = Static56.method816("(U0a )2 in: ");

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_787 = aClass34_784;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_788 = Static56.method816("jlv");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZIILclient!t;)V")
	public static void method1041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class8_Sub1_Sub3_Sub3 arg4) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static111.anInt3027 + Static72.anInt1744 & 0x7FF;
		@Pc(20) int local20 = arg0 * arg0 + arg1 * arg1;
		if (local20 > 6400) {
			return;
		}
		@Pc(30) int local30 = Class8_Sub1_Sub3_Sub1.anIntArray38[local12];
		@Pc(34) int local34 = Class8_Sub1_Sub3_Sub1.anIntArray40[local12];
		@Pc(42) int local42 = local30 * 256 / (Static47.anInt1268 + 256);
		@Pc(50) int local50 = local34 * 256 / (Static47.anInt1268 + 256);
		@Pc(61) int local61 = local42 * arg0 + arg1 * local50 >> 16;
		@Pc(72) int local72 = arg0 * local50 - arg1 * local42 >> 16;
		if (local20 > 2500) {
			arg4.method1583(Static22.aClass8_Sub1_Sub3_Sub2_7, arg2 + local61 + 94 + 4 - arg4.anInt2534 / 2, arg3 - (-83 - -local72) + -(arg4.anInt2536 / 2) + -4);
		} else {
			arg4.method1587(local61 + arg2 + 94 + 4 - arg4.anInt2534 / 2, -(arg4.anInt2536 / 2) + -4 + -local72 + arg3 + 83);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method1042() {
		aClass34_780 = null;
		aClass34_781 = null;
		aClass34_785 = null;
		aClass34_788 = null;
		aClass34_784 = null;
		aClass34_782 = null;
		aClass34_786 = null;
		aClass34_783 = null;
		aClass14_18 = null;
		aClass34_787 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)I")
	public static int method1043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class8_Sub1_Sub3_Sub1.anIntArray40[arg1 * 1024 / arg0] >> 1;
		return (arg2 * local20 >> 16) + (arg3 * (65536 - local20) >> 16);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lclient!wf;")
	public static Class8_Sub24 method1044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class8_Sub24 local12 = Static113.method1614(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass8_Sub24Array2 == null || arg1 >= local12.aClass8_Sub24Array2.length) {
			return null;
		} else {
			return local12.aClass8_Sub24Array2[arg1];
		}
	}
}
