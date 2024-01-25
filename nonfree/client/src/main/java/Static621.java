import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
	public static int anInt10057;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "Lclient!sv;")
	public static Class315 aClass315_6;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array19;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[16];

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BI)I")
	public static int method8618(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local27 >> 12) + 40960;
		return local21 * local35 >> 12;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)V")
	public static void method8619(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub12 local10 = Static556.method8018(4, arg0);
		local10.method3607();
	}
}
