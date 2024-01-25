import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "Lclient!da;")
	public static Class34 aClass34_12;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "Lclient!ns;")
	public static final Class231 aClass231_12 = new Class231();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method7607(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1 || arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(61) char[] local61 = new char[local37];
		local61[0] = '+';
		for (@Pc(69) int local69 = local37 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg0;
			arg0 /= 10;
			@Pc(84) int local84 = local73 - arg0 * 10;
			if (local84 >= 10) {
				local61[local69] = (char) (local84 + 87);
			} else {
				local61[local69] = (char) (local84 + 48);
			}
		}
		return new String(local61);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	public static void method7608() {
		Static547.anInt513 = (int) ((double) Static306.anInt6176 * 34.46D);
		Static482.anInt8531 = 200;
		Static547.anInt513 <<= 0x2;
		if (Static467.aClass5_13.method6151()) {
			Static547.anInt513 += 512;
		}
		Static369.method5892(false);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
	public static void method7610() {
		Static276.aClass380_47.method8751();
	}
}
