import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray67 = new String[200];

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	public static int anInt7477 = -60;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_106 = new Class208(15, 7);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I")
	public static int method6078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static72.anIntArray90[arg1 & 0x3] : Static86.anIntArray104[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)I")
	public static int method6079(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
	public static void method6080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static153.anInt2793; local9++) {
			@Pc(14) Rectangle local14 = Class2_Sub2_Sub9.aRectangleArray1[local9];
			if (local14.width + local14.x > arg3 && local14.x < arg0 + arg3 && local14.y + local14.height > arg1 && arg2 + arg1 > local14.y) {
				Static120.aBooleanArray3[local9] = true;
			}
		}
	}
}
