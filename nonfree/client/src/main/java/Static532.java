import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
	public static int anInt9189;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "[I")
	public static final int[] anIntArray520 = new int[1000];

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Lclient!qj;")
	public static Class8_Sub1_Sub2 method7888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub1_Sub2_1;
	}
}
