import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "J")
	public static long aLong270;

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "Lclient!lm;")
	public static Class212 aClass212_6;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "Lclient!f;")
	public static Class38 aClass38_43;

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "F")
	public static float aFloat244;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B[ILclient!u;I)V")
	public static void method7665(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class12_Sub2_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg1.anIntArray558 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg1.anIntArray558.length; local8++) {
				if (arg0[local8] != arg1.anIntArray558[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg1.anInt8394 != -1) {
				@Pc(45) Class148 local45 = Static117.aClass18_1.method296(arg1.anInt8394);
				@Pc(48) int local48 = local45.anInt3043;
				if (local48 == 1) {
					arg1.anInt8397 = arg2;
					arg1.anInt8396 = 0;
					arg1.anInt8357 = 0;
					arg1.anInt8379 = 1;
					arg1.anInt8420 = 0;
					if (!arg1.aBoolean709) {
						Static543.method7102(arg1, arg1.anInt8420, local45);
					}
				}
				if (local48 == 2) {
					arg1.anInt8357 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg0.length; local8++) {
			if (arg0[local8] != -1) {
				local6 = false;
			}
			if (arg1.anIntArray558 == null || arg1.anIntArray558[local8] == -1 || Static117.aClass18_1.method296(arg0[local8]).anInt3050 >= Static117.aClass18_1.method296(arg1.anIntArray558[local8]).anInt3050) {
				arg1.anIntArray558 = arg0;
				arg1.anInt8397 = arg2;
				arg1.anInt8430 = arg1.anInt8431;
			}
		}
		if (local6) {
			arg1.anInt8397 = arg2;
			arg1.anIntArray558 = arg0;
			arg1.anInt8430 = arg1.anInt8431;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)I")
	public static int method7666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		}
		@Pc(24) int local24 = 128 - arg2;
		@Pc(38) int local38 = arg2 * (arg0 & 0x7F) + local24 * (arg1 & 0x7F) >> 7;
		@Pc(52) int local52 = arg2 * (arg0 & 0x380) + local24 * (arg1 & 0x380) >> 7;
		@Pc(66) int local66 = (arg1 & 0xFC00) * local24 + arg2 * (arg0 & 0xFC00) >> 7;
		return local38 & 0x7F | local66 & 0xFC00 | local52 & 0x380;
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)V")
	public static void method7667() {
		Static123.method1657(Static257.aClass2_Sub35_Sub1_1.aBoolean639);
		Static382.aClass7_3 = Static467.method6016(Static169.aClass99_2, Static9.aCanvas1, 22050, 0);
		Static177.method2289(Static269.method3734(null));
		Static51.aClass7_1 = Static467.method6016(Static169.aClass99_2, Static9.aCanvas1, 2048, 1);
		Static246.aClass2_Sub3_Sub4_2 = new Class2_Sub3_Sub4();
		Static51.aClass7_1.method6321(Static246.aClass2_Sub3_Sub4_2);
		Static398.aClass132_1 = new Class132(22050, Static591.anInt9580);
		Static134.anInt2161 = Static106.aClass229_32.method4955("scape main");
		Static569.method7428();
	}
}
