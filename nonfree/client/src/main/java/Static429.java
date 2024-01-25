import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
	public static int anInt7876;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "Lclient!in;")
	public static final Class169 aClass169_188 = new Class169(10, 0);

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Lclient!fe;")
	public static final Class103 aClass103_8 = new Class103();

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
	public static int anInt7877 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method7034(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static64.aClass101_1 = arg0;
		Static299.anInt5460 = arg1;
		Static27.aBoolean27 = Static299.anInt5460 > 1 && Static64.aClass101_1.method8114();
		Static170.anInt3602 = 9;
		Static536.anInt4502 = 0x1 << Static170.anInt3602;
		Static124.anInt2431 = Static536.anInt4502 >> 1;
		Math.sqrt((double) (Static124.anInt2431 * Static124.anInt2431 + Static124.anInt2431 * Static124.anInt2431));
		Static60.anInt1169 = 4;
		Static585.anInt10170 = arg2;
		Static202.anInt4238 = arg3;
		Static602.anInt10539 = arg4;
		Static129.aClass69_1 = Static267.method9826();
		Static395.method6569();
		Static242.aClass291ArrayArrayArray3 = new Class291[4][Static585.anInt10170][Static202.anInt4238];
		Static549.aClass18Array30 = new Class18[4];
		if (arg5) {
			Static503.anIntArrayArray38 = new int[Static585.anInt10170][Static202.anInt4238];
			Static669.aByteArrayArray27 = new byte[Static585.anInt10170][Static202.anInt4238];
			Static141.aShortArrayArray7 = new short[Static585.anInt10170][Static202.anInt4238];
			Static46.aClass291ArrayArrayArray1 = new Class291[1][Static585.anInt10170][Static202.anInt4238];
			Static93.aClass18Array33 = new Class18[1];
		} else {
			Static503.anIntArrayArray38 = null;
			Static669.aByteArrayArray27 = null;
			Static141.aShortArrayArray7 = null;
			Static46.aClass291ArrayArrayArray1 = null;
			Static93.aClass18Array33 = null;
		}
		if (arg6) {
			Static163.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static320.aClass84Array8 = new Class84[65535];
			Static345.aBooleanArray36 = new boolean[65535];
			Static262.anInt5002 = 0;
		} else {
			Static163.aLongArrayArrayArray1 = null;
			Static320.aClass84Array8 = null;
			Static345.aBooleanArray36 = null;
			Static262.anInt5002 = 0;
		}
		Static312.method5104(false);
		Static603.aClass15_Sub3Array5 = new Class15_Sub3[2];
		Static440.aClass15_Sub3Array4 = new Class15_Sub3[2];
		Static98.aClass15_Sub3Array2 = new Class15_Sub3[2];
		Static8.aClass15_Sub3Array1 = new Class15_Sub3[10000];
		Static43.anInt8881 = 0;
		Static425.aClass15_Sub3Array3 = new Class15_Sub3[5000];
		Static644.anInt11134 = 0;
		Static212.aClass15_Sub3_Sub3Array1 = new Class15_Sub3_Sub3[5000];
		Static533.anInt9353 = 0;
		Static423.aBooleanArrayArray8 = new boolean[Static602.anInt10539 + Static602.anInt10539 + 1][Static602.anInt10539 + Static602.anInt10539 + 1];
		Static85.aBooleanArrayArray3 = new boolean[Static602.anInt10539 + Static602.anInt10539 + 2][Static602.anInt10539 + Static602.anInt10539 + 2];
		Static101.anIntArray94 = new int[Static602.anInt10539 + Static602.anInt10539 + 2];
		Static212.aClass217_1 = Static212.aClass217_2;
		if (Static27.aBoolean27) {
			Static151.aBooleanArrayArrayArray2 = new boolean[4][Static602.anInt10539 + Static602.anInt10539 + 1][Static602.anInt10539 + Static602.anInt10539 + 1];
			Static135.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static549.aClass314Array1 != null) {
				Static10.method155();
			}
			Static549.aClass314Array1 = new Class314[Static299.anInt5460];
			Static64.aClass101_1.method8088(Static549.aClass314Array1.length + 1);
			Static64.aClass101_1.method8062(0);
			for (@Pc(205) int local205 = 0; local205 < Static549.aClass314Array1.length; local205++) {
				Static549.aClass314Array1[local205] = new Class314(local205 + 1, Static64.aClass101_1);
				(new Thread(Static549.aClass314Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static299.anInt5460 == 2) {
				local240 = 4;
				Static294.anInt5364 = 2;
			} else if (Static299.anInt5460 == 3) {
				local240 = 6;
				Static294.anInt5364 = 3;
			} else {
				local240 = 8;
				Static294.anInt5364 = 4;
			}
			Static647.aClass119Array1 = new Class119[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static647.aClass119Array1[local260] = new Class119(Static673.aStringArrayArray4[Static299.anInt5460 - 2][local260]);
			}
		} else {
			Static294.anInt5364 = 1;
		}
		Static668.anIntArray596 = new int[Static294.anInt5364 - 1];
		Static654.anIntArray589 = new int[Static294.anInt5364 - 1];
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!m;IIIIIIIILclient!ha;I)V")
	public static void method7035(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class101 arg9, @OriginalArg(11) int arg10) {
		if (arg7 < arg3 && arg3 < arg6 + arg7 && arg4 - 13 < arg2 && arg4 + 3 > arg2 && arg1.aBoolean522) {
			arg5 = arg0;
		}
		@Pc(28) int[] local28 = null;
		if (Static87.method1543(arg1.anInt6866)) {
			local28 = Static372.aClass343_1.method8549((int) arg1.aLong181).anIntArray517;
		} else if (arg1.anInt6867 != -1) {
			local28 = Static372.aClass343_1.method8549(arg1.anInt6867).anIntArray517;
		} else if (Static377.method6405(arg1.anInt6866)) {
			@Pc(103) Class2_Sub6 local103 = (Class2_Sub6) Static630.aClass335_29.method8357((long) (int) arg1.aLong181);
			if (local103 != null) {
				@Pc(108) Class15_Sub3_Sub3_Sub1_Sub2 local108 = local103.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				@Pc(111) Class312 local111 = local108.aClass312_1;
				if (local111.anIntArray458 != null) {
					local111 = local111.method7953(Static113.aClass282_1);
				}
				if (local111 != null) {
					local28 = local111.anIntArray460;
				}
			}
		} else if (Static190.method3693(arg1.anInt6866)) {
			@Pc(72) Class331 local72;
			if (arg1.anInt6866 == 1006) {
				local72 = Static251.aClass328_1.method8261((int) arg1.aLong181);
			} else {
				local72 = Static251.aClass328_1.method8261((int) (arg1.aLong181 >>> 32 & 0x7FFFFFFFL));
			}
			if (local72.anIntArray486 != null) {
				local72 = local72.method8304(Static113.aClass282_1);
			}
			if (local72 != null) {
				local28 = local72.anIntArray483;
			}
		}
		@Pc(137) String local137 = Static188.method7429(arg1);
		if (local28 != null) {
			local137 = local137 + Static141.method2458(local28);
		}
		Static253.aClass59_5.method9571(local137, Static277.anIntArray597, Static251.aClass71Array25, arg4, arg7 + 3, arg5);
		if (arg1.aBoolean521) {
			Static310.aClass71_10.method7703(arg7 + Static648.aClass324_12.method8181(local137) + 5, arg4 + -12);
		}
	}
}
