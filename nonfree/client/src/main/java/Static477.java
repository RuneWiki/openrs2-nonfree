import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
	public static int anInt8225;

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([BB)[B")
	public static byte[] method6641(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static598.method774(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method6642(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub8_Sub9 local15 = Static465.method6470(arg1, 2);
		local15.method4833();
		local15.aString71 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6643(@OriginalArg(1) String arg0) {
		Static308.method4624("", 0, 0, "", arg0, "");
	}
}
