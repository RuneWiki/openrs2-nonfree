import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!iea", name = "o", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_17 = new Class380(16);

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZI)V")
	public static void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static643.method8769(Static536.aClass316_14.method7577(Static638.anInt10709), arg0, arg1);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4303(@OriginalArg(1) String arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static623.aStringArray39.length; local5++) {
			if (Static623.aStringArray39[local5].equalsIgnoreCase(arg0)) {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4304(@OriginalArg(1) String arg0) {
		if (Static638.aClass162Array1 != null) {
			@Pc(20) Class6_Sub17 local20 = Static330.method7824(Static116.aClass185_29, Static569.aClass134_2);
			local20.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(arg0));
			local20.aClass6_Sub8_Sub1_2.method8205(arg0);
			Static452.method6867(local20);
		}
	}
}
