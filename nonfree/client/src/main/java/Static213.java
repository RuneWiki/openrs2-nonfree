import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!mo;")
	public static Class143 aClass143_80;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	public static int anInt4255;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "J")
	public static long aLong124 = 0L;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	public static int anInt4250 = -1;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[I")
	public static final int[] anIntArray380 = new int[250];

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IC)C")
	public static char method3829(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!up;Z)Z")
	public static boolean method3833(@OriginalArg(0) Interface7 arg0) {
		@Pc(9) Class59 local9 = Static232.method2200(arg0.method4070());
		if (local9.anInt1949 == -1) {
			return true;
		} else {
			@Pc(21) Class184 local21 = Static100.method2240(local9.anInt1949);
			return local21.anInt5592 == -1 ? true : local21.method4968();
		}
	}
}
