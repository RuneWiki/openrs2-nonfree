import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static322 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
	public static int anInt5444 = 0;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
	public static int anInt5445 = -1;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)Z")
	public static boolean method4682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)[Lclient!ko;")
	public static Class183[] method4683() {
		return new Class183[] { Static63.aClass183_3, Static346.aClass183_5, Static355.aClass183_6 };
	}
}
