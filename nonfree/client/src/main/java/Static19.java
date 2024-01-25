import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!as", name = "s", descriptor = "I")
	public static int anInt571;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
	public static void method434() {
		Static394.anInt6802 = Static254.aClass215_7.anInt6376 + Static254.aClass215_7.anInt6387 + 2;
		Static76.aStringArray10 = new String[500];
		Static389.anInt6750 = Static266.aClass215_8.anInt6376 + Static266.aClass215_8.anInt6387 + 2;
		for (@Pc(35) int local35 = 0; local35 < Static76.aStringArray10.length; local35++) {
			Static76.aStringArray10[local35] = "";
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[B)Z")
	public static boolean method435(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class4_Sub30 local16 = new Class4_Sub30(arg0);
		@Pc(20) int local20 = local16.method4864();
		if (local20 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local16.method4864() == 1;
		if (local34) {
			Static205.method2944(local16);
		}
		Static129.method1921(local16);
		return true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IBIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static180.anInt3352; local7++) {
			@Pc(13) Rectangle local13 = Class6_Sub4.aRectangleArray4[local7];
			if (arg0 < local13.x + local13.width && arg0 + arg2 > local13.x && arg1 < local13.height + local13.y && local13.y < arg3 + arg1) {
				Static203.aBooleanArray11[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III[B)[B")
	public static byte[] method437(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static457.method1215(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!jb;IIZ)V")
	public static void method438(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class57 local15 = arg0.method2671(Static16.aClass30_11);
		if (local15 == null) {
			return;
		}
		Static16.aClass30_11.pa(arg2, arg1, arg2 + arg0.anInt3421, arg0.anInt3442 + arg1);
		if (Static421.anInt7104 >= 3) {
			Static16.aClass30_11.j(-16777216, local15, arg2, arg1);
		} else {
			Static454.aClass3_25.method5884((float) arg0.anInt3421 / 2.0F + (float) arg2, (float) arg1 + (float) arg0.anInt3442 / 2.0F, ((int) -Static146.aFloat82 & 0x3FFF) << 2, local15, arg2, arg1);
		}
	}
}
