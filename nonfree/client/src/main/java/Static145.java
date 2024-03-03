import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "Lclient!oj;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!kb;III[Z)V", line = 32)
	public static void method2782(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static340.aClass6Array4 == Static174.aClass6Array2) {
			return;
		}
		@Pc(9) int local9 = Static307.aClass6Array3[arg1].method5729(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class6 local22 = Static307.aClass6Array3[local11];
				if (local22 != null) {
					local22.method5725(arg0, arg2, local9 - local22.method5729(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!oe;B)V", line = 62)
	public static void method2783(@OriginalArg(0) Class11_Sub5_Sub2_Sub2 arg0) {
		for (@Pc(16) Class2_Sub19 local16 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3552(); local16 != null; local16 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3553()) {
			if (local16.aClass11_Sub5_Sub2_Sub2_1 == arg0) {
				if (local16.aClass2_Sub12_Sub4_3 != null) {
					Static211.aClass2_Sub12_Sub2_2.method2083(local16.aClass2_Sub12_Sub4_3);
					local16.aClass2_Sub12_Sub4_3 = null;
				}
				local16.method6469();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V", line = 110)
	public static void method2785(@OriginalArg(0) int arg0) {
		Static186.anInt5744 = arg0;
		@Pc(7) Class98 local7 = Class72.aClass98_10;
		synchronized (Class72.aClass98_10) {
			Class72.aClass98_10.method2616();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZZ)I", line = 125)
	public static int method2786(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub41 local14 = Static349.method6276(false, arg0);
		if (local14 == null) {
			return Static166.aClass51_3.method1708(arg0).anInt2485;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray489.length; local31++) {
			if (local14.anIntArray489[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static166.aClass51_3.method1708(arg0).anInt2485 - local14.anIntArray489.length;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([I[I[IILclient!nh;)V", line = 171)
	public static void method2787(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class11_Sub5_Sub2_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) int local11 = arg0[local3];
			@Pc(15) int local15 = arg1[local3];
			@Pc(19) int local19 = arg2[local3];
			for (@Pc(21) int local21 = 0; local15 != 0 && local21 < arg3.aClass20Array3.length; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg3.aClass20Array3[local21] = null;
					} else {
						@Pc(46) Class157 local46 = Static37.aClass85_1.method2373(local11);
						@Pc(49) int local49 = local46.anInt4017;
						@Pc(54) Class20 local54 = arg3.aClass20Array3[local21];
						if (local54 != null) {
							if (local54.anInt624 == local11) {
								if (local49 == 0) {
									local54 = arg3.aClass20Array3[local21] = null;
								} else if (local49 == 1) {
									local54.anInt628 = 0;
									local54.anInt629 = local19;
									local54.anInt625 = 0;
									local54.anInt627 = 1;
									local54.anInt626 = 0;
									Static1.method4(local46, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg3, arg3.aByte78, arg3.anInt6768, arg3.anInt6770, 0);
								} else if (local49 == 2) {
									local54.anInt626 = 0;
								}
							} else if (local46.anInt4018 >= Static37.aClass85_1.method2373(local54.anInt624).anInt4018) {
								local54 = arg3.aClass20Array3[local21] = null;
							}
						}
						if (local54 == null) {
							local54 = arg3.aClass20Array3[local21] = new Class20();
							local54.anInt627 = 1;
							local54.anInt624 = local11;
							local54.anInt628 = 0;
							local54.anInt626 = 0;
							local54.anInt625 = 0;
							local54.anInt629 = local19;
							Static1.method4(local46, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg3, arg3.aByte78, arg3.anInt6768, arg3.anInt6770, 0);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}
}
