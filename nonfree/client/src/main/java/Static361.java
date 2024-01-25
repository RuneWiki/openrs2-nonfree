import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public static int anInt6087;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_125 = new Class211(5, -2);

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_126 = new Class211(60, 12);

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "[Lclient!et;")
	public static final Class71[] aClass71Array1 = new Class71[4];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
	public static int method4754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method4755() {
		@Pc(5) int local5 = 0;
		if (Static2.aClass148_Sub1_1.method3040(Static288.anInt4743)) {
			local5 = 55;
		}
		if (!Static2.aClass148_Sub1_1.aBoolean260) {
			local5 |= 0x40;
		}
		Static376.method4878(local5);
		Static50.aClass190_1.method4213(local5);
		Static384.aClass164_2.method3454(local5);
		Static155.aClass263_1.method5588(local5);
		Static431.aClass36_2.method697(local5);
		Static143.method2109(local5);
		Static379.method5320(local5);
		Static74.method1099(local5);
		Static430.method5385(local5);
		Static284.method3776();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V")
	public static void method4757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static260.method3501(arg1)) {
			Static165.method2321(Static151.aClass16ArrayArray1[arg1], arg0);
		}
	}
}
