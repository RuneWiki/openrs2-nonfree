import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!td", name = "i", descriptor = "B")
	public static byte aByte100;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!wc;")
	public static final Class262 aClass262_12 = new Class262();

	@OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
	public static final int[] anIntArray427 = new int[100];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	public static int method5029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBIII)V")
	public static void method5031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static250.anInt4507; local11++) {
			@Pc(17) Rectangle local17 = Class129.aRectangleArray2[local11];
			if (local17.x + local17.width > arg3 && arg3 + arg2 > local17.x && local17.y + local17.height > arg0 && local17.y < arg0 + arg1) {
				Static369.aBooleanArray23[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!gb;ILclient!za;Lclient!qr;Lclient!ql;III)V")
	public static void method5032(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) Class1_Sub36 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = arg4.anInt5631 - arg5 / 2 - 5;
		@Pc(23) int local23 = arg1 + 2;
		if (arg3.anInt5759 != 0) {
			arg2.method5729(arg5 + 10, local19, arg1 + arg6 * arg0.method1959() + 1 - local23, arg3.anInt5759, local23);
		}
		if (arg3.anInt5763 != 0) {
			arg2.method5767(local19, arg0.method1959() * arg6 + arg1 + 1 - local23, local23, arg3.anInt5763, arg5 + 10);
		}
		@Pc(80) int local80 = arg3.anInt5753;
		if (arg4.aBoolean642 && arg3.anInt5737 != -1) {
			local80 = arg3.anInt5737;
		}
		for (@Pc(93) int local93 = 0; local93 < arg6; local93++) {
			@Pc(99) String local99 = Static29.aStringArray7[local93];
			if (local93 < arg6 - 1) {
				local99 = local99.substring(0, local99.length() - 4);
			}
			arg0.method1957(arg2, local99, arg4.anInt5631, arg1, local80);
			arg1 += arg0.method1959();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)Z")
	public static boolean method5033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static114.method1810(arg1, arg0) | Static10.method142(arg0, arg1) | Static16.method248(arg0, arg1)) & Static352.method4760(arg1, arg0);
	}
}
