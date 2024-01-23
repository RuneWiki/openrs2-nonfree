import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public static int anInt2865 = -1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	public static void method2465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class59 local9 = Static270.aClass59ArrayArrayArray1[Static65.anInt1300][arg0][arg1];
		if (local9 == null) {
			Static50.method948(Static65.anInt1300, arg0, arg1);
			return;
		}
		@Pc(25) int local25 = -99999999;
		@Pc(27) Class1_Sub2_Sub14 local27 = null;
		@Pc(32) Class1_Sub2_Sub14 local32;
		for (local32 = (Class1_Sub2_Sub14) local9.method1704(); local32 != null; local32 = (Class1_Sub2_Sub14) local9.method1701()) {
			@Pc(41) Class102 local41 = Static49.method909(local32.aClass15_Sub1_1.anInt339);
			@Pc(44) int local44 = local41.anInt3194;
			if (local41.anInt3185 == 1) {
				local44 *= local32.aClass15_Sub1_1.anInt336 + 1;
			}
			if (local44 > local25) {
				local25 = local44;
				local27 = local32;
			}
		}
		if (local27 == null) {
			Static50.method948(Static65.anInt1300, arg0, arg1);
			return;
		}
		@Pc(83) Class15_Sub1 local83 = null;
		local9.method1702(local27);
		local32 = (Class1_Sub2_Sub14) local9.method1704();
		@Pc(94) Class15_Sub1 local94 = null;
		while (local32 != null) {
			@Pc(99) Class15_Sub1 local99 = local32.aClass15_Sub1_1;
			if (local27.aClass15_Sub1_1.anInt339 != local99.anInt339) {
				if (local83 == null) {
					local83 = local99;
				}
				if (local83.anInt339 != local99.anInt339 && local94 == null) {
					local94 = local99;
				}
			}
			local32 = (Class1_Sub2_Sub14) local9.method1701();
		}
		@Pc(141) long local141 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static238.method3677(Static65.anInt1300, arg0, arg1, Static69.method4275(arg1 * 128 + 64, Static65.anInt1300, arg0 * 128 + 64), local27.aClass15_Sub1_1, local141, local83, local94);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method2466(@OriginalArg(0) String[] arg0) {
		@Pc(12) String[] local12 = new String[5];
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			local12[local14] = local14 + ": ";
			if (arg0 != null && arg0[local14] != null) {
				local12[local14] = local12[local14] + arg0[local14];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BC)Z")
	public static boolean method2467(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!lf;)Lclient!u;")
	public static Class44_Sub4 method2468(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class44_Sub4(arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1352(), arg0.method1378());
	}
}
