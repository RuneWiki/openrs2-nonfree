import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt3026;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 aClass1_Sub1_Sub8_Sub1_4;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	public static int anInt3032;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_768 = Static8.method128("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
	public static int[] anIntArray268 = new int[50];

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method2128(@OriginalArg(0) Class20 arg0) {
		@Pc(13) int local13 = arg0.anInt1221;
		if (local13 == 324) {
			if (Static62.anInt1930 == -1) {
				Static33.anInt1112 = arg0.anInt1239;
				Static62.anInt1930 = arg0.anInt1228;
			}
			if (Static120.aClass31_1.aBoolean78) {
				arg0.anInt1228 = Static62.anInt1930;
			} else {
				arg0.anInt1228 = Static33.anInt1112;
			}
		} else if (local13 == 325) {
			if (Static62.anInt1930 == -1) {
				Static62.anInt1930 = arg0.anInt1228;
				Static33.anInt1112 = arg0.anInt1239;
			}
			if (Static120.aClass31_1.aBoolean78) {
				arg0.anInt1228 = Static33.anInt1112;
			} else {
				arg0.anInt1228 = Static62.anInt1930;
			}
		} else if (local13 == 327) {
			arg0.anInt1192 = 150;
			arg0.anInt1242 = (int) (Math.sin((double) Static41.anInt1322 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1244 = 5;
			arg0.anInt1218 = 0;
		} else if (local13 == 328) {
			arg0.anInt1192 = 150;
			arg0.anInt1242 = (int) (Math.sin((double) Static41.anInt1322 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1244 = 5;
			arg0.anInt1218 = 1;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	public static void method2129() {
		aClass1_Sub1_Sub8_Sub1_4 = null;
		aClass18_768 = null;
		anIntArray268 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dd;Lclient!ea;ILclient!ea;)[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] method2130(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(3) Class18 arg2) {
		@Pc(4) int local4 = arg0.method2246(arg2);
		@Pc(19) int local19 = arg0.method2251(arg1, local4);
		return Static110.method2263(local4, local19, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Lclient!ea;")
	public static Class18 method2131(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static132.method2564(arg0) : Static80.aClass18_589;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Z")
	public static boolean method2132() {
		@Pc(5) Class23 local5 = Static80.aClass23_1;
		synchronized (Static80.aClass23_1) {
			if (Static118.anInt3368 == Static83.anInt4752) {
				return false;
			} else {
				Static6.anInt195 = Static174.anIntArray426[Static118.anInt3368];
				Static177.anInt4717 = Static156.anIntArray395[Static118.anInt3368];
				Static118.anInt3368 = Static118.anInt3368 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BBI)I")
	public static int method2133(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static172.method3130(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)Lclient!aa;")
	public static Class1_Sub1_Sub1 method2134(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub1 local6 = (Class1_Sub1_Sub1) Static15.aClass66_2.method2599((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static76.aClass16_8.method2254(arg0, 10);
		local6 = new Class1_Sub1_Sub1();
		local6.anInt76 = arg0;
		if (local25 != null) {
			local6.method39(new Class1_Sub6(local25));
		}
		local6.method50();
		if (local6.anInt70 != -1) {
			local6.method41(method2134(local6.anInt70), method2134(local6.anInt54));
		}
		if (!Static71.aBoolean83 && local6.aBoolean2) {
			local6.aBoolean1 = false;
			local6.anInt92 = 0;
			local6.aClass18Array2 = null;
			local6.aClass18Array1 = null;
			local6.aClass18_28 = Static117.aClass18_841;
		}
		Static15.aClass66_2.method2597((long) arg0, local6);
		return local6;
	}
}
