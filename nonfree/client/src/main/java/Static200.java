import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!tq;")
	public static Class191 aClass191_203;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "Lclient!ul;")
	public static Interface7 anInterface7_7;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[I")
	public static final int[] anIntArray470 = new int[14];

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public static int anInt6407 = 2;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([BI)[B")
	public static byte[] method5573(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static359.method687(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
	public static void method5574() {
		if (Static114.aBoolean578) {
			return;
		}
		Static285.aBoolean515 = true;
		if (Static234.aBoolean412) {
			Static331.aFloat43 = (int) Static331.aFloat43 + 47 & 0xFFFFFFF0;
		} else {
			Static100.aFloat37 += (12.0F - Static100.aFloat37) / 2.0F;
		}
		Static114.aBoolean578 = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZI)V")
	public static void method5576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = arg0 * Static287.anInt5818 >> 8;
		if (local5 != 0 && arg1 != -1) {
			Static304.method5347(local5, arg1, Static198.aClass191_129);
			Static8.aBoolean11 = true;
		}
	}
}
