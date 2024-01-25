import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array10;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
	public static int anInt5761 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLclient!l;Ljava/awt/Canvas;Lclient!pb;I)Lclient!za;")
	public static Class75 method4565(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Class194 arg2, @OriginalArg(4) int arg3) {
		return new w(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIII)I")
	public static int method4567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg0 & 0x3;
		if (local13 == 0) {
			return arg1;
		} else if (local13 == 1) {
			return arg2;
		} else if (local13 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}
}
