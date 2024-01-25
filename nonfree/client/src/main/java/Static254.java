import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "[I")
	public static int[] anIntArray252 = null;

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
	public static final int anInt4626 = 2;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)Lclient!lda;")
	public static Class4_Sub1_Sub3 method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass4_Sub1_Sub3_1 == null ? null : local7.aClass4_Sub1_Sub3_1;
	}
}
