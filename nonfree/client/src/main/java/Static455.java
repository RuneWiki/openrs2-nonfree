import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
	public static final int anInt7832 = 2;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!mo;B)V")
	public static void method6285(@OriginalArg(0) Class1_Sub35 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static173.anInt3032; local11++) {
			@Pc(17) int local17 = arg0.method5739();
			@Pc(21) int local21 = arg0.method5771();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static416.aClass317_Sub1Array1[local17] != null) {
				Static416.aClass317_Sub1Array1[local17].anInt9107 = local21;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)I")
	public static int method6286(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIZ)V")
	public static void method6288(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class1_Sub25 local8 = Static189.method2917(arg0, arg1);
		if (local8 != null) {
			local8.method7859();
		}
	}
}
