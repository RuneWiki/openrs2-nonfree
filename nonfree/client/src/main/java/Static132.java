import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	public static int anInt3517;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
	public static int anInt3519;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLclient!sw;)V")
	public static void method2907(@OriginalArg(1) Class8_Sub44 arg0) {
		if (Static405.aClass56ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface27 local8 = null;
		if (arg0.anInt9148 == 0) {
			local8 = (Interface27) Static418.method6567(arg0.anInt9149, arg0.anInt9146, arg0.anInt9150);
		}
		if (arg0.anInt9148 == 1) {
			local8 = (Interface27) Static408.method6467(arg0.anInt9149, arg0.anInt9146, arg0.anInt9150);
		}
		if (arg0.anInt9148 == 2) {
			local8 = (Interface27) Static575.method7984(arg0.anInt9149, arg0.anInt9146, arg0.anInt9150, wha.class);
		}
		if (arg0.anInt9148 == 3) {
			local8 = (Interface27) Static484.method7154(arg0.anInt9149, arg0.anInt9146, arg0.anInt9150);
		}
		if (local8 == null) {
			arg0.anInt9153 = 0;
			arg0.anInt9156 = 0;
			arg0.anInt9144 = -1;
		} else {
			arg0.anInt9144 = local8.method8342();
			arg0.anInt9156 = local8.method8343();
			arg0.anInt9153 = local8.method8337();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public static void method2909() {
		Static274.aClass16_12.xa(((float) Static155.aClass8_Sub25_6.aClass36_Sub25_1.method7512() * 0.1F + 0.7F) * Static227.aFloat100);
		Static274.aClass16_12.ZA(Static382.anInt7435, Static623.aFloat127, Static278.aFloat109, (float) (Static451.anInt8300 << 2), (float) (Static98.anInt2628 << 2), (float) (Static385.anInt9988 << 2));
		Static274.aClass16_12.method6072(Static291.aClass40_2);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	public static void method2910() {
		@Pc(5) int local5 = 0;
		if (Static155.aClass8_Sub25_6 != null) {
			local5 = Static155.aClass8_Sub25_6.aClass36_Sub11_1.method4435();
		}
		@Pc(27) int local27;
		@Pc(36) int local36;
		if (local5 == 2) {
			local27 = Static354.anInt6829 > 800 ? 800 : Static354.anInt6829;
			Static235.anInt5298 = local27;
			Static508.anInt8942 = (Static354.anInt6829 - local27) / 2;
			local36 = Static69.anInt7730 <= 600 ? Static69.anInt7730 : 600;
			Static34.anInt8073 = 0;
			Static313.anInt6355 = local36;
		} else if (local5 == 1) {
			local27 = Static354.anInt6829 > 1024 ? 1024 : Static354.anInt6829;
			local36 = Static69.anInt7730 > 768 ? 768 : Static69.anInt7730;
			Static508.anInt8942 = (Static354.anInt6829 - local27) / 2;
			Static235.anInt5298 = local27;
			Static313.anInt6355 = local36;
			Static34.anInt8073 = 0;
		} else {
			Static34.anInt8073 = 0;
			Static508.anInt8942 = 0;
			Static235.anInt5298 = Static354.anInt6829;
			Static313.anInt6355 = Static69.anInt7730;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZI)I")
	public static int method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg1) {
			return arg0;
		} else if (arg1 > arg2) {
			return arg2;
		} else {
			return arg1;
		}
	}
}
