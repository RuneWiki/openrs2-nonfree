import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "[Lclient!mb;")
	public static Class2_Sub3[] aClass2_Sub3Array6;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public static int anInt8404;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII[BI[BI)V")
	public static void method6943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(19) int local19 = -(arg0 & 0x3);
		for (@Pc(22) int local22 = -arg7; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg3++;
				arg4[local30] = (byte) (arg4[local30] - arg6[arg1++]);
				@Pc(43) int local43 = arg3++;
				arg4[local43] = (byte) (arg4[local43] - arg6[arg1++]);
				@Pc(56) int local56 = arg3++;
				arg4[local56] = (byte) (arg4[local56] - arg6[arg1++]);
				@Pc(69) int local69 = arg3++;
				arg4[local69] = (byte) (arg4[local69] - arg6[arg1++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg3++;
				arg4[local30] = (byte) (arg4[local30] - arg6[arg1++]);
			}
			arg3 += arg2;
			arg1 += arg5;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	public static void method6945(@OriginalArg(1) int arg0) {
		Static353.anInt6903 = arg0;
		Static118.anInt3044 = -1;
		Static642.anInt10524 = -1;
		Static249.method4696();
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public static void method6946() {
		Static392.aClass258_4.method6556();
		Static265.aClass310_4.method7462();
		Static510.aClass97_2.method3263();
		Static541.aClass349_4.method8121();
		Static604.aClass139_2.method4338();
		Static367.aClass281_1.method6984();
		Static618.aClass222_2.method5863();
		Static35.aClass343_1.method8029();
		Static390.aClass359_1.method8268();
		Static90.aClass335_1.method7998();
		Static367.aClass285_1.method7021();
		Static34.aClass115_1.method3751();
		Static168.aClass204_3.method5451();
		Static513.aClass49_2.method1853();
		Static552.aClass360_1.method8270();
		Static20.aClass202_1.method5438();
		Static57.aClass265_33.method6688();
		Static461.aClass220_1.method5818();
		Static535.aClass110_3.method3579();
		Static5.aClass236_1.method6058();
		Static203.aClass306_1.method7416();
		Static358.method5830();
		Static395.method6319();
		Static633.method8556();
		Static66.method1483();
		Static162.method3433();
		Static557.aClass112_60.method3637(5);
		Static150.aClass112_16.method3637(5);
		Static214.aClass112_41.method3637(5);
		Static122.aClass112_14.method3637(5);
		Static84.aClass112_10.method3637(5);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
	public static void method6947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(18) int local18 = -1;
		Static580.method8027(Static104.anIntArrayArray24[arg1], arg0 + arg2, -arg2 + arg0, arg3);
		while (local9 > local7) {
			local18 += 2;
			local16 += local18;
			local7++;
			if (local16 >= 0) {
				local9--;
				local16 -= local9 << 1;
				@Pc(54) int[] local54 = Static104.anIntArrayArray24[arg1 + local9];
				@Pc(60) int[] local60 = Static104.anIntArrayArray24[arg1 - local9];
				@Pc(64) int local64 = local7 + arg0;
				@Pc(69) int local69 = arg0 - local7;
				Static580.method8027(local54, local64, local69, arg3);
				Static580.method8027(local60, local64, local69, arg3);
			}
			@Pc(85) int local85 = arg0 + local9;
			@Pc(89) int local89 = arg0 - local9;
			@Pc(95) int[] local95 = Static104.anIntArrayArray24[local7 + arg1];
			@Pc(102) int[] local102 = Static104.anIntArrayArray24[arg1 - local7];
			Static580.method8027(local95, local85, local89, arg3);
			Static580.method8027(local102, local85, local89, arg3);
		}
	}
}
