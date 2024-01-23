import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "Lclient!ub;")
	public static Class169 aClass169_1;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "Lclient!bk;")
	public static Class4_Sub7 aClass4_Sub7_1 = new Class4_Sub7(0, 0);

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
	public static int anInt3483 = -1;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
	public static int anInt3485 = 1;

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
	public static int anInt3486 = 0;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	public static int anInt3488 = 0;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method2745() {
		aClass169_1 = null;
		aClass4_Sub7_1 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIILclient!en;IZJ)Z")
	public static boolean method2746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static250.anIntArrayArrayArray13 == Static15.anIntArrayArrayArray2;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static247.anInt4706 || local17 >= Static24.anInt439) {
					return false;
				}
				@Pc(42) Class4_Sub11 local42 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt1054 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class173 local58 = new Class173();
		local58.aLong183 = arg11;
		local58.anInt5156 = arg0;
		local58.anInt5159 = arg5;
		local58.anInt5161 = arg6;
		local58.anInt5162 = arg7;
		local58.aClass12_10 = arg8;
		local58.anInt5150 = arg9;
		local58.anInt5149 = arg1;
		local58.anInt5157 = arg2;
		local58.anInt5163 = arg1 + arg3 - 1;
		local58.anInt5158 = arg2 + arg4 - 1;
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
					if (Static127.aClass4_Sub11ArrayArrayArray1[local141][local17][local108] == null) {
						Static127.aClass4_Sub11ArrayArrayArray1[local141][local17][local108] = new Class4_Sub11(local141, local17, local108);
					}
				}
				@Pc(174) Class4_Sub11 local174 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][local17][local108];
				local174.aClass173Array1[local174.anInt1054] = local58;
				local174.anIntArray122[local174.anInt1054] = local115;
				local174.anInt1056 |= local115;
				local174.anInt1054++;
				if (local6 && Static120.anIntArrayArray23[local17][local108] != 0) {
					local8 = Static120.anIntArrayArray23[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static120.anIntArrayArray23[local17][local108] == 0) {
						Static120.anIntArrayArray23[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static172.aClass173Array2[Static94.anInt1947++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public static void method2747() {
		if (Static146.aBoolean196) {
			return;
		}
		Static146.aBoolean196 = true;
		Static114.aBoolean167 = true;
		if (Static74.aBoolean115) {
			Static270.aFloat49 = (int) Static270.aFloat49 - 65 & 0xFFFFFF80;
		} else {
			Static171.aFloat28 += (-Static171.aFloat28 - 24.0F) / 2.0F;
		}
	}
}
