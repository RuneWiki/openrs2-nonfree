import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public static int anInt10013;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!vr;")
	public static Class33 aClass33_33;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public static int anInt10020;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	public static int anInt10019 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method8777(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static94.anInt1782; local16++) {
			if (arg0.equalsIgnoreCase(Static166.aStringArray8[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static27.aStringArray1[local16])) {
				return true;
			}
		}
		return false;
	}
}
