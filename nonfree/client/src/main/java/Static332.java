import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!um", name = "I", descriptor = "I")
	public static int anInt6427;

	@OriginalMember(owner = "client!um", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!um", name = "O", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[100];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)Lclient!ht;")
	public static Class2_Sub9_Sub8 method5409(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub9_Sub8 local10 = (Class2_Sub9_Sub8) Static88.aClass144_2.method4186((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = Static54.aClass104_39.method2756(1, arg0 & 0x7FFF);
		} else {
			local25 = Static223.aClass104_126.method2756(1, arg0);
		}
		local10 = new Class2_Sub9_Sub8();
		if (local25 != null) {
			local10.method2561(new Class2_Sub12(local25));
		}
		if (arg0 >= 32768) {
			local10.method2565();
		}
		Static88.aClass144_2.method4188((long) arg0, local10);
		return local10;
	}
}
