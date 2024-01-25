import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!qe;")
	public static Class274 aClass274_35;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "[I")
	public static final int[] anIntArray223 = new int[13];

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "[I")
	public static final int[] anIntArray224 = new int[4];

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
	public static void method2615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static395.method2904(local7.aClass11_Sub1_Sub4_1);
			if (local7.aClass11_Sub1_Sub4_1 != null) {
				local7.aClass11_Sub1_Sub4_1 = null;
			}
		}
	}
}
