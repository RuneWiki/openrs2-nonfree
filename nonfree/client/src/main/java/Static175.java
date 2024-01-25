import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!hca", name = "Ec", descriptor = "I")
	public static int anInt3251;

	@OriginalMember(owner = "client!hca", name = "Oc", descriptor = "I")
	public static int anInt3259;

	@OriginalMember(owner = "client!hca", name = "td", descriptor = "Lclient!ra;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!hca", name = "ud", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!hca", name = "vd", descriptor = "Lclient!je;")
	public static Class143 aClass143_1;

	@OriginalMember(owner = "client!hca", name = "xc", descriptor = "Lclient!wu;")
	public static final Class320 aClass320_6 = new Class320("WTQA", 2);

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public static int method2944(@OriginalArg(0) String arg0) {
		if (Static482.anInt8574 == 3) {
			return -1;
		} else if (Static517.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static101.method7090(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static438.aString162 + local20;
			if (!Static142.aClass53_43.method1613(local33, "")) {
				return -1;
			} else if (Static142.aClass53_43.method1606(local33)) {
				@Pc(62) byte[] local62 = Static142.aClass53_43.method1596("", local33);
				@Pc(67) File local67 = Static349.aClass283_4.method7182(local20);
				if (local62 == null || local67 == null) {
					return -1;
				}
				@Pc(73) boolean local73 = true;
				@Pc(77) byte[] local77 = Static183.method3017(local67);
				if (local77 != null && local62.length == local77.length) {
					for (@Pc(90) int local90 = 0; local90 < local77.length; local90++) {
						if (local77[local90] != local62[local90]) {
							local73 = false;
							break;
						}
					}
				} else {
					local73 = false;
				}
				try {
					if (!local73) {
						Static349.aClass283_4.method7175(local67, local62);
					}
				} catch (@Pc(126) Throwable local126) {
					return -1;
				}
				Static24.method582(arg0, local67);
				return 100;
			} else {
				return Static142.aClass53_43.method1601(local33);
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!os;I)V")
	public static void method2946(@OriginalArg(0) Class39_Sub3 arg0) {
		@Pc(18) byte[] local18;
		if (Static78.anObject4 == null) {
			@Pc(9) Class10_Sub1_Sub2 local9 = new Class10_Sub1_Sub2();
			local18 = local9.method3922();
			Static78.anObject4 = Static252.method3975(local18);
		}
		if (Static475.anObject18 == null) {
			@Pc(31) Class10_Sub2_Sub2 local31 = new Class10_Sub2_Sub2();
			local18 = local31.method1718();
			Static475.anObject18 = Static252.method3975(local18);
		}
		@Pc(50) Class311 local50 = arg0.aClass311_1;
		if (local50.method7662() && Static289.anObject11 == null) {
			local18 = Static3.method265(new Class148_Sub1(419684), 0.5F, 4.0F, 0.6F, 16.0F, 4.0F);
			Static289.anObject11 = Static252.method3975(local18);
		}
	}
}
