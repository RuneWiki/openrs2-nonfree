import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array3;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
	public static String method199(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static200.method3250(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!hs;IZI)Ljava/awt/Frame;")
	public static Frame method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method2843()) {
			return null;
		}
		@Pc(18) Class98[] local18 = Static420.method5622(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (local18[local26].anInt3341 == arg0 && arg3 == local18[local26].anInt3339 && (!local24 || local18[local26].anInt3338 > arg1)) {
				arg1 = local18[local26].anInt3338;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(96) Class190 local96 = arg2.method2836(arg1, arg3, arg0);
		while (local96.anInt5799 == 0) {
			Static135.method2458(10L);
		}
		@Pc(107) Frame local107 = (Frame) local96.anObject7;
		if (local107 == null) {
			return null;
		} else if (local96.anInt5799 == 2) {
			Static180.method3068(local107, arg2);
			return null;
		} else {
			return local107;
		}
	}
}
