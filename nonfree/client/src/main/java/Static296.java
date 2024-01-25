import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lda", name = "M", descriptor = "I")
	public static int anInt5367;

	@OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
	public static int anInt5364 = -1;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)V")
	public static void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (arg1 != Static206.anInt4182) {
			Static329.anIntArray456 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static329.anIntArray456[local17] = (local17 << 12) / arg1;
			}
			Static494.anInt7896 = arg1 * 32;
			Static439.anInt7283 = arg1 - 1;
			Static206.anInt4182 = arg1;
		}
		if (arg0 == Static245.anInt4535) {
			return;
		}
		if (Static206.anInt4182 == arg0) {
			Static9.anIntArray15 = Static329.anIntArray456;
		} else {
			Static9.anIntArray15 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static9.anIntArray15[local17] = (local17 << 12) / arg0;
			}
		}
		Static469.anInt7679 = arg0 - 1;
		Static245.anInt4535 = arg0;
	}

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "(III)Lclient!pc;")
	public static Class9_Sub1_Sub4 method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub1_Sub4_2;
	}
}
