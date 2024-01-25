import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "Lclient!sn;")
	public static final Class314 aClass314_1 = new Class314();

	@OriginalMember(owner = "client!vk", name = "A", descriptor = "Z")
	public static boolean aBoolean769 = true;

	@OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
	public static int anInt9250 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Lclient!dba;")
	public static Class19 method7385() {
		try {
			return new Class19_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class19_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)Z")
	public static boolean method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static176.method2283(arg0, arg1) || Static582.method7550(arg1, arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IJ)V")
	public static void method7388(@OriginalArg(1) long arg0) {
		@Pc(6) Class2_Sub34 local6 = Static593.method7730();
		local6.aClass2_Sub7_Sub2_2.method4459(Static28.aClass283_8.anInt6971);
		local6.aClass2_Sub7_Sub2_2.method4493(arg0);
		local6.aClass2_Sub7_Sub2_2.method4459(Static261.anInt4297);
		Static100.method1508(local6);
		Static561.anInt9175 = 0;
		Static372.anInt6216 = -3;
		Static130.anInt2132 = 1;
		anInt9250 = 0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)S")
	public static short method7389(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(52) int local52 = local19 + local39;
		@Pc(61) int local61;
		if (local52 == 0) {
			local61 = local39 << 1;
		} else {
			local61 = (local39 << 8) / local52;
		}
		return (short) (local52 | local9 << 10 | local61 >> 4 << 7);
	}
}
