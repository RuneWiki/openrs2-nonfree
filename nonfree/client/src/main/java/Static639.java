import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vl", name = "zb", descriptor = "Lclient!da;")
	public static Class59 aClass59_14;

	@OriginalMember(owner = "client!vl", name = "ib", descriptor = "Lclient!ss;")
	public static final Class340 aClass340_13 = new Class340("", 13);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V")
	public static void method9457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static640.anInt11085 + arg2;
		@Pc(18) int local18 = Static490.anInt8763 + arg0;
		if (Static193.aClass291ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || arg2 >= Static222.anInt4533 || Static668.anInt11370 <= arg0 || Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 0 && arg1 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142) {
			return;
		}
		@Pc(71) long local71 = (long) (local9 | arg1 << 28 | local18 << 14);
		@Pc(79) Class2_Sub47 local79 = (Class2_Sub47) Static18.aClass335_2.method8357(local71);
		if (local79 == null) {
			Static329.method5441(arg1, arg2, arg0);
			return;
		}
		@Pc(93) Class2_Sub41 local93 = (Class2_Sub41) local79.aClass271_57.method7177();
		if (local93 == null) {
			Static329.method5441(arg1, arg2, arg0);
			return;
		}
		@Pc(107) Class15_Sub3_Sub2_Sub1 local107 = (Class15_Sub3_Sub2_Sub1) Static329.method5441(arg1, arg2, arg0);
		if (local107 == null) {
			local107 = new Class15_Sub3_Sub2_Sub1(arg2 << 9, Static245.aClass18Array14[arg1].method8537(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local107.anInt4952 = local107.anInt4964 = -1;
		}
		local107.anInt4961 = local93.anInt7375;
		local107.anInt4965 = local93.anInt7377;
		label56: while (true) {
			@Pc(150) Class2_Sub41 local150 = (Class2_Sub41) local79.aClass271_57.method7175();
			if (local150 == null) {
				break;
			}
			if (local107.anInt4961 != local150.anInt7375) {
				local107.anInt4952 = local150.anInt7375;
				local107.anInt4963 = local150.anInt7377;
				while (true) {
					@Pc(171) Class2_Sub41 local171 = (Class2_Sub41) local79.aClass271_57.method7175();
					if (local171 == null) {
						break label56;
					}
					if (local107.anInt4961 != local171.anInt7375 && local171.anInt7375 != local107.anInt4952) {
						local107.anInt4954 = local171.anInt7377;
						local107.anInt4964 = local171.anInt7375;
					}
				}
			}
		}
		@Pc(215) int local215 = Static10.method154((arg0 << 9) + 256, (arg2 << 9) + 256, arg1);
		local107.anInt11024 = arg0 << 9;
		local107.aByte141 = (byte) arg1;
		local107.anInt11029 = local215;
		local107.anInt11022 = arg2 << 9;
		local107.aByte142 = (byte) arg1;
		local107.anInt4966 = 0;
		if (Static45.method947(arg2, arg0)) {
			local107.aByte141++;
		}
		Static684.method4305(arg1, arg2, arg0, local215, local107);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLclient!ol;)V")
	public static void method9458(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method5173();
		Static357.aClass122Array1 = new Class122[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static357.aClass122Array1[local14] = new Class122();
			Static357.aClass122Array1[local14].anInt3866 = arg0.method5173();
			Static357.aClass122Array1[local14].aString43 = arg0.method5183();
		}
		Static401.anInt7422 = arg0.method5173();
		Static585.anInt10166 = arg0.method5173();
		Static78.anInt1437 = arg0.method5173();
		Static4.aClass234_Sub1Array1 = new Class234_Sub1[Static585.anInt10166 + 1 - Static401.anInt7422];
		for (@Pc(62) int local62 = 0; local62 < Static78.anInt1437; local62++) {
			@Pc(68) int local68 = arg0.method5173();
			@Pc(76) Class234_Sub1 local76 = Static4.aClass234_Sub1Array1[local68] = new Class234_Sub1();
			local76.anInt7091 = arg0.method5203();
			local76.anInt7086 = arg0.method5172();
			local76.anInt7096 = local68 + Static401.anInt7422;
			local76.aString86 = arg0.method5183();
			local76.aString85 = arg0.method5183();
		}
		Static186.anInt3867 = arg0.method5172();
		Static302.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)I")
	public static int method9459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static205.anIntArray196[arg1 & 0x3] : Static666.anIntArray595[arg1 & 0x3];
	}
}
