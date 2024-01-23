import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!l", name = "r", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!fh;")
	public static Class58 aClass58_67;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!ob;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString179 = "white:";

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString180 = " from your ignore list first.";

	@OriginalMember(owner = "client!l", name = "A", descriptor = "[Lclient!wl;")
	public static Class193[] aClass193Array1 = new Class193[29];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIILclient!vc;IZJ)Z")
	public static boolean method2431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class53 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static243.anIntArrayArrayArray13 == Static36.anIntArrayArrayArray2;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static300.anInt5636 || local17 >= Static299.anInt5591) {
					return false;
				}
				@Pc(42) Class4_Sub19 local42 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt3554 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class33 local58 = new Class33();
		local58.aLong38 = arg11;
		local58.anInt819 = arg0;
		local58.anInt821 = arg5;
		local58.anInt827 = arg6;
		local58.anInt823 = arg7;
		local58.aClass53_1 = arg8;
		local58.anInt814 = arg9;
		local58.anInt824 = arg1;
		local58.anInt826 = arg2;
		local58.anInt825 = arg1 + arg3 - 1;
		local58.anInt817 = arg2 + arg4 - 1;
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
					if (Static6.aClass4_Sub19ArrayArrayArray1[local141][local17][local108] == null) {
						Static6.aClass4_Sub19ArrayArrayArray1[local141][local17][local108] = new Class4_Sub19(local141, local17, local108);
					}
				}
				@Pc(174) Class4_Sub19 local174 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][local17][local108];
				local174.aClass33Array3[local174.anInt3554] = local58;
				local174.anIntArray390[local174.anInt3554] = local115;
				local174.anInt3551 |= local115;
				local174.anInt3554++;
				if (local6 && Static54.anIntArrayArray10[local17][local108] != 0) {
					local8 = Static54.anIntArrayArray10[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static54.anIntArrayArray10[local17][local108] == 0) {
						Static54.anIntArrayArray10[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static171.aClass33Array2[Static139.anInt2661++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)Lclient!wf;")
	public static Class189 method2432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class189 local9 = Static114.method1814(arg0);
		if (arg1 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass189Array4 == null || arg1 >= local9.aClass189Array4.length) {
			return null;
		} else {
			return local9.aClass189Array4[arg1];
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZI)I")
	public static int method2433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}
}
