import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void method887() {
		Static203.aClass265_16.method6568();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)B")
	public static byte method888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!rv;)Lclient!rg;")
	public static Class305 method889(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(12) Class305 local12 = new Class305();
		local12.anInt8528 = arg0.method3698();
		local12.aClass5_Sub2_Sub2_1 = Static62.aClass100_2.method2047(local12.anInt8528);
		return local12;
	}
}
