import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_105 = new Class37(200);

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString252 = "glow1:";

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Z")
	public static boolean aBoolean533 = true;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)V")
	public static void method5539() {
		Static9.aClass37_1.method920(5);
		Static302.aClass37_99.method920(5);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ps;II)I")
	public static int method5540(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		if (!Static40.method857(arg0).method1093(arg1) && arg0.anObjectArray22 == null) {
			return -1;
		} else if (arg0.anIntArray459 == null || arg1 >= arg0.anIntArray459.length) {
			return -1;
		} else {
			return arg0.anIntArray459[arg1];
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public static void method5542() {
		Static100.aClass8_14 = null;
		Static206.anInt4322 = -1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)I")
	public static int method5543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Lclient!ur;")
	public static Class127_Sub1 method5544() {
		return Static268.anInt5500 < Static157.aClass127_Sub1Array1.length ? Static157.aClass127_Sub1Array1[Static268.anInt5500++] : null;
	}
}
