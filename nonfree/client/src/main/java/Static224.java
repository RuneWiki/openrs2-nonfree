import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!iv", name = "D", descriptor = "Lclient!ts;")
	public static Class6_Sub46 aClass6_Sub46_1;

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "Lclient!ic;")
	public static Interface14 anInterface14_1 = new Class170();

	@OriginalMember(owner = "client!iv", name = "P", descriptor = "I")
	public static int anInt3801 = 0;

	@OriginalMember(owner = "client!iv", name = "R", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_90 = new Class40(97, 4);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)I")
	public static int method3261(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(III)Z")
	public static boolean method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static398.method5865(arg0, arg1) & (Static340.method5138(arg1, arg0) | (arg1 & 0x2000) != 0 | Static493.method6807(arg1, arg0));
	}
}
