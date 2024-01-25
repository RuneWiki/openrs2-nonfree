import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Lclient!to;")
	public static Class21 aClass21_4;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_193 = new Class81(38, 0);

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_93 = new Class44(8, 3);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!qa;Lclient!wl;II)V")
	public static void method5788(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class265 arg1) {
		Static128.aClass265_20.method6003();
		if (Static191.aBoolean310) {
			return;
		}
		for (@Pc(24) Class2_Sub38 local24 = (Class2_Sub38) arg1.method6005(); local24 != null; local24 = (Class2_Sub38) arg1.method6001()) {
			@Pc(34) Class83 local34 = Static169.aClass173_3.method4022(local24.anInt6772);
			if (Static291.method4267(local34)) {
				@Pc(46) boolean local46 = Static3.method91(local24, arg0, local34);
				if (local46) {
					Static223.method3430(local34, local24, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
	public static void method5789() {
		Static406.method5505(Static58.anInt1578);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBI)Z")
	public static boolean method5790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
