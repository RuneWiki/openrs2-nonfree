import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_4 = new Class397(32, 5);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt234 = 100;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!nt;)Lclient!nt;")
	public static Class270 method247(@OriginalArg(1) Class270 arg0) {
		@Pc(6) Class270 local6 = Static85.method1873(arg0);
		if (local6 == null) {
			local6 = arg0.aClass270_15;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!vc;BLclient!vc;)V")
	public static void method248(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Class9 arg1) {
		if (arg1.aClass9_68 != null) {
			arg1.method9182();
		}
		arg1.aClass9_67 = arg0;
		arg1.aClass9_68 = arg0.aClass9_68;
		arg1.aClass9_68.aClass9_67 = arg1;
		arg1.aClass9_67.aClass9_68 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method250() {
		Static447.anInt6833 = Static677.aClass169_12.anInt4041 + Static677.aClass169_12.anInt4042 + 2;
		Static269.anInt4155 = Static52.aClass169_1.anInt4041 + Static52.aClass169_1.anInt4042 + 2;
		Static547.aStringArray37 = new String[500];
		for (@Pc(26) int local26 = 0; local26 < Static547.aStringArray37.length; local26++) {
			Static547.aStringArray37[local26] = "";
		}
		Static369.method5071(Static430.aClass257_1.method5699(Static456.anInt7118));
	}
}
