import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!im;")
	public static final Class140 aClass140_38 = new Class140(53, 8);

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!im;")
	public static final Class140 aClass140_39 = new Class140(27, 4);

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public static final int anInt2197 = 1338;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	public static int anInt2198 = -1;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
	public static final int[] anIntArray216 = new int[8];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZII)Z")
	public static boolean method1860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!kg;IIIII)V")
	public static void method1862(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2369 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static245.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class62 local35 = Static447.aClass62Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt2369; local37++) {
							if (arg0.aClass1_Sub2Array2[local37] == local35.aClass1_Sub2_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub2Array2[arg0.anInt2369++] = local35.aClass1_Sub2_1;
						if (arg0.anInt2369 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt2369; local7 < 4; local7++) {
			arg0.aClass1_Sub2Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[[[Lclient!rg;)V")
	public static void method1863(@OriginalArg(1) Class255[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class255[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class255 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass49_Sub5_2 instanceof Interface18) {
							((Interface18) local32.aClass49_Sub5_2).method7472();
						}
						if (local32.aClass49_Sub3_1 instanceof Interface18) {
							((Interface18) local32.aClass49_Sub3_1).method7472();
						}
						if (local32.aClass49_Sub3_2 instanceof Interface18) {
							((Interface18) local32.aClass49_Sub3_2).method7472();
						}
						if (local32.aClass49_Sub1_3 instanceof Interface18) {
							((Interface18) local32.aClass49_Sub1_3).method7472();
						}
						if (local32.aClass49_Sub1_2 instanceof Interface18) {
							((Interface18) local32.aClass49_Sub1_2).method7472();
						}
						for (@Pc(82) Class63 local82 = local32.aClass63_3; local82 != null; local82 = local82.aClass63_1) {
							@Pc(87) Class49_Sub2 local87 = local82.aClass49_Sub2_1;
							if (local87 instanceof Interface18) {
								((Interface18) local87).method7472();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
	public static void method1864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > arg3) {
			Static424.method6216(arg1, arg0, arg3, Static447.anIntArrayArray99[arg2]);
		} else {
			Static424.method6216(arg3, arg0, arg1, Static447.anIntArrayArray99[arg2]);
		}
	}
}
