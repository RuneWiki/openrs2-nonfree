import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public static int anInt2864;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!f;")
	public static Class76 aClass76_8;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "[I")
	public static final int[] anIntArray202 = new int[1024];

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)Z")
	public static boolean method2254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static418.method5664(arg0, arg1) | (arg0 & 0x70000) != 0 || Static266.method3986(arg0, arg1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	public static int method2274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static408.anIntArray473[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!m;BILjava/awt/Canvas;Lclient!js;I)Lclient!qa;")
	public static synchronized Class26 method2282(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class131 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static4.aBooleanArray4[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(50) Class26 local50;
		if (arg4 == 0) {
			local50 = Static114.method1705(arg2, arg0, local7);
		} else if (arg4 == 1) {
			local50 = Static393.method5399(arg1, local7, arg0, arg3, arg2);
		} else if (arg4 == 2) {
			local50 = Static165.method4928(arg0, arg3, local7, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static4.aBooleanArray4[local7] = true;
		return local50;
	}
}
