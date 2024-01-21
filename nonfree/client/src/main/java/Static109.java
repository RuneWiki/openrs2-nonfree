import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
	public static int anInt2826;

	@OriginalMember(owner = "client!ve", name = "rb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ve", name = "sb", descriptor = "Lclient!oc;")
	public static Class34 aClass34_82;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1683 = Static15.method178("title)3jpg");

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
	public static int anInt2824 = -1;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1684 = Static15.method178("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1685 = Static15.method178("(U4");

	@OriginalMember(owner = "client!ve", name = "ib", descriptor = "[I")
	public static int[] anIntArray394 = new int[50];

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array18 = new Class23[500];

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "Lclient!oe;")
	public static Class45 aClass45_9 = new Class45();

	@OriginalMember(owner = "client!ve", name = "lb", descriptor = "I")
	public static int anInt2830 = -1;

	@OriginalMember(owner = "client!ve", name = "mb", descriptor = "I")
	public static int anInt2831 = 0;

	@OriginalMember(owner = "client!ve", name = "ob", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!ve", name = "pb", descriptor = "I")
	public static int anInt2833 = 1;

	@OriginalMember(owner = "client!ve", name = "qb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1686 = Static15.method178("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ve", name = "tb", descriptor = "[I")
	public static int[] anIntArray395 = new int[25];

	@OriginalMember(owner = "client!ve", name = "ub", descriptor = "I")
	public static int anInt2834 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!rb;II)Lclient!he;")
	public static Class1_Sub1_Sub6_Sub2 method1858(@OriginalArg(1) Class55 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static106.method1796(arg1, arg0, arg2) ? Static75.method1316() : null;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public static void method1859() {
		aClass23_1686 = null;
		aClass23_1684 = null;
		anIntArray394 = null;
		aByteArrayArrayArray8 = null;
		aClass34_82 = null;
		aClass23Array18 = null;
		aClass23_1685 = null;
		aClass23_1683 = null;
		aClass45_9 = null;
		anIntArray395 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII[Lclient!gd;)Lclient!gd;")
	public static Class23 method1861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23[] arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			if (arg2[local7 + arg0] == null) {
				arg2[arg0 + local7] = Static49.aClass23_763;
			}
			local5 += arg2[arg0 + local7].anInt965;
		}
		@Pc(42) byte[] local42 = new byte[local5];
		@Pc(44) int local44 = 0;
		@Pc(53) Class23 local53;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			local53 = arg2[local46 + arg0];
			Static123.method1270(local53.aByteArray4, 0, local42, local44, local53.anInt965);
			local44 += local53.anInt965;
		}
		local53 = new Class23();
		local53.aByteArray4 = local42;
		local53.anInt965 = local5;
		return local53;
	}
}
