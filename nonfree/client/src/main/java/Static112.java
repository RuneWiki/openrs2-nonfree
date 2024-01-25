import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	public static int anInt4018;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Lclient!ng;")
	public static Class140 aClass140_103 = new Class140(64);

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
	public static int anInt4021 = -1;

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "[B")
	public static final byte[] aByteArray64 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
	public static int anInt4022 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public static void method3712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class204 local28 = Static138.aClass204ArrayArrayArray1[local9][arg0][arg1] = Static138.aClass204ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte63--;
				for (@Pc(40) Class17 local40 = local28.aClass17_3; local40 != null; local40 = local40.aClass17_1) {
					@Pc(44) Class5_Sub3 local44 = local40.aClass5_Sub3_1;
					if (local44.aShort75 == arg0 && local44.aShort77 == arg1) {
						local44.aByte53--;
					}
				}
			}
		}
		if (Static138.aClass204ArrayArrayArray1[0][arg0][arg1] == null) {
			Static138.aClass204ArrayArrayArray1[0][arg0][arg1] = new Class204(0, arg0, arg1);
			Static138.aClass204ArrayArrayArray1[0][arg0][arg1].aByte64 = 1;
		}
		Static138.aClass204ArrayArrayArray1[0][arg0][arg1].aClass204_1 = local7;
		Static138.aClass204ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIII)V")
	public static void method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = (arg1 - 32) * arg1 / arg2;
		if (local11 < 8) {
			local11 = 8;
		}
		Static286.aClass90Array15[0].method5454(arg0, arg3);
		@Pc(35) int local35 = arg4 * (arg1 - local11 - 32) / (arg2 - arg1);
		Static286.aClass90Array15[1].method5454(arg0, arg1 + arg3 - 16);
		Static34.aClass2_6.method3277(arg3 + 16, arg1 + -32, arg0, Static10.anInt236, 16);
		Static34.aClass2_6.method3277(arg3 + local35 + 16, local11, arg0, Static86.anInt1701, 16);
		Static34.aClass2_6.method3335(arg0, local11, arg3 + local35 + 16, Static37.anInt892);
		Static34.aClass2_6.method3335(arg0 + 1, local11, local35 + arg3 + 16, Static37.anInt892);
		Static34.aClass2_6.method3254(Static37.anInt892, arg3 + local35 + 16, arg0, 16);
		Static34.aClass2_6.method3254(Static37.anInt892, arg3 + local35 + 17, arg0, 16);
		Static34.aClass2_6.method3335(arg0 + 15, local11, arg3 + local35 + 16, Static138.anInt2753);
		Static34.aClass2_6.method3335(arg0 + 14, local11 + -1, local35 + arg3 + 17, Static138.anInt2753);
		Static34.aClass2_6.method3254(Static138.anInt2753, arg3 + local35 + local11 + 15, arg0, 16);
		Static34.aClass2_6.method3254(Static138.anInt2753, local35 + arg3 + local11 + 14, arg0 + 1, 15);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILclient!mg;Lclient!mg;)V")
	public static void method3714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub4 arg3, @OriginalArg(4) Class5_Sub4 arg4) {
		if (Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static148.method4534(arg0, arg1, arg2);
		}
		Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2].aClass5_Sub4_2 = arg3;
		Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2].aClass5_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I")
	public static int method3715() {
		return Static171.anInt3580;
	}
}
