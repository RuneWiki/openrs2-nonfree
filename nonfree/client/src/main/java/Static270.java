import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	public static int anInt5519 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method4743(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local28 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local49 >= '0' && local49 <= '9') {
				local79 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local79 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local79 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local79 >= arg1) {
				throw new NumberFormatException();
			}
			if (local28) {
				local79 = -local79;
			}
			@Pc(128) int local128 = arg1 * local38 + local79;
			if (local38 != local128 / arg1) {
				throw new NumberFormatException();
			}
			local38 = local128;
			local30 = true;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local38;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public static void method4744(@OriginalArg(0) int arg0) {
		if (!Static332.aBoolean626) {
			arg0 = -1;
		}
		if (arg0 == Static80.anInt2069) {
			return;
		}
		if (arg0 != -1) {
			@Pc(18) Class113 local18 = Static247.method4446(arg0);
			@Pc(22) Class99 local22 = local18.method3084();
			if (local22 == null) {
				arg0 = -1;
			} else {
				Static15.aClass143_1.method3904(local22.method2666(), new Point(local18.anInt3376, local18.anInt3375), local22.method2669(), local22.method2664(), Static349.aCanvas5);
				Static80.anInt2069 = arg0;
			}
		}
		if (arg0 == -1 && Static80.anInt2069 != -1) {
			Static15.aClass143_1.method3904(-1, new Point(), -1, null, Static349.aCanvas5);
			Static80.anInt2069 = -1;
		}
	}
}
