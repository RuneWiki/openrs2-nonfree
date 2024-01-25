import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
	public static int anInt4563;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	public static int anInt4567;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "[I")
	public static final int[] anIntArray376 = new int[100];

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "[I")
	public static final int[] anIntArray377 = new int[25];

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(III)Lclient!qa;")
	public static Class188 method4116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static45.aClass188ArrayArrayArray5[0][arg1][arg2] != null && Static45.aClass188ArrayArrayArray5[0][arg1][arg2].aClass188_1 != null;
			if (local28 && arg0 >= Static73.anInt1624 - 1) {
				return null;
			}
			Static323.method5216(arg0, arg1, arg2);
		}
		return Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
	}
}
