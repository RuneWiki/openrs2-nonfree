import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ia", name = "Nh", descriptor = "I")
	public static int anInt4262;

	@OriginalMember(owner = "client!ia", name = "Sh", descriptor = "I")
	public static int anInt4266;

	@OriginalMember(owner = "client!ia", name = "Gh", descriptor = "Lclient!ol;")
	public static final Class245 aClass245_1 = new Class245();

	@OriginalMember(owner = "client!ia", name = "Uh", descriptor = "[I")
	public static final int[] anIntArray274 = new int[1000];

	@OriginalMember(owner = "client!ia", name = "Yh", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[520];

	@OriginalMember(owner = "client!ia", name = "bi", descriptor = "[I")
	public static final int[] anIntArray275 = new int[32];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[FI)[F")
	public static float[] method3627(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static602.method4665(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "(I)V")
	public static void method3632() {
		if (Static435.aBoolean685) {
			return;
		}
		if (Static455.aClass3_Sub27_Sub1_1.aBoolean390) {
			Static533.aFloat188 = (int) Static533.aFloat188 + 191 & 0xFFFFFF80;
		} else {
			Static297.aFloat119 += (24.0F - Static297.aFloat119) / 2.0F;
		}
		Static151.aBoolean260 = true;
		Static435.aBoolean685 = true;
	}
}
