import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZZ)V")
	public static void method7336(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class5_Sub37 local10 = Static498.method7299(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray552.length; local15++) {
				local10.anIntArray552[local15] = -1;
				local10.anIntArray553[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)V")
	public static void method7338() {
		for (@Pc(14) Class5_Sub4_Sub14 local14 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local14 != null; local14 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
			if (Static272.method4137(local14.anInt5598)) {
				Static112.method1649(local14);
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
	public static void method7339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class156 local28 = Static535.aClass156ArrayArrayArray2[local9][arg0][arg1] = Static535.aClass156ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class66 local33 = local28.aClass66_2; local33 != null; local33 = local33.aClass66_1) {
					@Pc(37) Class14_Sub1_Sub1 local37 = local33.aClass14_Sub1_Sub1_1;
					if (local37.aShort74 == arg0 && local37.aShort71 == arg1) {
						local37.aByte125--;
					}
				}
				if (local28.aClass14_Sub1_Sub5_1 != null) {
					local28.aClass14_Sub1_Sub5_1.aByte125--;
				}
				if (local28.aClass14_Sub1_Sub3_1 != null) {
					local28.aClass14_Sub1_Sub3_1.aByte125--;
				}
				if (local28.aClass14_Sub1_Sub3_2 != null) {
					local28.aClass14_Sub1_Sub3_2.aByte125--;
				}
				if (local28.aClass14_Sub1_Sub2_2 != null) {
					local28.aClass14_Sub1_Sub2_2.aByte125--;
				}
				if (local28.aClass14_Sub1_Sub2_1 != null) {
					local28.aClass14_Sub1_Sub2_1.aByte125--;
				}
			}
		}
		if (Static535.aClass156ArrayArrayArray2[0][arg0][arg1] == null) {
			Static535.aClass156ArrayArrayArray2[0][arg0][arg1] = new Class156(0);
			Static535.aClass156ArrayArrayArray2[0][arg0][arg1].aByte78 = 1;
		}
		Static535.aClass156ArrayArrayArray2[0][arg0][arg1].aClass156_1 = local7;
		Static535.aClass156ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
