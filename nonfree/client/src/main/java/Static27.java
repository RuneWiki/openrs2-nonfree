import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public static int anInt812;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "[Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array1;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
	public static int[] anIntArray87;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!ke;")
	public static Class39 aClass39_372 = Static2.method66("logo");

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!ie;")
	public static Class34 aClass34_16 = new Class34();

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "J")
	public static long aLong19 = 0L;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "[Lclient!wc;")
	public static Class2_Sub1_Sub2_Sub3_Sub2[] aClass2_Sub1_Sub2_Sub3_Sub2Array1 = new Class2_Sub1_Sub2_Sub3_Sub2[16384];

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!ke;")
	private static Class39 aClass39_373 = Static2.method66("wave:");

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_374 = Static2.method66("Empf-=nger:");

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt814 = 0;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!ke;")
	public static Class39 aClass39_375 = Static2.method66("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_376 = aClass39_373;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method555() {
		aClass2_Sub1_Sub4_Sub3Array1 = null;
		aClass39_375 = null;
		aClass39_373 = null;
		aClass39_374 = null;
		aClass34_16 = null;
		aClass39_372 = null;
		aClass39_376 = null;
		anIntArray87 = null;
		aClass2_Sub1_Sub2_Sub3_Sub2Array1 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!g;Lclient!cc;)V")
	public static void method556(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub5 arg1, @OriginalArg(3) Class12 arg2) {
		@Pc(5) Class2_Sub12 local5 = new Class2_Sub12();
		local5.anInt2186 = arg1.method1281();
		local5.anInt2183 = arg1.method1276();
		local5.aClass19Array1 = new Class19[local5.anInt2186];
		local5.aClass19Array2 = new Class19[local5.anInt2186];
		local5.anIntArray291 = new int[local5.anInt2186];
		local5.anIntArray289 = new int[local5.anInt2186];
		local5.anIntArray290 = new int[local5.anInt2186];
		local5.aByteArrayArrayArray5 = new byte[local5.anInt2186][][];
		for (@Pc(51) int local51 = 0; local51 < local5.anInt2186; local51++) {
			try {
				@Pc(57) int local57 = arg1.method1281();
				@Pc(80) String local80;
				@Pc(89) String local89;
				@Pc(71) int local71;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local71 = 0;
					local80 = new String(arg1.method1250().method1112());
					local89 = new String(arg1.method1250().method1112());
					if (local57 == 1) {
						local71 = arg1.method1276();
					}
					local5.anIntArray290[local51] = local57;
					local5.anIntArray289[local51] = local71;
					local5.aClass19Array1[local51] = arg2.method321(local89, Static19.method426(local80));
				} else if (local57 == 3 || local57 == 4) {
					local80 = new String(arg1.method1250().method1112());
					local89 = new String(arg1.method1250().method1112());
					local71 = arg1.method1281();
					@Pc(152) String[] local152 = new String[local71];
					for (@Pc(154) int local154 = 0; local154 < local71; local154++) {
						local152[local154] = new String(arg1.method1250().method1112());
					}
					@Pc(174) byte[][] local174 = new byte[local71][];
					@Pc(185) int local185;
					if (local57 == 3) {
						for (@Pc(179) int local179 = 0; local179 < local71; local179++) {
							local185 = arg1.method1276();
							local174[local179] = new byte[local185];
							arg1.method1285(local174[local179], local185);
						}
					}
					@Pc(209) Class[] local209 = new Class[local71];
					local5.anIntArray290[local51] = local57;
					for (local185 = 0; local185 < local71; local185++) {
						local209[local185] = Static19.method426(local152[local185]);
					}
					local5.aClass19Array2[local51] = arg2.method329(local89, local209, Static19.method426(local80));
					local5.aByteArrayArrayArray5[local51] = local174;
				}
			} catch (@Pc(249) ClassNotFoundException local249) {
				local5.anIntArray291[local51] = -1;
			} catch (@Pc(256) SecurityException local256) {
				local5.anIntArray291[local51] = -2;
			} catch (@Pc(263) NullPointerException local263) {
				local5.anIntArray291[local51] = -3;
			} catch (@Pc(270) Exception local270) {
				local5.anIntArray291[local51] = -4;
			} catch (@Pc(277) Throwable local277) {
				local5.anIntArray291[local51] = -5;
			}
		}
		aClass34_16.method876(local5);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static void method557(@OriginalArg(0) int arg0) {
		if (Static78.aClass11_1 == null) {
			return;
		}
		if (Static10.anInt248 == 0) {
			if (Static30.anInt844 >= 0) {
				Static30.anInt844 = arg0;
				Static78.aClass11_1.method1859(arg0, 0);
			}
		} else if (Static51.aByteArray22 != null) {
			Static21.anInt2668 = arg0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Z")
	public static boolean method558(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(18) int local18 = Static21.anIntArray326[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		return local18 == 2;
	}
}
