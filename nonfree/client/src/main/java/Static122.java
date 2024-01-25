import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!rk;")
	public static Class180 aClass180_32;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!on;")
	public static final Class154 aClass154_2 = new Class154(128);

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_19 = new Class10(16);

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "[S")
	public static final short[] aShortArray48 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
	public static int anInt2754 = -1;

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
	public static final int[] anIntArray368 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBIIIII)V")
	public static void method2569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static164.method3145(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg4;
		@Pc(24) int local24 = -arg4;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static323.anIntArrayArray55[arg2];
		@Pc(53) int local53 = arg5 - local15;
		@Pc(57) int local57 = local15 + arg5;
		Static282.method4681(arg0, arg5 - arg4, local37, local53);
		Static282.method4681(arg1, local53, local37, local57);
		Static282.method4681(arg0, local57, local37, arg5 + arg4);
		while (local21 > local10) {
			local31 += 2;
			local33 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				Static337.anIntArray814[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(123) int[] local123;
			@Pc(130) int[] local130;
			@Pc(134) int local134;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if (local24 >= 0) {
				local21--;
				if (local15 > local21) {
					local123 = Static323.anIntArrayArray55[local21 + arg2];
					local130 = Static323.anIntArrayArray55[arg2 - local21];
					local134 = Static337.anIntArray814[local21];
					local139 = arg5 + local10;
					local144 = arg5 - local10;
					local148 = local134 + arg5;
					local153 = arg5 - local134;
					Static282.method4681(arg0, local144, local123, local153);
					Static282.method4681(arg1, local153, local123, local148);
					Static282.method4681(arg0, local148, local123, local139);
					Static282.method4681(arg0, local144, local130, local153);
					Static282.method4681(arg1, local153, local130, local148);
					Static282.method4681(arg0, local148, local130, local139);
				} else {
					local123 = Static323.anIntArrayArray55[arg2 + local21];
					local130 = Static323.anIntArrayArray55[arg2 - local21];
					local134 = arg5 + local10;
					local139 = arg5 - local10;
					Static282.method4681(arg0, local139, local123, local134);
					Static282.method4681(arg0, local139, local130, local134);
				}
				local24 -= local21 << 1;
			}
			local123 = Static323.anIntArrayArray55[local10 + arg2];
			local130 = Static323.anIntArrayArray55[arg2 - local10];
			local134 = arg5 + local21;
			local139 = arg5 - local21;
			if (local15 <= local10) {
				Static282.method4681(arg0, local139, local123, local134);
				Static282.method4681(arg0, local139, local130, local134);
			} else {
				local144 = local10 <= local26 ? local26 : Static337.anIntArray814[local10];
				local148 = local144 + arg5;
				local153 = arg5 - local144;
				Static282.method4681(arg0, local139, local123, local153);
				Static282.method4681(arg1, local153, local123, local148);
				Static282.method4681(arg0, local148, local123, local134);
				Static282.method4681(arg0, local139, local130, local153);
				Static282.method4681(arg1, local153, local130, local148);
				Static282.method4681(arg0, local148, local130, local134);
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public static void method2570() {
		for (@Pc(15) Class7_Sub29 local15 = (Class7_Sub29) Static79.aClass74_9.method1793(); local15 != null; local15 = (Class7_Sub29) Static79.aClass74_9.method1798()) {
			if (local15.anInt4635 > 0) {
				local15.anInt4635--;
			}
			if (local15.anInt4635 != 0) {
				if (local15.anInt4643 > 0) {
					local15.anInt4643--;
				}
				if (local15.anInt4643 == 0 && local15.anInt4647 >= 1 && local15.anInt4639 >= 1 && local15.anInt4647 <= Static15.anInt287 - 2 && local15.anInt4639 <= Static325.anInt6173 - 2 && (local15.anInt4631 < 0 || Static213.method3779(local15.anInt4631, local15.anInt4640))) {
					Static69.method1370(local15.anInt4647, local15.anInt4639, local15.anInt4631, local15.anInt4640, -1, local15.anInt4641, local15.anInt4629, local15.anInt4632);
					local15.anInt4643 = -1;
					if (local15.anInt4631 == local15.anInt4644 && local15.anInt4644 == -1) {
						local15.method5648();
					} else if (local15.anInt4631 == local15.anInt4644 && local15.anInt4629 == local15.anInt4633 && local15.anInt4628 == local15.anInt4640) {
						local15.method5648();
					}
				}
			} else if (local15.anInt4644 < 0 || Static213.method3779(local15.anInt4644, local15.anInt4628)) {
				Static69.method1370(local15.anInt4647, local15.anInt4639, local15.anInt4644, local15.anInt4628, -1, local15.anInt4641, local15.anInt4633, local15.anInt4632);
				local15.method5648();
			}
		}
	}
}
