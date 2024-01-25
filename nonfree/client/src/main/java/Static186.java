import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hea", name = "N", descriptor = "Lclient!lba;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!hea", name = "E", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_68 = new Class90(71, 3);

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_69 = new Class90(76, 10);

	@OriginalMember(owner = "client!hea", name = "L", descriptor = "S")
	public static short aShort39 = 256;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(B)V")
	public static void method3075() {
		for (@Pc(10) Class4_Sub6_Sub13 local10 = (Class4_Sub6_Sub13) Static446.aClass22_56.method895(); local10 != null; local10 = (Class4_Sub6_Sub13) Static446.aClass22_56.method889()) {
			@Pc(15) Class21_Sub1_Sub1_Sub5 local15 = local10.aClass21_Sub1_Sub1_Sub5_1;
			if (local15.anInt9848 < Static306.anInt6122) {
				local10.method8193();
				local15.method7572();
			} else if (local15.anInt9836 <= Static306.anInt6122) {
				if (local15.anInt9851 > 0) {
					@Pc(44) Class4_Sub29 local44 = (Class4_Sub29) Static144.aClass221_6.method5075((long) (local15.anInt9851 - 1));
					if (local44 != null) {
						@Pc(49) Class21_Sub1_Sub1_Sub1_Sub1 local49 = local44.aClass21_Sub1_Sub1_Sub1_Sub1_1;
						if (local49.anInt10551 >= 0 && local49.anInt10551 < Static338.anInt6508 * 512 && local49.anInt10550 >= 0 && Static390.anInt7654 * 512 > local49.anInt10550) {
							local15.method7571(Static306.anInt6122, local49.anInt10550, local49.anInt10551, Static461.method6782(local49.anInt10550, local15.aByte127, local49.anInt10551) - local15.anInt9844);
						}
					}
				}
				if (local15.anInt9851 < 0) {
					@Pc(101) int local101 = -local15.anInt9851 - 1;
					@Pc(106) Class21_Sub1_Sub1_Sub1_Sub2 local106;
					if (Static1.anInt5011 == local101) {
						local106 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2;
					} else {
						local106 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local101];
					}
					if (local106 != null && local106.anInt10551 >= 0 && Static338.anInt6508 * 512 > local106.anInt10551 && local106.anInt10550 >= 0 && local106.anInt10550 < Static390.anInt7654 * 512) {
						local15.method7571(Static306.anInt6122, local106.anInt10550, local106.anInt10551, Static461.method6782(local106.anInt10550, local15.aByte127, local106.anInt10551) - local15.anInt9844);
					}
				}
				local15.method7568(Static92.anInt8628);
				Static542.method7597(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "(B)V")
	public static void method3078() {
		if (Static82.aBoolean174) {
			return;
		}
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean674) {
			Static155.aFloat73 = (int) Static155.aFloat73 - 17 & 0xFFFFFFF0;
		} else {
			Static1.aFloat107 += (-12.0F - Static1.aFloat107) / 2.0F;
		}
		Static82.aBoolean174 = true;
		Static521.aBoolean651 = true;
	}
}
