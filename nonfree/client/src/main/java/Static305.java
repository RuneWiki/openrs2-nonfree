import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!or", name = "l", descriptor = "Lclient!ps;")
	public static Class193 aClass193_49 = new Class193();

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	public static int anInt5237 = -2;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "[Lclient!iq;")
	public static final Interface3[] anInterface3Array2 = new Interface3[75];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ub;I[I[I[I)V")
	public static void method4320(@OriginalArg(0) Class1_Sub2_Sub6_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg2[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg0.aClass60Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass60Array3[local23] = null;
					} else {
						@Pc(45) Class261 local45 = Static444.aClass59_3.method1552(local13);
						@Pc(48) int local48 = local45.anInt7421;
						@Pc(53) Class60 local53 = arg0.aClass60Array3[local23];
						if (local53 != null) {
							if (local53.anInt1694 == local13) {
								if (local48 == 0) {
									local53 = arg0.aClass60Array3[local23] = null;
								} else if (local48 == 1) {
									local53.anInt1701 = 0;
									local53.anInt1698 = 1;
									local53.anInt1695 = local21;
									local53.anInt1696 = 0;
									local53.anInt1697 = 0;
									Static192.method3007(local45, arg0.aByte101, 0, arg0.anInt7560, arg0.anInt7557, false);
								} else if (local48 == 2) {
									local53.anInt1696 = 0;
								}
							} else if (local45.anInt7419 >= Static444.aClass59_3.method1552(local53.anInt1694).anInt7419) {
								local53 = arg0.aClass60Array3[local23] = null;
							}
						}
						if (local53 == null) {
							local53 = arg0.aClass60Array3[local23] = new Class60();
							local53.anInt1696 = 0;
							local53.anInt1697 = 0;
							local53.anInt1698 = 1;
							local53.anInt1695 = local21;
							local53.anInt1694 = local13;
							local53.anInt1701 = 0;
							Static192.method3007(local45, arg0.aByte101, 0, arg0.anInt7560, arg0.anInt7557, false);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
