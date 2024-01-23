import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_111 = Static64.method1101("<)4col>");

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	public static int anInt340 = 0;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!ia;")
	private static Class51 aClass51_112 = Static64.method1101("Type");

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_113 = aClass51_112;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "[I")
	public static int[] anIntArray17 = new int[5];

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIILclient!ij;IZJ)Z")
	public static boolean method277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static20.anIntArrayArrayArray2 == Static103.anIntArrayArrayArray13;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (@Pc(13) int local13 = arg2; local13 < arg2 + arg4; local13++) {
				if (local10 < 0 || local13 < 0 || local10 >= Static58.anInt1373 || local13 >= Static172.anInt3854) {
					return false;
				}
				@Pc(34) Class1_Sub7 local34 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][local10][local13];
				if (local34 != null && local34.anInt1124 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class83 local58 = new Class83();
		local58.aLong118 = arg11;
		local58.anInt3345 = arg0;
		local58.anInt3344 = arg5;
		local58.anInt3343 = arg6;
		local58.anInt3338 = arg7;
		local58.aClass5_5 = arg8;
		local58.anInt3341 = arg9;
		local58.anInt3340 = arg1;
		local58.anInt3336 = arg2;
		local58.anInt3342 = arg1 + arg3 - 1;
		local58.anInt3346 = arg2 + arg4 - 1;
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
					if (Static22.aClass1_Sub7ArrayArrayArray1[local133][local101][local104] == null) {
						Static22.aClass1_Sub7ArrayArrayArray1[local133][local101][local104] = new Class1_Sub7(local133, local101, local104);
					}
				}
				@Pc(166) Class1_Sub7 local166 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][local101][local104];
				local166.aClass83Array3[local166.anInt1124] = local58;
				local166.anIntArray65[local166.anInt1124] = local107;
				local166.anInt1122 |= local107;
				local166.anInt1124++;
				if (local6 && Static124.anIntArrayArray36[local101][local104] != 0) {
					local8 = Static124.anIntArrayArray36[local101][local104];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local104 = arg1; local104 < arg1 + arg3; local104++) {
				for (local107 = arg2; local107 < arg2 + arg4; local107++) {
					if (Static124.anIntArrayArray36[local104][local107] == 0) {
						Static124.anIntArrayArray36[local104][local107] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static34.aClass83Array2[Static55.anInt1279++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIB)V")
	public static void method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class71 local8 = Static29.method527(arg0, arg1);
		if (local8 != null && local8.anObjectArray20 != null) {
			@Pc(17) Class1_Sub21 local17 = new Class1_Sub21();
			local17.anObjectArray32 = local8.anObjectArray20;
			local17.aClass71_25 = local8;
			Static65.method1119(local17);
		}
		Static82.aBoolean82 = true;
		Static128.anInt4775 = arg2;
		Static211.anInt4507 = arg1;
		Static76.anInt1699 = arg0;
		Static82.method1438(local8);
	}
}
