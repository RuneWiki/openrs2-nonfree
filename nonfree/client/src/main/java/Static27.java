import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static27 {

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Lclient!fw;")
	public static Class125 aClass125_3 = new Class125(8);

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!ida;")
	public static final Class170 aClass170_2 = new Class170();

	@OriginalMember(owner = "client!av", name = "e", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZLclient!pi;I[BIII)Lclient!hr;")
	public static Class161_Sub1_Sub1 method384(@OriginalArg(2) Class144_Sub3 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean556 || Static670.method9288(97, arg2) && Static670.method9288(122, arg3)) {
			return new Class161_Sub1_Sub1(arg0, 3553, 6406, arg2, arg3, false, arg1, 6406);
		} else if (arg0.aBoolean575) {
			return new Class161_Sub1_Sub1(arg0, 34037, 6406, arg2, arg3, false, arg1, 6406);
		} else {
			return new Class161_Sub1_Sub1(arg0, 6406, arg2, arg3, Static255.method4294(arg2), Static255.method4294(arg3), arg1, 6406);
		}
	}
}
