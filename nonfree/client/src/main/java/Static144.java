import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "[I")
	public static int[] anIntArray527;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
	public static int anInt4821 = -1;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString170 = "Continue";

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
	public static int anInt4823 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIILclient!qf;IZJ)Z")
	public static boolean method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class10 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static256.anIntArrayArrayArray14 == Static22.anIntArrayArrayArray1;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static295.anInt4973 || local17 >= Static307.anInt6023) {
					return false;
				}
				@Pc(42) Class3_Sub25 local42 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][local10][local17];
				if (local42 != null && local42.anInt4483 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class85 local58 = new Class85();
		local58.aLong107 = arg11;
		local58.anInt2483 = arg0;
		local58.anInt2476 = arg5;
		local58.anInt2473 = arg6;
		local58.anInt2481 = arg7;
		local58.aClass10_7 = arg8;
		local58.anInt2470 = arg9;
		local58.anInt2482 = arg1;
		local58.anInt2480 = arg2;
		local58.anInt2474 = arg1 + arg3 - 1;
		local58.anInt2478 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static146.aClass3_Sub25ArrayArrayArray7[local141][local17][local108] == null) {
						Static146.aClass3_Sub25ArrayArrayArray7[local141][local17][local108] = new Class3_Sub25(local141, local17, local108);
					}
				}
				@Pc(174) Class3_Sub25 local174 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][local17][local108];
				local174.aClass85Array3[local174.anInt4483] = local58;
				local174.anIntArray498[local174.anInt4483] = local115;
				local174.anInt4477 |= local115;
				local174.anInt4483++;
				if (local6 && Static157.anIntArrayArray45[local17][local108] != 0) {
					local8 = Static157.anIntArrayArray45[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static157.anIntArrayArray45[local17][local108] == 0) {
						Static157.anIntArrayArray45[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static104.aClass85Array1[Static51.anInt994++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)V")
	public static void method4034(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub4_Sub7 local12 = Static34.method528(arg0, 5);
		local12.method970();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static137.method2337(arg2, arg5, 0, arg3, arg6, arg1, arg0, arg4);
	}
}
