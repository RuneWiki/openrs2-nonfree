import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!tj;")
	public static Class193 aClass193_89;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "[I")
	public static final int[] anIntArray422 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public static int anInt5160 = 99;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "[I")
	public static final int[] anIntArray423 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)V")
	public static void method4460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static273.aClass128ArrayArrayArray4 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(25) Class4_Sub19 local25 = (Class4_Sub19) Static165.aClass43_20.method1273(local19);
		if (local25 == null) {
			Static283.method4824(arg0, arg1, arg2);
			return;
		}
		@Pc(39) Class4_Sub36 local39 = (Class4_Sub36) local25.aClass116_15.method3270();
		if (local39 == null) {
			Static283.method4824(arg0, arg1, arg2);
			return;
		}
		@Pc(61) Class8_Sub3_Sub1 local61 = (Class8_Sub3_Sub1) Static283.method4824(arg0, arg1, arg2);
		if (local61 == null) {
			local61 = new Class8_Sub3_Sub1();
		} else {
			local61.anInt3152 = local61.anInt3156 = -1;
		}
		local61.anInt3157 = local39.anInt5159;
		local61.anInt3146 = local39.anInt5156;
		label44: while (true) {
			@Pc(89) Class4_Sub36 local89 = (Class4_Sub36) local25.aClass116_15.method3272();
			if (local89 == null) {
				break;
			}
			if (local89.anInt5156 != local61.anInt3146) {
				local61.anInt3151 = local89.anInt5159;
				local61.anInt3152 = local89.anInt5156;
				while (true) {
					@Pc(114) Class4_Sub36 local114 = (Class4_Sub36) local25.aClass116_15.method3272();
					if (local114 == null) {
						break label44;
					}
					if (local114.anInt5156 != local61.anInt3146 && local61.anInt3152 != local114.anInt5156) {
						local61.anInt3156 = local114.anInt5156;
						local61.anInt3148 = local114.anInt5159;
					}
				}
			}
		}
		@Pc(158) int local158 = Static81.method2010(arg0, (arg2 << 7) + 64, (arg1 << 7) - -64);
		Static244.method4315(arg0, arg1, arg2, local158, local61);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method4461() {
		for (@Pc(5) int local5 = 0; local5 < Static145.anInt3273; local5++) {
			@Pc(13) int local13 = Static354.anIntArray510[local5];
			@Pc(17) Class8_Sub1_Sub2_Sub2 local17 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local13];
			if (local17 != null) {
				Static325.method5274(local17.aClass141_1.anInt4382, local17);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!br;I)V")
	public static void method4463(@OriginalArg(0) Class21 arg0) {
		if (arg0.anInt722 == 5 && arg0.anInt770 != -1) {
			Static61.method1270(arg0, Static274.aClass47_9);
		}
	}
}
