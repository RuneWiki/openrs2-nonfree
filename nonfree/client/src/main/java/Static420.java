import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!ow", name = "Eb", descriptor = "I")
	public static int anInt7709;

	@OriginalMember(owner = "client!ow", name = "E", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_67 = new Class208(82, 2);

	@OriginalMember(owner = "client!ow", name = "kb", descriptor = "I")
	public static int anInt7697 = 0;

	@OriginalMember(owner = "client!ow", name = "Db", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_17 = new Class244(4, -1);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Lclient!cha;")
	public static Class51_Sub1 method6604() {
		Static265.anInt3617 = 0;
		return Static356.method5695();
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BI)Z")
	public static boolean method6609(@OriginalArg(1) int arg0) {
		if (arg0 == 10 || arg0 == 8 || arg0 == 18 || arg0 == 3 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 4 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)Z")
	public static boolean method6612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static289.method5032(arg0, arg1)) {
			return Static605.method8489(arg1, arg0) | (arg0 & 0x9000) != 0 | Static239.method4149(arg0, arg1) ? true : ((arg0 & 0x2000) != 0 | Static494.method7399(arg1, arg0) | Static301.method5139(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
