import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_173 = new Class123(14, 5);

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "[Lclient!rk;")
	public static final Class286[] aClass286Array1 = new Class286[2048];

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIILclient!k;II)Ljava/awt/Frame;")
	public static Frame method4074(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) int arg3) {
		if (!arg2.method4077()) {
			return null;
		}
		@Pc(18) Class136[] local18 = Static427.method5903(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (arg1 == local18[local26].anInt4494 && local18[local26].anInt4491 == arg0 && (!local24 || arg3 < local18[local26].anInt4495)) {
				local24 = true;
				arg3 = local18[local26].anInt4495;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(92) Class309 local92 = arg2.method4076(arg0, arg3, arg1);
		while (local92.anInt8650 == 0) {
			Static373.method5240(10L);
		}
		@Pc(104) Frame local104 = (Frame) local92.anObject15;
		if (local104 == null) {
			return null;
		} else if (local92.anInt8650 == 2) {
			Static244.method3850(arg2, local104);
			return null;
		} else {
			return local104;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)Z")
	public static boolean method4075(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
