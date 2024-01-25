import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!ho;")
	public static Class9 aClass9_21;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array56;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!gd;")
	public static final Class116 aClass116_1 = new Class116(0, 3, Static417.aClass250_18);

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!gd;")
	public static final Class116 aClass116_2 = new Class116(1, 3, Static417.aClass250_18);

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!gd;")
	public static final Class116 aClass116_3 = new Class116(2, 4, Static417.aClass250_14);

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!gd;")
	public static final Class116 aClass116_4 = new Class116(3, 1, Static417.aClass250_18);

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!gd;")
	public static final Class116 aClass116_5 = new Class116(4, 2, Static417.aClass250_18);

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!gd;")
	public static final Class116 aClass116_6 = new Class116(5, 3, Static417.aClass250_18);

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!gd;")
	public static final Class116 aClass116_7 = new Class116(6, 4, Static417.aClass250_18);

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	public static final int anInt2909 = Static503.method6621(16);

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_120 = new Class179(123, 10);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lclient!gd;")
	public static Class116 method2471(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass116_1;
		} else if (arg0 == 1) {
			return aClass116_2;
		} else if (arg0 == 2) {
			return aClass116_3;
		} else if (arg0 == 3) {
			return aClass116_4;
		} else if (arg0 == 4) {
			return aClass116_5;
		} else if (arg0 == 5) {
			return aClass116_6;
		} else if (arg0 == 6) {
			return aClass116_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!gga;ZLjava/lang/String;)I")
	public static int method2472(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt9901;
		@Pc(10) byte[] local10 = Static80.method1384(arg1);
		arg0.method8400(local10.length);
		arg0.anInt9901 += Static586.aClass312_1.method7370(local10, arg0.anInt9901, 0, arg0.aByteArray101, local10.length);
		return arg0.anInt9901 - local6;
	}
}
