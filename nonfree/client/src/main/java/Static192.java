import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_74 = new Class298(21, 0);

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
	public static int anInt3722 = 0;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLjava/lang/String;ZI)Z")
	public static boolean method3297(@OriginalArg(1) String arg0) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local48 >= '0' && local48 <= '9') {
				local75 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local75 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local75 = local48 - 'W';
			} else {
				return false;
			}
			if (local75 >= 10) {
				return false;
			}
			if (local33) {
				local75 = -local75;
			}
			@Pc(120) int local120 = local37 * 10 + local75;
			if (local120 / 10 != local37) {
				return false;
			}
			local35 = true;
			local37 = local120;
		}
		return local35;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)Z")
	public static boolean method3298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static255.aBoolean352) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(21) int local21 = arg1 & 0xFFFF;
		if (Static59.aClass203ArrayArray3[local13] == null || Static59.aClass203ArrayArray3[local13][local21] == null) {
			return false;
		}
		@Pc(39) Class203 local39 = Static59.aClass203ArrayArray3[local13][local21];
		@Pc(50) Class3_Sub44 local50;
		if (arg0 == -1 && local39.anInt5473 == 0) {
			for (local50 = (Class3_Sub44) Static187.aClass130_15.method3543(); local50 != null; local50 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
				if (local50.anInt7685 == 57 || local50.anInt7685 == 1006 || local50.anInt7685 == 2 || local50.anInt7685 == 10 || local50.anInt7685 == 46) {
					for (@Pc(134) Class203 local134 = Static414.method5954(local50.anInt7687); local134 != null; local134 = Static415.method7487(local134)) {
						if (local134.anInt5531 == local39.anInt5531) {
							return true;
						}
					}
				}
			}
		} else {
			for (local50 = (Class3_Sub44) Static187.aClass130_15.method3543(); local50 != null; local50 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
				if (arg0 == local50.anInt7684 && local39.anInt5531 == local50.anInt7687 && (local50.anInt7685 == 57 || local50.anInt7685 == 1006 || local50.anInt7685 == 2 || local50.anInt7685 == 10 || local50.anInt7685 == 46)) {
					return true;
				}
			}
		}
		return false;
	}
}
