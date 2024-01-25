import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "Lclient!gq;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	public static int anInt4353;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Lclient!pq;")
	public static Class251 aClass251_76;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "S")
	public static short aShort74 = 32767;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "[I")
	public static final int[] anIntArray437 = new int[13];

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)I")
	public static int method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = local15 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)I")
	public static int method3743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIILclient!ia;)V")
	public static void method3747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class29_Sub4 arg4) {
		@Pc(4) Class9 local4 = Static157.method2295(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt6111 = (arg1 << Static188.anInt3275) + Static431.anInt7547;
		arg4.anInt6110 = arg3;
		arg4.anInt6117 = (arg2 << Static188.anInt3275) + Static431.anInt7547;
		for (@Pc(28) Class66 local28 = local4.aClass66_1; local28 != null; local28 = local28.aClass66_2) {
			if (local28.aClass29_Sub2_1.aBoolean646) {
				@Pc(38) int local38 = local28.aClass29_Sub2_1.method7546();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt6110 += local8;
			arg4.aBoolean421 = true;
		} else if (local4.aClass29_Sub3_1 != null) {
			arg4.anInt6110 -= local4.aClass29_Sub3_1.aShort69;
		}
		local4.aClass29_Sub4_1 = arg4;
	}
}
