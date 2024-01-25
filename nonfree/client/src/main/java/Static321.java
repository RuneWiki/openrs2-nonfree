import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5290(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = (local13 << 5) + Static131.method2331(arg0.charAt(local15)) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
	public static int method5294() {
		return Static641.anInt11092;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)[I")
	public static int[] method5297() {
		return new int[] { Static307.anInt5549, Static366.anInt6933, Static473.anInt8441 };
	}
}
