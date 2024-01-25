import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Lclient!fp;")
	public static Class4_Sub2_Sub3 method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(III)Z")
	public static boolean method3666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
	public static void method3667(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub5_Sub14 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class61 local8 = Static20.aClass61Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static429.anInt7422; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static357.anInt5961; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static115.anInt2156;
							@Pc(32) int local32 = local12 << Static115.anInt2156;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class61 local41 = Static20.aClass61Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8580(local12, local15) - local41.method8580(local12, local15);
									@Pc(71) int local71 = local8.method8580(local12, local15 + 1) - local41.method8580(local12, local15 + 1);
									@Pc(91) int local91 = local8.method8580(local12 + 1, local15 + 1) - local41.method8580(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method8580(local12 + 1, local15) - local41.method8580(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
