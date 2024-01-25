import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public static int anInt161;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public static int anInt160 = 1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Lclient!up;")
	public static Class5_Sub46 method189() {
		@Pc(7) Class62 local7 = null;
		@Pc(13) Class5_Sub46 local13 = new Class5_Sub46(Static24.aClass235_1, 0);
		try {
			@Pc(19) Class330 local19 = Static214.aClass192_1.method4332("");
			while (local19.anInt9132 == 0) {
				Static452.method7478(1L);
			}
			if (local19.anInt9132 == 1) {
				local7 = (Class62) local19.anObject19;
				@Pc(43) byte[] local43 = new byte[(int) local7.method1253()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local7.method1254(local45, local43.length - local45, local43);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class5_Sub46(new Class5_Sub12(local43), Static24.aClass235_1, 0);
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method1255();
			}
		} catch (@Pc(94) Exception local94) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method190(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = null;
		@Pc(18) int local18 = arg0.indexOf("--> ");
		if (local18 >= 0) {
			local14 = arg0.substring(0, local18 + 4);
			arg0 = arg0.substring(local18 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(46) int local46 = arg0.indexOf(" ", "directlogin ".length());
			if (local46 >= 0) {
				@Pc(51) int local51 = arg0.length();
				arg0 = arg0.substring(0, local46) + " ";
				for (@Pc(67) int local67 = local46 + 1; local67 < local51; local67++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local14 == null ? arg0 : local14 + arg0;
	}
}
