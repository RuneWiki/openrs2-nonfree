import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eaa", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray43;

	@OriginalMember(owner = "client!eaa", name = "J", descriptor = "Lclient!ha;")
	public static Class100 aClass100_5;

	@OriginalMember(owner = "client!eaa", name = "v", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_39 = new Class268(96, -2);

	@OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
	public static int anInt2319 = 0;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BIII)V")
	public static void method1944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		Static591.aFloat197 = (float) local7;
		Static284.aFloat164 = (float) local3;
		if (Static334.anInt6354 == 2) {
			Static263.anInt5239 = local7;
			Static9.anInt193 = 0;
			Static470.anInt8261 = local3;
		}
		Static27.method482();
		Static246.aBoolean346 = true;
	}
}
