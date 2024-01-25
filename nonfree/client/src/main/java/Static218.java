import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
	public static int anInt10033;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Z")
	public static boolean aBoolean734;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ig;III)V")
	public static void method8361(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class53 local12;
		if (arg2 < Static322.anInt5120) {
			local12 = Static28.aClass53ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass13_Sub1_Sub2_1 != null && local12.aClass13_Sub1_Sub2_1.method8404()) {
				arg0.method8410(0, true, 0, Static207.aClass95_6, Static192.anInt3298, local12.aClass13_Sub1_Sub2_1);
			}
		}
		if (arg3 < Static322.anInt5120) {
			local12 = Static28.aClass53ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass13_Sub1_Sub2_1 != null && local12.aClass13_Sub1_Sub2_1.method8404()) {
				arg0.method8410(0, true, Static192.anInt3298, Static207.aClass95_6, 0, local12.aClass13_Sub1_Sub2_1);
			}
		}
		if (arg2 < Static322.anInt5120 && arg3 < Class13_Sub1_Sub4_Sub1.lb) {
			local12 = Static28.aClass53ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass13_Sub1_Sub2_1 != null && local12.aClass13_Sub1_Sub2_1.method8404()) {
				arg0.method8410(0, true, Static192.anInt3298, Static207.aClass95_6, Static192.anInt3298, local12.aClass13_Sub1_Sub2_1);
			}
		}
		if (arg2 < Static322.anInt5120 && arg3 > 0) {
			local12 = Static28.aClass53ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass13_Sub1_Sub2_1 != null && local12.aClass13_Sub1_Sub2_1.method8404()) {
				arg0.method8410(0, true, -Static192.anInt3298, Static207.aClass95_6, Static192.anInt3298, local12.aClass13_Sub1_Sub2_1);
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIII)I")
	public static int method8363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(31) int local31 = local17 * (arg2 & 0x7F) + arg1 * (arg0 & 0x7F) >> 7;
		@Pc(50) int local50 = (arg0 & 0x380) * arg1 + (arg2 & 0x380) * local17 >> 7;
		@Pc(64) int local64 = (arg2 & 0xFC00) * local17 + (arg0 & 0xFC00) * arg1 >> 7;
		return local50 & 0x380 | local64 & 0xFC00 | local31 & 0x7F;
	}
}
