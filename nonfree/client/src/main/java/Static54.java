import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
	public static int anInt1239;

	@OriginalMember(owner = "client!dk", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1054(@OriginalArg(1) String arg0) {
		@Pc(3) int local3 = Static291.method4528(arg0);
		if (local3 != -1) {
			@Pc(42) int[] local42 = Static115.aClass4_Sub2_Sub18_1.method3540(Static209.aClass100_3.anIntArray266[local3] & 0x3FFF, Static209.aClass100_3.anIntArray266[local3] >> 14 & 0x3FFF, Static209.aClass100_3.anIntArray266[local3] >> 28 & 0x3);
			Static187.method3124(local42[2], local42[1]);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(CB)Z")
	public static boolean method1057(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
