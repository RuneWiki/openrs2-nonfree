import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!pe", name = "eb", descriptor = "[Lclient!da;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
	public static int anInt3166 = 0;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1156 = Static177.method3050("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1154 = aClass46_1156;

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1155 = Static177.method3050("Wordpack geladen)3");

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "[I")
	public static final int[] anIntArray294 = new int[200];

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
	public static int anInt3171 = 0;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[5][5000];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)Lclient!a;")
	public static Class1 method2334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1 local7 = Static154.method3136(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass1Array1 == null || local7.aClass1Array1.length <= arg0) {
			return null;
		} else {
			return local7.aClass1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!h;ILclient!rh;Z)V")
	public static void method2335(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		@Pc(9) Class4_Sub20 local9 = new Class4_Sub20();
		local9.anInt3233 = arg0.method1253();
		local9.anInt3232 = arg0.method1263();
		local9.anIntArray310 = new int[local9.anInt3233];
		local9.anIntArray311 = new int[local9.anInt3233];
		local9.aByteArrayArrayArray7 = new byte[local9.anInt3233][][];
		local9.aClass84Array2 = new Class84[local9.anInt3233];
		local9.aClass84Array1 = new Class84[local9.anInt3233];
		local9.anIntArray308 = new int[local9.anInt3233];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt3233; local51++) {
			try {
				@Pc(62) int local62 = arg0.method1253();
				@Pc(89) String local89;
				@Pc(98) String local98;
				@Pc(102) int local102;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local89 = new String(arg0.method1247().method1660());
					local98 = new String(arg0.method1247().method1660());
					local102 = 0;
					if (local62 == 1) {
						local102 = arg0.method1263();
					}
					local9.anIntArray310[local51] = local62;
					local9.anIntArray311[local51] = local102;
					local9.aClass84Array2[local51] = arg2.method2563(Static7.method103(local89), local98);
				} else if (local62 == 3 || local62 == 4) {
					local89 = new String(arg0.method1247().method1660());
					local98 = new String(arg0.method1247().method1660());
					local102 = arg0.method1253();
					@Pc(105) String[] local105 = new String[local102];
					for (@Pc(107) int local107 = 0; local107 < local102; local107++) {
						local105[local107] = new String(arg0.method1247().method1660());
					}
					@Pc(131) byte[][] local131 = new byte[local102][];
					@Pc(144) int local144;
					if (local62 == 3) {
						for (@Pc(138) int local138 = 0; local138 < local102; local138++) {
							local144 = arg0.method1263();
							local131[local138] = new byte[local144];
							arg0.method1226(local144, local131[local138]);
						}
					}
					local9.anIntArray310[local51] = local62;
					@Pc(169) Class[] local169 = new Class[local102];
					for (local144 = 0; local144 < local102; local144++) {
						local169[local144] = Static7.method103(local105[local144]);
					}
					local9.aClass84Array1[local51] = arg2.method2565(Static7.method103(local89), local98, local169);
					local9.aByteArrayArrayArray7[local51] = local131;
				}
			} catch (@Pc(254) ClassNotFoundException local254) {
				local9.anIntArray308[local51] = -1;
			} catch (@Pc(261) SecurityException local261) {
				local9.anIntArray308[local51] = -2;
			} catch (@Pc(268) NullPointerException local268) {
				local9.anIntArray308[local51] = -3;
			} catch (@Pc(275) Exception local275) {
				local9.anIntArray308[local51] = -4;
			} catch (@Pc(282) Throwable local282) {
				local9.anIntArray308[local51] = -5;
			}
		}
		Static14.aClass11_2.method272(local9);
	}
}
