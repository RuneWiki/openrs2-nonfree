import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public static int anInt6358;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "Lclient!mk;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Lclient!sd;")
	public static Class217 aClass217_1;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lclient!tq;")
	public static final Class231 aClass231_1 = new Class231();

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
	public static int[] anIntArray461 = new int[2];

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public static int anInt6360 = -1;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_307 = new Class12(46, 0);

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_7 = new Class179("", 10);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V")
	public static void method4987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class47_Sub4 local13 = local7.aClass47_Sub4_1;
		@Pc(16) Class47_Sub4 local16 = local7.aClass47_Sub4_2;
		if (local13 != null) {
			local13.anInt4956 = local13.anInt4956 * arg3 / (0x10 << Static58.anInt1051 - 7);
			local13.anInt4950 = local13.anInt4950 * arg3 / (0x10 << Static58.anInt1051 - 7);
		}
		if (local16 != null) {
			local16.anInt4956 = local16.anInt4956 * arg3 / (0x10 << Static58.anInt1051 - 7);
			local16.anInt4950 = local16.anInt4950 * arg3 / (0x10 << Static58.anInt1051 - 7);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBII)V")
	public static void method4989(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static47.anInt762 = 0;
		Static85.anInt1517 = arg1;
		Static357.anInt6537 = 0;
		Static60.anInt1086 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method4990(@OriginalArg(0) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static307.anInt5216 > 0) {
			local26 = Static210.aByteArrayArray16[--Static307.anInt5216];
			Static210.aByteArrayArray16[Static307.anInt5216] = null;
			return local26;
		} else if (arg0 == 5000 && Static289.anInt4857 > 0) {
			local26 = Static418.aByteArrayArray28[--Static289.anInt4857];
			Static418.aByteArrayArray28[Static289.anInt4857] = null;
			return local26;
		} else if (arg0 == 30000 && Static25.anInt429 > 0) {
			local26 = Static323.aByteArrayArray23[--Static25.anInt429];
			Static323.aByteArrayArray23[Static25.anInt429] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}
}
