import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	public static int anInt4042 = 0;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
	public static int anInt4048 = 0;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ek;B)V")
	public static void method3191(@OriginalArg(0) Class4_Sub13 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static357.aClass283_2 != null) {
			@Pc(24) int local24;
			try {
				Static357.aClass283_2.method6489(0L);
				Static357.aClass283_2.method6487(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method7030(24, local12);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([SII)[S")
	public static short[] method3197(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) short[] local14 = new short[arg1];
		Static599.method3059(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
