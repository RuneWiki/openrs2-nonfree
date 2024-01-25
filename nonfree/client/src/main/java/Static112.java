import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "[I")
	public static final int[] anIntArray155 = new int[13];

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
	public static int anInt1892 = 503;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public static void method1708() {
		@Pc(7) Class108 local7 = null;
		try {
			local7 = Static508.method6990("2");
			@Pc(25) Class6_Sub12 local25 = new Class6_Sub12(Static131.anInt2496 * 6 + 3);
			local25.method6047(1);
			local25.method6032(Static131.anInt2496);
			for (@Pc(35) int local35 = 0; local35 < Static2.anIntArray4.length; local35++) {
				if (Static224.aBooleanArray14[local35]) {
					local25.method6032(local35);
					local25.method6042(Static2.anIntArray4[local35]);
				}
			}
			local7.method2447(local25.aByteArray97, 0, local25.anInt7556);
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (local7 != null) {
				local7.method2453();
			}
		} catch (@Pc(73) Exception local73) {
		}
		Static322.aLong150 = Static416.method5922();
		Static492.aBoolean562 = false;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
	public static void method1709(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static377.method5515(arg1, arg0, 0, arg0.length - 1);
	}
}
