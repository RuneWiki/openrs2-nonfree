import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "Lclient!jw;")
	public static Class183 aClass183_39 = new Class183(8);

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "Lclient!ob;")
	public static final Class247 aClass247_7 = new Class247();

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)Z")
	public static boolean method7528(@OriginalArg(0) int arg0) {
		if (arg0 == 48 || arg0 == 15 || arg0 == 22 || arg0 == 46 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public static void method7529(@OriginalArg(0) int arg0) {
		Static410.anInt7087 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static173.anInt3719; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static357.anInt6212; local6++) {
				if (Static309.aClass100ArrayArrayArray2[arg0][local3][local6] == null) {
					Static309.aClass100ArrayArrayArray2[arg0][local3][local6] = new Class100(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method7532(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		Static470.method6547();
		Static598.method8031();
		Static195.method3545();
		Static359.method5269(arg1, arg0);
		Static290.method4569();
		Static586.method1200(Static185.aClass66_14);
		Static423.method6070(Static185.aClass66_14);
		Static62.method4584(Static185.aClass66_14, Static360.aClass31_78);
		Static452.method6399();
		Static32.method572(Static223.aClass13Array15);
		Static39.method670();
		Static271.method4381();
		if (Static598.anInt9831 == 3) {
			Static33.method600(4);
		} else if (Static598.anInt9831 == 7) {
			Static33.method600(8);
		} else if (Static598.anInt9831 == 10) {
			Static33.method600(11);
		} else if (Static598.anInt9831 == 1 || Static598.anInt9831 == 2) {
			Static23.method440();
		}
	}
}
