import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!fj;")
	public static Class94 aClass94_3;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_340 = new Class296(54, 0);

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	public static int anInt7871 = 0;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_16 = new Class31(9, 0, 4, 1);

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!im;")
	public static final Class140 aClass140_125 = new Class140(20, -2);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
	public static int method6543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static347.aByteArrayArray18 == null ? 0 : Static347.aByteArrayArray18[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V")
	public static void method6545(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static314.aLong237 = 0L;
		@Pc(8) int local8 = Static306.method4842();
		if (arg0 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static513.aClass122_10.method7258()) {
			arg1 = true;
		}
		Static332.method5096(arg3, arg2, local8, arg0, arg1);
	}
}
