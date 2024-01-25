import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!uo;")
	public static Class32 aClass32_8;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!kl;")
	public static final Class1_Sub8_Sub1 aClass1_Sub8_Sub1_7 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!wi;")
	public static final Class1_Sub42 aClass1_Sub42_7 = new Class1_Sub42(0, -1);

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	public static int anInt2998 = 0;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
	public static int anInt2999 = 0;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	public static int anInt3000 = 100;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt3001 = 1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!bg;)V")
	public static void method2768(@OriginalArg(1) Class1_Sub8 arg0) {
		if (arg0.aByteArray81.length - arg0.anInt5182 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method4532();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray81.length - arg0.anInt5182 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method4556();
		if (arg0.aByteArray81.length - arg0.anInt5182 != local45 * 6) {
			return;
		}
		while (true) {
			@Pc(60) int local60;
			@Pc(64) int local64;
			do {
				do {
					do {
						if (arg0.anInt5182 >= arg0.aByteArray81.length) {
							return;
						}
						local60 = arg0.method4556();
						local64 = arg0.method4545();
					} while (Static183.anIntArray351.length <= local60);
				} while (!Static197.aBooleanArray20[local60]);
			} while (Static267.method4698(local60).aChar1 == '1' && (local64 < -1 || local64 > 1));
			Static183.anIntArray351[local60] = local64;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lclient!ml;")
	public static Class8_Sub7 method2769() {
		@Pc(8) Class8_Sub7 local8 = (Class8_Sub7) Static344.aClass217_9.method5689();
		if (local8 == null) {
			return new Class8_Sub7();
		} else {
			Static313.anInt6076--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
	public static void method2771() {
		@Pc(5) Class87 local5 = Static204.aClass87_38;
		synchronized (Static204.aClass87_38) {
			Static204.aClass87_38.method2473(5);
		}
	}
}
