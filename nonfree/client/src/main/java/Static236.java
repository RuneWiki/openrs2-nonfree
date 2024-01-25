import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "Lclient!rr;")
	public static Class49_Sub1 aClass49_Sub1_2;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!wia;II)Lclient!vm;")
	public static Class14_Sub53 method3558(@OriginalArg(0) Class386 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method9192(arg1);
		return local13 == null ? null : new Class14_Sub53(local13);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)V")
	public static void method3560(@OriginalArg(1) int arg0) {
		if (Static430.anInt7691 == 7 && (Static499.anInt8832 == 0 && Static101.anInt2152 == 0)) {
			Static652.anInt10896 = arg0;
			Static67.method1345(9);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public static void method3561() {
		if (Static563.anInt9769 == -1) {
			return;
		}
		@Pc(13) int local13 = Static666.aClass79_1.method3361();
		@Pc(17) int local17 = Static666.aClass79_1.method3358();
		@Pc(22) Class14_Sub30 local22 = (Class14_Sub30) Static425.aClass262_44.method6318();
		if (local22 != null) {
			local13 = local22.method8578();
			local17 = local22.method8571();
		}
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		if (Static128.aBoolean202) {
			local39 = Static619.method8679();
			local41 = Static571.method8194();
		}
		Static523.method7522(local13, local41 + Static639.anInt10685, local41 + local17, local41, Static563.anInt9769, local39, local17, local39 + local13, local39, local39 + Static561.anInt9759, local41);
		if (Static289.aClass230_3 != null) {
			Static472.method6855(local41 + local17, local39 + local13);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!mea;IILclient!jd;Lclient!aa;II)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class20 arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Static378.anInt6935 == 4) {
			local22 = (int) Static543.aFloat228 & 0x3FFF;
		} else {
			local22 = (int) Static543.aFloat228 + Static470.anInt10171 & 0x3FFF;
		}
		@Pc(43) int local43 = Math.max(arg1.anInt6703 / 2, arg1.anInt6701 / 2) + 10;
		@Pc(52) int local52 = arg2 * arg2 + arg5 * arg5;
		if (local43 * local43 < local52) {
			return;
		}
		@Pc(66) int local66 = Class32.anIntArray76[local22];
		@Pc(70) int local70 = Class32.anIntArray77[local22];
		if (Static378.anInt6935 != 4) {
			local70 = local70 * 256 / (Static422.anInt7593 + 256);
			local66 = local66 * 256 / (Static422.anInt7593 + 256);
		}
		@Pc(99) int local99 = arg2 * local70 + local66 * arg5 >> 14;
		@Pc(110) int local110 = arg5 * local70 - local66 * arg2 >> 14;
		arg3.method7404(local99 + arg1.anInt6703 / 2 + arg0 - arg3.method7394() / 2, arg1.anInt6701 / 2 + arg6 - local110 + -(arg3.method7408() / 2), arg4, arg0, arg6);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIII)V")
	public static void method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg0 + Static329.anInt6225;
		@Pc(13) int local13 = Static202.anInt3755 + arg2;
		if (Static486.aClass58ArrayArrayArray2 == null || arg0 < 0 || arg2 < 0 || Static26.anInt462 <= arg0 || Static445.anInt6140 <= arg2 || Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 0 && arg1 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
			return;
		}
		@Pc(55) long local55 = (long) (arg1 << 28 | local13 << 14 | local9);
		@Pc(61) Class14_Sub42 local61 = (Class14_Sub42) Static568.aClass187_71.method4078(local55);
		if (local61 == null) {
			Static267.method3910(arg1, arg0, arg2);
			return;
		}
		@Pc(75) Class14_Sub41 local75 = (Class14_Sub41) local61.aClass262_47.method6318();
		if (local75 == null) {
			Static267.method3910(arg1, arg0, arg2);
			return;
		}
		@Pc(89) Class12_Sub2_Sub5_Sub1 local89 = (Class12_Sub2_Sub5_Sub1) Static267.method3910(arg1, arg0, arg2);
		if (local89 == null) {
			local89 = new Class12_Sub2_Sub5_Sub1(arg0 << 9, Static576.aClass51Array3[arg1].method7857(arg2, arg0), arg2 << 9, arg1, arg1);
		} else {
			local89.anInt7115 = local89.anInt7121 = -1;
		}
		local89.anInt7113 = local75.anInt7971;
		local89.anInt7123 = local75.anInt7970;
		label56: while (true) {
			@Pc(134) Class14_Sub41 local134 = (Class14_Sub41) local61.aClass262_47.method6311();
			if (local134 == null) {
				break;
			}
			if (local89.anInt7113 != local134.anInt7971) {
				local89.anInt7115 = local134.anInt7971;
				local89.anInt7111 = local134.anInt7970;
				while (true) {
					@Pc(159) Class14_Sub41 local159 = (Class14_Sub41) local61.aClass262_47.method6311();
					if (local159 == null) {
						break label56;
					}
					if (local159.anInt7971 != local89.anInt7113 && local159.anInt7971 != local89.anInt7115) {
						local89.anInt7121 = local159.anInt7971;
						local89.anInt7112 = local159.anInt7970;
					}
				}
			}
		}
		@Pc(207) int local207 = Static152.method2434((arg0 << 9) + 256, arg1, (arg2 << 9) + 256);
		local89.anInt10998 = arg0 << 9;
		local89.aByte146 = (byte) arg1;
		local89.anInt7127 = 0;
		local89.aByte145 = (byte) arg1;
		local89.anInt11002 = arg2 << 9;
		local89.anInt10997 = local207;
		if (Static329.method5158(arg2, arg0)) {
			local89.aByte145++;
		}
		Static30.method693(arg1, arg0, arg2, local207, local89);
	}
}
