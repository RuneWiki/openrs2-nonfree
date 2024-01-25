import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "Lclient!jt;")
	public static final Class165 aClass165_2 = new Class165("", 16);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!gh;IIIII)Ljava/awt/Frame;")
	public static Frame method3263(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method3411()) {
			return null;
		}
		@Pc(20) Class358[] local20 = Static295.method4893(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg2 == local20[local28].anInt10258 && local20[local28].anInt10252 == arg1 && (!local26 || arg3 < local20[local28].anInt10255)) {
				arg3 = local20[local28].anInt10255;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(88) Class301 local88 = arg0.method3400(arg2, arg3, arg1);
		while (local88.anInt8915 == 0) {
			Static214.method4061(10L);
		}
		@Pc(102) Frame local102 = (Frame) local88.anObject18;
		if (local102 == null) {
			return null;
		} else if (local88.anInt8915 == 2) {
			Static618.method8387(arg0, local102);
			return null;
		} else {
			return local102;
		}
	}
}
