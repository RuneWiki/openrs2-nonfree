import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZBLjava/lang/String;I)I")
	public static int method4483(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(77) int local77;
			if (local43 >= '0' && local43 <= '9') {
				local77 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local77 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local77 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local77 >= arg1) {
				throw new NumberFormatException();
			}
			if (local28) {
				local77 = -local77;
			}
			@Pc(115) int local115 = local77 + arg1 * local32;
			if (local32 != local115 / arg1) {
				throw new NumberFormatException();
			}
			local32 = local115;
			local30 = true;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
	public static void method4484(@OriginalArg(0) int arg0) {
		Static501.method7218();
		@Pc(15) int local15 = Static152.aClass290_1.method6668(arg0).anInt3893;
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static523.aClass173_1.anIntArray284[arg0];
		if (local15 == 6) {
			Static278.anInt5785 = local26;
		}
		if (local15 == 5) {
			Static265.anInt5333 = local26;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
	public static boolean method4485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
