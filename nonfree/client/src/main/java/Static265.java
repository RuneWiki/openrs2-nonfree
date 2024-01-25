import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Lclient!sl;")
	public static Class310 aClass310_4;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method4896() {
		@Pc(7) int local7 = Static385.anInt10557;
		@Pc(9) int[] local9 = Static493.anIntArray555;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class2_Sub3_Sub1_Sub2_Sub2 local19 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local9[local11]];
			if (local19 != null && local19.anInt6282 > 0) {
				local19.anInt6282--;
				if (local19.anInt6282 == 0) {
					local19.aString66 = null;
				}
			}
		}
		for (@Pc(45) int local45 = 0; local45 < Static377.anInt7132; local45++) {
			@Pc(52) long local52 = (long) Static176.anIntArray229[local45];
			@Pc(58) Class3_Sub49 local58 = (Class3_Sub49) Static60.aClass307_6.method7424(local52);
			if (local58 != null) {
				@Pc(63) Class2_Sub3_Sub1_Sub2_Sub1 local63 = local58.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				if (local63.anInt6282 > 0) {
					local63.anInt6282--;
					if (local63.anInt6282 == 0) {
						local63.aString66 = null;
					}
				}
			}
		}
	}
}
