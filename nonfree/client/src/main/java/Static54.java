import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!gq;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array3;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!am;")
	public static Class11 aClass11_20;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!am;")
	public static Class11 aClass11_21;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public static int anInt1198 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method996(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < Static156.anInt3506; local9++) {
			@Pc(17) Class2_Sub2_Sub1_Sub1 local17 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local9]];
			if (local17 != null && local17.aString22 != null && local17.aString22.equalsIgnoreCase(arg0)) {
				local7 = true;
				if (arg1 == 1) {
					Static320.aClass4_Sub7_Sub1_3.method1237(122);
					Static320.aClass4_Sub7_Sub1_3.method2362(Static39.anIntArray105[local9]);
					Static320.aClass4_Sub7_Sub1_3.method2418(0);
				} else if (arg1 == 4) {
					Static320.aClass4_Sub7_Sub1_3.method1237(180);
					Static320.aClass4_Sub7_Sub1_3.method2416(0);
					Static320.aClass4_Sub7_Sub1_3.method2390(Static39.anIntArray105[local9]);
				} else if (arg1 == 5) {
					Static320.aClass4_Sub7_Sub1_3.method1237(205);
					Static320.aClass4_Sub7_Sub1_3.method2362(Static39.anIntArray105[local9]);
					Static320.aClass4_Sub7_Sub1_3.method2418(0);
				} else if (arg1 == 6) {
					Static320.aClass4_Sub7_Sub1_3.method1237(245);
					Static320.aClass4_Sub7_Sub1_3.method2371(0);
					Static320.aClass4_Sub7_Sub1_3.method2390(Static39.anIntArray105[local9]);
				} else if (arg1 == 7) {
					Static320.aClass4_Sub7_Sub1_3.method1237(212);
					Static320.aClass4_Sub7_Sub1_3.method2371(0);
					Static320.aClass4_Sub7_Sub1_3.method2406(Static39.anIntArray105[local9]);
				}
				break;
			}
		}
		if (!local7) {
			Static159.method3073(Static194.aString143 + arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method997(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static71.anInt1618 > 0) {
			local16 = Static102.aByteArrayArray7[--Static71.anInt1618];
			Static102.aByteArrayArray7[Static71.anInt1618] = null;
			return local16;
		} else if (arg0 == 5000 && Static296.anInt5972 > 0) {
			local16 = Static307.aByteArrayArray15[--Static296.anInt5972];
			Static307.aByteArrayArray15[Static296.anInt5972] = null;
			return local16;
		} else if (arg0 == 30000 && Static286.anInt5803 > 0) {
			local16 = Static304.aByteArrayArray23[--Static286.anInt5803];
			Static304.aByteArrayArray23[Static286.anInt5803] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static338.anInt5369 && Static295.anInt5964 >= arg4 && arg7 >= Static338.anInt5369 && Static295.anInt5964 >= arg7 && Static338.anInt5369 <= arg8 && arg8 <= Static295.anInt5964 && Static338.anInt5369 <= arg0 && Static295.anInt5964 >= arg0 && Static229.anInt4777 <= arg2 && arg2 <= Static165.anInt3366 && Static229.anInt4777 <= arg3 && arg3 <= Static165.anInt3366 && Static229.anInt4777 <= arg1 && arg1 <= Static165.anInt3366 && Static229.anInt4777 <= arg6 && Static165.anInt3366 >= arg6) {
			Static218.method3767(arg7, arg8, arg4, arg3, arg5, arg1, arg6, arg2, arg0);
		} else {
			Static154.method2990(arg4, arg5, arg3, arg1, arg2, arg6, arg8, arg7, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
	public static int method999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1000() {
		if (Static172.anInt3803 != 3) {
			Static320.anInt6328 = -1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method1001() {
		while (true) {
			if (Static200.aClass4_Sub7_Sub1_2.method1246(Static302.anInt6099) >= 11) {
				@Pc(12) int local12 = Static200.aClass4_Sub7_Sub1_2.method1247(11);
				if (local12 != 2047) {
					@Pc(17) boolean local17 = false;
					if (Static253.aClass2_Sub2_Sub1_Sub1Array1[local12] == null) {
						Static253.aClass2_Sub2_Sub1_Sub1Array1[local12] = new Class2_Sub2_Sub1_Sub1();
						Static253.aClass2_Sub2_Sub1_Sub1Array1[local12].anInt6535 = local12;
						local17 = true;
						if (Static349.aClass4_Sub7Array1[local12] != null) {
							Static253.aClass2_Sub2_Sub1_Sub1Array1[local12].method653(Static349.aClass4_Sub7Array1[local12]);
						}
					}
					Static39.anIntArray105[Static156.anInt3506++] = local12;
					@Pc(58) Class2_Sub2_Sub1_Sub1 local58 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local12];
					local58.anInt6515 = Static342.anInt6706;
					@Pc(66) int local66 = Static200.aClass4_Sub7_Sub1_2.method1247(5);
					if (local66 > 15) {
						local66 -= 32;
					}
					@Pc(75) int local75 = Static200.aClass4_Sub7_Sub1_2.method1247(5);
					if (local75 > 15) {
						local75 -= 32;
					}
					@Pc(86) int local86 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
					@Pc(91) int local91 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
					if (local91 == 1) {
						Static49.anIntArray122[Static104.anInt6829++] = local12;
					}
					@Pc(109) int local109 = Static258.anIntArray438[Static200.aClass4_Sub7_Sub1_2.method1247(3)];
					if (local17) {
						local58.method5421(local109);
					}
					local58.method654(Static279.anInt5645, local75 + Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0], local86 == 1, local66 + Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0]);
					continue;
				}
			}
			Static200.aClass4_Sub7_Sub1_2.method1241();
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!fd;II)Ljava/lang/String;")
	public static String method1002(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1) {
		if (!Static46.method876(arg0).method257(arg1) && arg0.anObjectArray12 == null) {
			return null;
		} else if (arg0.aStringArray17 == null || arg0.aStringArray17.length <= arg1 || arg0.aStringArray17[arg1] == null || arg0.aStringArray17[arg1].trim().length() == 0) {
			return Static93.aBoolean179 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray17[arg1];
		}
	}
}
