import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_94 = new Class286(29, 7);

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)[Lclient!wl;")
	public static Class360[] method4218() {
		return new Class360[] { Static155.aClass360_4, Static461.aClass360_5, Static578.aClass360_6 };
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)I")
	public static int method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}
}
