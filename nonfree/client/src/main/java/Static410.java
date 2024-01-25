import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!wia;I)Lclient!jd;")
	public static Class20 method6055(@OriginalArg(1) Class386 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class20 local17 = (Class20) Static388.aClass264_44.method6367((long) arg1);
		if (local17 == null) {
			if (Static530.aBoolean649) {
				local17 = Static677.aClass137_47.method7951(Static688.method8622(arg0, arg1), true);
			} else {
				local17 = Static253.method3715(arg0.method9192(arg1));
			}
			Static388.aClass264_44.method6364((long) arg1, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
	public static boolean method6056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZII)Z")
	public static boolean method6057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lclient!ub;")
	public static Class14_Sub6 method6059(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class14_Sub6_Sub2");
			@Pc(15) Class14_Sub6 local15 = (Class14_Sub6) local6.getDeclaredConstructor().newInstance();
			local15.method1601(arg2, arg1, arg0);
			return local15;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class14_Sub6_Sub1 local30 = new Class14_Sub6_Sub1();
			local30.method1601(arg2, arg1, arg0);
			return local30;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILclient!wia;ILclient!jc;IZ)V")
	public static void method6060(@OriginalArg(0) int arg0, @OriginalArg(2) Class386 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14_Sub5_Sub2 arg3) {
		Static522.method7501(arg2, arg1, arg0);
		Static628.aClass14_Sub5_Sub2_4 = arg3;
	}
}
