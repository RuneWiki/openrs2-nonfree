import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	public static int anInt7092 = 0;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_46 = new Class254();

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	public static void method5377() {
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			Static35.aBooleanArray6[local15] = false;
		}
		Static100.anInt1781 = 1;
		Static388.anInt903 = 0;
		Static71.anInt1332 = 0;
		Static214.anInt7430 = -1;
		Static367.anInt6214 = -1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
	public static int method5379(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(34) boolean local34 = false;
		@Pc(36) boolean local36 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local34 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(81) int local81;
			if (local49 >= '0' && local49 <= '9') {
				local81 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local81 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local81 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local81) {
				throw new NumberFormatException();
			}
			if (local34) {
				local81 = -local81;
			}
			@Pc(131) int local131 = arg1 * local38 + local81;
			if (local131 / arg1 != local38) {
				throw new NumberFormatException();
			}
			local36 = true;
			local38 = local131;
		}
		if (!local36) {
			throw new NumberFormatException();
		}
		return local38;
	}
}
