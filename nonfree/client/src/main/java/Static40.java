import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "[[[Lclient!uaa;")
	public static Class290[][][] aClass290ArrayArrayArray4;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_3 = new Class267(8);

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
	public static int anInt1002 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IBI)I")
	public static int method947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
