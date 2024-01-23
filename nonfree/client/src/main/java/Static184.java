import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!sj", name = "Rb", descriptor = "Z")
	public static boolean aBoolean213;

	@OriginalMember(owner = "client!sj", name = "Xb", descriptor = "Lclient!kb;")
	public static Class55 aClass55_3;

	@OriginalMember(owner = "client!sj", name = "Ob", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1329 = Static200.method3116("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!sj", name = "Qb", descriptor = "I")
	public static int anInt3955 = 0;

	@OriginalMember(owner = "client!sj", name = "Tb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1330 = Static200.method3116(": ");

	@OriginalMember(owner = "client!sj", name = "Wb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1332 = Static200.method3116("Members object");

	@OriginalMember(owner = "client!sj", name = "Ub", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1331 = aClass60_1332;

	@OriginalMember(owner = "client!sj", name = "dc", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1333 = Static200.method3116("huffman");

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ai;IB)Lclient!ch;")
	public static Class1_Sub1_Sub6 method2912(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2) {
		return Static87.method1515(arg0, arg2, arg1) ? Static75.method1351() : null;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(III)J")
	public static long method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass16_1 == null ? 0L : local7.aClass16_1.aLong22;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BI)[B")
	public static byte[] method2915(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static221.method35(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(III)I")
	public static int method2916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
