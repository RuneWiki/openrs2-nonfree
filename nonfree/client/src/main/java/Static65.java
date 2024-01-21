import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ib", name = "vc", descriptor = "Lclient!bb;")
	public static Class6 aClass6_4;

	@OriginalMember(owner = "client!ib", name = "wc", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_8;

	@OriginalMember(owner = "client!ib", name = "zc", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!ib", name = "kc", descriptor = "Lclient!kb;")
	private static Class46 aClass46_593 = method1172("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ib", name = "tc", descriptor = "Lclient!kb;")
	private static Class46 aClass46_597 = method1172("cyan:");

	@OriginalMember(owner = "client!ib", name = "nc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_594 = aClass46_597;

	@OriginalMember(owner = "client!ib", name = "oc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_595 = aClass46_597;

	@OriginalMember(owner = "client!ib", name = "rc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_596 = aClass46_593;

	@OriginalMember(owner = "client!ib", name = "xc", descriptor = "Lclient!nb;")
	public static Class57 aClass57_15 = new Class57(100);

	@OriginalMember(owner = "client!ib", name = "yc", descriptor = "J")
	public static volatile long aLong63 = 0L;

	@OriginalMember(owner = "client!ib", name = "Bc", descriptor = "Lclient!kb;")
	private static Class46 aClass46_599 = method1172("level)2");

	@OriginalMember(owner = "client!ib", name = "Ac", descriptor = "Lclient!kb;")
	public static Class46 aClass46_598 = aClass46_599;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public static void method1171() {
		aClass6_4 = null;
		anIntArray165 = null;
		aClass46_595 = null;
		aClass46_593 = null;
		aClass44_Sub1_8 = null;
		aClass46_594 = null;
		aClass46_599 = null;
		aClass57_15 = null;
		aClass46_597 = null;
		aClass46_598 = null;
		aClass46_596 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!kb;")
	public static Class46 method1172(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = local6.length;
		@Pc(15) Class46 local15 = new Class46();
		local15.aByteArray17 = new byte[local11];
		while (local8 < local11) {
			@Pc(27) int local27 = local6[local8++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local11 <= local8) {
					break;
				}
				@Pc(63) int local63 = local6[local8++] & 0xFF;
				local15.aByteArray17[local15.anInt2034++] = (byte) (local27 * 43 + local63 - 1768);
			} else if (local27 != 0) {
				local15.aByteArray17[local15.anInt2034++] = (byte) local27;
			}
		}
		local15.method1390();
		return local15.method1370();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!h;IB)Lclient!kb;")
	public static Class46 method1173(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (!Static156.method2539(arg1, Static157.method2541(arg0)) && arg0.anObjectArray7 == null) {
			return null;
		} else if (arg0.aClass46Array10 == null || arg1 >= arg0.aClass46Array10.length || arg0.aClass46Array10[arg1] == null || arg0.aClass46Array10[arg1].method1379().method1376() == 0) {
			return Static118.aBoolean118 ? Static178.method2860(new Class46[] { Static111.aClass46_887, Static57.method1068(arg1) }) : null;
		} else {
			return arg0.aClass46Array10[arg1];
		}
	}
}
