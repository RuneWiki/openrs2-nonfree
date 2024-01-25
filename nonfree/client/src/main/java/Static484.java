import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_122 = new Class200(119, 11);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([I[ILclient!l;I[I)V")
	public static void method7204(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class4_Sub1_Sub2_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg3[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg2.aClass256Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass256Array3[local19] = null;
					} else {
						@Pc(37) Class361 local37 = Static115.aClass227_1.method5968(local9);
						@Pc(40) int local40 = local37.anInt9867;
						@Pc(45) Class256 local45 = arg2.aClass256Array3[local19];
						if (local45 != null) {
							if (local45.anInt7639 == local9) {
								if (local40 == 0) {
									local45 = arg2.aClass256Array3[local19] = null;
								} else if (local40 == 1) {
									local45.anInt7633 = 0;
									local45.anInt7636 = local17;
									local45.anInt7631 = 0;
									local45.anInt7637 = 1;
									local45.anInt7629 = 0;
									if (!arg2.aBoolean405) {
										Static74.method1765(0, local37, arg2);
									}
								} else if (local40 == 2) {
									local45.anInt7633 = 0;
								}
							} else if (local37.anInt9855 >= Static115.aClass227_1.method5968(local45.anInt7639).anInt9855) {
								local45 = arg2.aClass256Array3[local19] = null;
							}
						}
						if (local45 == null) {
							local45 = arg2.aClass256Array3[local19] = new Class256();
							local45.anInt7636 = local17;
							local45.anInt7637 = 1;
							local45.anInt7629 = 0;
							local45.anInt7633 = 0;
							local45.anInt7639 = local9;
							local45.anInt7631 = 0;
							if (!arg2.aBoolean405) {
								Static74.method1765(0, local37, arg2);
							}
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
