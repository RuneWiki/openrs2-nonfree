import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "Lclient!lc;")
	public static Class58 aClass58_2;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "[I")
	public static final int[] anIntArray31 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_117 = Static151.method2243("FULL");

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	public static int anInt397 = 0;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "Lclient!mb;")
	public static Class62 aClass62_118 = aClass62_117;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_119 = Static151.method2243("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_120 = Static151.method2243("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array12 = new Class62[100];

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
	public static int anInt404 = 2;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)Lclient!mb;")
	public static Class62 method277(@OriginalArg(0) int arg0) {
		@Pc(3) Class62 local3 = new Class62();
		local3.anInt2653 = 0;
		local3.aByteArray28 = new byte[arg0];
		return local3;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIBZILclient!oc;)V")
	public static void method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class71_Sub1 arg5) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg4);
		@Pc(17) Class2_Sub1_Sub21 local17 = (Class2_Sub1_Sub21) Static87.aClass58_9.method1704(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class2_Sub1_Sub21) Static137.aClass58_13.method1704(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class2_Sub1_Sub21) Static21.aClass58_4.method1704(local11);
		if (local17 == null) {
			if (!arg3) {
				local17 = (Class2_Sub1_Sub21) Static92.aClass58_10.method1704(local11);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class2_Sub1_Sub21();
			local17.aByte9 = arg2;
			local17.aClass71_Sub1_22 = arg5;
			local17.anInt3747 = arg1;
			if (arg3) {
				Static87.aClass58_9.method1708(local17, local11);
				Static96.anInt2150++;
			} else {
				Static95.aClass61_1.method1783(local17);
				Static21.aClass58_4.method1708(local17, local11);
				Static30.anInt735++;
			}
		} else if (arg3) {
			local17.method3186();
			Static87.aClass58_9.method1708(local17, local11);
			Static30.anInt735--;
			Static96.anInt2150++;
		}
	}
}
