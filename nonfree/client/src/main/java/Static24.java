import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public static int anInt2904;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public static int anInt2908;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
	public static boolean method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static360.aByteArrayArrayArray16[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Lclient!ji;")
	public static Class3_Sub3_Sub13 method2484() {
		return Static211.aClass3_Sub3_Sub13_2;
	}
}
