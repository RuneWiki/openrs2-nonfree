import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "Lclient!hea;")
	public static Class151 aClass151_4;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IC)Z")
	public static boolean method8753(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static456.aCharArray7;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (arg0 == local45) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLclient!efa;)V")
	public static void method8754(@OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(10) Class2_Sub38 local10 = (Class2_Sub38) Static171.aClass60_56.method1226(7); local10 != null; local10 = (Class2_Sub38) Static171.aClass60_56.method1228()) {
			if (arg0 == local10.aClass4_Sub2_Sub1_Sub2_Sub2_2) {
				if (local10.aClass2_Sub23_Sub2_3 != null) {
					Static130.aClass2_Sub23_Sub3_1.method6797(local10.aClass2_Sub23_Sub2_3);
					local10.aClass2_Sub23_Sub2_3 = null;
				}
				local10.method9872();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public static void method8755() {
		@Pc(12) Class85 local12 = Static650.aClass85_66;
		synchronized (Static650.aClass85_66) {
			Static650.aClass85_66.method1748();
		}
		local12 = Static124.aClass85_15;
		synchronized (Static124.aClass85_15) {
			Static124.aClass85_15.method1748();
		}
	}
}
