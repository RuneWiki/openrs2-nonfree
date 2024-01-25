import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "[Lclient!lka;")
	public static final Class226[] aClass226Array1 = new Class226[4];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Z")
	public static boolean aBoolean824 = false;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIILclient!ha;IIILclient!tt;IIBI)V")
	public static void method8457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class145 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class2_Sub6_Sub20 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		if (arg6 > arg9 && arg6 < arg0 + arg9 && arg10 - 13 < arg4 && arg10 + 3 > arg4 && arg7.aBoolean827) {
			arg5 = arg2;
		}
		@Pc(40) int[] local40 = null;
		if (Static284.method3981(arg7.anInt9603)) {
			local40 = Static543.aClass37_2.method605((int) arg7.aLong302).anIntArray350;
		} else if (arg7.anInt9601 != -1) {
			local40 = Static543.aClass37_2.method605(arg7.anInt9601).anIntArray350;
		} else if (Static690.method9315(arg7.anInt9603)) {
			@Pc(107) Class2_Sub49 local107 = (Class2_Sub49) Static467.aClass218_37.method5095((long) (int) arg7.aLong302, 0);
			if (local107 != null) {
				@Pc(112) Class4_Sub2_Sub1_Sub2_Sub2 local112 = local107.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				@Pc(115) Class261 local115 = local112.aClass261_1;
				if (local115.anIntArray499 != null) {
					local115 = local115.method6272(Static396.aClass107_1);
				}
				if (local115 != null) {
					local40 = local115.anIntArray502;
				}
			}
		} else if (Static575.method7994(arg7.anInt9603)) {
			@Pc(84) Class81 local84 = Static148.aClass153_3.method3342((int) (arg7.aLong302 >>> 32 & 0x7FFFFFFFL));
			if (local84.anIntArray143 != null) {
				local84 = local84.method1629(Static396.aClass107_1);
			}
			if (local84 != null) {
				local40 = local84.anIntArray144;
			}
		}
		@Pc(148) String local148 = Static275.method3840(arg7);
		if (local40 != null) {
			local148 = local148 + Static657.method9030(local40);
		}
		Static387.aClass68_12.method7895(arg5, arg10, local148, Static467.aClass43Array17, Static464.anIntArray538, arg9 + 3);
		if (arg7.aBoolean826) {
			Static650.aClass43_29.method9588(arg9 + Static277.aClass289_8.method6935(local148) + 5, arg10 + -12);
		}
	}
}
