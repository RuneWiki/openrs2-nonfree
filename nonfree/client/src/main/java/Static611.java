import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "Lclient!bt;")
	public static Class34 aClass34_120;

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
	public static int anInt9382;

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_65 = new Class163();

	@OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
	public static final int anInt9385 = 1406;

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
	public static int anInt9389 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BB)Z")
	public static boolean method8015(@OriginalArg(0) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			return false;
		} else {
			return local14 < 128 || local14 >= 160 || Static295.aCharArray4[local14 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!bn;I)I")
	public static int method8017(@OriginalArg(0) Class4_Sub11_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method988(2);
		@Pc(20) int local20;
		if (local10 == 0) {
			local20 = 0;
		} else if (local10 == 1) {
			local20 = arg0.method988(5);
		} else if (local10 == 2) {
			local20 = arg0.method988(8);
		} else {
			local20 = arg0.method988(11);
		}
		return local20;
	}
}
