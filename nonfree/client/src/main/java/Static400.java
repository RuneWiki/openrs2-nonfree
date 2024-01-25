import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "Lclient!aa;")
	public static Class2 aClass2_17;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
	public static int anInt6615;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "[I")
	public static final int[] anIntArray418 = new int[25];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)I")
	public static int method5477(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local14 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local14 == 19 || local14 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V")
	public static void method5480() {
		for (@Pc(11) int local11 = 0; local11 < Static139.anInt2476; local11++) {
			@Pc(17) Class216 local17 = Static342.aClass216Array1[local11];
			if (local17.aByte75 == 2) {
				if (local17.aClass3_Sub1_Sub3_4 == null) {
					local17.anInt6181 = Integer.MIN_VALUE;
				} else {
					Static440.aClass3_Sub1_Sub2_2.method5098(local17.aClass3_Sub1_Sub3_4);
				}
			}
		}
	}
}
