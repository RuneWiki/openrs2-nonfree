import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1301(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class2_Sub31 local22 = Static275.method4480(Static640.aClass314_2, Static556.aClass145_163);
			local22.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(arg0));
			local22.aClass2_Sub17_Sub1_2.method2856(arg0);
			Static526.method7309(local22);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BIZLclient!ha;)Lclient!tia;")
	public static Class332 method1302(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class13 arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static417.anIntArray468 != null) {
			for (@Pc(18) int local18 = 0; local18 < Static417.anIntArray468.length; local18++) {
				if (arg0 == Static417.anIntArray468[local18]) {
					return Static193.aClass332Array2[local18];
				}
			}
		}
		@Pc(46) Class332 local46 = (Class332) Static39.aClass69_7.method1919((long) arg0);
		if (local46 != null) {
			if (arg1 && local46.aClass183_12 == null) {
				@Pc(58) Class183 local58 = Static427.method6221(arg0, Static142.aClass238_69);
				if (local58 == null) {
					return null;
				}
				local46.aClass183_12 = local58;
			}
			return local46;
		}
		@Pc(71) Class139[] local71 = Static654.method3454(Static631.aClass238_291, arg0);
		if (local71 == null) {
			return null;
		}
		@Pc(80) Class183 local80 = Static427.method6221(arg0, Static142.aClass238_69);
		if (local80 == null) {
			return null;
		}
		if (arg1) {
			local46 = new Class332(arg2.method8136(local80, local71), local80);
		} else {
			local46 = new Class332(arg2.method8136(local80, local71));
		}
		Static39.aClass69_7.method1917((long) arg0, local46);
		return local46;
	}
}
