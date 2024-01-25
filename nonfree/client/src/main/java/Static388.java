import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!pn;")
	public static Class193 aClass193_3;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "Lclient!hh;")
	public static Class109 aClass109_94;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "I")
	public static int anInt7297 = 0;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "Z")
	public static boolean aBoolean610 = false;

	@OriginalMember(owner = "client!to", name = "D", descriptor = "I")
	public static final int anInt7308 = 1403;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5637(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public static void method5640() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static45.aBooleanArray3[local3] = false;
		}
		Static57.anInt883 = 1;
		Static383.anInt3787 = 0;
		Static306.anInt5194 = -1;
		Static207.anInt3759 = 0;
		Static95.anInt1875 = -1;
	}
}
