import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
	public static int anInt3494;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_37 = new Class218(24, 4);

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	public static final int anInt3496 = -1;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
	public static int anInt3501 = 100;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)Z")
	public static boolean method3115(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
	public static boolean method3116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
