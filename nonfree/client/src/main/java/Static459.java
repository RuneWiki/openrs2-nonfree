import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qfa", name = "eb", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_56 = new Class216();

	@OriginalMember(owner = "client!qfa", name = "Ub", descriptor = "I")
	public static int anInt7854 = -1;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIZB)V")
	public static void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static64.method1061(arg2)) {
			Static145.method3121(arg1, arg3, -1, arg0, Static319.aClass344ArrayArray2[arg2]);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;BZI)Z")
	public static boolean method6814(@OriginalArg(0) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local24 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local48 >= '0' && local48 <= '9') {
				local80 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local80 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local80 = local48 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local24) {
				local80 = -local80;
			}
			@Pc(125) int local125 = local37 * 10 + local80;
			if (local125 / 10 != local37) {
				return false;
			}
			local37 = local125;
			local26 = true;
		}
		return local26;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BII)I")
	public static int method6825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)I")
	public static int method6827(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
