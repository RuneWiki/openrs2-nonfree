import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!od;")
	public static Class4_Sub36 aClass4_Sub36_4;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!vj;IIIII)V")
	public static void method5533(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static218.anInt4559) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static10.anInt812) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static255.anInt5209 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class182 local62 = Static571.aClass182ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static255.aClass115Array2[local17].method8055(local32, local23) + Static255.aClass115Array2[local17].method8055(local32, local23 + 1) + Static255.aClass115Array2[local17].method8055(local32 + 1, local23) + Static255.aClass115Array2[local17].method8055(local32 + 1, local23 + 1)) / 4 - (Static255.aClass115Array2[arg1].method8055(arg3, arg2) + Static255.aClass115Array2[arg1].method8055(arg3, arg2 + 1) + Static255.aClass115Array2[arg1].method8055(arg3 + 1, arg2) + Static255.aClass115Array2[arg1].method8055(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class21_Sub1_Sub2 local151 = local62.aClass21_Sub1_Sub2_1;
									@Pc(154) Class21_Sub1_Sub2 local154 = local62.aClass21_Sub1_Sub2_2;
									if (local151 != null && local151.method8225()) {
										arg0.method8230(local151, (local23 - arg2) * Static168.anInt3487 + (1 - arg4) * Static209.anInt4422, local1, Static299.aClass7_12, local148, (local32 - arg3) * Static168.anInt3487 + (1 - arg5) * Static209.anInt4422);
									}
									if (local154 != null && local154.method8225()) {
										arg0.method8230(local154, (local23 - arg2) * Static168.anInt3487 + (1 - arg4) * Static209.anInt4422, local1, Static299.aClass7_12, local148, (local32 - arg3) * Static168.anInt3487 + (1 - arg5) * Static209.anInt4422);
									}
									for (@Pc(227) Class192 local227 = local62.aClass192_2; local227 != null; local227 = local227.aClass192_3) {
										@Pc(231) Class21_Sub1_Sub1 local231 = local227.aClass21_Sub1_Sub1_1;
										if (local231 != null && local231.method8225() && (local23 == local231.aShort119 || local23 == local3) && (local32 == local231.aShort121 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort120 + 1 - local231.aShort119;
											@Pc(268) int local268 = local231.aShort122 + 1 - local231.aShort121;
											arg0.method8230(local231, (local231.aShort119 - arg2) * Static168.anInt3487 + (local260 - arg4) * Static209.anInt4422, local1, Static299.aClass7_12, local148, (local231.aShort121 - arg3) * Static168.anInt3487 + (local268 - arg5) * Static209.anInt4422);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)V")
	public static void method5535(@OriginalArg(1) int arg0) {
		Static274.anInt5755 = 2;
		Static313.anInt6277 = arg0;
		if (Static67.aString22 == null) {
			Static582.method8145(35);
		} else {
			@Pc(29) Class4_Sub13 local29 = new Class4_Sub13(Static61.method1377(Static499.method6523(Static67.aString22)));
			@Pc(33) long local33 = local29.method7026();
			Static26.aLong18 = local29.method7026();
			Static200.method3273(true, Static244.method7176(local33), "");
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII[B)V")
	public static void method5536(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(19) int local19 = arg0 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg0 - arg2 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(28) int local28 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg3[local28] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg3[local33] = 1;
			arg1 = local38 + 1;
			arg3[local38] = 1;
		}
	}
}
