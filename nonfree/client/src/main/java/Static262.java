import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Lclient!la;")
	public static final Class136 aClass136_127 = new Class136(50, 8);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[I[I[ILclient!wk;)V")
	public static void method3639(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub2_Sub6_Sub2 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg1[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg3.aClass60Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg3.aClass60Array3[local19] = null;
					} else {
						@Pc(40) Class261 local40 = Static444.aClass59_3.method1552(local9);
						@Pc(43) int local43 = local40.anInt7421;
						@Pc(48) Class60 local48 = arg3.aClass60Array3[local19];
						if (local48 != null) {
							if (local9 == local48.anInt1694) {
								if (local43 == 0) {
									local48 = arg3.aClass60Array3[local19] = null;
								} else if (local43 == 1) {
									local48.anInt1697 = 0;
									local48.anInt1695 = local17;
									local48.anInt1701 = 0;
									local48.anInt1696 = 0;
									local48.anInt1698 = 1;
									Static192.method3007(local40, arg3.aByte101, 0, arg3.anInt7560, arg3.anInt7557, arg3 == Static203.aClass1_Sub2_Sub6_Sub2_1);
								} else if (local43 == 2) {
									local48.anInt1696 = 0;
								}
							} else if (local40.anInt7419 >= Static444.aClass59_3.method1552(local48.anInt1694).anInt7419) {
								local48 = arg3.aClass60Array3[local19] = null;
							}
						}
						if (local48 == null) {
							local48 = arg3.aClass60Array3[local19] = new Class60();
							local48.anInt1696 = 0;
							local48.anInt1698 = 1;
							local48.anInt1694 = local9;
							local48.anInt1697 = 0;
							local48.anInt1701 = 0;
							local48.anInt1695 = local17;
							Static192.method3007(local40, arg3.aByte101, 0, arg3.anInt7560, arg3.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg3);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
