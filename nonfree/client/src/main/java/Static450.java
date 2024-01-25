import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public static int anInt7909 = 0;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Z")
	public static boolean aBoolean599 = false;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!vv;IIIII)V")
	public static void method6303(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static119.anInt2474) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static327.anInt5993) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static191.anInt3757 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class360 local62 = Static568.aClass360ArrayArrayArray22[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static310.aClass129Array5[local17].method6481(local32, local23) + Static310.aClass129Array5[local17].method6481(local32, local23 + 1) + Static310.aClass129Array5[local17].method6481(local32 + 1, local23) + Static310.aClass129Array5[local17].method6481(local32 + 1, local23 + 1)) / 4 - (Static310.aClass129Array5[arg1].method6481(arg3, arg2) + Static310.aClass129Array5[arg1].method6481(arg3, arg2 + 1) + Static310.aClass129Array5[arg1].method6481(arg3 + 1, arg2) + Static310.aClass129Array5[arg1].method6481(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class11_Sub1_Sub3 local151 = local62.aClass11_Sub1_Sub3_1;
									@Pc(154) Class11_Sub1_Sub3 local154 = local62.aClass11_Sub1_Sub3_2;
									if (local151 != null && local151.method7214()) {
										arg0.method7215(local151, local148, (local32 - arg3) * Static165.anInt3157 + (1 - arg5) * Static513.anInt8858, local1, Static458.aClass78_153, (local23 - arg2) * Static165.anInt3157 + (1 - arg4) * Static513.anInt8858);
									}
									if (local154 != null && local154.method7214()) {
										arg0.method7215(local154, local148, (local32 - arg3) * Static165.anInt3157 + (1 - arg5) * Static513.anInt8858, local1, Static458.aClass78_153, (local23 - arg2) * Static165.anInt3157 + (1 - arg4) * Static513.anInt8858);
									}
									for (@Pc(227) Class21 local227 = local62.aClass21_4; local227 != null; local227 = local227.aClass21_1) {
										@Pc(231) Class11_Sub1_Sub1 local231 = local227.aClass11_Sub1_Sub1_1;
										if (local231 != null && local231.method7214() && (local23 == local231.aShort90 || local23 == local3) && (local32 == local231.aShort88 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort91 + 1 - local231.aShort90;
											@Pc(268) int local268 = local231.aShort89 + 1 - local231.aShort88;
											arg0.method7215(local231, local148, (local231.aShort88 - arg3) * Static165.anInt3157 + (local268 - arg5) * Static513.anInt8858, local1, Static458.aClass78_153, (local231.aShort90 - arg2) * Static165.anInt3157 + (local260 - arg4) * Static513.anInt8858);
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
}
