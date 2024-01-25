import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Z")
	public static boolean aBoolean552 = true;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString237 = "shake:";

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIZZ)V")
	public static void method5276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static151.anInt3338 = arg0;
		Static220.anInt4569 = arg1;
		Static226.anInt4752 = arg2;
		Static342.aClass57ArrayArrayArray3 = new Class57[4][Static151.anInt3338][Static220.anInt4569];
		Static310.aClass26Array4 = new Class26[4];
		if (arg3) {
			Static237.aClass57ArrayArrayArray2 = new Class57[1][Static151.anInt3338][Static220.anInt4569];
			Static170.anIntArrayArray37 = new int[Static151.anInt3338][Static220.anInt4569];
			Static5.aClass26Array1 = new Class26[1];
		} else {
			Static237.aClass57ArrayArrayArray2 = null;
			Static170.anIntArrayArray37 = null;
			Static5.aClass26Array1 = null;
		}
		if (arg4) {
			Static148.anIntArrayArrayArray13 = new int[4][arg0][arg1];
			Static126.aClass4_Sub12_Sub1Array1 = new Class4_Sub12_Sub1[255];
			Static6.aBooleanArray15 = new boolean[255];
			Static161.anInt3632 = 0;
		} else {
			Static148.anIntArrayArrayArray13 = null;
			Static126.aClass4_Sub12_Sub1Array1 = null;
			Static6.aBooleanArray15 = null;
			Static161.anInt3632 = 0;
		}
		Static229.method3925(false);
		Static183.aClass86Array2 = new Class86[500];
		Static281.anInt5702 = 0;
		Static18.aClass86Array1 = new Class86[500];
		Static157.anInt3507 = 0;
		Static244.anIntArrayArrayArray14 = new int[4][Static151.anInt3338 + 1][Static220.anInt4569 + 1];
		Static124.aClass2_Sub2Array2 = new Class2_Sub2[5000];
		Static246.anInt5145 = 0;
		Static248.aBooleanArrayArray4 = new boolean[Static226.anInt4752 + Static226.anInt4752 + 1][Static226.anInt4752 + Static226.anInt4752 + 1];
		Static47.aBooleanArrayArray2 = new boolean[Static226.anInt4752 + Static226.anInt4752 + 2][Static226.anInt4752 + Static226.anInt4752 + 2];
		Static54.aClass80_1 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!am;I)V")
	public static void method5277(@OriginalArg(0) Class11 arg0) {
		Static270.aClass11_149 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([Ljava/lang/String;[SIZI)V")
	public static void method5280(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local20;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if (local20 == null || arg0[local46] != null && arg0[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local67;
				@Pc(81) short local81 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local81;
			}
		}
		arg0[arg3] = arg0[local16];
		arg0[local16] = local20;
		arg1[arg3] = arg1[local16];
		arg1[local16] = local34;
		method5280(arg0, arg1, arg2, local16 - 1);
		method5280(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public static int method5281(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
