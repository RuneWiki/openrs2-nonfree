import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!lh", name = "ib", descriptor = "Lclient!ij;")
	public static Class93 aClass93_66;

	@OriginalMember(owner = "client!lh", name = "gb", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_82 = new Class85("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!vg;B)Lclient!vg;")
	public static Class201 method3264(@OriginalArg(0) Class201 arg0) {
		if (arg0.anInt6491 != -1) {
			return Static262.method4616(arg0.anInt6491);
		}
		@Pc(23) int local23 = arg0.anInt6541 >>> 16;
		@Pc(28) Class172 local28 = new Class172(Static198.aClass190_21);
		for (@Pc(33) Class5_Sub18 local33 = (Class5_Sub18) local28.method4717(); local33 != null; local33 = (Class5_Sub18) local28.method4721()) {
			if (local33.anInt1871 == local23) {
				return Static262.method4616((int) local33.aLong235);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)Lclient!gd;")
	public static Class75 method3265(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static28.aClass109_13;
		@Pc(16) Class75 local16;
		synchronized (Static28.aClass109_13) {
			local16 = (Class75) Static28.aClass109_13.method2857((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) byte[] local34 = Static254.aClass93_99.method2410(arg0, 3);
		local16 = new Class75();
		if (local34 != null) {
			local16.method1813(new Class5_Sub12(local34));
		}
		@Pc(49) Class109 local49 = Static28.aClass109_13;
		synchronized (Static28.aClass109_13) {
			Static28.aClass109_13.method2855((long) arg0, local16);
			return local16;
		}
	}
}
