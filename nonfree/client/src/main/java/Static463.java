import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static463 {

	@OriginalMember(owner = "client!wq", name = "zb", descriptor = "Lclient!rj;")
	public static final Class219 aClass219_7 = new Class219("WTQA", 2);

	@OriginalMember(owner = "client!wq", name = "Cb", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_100 = new Class212(34, 2);

	@OriginalMember(owner = "client!wq", name = "Eb", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!wn;Z)Lclient!kh;")
	public static Class31_Sub4 method6258(@OriginalArg(0) Class4_Sub20 arg0) {
		return new Class31_Sub4(arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4582(), arg0.method4614());
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBI)Z")
	public static boolean method6260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static395.method5579(arg0, arg1) || Static106.method6189(arg0, arg1);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)Z")
	public static boolean method6261(@OriginalArg(0) int arg0) {
		if (arg0 == 57 || arg0 == 23 || arg0 == 25 || arg0 == 15 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1007;
		}
	}
}
