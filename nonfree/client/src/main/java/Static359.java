import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
	public static void method5426() {
		if (Static73.aBoolean110) {
			return;
		}
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean678) {
			Static331.aFloat140 = (int) Static331.aFloat140 + 47 & 0xFFFFFFF0;
		} else {
			Static345.aFloat142 += (12.0F - Static345.aFloat142) / 2.0F;
		}
		Static261.aBoolean359 = true;
		Static73.aBoolean110 = true;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)V")
	public static void method5427(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub2_Sub14 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class59 local8 = Static273.aClass59Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static555.anInt9182; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static401.anInt7022; local15++) {
						local1 = local8.c(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static339.anInt6128;
							@Pc(32) int local32 = local12 << Static339.anInt6128;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class59 local41 = Static273.aClass59Array4[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.JA(local15, local12) - local41.JA(local15, local12);
									@Pc(67) int local67 = local8.JA(local15 + 1, local12) - local41.JA(local15 + 1, local12);
									@Pc(85) int local85 = local8.JA(local15 + 1, local12 + 1) - local41.JA(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.JA(local15, local12 + 1) - local41.JA(local15, local12 + 1);
									local41.aa(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
