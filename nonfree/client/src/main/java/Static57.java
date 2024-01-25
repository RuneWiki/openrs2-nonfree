import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Lclient!et;")
	public static final Class97 aClass97_41 = new Class97();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!oa;ZII)Lclient!ta;")
	public static Class73 method8157(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class141 local14 = Static335.method5314(arg1, arg0);
		return local14 == null ? null : local14.aClass73_2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Z")
	public static boolean method8161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static104.method6580(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static494.anInt8859;
			@Pc(14) int local14 = arg2 << Static494.anInt8859;
			return Static220.method3989(local10 + 1, Static47.aClass62Array1[arg0].JA(arg1, arg2) + arg3, local14 + 1) && Static220.method3989(local10 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1 + 1, arg2) + arg3, local14 + 1) && Static220.method3989(local10 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1 + 1, arg2 + 1) + arg3, local14 + Static364.anInt7313 - 1) && Static220.method3989(local10 + 1, Static47.aClass62Array1[arg0].JA(arg1, arg2 + 1) + arg3, local14 + Static364.anInt7313 - 1);
		} else {
			return false;
		}
	}
}
