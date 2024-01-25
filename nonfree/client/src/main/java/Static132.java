import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "Lclient!d;")
	public static Interface7 anInterface7_6;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[8];

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)Lclient!gga;")
	public static Class6_Sub5_Sub13 method2687() {
		return Static491.aClass6_Sub5_Sub13_2;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(III)I")
	public static int method2688(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return local17 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Lclient!vg;")
	public static Class354 method2690(@OriginalArg(1) int arg0) {
		@Pc(13) Class354[] local13 = Static530.method7526();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class354 local21 = local13[local15];
			if (arg0 == local21.anInt10174) {
				return local21;
			}
		}
		return null;
	}
}
