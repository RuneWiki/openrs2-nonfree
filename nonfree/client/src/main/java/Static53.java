import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "[S")
	private static final short[] aShortArray20 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "[S")
	private static final short[] aShortArray21 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "[S")
	private static final short[] aShortArray22 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "[S")
	private static final short[] aShortArray23 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray21, aShortArray23, aShortArray20, aShortArray22 };

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg2 > arg4 && arg6 + arg4 > arg0) {
			return arg5 + arg3 > arg7 && arg5 < arg1 + arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!c;)V")
	public static void method902(@OriginalArg(1) Class20_Sub3 arg0) {
		arg0.aClass20_Sub2_7 = null;
		@Pc(12) int local12 = arg0.aClass20_Sub4Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			arg0.aClass20_Sub4Array1[local18].aBoolean175 = false;
		}
		@Pc(36) Class81[] local36 = Class100_Sub1.aClass81Array3;
		synchronized (Class100_Sub1.aClass81Array3) {
			if (local12 < Class100_Sub1.aClass81Array3.length && Static317.anIntArray361[local12] < 200) {
				Class100_Sub1.aClass81Array3[local12].method2119(arg0);
				@Pc(57) int local57 = Static317.anIntArray361[local12]++;
			}
		}
	}
}
