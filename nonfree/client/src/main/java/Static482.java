import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public static int anInt8105;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	public static int anInt8102 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IBI)Z")
	public static boolean method6524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method6525(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static598.method1173(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BZ)V")
	public static void method6526(@OriginalArg(1) boolean arg0) {
		Static166.method2392(arg0, Static499.anInt4149, Static422.anInt7311, Static130.anInt2566);
	}
}
