import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public static int anInt4511;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public static int anInt4513;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!sf;")
	public static Class105 aClass105_23 = new Class105();

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!sf;")
	public static Class105 aClass105_24 = new Class105();

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1559 = Static64.method1101(" GMT");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[Lclient!ia;)[Lclient!ia;")
	public static Class51[] method3504(@OriginalArg(1) Class51[] arg0) {
		@Pc(13) Class51[] local13 = new Class51[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static150.method2574(new Class51[] { Static27.method511(local15), Static137.aClass51_1083 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static150.method2574(new Class51[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([II)[I")
	public static int[] method3505(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) int[] local11 = new int[arg0.length];
			Static233.method867(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
