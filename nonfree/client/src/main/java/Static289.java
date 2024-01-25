import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_78 = new Class397(23, 0);

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	public static int anInt4432 = -2;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B[FI)[F")
	public static float[] method4039(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static732.method6315(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
