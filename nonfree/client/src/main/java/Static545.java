import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
	public static final int[] anIntArray691 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public static void method7396() {
		@Pc(12) int local12 = Static231.anInt4727;
		@Pc(14) int[] local14 = Static249.anIntArray372;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class4_Sub1_Sub1_Sub2 local24 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local14[local16]];
			if (local24 != null) {
				Static259.method4374(local24.method5892(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)Z")
	public static boolean method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
