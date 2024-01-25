import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean432 = true;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[8];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(FIFFB)F")
	public static float method4870(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(7) float[] local7 = Static367.aFloatArrayArray8[arg1];
		return local7[2] * arg2 + local7[0] * arg0 + local7[1] * arg3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
	public static int method4871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static270.aByteArrayArray18 == null ? 0 : Static270.aByteArrayArray18[arg0][arg1] & 0xFF;
	}
}
