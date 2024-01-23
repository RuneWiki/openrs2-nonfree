import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	public static int anInt2916 = 0;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString164 = null;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
	public static void method2514() {
		Static183.aClass187_94.method4525();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIZ)V")
	public static void method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class1_Sub2_Sub11 local16 = Static5.method35(arg1, 8);
		local16.method2866();
		local16.anInt3323 = arg3;
		local16.anInt3320 = arg0;
		local16.anInt3315 = arg2;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIILclient!io;Lclient!io;IIIIJ)V")
	public static void method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class52 local6 = new Class52();
		local6.aLong63 = arg10;
		local6.anInt1642 = arg1 * 128 + 64;
		local6.anInt1641 = arg2 * 128 + 64;
		local6.anInt1643 = arg3;
		local6.aClass15_2 = arg4;
		local6.aClass15_3 = arg5;
		local6.anInt1640 = arg6;
		local6.anInt1645 = arg7;
		local6.anInt1638 = arg8;
		local6.anInt1646 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static105.aClass1_Sub33ArrayArrayArray2[local46][arg1][arg2] == null) {
				Static105.aClass1_Sub33ArrayArrayArray2[local46][arg1][arg2] = new Class1_Sub33(local46, arg1, arg2);
			}
		}
		Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2].aClass52_1 = local6;
	}
}
