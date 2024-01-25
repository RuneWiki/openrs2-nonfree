import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eja", name = "L", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_39 = new Class156(13, 1);

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!wi;")
	public static Class297 method1919(@OriginalArg(1) Component arg0) {
		return new Class297_Sub1(arg0);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIII)I")
	public static int method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 & 0x3;
		if (local15 == 0) {
			return arg2;
		} else if (local15 == 1) {
			return 7 - arg1;
		} else if (local15 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
