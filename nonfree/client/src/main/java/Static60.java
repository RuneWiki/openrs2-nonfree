import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cq", name = "U", descriptor = "Lclient!pf;")
	public static Class3_Sub4_Sub1_Sub2 aClass3_Sub4_Sub1_Sub2_1;

	@OriginalMember(owner = "client!cq", name = "G", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_1 = new Class258("LIVE", 0);

	@OriginalMember(owner = "client!cq", name = "V", descriptor = "[I")
	public static final int[] anIntArray99 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
	public static void method881(@OriginalArg(0) int arg0) {
		if (Static76.anInt1460 == 0) {
			Static84.aClass2_Sub1_Sub2_3.method574(arg0);
		} else {
			Static64.anInt1192 = arg0;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ICI)I")
	public static int method883(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
