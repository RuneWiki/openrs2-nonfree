import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_12 = new Class390(7, 2);

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_162 = new Class397(54, 6);

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "Z")
	public static boolean aBoolean608 = false;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method7729(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(28) byte[] local28 = (byte[]) arg1;
			return arg0 ? Static430.method5702(local28) : local28;
		} else if (arg1 instanceof Class130) {
			@Pc(43) Class130 local43 = (Class130) arg1;
			return local43.method6347();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(III)Z")
	public static boolean method7730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg4);
		@Pc(24) int local24 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg1);
		@Pc(30) int local30 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg3);
		@Pc(36) int local36 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg2);
		@Pc(45) int local45 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg4 + arg5);
		@Pc(54) int local54 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg1 - arg5);
		for (@Pc(56) int local56 = local18; local56 < local45; local56++) {
			Static202.method3077(Static118.anIntArrayArray7[local56], local30, arg6, local36);
		}
		for (@Pc(78) int local78 = local24; local78 > local54; local78--) {
			Static202.method3077(Static118.anIntArrayArray7[local78], local30, arg6, local36);
		}
		@Pc(104) int local104 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg5 + arg3);
		@Pc(113) int local113 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg2 - arg5);
		for (@Pc(115) int local115 = local45; local115 <= local54; local115++) {
			@Pc(123) int[] local123 = Static118.anIntArrayArray7[local115];
			Static202.method3077(local123, local30, arg6, local104);
			Static202.method3077(local123, local104, arg0, local113);
			Static202.method3077(local123, local113, arg6, local36);
		}
	}
}
