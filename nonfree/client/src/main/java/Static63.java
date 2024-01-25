import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method957() {
		Static135.aClass123_2.method2916();
		Static121.aClass104_2.method2061();
		Static160.aClass122_5.method2741();
		Static251.aClass207_2.method4981();
		Static268.aClass26_1.method430();
		Static388.aClass193_3.method4250();
		Static322.aClass45_5.method693();
		Static294.aClass125_2.method2959();
		Static82.aClass260_1.method5914();
		Static157.aClass255_1.method5818();
		Static117.aClass81_1.method1631();
		Static50.aClass177_1.method3804();
		Static86.aClass103_2.method2056();
		Static183.aClass30_1.method481();
		Static192.aClass75_1.method1515();
		Static377.aClass243_1.method5512();
		Static347.aClass163_1.method3572();
		Static40.aClass165_1.method3596();
		Static394.aClass86_2.method1708();
		Static96.aClass39_1.method580();
		Static215.method3225();
		Static41.method548();
		Static237.method3471();
		Static446.method5946();
		Static291.aClass151_187.method3299();
		Static111.aClass151_55.method3299();
		Static323.aClass151_139.method3299();
		Static320.aClass151_136.method3299();
		Static354.aClass151_155.method3299();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;")
	public static String method962(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(18) String local18 = arg1[arg2];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg2 + arg0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg2; local33 < local29; local33++) {
				@Pc(39) String local39 = arg1[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local31);
			for (@Pc(65) int local65 = arg2; local65 < local29; local65++) {
				@Pc(71) String local71 = arg1[local65];
				if (local71 == null) {
					local63.append("null");
				} else {
					local63.append(local71);
				}
			}
			return local63.toString();
		}
	}
}
