import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Z")
	public static boolean method6231() {
		@Pc(12) Class5_Sub42 local12 = (Class5_Sub42) Static35.aClass306_7.method7313();
		if (local12 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < local12.anInt7484; local18++) {
			if (local12.aClass330Array1[local18] != null && local12.aClass330Array1[local18].anInt9132 == 0) {
				return false;
			}
			if (local12.aClass330Array2[local18] != null && local12.aClass330Array2[local18].anInt9132 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!vfa;BI)Ljava/lang/String;")
	public static String method6232(@OriginalArg(0) Class357 arg0, @OriginalArg(2) int arg1) {
		if (!Static74.method1225(arg0).method8727(arg1) && arg0.anObjectArray24 == null) {
			return null;
		} else if (arg0.aStringArray43 == null || arg1 >= arg0.aStringArray43.length || arg0.aStringArray43[arg1] == null || arg0.aStringArray43[arg1].trim().length() == 0) {
			return Static571.aBoolean764 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray43[arg1];
		}
	}
}
