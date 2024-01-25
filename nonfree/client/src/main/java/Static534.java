import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!sea;")
	public static final Class307 aClass307_7 = new Class307();

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt8565 = 0;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public static int anInt8566 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!oh;[II[I[I)V")
	public static void method7129(@OriginalArg(0) Class41_Sub2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg3[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg0.aClass152Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass152Array3[local19] = null;
					} else {
						@Pc(41) Class185 local41 = Static545.aClass240_2.method5680(local9);
						@Pc(44) int local44 = local41.anInt4978;
						@Pc(49) Class152 local49 = arg0.aClass152Array3[local19];
						if (local49 != null) {
							if (local49.anInt4139 == local9) {
								if (local44 == 0) {
									local49 = arg0.aClass152Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt4141 = 0;
									local49.anInt4136 = 0;
									local49.anInt4137 = 1;
									local49.anInt4140 = local17;
									local49.anInt4135 = 0;
									Static462.method6421(false, arg0.anInt9444, local41, arg0.aByte117, arg0.anInt9442, 0);
								} else if (local44 == 2) {
									local49.anInt4141 = 0;
								}
							} else if (local41.anInt4981 >= Static545.aClass240_2.method5680(local49.anInt4139).anInt4981) {
								local49 = arg0.aClass152Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg0.aClass152Array3[local19] = new Class152();
							local49.anInt4135 = 0;
							local49.anInt4141 = 0;
							local49.anInt4136 = 0;
							local49.anInt4139 = local9;
							local49.anInt4137 = 1;
							local49.anInt4140 = local17;
							Static462.method6421(false, arg0.anInt9444, local41, arg0.aByte117, arg0.anInt9442, 0);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
