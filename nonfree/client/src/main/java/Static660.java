import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static660 {

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
	public static int anInt6757;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
	public static int anInt6758;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "Lclient!maa;")
	public static final Class229 aClass229_5 = new Class229("LIVE", 0);

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
	public static int anInt6760 = -1;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBIILclient!pi;I)Lclient!hr;")
	public static Class161_Sub1_Sub1 method5891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class144_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean556 || Static670.method9288(114, arg2) && Static670.method9288(119, arg0)) {
			return new Class161_Sub1_Sub1(arg3, 3553, arg1, arg4, arg2, arg0, true);
		} else if (arg3.aBoolean575) {
			return new Class161_Sub1_Sub1(arg3, 34037, arg1, arg4, arg2, arg0, true);
		} else {
			return new Class161_Sub1_Sub1(arg3, arg1, arg4, arg2, arg0, Static255.method4294(arg2), Static255.method4294(arg0), true);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
