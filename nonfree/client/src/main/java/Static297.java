import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!bka;")
	public static Class9 aClass9_16;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_52 = new Class286(85, 3);

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!si;")
	public static final Class338 aClass338_27 = new Class338(8);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4583(@OriginalArg(1) String arg0) {
		if (!Static196.aClass47_3.aBoolean97) {
			return -1;
		} else if (Static308.aHashtable4.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static482.method7044(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(36) String local36 = Static239.aString78 + local22;
			if (!Static106.aClass221_18.method5067(local36, "")) {
				return -1;
			} else if (Static106.aClass221_18.method5094(local36)) {
				@Pc(67) byte[] local67 = Static106.aClass221_18.method5076("", local36);
				@Pc(73) File local73;
				try {
					local73 = Static683.method9022(local22);
				} catch (@Pc(75) RuntimeException local75) {
					return -1;
				}
				if (local67 == null || local73 == null) {
					return -1;
				}
				@Pc(85) boolean local85 = true;
				@Pc(89) byte[] local89 = Static80.method1035(local73);
				if (local89 != null && local89.length == local67.length) {
					for (@Pc(104) int local104 = 0; local104 < local89.length; local104++) {
						if (local89[local104] != local67[local104]) {
							local85 = false;
							break;
						}
					}
				} else {
					local85 = false;
				}
				try {
					if (!local85) {
						Static196.aClass47_3.method956(local67, local73);
					}
				} catch (@Pc(142) Throwable local142) {
					return -1;
				}
				Static587.method8081(arg0, local73);
				return 100;
			} else {
				return Static106.aClass221_18.method5069(local36);
			}
		}
	}
}
