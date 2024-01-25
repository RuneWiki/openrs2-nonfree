import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_1 = new Class158(0, 2, 2, 1);

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "[I")
	public static int[] anIntArray102 = null;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
	public static void method2049(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub2_Sub18 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class96 local8 = Static524.aClass96Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static63.anInt777; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static230.anInt4470; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static594.anInt9440;
							@Pc(32) int local32 = local12 << Static594.anInt9440;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class96 local41 = Static524.aClass96Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8080(local15, local12) - local41.method8080(local15, local12);
									@Pc(71) int local71 = local8.method8080(local15 + 1, local12) - local41.method8080(local15 + 1, local12);
									@Pc(91) int local91 = local8.method8080(local15 + 1, local12 + 1) - local41.method8080(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method8080(local15, local12 + 1) - local41.method8080(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method2050() {
		Static473.aClass75_14.xa(((float) Static687.aClass6_Sub44_33.aClass7_Sub5_1.method808() * 0.1F + 0.7F) * 1.1523438F);
		Static473.aClass75_14.ZA(Static14.anInt194, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static473.aClass75_14.L(Static493.anInt8353, -1, 0);
		Static473.aClass75_14.method6713(Static522.aClass81_2);
	}
}
