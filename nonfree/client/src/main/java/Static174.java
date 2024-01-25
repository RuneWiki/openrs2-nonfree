import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt3498;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_80 = new Class85("glow2:", "", "", "");

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_39 = new Class109(260);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ne;IIIII)Ljava/awt/Frame;")
	public static Frame method3162(@OriginalArg(0) Class139 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method3875()) {
			return null;
		}
		@Pc(18) Class96[] local18 = Static301.method5302(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (local18[local26].anInt2728 == arg1 && local18[local26].anInt2734 == arg3 && (!local24 || local18[local26].anInt2731 > arg2)) {
				arg2 = local18[local26].anInt2731;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(95) Class16 local95 = arg0.method3858(arg1, arg3, arg2);
		while (local95.anInt381 == 0) {
			Static20.method408(10L);
		}
		@Pc(106) Frame local106 = (Frame) local95.anObject1;
		if (local106 == null) {
			return null;
		} else if (local95.anInt381 == 2) {
			Static151.method2736(local106, arg0);
			return null;
		} else {
			return local106;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZIIIII)Z")
	public static boolean method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 + arg4 > arg5 && arg3 < arg5 + arg7) {
			return arg0 < arg6 + arg1 && arg6 < arg0 + arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ij;I)V")
	public static void method3167(@OriginalArg(0) Class93 arg0) {
		Static109.aClass93_45 = arg0;
		Static139.anInt2693 = Static109.aClass93_45.method2418(15);
	}
}
