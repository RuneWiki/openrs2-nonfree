import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "Lclient!tga;")
	public static final Class335 aClass335_28 = new Class335(16);

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!sf;III)V")
	public static void method5370(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class313 local12;
		if (arg2 < Static665.anInt7330) {
			local12 = Static129.aClass313ArrayArrayArray7[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass41_Sub1_Sub4_1 != null && local12.aClass41_Sub1_Sub4_1.method8653()) {
				arg0.method8658(0, local12.aClass41_Sub1_Sub4_1, Static267.aClass143_6, Static108.anInt1949, 0, true);
			}
		}
		if (arg3 < Static665.anInt7330) {
			local12 = Static129.aClass313ArrayArrayArray7[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass41_Sub1_Sub4_1 != null && local12.aClass41_Sub1_Sub4_1.method8653()) {
				arg0.method8658(Static108.anInt1949, local12.aClass41_Sub1_Sub4_1, Static267.aClass143_6, 0, 0, true);
			}
		}
		if (arg2 < Static665.anInt7330 && arg3 < Static92.anInt1526) {
			local12 = Static129.aClass313ArrayArrayArray7[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass41_Sub1_Sub4_1 != null && local12.aClass41_Sub1_Sub4_1.method8653()) {
				arg0.method8658(Static108.anInt1949, local12.aClass41_Sub1_Sub4_1, Static267.aClass143_6, Static108.anInt1949, 0, true);
			}
		}
		if (arg2 < Static665.anInt7330 && arg3 > 0) {
			local12 = Static129.aClass313ArrayArrayArray7[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass41_Sub1_Sub4_1 != null && local12.aClass41_Sub1_Sub4_1.method8653()) {
				arg0.method8658(-Static108.anInt1949, local12.aClass41_Sub1_Sub4_1, Static267.aClass143_6, Static108.anInt1949, 0, true);
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
	public static void method5375() {
		Static216.anInt3456 = 0;
		Static558.anInt9108 = 0;
		Static633.anInt10108 = 0;
		Static495.anInt8462 = 0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZIZ)V")
	public static void method5376(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			@Pc(14) Class5_Sub16 local14 = Static455.method6717(Static633.aClass187_102, Static16.aClass332_8);
			local14.aClass5_Sub15_Sub2_1.method3660(arg1);
			Static479.method7038(local14);
		} else {
			Static497.method7212(Static347.aClass209_8, arg1, -1);
		}
	}
}
