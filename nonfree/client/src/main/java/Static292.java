import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
	public static int anInt5467;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	public static int anInt5465 = -1;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(BI)V")
	public static void method4341() {
		Static263.aClass33_7.method838(5);
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(III)V")
	public static void method4342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static52.anInt1043 * arg0 >> 8;
		if (arg1 == -1 && !Static190.aBoolean244) {
			Static121.method2051();
		} else if (arg1 != -1 && (Static67.anInt1256 != arg1 || !Static259.method3921()) && local5 != 0 && !Static190.aBoolean244) {
			Static3.method46(local5, arg1, Static94.aClass98_56);
		}
		Static67.anInt1256 = arg1;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(III)Lclient!bm;")
	public static Class18 method4343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class18 local14 = local7.aClass18_1;
			local7.aClass18_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIILclient!lc;)Z")
	public static boolean method4344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class98 arg2) {
		@Pc(9) byte[] local9 = arg2.method2396(arg1, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static117.method2006(local9);
			return true;
		}
	}
}
