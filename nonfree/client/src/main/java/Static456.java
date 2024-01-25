import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
	public static int anInt7982;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public static int anInt7983 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public static void method6413(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub8_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class129 local8 = Static36.aClass129Array7[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static191.anInt3757; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static327.anInt5993; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static166.anInt7796;
							@Pc(32) int local32 = local12 << Static166.anInt7796;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class129 local41 = Static36.aClass129Array7[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method6481(local12, local15) - local41.method6481(local12, local15);
									@Pc(71) int local71 = local8.method6481(local12, local15 + 1) - local41.method6481(local12, local15 + 1);
									@Pc(91) int local91 = local8.method6481(local12 + 1, local15 + 1) - local41.method6481(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method6481(local12 + 1, local15) - local41.method6481(local12 + 1, local15);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V")
	public static void method6415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static287.anInt3863 / (float) Static287.anInt3861;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(39) int local39 = arg2 - (arg0 - local13) / 2;
		@Pc(47) int local47 = arg3 - (arg1 - local11) / 2;
		Static500.anInt8734 = Static287.anInt3861 * local47 / local11;
		Static249.anInt4547 = Static287.anInt3863 - local39 * Static287.anInt3863 / local13;
		Static264.anInt4867 = -1;
		Static100.anInt1767 = -1;
		Static434.method6193();
	}
}
