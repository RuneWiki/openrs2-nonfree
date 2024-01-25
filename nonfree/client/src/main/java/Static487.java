import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static487 {

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[16];

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
	public static int anInt8042 = 0;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBI)Z")
	public static boolean method6819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static199.method2845(arg0, arg1) || Static147.method2209(arg0, arg1);
	}
}
