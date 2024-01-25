import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "Lclient!ju;")
	public static Class173 aClass173_9;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
	public static int anInt8946 = 2;

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "Z")
	public static boolean aBoolean700 = false;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!om;B)V")
	public static void method7438(@OriginalArg(0) Class246 arg0) {
		Static260.aClass246_124 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method7441(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static476.anInt8277;
		@Pc(9) int[] local9 = Static10.anIntArray19;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(23) Class9_Sub1_Sub1_Sub2_Sub2 local23 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local9[local13]];
			if (local23 != null && local23 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 && local23.aString94 != null && local23.aString94.equalsIgnoreCase(arg1)) {
				@Pc(50) Class3_Sub34 local50;
				if (arg0 == 1) {
					local50 = Static374.method5522(Static250.aClass298_95, Static220.aClass287_2);
					local50.aClass3_Sub11_Sub1_2.method3095(local9[local13]);
					local50.aClass3_Sub11_Sub1_2.method3130(0);
					Static131.method2572(local50);
				} else if (arg0 == 4) {
					local50 = Static374.method5522(Static180.aClass298_67, Static220.aClass287_2);
					local50.aClass3_Sub11_Sub1_2.method3095(local9[local13]);
					local50.aClass3_Sub11_Sub1_2.method3093(0);
					Static131.method2572(local50);
				} else if (arg0 == 5) {
					local50 = Static374.method5522(Static255.aClass298_96, Static220.aClass287_2);
					local50.aClass3_Sub11_Sub1_2.method3132(local9[local13]);
					local50.aClass3_Sub11_Sub1_2.method3130(0);
					Static131.method2572(local50);
				} else if (arg0 == 6) {
					local50 = Static374.method5522(Static382.aClass298_138, Static220.aClass287_2);
					local50.aClass3_Sub11_Sub1_2.method3132(local9[local13]);
					local50.aClass3_Sub11_Sub1_2.method3093(0);
					Static131.method2572(local50);
				} else if (arg0 == 7) {
					local50 = Static374.method5522(Static518.aClass298_162, Static220.aClass287_2);
					local50.aClass3_Sub11_Sub1_2.method3131(local9[local13]);
					local50.aClass3_Sub11_Sub1_2.method3079(0);
					Static131.method2572(local50);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static118.method2471(Static48.aClass33_23.method797(Static131.anInt2839) + arg1);
		}
	}
}
