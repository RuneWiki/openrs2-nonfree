import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public static int anInt6793;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Lclient!os;")
	public static Class184 aClass184_7;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_47 = new Class265();

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_174 = new Class81(100, 8);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5331(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static316.method4527(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static316.method4527(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(54) int local54 = local14 - local11;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local54);
		for (@Pc(73) int local73 = local11; local73 < local14; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static361.method5045(local79)) {
				@Pc(87) char local87 = Static400.method5462(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!md;)Lclient!on;")
	public static Class31_Sub2 method5335(@OriginalArg(1) Class2_Sub20 arg0) {
		return new Class31_Sub2(arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3748(), arg0.method3748(), arg0.method3737());
	}
}
