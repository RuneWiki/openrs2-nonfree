import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "Lclient!wt;")
	public static Class366 aClass366_1;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lclient!ek;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
	public static int anInt5017 = 0;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[4];

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IBI)Z")
	public static boolean method4378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static594.method7798(arg0, arg1) || Static310.method4847(arg0, arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B[B)Z")
	public static boolean method4379(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		@Pc(12) int local12 = local8.method3118();
		if (local12 != 2) {
			return false;
		}
		@Pc(38) boolean local38 = local8.method3118() == 1;
		if (local38) {
			Static556.method7405(local8);
		}
		Static560.method7453(local8);
		return true;
	}
}
