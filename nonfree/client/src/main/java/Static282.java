import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt5139;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!me;")
	public static Class1_Sub5_Sub9_Sub2 aClass1_Sub5_Sub9_Sub2_1;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[I")
	public static int[] anIntArray563 = new int[100];

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public static int anInt5138 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([IZ)[I")
	public static int[] method4273(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) int[] local11 = new int[arg0.length];
			Static317.method1046(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIILclient!km;IZJ)Z")
	public static boolean method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class11 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static280.anIntArrayArrayArray13 == Static124.anIntArrayArrayArray5;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static220.anInt4129 || local17 >= Static298.anInt5372) {
					return false;
				}
				@Pc(42) Class1_Sub16 local42 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][local10][local17];
				if (local42 != null && local42.anInt2573 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class45 local58 = new Class45();
		local58.aLong56 = arg11;
		local58.anInt1363 = arg0;
		local58.anInt1361 = arg5;
		local58.anInt1354 = arg6;
		local58.anInt1358 = arg7;
		local58.aClass11_5 = arg8;
		local58.anInt1353 = arg9;
		local58.anInt1360 = arg1;
		local58.anInt1359 = arg2;
		local58.anInt1362 = arg1 + arg3 - 1;
		local58.anInt1355 = arg2 + arg4 - 1;
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
					if (Static254.aClass1_Sub16ArrayArrayArray3[local141][local17][local108] == null) {
						Static254.aClass1_Sub16ArrayArrayArray3[local141][local17][local108] = new Class1_Sub16(local141, local17, local108);
					}
				}
				@Pc(174) Class1_Sub16 local174 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][local17][local108];
				local174.aClass45Array2[local174.anInt2573] = local58;
				local174.anIntArray201[local174.anInt2573] = local115;
				local174.anInt2574 |= local115;
				local174.anInt2573++;
				if (local6 && Static260.anIntArrayArray38[local17][local108] != 0) {
					local8 = Static260.anIntArrayArray38[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static260.anIntArrayArray38[local17][local108] == 0) {
						Static260.anIntArrayArray38[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static242.aClass45Array3[Static79.anInt1733++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4276(@OriginalArg(0) String arg0) {
		@Pc(3) long local3 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(19) char local19 = arg0.charAt(local12);
			local3 *= 37L;
			if (local19 >= 'A' && local19 <= 'Z') {
				local3 += local19 - 64;
			} else if (local19 >= 'a' && local19 <= 'z') {
				local3 += local19 + 1 - 97;
			} else if (local19 >= '0' && local19 <= '9') {
				local3 += local19 + 27 - 48;
			}
			if (local3 >= 177917621779460413L) {
				break;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}
}
