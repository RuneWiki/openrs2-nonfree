import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt132;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt133;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!rn;")
	public static Class155 aClass155_3;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public static int anInt138;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
	public static boolean aBoolean10 = true;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Z")
	public static boolean aBoolean11 = true;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method108() {
		Static306.anIntArray618 = null;
		Static299.anIntArray611 = null;
		Static101.anIntArray185 = null;
		Static35.anIntArray54 = null;
		Static93.anIntArray162 = null;
		Static314.aByteArrayArray130 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Lclient!dm;")
	public static Class3_Sub4_Sub6 method109(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub6 local10 = (Class3_Sub4_Sub6) Static225.aClass33_11.method828((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static67.aClass155_33.method4121(11, arg0);
		local10 = new Class3_Sub4_Sub6();
		if (local28 != null) {
			local10.method945(new Class3_Sub26(local28));
		}
		Static225.aClass33_11.method827(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)I")
	public static int method110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static14.method222(arg1 - 1, arg0 + -1) + Static14.method222(arg1 - 1, arg0 + 1) + Static14.method222(arg1 + 1, arg0 + -1) + Static14.method222(arg1 + 1, arg0 + 1);
		@Pc(82) int local82 = Static14.method222(arg1, arg0 - 1) + Static14.method222(arg1, arg0 + 1) + Static14.method222(arg1 + -1, arg0) + Static14.method222(arg1 + 1, arg0);
		@Pc(89) int local89 = Static14.method222(arg1, arg0);
		return local46 / 16 + local82 / 8 + local89 / 4;
	}
}
