import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	public static int anInt3882;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Lclient!ne;")
	public static final Class170 aClass170_7 = new Class170("WTRC", 1);

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "Lclient!hv;")
	public static final Class107 aClass107_8 = new Class107();

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_66 = new Class198("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZILjava/lang/String;)Z")
	public static boolean method3063(@OriginalArg(3) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(96) int local96;
			if (local46 >= '0' && local46 <= '9') {
				local96 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local96 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local96 = local46 - 'W';
			} else {
				return false;
			}
			if (local96 >= 10) {
				return false;
			}
			if (local26) {
				local96 = -local96;
			}
			@Pc(124) int local124 = local96 + local35 * 10;
			if (local124 / 10 != local35) {
				return false;
			}
			local35 = local124;
			local33 = true;
		}
		return local33;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLclient!ue;)Ljava/lang/String;")
	public static String method3064(@OriginalArg(1) Class5_Sub41 arg0) {
		return arg0.aString72 == null || arg0.aString72.length() <= 0 ? arg0.aString71 : arg0.aString71 + Static172.aClass198_61.method4012(Static38.anInt4834) + arg0.aString72;
	}
}
