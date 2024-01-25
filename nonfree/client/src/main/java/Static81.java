import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!jl;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
	public static int anInt1300 = 0;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "[S")
	public static short[] aShortArray15 = new short[256];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Lclient!ks;")
	public static Class153 method1194(@OriginalArg(1) int arg0) {
		@Pc(10) Class153 local10 = (Class153) Static372.aClass188_49.method4158((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static237.aClass171_53.method3658(0, arg0);
		local10 = new Class153();
		if (local20 != null) {
			local10.method3077(new Class2_Sub17(local20));
		}
		local10.method3078();
		Static372.aClass188_49.method4155((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1196(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static121.anInt2062;
		@Pc(9) int[] local9 = Static311.anIntArray474;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class11_Sub5_Sub2_Sub1 local26 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local9[local18]];
			if (local26 != null && Static127.aClass11_Sub5_Sub2_Sub1_2 != local26 && local26.aString20 != null && local26.aString20.equalsIgnoreCase(arg0)) {
				local11 = true;
				if (arg1 == 1) {
					Static164.method2403(Static173.aClass208_45);
					Static389.aClass2_Sub17_Sub1_2.method6137(0);
					Static389.aClass2_Sub17_Sub1_2.method6135(local9[local18]);
				} else if (arg1 == 4) {
					Static164.method2403(Static101.aClass208_22);
					Static389.aClass2_Sub17_Sub1_2.method6161(0);
					Static389.aClass2_Sub17_Sub1_2.method6130(local9[local18]);
				} else if (arg1 == 5) {
					Static164.method2403(Static277.aClass208_63);
					Static389.aClass2_Sub17_Sub1_2.method6126(0);
					Static389.aClass2_Sub17_Sub1_2.method6130(local9[local18]);
				} else if (arg1 == 6) {
					Static164.method2403(Static48.aClass208_10);
					Static389.aClass2_Sub17_Sub1_2.method6130(local9[local18]);
					Static389.aClass2_Sub17_Sub1_2.method6126(0);
				} else if (arg1 == 7) {
					Static164.method2403(Static92.aClass208_21);
					Static389.aClass2_Sub17_Sub1_2.method6112(local9[local18]);
					Static389.aClass2_Sub17_Sub1_2.method6161(0);
				}
				break;
			}
		}
		if (!local11) {
			Static172.method2536(Static49.aClass231_17.method5261(Static80.anInt6195) + arg0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Z")
	public static boolean method1197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static129.method2037(arg0, arg1) | Static126.method1971(arg0, arg1) | Static326.method4644(arg0, arg1)) & Static42.method4657(arg0, arg1);
	}
}
