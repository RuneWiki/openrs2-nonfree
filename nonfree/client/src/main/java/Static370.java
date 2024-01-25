import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_135 = new Class119(26, 16);

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)V")
	public static void method4858() {
		@Pc(12) int local12 = Static160.anInt3271;
		@Pc(14) int[] local14 = Static162.anIntArray212;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class7_Sub2_Sub3_Sub2 local24 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local14[local16]];
			if (local24 != null && local24.anInt4335 > 0) {
				local24.anInt4335--;
				if (local24.anInt4335 == 0) {
					local24.aString35 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static54.anInt1472; local54++) {
			@Pc(60) int local60 = Static319.anIntArray114[local54];
			@Pc(64) Class7_Sub2_Sub3_Sub1 local64 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local60];
			if (local64 != null && local64.anInt4335 > 0) {
				local64.anInt4335--;
				if (local64.anInt4335 == 0) {
					local64.aString35 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([ILclient!ln;I[I[I)V")
	public static void method4859(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class7_Sub2_Sub3_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) int local9 = arg0[local1];
			@Pc(13) int local13 = arg3[local1];
			@Pc(17) int local17 = arg2[local1];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg1.aClass17Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass17Array3[local19] = null;
					} else {
						@Pc(41) Class128 local41 = Static301.aClass170_3.method3936(local9);
						@Pc(44) int local44 = local41.anInt3973;
						@Pc(49) Class17 local49 = arg1.aClass17Array3[local19];
						if (local49 != null) {
							if (local49.anInt770 == local9) {
								if (local44 == 0) {
									local49 = arg1.aClass17Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt767 = local17;
									local49.anInt766 = 0;
									local49.anInt768 = 0;
									local49.anInt771 = 0;
									local49.anInt769 = 1;
									Static135.method2140(0, local41, arg1.anInt4321, arg1 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg1.anInt4318, arg1.aByte77);
								} else if (local44 == 2) {
									local49.anInt766 = 0;
								}
							} else if (local41.anInt3977 >= Static301.aClass170_3.method3936(local49.anInt770).anInt3977) {
								local49 = arg1.aClass17Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg1.aClass17Array3[local19] = new Class17();
							local49.anInt771 = 0;
							local49.anInt766 = 0;
							local49.anInt769 = 1;
							local49.anInt770 = local9;
							local49.anInt768 = 0;
							local49.anInt767 = local17;
							Static135.method2140(0, local41, arg1.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == arg1, arg1.anInt4318, arg1.aByte77);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
