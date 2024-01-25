import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pba", name = "o", descriptor = "Lclient!ng;")
	public static Class6_Sub17_Sub4 aClass6_Sub17_Sub4_3;

	@OriginalMember(owner = "client!pba", name = "q", descriptor = "[I")
	public static final int[] anIntArray491 = new int[5];

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)I")
	public static int method6927(@OriginalArg(1) int arg0) {
		@Pc(21) byte local21;
		if (arg0 > 12000) {
			Static550.method7784();
			local21 = 4;
		} else if (arg0 > 5000) {
			local21 = 3;
			Static610.method8412();
		} else if (arg0 > 2000) {
			Static680.method8955();
			local21 = 2;
		} else {
			Static419.method6415();
			local21 = 1;
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != 2) {
			Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
			Static536.method7652(false, 2);
		}
		Static392.method6007();
		return local21;
	}
}
