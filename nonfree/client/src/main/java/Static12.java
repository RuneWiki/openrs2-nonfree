import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!eh;")
	public static Class67 aClass67_8;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_5 = new Class77(4);

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_9 = new Class67(46, -1);

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	public static int anInt198 = -1;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "I")
	public static int anInt199 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIFIIIZI)[I")
	public static int[] method211(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub2_Sub32 local10 = new Class1_Sub2_Sub32();
		local10.anInt6731 = 8;
		local10.aBoolean587 = true;
		local10.anInt6734 = 8;
		local10.anInt6730 = (int) (arg0 * 4096.0F);
		local10.anInt6740 = 35;
		local10.anInt6737 = 4;
		local10.method5967();
		Static306.method4069(1, 2048);
		local10.method5346(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
	public static void method212(@OriginalArg(0) int arg0) {
		for (@Pc(3) Class1 local3 = Static204.aClass208_22.method4414(); local3 != null; local3 = Static204.aClass208_22.method4410()) {
			if ((long) arg0 == (local3.aLong236 >> 48 & 0xFFFFL)) {
				local3.method5953();
			}
		}
	}
}
