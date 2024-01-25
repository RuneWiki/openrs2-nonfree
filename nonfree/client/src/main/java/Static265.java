import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array11;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!nl;")
	public static Class171 aClass171_66;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_69 = new Class32(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)I")
	public static int method4084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static303.anIntArray1020[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([[BI[[B[B[IIB[I)I")
	public static int method4086(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg1];
		@Pc(15) int local15 = local9 + arg4[arg1];
		@Pc(19) int local19 = arg6[arg5];
		@Pc(34) int local34 = local19 + arg4[arg5];
		@Pc(36) int local36 = local9;
		if (local9 < local19) {
			local36 = local19;
		}
		@Pc(47) int local47 = local15;
		if (local34 < local15) {
			local47 = local34;
		}
		@Pc(58) int local58 = arg3[arg1] & 0xFF;
		if ((arg3[arg5] & 0xFF) < local58) {
			local58 = arg3[arg5] & 0xFF;
		}
		@Pc(75) byte[] local75 = arg2[arg1];
		@Pc(79) byte[] local79 = arg0[arg5];
		@Pc(84) int local84 = local36 - local9;
		@Pc(89) int local89 = local36 - local19;
		for (@Pc(91) int local91 = local36; local91 < local47; local91++) {
			@Pc(103) int local103 = local79[local89++] + local75[local84++];
			if (local58 > local103) {
				local58 = local103;
			}
		}
		return -local58;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg1; local7++) {
			for (@Pc(16) int local16 = arg0; local16 <= arg4; local16++) {
				if (Static199.anIntArrayArray30[local7][local16] == arg2 && Static59.anIntArrayArray10[local7][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public static void method4088(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static338.aFloat52 = 3.0F;
		} else if (arg0 == 50) {
			Static338.aFloat52 = 4.0F;
		} else if (arg0 == 75) {
			Static338.aFloat52 = 6.0F;
		} else if (arg0 == 100) {
			Static338.aFloat52 = 8.0F;
		} else if (arg0 == 200) {
			Static338.aFloat52 = 16.0F;
		}
		Static24.anInt533 = -1;
		Static24.anInt533 = -1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!nm;III)V")
	public static void method4090(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(23) Class2_Sub29 local23 = (Class2_Sub29) Static161.aClass30_18.method694(); local23 != null; local23 = (Class2_Sub29) Static161.aClass30_18.method682()) {
			if (local23.anInt3893 == arg2 && arg3 * 128 == local23.anInt3899 && arg0 * 128 == local23.anInt3900 && local23.aClass172_1.anInt4131 == arg1.anInt4131) {
				if (local23.aClass2_Sub2_Sub2_3 != null) {
					Static324.aClass2_Sub2_Sub1_2.method58(local23.aClass2_Sub2_Sub2_3);
					local23.aClass2_Sub2_Sub2_3 = null;
				}
				if (local23.aClass2_Sub2_Sub2_2 != null) {
					Static324.aClass2_Sub2_Sub1_2.method58(local23.aClass2_Sub2_Sub2_2);
					local23.aClass2_Sub2_Sub2_2 = null;
				}
				local23.method5617();
				return;
			}
		}
	}
}
