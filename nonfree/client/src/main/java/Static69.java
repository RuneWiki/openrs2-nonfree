import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!gd;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt1395;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_655 = Static193.method3027("Drop");

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!oc;")
	public static Class70 aClass70_656 = aClass70_655;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_657 = Static193.method3027("<br>(X100(U(Y");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILclient!m;Lclient!m;IIIIJLclient!lj;)V")
	public static void method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(5) Class26 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10, @OriginalArg(11) Class59 arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class83 local6 = new Class83();
		local6.aLong111 = arg10;
		local6.anInt3367 = arg1 * 128 + 64;
		local6.anInt3364 = arg2 * 128 + 64;
		local6.anInt3360 = arg3;
		local6.aClass26_8 = arg4;
		local6.aClass26_9 = arg5;
		local6.anInt3369 = arg6;
		local6.anInt3365 = arg7;
		local6.anInt3362 = arg8;
		local6.anInt3363 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static118.aClass3_Sub6ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static118.aClass3_Sub6ArrayArrayArray1[local46][arg1][arg2] = new Class3_Sub6(local46, arg1, arg2);
			}
		}
		Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass83_1 = local6;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Z")
	public static boolean method1010() {
		try {
			return Static113.method1637();
		} catch (@Pc(14) IOException local14) {
			Static117.method1690();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static155.anInt3189 + "," + Static141.anInt2853 + "," + Static121.anInt2459 + " - " + Static192.anInt3908 + "," + (Static144.aClass26_Sub2_Sub1_1.anIntArray182[0] + Static30.anInt695) + "," + (Static55.anInt1184 + Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]) + " - ";
			for (@Pc(61) int local61 = 0; Static192.anInt3908 > local61 && local61 < 50; local61++) {
				local59 = local59 + Static48.aClass3_Sub4_Sub1_43.aByteArray12[local61] + ",";
			}
			Static208.method1860(local59, local19);
			Static5.method88();
			return true;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[Lclient!b;)V")
	public static void method1011(@OriginalArg(0) int arg0, @OriginalArg(2) Class6[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class6 local6 = arg1[local1];
			if (local6 != null) {
				if (local6.anInt250 == 0) {
					if (local6.aClass6Array1 != null) {
						method1011(arg0, local6.aClass6Array1);
					}
					@Pc(30) Class3_Sub10 local30 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local6.anInt229);
					if (local30 != null) {
						Static138.method1978(arg0, local30.anInt1427);
					}
				}
				@Pc(49) Class3_Sub26 local49;
				if (arg0 == 0 && local6.anObjectArray11 != null) {
					local49 = new Class3_Sub26();
					local49.aClass6_116 = local6;
					local49.anObjectArray29 = local6.anObjectArray11;
					Static185.method2901(local49);
				}
				if (arg0 == 1 && local6.anObjectArray21 != null) {
					if (local6.anInt261 >= 0) {
						@Pc(73) Class6 local73 = Static146.method2127(local6.anInt229);
						if (local73 == null || local73.aClass6Array1 == null || local6.anInt261 >= local73.aClass6Array1.length || local73.aClass6Array1[local6.anInt261] != local6) {
							continue;
						}
					}
					local49 = new Class3_Sub26();
					local49.aClass6_116 = local6;
					local49.anObjectArray29 = local6.anObjectArray21;
					Static185.method2901(local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
	public static int method1012(@OriginalArg(1) int arg0) {
		if (Static203.anInt4141 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
	public static void method1014(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7 local12 = (Class3_Sub7) Static145.aClass40_10.method1029((long) arg0);
		if (local12 != null) {
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray61.length; local25++) {
				local12.anIntArray61[local25] = -1;
				local12.anIntArray62[local25] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] method1015() {
		@Pc(13) Class3_Sub3_Sub2_Sub1[] local13 = new Class3_Sub3_Sub2_Sub1[Static76.anInt1503];
		for (@Pc(15) int local15 = 0; local15 < Static76.anInt1503; local15++) {
			@Pc(21) Class3_Sub3_Sub2_Sub1 local21 = new Class3_Sub3_Sub2_Sub1();
			local21.anInt169 = Static88.anInt1712;
			local21.anInt166 = Static126.anInt2492;
			local21.anInt168 = Static176.anIntArray295[local15];
			local21.anInt167 = Static160.anIntArray245[local15];
			local21.anInt164 = Static163.anIntArray250[local15];
			local21.anInt165 = Static172.anIntArray284[local15];
			@Pc(51) byte[] local51 = Static204.aByteArrayArray9[local15];
			@Pc(57) int local57 = local21.anInt165 * local21.anInt164;
			local21.anIntArray6 = new int[local57];
			for (@Pc(63) int local63 = 0; local63 < local57; local63++) {
				local21.anIntArray6[local63] = Static63.anIntArray75[local51[local63] & 0xFF];
			}
			local13[local15] = local21;
		}
		Static161.method2418();
		return local13;
	}
}
