import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	public static int anInt6114;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Lclient!oa;")
	public static Class9 aClass9_8;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public static int anInt6113 = 0;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
	public static int anInt6115 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI[F)[F")
	public static float[] method5220(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(12) float[] local12 = new float[arg0];
		Static589.method5381(arg1, 0, local12, 0, arg0);
		return local12;
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I")
	public static int method5222() {
		@Pc(7) Class9 local7 = aClass9_8;
		@Pc(9) boolean local9 = false;
		if (Static5.anInt145 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static359.method5440(null, 0, local15, null, 0);
			local9 = true;
		}
		@Pc(34) long local34 = Static174.method3502();
		for (@Pc(36) int local36 = 0; local36 < 10000; local36++) {
			local7.method5396();
		}
		@Pc(63) int local63 = (int) (Static174.method3502() - local34);
		local7.method5409(100, 100, -16777216, 0, 0);
		if (local9) {
			local7.method5390();
		}
		return local63;
	}
}
