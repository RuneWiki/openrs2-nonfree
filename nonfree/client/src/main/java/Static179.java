import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!wf", name = "kb", descriptor = "Lclient!pg;")
	public static Class64 aClass64_4;

	@OriginalMember(owner = "client!wf", name = "db", descriptor = "Lclient!oa;")
	public static Class2_Sub18 aClass2_Sub18_108 = new Class2_Sub18(new byte[5000]);

	@OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
	public static final int anInt4564 = 50;

	@OriginalMember(owner = "client!wf", name = "lb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1552 = Static146.method2172("Unable to find ");

	@OriginalMember(owner = "client!wf", name = "pb", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!wf", name = "qb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1553 = aClass77_1552;

	@OriginalMember(owner = "client!wf", name = "rb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1554 = Static146.method2172("null");

	@OriginalMember(owner = "client!wf", name = "tb", descriptor = "Lclient!ua;")
	public static Class82 aClass82_64 = new Class82(64);

	@OriginalMember(owner = "client!wf", name = "vb", descriptor = "Lclient!sa;")
	public static Class74 aClass74_13 = new Class74(512);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)V")
	public static void method2996(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub13 local12 = (Class2_Sub13) Static3.aClass74_1.method2433((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray335.length; local21++) {
				local12.anIntArray335[local21] = -1;
				local12.anIntArray336[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!sg;ILclient!ke;Lclient!sg;)Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3 method2997(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) Class77 arg2) {
		@Pc(4) int local4 = arg1.method2206(arg0);
		@Pc(14) int local14 = arg1.method2215(local4, arg2);
		return Static120.method709(arg1, local4, local14);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lclient!sg;")
	public static Class77 method2998(@OriginalArg(0) int arg0) {
		return Static146.method2168(new Class77[] { Static2.method61(arg0 >> 24 & 0xFF), Static83.aClass77_854, Static2.method61(arg0 >> 16 & 0xFF), Static83.aClass77_854, Static2.method61(arg0 >> 8 & 0xFF), Static83.aClass77_854, Static2.method61(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)I")
	public static int method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = 256 - arg2;
		return (arg2 * (arg0 & 0xFF00) + local4 * (arg1 & 0xFF00) & 0xFF0000) + (arg2 * (arg0 & 0xFF00FF) + (arg1 & 0xFF00FF) * local4 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(Z)V")
	public static void method3000() {
		aClass82_64 = null;
		aClass2_Sub18_108 = null;
		aClass77_1553 = null;
		aClass64_4 = null;
		aClass77_1554 = null;
		aClass77_1552 = null;
		aClass74_13 = null;
	}
}
