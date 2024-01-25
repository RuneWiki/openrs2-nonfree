import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static388 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public static int anInt6814 = 0;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public static int anInt6816 = 0;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt6818 = 20;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
	public static boolean method5411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static440.method2582(arg1, arg0) | (arg1 & 0x70000) != 0 || Static180.method2596(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method5412(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
