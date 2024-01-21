import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!gg;")
	public static Class26 aClass26_7;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Lclient!ea;")
	private static Class18 aClass18_838 = Static8.method128("Take");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_835 = aClass18_838;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_836 = Static8.method128(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!ea;")
	public static Class18 aClass18_837 = Static8.method128("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_839 = Static8.method128("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!hc;BLclient!od;I)V")
	public static void method2314(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub21 local9 = new Class1_Sub21();
		local9.anInt4108 = arg0.method544();
		local9.anInt4109 = arg0.method499();
		local9.aByteArrayArrayArray7 = new byte[local9.anInt4108][][];
		local9.aClass26Array1 = new Class26[local9.anInt4108];
		local9.anIntArray379 = new int[local9.anInt4108];
		local9.anIntArray381 = new int[local9.anInt4108];
		local9.anIntArray380 = new int[local9.anInt4108];
		local9.aClass26Array2 = new Class26[local9.anInt4108];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt4108; local55++) {
			try {
				@Pc(61) int local61 = arg0.method544();
				@Pc(83) String local83;
				@Pc(92) String local92;
				@Pc(94) int local94;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local83 = new String(arg0.method510().method754());
					local92 = new String(arg0.method510().method754());
					local94 = 0;
					if (local61 == 1) {
						local94 = arg0.method499();
					}
					local9.anIntArray381[local55] = local61;
					local9.anIntArray379[local55] = local94;
					local9.aClass26Array2[local55] = arg1.method2276(Static51.method1102(local83), local92);
				} else if (local61 == 3 || local61 == 4) {
					local83 = new String(arg0.method510().method754());
					local92 = new String(arg0.method510().method754());
					local94 = arg0.method544();
					@Pc(159) String[] local159 = new String[local94];
					for (@Pc(161) int local161 = 0; local161 < local94; local161++) {
						local159[local161] = new String(arg0.method510().method754());
					}
					@Pc(185) byte[][] local185 = new byte[local94][];
					@Pc(198) int local198;
					if (local61 == 3) {
						for (@Pc(192) int local192 = 0; local192 < local94; local192++) {
							local198 = arg0.method499();
							local185[local192] = new byte[local198];
							arg0.method534(local198, local185[local192]);
						}
					}
					local9.anIntArray381[local55] = local61;
					@Pc(223) Class[] local223 = new Class[local94];
					for (local198 = 0; local198 < local94; local198++) {
						local223[local198] = Static51.method1102(local159[local198]);
					}
					local9.aClass26Array1[local55] = arg1.method2270(local92, Static51.method1102(local83), local223);
					local9.aByteArrayArrayArray7[local55] = local185;
				}
			} catch (@Pc(266) ClassNotFoundException local266) {
				local9.anIntArray380[local55] = -1;
			} catch (@Pc(273) SecurityException local273) {
				local9.anIntArray380[local55] = -2;
			} catch (@Pc(280) NullPointerException local280) {
				local9.anIntArray380[local55] = -3;
			} catch (@Pc(287) Exception local287) {
				local9.anIntArray380[local55] = -4;
			} catch (@Pc(294) Throwable local294) {
				local9.anIntArray380[local55] = -5;
			}
		}
		Static47.aClass59_56.method2411(local9);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method2315() {
		anIntArray289 = null;
		aClass18_837 = null;
		aClass18_839 = null;
		aClass18_836 = null;
		aClass18_838 = null;
		aClass26_7 = null;
		aClass18_835 = null;
	}
}
