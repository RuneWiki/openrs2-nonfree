import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_585 = method1507(" has logged in)3");

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "Lclient!dj;")
	public static Class24 aClass24_584 = aClass24_585;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "[I")
	public static final int[] anIntArray166 = new int[128];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;)Lclient!dj;")
	public static Class24 method1507(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(18) Class24 local18 = new Class24();
		@Pc(20) int local20 = 0;
		local18.aByteArray13 = new byte[local9];
		while (local9 > local20) {
			@Pc(32) int local32 = local6[local20++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local20 >= local9) {
					break;
				}
				@Pc(54) int local54 = local6[local20++] & 0xFF;
				local18.aByteArray13[local18.anInt1084++] = (byte) ((local32 - 40) * 43 + local54 - 48);
			} else if (local32 != 0) {
				local18.aByteArray13[local18.anInt1084++] = (byte) local32;
			}
		}
		local18.method752();
		return local18.method766();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method1508(@OriginalArg(1) Class69 arg0) {
		Static67.aClass69_20 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!vc;)Lclient!dj;")
	public static Class24 method1509(@OriginalArg(0) int arg0, @OriginalArg(2) Class98 arg1) {
		if (!Static2.method84(arg0, Static105.method1831(arg1)) && arg1.anObjectArray18 == null) {
			return null;
		} else if (arg1.aClass24Array27 == null || arg0 >= arg1.aClass24Array27.length || arg1.aClass24Array27[arg0] == null || arg1.aClass24Array27[arg0].method780().method781() == 0) {
			return Static134.aBoolean140 ? Static63.method1281(new Class24[] { Static8.aClass24_56, Static175.method3020(arg0) }) : null;
		} else {
			return arg1.aClass24Array27[arg0];
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method1510() {
		for (@Pc(4) Class1_Sub5 local4 = (Class1_Sub5) Static71.aClass87_11.method2827(); local4 != null; local4 = (Class1_Sub5) Static71.aClass87_11.method2830()) {
			if (local4.aClass1_Sub3_Sub2_1 != null) {
				Static33.aClass1_Sub3_Sub1_1.method278(local4.aClass1_Sub3_Sub2_1);
				local4.aClass1_Sub3_Sub2_1 = null;
			}
			if (local4.aClass1_Sub3_Sub2_2 != null) {
				Static33.aClass1_Sub3_Sub1_1.method278(local4.aClass1_Sub3_Sub2_2);
				local4.aClass1_Sub3_Sub2_2 = null;
			}
		}
		Static71.aClass87_11.method2831();
	}
}
