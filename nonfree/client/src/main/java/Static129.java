import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!ra;")
	public static Class170 aClass170_54;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString172 = "Discard";

	@OriginalMember(owner = "client!id", name = "f", descriptor = "[Lclient!ja;")
	public static final Class5_Sub9_Sub11[] aClass5_Sub9_Sub11Array3 = new Class5_Sub9_Sub11[14];

	@OriginalMember(owner = "client!id", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray20 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILclient!mf;)V")
	public static void method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25_Sub5 arg4) {
		arg4.anInt6309 = (arg1 << 7) + 64;
		arg4.anInt6304 = arg3;
		arg4.anInt6307 = (arg2 << 7) + 64;
		@Pc(24) Class51 local24 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class103 local31 = local24.aClass103_1; local31 != null; local31 = local31.aClass103_2) {
				if (local31.aClass25_Sub1_1.aBoolean428) {
					@Pc(41) int local41 = local31.aClass25_Sub1_1.method5096();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt6304 += local28;
				arg4.aBoolean470 = true;
			}
		}
		if (Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static168.method3164(arg0, arg1, arg2);
		}
		Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2].aClass25_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!bm;IILjava/awt/Canvas;Lclient!am;)Lclient!en;")
	public static Class59 method2469(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class10 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static339.aBooleanArray29[local9]) {
				local7 = local9;
				Static339.aBooleanArray29[local9] = true;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("No free toolkit instances");
		} else if (arg2 == 0) {
			return Static116.method2285(local7, arg3, arg1);
		} else if (arg2 == 1) {
			return Static196.method3511(arg0, arg1, arg4, local7, arg3);
		} else {
			throw new IllegalArgumentException("Unsupported mode");
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Lclient!db;")
	public static Class5_Sub9_Sub1 method2470(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub9_Sub1 local15 = (Class5_Sub9_Sub1) Static261.aClass215_9.method5683((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static72.aClass170_25.method4584(11, arg0);
		local15 = new Class5_Sub9_Sub1();
		if (local25 != null) {
			local15.method1127(new Class5_Sub1(local25));
		}
		Static261.aClass215_9.method5687(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!nj;Lclient!nl;IIILclient!re;)V")
	public static void method2471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) Class137 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class25_Sub1_Sub1_Sub2 arg6) {
		@Pc(7) Class5_Sub27 local7 = new Class5_Sub27();
		local7.anInt3730 = arg1 * 128;
		local7.anInt3735 = arg0 * 128;
		local7.anInt3746 = arg5;
		if (arg3 != null) {
			local7.aClass137_1 = arg3;
			@Pc(135) int local135 = arg3.anInt4126;
			@Pc(138) int local138 = arg3.anInt4166;
			if (arg4 == 1 || arg4 == 3) {
				local138 = arg3.anInt4126;
				local135 = arg3.anInt4166;
			}
			local7.anInt3745 = arg3.anInt4161;
			local7.anInt3732 = arg3.anInt4146;
			local7.anIntArray277 = arg3.anIntArray299;
			local7.anInt3733 = arg3.anInt4153 * 128;
			local7.anInt3731 = (arg1 + local138) * 128;
			local7.anInt3737 = arg3.anInt4156;
			local7.anInt3738 = (local135 + arg0) * 128;
			local7.anInt3740 = arg3.anInt4165;
			if (arg3.anIntArray296 != null) {
				local7.aBoolean265 = true;
				local7.method3460();
			}
			if (local7.anIntArray277 != null) {
				local7.anInt3734 = (int) ((double) (local7.anInt3740 - local7.anInt3745) * Math.random()) + local7.anInt3745;
			}
			Static82.aClass211_6.method5609(local7);
			return;
		}
		if (arg6 != null) {
			local7.aClass25_Sub1_Sub1_Sub2_1 = arg6;
			@Pc(30) Class216 local30 = arg6.aClass216_1;
			if (local30.anIntArray562 != null) {
				local7.aBoolean265 = true;
				local30 = local30.method5777();
			}
			if (local30 != null) {
				local7.anInt3731 = (arg1 + local30.anInt6566) * 128;
				local7.anInt3738 = (local30.anInt6566 + arg0) * 128;
				local7.anInt3737 = Static118.method2321(arg6);
				local7.anInt3733 = local30.anInt6560 * 128;
				local7.anInt3732 = local30.lb;
			}
			Static16.aClass211_1.method5609(local7);
			return;
		}
		if (arg2 == null) {
			return;
		}
		local7.aClass25_Sub1_Sub1_Sub1_2 = arg2;
		local7.anInt3738 = (arg0 + arg2.method4646()) * 128;
		local7.anInt3731 = (arg1 + arg2.method4646()) * 128;
		local7.anInt3737 = Static139.method5471(arg2);
		local7.anInt3732 = arg2.anInt4072;
		local7.anInt3733 = arg2.anInt4079 * 128;
		Static331.aClass42_55.method1050((long) arg2.anInt5287, local7);
		return;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z")
	public static boolean method2472() {
		return Static218.aBoolean317;
	}
}
