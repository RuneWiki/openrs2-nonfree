import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
	public static int anInt1328;

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
	public static int anInt1330;

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[1000][];

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "Lclient!ec;")
	public static Class22 aClass22_328 = Static60.method1113("gr-Un:");

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "Lclient!ec;")
	private static Class22 aClass22_329 = Static60.method1113("Prepared sound engine");

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "Lclient!ec;")
	public static Class22 aClass22_330 = aClass22_329;

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
	public static int anInt1334 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!qd;)V")
	public static void method916(@OriginalArg(1) Class4_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt2457 == 0) {
			return;
		}
		@Pc(40) int local40;
		@Pc(47) int local47;
		if (arg0.anInt2509 != -1 && arg0.anInt2509 < 32768) {
			@Pc(31) Class4_Sub1_Sub3_Sub2_Sub2 local31 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[arg0.anInt2509];
			if (local31 != null) {
				local40 = arg0.anInt2500 - local31.anInt2500;
				local47 = arg0.anInt2462 - local31.anInt2462;
				if (local40 != 0 || local47 != 0) {
					arg0.anInt2496 = (int) (Math.atan2((double) local40, (double) local47) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(77) int local77;
		if (arg0.anInt2509 >= 32768) {
			local77 = arg0.anInt2509 - 32768;
			if (local77 == Static32.anInt824) {
				local77 = 2047;
			}
			@Pc(86) Class4_Sub1_Sub3_Sub2_Sub1 local86 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local77];
			if (local86 != null) {
				@Pc(95) int local95 = arg0.anInt2462 - local86.anInt2462;
				local47 = arg0.anInt2500 - local86.anInt2500;
				if (local47 != 0 || local95 != 0) {
					arg0.anInt2496 = (int) (Math.atan2((double) local47, (double) local95) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2495 != 0 || arg0.anInt2461 != 0) && (arg0.anInt2460 == 0 || arg0.anInt2458 > 0)) {
			local77 = arg0.anInt2500 - (arg0.anInt2495 - Static59.anInt1769 - Static59.anInt1769) * 64;
			local40 = arg0.anInt2462 - (arg0.anInt2461 - Static98.anInt2584 - Static98.anInt2584) * 64;
			if (local77 != 0 || local40 != 0) {
				arg0.anInt2496 = (int) (Math.atan2((double) local77, (double) local40) * 325.949D) & 0x7FF;
			}
			arg0.anInt2495 = 0;
			arg0.anInt2461 = 0;
		}
		local77 = arg0.anInt2496 - arg0.anInt2499 & 0x7FF;
		if (local77 == 0) {
			arg0.anInt2505 = 0;
			return;
		}
		arg0.anInt2505++;
		@Pc(216) boolean local216;
		if (local77 <= 1024) {
			arg0.anInt2499 += arg0.anInt2457;
			local216 = true;
			if (arg0.anInt2457 > local77 || 2048 - arg0.anInt2457 < local77) {
				local216 = false;
				arg0.anInt2499 = arg0.anInt2496;
			}
			if (arg0.anInt2452 == arg0.anInt2470 && (arg0.anInt2505 > 25 || local216)) {
				if (arg0.anInt2478 == -1) {
					arg0.anInt2470 = arg0.anInt2471;
				} else {
					arg0.anInt2470 = arg0.anInt2478;
				}
			}
		} else {
			arg0.anInt2499 -= arg0.anInt2457;
			local216 = true;
			if (arg0.anInt2457 > local77 || local77 > 2048 - arg0.anInt2457) {
				arg0.anInt2499 = arg0.anInt2496;
				local216 = false;
			}
			if (arg0.anInt2470 == arg0.anInt2452 && (arg0.anInt2505 > 25 || local216)) {
				if (arg0.anInt2498 == -1) {
					arg0.anInt2470 = arg0.anInt2471;
				} else {
					arg0.anInt2470 = arg0.anInt2498;
				}
			}
		}
		arg0.anInt2499 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ea;I)Lclient!kd;")
	public static Class4_Sub14 method920(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(12) byte[] local12 = arg1.method609(arg0);
		return local12 == null ? null : new Class4_Sub14(local12);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method921() {
		if (Static130.aBoolean279 && Static96.anInt2497 != Static37.anInt895) {
			Static101.method1699(Static37.anInt895, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], Static119.anInt2900, Static51.anInt1473, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0]);
		} else if (Static37.anInt895 != Static5.anInt85) {
			Static5.anInt85 = Static37.anInt895;
			Static2.method7(Static37.anInt895);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIB)V")
	public static void method923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static57.anIntArrayArrayArray4[arg2][arg0 + local7][local11 + arg1] = 0;
			}
		}
		if (arg0 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static57.anIntArrayArrayArray4[arg2][arg0][local11 + arg1] = Static57.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 + local11];
			}
		}
		if (arg1 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static57.anIntArrayArrayArray4[arg2][local11 + arg0][arg1] = Static57.anIntArrayArrayArray4[arg2][local11 + arg0][arg1 - 1];
			}
		}
		if (arg0 > 0 && Static57.anIntArrayArrayArray4[arg2][arg0 - 1][arg1] != 0) {
			Static57.anIntArrayArrayArray4[arg2][arg0][arg1] = Static57.anIntArrayArrayArray4[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static57.anIntArrayArrayArray4[arg2][arg0][arg1 - 1] != 0) {
			Static57.anIntArrayArrayArray4[arg2][arg0][arg1] = Static57.anIntArrayArrayArray4[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static57.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 - 1] != 0) {
			Static57.anIntArrayArrayArray4[arg2][arg0][arg1] = Static57.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public static void method924() {
		aClass22_330 = null;
		aClass22_329 = null;
		aClass22_328 = null;
		aBooleanArray5 = null;
		aByteArrayArray2 = null;
	}
}
