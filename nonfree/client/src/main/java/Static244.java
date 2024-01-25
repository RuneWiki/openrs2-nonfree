import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static244 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!kr;")
	public static Class171 aClass171_79;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!so;")
	public static Class272 aClass272_4;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIII)V")
	public static void method4185(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static374.anInt6861 == 0) {
			Static306.method4837(false);
		} else {
			Static502.anInt8502 = Static374.anInt6861;
			Static390.method4905(0);
		}
		Static282.anInt7768 = arg1;
		Static506.anInt8563 = arg2;
		Static113.aBoolean142 = arg0;
		Static118.method840(arg3);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method4186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
