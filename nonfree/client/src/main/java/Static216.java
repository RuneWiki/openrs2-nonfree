import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!nn", name = "Q", descriptor = "[I")
	public static final int[] anIntArray390 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!nn", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString153 = "green:";

	@OriginalMember(owner = "client!nn", name = "eb", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[128][128];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIZI)Lclient!ic;")
	public static Class14_Sub2_Sub8 method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 | arg0 << 8;
		@Pc(18) Class14_Sub2_Sub8 local18 = (Class14_Sub2_Sub8) Static44.aClass178_3.method4772((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static9.aClass143_8.method3750(Static9.aClass143_8.method3739(local9));
		if (local30 == null) {
			local9 = arg2 | arg1 + 65536 << 8;
			local18 = (Class14_Sub2_Sub8) Static44.aClass178_3.method4772((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static9.aClass143_8.method3750(Static9.aClass143_8.method3739(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class14_Sub2_Sub8) Static44.aClass178_3.method4772((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static9.aClass143_8.method3750(Static9.aClass143_8.method3739(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static16.method357(local30);
					local18.anInt2808 = arg2;
					Static44.aClass178_3.method4767(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static16.method357(local30);
				local18.anInt2808 = arg2;
				Static44.aClass178_3.method4767(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static16.method357(local30);
			local18.anInt2808 = arg2;
			Static44.aClass178_3.method4767(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)Lclient!ln;")
	public static Class14_Sub2_Sub13 method3894() {
		@Pc(15) Class14_Sub2_Sub13 local15 = (Class14_Sub2_Sub13) Static279.aClass56_11.method1923();
		if (local15 != null) {
			local15.method5986();
			local15.method5760();
			return local15;
		}
		do {
			local15 = (Class14_Sub2_Sub13) Static189.aClass56_13.method1923();
			if (local15 == null) {
				return null;
			}
			if (local15.method3535() > Static168.method3300()) {
				return null;
			}
			local15.method5986();
			local15.method5760();
		} while ((Long.MIN_VALUE & local15.aLong208) == 0L);
		return local15;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
	public static void method3895() {
		@Pc(1) Class11 local1 = Static5.aClass11_95;
		synchronized (Static5.aClass11_95) {
			Static5.aClass11_95.method214();
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)Lclient!cb;")
	public static Class10_Sub4 method3896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub4_1;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!kk;IIII)V")
	public static void method3898(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static324.method5564(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static233.anInt4556) {
			Static324.method5564(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static324.method5564(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static180.anInt3712) {
			Static324.method5564(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static180.anInt3712) {
			Static324.method5564(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static233.anInt4556 && arg4 <= Static180.anInt3712) {
			Static324.method5564(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static324.method5564(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static233.anInt4556 && arg4 > 0) {
			Static324.method5564(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
