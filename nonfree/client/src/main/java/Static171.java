import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)Z")
	public static boolean method2361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method2362() {
		@Pc(12) int local12 = Static31.anInt622;
		@Pc(14) int[] local14 = Static334.anIntArray387;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class2_Sub1_Sub3_Sub2 local24 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local14[local16]];
			if (local24 != null) {
				Static186.method2537(local24, local24.method4913());
			}
		}
	}
}
