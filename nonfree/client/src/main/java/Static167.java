import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_234 = new Class184(33, -2);

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt6467 = 0;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_235 = new Class184(52, 16);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
	public static boolean method5102() {
		return Static411.aClass238_7 != Static356.aClass238_6 || Static199.anInt3933 >= 2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[I[I[ILclient!qt;)V")
	public static void method5104(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub3_Sub3_Sub2 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) int local6 = arg1[local1];
			@Pc(10) int local10 = arg0[local1];
			@Pc(14) int local14 = arg2[local1];
			for (@Pc(16) int local16 = 0; local10 != 0 && arg3.aClass34Array3.length > local16; local16++) {
				if ((local10 & 0x1) != 0) {
					if (local6 == -1) {
						arg3.aClass34Array3[local16] = null;
					} else {
						@Pc(38) Class96 local38 = Static196.aClass30_2.method942(local6);
						@Pc(41) int local41 = local38.anInt3320;
						@Pc(46) Class34 local46 = arg3.aClass34Array3[local16];
						if (local46 != null) {
							if (local46.anInt1238 == local6) {
								if (local41 == 0) {
									local46 = arg3.aClass34Array3[local16] = null;
								} else if (local41 == 1) {
									local46.anInt1230 = 0;
									local46.anInt1232 = local14;
									local46.anInt1234 = 0;
									local46.anInt1239 = 1;
									local46.anInt1235 = 0;
									Static86.method1483(arg3.anInt6053, 0, arg3.aByte77, arg3.anInt6055, local38, false);
								} else if (local41 == 2) {
									local46.anInt1235 = 0;
								}
							} else if (local38.anInt3323 >= Static196.aClass30_2.method942(local46.anInt1238).anInt3323) {
								local46 = arg3.aClass34Array3[local16] = null;
							}
						}
						if (local46 == null) {
							local46 = arg3.aClass34Array3[local16] = new Class34();
							local46.anInt1238 = local6;
							local46.anInt1239 = 1;
							local46.anInt1230 = 0;
							local46.anInt1232 = local14;
							local46.anInt1234 = 0;
							local46.anInt1235 = 0;
							Static86.method1483(arg3.anInt6053, 0, arg3.aByte77, arg3.anInt6055, local38, false);
						}
					}
				}
				local10 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)Z")
	public static boolean method5105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
