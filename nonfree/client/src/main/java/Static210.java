import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static210 {

	@OriginalMember(owner = "client!kp", name = "I", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_139 = new Class214(72, 3);

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
	public static int anInt4281 = 0;

	@OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
	public static int anInt4285 = 0;

	@OriginalMember(owner = "client!kp", name = "T", descriptor = "Lclient!gw;")
	public static Class91 aClass91_27 = new Class91();

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)V")
	public static void method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static120.anInt2509 == 1) {
			Static91.method1816(arg0, arg1, Static146.aClass4_Sub14_2);
		} else if (Static120.anInt2509 == 2) {
			Static224.method3826(arg1, arg0);
		}
		Static146.aClass4_Sub14_2 = null;
		Static120.anInt2509 = 0;
	}
}
