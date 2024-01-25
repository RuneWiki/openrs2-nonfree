import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
	public static int anInt1411;

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
	public static int anInt1414;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "Lclient!fq;")
	public static final Class75 aClass75_1 = new Class75(100);

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_4 = new Class88(64);

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
	public static int anInt1413 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)I")
	public static int method1153(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLclient!nj;)V")
	public static void method1154(@OriginalArg(1) Class1_Sub21 arg0) {
		if (arg0.aByteArray82.length - arg0.anInt6611 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method5720();
		if (local24 < 0 || local24 > 1 || arg0.aByteArray82.length - arg0.anInt6611 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method5715();
		if (local46 * 6 != arg0.aByteArray82.length - arg0.anInt6611) {
			return;
		}
		while (true) {
			@Pc(65) int local65;
			@Pc(69) int local69;
			do {
				do {
					do {
						if (arg0.anInt6611 >= arg0.aByteArray82.length) {
							return;
						}
						local65 = arg0.method5715();
						local69 = arg0.method5716();
					} while (local65 >= Static35.anIntArray51.length);
				} while (!Static254.aBooleanArray21[local65]);
			} while (Static53.method1077(local65).aChar3 == '1' && (local69 < -1 || local69 > 1));
			Static35.anIntArray51[local65] = local69;
		}
	}
}
