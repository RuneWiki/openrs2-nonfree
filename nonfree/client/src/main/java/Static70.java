import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
	public static int anInt1590 = 0;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_646 = Static187.method3089(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_647 = Static187.method3089("::autoshadow off");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!ka;)Lclient!pi;")
	public static Class33_Sub4 method1084(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class33_Sub4(arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3049(), arg0.method3010());
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public static void method1085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static89.anInt1911; local7++) {
			if (Static111.anIntArray182[local7] + Static189.anIntArray331[local7] > arg0 && Static111.anIntArray182[local7] < arg0 + arg2 && arg3 < Static110.anIntArray176[local7] + Static49.anIntArray90[local7] && arg3 + arg1 > Static49.anIntArray90[local7]) {
				Static84.aBooleanArray5[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!s;II[B)V")
	public static void method1086(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class1_Sub23 local7 = new Class1_Sub23();
		local7.anInt3194 = 0;
		local7.aClass83_1 = arg0;
		local7.aLong251 = arg1;
		local7.aByteArray45 = arg2;
		@Pc(22) Class20 local22 = Static164.aClass20_18;
		synchronized (Static164.aClass20_18) {
			Static164.aClass20_18.method466(local7);
		}
		Static173.method2739();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
	public static void method1087(@OriginalArg(0) int arg0) {
		Static111.anInt2402 = arg0;
		Static193.anInt3062 = -1;
		Static193.anInt3062 = -1;
		Static18.method408();
	}
}
