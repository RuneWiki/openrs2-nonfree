import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static int anInt3195;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString38 = "";

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!di;)V")
	public static void method2586(@OriginalArg(1) Class54 arg0) {
		Static424.aClass2_Sub23_Sub2_1.method5518(arg0.method1251());
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBILjava/lang/String;)I")
	public static int method2587(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(43) int local43 = arg1.length();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			@Pc(51) char local51 = arg1.charAt(local45);
			if (local45 == 0) {
				if (local51 == '-') {
					local28 = true;
					continue;
				}
				if (local51 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local51 >= '0' && local51 <= '9') {
				local80 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local80 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local80 = local51 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local80) {
				throw new NumberFormatException();
			}
			if (local28) {
				local80 = -local80;
			}
			@Pc(128) int local128 = local32 * arg0 + local80;
			if (local128 / arg0 != local32) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local128;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}
}
