import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	public static int anInt8142 = 0;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "Lclient!sda;")
	public static final Class146 aClass146_1 = Static132.method7587();

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
	public static int anInt8147 = -2;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(III)Z")
	public static boolean method6789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static155.method6197(arg0, arg1) | (arg0 & 0x70000) != 0 || Static155.method6202(arg1, arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIILclient!ap;B)Lclient!hea;")
	public static Class132_Sub1_Sub1 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9_Sub2 arg4) {
		if (arg4.aBoolean69 || Static85.method1890(arg3) && Static85.method1890(arg0)) {
			return new Class132_Sub1_Sub1(arg4, 3553, arg2, arg1, arg3, arg0, true);
		} else if (arg4.aBoolean60) {
			return new Class132_Sub1_Sub1(arg4, 34037, arg2, arg1, arg3, arg0, true);
		} else {
			return new Class132_Sub1_Sub1(arg4, arg2, arg1, arg3, arg0, Static247.method4363(arg3), Static247.method4363(arg0), true);
		}
	}
}
