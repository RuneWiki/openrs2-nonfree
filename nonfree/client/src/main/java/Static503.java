import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread6;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	public static int anInt8018 = 0;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!ug;")
	public static final Class372 aClass372_4 = new Class372();

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "Lclient!ug;")
	public static final Class372 aClass372_5 = new Class372();

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[B")
	public static final byte[] aByteArray80 = new byte[2048];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static497.aBoolean530 = true;
		Static626.aBoolean647 = Static404.aClass22_6.method9362() > 0;
		Static314.aBoolean334 = true;
		Static507.anInt8070 = arg1 >> Static626.anInt9669;
		Static527.anInt8230 = arg3 >> Static626.anInt9669;
		Static142.anInt2646 = arg1;
		Static664.anInt10179 = arg3;
		Static374.anInt5843 = arg2;
		Static282.anInt2240 = Static507.anInt8070 - Static720.anInt11190;
		if (Static282.anInt2240 < 0) {
			Static315.anInt5070 = -Static282.anInt2240;
			Static282.anInt2240 = 0;
		} else {
			Static315.anInt5070 = 0;
		}
		Static74.anInt1707 = Static527.anInt8230 - Static720.anInt11190;
		if (Static74.anInt1707 < 0) {
			Static394.anInt6135 = -Static74.anInt1707;
			Static74.anInt1707 = 0;
		} else {
			Static394.anInt6135 = 0;
		}
		Static109.anInt2308 = Static507.anInt8070 + Static720.anInt11190;
		if (Static109.anInt2308 > Static128.anInt2531) {
			Static109.anInt2308 = Static128.anInt2531;
		}
		Static21.anInt707 = Static527.anInt8230 + Static720.anInt11190;
		if (Static21.anInt707 > Static448.anInt6835) {
			Static21.anInt707 = Static448.anInt6835;
		}
		@Pc(79) boolean[][] local79 = Static181.aBooleanArrayArray2;
		@Pc(81) boolean[][] local81 = Static696.aBooleanArrayArray7;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (Static314.aBoolean334) {
			for (local85 = 0; local85 < Static720.anInt11190 + Static720.anInt11190 + 2; local85++) {
				local88 = 0;
				local90 = 0;
				for (@Pc(92) int local92 = 0; local92 < Static720.anInt11190 + Static720.anInt11190 + 2; local92++) {
					if (local92 > 1) {
						Static419.anIntArray745[local92 - 2] = local88;
					}
					local88 = local90;
					@Pc(112) int local112 = Static507.anInt8070 + local85 - Static720.anInt11190;
					@Pc(118) int local118 = Static527.anInt8230 + local92 - Static720.anInt11190;
					@Pc(138) int local138;
					if (local112 >= 0 && local118 >= 0 && local112 < Static128.anInt2531 && local118 < Static448.anInt6835) {
						local138 = local112 << Static626.anInt9669;
						@Pc(142) int local142 = local118 << Static626.anInt9669;
						@Pc(159) int local159 = Static43.aClass259Array1[Static43.aClass259Array1.length - 1].method9295(local118, local112) - (0x3E8 << Static626.anInt9669 - 7);
						@Pc(188) int local188 = (Static378.aClass259Array2 == null ? Static43.aClass259Array1[0].method9295(local118, local112) + Static308.anInt4969 : Static378.aClass259Array2[0].method9295(local118, local112) + Static308.anInt4969) + (0x3E8 << Static626.anInt9669 - 7);
						local90 = arg15 >= 0 ? Static404.aClass22_6.r(local138, local159, local142, local138, local188, local142, arg15) : Static404.aClass22_6.JA(local138, local159, local142, local138, local188, local142);
						Static696.aBooleanArrayArray7[local85][local92] = local90 == 0;
					} else {
						local90 = -1;
						Static696.aBooleanArrayArray7[local85][local92] = false;
					}
					if (local85 > 0 && local92 > 0) {
						local138 = Static419.anIntArray745[local92 - 1] & Static419.anIntArray745[local92] & local88 & local90;
						Static181.aBooleanArrayArray2[local85 - 1][local92 - 1] = local138 == 0;
					}
				}
				Static419.anIntArray745[Static720.anInt11190 + Static720.anInt11190] = local88;
				Static419.anIntArray745[Static720.anInt11190 + Static720.anInt11190 + 1] = local90;
			}
			if (arg15 >= 0) {
				Static497.aBoolean530 = false;
			} else {
				Static682.anIntArray765 = arg5;
				Static174.anIntArray205 = arg6;
				Static400.anIntArray474 = arg7;
				Static597.anIntArray659 = arg8;
				Static79.anIntArray103 = arg9;
				Static133.method2369(arg10, Static404.aClass22_6);
			}
		} else {
			if (Static485.aBooleanArrayArray5 == null) {
				Static485.aBooleanArrayArray5 = new boolean[Static128.anInt2531 + Static128.anInt2531 + 1][Static448.anInt6835 + Static128.anInt2531 + 1];
			}
			for (local85 = 0; local85 < Static485.aBooleanArrayArray5.length; local85++) {
				for (local88 = 0; local88 < Static485.aBooleanArrayArray5[0].length; local88++) {
					Static485.aBooleanArrayArray5[local85][local88] = true;
				}
			}
			Static696.aBooleanArrayArray7 = Static485.aBooleanArrayArray5;
			Static181.aBooleanArrayArray2 = Static485.aBooleanArrayArray5;
			Static282.anInt2240 = 0;
			Static74.anInt1707 = 0;
			Static109.anInt2308 = Static128.anInt2531;
			Static21.anInt707 = Static448.anInt6835;
			Static497.aBoolean530 = false;
		}
		Static203.method3088(Static404.aClass22_6);
		if (!Static673.aClass386_67.aBoolean718) {
			@Pc(387) Class319 local387 = Static673.aClass386_67.aClass319_13;
			for (@Pc(392) Class9_Sub6 local392 = (Class9_Sub6) local387.method7195(); local392 != null; local392 = (Class9_Sub6) local387.method7188()) {
				local392.method9182();
				Static170.method2742(local392);
			}
		}
		if (Static626.aBoolean647) {
			for (local85 = 0; local85 < Static309.anInt4982; local85++) {
				Static660.aClass8Array1[local85].method254(arg0, arg14);
			}
		}
		if (Static539.aBoolean563) {
			Static127.anIntArray154 = Static404.aClass22_6.Y();
			Static404.aClass22_6.K(Static105.anIntArray127);
			local85 = (Static105.anIntArray127[2] - Static105.anIntArray127[0]) / Static174.anInt3082;
			for (local88 = 0; local88 < Static174.anInt3082 - 1; local88++) {
				Static124.anIntArray148[local88] = local85 * (local88 + 1) + Static583.anIntArray646[local88];
			}
			for (local90 = 0; local90 < Static647.aClass405Array1.length; local90++) {
				Static647.aClass405Array1[local90].method9487();
			}
		}
		if (Static660.aClass364ArrayArrayArray3 != null) {
			if (Static539.aBoolean563) {
				Static101.method1990(0);
			}
			Static204.method3094(true);
			Static404.aClass22_6.ra(-1, 1583160, 40, 127);
			Static438.method5837(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static539.aBoolean563) {
				Static677.method9032();
			}
			Static404.aClass22_6.pa();
			Static204.method3094(false);
		}
		Static438.method5837(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static539.aBoolean563) {
			for (local85 = 0; local85 < Static169.anInt2992; local85++) {
				Static232.aBooleanArrayArrayArray2[local85] = Static194.aBooleanArrayArrayArray1[local85];
			}
			Static101.method1990(0);
			for (local88 = 0; local88 < Static647.aClass405Array1.length; local88++) {
				Static647.aClass405Array1[local88].method9487();
			}
		}
		if (Static539.aBoolean563) {
			Static677.method9032();
			for (local85 = 0; local85 < Static169.anInt2992; local85++) {
				Static194.aBooleanArrayArrayArray1[local85] = Static232.aBooleanArrayArrayArray2[local85];
			}
			if (Static347.anInt5553 == 2) {
				@Pc(601) int local601;
				if (Static158.aLongArray10[0] < Static158.aLongArray10[1]) {
					if (Static124.anIntArray148[0] + Static583.anIntArray646[0] > Static105.anIntArray127[0]) {
						local601 = Static583.anIntArray646[0]++;
					}
				} else if (Static158.aLongArray10[0] > Static158.aLongArray10[1] && Static124.anIntArray148[0] + Static583.anIntArray646[0] < Static105.anIntArray127[2]) {
					local601 = Static583.anIntArray646[0]--;
				}
			}
		}
		if (!Static314.aBoolean334) {
			Static181.aBooleanArrayArray2 = local79;
			Static696.aBooleanArrayArray7 = local81;
		}
		Static406.method9101();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIII)V")
	public static void method6863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(20) int local20 = -arg1;
		Static202.method3077(Static118.anIntArrayArray7[arg2], arg3 - arg1, arg0, arg3 + arg1);
		@Pc(36) int local36 = -1;
		while (local7 < local17) {
			local36 += 2;
			local7++;
			local20 += local36;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(63) int[] local63 = Static118.anIntArrayArray7[arg2 + local17];
				@Pc(70) int[] local70 = Static118.anIntArrayArray7[arg2 - local17];
				@Pc(74) int local74 = arg3 + local7;
				@Pc(79) int local79 = arg3 - local7;
				Static202.method3077(local63, local79, arg0, local74);
				Static202.method3077(local70, local79, arg0, local74);
			}
			@Pc(95) int local95 = local17 + arg3;
			@Pc(100) int local100 = arg3 - local17;
			@Pc(106) int[] local106 = Static118.anIntArrayArray7[arg2 + local7];
			@Pc(113) int[] local113 = Static118.anIntArrayArray7[arg2 - local7];
			Static202.method3077(local106, local100, arg0, local95);
			Static202.method3077(local113, local100, arg0, local95);
		}
	}
}
