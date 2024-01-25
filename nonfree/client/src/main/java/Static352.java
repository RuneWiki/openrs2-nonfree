import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Lclient!b;")
	public static Class20 aClass20_93;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public static int anInt5915;

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "Lclient!hi;")
	public static Class3_Sub8_Sub4 aClass3_Sub8_Sub4_3;

	@OriginalMember(owner = "client!uk", name = "E", descriptor = "Lclient!b;")
	public static Class20 aClass20_94;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_87 = new Class244(22, 6);

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_88 = new Class244(31, 3);

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Lclient!us;")
	public static final Class234 aClass234_121 = new Class234(64, 6);

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
	public static final int anInt5919 = 328;

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "F")
	public static float aFloat68 = 0.0F;

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "J")
	public static long aLong214 = 0L;

	@OriginalMember(owner = "client!uk", name = "F", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_44 = new Class138();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!dt;I)Lclient!dt;")
	public static Class62 method5281(@OriginalArg(0) Class62 arg0) {
		if (arg0.anInt1506 != -1) {
			return Static115.method1862(arg0.anInt1506);
		}
		@Pc(20) int local20 = arg0.anInt1500 >>> 16;
		@Pc(25) Class19 local25 = new Class19(Static29.aClass44_26);
		for (@Pc(35) Class3_Sub22 local35 = (Class3_Sub22) local25.method222(); local35 != null; local35 = (Class3_Sub22) local25.method220()) {
			if (local35.anInt3029 == local20) {
				return Static115.method1862((int) local35.aLong240);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!cj;B)V")
	public static void method5282(@OriginalArg(0) Class3_Sub4 arg0) {
		if (!Static287.aBoolean397) {
			arg0.method5700();
			Static105.anInt2076--;
		}
	}
}
