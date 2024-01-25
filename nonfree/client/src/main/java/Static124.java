import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString117;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
	public static int anInt3576;

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "[Lclient!hd;")
	public static Class2_Sub2[] aClass2_Sub2Array2;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_23 = new Class198(16);

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "[I")
	public static final int[] anIntArray311 = new int[128];

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZLclient!fd;)V")
	public static void method3067(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class72 arg1) {
		@Pc(12) int local12 = arg1.anInt1844 == 0 ? arg1.anInt1829 : arg1.anInt1844;
		@Pc(21) int local21 = arg1.anInt1795 == 0 ? arg1.anInt1806 : arg1.anInt1795;
		Static163.method3129(local21, Static158.aClass72ArrayArray1[arg1.anInt1830 >> 16], arg1.anInt1830, local12, arg0);
		if (arg1.aClass72Array1 != null) {
			Static163.method3129(local21, arg1.aClass72Array1, arg1.anInt1830, local12, arg0);
		}
		@Pc(61) Class4_Sub8 local61 = (Class4_Sub8) Static38.aClass198_5.method5261((long) arg1.anInt1830);
		if (local61 != null) {
			Static187.method3426(local12, local61.anInt1670, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method3068() {
		@Pc(5) Class154 local5 = Static133.aClass154_44;
		synchronized (Static133.aClass154_44) {
			Static133.aClass154_44.method4219();
		}
		local5 = Static199.aClass154_102;
		synchronized (Static199.aClass154_102) {
			Static199.aClass154_102.method4219();
		}
		local5 = Static310.aClass154_95;
		synchronized (Static310.aClass154_95) {
			Static310.aClass154_95.method4219();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ZJZIIIZ)V")
	public static void method3070(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) long arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class4_Sub7 local30 = new Class4_Sub7(128);
		local30.method2416(10);
		local30.method2376((arg3 ? 4 : 0) | (arg5 ? 1 : 0) | (arg9 ? 2 : 0));
		local30.method2385(arg4);
		local30.method2387(local8[0]);
		local30.method2373(arg1);
		local30.method2387(local8[1]);
		local30.method2376(Static145.anInt3255);
		local30.method2416(arg0);
		local30.method2416(arg7);
		local30.method2387(local8[2]);
		local30.method2376(arg6);
		local30.method2376(arg8);
		local30.method2387(local8[3]);
		local30.method2369(Static195.aBigInteger2, Static78.aBigInteger1);
		@Pc(120) Class4_Sub7 local120 = new Class4_Sub7(350);
		local120.method2373(arg2);
		@Pc(133) int local133 = 8 - Static204.method3620(arg2) % 8;
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			local120.method2416((int) (Math.random() * 255.0D));
		}
		local120.method2419(local8);
		Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
		Static320.aClass4_Sub7_Sub1_3.method2416(22);
		Static320.aClass4_Sub7_Sub1_3.method2376(local120.anInt2667 + local30.anInt2667 + 2);
		Static320.aClass4_Sub7_Sub1_3.method2376(559);
		Static320.aClass4_Sub7_Sub1_3.method2398(local30.anInt2667, local30.aByteArray42);
		Static320.aClass4_Sub7_Sub1_3.method2398(local120.anInt2667, local120.aByteArray42);
		Static52.anInt1173 = -3;
		Static352.anInt6601 = 0;
		Static335.anInt6657 = 0;
		Static45.anInt5671 = 1;
	}
}
