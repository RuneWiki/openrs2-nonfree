import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "Lclient!dc;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_55 = new Class151(43, -1);

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
	public static int anInt2234 = 0;

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_20 = new Class352(64);

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
	public static int anInt2235 = -50;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2143(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public static void method2144() {
		@Pc(17) int local17 = Static124.aClass4_Sub20_4.aClass8_Sub16_1.method6388();
		if (local17 == 0) {
			Static558.aByteArrayArrayArray18 = null;
			Static105.method2067(0);
		} else if (local17 == 1) {
			Static634.method8462((byte) 0);
			Static105.method2067(512);
			if (Static47.aByteArrayArrayArray3 != null) {
				Static22.method8510();
			}
		} else {
			Static634.method8462((byte) (Static472.anInt7502 - 4 & 0xFF));
			Static105.method2067(2);
		}
		Static366.anInt5498 = Static296.anInt4684;
	}
}
