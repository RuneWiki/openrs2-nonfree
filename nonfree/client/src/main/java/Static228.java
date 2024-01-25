import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "Lclient!pu;")
	public static Class270 aClass270_48;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "Lclient!gd;")
	public static Class117 aClass117_1 = new Class117(8);

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	public static int anInt4297 = -1;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)Lclient!lt;")
	public static Class1_Sub32 method3474() {
		if (Static226.aClass353_46 == null || Static119.aClass220_1 == null) {
			return null;
		}
		Static119.aClass220_1.method4411(Static226.aClass353_46);
		@Pc(23) Class1_Sub32 local23 = (Class1_Sub32) Static119.aClass220_1.method4408();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class310 local33 = Static226.aClass273_2.method5840(local23.anInt5300);
			return local33 != null && local33.aBoolean620 && local33.method6534(Static226.anInterface16_2) ? local23 : Static106.method1740();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjava/lang/String;ZB)Z")
	public static boolean method3475(@OriginalArg(1) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local48 >= '0' && local48 <= '9') {
				local71 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local71 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local71 = local48 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local28) {
				local71 = -local71;
			}
			@Pc(111) int local111 = local71 + local37 * 10;
			if (local37 != local111 / 10) {
				return false;
			}
			local37 = local111;
			local30 = true;
		}
		return local30;
	}
}
