import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "Lclient!hw;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!mr", name = "K", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
	public static int anInt4995 = -1;

	@OriginalMember(owner = "client!mr", name = "F", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_71 = new Class177(64, -1);

	@OriginalMember(owner = "client!mr", name = "G", descriptor = "[Lclient!ok;")
	public static final Class187[] aClass187Array1 = new Class187[30];

	@OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
	public static int anInt5000 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)I")
	public static int method3814(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V")
	public static void method3816() {
		@Pc(8) int local8 = Static12.aClass34_Sub1_1.method5470(Static262.anInt2805);
		if (local8 == 0) {
			Static237.aByteArrayArrayArray15 = null;
			Static261.method3876(0);
		} else if (local8 == 1) {
			Static64.method1244((byte) 0);
			Static261.method3876(512);
			if (Static110.aByteArrayArrayArray20 != null) {
				Static437.method5881();
			}
		} else {
			Static64.method1244((byte) (Static140.anInt3086 - 4 & 0xFF));
			Static261.method3876(2);
		}
		Static13.anInt3417 = Static426.anInt1486;
	}
}
