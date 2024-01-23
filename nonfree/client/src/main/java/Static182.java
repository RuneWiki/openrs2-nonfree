import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!re", name = "Sb", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!re", name = "bc", descriptor = "I")
	public static int anInt4094;

	@OriginalMember(owner = "client!re", name = "Jb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1074 = Static231.method3737("Abbrechen");

	@OriginalMember(owner = "client!re", name = "Kb", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array25 = new Class107[100];

	@OriginalMember(owner = "client!re", name = "Ob", descriptor = "I")
	public static volatile int anInt4083 = 0;

	@OriginalMember(owner = "client!re", name = "Wb", descriptor = "Z")
	public static boolean aBoolean362 = true;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!sc;)I")
	public static int method2998(@OriginalArg(1) Class107 arg0) {
		return arg0.method3095() + 1;
	}

	@OriginalMember(owner = "client!re", name = "t", descriptor = "(I)V")
	public static void method2999() {
		@Pc(9) int local9 = Static25.method453();
		if (local9 == 0) {
			Static186.aByteArrayArrayArray11 = null;
			Static159.method2576(0);
		} else if (local9 == 1) {
			Static185.method3679((byte) 0);
			Static159.method2576(512);
			Static159.method2579();
		} else {
			Static185.method3679((byte) (Static157.anInt3451 - 4 & 0xFF));
			Static159.method2576(2);
		}
	}

	@OriginalMember(owner = "client!re", name = "v", descriptor = "(I)V")
	public static void method3002() {
		Static221.aClass61_90.method1697();
		Static153.aClass61_59.method1697();
		Static58.aClass61_20.method1697();
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(II)V")
	public static void method3005(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class1_Sub5 local6 = (Class1_Sub5) Static155.aClass50_8.method1358(); local6 != null; local6 = (Class1_Sub5) Static155.aClass50_8.method1361()) {
			if ((local6.aLong177 >> 48 & 0xFFFFL) == (long) arg0) {
				local6.method3735();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public static void method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub21 local6 = (Class1_Sub21) Static157.aClass120_18.method3564(); local6 != null; local6 = (Class1_Sub21) Static157.aClass120_18.method3561()) {
			Static115.method1998(arg1, arg2, local6, arg3, arg0);
		}
		for (@Pc(27) Class1_Sub21 local27 = (Class1_Sub21) Static82.aClass120_9.method3564(); local27 != null; local27 = (Class1_Sub21) Static82.aClass120_9.method3561()) {
			@Pc(31) byte local31 = 1;
			if (local27.aClass5_Sub5_Sub2_1.anInt3005 == local27.aClass5_Sub5_Sub2_1.anInt3022) {
				local31 = 0;
			} else if (local27.aClass5_Sub5_Sub2_1.anInt3002 == local27.aClass5_Sub5_Sub2_1.anInt3005) {
				local31 = 2;
			}
			if (local27.anInt3422 != local31) {
				@Pc(68) int local68 = Static19.method374(local27.aClass5_Sub5_Sub2_1);
				if (local27.anInt3424 != local68) {
					if (local27.aClass1_Sub6_Sub3_3 != null) {
						Static42.aClass1_Sub6_Sub1_1.method966(local27.aClass1_Sub6_Sub3_3);
						local27.aClass1_Sub6_Sub3_3 = null;
					}
					local27.anInt3424 = local68;
				}
				local27.anInt3422 = local31;
			}
			local27.anInt3420 = local27.aClass5_Sub5_Sub2_1.anInt2997 * 64 + local27.aClass5_Sub5_Sub2_1.anInt3044;
			local27.anInt3412 = local27.aClass5_Sub5_Sub2_1.anInt2997 * 64 + local27.aClass5_Sub5_Sub2_1.anInt3021;
			local27.anInt3413 = local27.aClass5_Sub5_Sub2_1.anInt3021;
			local27.anInt3418 = local27.aClass5_Sub5_Sub2_1.anInt3044;
			Static115.method1998(arg1, arg2, local27, arg3, arg0);
		}
		for (@Pc(149) Class1_Sub21 local149 = (Class1_Sub21) Static59.aClass50_10.method1358(); local149 != null; local149 = (Class1_Sub21) Static59.aClass50_10.method1361()) {
			@Pc(153) byte local153 = 1;
			if (local149.aClass5_Sub5_Sub1_3.anInt3022 == local149.aClass5_Sub5_Sub1_3.anInt3005) {
				local153 = 0;
			} else if (local149.aClass5_Sub5_Sub1_3.anInt3002 == local149.aClass5_Sub5_Sub1_3.anInt3005) {
				local153 = 2;
			}
			if (local153 != local149.anInt3422) {
				@Pc(186) int local186 = Static188.method3060(local149.aClass5_Sub5_Sub1_3);
				if (local149.anInt3424 != local186) {
					if (local149.aClass1_Sub6_Sub3_3 != null) {
						Static42.aClass1_Sub6_Sub1_1.method966(local149.aClass1_Sub6_Sub3_3);
						local149.aClass1_Sub6_Sub3_3 = null;
					}
					local149.anInt3424 = local186;
				}
				local149.anInt3422 = local153;
			}
			local149.anInt3412 = local149.aClass5_Sub5_Sub1_3.anInt3021 + local149.aClass5_Sub5_Sub1_3.anInt2997 * 64;
			local149.anInt3418 = local149.aClass5_Sub5_Sub1_3.anInt3044;
			local149.anInt3420 = local149.aClass5_Sub5_Sub1_3.anInt3044 + local149.aClass5_Sub5_Sub1_3.anInt2997 * 64;
			local149.anInt3413 = local149.aClass5_Sub5_Sub1_3.anInt3021;
			Static115.method1998(arg1, arg2, local149, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V")
	public static void method3009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class120 local11 = Static195.aClass120ArrayArrayArray2[Static191.anInt4237][arg0][arg1];
		if (local11 == null) {
			Static149.method2445(Static191.anInt4237, arg0, arg1);
			return;
		}
		@Pc(21) Class1_Sub2_Sub18 local21 = null;
		@Pc(23) int local23 = -99999999;
		@Pc(28) Class1_Sub2_Sub18 local28;
		for (local28 = (Class1_Sub2_Sub18) local11.method3564(); local28 != null; local28 = (Class1_Sub2_Sub18) local11.method3561()) {
			@Pc(35) Class75 local35 = Static128.method2147(local28.aClass5_Sub2_1.anInt375);
			@Pc(38) int local38 = local35.anInt2707;
			if (local35.anInt2741 == 1) {
				local38 *= local28.aClass5_Sub2_1.anInt376 + 1;
			}
			if (local38 > local23) {
				local23 = local38;
				local21 = local28;
			}
		}
		if (local21 == null) {
			Static149.method2445(Static191.anInt4237, arg0, arg1);
			return;
		}
		local11.method3571(local21);
		local28 = (Class1_Sub2_Sub18) local11.method3564();
		@Pc(89) Class5_Sub2 local89 = null;
		@Pc(91) Class5_Sub2 local91 = null;
		while (local28 != null) {
			@Pc(95) Class5_Sub2 local95 = local28.aClass5_Sub2_1;
			if (local21.aClass5_Sub2_1.anInt375 != local95.anInt375) {
				if (local89 == null) {
					local89 = local95;
				}
				if (local89.anInt375 != local95.anInt375 && local91 == null) {
					local91 = local95;
				}
			}
			local28 = (Class1_Sub2_Sub18) local11.method3561();
		}
		@Pc(134) long local134 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static20.method1728(Static191.anInt4237, arg0, arg1, Static130.method2174(Static191.anInt4237, arg1 * 128 + 64, arg0 * 128 + 64), local21.aClass5_Sub2_1, local134, local89, local91);
	}
}
