import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ul", name = "lb", descriptor = "I")
	public static int anInt5237;

	@OriginalMember(owner = "client!ul", name = "mb", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "S")
	public static short aShort28 = 320;

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "Lclient!lc;")
	public static Class79 aClass79_36 = new Class79(64);

	@OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
	public static int anInt5217 = 1;

	@OriginalMember(owner = "client!ul", name = "cb", descriptor = "I")
	public static int anInt5228 = 0;

	@OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
	public static int anInt5230 = 20;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)I")
	public static int method3982() {
		if ((double) Static17.aFloat3 == 3.0D) {
			return 37;
		} else if ((double) Static17.aFloat3 == 4.0D) {
			return 50;
		} else if ((double) Static17.aFloat3 == 6.0D) {
			return 75;
		} else if ((double) Static17.aFloat3 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIIILclient!sa;IZJ)Z")
	public static boolean method3984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class9 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static38.anIntArrayArrayArray6 == Static32.anIntArrayArrayArray5;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (@Pc(13) int local13 = arg2; local13 < arg2 + arg4; local13++) {
				if (local10 < 0 || local13 < 0 || local10 >= Static94.anInt4252 || local13 >= Static239.anInt5153) {
					return false;
				}
				@Pc(34) Class1_Sub16 local34 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][local10][local13];
				if (local34 != null && local34.anInt2929 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class47 local58 = new Class47();
		local58.aLong73 = arg11;
		local58.anInt2159 = arg0;
		local58.anInt2155 = arg5;
		local58.anInt2154 = arg6;
		local58.anInt2145 = arg7;
		local58.aClass9_1 = arg8;
		local58.anInt2157 = arg9;
		local58.anInt2146 = arg1;
		local58.anInt2148 = arg2;
		local58.anInt2160 = arg1 + arg3 - 1;
		local58.anInt2158 = arg2 + arg4 - 1;
		@Pc(104) int local104;
		@Pc(107) int local107;
		for (@Pc(101) int local101 = arg1; local101 < arg1 + arg3; local101++) {
			for (local104 = arg2; local104 < arg2 + arg4; local104++) {
				local107 = 0;
				if (local101 > arg1) {
					local107++;
				}
				if (local101 < arg1 + arg3 - 1) {
					local107 += 4;
				}
				if (local104 > arg2) {
					local107 += 8;
				}
				if (local104 < arg2 + arg4 - 1) {
					local107 += 2;
				}
				for (@Pc(133) int local133 = arg0; local133 >= 0; local133--) {
					if (Static142.aClass1_Sub16ArrayArrayArray4[local133][local101][local104] == null) {
						Static142.aClass1_Sub16ArrayArrayArray4[local133][local101][local104] = new Class1_Sub16(local133, local101, local104);
					}
				}
				@Pc(166) Class1_Sub16 local166 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][local101][local104];
				local166.aClass47Array1[local166.anInt2929] = local58;
				local166.anIntArray214[local166.anInt2929] = local107;
				local166.anInt2932 |= local107;
				local166.anInt2929++;
				if (local6 && Static36.anIntArrayArray7[local101][local104] != 0) {
					local8 = Static36.anIntArrayArray7[local101][local104];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local104 = arg1; local104 < arg1 + arg3; local104++) {
				for (local107 = arg2; local107 < arg2 + arg4; local107++) {
					if (Static36.anIntArrayArray7[local104][local107] == 0) {
						Static36.anIntArrayArray7[local104][local107] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static145.aClass47Array2[Static11.anInt496++] = local58;
		}
		return true;
	}
}
