import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z")
	public static boolean method1142() {
		return Static352.anInt6827 == 0 ? Static186.aBoolean166 : true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!ir;Lclient!ir;)V")
	public static void method1146(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1) {
		Static82.aClass100_33 = arg1;
		Static186.aClass100_68 = arg0;
		Static82.aClass100_33.method2309(36);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLjava/lang/String;IZ)Z")
	public static boolean method1147(@OriginalArg(1) String arg0) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local46 >= '0' && local46 <= '9') {
				local73 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local73 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local73 = local46 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local31) {
				local73 = -local73;
			}
			@Pc(117) int local117 = local35 * 10 + local73;
			if (local35 != local117 / 10) {
				return false;
			}
			local35 = local117;
			local33 = true;
		}
		return local33;
	}
}
