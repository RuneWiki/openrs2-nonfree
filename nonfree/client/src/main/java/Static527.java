import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	public static int anInt8941;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
	public static int[] anIntArray771;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!lb;")
	public static final Class174 aClass174_39 = new Class174(16);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method7511(@OriginalArg(2) String arg0) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(41) char local41 = arg0.charAt(local36);
			if (local36 == 0) {
				if (local41 == '-') {
					local27 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(85) int local85;
			if (local41 >= '0' && local41 <= '9') {
				local85 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local85 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local85 = local41 - 'W';
			} else {
				return false;
			}
			if (local85 >= 10) {
				return false;
			}
			if (local27) {
				local85 = -local85;
			}
			@Pc(109) int local109 = local85 + local31 * 10;
			if (local31 != local109 / 10) {
				return false;
			}
			local29 = true;
			local31 = local109;
		}
		return local29;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIBI)V")
	public static void method7514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(4) Class2_Sub2 local4 = (Class2_Sub2) Static368.aClass145_7.method3919(); local4 != null; local4 = (Class2_Sub2) Static368.aClass145_7.method3926()) {
			if (local4.anInt1221 <= Static416.anInt7252) {
				local4.method7890();
			} else {
				Static77.method1974(arg3 >> 1, local4.anInt1216 * 2, (local4.anInt1217 << 7) + 64, arg0 >> 1, (local4.anInt1219 << 7) + 64, local4.anInt1218);
				Static106.aClass27_3.method7824(Static367.anIntArray490[1] + arg2, local4.aString6, local4.anInt1214 | 0xFF000000, Static367.anIntArray490[0] + arg1, 0);
			}
		}
	}
}
