import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public static int anInt6063;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[S")
	public static short[] aShortArray104;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!ku;")
	public static Class144 aClass144_3;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
	public static int method4866(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
