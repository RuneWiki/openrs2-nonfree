import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static403 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "[Lclient!gs;")
	public static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
	public static int anInt6887;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(JJ)J")
	public static long method5755(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z")
	public static boolean method5756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
